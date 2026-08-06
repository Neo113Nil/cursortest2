package defpackage;

/* loaded from: classes.dex */
public abstract class gq1 {
    public static final defpackage.F7NU4MC0GW EgCjBq0SZwJ;
    public static final defpackage.F7NU4MC0GW G3OKOH3wZRC;
    public static final /* synthetic */ int NHJTzaLwkd = 0;
    public static final defpackage.F7NU4MC0GW PAEGRtP0bX;
    public static final /* synthetic */ int QQUzIjv3iOC5 = 0;
    public static final defpackage.F7NU4MC0GW QoRHpC4k;
    public static final defpackage.F7NU4MC0GW V7bD7b8KA;
    public static final defpackage.F7NU4MC0GW abhbClRa;
    public static final defpackage.F7NU4MC0GW fnWB2E7cs;
    public static final defpackage.F7NU4MC0GW kNAkVymC;
    public static final defpackage.F7NU4MC0GW kd6TUFXn;
    public static final defpackage.sf IHQe1A4L2xu = new defpackage.sf(436925013, new defpackage.e6(3, 0), false);
    public static final defpackage.hy oh6vYeIP = new defpackage.hy(7);
    public static final defpackage.et r1MBDhnF = new defpackage.et("REMOVED_TASK", 1);
    public static final defpackage.et F7NU4MC0GW = new defpackage.et("CLOSED_EMPTY", 1);
    public static final defpackage.et adDC3e2L = new defpackage.et("COMPLETING_ALREADY", 1);
    public static final defpackage.et xiZrDbcSW0 = new defpackage.et("COMPLETING_WAITING_CHILDREN", 1);
    public static final defpackage.et AARZUJiTa = new defpackage.et("COMPLETING_RETRY", 1);
    public static final defpackage.et EXtogiMhuM = new defpackage.et("TOO_LATE_TO_CANCEL", 1);
    public static final defpackage.et riuEU0zW4 = new defpackage.et("SEALED", 1);
    public static final defpackage.ht SH1y5HwkJhh = new defpackage.ht(false);
    public static final defpackage.ht ez2rX8ReCYw = new defpackage.ht(true);
    public static final java.lang.Object JlrlGoKF = new java.lang.Object();
    public static final defpackage.j40 DFo87pBq1E5 = new defpackage.j40(2);
    public static final defpackage.et SyNS6RMn = new defpackage.et("NONE", 1);
    public static final defpackage.et cnag84Bm = new defpackage.et("PENDING", 1);

