package defpackage;

/* loaded from: classes.dex */
public final class t21 {
    public boolean IHQe1A4L2xu;
    public java.lang.Object oh6vYeIP;

    public t21(java.lang.String str, boolean z) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object IHQe1A4L2xu(long j, long j2, defpackage.fj fjVar) {
        defpackage.v51 v51Var;
        int i;
        long j3;
        if (fjVar instanceof defpackage.v51) {
            v51Var = (defpackage.v51) fjVar;
            int i2 = v51Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v51Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = v51Var.riuEU0zW4;
                i = v51Var.ez2rX8ReCYw;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    j3 = 0;
                    if (this.IHQe1A4L2xu) {
                        defpackage.i61 i61Var = (defpackage.i61) this.oh6vYeIP;
                        if (!i61Var.riuEU0zW4) {
                            v51Var.EXtogiMhuM = j2;
                            v51Var.ez2rX8ReCYw = 1;
                            obj = i61Var.IHQe1A4L2xu(j2, v51Var);
                            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                            if (obj == vjVar) {
                                return vjVar;
                            }
                        }
                        j3 = defpackage.rl1.F7NU4MC0GW(j2, j3);
                    }
                    return new defpackage.rl1(j3);
                }
                if (i != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = v51Var.EXtogiMhuM;
                defpackage.f70.nBH8hAHy(obj);
                j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                j3 = defpackage.rl1.F7NU4MC0GW(j2, j3);
                return new defpackage.rl1(j3);
            }
        }
        v51Var = new defpackage.v51(this, fjVar);
        java.lang.Object obj2 = v51Var.riuEU0zW4;
        i = v51Var.ez2rX8ReCYw;
        if (i != 0) {
        }
        j3 = ((defpackage.rl1) obj2).IHQe1A4L2xu;
        j3 = defpackage.rl1.F7NU4MC0GW(j2, j3);
        return new defpackage.rl1(j3);
    }
}
