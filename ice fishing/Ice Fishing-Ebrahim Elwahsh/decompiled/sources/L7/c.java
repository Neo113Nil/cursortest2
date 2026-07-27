package L7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f1794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1795b;

    public c(h hVar, int i) {
        this.f1794a = hVar;
        this.f1795b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // L7.h
    public final Iterator iterator() {
        return new b(this);
    }
}
