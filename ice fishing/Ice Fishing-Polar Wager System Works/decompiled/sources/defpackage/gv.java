package defpackage;

/* loaded from: classes.dex */
public class gv implements defpackage.hd {
    public final java.io.File IHQe1A4L2xu;
    public final java.util.concurrent.atomic.AtomicBoolean oh6vYeIP = new java.util.concurrent.atomic.AtomicBoolean(false);

    public gv(java.io.File file) {
        this.IHQe1A4L2xu = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006c, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [gv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object IHQe1A4L2xu(defpackage.gv gvVar, defpackage.fj fjVar) {
        defpackage.fv fvVar;
        ?? r1;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2;
        java.io.FileInputStream fileInputStream3;
        java.lang.Throwable th2;
        if (fjVar instanceof defpackage.fv) {
            fvVar = (defpackage.fv) fjVar;
            int i = fvVar.JlrlGoKF;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvVar.JlrlGoKF = i - Integer.MIN_VALUE;
                java.lang.Object obj = fvVar.SH1y5HwkJhh;
                r1 = fvVar.JlrlGoKF;
                boolean z = true;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (r1 != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (gvVar.oh6vYeIP.get()) {
                        defpackage.db.AARZUJiTa("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new java.io.FileInputStream(gvVar.IHQe1A4L2xu);
                    } catch (java.io.FileNotFoundException unused) {
                        if (gvVar.IHQe1A4L2xu.exists()) {
                            return new defpackage.kl0(z);
                        }
                        java.io.FileInputStream fileInputStream4 = new java.io.FileInputStream(gvVar.IHQe1A4L2xu);
                        try {
                            fvVar.EXtogiMhuM = fileInputStream4;
                            fvVar.riuEU0zW4 = null;
                            fvVar.JlrlGoKF = 2;
                            defpackage.kl0 EXtogiMhuM = defpackage.n.EXtogiMhuM(fileInputStream4);
                            if (EXtogiMhuM != vjVar) {
                                obj = EXtogiMhuM;
                                fileInputStream = fileInputStream4;
                                defpackage.gq1.DFo87pBq1E5(fileInputStream, null);
                                return obj;
                            }
                            return vjVar;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream4;
                            throw th;
                        }
                    }
                    try {
                        fvVar.EXtogiMhuM = gvVar;
                        fvVar.riuEU0zW4 = fileInputStream2;
                        fvVar.JlrlGoKF = 1;
                        defpackage.kl0 EXtogiMhuM2 = defpackage.n.EXtogiMhuM(fileInputStream2);
                        if (EXtogiMhuM2 != vjVar) {
                            fileInputStream3 = fileInputStream2;
                            obj = EXtogiMhuM2;
                        }
                        return vjVar;
                    } catch (java.lang.Throwable th4) {
                        r1 = gvVar;
                        fileInputStream3 = fileInputStream2;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = (java.io.Closeable) fvVar.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.gq1.DFo87pBq1E5(fileInputStream, null);
                        return obj;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream3 = fvVar.riuEU0zW4;
                r1 = (defpackage.gv) fvVar.EXtogiMhuM;
                try {
                    defpackage.f70.nBH8hAHy(obj);
                } catch (java.lang.Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                defpackage.gq1.DFo87pBq1E5(fileInputStream3, null);
                return obj;
            }
        }
        fvVar = new defpackage.fv(gvVar, fjVar);
        java.lang.Object obj2 = fvVar.SH1y5HwkJhh;
        r1 = fvVar.JlrlGoKF;
        boolean z2 = true;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (r1 != 0) {
        }
        defpackage.gq1.DFo87pBq1E5(fileInputStream3, null);
        return obj2;
    }

    @Override // defpackage.hd
    public final void close() {
        this.oh6vYeIP.set(true);
    }
}
