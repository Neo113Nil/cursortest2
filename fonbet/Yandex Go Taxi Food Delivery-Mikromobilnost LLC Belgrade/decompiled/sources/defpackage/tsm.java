package defpackage;

/* loaded from: classes11.dex */
public final class tsm implements zls {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ety0 c;
    public final /* synthetic */ oz40 w;

    public tsm(String str, String str2, ety0 ety0Var, oz40 oz40Var) {
        this.a = str;
        this.b = str2;
        this.c = ety0Var;
        this.w = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        wls wlsVar = (wls) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= fidVar.e(wlsVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        boolean booleanValue = ((Boolean) this.w.getValue()).booleanValue();
        c530 c530Var = c530.a;
        ety0 ety0Var = this.c;
        String str = this.a;
        if (booleanValue) {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(1126464075);
            btsVar2.e0(313432842);
            if (str.length() == 0) {
                qnm qnmVar = qnm.a;
                qnm.d.getClass();
                wqy0.b(this.b, an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), qnm.c(btsVar2).k0(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ety0Var, btsVar2, 0, 3120, 55288);
            }
            btsVar2.t(false);
            xvz.u(intValue & 14, wlsVar, btsVar2, false);
        } else {
            bts btsVar3 = (bts) fidVar;
            btsVar3.e0(1125589751);
            if (str.length() == 0) {
                btsVar3.e0(1125620100);
                qnm qnmVar2 = qnm.a;
                qnm.d.getClass();
                z = false;
                wqy0.b(this.b, an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), qnm.c(btsVar3).k0(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ety0Var, btsVar3, 0, 3120, 55288);
                xvz.u(intValue & 14, wlsVar, btsVar3, false);
            } else {
                z = false;
                btsVar3.e0(1126106211);
                qnm qnmVar3 = qnm.a;
                wqy0.b(this.a, null, qnm.c(btsVar3).g0(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ety0Var, btsVar3, 0, 3120, 55290);
                btsVar3.t(false);
            }
            btsVar3.t(z);
        }
        return zy11.a;
    }
}
