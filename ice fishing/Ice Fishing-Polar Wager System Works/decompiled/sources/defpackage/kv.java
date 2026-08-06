package defpackage;

/* loaded from: classes.dex */
public final class kv implements defpackage.hd {
    public final java.util.concurrent.atomic.AtomicBoolean F7NU4MC0GW;
    public final java.io.File IHQe1A4L2xu;
    public final defpackage.km0 adDC3e2L;
    public final defpackage.x91 oh6vYeIP;
    public final defpackage.s4 r1MBDhnF;

    public kv(java.io.File file, defpackage.x91 x91Var, defpackage.s4 s4Var) {
        x91Var.getClass();
        this.IHQe1A4L2xu = file;
        this.oh6vYeIP = x91Var;
        this.r1MBDhnF = s4Var;
        this.F7NU4MC0GW = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.adDC3e2L = new defpackage.km0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(2:43|(6:45|46|47|48|49|(1:51)(1:52))(2:56|57))|14|15|16|(2:(1:19)|20)(2:22|23)))|59|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ml] */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.ml mlVar, defpackage.fj fjVar) {
        defpackage.iv ivVar;
        java.lang.Object obj;
        int i;
        java.lang.Throwable th;
        defpackage.gv gvVar;
        defpackage.kv kvVar;
        ?? r6;
        java.lang.Object obj2;
        try {
            if (fjVar instanceof defpackage.iv) {
                ivVar = (defpackage.iv) fjVar;
                int i2 = ivVar.DFo87pBq1E5;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ivVar.DFo87pBq1E5 = i2 - Integer.MIN_VALUE;
                    obj = ivVar.ez2rX8ReCYw;
                    i = ivVar.DFo87pBq1E5;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (this.F7NU4MC0GW.get()) {
                            defpackage.db.AARZUJiTa("StorageConnection has already been disposed.");
                            return null;
                        }
                        ?? AARZUJiTa = this.adDC3e2L.AARZUJiTa();
                        defpackage.gv gvVar2 = new defpackage.gv(this.IHQe1A4L2xu);
                        try {
                            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((boolean) AARZUJiTa);
                            ivVar.EXtogiMhuM = this;
                            ivVar.riuEU0zW4 = gvVar2;
                            ivVar.SH1y5HwkJhh = AARZUJiTa;
                            ivVar.DFo87pBq1E5 = 1;
                            java.lang.Object F7NU4MC0GW = mlVar.F7NU4MC0GW(gvVar2, valueOf, ivVar);
                            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                            if (F7NU4MC0GW == vjVar) {
                                return vjVar;
                            }
                            kvVar = this;
                            r6 = AARZUJiTa == true ? 1 : 0;
                            obj2 = F7NU4MC0GW;
                            gvVar = gvVar2;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            gvVar = gvVar2;
                            obj = AARZUJiTa;
                            gvVar.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r6 = ivVar.SH1y5HwkJhh;
                        gvVar = ivVar.riuEU0zW4;
                        kvVar = ivVar.EXtogiMhuM;
                        try {
                            defpackage.f70.nBH8hAHy(obj);
                            obj2 = obj;
                        } catch (java.lang.Throwable th3) {
                            obj = r6;
                            this = kvVar;
                            th = th3;
                            try {
                                gvVar.close();
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                defpackage.x70.cnag84Bm(th, th4);
                                throw th;
                            }
                        }
                    }
                    gvVar.close();
                    th = null;
                    if (th != null) {
                        if (r6 != false) {
                            kvVar.adDC3e2L.oh6vYeIP(null);
                        }
                        return obj2;
                    }
                    try {
                        throw th;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        obj = r6;
                        this = kvVar;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            gvVar.close();
            th = null;
            if (th != null) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            if (obj != null) {
                this.adDC3e2L.oh6vYeIP(null);
            }
            throw th;
        }
        ivVar = new defpackage.iv(this, fjVar);
        obj = ivVar.ez2rX8ReCYw;
        i = ivVar.DFo87pBq1E5;
    }

    @Override // defpackage.hd
    public final void close() {
        this.F7NU4MC0GW.set(true);
        this.r1MBDhnF.IHQe1A4L2xu();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|(1:22)(1:28)|(1:24)(2:25|26))|29|30)(1:31))(2:42|43))(1:44))(2:62|(5:64|(2:66|(2:68|69))|70|(1:72)|51)(2:73|74))|45|46|47|48|49|(5:52|14|15|16|(0)(0))|51))|46|47|48|49|(0)|51)|80|6|7|(0)(0)|45|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8 A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TryCatch #0 {all -> 0x0113, blocks: (B:18:0x00d8, B:20:0x00de, B:22:0x00e6, B:25:0x00f2, B:26:0x0112, B:28:0x00eb, B:31:0x011e, B:58:0x012d, B:60:0x0133, B:61:0x0136, B:38:0x012b, B:41:0x0128, B:45:0x009b, B:47:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0113, blocks: (B:18:0x00d8, B:20:0x00de, B:22:0x00e6, B:25:0x00f2, B:26:0x0112, B:28:0x00eb, B:31:0x011e, B:58:0x012d, B:60:0x0133, B:61:0x0136, B:38:0x012b, B:41:0x0128, B:45:0x009b, B:47:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [im0, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh6vYeIP(defpackage.am amVar, defpackage.fj fjVar) {
        defpackage.jv jvVar;
        ?? r2;
        defpackage.vj vjVar;
        java.io.File file;
        defpackage.im0 im0Var;
        defpackage.k00 k00Var;
        defpackage.mv mvVar;
        java.lang.Throwable th;
        defpackage.mv mvVar2;
        defpackage.kv kvVar;
        java.io.File file2;
        try {
            try {
                try {
                    if (fjVar instanceof defpackage.jv) {
                        jvVar = (defpackage.jv) fjVar;
                        int i = jvVar.SyNS6RMn;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            jvVar.SyNS6RMn = i - Integer.MIN_VALUE;
                            java.lang.Object obj = jvVar.JlrlGoKF;
                            r2 = jvVar.SyNS6RMn;
                            vjVar = defpackage.vj.adDC3e2L;
                            if (r2 != 0) {
                                defpackage.f70.nBH8hAHy(obj);
                                if (this.F7NU4MC0GW.get()) {
                                    defpackage.db.AARZUJiTa("StorageConnection has already been disposed.");
                                    return null;
                                }
                                java.io.File file3 = this.IHQe1A4L2xu;
                                java.io.File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new java.io.IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                jvVar.EXtogiMhuM = this;
                                jvVar.riuEU0zW4 = amVar;
                                defpackage.km0 km0Var = this.adDC3e2L;
                                jvVar.SH1y5HwkJhh = km0Var;
                                jvVar.SyNS6RMn = 1;
                                if (km0Var.F7NU4MC0GW(jvVar) != vjVar) {
                                    im0Var = km0Var;
                                    k00Var = amVar;
                                }
                                return vjVar;
                            }
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                mvVar2 = jvVar.ez2rX8ReCYw;
                                file2 = (java.io.File) jvVar.SH1y5HwkJhh;
                                im0Var = (defpackage.im0) jvVar.riuEU0zW4;
                                kvVar = jvVar.EXtogiMhuM;
                                try {
                                    defpackage.f70.nBH8hAHy(obj);
                                    try {
                                        mvVar2.close();
                                        th = null;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        java.io.File file4 = kvVar.IHQe1A4L2xu;
                                        if (!(android.os.Build.VERSION.SDK_INT >= 26 ? defpackage.p5.AARZUJiTa(file2, file4) : file2.renameTo(file4))) {
                                            throw new java.io.IOException("Unable to rename " + file2 + " to " + kvVar.IHQe1A4L2xu + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    im0Var.oh6vYeIP(null);
                                    return defpackage.ok1.IHQe1A4L2xu;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    try {
                                        mvVar2.close();
                                    } catch (java.lang.Throwable th4) {
                                        defpackage.x70.cnag84Bm(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            defpackage.im0 im0Var2 = (defpackage.im0) jvVar.SH1y5HwkJhh;
                            defpackage.k00 k00Var2 = (defpackage.k00) jvVar.riuEU0zW4;
                            defpackage.kv kvVar2 = jvVar.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            im0Var = im0Var2;
                            this = kvVar2;
                            k00Var = k00Var2;
                            file = new java.io.File(this.IHQe1A4L2xu.getAbsolutePath() + ".tmp");
                            mvVar = new defpackage.mv(file);
                            jvVar.EXtogiMhuM = this;
                            jvVar.riuEU0zW4 = im0Var;
                            jvVar.SH1y5HwkJhh = file;
                            jvVar.ez2rX8ReCYw = mvVar;
                            jvVar.SyNS6RMn = 2;
                            if (k00Var.adDC3e2L(mvVar, jvVar) != vjVar) {
                                kvVar = this;
                                file2 = file;
                                mvVar2 = mvVar;
                                mvVar2.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return vjVar;
                        }
                    }
                    jvVar.EXtogiMhuM = this;
                    jvVar.riuEU0zW4 = im0Var;
                    jvVar.SH1y5HwkJhh = file;
                    jvVar.ez2rX8ReCYw = mvVar;
                    jvVar.SyNS6RMn = 2;
                    if (k00Var.adDC3e2L(mvVar, jvVar) != vjVar) {
                    }
                    return vjVar;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    mvVar2 = mvVar;
                    mvVar2.close();
                    throw th;
                }
                mvVar = new defpackage.mv(file);
            } catch (java.io.IOException e) {
                e = e;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r2 != 0) {
            }
            file = new java.io.File(this.IHQe1A4L2xu.getAbsolutePath() + ".tmp");
        } catch (java.lang.Throwable th6) {
            r2.oh6vYeIP(null);
            throw th6;
        }
        jvVar = new defpackage.jv(this, fjVar);
        java.lang.Object obj2 = jvVar.JlrlGoKF;
        r2 = jvVar.SyNS6RMn;
        vjVar = defpackage.vj.adDC3e2L;
    }
}