    static {
        int i = 26;
        QoRHpC4k = new defpackage.F7NU4MC0GW(i, new defpackage.r41(13), new defpackage.g00() { // from class: ml1
            public final /* synthetic */ int adDC3e2L = 0;

            @Override // defpackage.g00
            public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                switch (this.adDC3e2L) {
                    case 0:
                        return java.lang.Float.valueOf(((defpackage.e5) obj).IHQe1A4L2xu);
                    default:
                        defpackage.dp1 dp1Var = (defpackage.dp1) obj;
                        dp1Var.getClass();
                        return dp1Var;
                }
            }
        });
        G3OKOH3wZRC = new defpackage.F7NU4MC0GW(i, new defpackage.r41(14), new defpackage.r41(15));
        kd6TUFXn = new defpackage.F7NU4MC0GW(i, new defpackage.r41(16), new defpackage.r41(17));
        EgCjBq0SZwJ = new defpackage.F7NU4MC0GW(i, new defpackage.r41(18), new defpackage.r41(19));
        fnWB2E7cs = new defpackage.F7NU4MC0GW(i, new defpackage.r41(20), new defpackage.r41(21));
        kNAkVymC = new defpackage.F7NU4MC0GW(i, new defpackage.r41(22), new defpackage.r41(23));
        V7bD7b8KA = new defpackage.F7NU4MC0GW(i, new defpackage.r41(24), new defpackage.r41(25));
        PAEGRtP0bX = new defpackage.F7NU4MC0GW(i, new defpackage.r41(26), new defpackage.r41(27));
        abhbClRa = new defpackage.F7NU4MC0GW(i, new defpackage.r41(28), new defpackage.r41(29));
    }

    public static defpackage.mj0 AARZUJiTa(defpackage.mj0 mj0Var) {
        return mj0Var.r1MBDhnF(new defpackage.u6());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] C0U8sNJm(java.io.FileInputStream fileInputStream, int i, int i2) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new java.lang.IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (java.util.zip.DataFormatException e) {
                    throw new java.lang.IllegalStateException(e.getMessage());
                }
            }
            throw new java.lang.IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static defpackage.mj0 D2vUnMij(defpackage.mj0 mj0Var, boolean z, defpackage.zk0 zk0Var, defpackage.k21 k21Var, boolean z2, defpackage.vz vzVar) {
        return mj0Var.r1MBDhnF(k21Var != null ? new defpackage.w61(vzVar, k21Var, zk0Var, z, z2) : k21Var == null ? new defpackage.w61(vzVar, null, zk0Var, z, z2) : zk0Var != null ? defpackage.c50.IHQe1A4L2xu(defpackage.jj0.IHQe1A4L2xu, zk0Var, k21Var).r1MBDhnF(new defpackage.w61(vzVar, null, zk0Var, z, z2)) : new defpackage.ah(new defpackage.x61(k21Var, z, z2, vzVar)));
    }

    public static final void DFo87pBq1E5(java.io.Closeable closeable, java.lang.Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                defpackage.x70.cnag84Bm(th, th2);
            }
        }
    }

    public static final java.lang.Object EXtogiMhuM(defpackage.kn knVar, defpackage.k7 k7Var, defpackage.ce1 ce1Var) {
        java.lang.Object obj;
        defpackage.ip0 v5iciZok;
        java.lang.Object CGXpA9s3RjIa;
        defpackage.ep0 ep0Var;
        if (((defpackage.lj0) knVar).adDC3e2L.kd6TUFXn) {
            defpackage.lj0 lj0Var = (defpackage.lj0) knVar;
            if (!lj0Var.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var2 = lj0Var.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(knVar);
            loop0: while (true) {
                obj = null;
                if (D2vUnMij == null) {
                    break;
                }
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 524288) != 0) {
                    while (lj0Var2 != null) {
                        if ((lj0Var2.AARZUJiTa & 524288) != 0) {
                            defpackage.lj0 lj0Var3 = lj0Var2;
                            defpackage.xl0 xl0Var = null;
                            while (lj0Var3 != null) {
                                if (lj0Var3 instanceof defpackage.e9) {
                                    obj = lj0Var3;
                                    break loop0;
                                }
                                if ((lj0Var3.AARZUJiTa & 524288) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                    int i = 0;
                                    for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                        if ((lj0Var4.AARZUJiTa & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lj0Var3 = lj0Var4;
                                            } else {
                                                if (xl0Var == null) {
                                                    xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var3 != null) {
                                                    xl0Var.oh6vYeIP(lj0Var3);
                                                    lj0Var3 = null;
                                                }
                                                xl0Var.oh6vYeIP(lj0Var4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var);
                            }
                        }
                        lj0Var2 = lj0Var2.riuEU0zW4;
                    }
                }
                D2vUnMij = D2vUnMij.V7bD7b8KA();
                lj0Var2 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
            }
            defpackage.e9 e9Var = (defpackage.e9) obj;
            if (e9Var != null && (CGXpA9s3RjIa = e9Var.CGXpA9s3RjIa((v5iciZok = defpackage.w70.v5iciZok(knVar)), new defpackage.o0(2, k7Var, v5iciZok), ce1Var)) == defpackage.vj.adDC3e2L) {
                return CGXpA9s3RjIa;
            }
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void EgCjBq0SZwJ(defpackage.o1 o1Var, android.util.LongSparseArray longSparseArray) {
        android.view.translation.TranslationResponseValue value;
        java.lang.CharSequence text;
        defpackage.h71 h71Var;
        defpackage.f71 f71Var;
        defpackage.g00 g00Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            android.view.translation.ViewTranslationResponse G3OKOH3wZRC2 = defpackage.e1.G3OKOH3wZRC(longSparseArray.get(keyAt));
            if (G3OKOH3wZRC2 != null && value != null && text != null && (h71Var = (defpackage.h71) o1Var.adDC3e2L().oh6vYeIP((int) keyAt)) != null && (f71Var = h71Var.IHQe1A4L2xu) != null) {
                java.lang.Object AARZUJiTa2 = f71Var.F7NU4MC0GW.adDC3e2L.AARZUJiTa(defpackage.a71.JlrlGoKF);
                if (AARZUJiTa2 == null) {
                    AARZUJiTa2 = null;
                }
                defpackage.TFRaUu83X3E tFRaUu83X3E = (defpackage.TFRaUu83X3E) AARZUJiTa2;
                if (tFRaUu83X3E != null && (g00Var = (defpackage.g00) tFRaUu83X3E.oh6vYeIP) != null) {
                }
            }
        }
    }

    public static final defpackage.hc1 F7NU4MC0GW(java.lang.Object obj) {
        if (obj == null) {
            obj = defpackage.x70.F7NU4MC0GW;
        }
        return new defpackage.hc1(obj);
    }

    public static final defpackage.oy G3OKOH3wZRC(android.content.Context context) {
        defpackage.ad1 ad1Var = new defpackage.ad1(9);
        context.getApplicationContext();
        return new defpackage.oy(ad1Var, new defpackage.k2(android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.ez.IHQe1A4L2xu.IHQe1A4L2xu(context) : 0));
    }

    public static final void IHQe1A4L2xu(java.lang.String str, java.lang.String str2, defpackage.t10 t10Var, int i) {
        java.lang.String str3;
        int i2;
        defpackage.t10 t10Var2 = t10Var;
        t10Var2.QUKZkWRtw6(-2146301785);
        int i3 = i | (t10Var2.xiZrDbcSW0(str) ? 4 : 2) | (t10Var2.xiZrDbcSW0(str2) ? 32 : 16);
        if (!t10Var2.lpprD5VAS(i3 & 1, (i3 & 19) != 18)) {
            str3 = str2;
            i2 = 1;
            t10Var2.WLpAkxCo();
        } else if (str2 == null) {
            t10Var2.AsxAYCCkb3Hi(-1298239825);
            defpackage.of1.oh6vYeIP(str, null, 0L, 0L, 0L, new defpackage.cf1(3), 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var2.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu)).DFo87pBq1E5, t10Var, i3 & 14, 0, 130046);
            t10Var2 = t10Var;
            t10Var2.QoRHpC4k(false);
            str3 = str2;
            i2 = 1;
        } else {
            t10Var2.AsxAYCCkb3Hi(-1298118708);
            defpackage.ov ovVar = defpackage.ba1.IHQe1A4L2xu;
            defpackage.e31 IHQe1A4L2xu2 = defpackage.d31.IHQe1A4L2xu(defpackage.mj1.F7NU4MC0GW, defpackage.n.QoRHpC4k, t10Var2, 54);
            int hashCode = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var2, ovVar);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(ohVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var2, IHQe1A4L2xu2);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var2, JlrlGoKF2);
            defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var2, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var2, yIx6ChFVk);
            defpackage.nc1 nc1Var = defpackage.dk1.IHQe1A4L2xu;
            defpackage.of1.oh6vYeIP(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var2.SH1y5HwkJhh(nc1Var)).DFo87pBq1E5, t10Var, i3 & 14, 0, 131070);
            str3 = str2;
            defpackage.of1.oh6vYeIP(str3, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var.SH1y5HwkJhh(nc1Var)).SyNS6RMn, t10Var, (i3 >> 3) & 14, 0, 131070);
            t10Var2 = t10Var;
            i2 = 1;
            t10Var2.QoRHpC4k(true);
            t10Var2.QoRHpC4k(false);
        }
        defpackage.az0 kd6TUFXn2 = t10Var2.kd6TUFXn();
        if (kd6TUFXn2 != null) {
            kd6TUFXn2.F7NU4MC0GW = new defpackage.m30(i, i2, str, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void JlrlGoKF(defpackage.k31 k31Var, java.lang.Throwable th) {
        boolean isTerminated;
        if (k31Var != 0) {
            if (th != null) {
                try {
                    defpackage.fx0.QoRHpC4k(k31Var);
                    return;
                } catch (java.lang.Throwable th2) {
                    defpackage.x70.cnag84Bm(th, th2);
                    return;
                }
            }
            if (k31Var instanceof java.lang.AutoCloseable) {
                k31Var.close();
                return;
            }
            if (!(k31Var instanceof java.util.concurrent.ExecutorService)) {
                if (k31Var instanceof android.content.res.TypedArray) {
                    ((android.content.res.TypedArray) k31Var).recycle();
                    return;
                } else if (k31Var instanceof android.media.MediaMetadataRetriever) {
                    ((android.media.MediaMetadataRetriever) k31Var).release();
                    return;
                } else {
                    if (!(k31Var instanceof android.media.MediaDrm)) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    ((android.media.MediaDrm) k31Var).release();
                    return;
                }
            }
            java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) k31Var;
            if (executorService == java.util.concurrent.ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
                } catch (java.lang.InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static final java.lang.Object NHJTzaLwkd(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final int[] PAEGRtP0bX(int i, java.util.List list) {
        int i2;
        int i3 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = defpackage.w70.yIx6ChFVk(((defpackage.ae) list.get(i3)).IHQe1A4L2xu);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((defpackage.ae) list.get(i3)).IHQe1A4L2xu;
            if (defpackage.ae.F7NU4MC0GW(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = defpackage.w70.yIx6ChFVk(defpackage.ae.oh6vYeIP(((defpackage.ae) list.get(1)).IHQe1A4L2xu, 0.0f));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = defpackage.w70.yIx6ChFVk(defpackage.ae.oh6vYeIP(((defpackage.ae) list.get(i3 - 1)).IHQe1A4L2xu, 0.0f));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = defpackage.w70.yIx6ChFVk(defpackage.ae.oh6vYeIP(((defpackage.ae) list.get(i3 - 1)).IHQe1A4L2xu, 0.0f));
                    i4 += 2;
                    iArr2[i5] = defpackage.w70.yIx6ChFVk(defpackage.ae.oh6vYeIP(((defpackage.ae) list.get(i3 + 1)).IHQe1A4L2xu, 0.0f));
                }
                i4 = i2;
            } else {
                iArr2[i4] = defpackage.w70.yIx6ChFVk(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static byte[] QQUzIjv3iOC5(java.io.InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                defpackage.db.AARZUJiTa(defpackage.fx0.SH1y5HwkJhh("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static android.os.Handler QoRHpC4k(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return defpackage.cq.IHQe1A4L2xu(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.InstantiationException e2) {
            e = e2;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.NoSuchMethodException e3) {
            e = e3;
            android.util.Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.lang.Throwable cause = e4.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static defpackage.lb SH1y5HwkJhh(long j, defpackage.t10 t10Var) {
        long j2;
        long oh6vYeIP2 = defpackage.he.oh6vYeIP(j, t10Var);
        long j3 = defpackage.ae.xiZrDbcSW0;
        long oh6vYeIP3 = defpackage.ae.oh6vYeIP(oh6vYeIP2, 0.38f);
        defpackage.fe feVar = (defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu);
        defpackage.lb lbVar = feVar.nVhUznk1t;
        if (lbVar == null) {
            defpackage.ge geVar = defpackage.fm.riuEU0zW4;
            j2 = oh6vYeIP2;
            defpackage.lb lbVar2 = new defpackage.lb(defpackage.he.r1MBDhnF(feVar, geVar), defpackage.he.IHQe1A4L2xu(feVar, defpackage.he.r1MBDhnF(feVar, geVar)), defpackage.w70.QoRHpC4k(defpackage.ae.oh6vYeIP(defpackage.he.r1MBDhnF(feVar, defpackage.fm.SH1y5HwkJhh), defpackage.fm.ez2rX8ReCYw), defpackage.he.r1MBDhnF(feVar, geVar)), defpackage.ae.oh6vYeIP(defpackage.he.IHQe1A4L2xu(feVar, defpackage.he.r1MBDhnF(feVar, geVar)), 0.38f));
            feVar.nVhUznk1t = lbVar2;
            lbVar = lbVar2;
        } else {
            j2 = oh6vYeIP2;
        }
        long j4 = j != 16 ? j : lbVar.IHQe1A4L2xu;
        long j5 = j2 != 16 ? j2 : lbVar.oh6vYeIP;
        if (j3 == 16) {
            j3 = lbVar.r1MBDhnF;
        }
        long j6 = j3;
        if (oh6vYeIP3 == 16) {
            oh6vYeIP3 = lbVar.F7NU4MC0GW;
        }
        return new defpackage.lb(j4, j5, j6, oh6vYeIP3);
    }

    public static final java.lang.Object SiPhmbmu(java.lang.Object obj) {
        defpackage.x40 x40Var;
        defpackage.y40 y40Var = obj instanceof defpackage.y40 ? (defpackage.y40) obj : null;
        return (y40Var == null || (x40Var = y40Var.IHQe1A4L2xu) == null) ? obj : x40Var;
    }

    public static byte[] SyNS6RMn(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static long UsuH8pd5P(java.io.InputStream inputStream, int i) {
        byte[] QQUzIjv3iOC52 = QQUzIjv3iOC5(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (QQUzIjv3iOC52[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final boolean V7bD7b8KA(int i, int i2, long j) {
        int SH1y5HwkJhh2 = defpackage.ki.SH1y5HwkJhh(j);
        if (i > defpackage.ki.EXtogiMhuM(j) || SH1y5HwkJhh2 > i) {
            return false;
        }
        return i2 <= defpackage.ki.AARZUJiTa(j) && defpackage.ki.riuEU0zW4(j) <= i2;
    }

    public static final float[] abhbClRa(int i, java.util.List list) {
        if (i == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i];
        fArr[0] = 0.0f;
        int size = list.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long j = ((defpackage.ae) list.get(i3)).IHQe1A4L2xu;
            float size2 = i3 / (list.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = size2;
            if (defpackage.ae.F7NU4MC0GW(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = size2;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = 1.0f;
        return fArr;
    }

    public static final void adDC3e2L(java.lang.String str, defpackage.vz vzVar, defpackage.mj0 mj0Var, boolean z, java.lang.String str2, defpackage.t10 t10Var, int i, int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        java.lang.String str4;
        int i5;
        vzVar.getClass();
        t10Var.QUKZkWRtw6(1521592122);
        if ((i & 6) == 0) {
            i3 = i | (t10Var.xiZrDbcSW0(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (t10Var.EXtogiMhuM(vzVar) ? 32 : 16) | (t10Var.AARZUJiTa(z) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i6 | (t10Var.xiZrDbcSW0(str3) ? 16384 : 8192);
        }
        int i8 = 1;
        if (t10Var.lpprD5VAS(i4 & 1, (i4 & 9363) != 9362)) {
            java.lang.String str5 = i7 != 0 ? null : str3;
            defpackage.b10 b10Var = (defpackage.b10) t10Var.SH1y5HwkJhh(defpackage.cv.IHQe1A4L2xu);
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(b10Var) | ((i4 & 112) == 32);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM2 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.xu0(b10Var, vzVar, i8);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.vz vzVar2 = (defpackage.vz) mAr5m2L7gYDP;
            defpackage.mj0 oh6vYeIP2 = defpackage.ba1.oh6vYeIP(mj0Var);
            defpackage.ok F7NU4MC0GW2 = defpackage.ci0.F7NU4MC0GW(10.0f, 10.0f);
            defpackage.ct0 ct0Var = defpackage.ea.IHQe1A4L2xu;
            defpackage.ly0 ly0Var = defpackage.he.IHQe1A4L2xu;
            long j = ((defpackage.fe) t10Var.SH1y5HwkJhh(ly0Var)).IHQe1A4L2xu;
            long j2 = ((defpackage.fe) t10Var.SH1y5HwkJhh(ly0Var)).oh6vYeIP;
            long j3 = defpackage.ae.xiZrDbcSW0;
            defpackage.fe feVar = (defpackage.fe) t10Var.SH1y5HwkJhh(ly0Var);
            defpackage.da daVar = feVar.AsxAYCCkb3Hi;
            if (daVar == null) {
                i5 = i4;
                daVar = new defpackage.da(defpackage.he.r1MBDhnF(feVar, defpackage.h1.SyNS6RMn), defpackage.he.r1MBDhnF(feVar, defpackage.h1.fnWB2E7cs), defpackage.ae.oh6vYeIP(defpackage.he.r1MBDhnF(feVar, defpackage.h1.cnag84Bm), defpackage.h1.QoRHpC4k), defpackage.ae.oh6vYeIP(defpackage.he.r1MBDhnF(feVar, defpackage.h1.G3OKOH3wZRC), defpackage.h1.kd6TUFXn));
                feVar.AsxAYCCkb3Hi = daVar;
            } else {
                i5 = i4;
            }
            defpackage.x70.r1MBDhnF(vzVar2, oh6vYeIP2, z, F7NU4MC0GW2, daVar.IHQe1A4L2xu(j, j2, j3, j3), null, null, null, defpackage.h1.XZx205DYe(2093665610, new defpackage.yu0(1, str, str5), t10Var), t10Var, ((i5 >> 3) & 896) | 805306368, 480);
            str4 = str5;
        } else {
            t10Var.WLpAkxCo();
            str4 = str3;
        }
        defpackage.az0 kd6TUFXn2 = t10Var.kd6TUFXn();
        if (kd6TUFXn2 != null) {
            kd6TUFXn2.F7NU4MC0GW = new defpackage.zu0(str, vzVar, mj0Var, z, str4, i, i2, 1);
        }
    }

    public static final int cnag84Bm(java.util.List list) {
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (defpackage.ae.F7NU4MC0GW(((defpackage.ae) list.get(i2)).IHQe1A4L2xu) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.io.Serializable ez2rX8ReCYw(defpackage.hw hwVar, defpackage.iw iwVar, defpackage.fj fjVar) {
        defpackage.vw vwVar;
        int i;
        defpackage.rz0 rz0Var;
        java.lang.Throwable th;
        defpackage.u80 u80Var;
        java.util.concurrent.CancellationException kd6TUFXn2;
        if (fjVar instanceof defpackage.vw) {
            vwVar = (defpackage.vw) fjVar;
            int i2 = vwVar.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vwVar.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = vwVar.riuEU0zW4;
                i = vwVar.SH1y5HwkJhh;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.rz0 rz0Var2 = new defpackage.rz0();
                    try {
                        defpackage.iw pqVar = new defpackage.pq(iwVar, rz0Var2);
                        vwVar.EXtogiMhuM = rz0Var2;
                        vwVar.SH1y5HwkJhh = 1;
                        java.lang.Object IHQe1A4L2xu2 = hwVar.IHQe1A4L2xu(pqVar, vwVar);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (IHQe1A4L2xu2 == vjVar) {
                            return vjVar;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        rz0Var = rz0Var2;
                        th = (java.lang.Throwable) rz0Var.adDC3e2L;
                        if (th != null) {
                        }
                        defpackage.lj ljVar = vwVar.xiZrDbcSW0;
                        ljVar.getClass();
                        u80Var = (defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS);
                        if (u80Var != null) {
                        }
                        if (th != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rz0Var = vwVar.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = (java.lang.Throwable) rz0Var.adDC3e2L;
                        if (th != null || !th.equals(th)) {
                            defpackage.lj ljVar2 = vwVar.xiZrDbcSW0;
                            ljVar2.getClass();
                            u80Var = (defpackage.u80) ljVar2.cnag84Bm(defpackage.n.lpprD5VAS);
                            if (u80Var != null || !u80Var.isCancelled() || (kd6TUFXn2 = u80Var.kd6TUFXn()) == null || !kd6TUFXn2.equals(th)) {
                                if (th != null) {
                                    return th;
                                }
                                if (th instanceof java.util.concurrent.CancellationException) {
                                    defpackage.x70.cnag84Bm(th, th);
                                    throw th;
                                }
                                defpackage.x70.cnag84Bm(th, th);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                return null;
            }
        }
        vwVar = new defpackage.vw(fjVar);
        java.lang.Object obj2 = vwVar.riuEU0zW4;
        i = vwVar.SH1y5HwkJhh;
        if (i != 0) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object fnWB2E7cs(defpackage.hw hwVar, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.ex exVar;
        int i;
        defpackage.k00 k00Var2;
        defpackage.rz0 rz0Var;
        defpackage.IHQe1A4L2xu e;
        defpackage.ax axVar;
        java.lang.Object obj;
        defpackage.et etVar = defpackage.x70.F7NU4MC0GW;
        if (fjVar instanceof defpackage.ex) {
            exVar = (defpackage.ex) fjVar;
            int i2 = exVar.JlrlGoKF;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exVar.JlrlGoKF = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = exVar.ez2rX8ReCYw;
                i = exVar.JlrlGoKF;
                int i3 = 1;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj2);
                    defpackage.rz0 rz0Var2 = new defpackage.rz0();
                    rz0Var2.adDC3e2L = etVar;
                    defpackage.ax axVar2 = new defpackage.ax(i3, k00Var, rz0Var2);
                    try {
                        exVar.EXtogiMhuM = (defpackage.ce1) k00Var;
                        exVar.riuEU0zW4 = rz0Var2;
                        exVar.SH1y5HwkJhh = axVar2;
                        exVar.JlrlGoKF = 1;
                        java.lang.Object IHQe1A4L2xu2 = hwVar.IHQe1A4L2xu(axVar2, exVar);
                        java.lang.Object obj3 = defpackage.vj.adDC3e2L;
                        if (IHQe1A4L2xu2 == obj3) {
                            return obj3;
                        }
                        k00Var2 = k00Var;
                        rz0Var = rz0Var2;
                    } catch (defpackage.IHQe1A4L2xu e2) {
                        k00Var2 = k00Var;
                        rz0Var = rz0Var2;
                        e = e2;
                        axVar = axVar2;
                        if (e.adDC3e2L != axVar) {
                        }
                        obj = rz0Var.adDC3e2L;
                        if (obj == etVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    axVar = exVar.SH1y5HwkJhh;
                    rz0Var = exVar.riuEU0zW4;
                    k00Var2 = (defpackage.k00) exVar.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj2);
                    } catch (defpackage.IHQe1A4L2xu e3) {
                        e = e3;
                        if (e.adDC3e2L != axVar) {
                            throw e;
                        }
                        obj = rz0Var.adDC3e2L;
                        if (obj == etVar) {
                        }
                    }
                }
                obj = rz0Var.adDC3e2L;
                if (obj == etVar) {
                    return obj;
                }
                throw new java.util.NoSuchElementException("Expected at least one element matching the predicate " + k00Var2);
            }
        }
        exVar = new defpackage.ex(fjVar);
        java.lang.Object obj22 = exVar.ez2rX8ReCYw;
        i = exVar.JlrlGoKF;
        int i32 = 1;
        if (i != 0) {
        }
        obj = rz0Var.adDC3e2L;
        if (obj == etVar) {
        }
    }

    public static final defpackage.xy0 frpfPPIgqM9O(defpackage.hw hwVar, defpackage.uj ujVar, defpackage.q91 q91Var, java.lang.Object obj) {
        defpackage.F7NU4MC0GW f7nu4mc0gw;
        defpackage.ub ubVar;
        defpackage.hw xiZrDbcSW02;
        defpackage.sb.oh6vYeIP.getClass();
        defpackage.rb rbVar = defpackage.rb.IHQe1A4L2xu;
        int i = 25;
        if (!(hwVar instanceof defpackage.ub) || (xiZrDbcSW02 = (ubVar = (defpackage.ub) hwVar).xiZrDbcSW0()) == null) {
            f7nu4mc0gw = new defpackage.F7NU4MC0GW(i, hwVar, defpackage.lt.adDC3e2L);
        } else {
            if (ubVar.xiZrDbcSW0 != -3) {
            }
            f7nu4mc0gw = new defpackage.F7NU4MC0GW(i, xiZrDbcSW02, ubVar.adDC3e2L);
        }
        defpackage.hc1 F7NU4MC0GW2 = F7NU4MC0GW(obj);
        defpackage.fm.frpfPPIgqM9O(ujVar, (defpackage.lj) f7nu4mc0gw.AARZUJiTa, q91Var.equals(defpackage.p91.IHQe1A4L2xu) ? defpackage.xj.adDC3e2L : defpackage.xj.EXtogiMhuM, new defpackage.x3(q91Var, (defpackage.hw) f7nu4mc0gw.xiZrDbcSW0, F7NU4MC0GW2, obj, (defpackage.ej) null));
        return new defpackage.xy0(F7NU4MC0GW2);
    }

    public static final void kNAkVymC(defpackage.lj ljVar, java.lang.Throwable th) {
        try {
            defpackage.oj ojVar = (defpackage.oj) ljVar.cnag84Bm(defpackage.n.C0U8sNJm);
            if (ojVar != null) {
                ojVar.G3OKOH3wZRC(ljVar, th);
            } else {
                defpackage.mj1.yIx6ChFVk(ljVar, th);
            }
        } catch (java.lang.Throwable th2) {
            if (th != th2) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                defpackage.x70.cnag84Bm(runtimeException, th);
                th = runtimeException;
            }
            defpackage.mj1.yIx6ChFVk(ljVar, th);
        }
    }

    public static final defpackage.hw kd6TUFXn(defpackage.hw hwVar) {
        return hwVar instanceof defpackage.fc1 ? hwVar : hwVar instanceof defpackage.qq ? hwVar : new defpackage.qq(hwVar);
    }

    public static final defpackage.tb nBH8hAHy(defpackage.x9 x9Var) {
        return new defpackage.tb(x9Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void oh6vYeIP(defpackage.ny0 ny0Var, defpackage.k00 k00Var, defpackage.t10 t10Var, int i) {
        defpackage.kl1 kl1Var;
        boolean z;
        defpackage.az0 kd6TUFXn2;
        t10Var.QUKZkWRtw6(-149765515);
        defpackage.k70 k70Var = t10Var.abhbClRa;
        defpackage.gu0 JlrlGoKF2 = t10Var.JlrlGoKF();
        t10Var.EoOhNTTfIN7K(201, defpackage.dh.oh6vYeIP);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (defpackage.x70.QoRHpC4k(mAr5m2L7gYDP, defpackage.bh.IHQe1A4L2xu)) {
            kl1Var = null;
        } else {
            mAr5m2L7gYDP.getClass();
            kl1Var = (defpackage.kl1) mAr5m2L7gYDP;
        }
        defpackage.ly0 ly0Var = ny0Var.IHQe1A4L2xu;
        defpackage.kl1 r1MBDhnF2 = ly0Var.r1MBDhnF(ny0Var, kl1Var);
        boolean equals = r1MBDhnF2.equals(kl1Var);
        if (!equals) {
            t10Var.OtkytngK3Mr(r1MBDhnF2);
        }
        if (t10Var.QPwENk36pDC) {
            if (ny0Var.xiZrDbcSW0 || !JlrlGoKF2.containsKey(ly0Var)) {
                JlrlGoKF2 = JlrlGoKF2.oh6vYeIP(ly0Var, r1MBDhnF2);
            }
            t10Var.wll2JLbTBC2 = true;
        } else {
            defpackage.ea1 ea1Var = t10Var.SiPhmbmu;
            java.lang.Object oh6vYeIP2 = ea1Var.oh6vYeIP(ea1Var.oh6vYeIP, ea1Var.AARZUJiTa);
            oh6vYeIP2.getClass();
            defpackage.gu0 gu0Var = (defpackage.gu0) oh6vYeIP2;
            if (!(t10Var.C0U8sNJm() && equals) && (ny0Var.xiZrDbcSW0 || !JlrlGoKF2.containsKey(ly0Var))) {
                JlrlGoKF2 = JlrlGoKF2.oh6vYeIP(ly0Var, r1MBDhnF2);
            } else if ((equals && !t10Var.PAEGRtP0bX) || !t10Var.PAEGRtP0bX) {
                JlrlGoKF2 = gu0Var;
            }
            if (t10Var.NHJTzaLwkd || gu0Var != JlrlGoKF2) {
                z = true;
                if (z && !t10Var.QPwENk36pDC) {
                    t10Var.wll2JLbTBC2(JlrlGoKF2);
                }
                k70Var.r1MBDhnF(t10Var.PAEGRtP0bX ? 1 : 0);
                t10Var.PAEGRtP0bX = z;
                t10Var.XZx205DYe = JlrlGoKF2;
                t10Var.QPwENk36pDC(202, 0, defpackage.dh.r1MBDhnF, JlrlGoKF2);
                k00Var.adDC3e2L(t10Var, java.lang.Integer.valueOf((i >> 3) & 14));
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
                t10Var.PAEGRtP0bX = k70Var.oh6vYeIP() != 0;
                t10Var.XZx205DYe = null;
                kd6TUFXn2 = t10Var.kd6TUFXn();
                if (kd6TUFXn2 == null) {
                    kd6TUFXn2.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, 3, ny0Var, k00Var);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            t10Var.wll2JLbTBC2(JlrlGoKF2);
        }
        k70Var.r1MBDhnF(t10Var.PAEGRtP0bX ? 1 : 0);
        t10Var.PAEGRtP0bX = z;
        t10Var.XZx205DYe = JlrlGoKF2;
        t10Var.QPwENk36pDC(202, 0, defpackage.dh.r1MBDhnF, JlrlGoKF2);
        k00Var.adDC3e2L(t10Var, java.lang.Integer.valueOf((i >> 3) & 14));
        t10Var.QoRHpC4k(false);
        t10Var.QoRHpC4k(false);
        t10Var.PAEGRtP0bX = k70Var.oh6vYeIP() != 0;
        t10Var.XZx205DYe = null;
        kd6TUFXn2 = t10Var.kd6TUFXn();
        if (kd6TUFXn2 == null) {
        }
    }

    public static final void p4kuH6PDtgom(java.util.List list) {
        if (list.size() >= 2) {
            return;
        }
        defpackage.db.fnWB2E7cs("colors must have length of at least 2 if colorStops is omitted.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r1MBDhnF(defpackage.ny0[] ny0VarArr, defpackage.k00 k00Var, defpackage.t10 t10Var, int i) {
        defpackage.gu0 d6FAb9xVJ8GU;
        boolean z;
        defpackage.az0 kd6TUFXn2;
        t10Var.QUKZkWRtw6(415205898);
        defpackage.k70 k70Var = t10Var.abhbClRa;
        defpackage.gu0 JlrlGoKF2 = t10Var.JlrlGoKF();
        t10Var.EoOhNTTfIN7K(201, defpackage.dh.oh6vYeIP);
        if (t10Var.QPwENk36pDC) {
            d6FAb9xVJ8GU = t10Var.d6FAb9xVJ8GU(JlrlGoKF2, defpackage.h1.lpprD5VAS(ny0VarArr, JlrlGoKF2, defpackage.gu0.EXtogiMhuM));
            t10Var.wll2JLbTBC2 = true;
        } else {
            defpackage.ea1 ea1Var = t10Var.SiPhmbmu;
            java.lang.Object EXtogiMhuM2 = ea1Var.EXtogiMhuM(ea1Var.AARZUJiTa, 0);
            EXtogiMhuM2.getClass();
            defpackage.gu0 gu0Var = (defpackage.gu0) EXtogiMhuM2;
            defpackage.ea1 ea1Var2 = t10Var.SiPhmbmu;
            java.lang.Object EXtogiMhuM3 = ea1Var2.EXtogiMhuM(ea1Var2.AARZUJiTa, 1);
            EXtogiMhuM3.getClass();
            defpackage.gu0 gu0Var2 = (defpackage.gu0) EXtogiMhuM3;
            defpackage.gu0 lpprD5VAS = defpackage.h1.lpprD5VAS(ny0VarArr, JlrlGoKF2, gu0Var2);
            if (t10Var.C0U8sNJm() && !t10Var.NHJTzaLwkd && gu0Var2.equals(lpprD5VAS)) {
                t10Var.JlrlGoKF = t10Var.SiPhmbmu.EgCjBq0SZwJ() + t10Var.JlrlGoKF;
                d6FAb9xVJ8GU = gu0Var;
            } else {
                d6FAb9xVJ8GU = t10Var.d6FAb9xVJ8GU(JlrlGoKF2, lpprD5VAS);
                if (t10Var.NHJTzaLwkd || !defpackage.x70.QoRHpC4k(d6FAb9xVJ8GU, gu0Var)) {
                    z = true;
                    if (z && !t10Var.QPwENk36pDC) {
                        t10Var.wll2JLbTBC2(d6FAb9xVJ8GU);
                    }
                    k70Var.r1MBDhnF(t10Var.PAEGRtP0bX ? 1 : 0);
                    t10Var.PAEGRtP0bX = z;
                    t10Var.XZx205DYe = d6FAb9xVJ8GU;
                    t10Var.QPwENk36pDC(202, 0, defpackage.dh.r1MBDhnF, d6FAb9xVJ8GU);
                    k00Var.adDC3e2L(t10Var, java.lang.Integer.valueOf((i >> 3) & 14));
                    t10Var.QoRHpC4k(false);
                    t10Var.QoRHpC4k(false);
                    t10Var.PAEGRtP0bX = k70Var.oh6vYeIP() != 0;
                    t10Var.XZx205DYe = null;
                    kd6TUFXn2 = t10Var.kd6TUFXn();
                    if (kd6TUFXn2 == null) {
                        kd6TUFXn2.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, 4, ny0VarArr, k00Var);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            t10Var.wll2JLbTBC2(d6FAb9xVJ8GU);
        }
        k70Var.r1MBDhnF(t10Var.PAEGRtP0bX ? 1 : 0);
        t10Var.PAEGRtP0bX = z;
        t10Var.XZx205DYe = d6FAb9xVJ8GU;
        t10Var.QPwENk36pDC(202, 0, defpackage.dh.r1MBDhnF, d6FAb9xVJ8GU);
        k00Var.adDC3e2L(t10Var, java.lang.Integer.valueOf((i >> 3) & 14));
        t10Var.QoRHpC4k(false);
        t10Var.QoRHpC4k(false);
        t10Var.PAEGRtP0bX = k70Var.oh6vYeIP() != 0;
        t10Var.XZx205DYe = null;
        kd6TUFXn2 = t10Var.kd6TUFXn();
        if (kd6TUFXn2 == null) {
        }
    }

    public static defpackage.hw riuEU0zW4(defpackage.hw hwVar, int i) {
        defpackage.t9 t9Var;
        if (i < 0 && i != -2 && i != -1) {
            defpackage.db.adDC3e2L(defpackage.fx0.SH1y5HwkJhh("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            t9Var = defpackage.t9.xiZrDbcSW0;
        } else {
            t9Var = defpackage.t9.adDC3e2L;
        }
        int i2 = i;
        defpackage.t9 t9Var2 = t9Var;
        return hwVar instanceof defpackage.w00 ? defpackage.w70.V7bD7b8KA((defpackage.w00) hwVar, null, i2, t9Var2, 1) : new defpackage.wb(hwVar, null, i2, t9Var2, 2);
    }

    public static final java.lang.Object v5iciZok(java.lang.Object obj) {
        return obj instanceof defpackage.bf ? defpackage.f70.riuEU0zW4(((defpackage.bf) obj).IHQe1A4L2xu) : obj;
    }

    public static void wll2JLbTBC2(java.io.ByteArrayOutputStream byteArrayOutputStream, int i) {
        yIx6ChFVk(byteArrayOutputStream, i, 2);
    }

    public static final void xiZrDbcSW0(java.lang.String str, defpackage.vz vzVar, defpackage.mj0 mj0Var, boolean z, java.lang.String str2, defpackage.t10 t10Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        java.lang.String str3;
        int i5;
        boolean z3;
        java.lang.String str4;
        vzVar.getClass();
        t10Var.QUKZkWRtw6(-845801796);
        if ((i & 6) == 0) {
            i3 = (t10Var.xiZrDbcSW0(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (t10Var.EXtogiMhuM(vzVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i6 |= t10Var.xiZrDbcSW0(mj0Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (t10Var.AARZUJiTa(z2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i5 = i4 | (t10Var.xiZrDbcSW0(str3) ? 16384 : 8192);
        }
        int i9 = 0;
        if (t10Var.lpprD5VAS(i5 & 1, (i5 & 9363) != 9362)) {
            if (i7 != 0) {
                z2 = true;
            }
            java.lang.String str5 = i8 != 0 ? null : str3;
            defpackage.b10 b10Var = (defpackage.b10) t10Var.SH1y5HwkJhh(defpackage.cv.IHQe1A4L2xu);
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(b10Var) | ((i5 & 112) == 32);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM2 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.xu0(b10Var, vzVar, i9);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.vz vzVar2 = (defpackage.vz) mAr5m2L7gYDP;
            defpackage.mj0 oh6vYeIP2 = defpackage.ba1.oh6vYeIP(mj0Var);
            defpackage.ok F7NU4MC0GW2 = defpackage.ci0.F7NU4MC0GW(10.0f, 10.0f);
            defpackage.ct0 ct0Var = defpackage.ea.IHQe1A4L2xu;
            defpackage.ly0 ly0Var = defpackage.he.IHQe1A4L2xu;
            long j = ((defpackage.fe) t10Var.SH1y5HwkJhh(ly0Var)).IHQe1A4L2xu;
            long j2 = defpackage.ae.xiZrDbcSW0;
            defpackage.fe feVar = (defpackage.fe) t10Var.SH1y5HwkJhh(ly0Var);
            defpackage.da daVar = feVar.RmCzwkUxICV;
            if (daVar == null) {
                long j3 = defpackage.ae.adDC3e2L;
                daVar = new defpackage.da(j3, defpackage.he.r1MBDhnF(feVar, defpackage.ci0.AARZUJiTa), j3, defpackage.ae.oh6vYeIP(defpackage.he.r1MBDhnF(feVar, defpackage.ci0.adDC3e2L), defpackage.ci0.xiZrDbcSW0));
                feVar.RmCzwkUxICV = daVar;
            }
            boolean z4 = z2;
            defpackage.x70.SH1y5HwkJhh(vzVar2, oh6vYeIP2, z4, F7NU4MC0GW2, daVar.IHQe1A4L2xu(j2, j, j2, j2), null, null, defpackage.h1.XZx205DYe(760699274, new defpackage.yu0(0, str, str5), t10Var), t10Var, ((i5 >> 3) & 896) | 805306368);
            z3 = z4;
            str4 = str5;
        } else {
            t10Var.WLpAkxCo();
            z3 = z2;
            str4 = str3;
        }
        defpackage.az0 kd6TUFXn2 = t10Var.kd6TUFXn();
        if (kd6TUFXn2 != null) {
            kd6TUFXn2.F7NU4MC0GW = new defpackage.zu0(str, vzVar, mj0Var, z3, str4, i, i2, 0);
        }
    }

    public static void yIx6ChFVk(java.io.ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }
}
