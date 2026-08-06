package y1;

import i1.C0245b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f8605a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8606b;

    public b(c cVar, int i2) {
        this.f8605a = cVar;
        this.f8606b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // y1.c
    public final Iterator iterator() {
        return new C0245b(this);
    }
}
