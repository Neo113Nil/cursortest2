package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pr implements fb {
    public final File GWasM1elztuh;
    public final bh0 OOA6hdeuvCS;
    public final o1 X1lG3V04pd;
    public final r21 Yi7zF1RB1;
    public final AtomicBoolean xqGvceK5x;

    public pr(File file, r21 r21Var, o1 o1Var) {
        r21Var.getClass();
        this.GWasM1elztuh = file;
        this.Yi7zF1RB1 = r21Var;
        this.X1lG3V04pd = o1Var;
        this.xqGvceK5x = new AtomicBoolean(false);
        this.OOA6hdeuvCS = new bh0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:21:0x006f, B:28:0x0080, B:31:0x007d, B:27:0x0078), top: B:7:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [pr] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [pi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(pi piVar, wg wgVar) {
        nr nrVar;
        int i;
        boolean z;
        Throwable th;
        lr lrVar;
        boolean z2;
        try {
            if (wgVar instanceof nr) {
                nrVar = (nr) wgVar;
                int i2 = nrVar.E7jCp8Ls;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nrVar.E7jCp8Ls = i2 - Integer.MIN_VALUE;
                    Object obj = nrVar.JFJ3QoxA;
                    i = nrVar.E7jCp8Ls;
                    bh0 bh0Var = this.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        if (this.xqGvceK5x.get()) {
                            o4.jivtDDk9H("StorageConnection has already been disposed.");
                            return null;
                        }
                        z = bh0Var.OOA6hdeuvCS();
                        try {
                            lr lrVar2 = new lr(this.GWasM1elztuh);
                            try {
                                Boolean valueOf = Boolean.valueOf(z);
                                nrVar.mOu10nynGul = lrVar2;
                                nrVar.encWxUiV2 = z;
                                nrVar.E7jCp8Ls = 1;
                                Object X1lG3V04pd = piVar.X1lG3V04pd(lrVar2, valueOf, nrVar);
                                qh qhVar = qh.OOA6hdeuvCS;
                                if (X1lG3V04pd == qhVar) {
                                    return qhVar;
                                }
                                obj = X1lG3V04pd;
                                z2 = z;
                                lrVar = lrVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                this = z;
                                lrVar = lrVar2;
                                lrVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                                bh0Var.AvO7iQsrTN(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = nrVar.encWxUiV2;
                        lrVar = nrVar.mOu10nynGul;
                        try {
                            o50.A1EKNP6CxJ(obj);
                            z2 = this;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                lrVar.close();
                            } catch (Throwable th5) {
                                p.xqGvceK5x(th, th5);
                            }
                            throw th;
                        }
                    }
                    lrVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        bh0Var.AvO7iQsrTN(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            lrVar.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            z = this;
        }
        nrVar = new nr(this, wgVar);
        Object obj2 = nrVar.JFJ3QoxA;
        i = nrVar.E7jCp8Ls;
        bh0 bh0Var2 = this.OOA6hdeuvCS;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(5:(5:(2:3|(12:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:69|(3:71|(2:73|(2:75|76))|77)(2:79|80))|45|46|47|48|50|51|(5:54|14|15|16|(0)(0))|53))|50|51|(0)|53)|45|46|47|48)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008e, code lost:
    
        if (r10 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca A[Catch: all -> 0x0101, IOException -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:18:0x00ca, B:20:0x00d0, B:22:0x00d6, B:25:0x00e2, B:26:0x0100, B:28:0x00db, B:31:0x010c, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:38:0x011b, B:41:0x0118), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c A[Catch: all -> 0x0101, IOException -> 0x0103, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:18:0x00ca, B:20:0x00d0, B:22:0x00d6, B:25:0x00e2, B:26:0x0100, B:28:0x00db, B:31:0x010c, B:60:0x0123, B:62:0x0129, B:63:0x012c, B:38:0x011b, B:41:0x0118), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, or, wg] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(ej ejVar, wg wgVar) {
        bh0 bh0Var;
        int i;
        qh qhVar;
        File file;
        lv lvVar;
        bh0 bh0Var2;
        rr rrVar;
        Throwable th;
        rr rrVar2;
        bh0 bh0Var3;
        File file2;
        try {
            try {
                try {
                    try {
                        if (wgVar instanceof or) {
                            or orVar = (or) wgVar;
                            int i2 = orVar.XnEVoBF0td1l;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                orVar.XnEVoBF0td1l = i2 - Integer.MIN_VALUE;
                                bh0Var = orVar;
                                Object obj = bh0Var.rQPn8YBR;
                                i = bh0Var.XnEVoBF0td1l;
                                File file3 = this.GWasM1elztuh;
                                qhVar = qh.OOA6hdeuvCS;
                                if (i != 0) {
                                    o50.A1EKNP6CxJ(obj);
                                    if (this.xqGvceK5x.get()) {
                                        o4.jivtDDk9H("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file3);
                                        }
                                    }
                                    bh0Var.encWxUiV2 = ejVar;
                                    bh0 bh0Var4 = this.OOA6hdeuvCS;
                                    bh0Var.mOu10nynGul = bh0Var4;
                                    bh0Var.XnEVoBF0td1l = 1;
                                    Object xqGvceK5x = bh0Var4.xqGvceK5x(bh0Var);
                                    bh0Var2 = bh0Var4;
                                    lvVar = ejVar;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        rrVar2 = bh0Var.JFJ3QoxA;
                                        file2 = (File) bh0Var.mOu10nynGul;
                                        bh0Var3 = (bh0) bh0Var.encWxUiV2;
                                        try {
                                            o50.A1EKNP6CxJ(obj);
                                            try {
                                                rrVar2.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file2.exists()) {
                                                if (!(Build.VERSION.SDK_INT >= 26 ? y3.AvO7iQsrTN(file2, file3) : file2.renameTo(file3))) {
                                                    throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            bh0Var3.AvO7iQsrTN(null);
                                            return kc1.GWasM1elztuh;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                rrVar2.close();
                                            } catch (Throwable th4) {
                                                p.xqGvceK5x(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    bh0 bh0Var5 = (bh0) bh0Var.mOu10nynGul;
                                    lv lvVar2 = (lv) bh0Var.encWxUiV2;
                                    o50.A1EKNP6CxJ(obj);
                                    bh0Var2 = bh0Var5;
                                    lvVar = lvVar2;
                                }
                                file = new File(file3.getAbsolutePath() + ".tmp");
                                rrVar = new rr(file);
                                bh0Var.encWxUiV2 = bh0Var2;
                                bh0Var.mOu10nynGul = file;
                                bh0Var.JFJ3QoxA = rrVar;
                                bh0Var.XnEVoBF0td1l = 2;
                                if (lvVar.EljAMC1QTz(rrVar, bh0Var) != qhVar) {
                                    bh0Var3 = bh0Var2;
                                    file2 = file;
                                    rrVar2 = rrVar;
                                    rrVar2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return qhVar;
                            }
                        }
                        bh0Var.encWxUiV2 = bh0Var2;
                        bh0Var.mOu10nynGul = file;
                        bh0Var.JFJ3QoxA = rrVar;
                        bh0Var.XnEVoBF0td1l = 2;
                        if (lvVar.EljAMC1QTz(rrVar, bh0Var) != qhVar) {
                        }
                        return qhVar;
                    } catch (Throwable th5) {
                        th = th5;
                        rrVar2 = rrVar;
                        rrVar2.close();
                        throw th;
                    }
                    rrVar = new rr(file);
                } catch (IOException e) {
                    e = e;
                    if (!file.exists()) {
                        throw e;
                    }
                    file.delete();
                    throw e;
                }
                file = new File(file3.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                bh0Var = bh0Var2;
                th = th6;
                bh0Var.AvO7iQsrTN(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            file = ejVar;
        }
        bh0Var = new or(this, wgVar);
        Object obj2 = bh0Var.rQPn8YBR;
        i = bh0Var.XnEVoBF0td1l;
        File file32 = this.GWasM1elztuh;
        qhVar = qh.OOA6hdeuvCS;
    }

    @Override // defpackage.fb
    public final void close() {
        this.xqGvceK5x.set(true);
        this.X1lG3V04pd.GWasM1elztuh();
    }
}
