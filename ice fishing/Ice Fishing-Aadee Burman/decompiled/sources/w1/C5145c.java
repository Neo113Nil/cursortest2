package w1;

import N1.l;
import u1.x;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5145c extends l {

    /* renamed from: w, reason: collision with root package name */
    public u1.l f41648w;

    @Override // N1.l
    public final int d(Object obj) {
        x xVar = (x) obj;
        if (xVar == null) {
            return 1;
        }
        return xVar.c();
    }

    @Override // N1.l
    public final void e(Object obj, Object obj2) {
        x xVar = (x) obj2;
        u1.l lVar = this.f41648w;
        if (lVar == null || xVar == null) {
            return;
        }
        lVar.f41119e.p(xVar, true);
    }
}
