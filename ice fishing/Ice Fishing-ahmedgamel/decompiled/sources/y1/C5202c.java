package y1;

import P1.l;
import w1.k;
import w1.w;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5202c extends l {

    /* renamed from: w, reason: collision with root package name */
    public k f41891w;

    @Override // P1.l
    public final int d(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.b();
    }

    @Override // P1.l
    public final void e(Object obj, Object obj2) {
        w wVar = (w) obj2;
        k kVar = this.f41891w;
        if (kVar == null || wVar == null) {
            return;
        }
        kVar.f41505e.p(wVar, true);
    }
}
