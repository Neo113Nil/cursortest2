package defpackage;

/* loaded from: classes.dex */
public final class mv extends defpackage.gv {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh6vYeIP(java.lang.Object obj, defpackage.fj fjVar) {
        defpackage.lv lvVar;
        int i;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        if (fjVar instanceof defpackage.lv) {
            lvVar = (defpackage.lv) fjVar;
            int i2 = lvVar.JlrlGoKF;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lvVar.JlrlGoKF = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = lvVar.SH1y5HwkJhh;
                i = lvVar.JlrlGoKF;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj2);
                    if (this.oh6vYeIP.get()) {
                        defpackage.db.AARZUJiTa("This scope has already been closed.");
                        return null;
                    }
                    java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(this.IHQe1A4L2xu);
                    try {
                        defpackage.jk1 jk1Var = new defpackage.jk1(fileOutputStream3);
                        lvVar.EXtogiMhuM = fileOutputStream3;
                        lvVar.riuEU0zW4 = fileOutputStream3;
                        lvVar.JlrlGoKF = 1;
                        defpackage.n.riuEU0zW4(obj, jk1Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (ok1Var == vjVar) {
                            return vjVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = lvVar.riuEU0zW4;
                    fileOutputStream = lvVar.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            defpackage.gq1.DFo87pBq1E5(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                defpackage.gq1.DFo87pBq1E5(fileOutputStream, null);
                return ok1Var;
            }
        }
        lvVar = new defpackage.lv(this, fjVar);
        java.lang.Object obj22 = lvVar.SH1y5HwkJhh;
        i = lvVar.JlrlGoKF;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        defpackage.gq1.DFo87pBq1E5(fileOutputStream, null);
        return ok1Var2;
    }
}
