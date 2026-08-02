package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class tmy0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Float b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ long w;

    public /* synthetic */ tmy0(long j, Float f, wls wlsVar) {
        this.w = j;
        this.b = f;
        this.c = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.w;
        wls wlsVar = this.c;
        Float f = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.b(cfe.a.a(new ldc(j)), wwg.S(-1624601445, true, new tmy0(f, wlsVar, j), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else if (f == null) {
                    btsVar2.e0(1485059902);
                    sb2.b(vee.a.a(Float.valueOf(ldc.d(j))), wlsVar, btsVar2, 8);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(1484860324);
                    sb2.b(vee.a.a(f), wlsVar, btsVar2, 8);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ tmy0(Float f, wls wlsVar, long j) {
        this.b = f;
        this.c = wlsVar;
        this.w = j;
    }
}
