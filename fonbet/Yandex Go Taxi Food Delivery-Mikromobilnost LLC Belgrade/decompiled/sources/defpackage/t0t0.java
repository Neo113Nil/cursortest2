package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class t0t0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ wls w;
    public final /* synthetic */ ety0 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public /* synthetic */ t0t0(wls wlsVar, a aVar, wls wlsVar2, ety0 ety0Var, long j, long j2) {
        this.c = wlsVar;
        this.b = aVar;
        this.w = wlsVar2;
        this.x = ety0Var;
        this.y = j;
        this.z = j2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    btsVar.e0(-168976609);
                    heb1.c(this.b, this.c, this.w, this.x, this.y, this.z, btsVar, 0);
                    btsVar.t(false);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                heb1.c(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ t0t0(a aVar, wls wlsVar, wls wlsVar2, ety0 ety0Var, long j, long j2, int i) {
        this.b = aVar;
        this.c = wlsVar;
        this.w = wlsVar2;
        this.x = ety0Var;
        this.y = j;
        this.z = j2;
    }
}
