package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f2441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2442b;

    public c(h hVar, int i) {
        this.f2441a = hVar;
        this.f2442b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // P7.h
    public final Iterator iterator() {
        return new b(this);
    }
}
