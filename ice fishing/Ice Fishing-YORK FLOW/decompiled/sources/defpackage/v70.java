package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class v70 {
    public static long ZpBGe2uQfcn8;
    public static java.lang.reflect.Method giKS3J6vZuNy;

    public static defpackage.fp0 BHfvd2J71qpO(defpackage.qu1 qu1Var) {
        defpackage.x70 x70Var = defpackage.gp0.ZpBGe2uQfcn8;
        defpackage.xm xmVar = defpackage.xm.giKS3J6vZuNy;
        x70Var.getClass();
        xmVar.getClass();
        defpackage.s81 s81Var = new defpackage.s81(qu1Var, x70Var, xmVar);
        defpackage.ne ZpBGe2uQfcn82 = defpackage.b41.ZpBGe2uQfcn8(defpackage.fp0.class);
        java.lang.String giKS3J6vZuNy2 = ZpBGe2uQfcn82.giKS3J6vZuNy();
        if (giKS3J6vZuNy2 != null) {
            return (defpackage.fp0) s81Var.WmetiUbpKU9I(ZpBGe2uQfcn82, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(giKS3J6vZuNy2));
        }
        defpackage.h7.w7APNrr0aGRc("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final long BXaznwstz2U0(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) * java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static void GE9mJIPrb8gP(java.lang.StringBuilder sb, java.lang.Object obj, defpackage.y10 y10Var) {
        if (y10Var != null) {
            sb.append((java.lang.CharSequence) y10Var.P05cfTpS5W5L(obj));
            return;
        }
        if (obj == null ? true : obj instanceof java.lang.CharSequence) {
            sb.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            sb.append(((java.lang.Character) obj).charValue());
        } else {
            sb.append((java.lang.CharSequence) obj.toString());
        }
    }

    public static final int IBvW5fLsPuHy(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static java.io.File IJ0hOnjhPOri(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            java.io.File file = new java.io.File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final defpackage.oa1 JhCgjQRTAOCT(defpackage.yd1 yd1Var, defpackage.va vaVar) {
        defpackage.an ZpBGe2uQfcn82 = yd1Var.ZpBGe2uQfcn8();
        defpackage.z20 z20Var = (defpackage.z20) yd1Var.JhCgjQRTAOCT;
        boolean z = ZpBGe2uQfcn82 == defpackage.an.WDYagTQQm9ns;
        return new defpackage.oa1(e6mdH7fiFuta(z20Var, z, true, vaVar), e6mdH7fiFuta(z20Var, z, false, vaVar), z);
    }

    public static final java.lang.Object Mearx7yMn90V(java.lang.Object[] objArr, defpackage.e81 e81Var, defpackage.n10 n10Var, defpackage.e30 e30Var, int i, int i2) {
        java.lang.Object[] objArr2;
        defpackage.e81 e81Var2;
        final java.lang.Object obj;
        java.lang.Object oh71FJcDz6S2;
        long j = e30Var.CZa7MwI9IzLd;
        defpackage.jr0.XntWc4eZSQ8j(36);
        final java.lang.String l = java.lang.Long.toString(j, 36);
        l.getClass();
        e81Var.getClass();
        final defpackage.k71 k71Var = (defpackage.k71) e30Var.GE9mJIPrb8gP(defpackage.m71.ZpBGe2uQfcn8);
        java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
        java.lang.Object obj2 = defpackage.cj.ZpBGe2uQfcn8;
        if (GcLuU6pT9wO9 == obj2) {
            java.lang.Object JhCgjQRTAOCT = (k71Var == null || (oh71FJcDz6S2 = k71Var.oh71FJcDz6S2(l)) == null) ? null : e81Var.JhCgjQRTAOCT(oh71FJcDz6S2);
            if (JhCgjQRTAOCT == null) {
                JhCgjQRTAOCT = n10Var.ZpBGe2uQfcn8();
            }
            objArr2 = objArr;
            e81Var2 = e81Var;
            java.lang.Object h71Var = new defpackage.h71(e81Var2, k71Var, l, JhCgjQRTAOCT, objArr2);
            e30Var.EgL5gQQnyJKX(h71Var);
            GcLuU6pT9wO9 = h71Var;
        } else {
            objArr2 = objArr;
            e81Var2 = e81Var;
        }
        final defpackage.h71 h71Var2 = (defpackage.h71) GcLuU6pT9wO9;
        java.lang.Object obj3 = java.util.Arrays.equals(objArr2, h71Var2.e6mdH7fiFuta) ? h71Var2.P05cfTpS5W5L : null;
        if (obj3 == null) {
            obj3 = n10Var.ZpBGe2uQfcn8();
        }
        boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(h71Var2) | ((((i & 112) ^ 48) > 32 && e30Var.P05cfTpS5W5L(e81Var2)) || (i & 48) == 32) | e30Var.P05cfTpS5W5L(k71Var) | e30Var.oh71FJcDz6S2(l) | e30Var.P05cfTpS5W5L(obj3) | e30Var.P05cfTpS5W5L(objArr2);
        java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
        if (P05cfTpS5W5L || GcLuU6pT9wO92 == obj2) {
            final java.lang.Object[] objArr3 = objArr2;
            obj = obj3;
            final defpackage.e81 e81Var3 = e81Var2;
            java.lang.Object obj4 = new defpackage.n10() { // from class: k41
                @Override // defpackage.n10
                public final java.lang.Object ZpBGe2uQfcn8() {
                    boolean z;
                    defpackage.h71 h71Var3 = defpackage.h71.this;
                    defpackage.k71 k71Var2 = h71Var3.oh71FJcDz6S2;
                    defpackage.k71 k71Var3 = k71Var;
                    boolean z2 = true;
                    if (k71Var2 != k71Var3) {
                        h71Var3.oh71FJcDz6S2 = k71Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    java.lang.String str = h71Var3.QiMR8OkAhezm;
                    java.lang.String str2 = l;
                    if (defpackage.ma0.QiMR8OkAhezm(str, str2)) {
                        z2 = z;
                    } else {
                        h71Var3.QiMR8OkAhezm = str2;
                    }
                    h71Var3.WDYagTQQm9ns = e81Var3;
                    h71Var3.P05cfTpS5W5L = obj;
                    h71Var3.e6mdH7fiFuta = objArr3;
                    defpackage.a7 a7Var = h71Var3.GE9mJIPrb8gP;
                    if (a7Var != null && z2) {
                        a7Var.VFeft99leXEK();
                        h71Var3.GE9mJIPrb8gP = null;
                        h71Var3.giKS3J6vZuNy();
                    }
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
            e30Var.EgL5gQQnyJKX(obj4);
            GcLuU6pT9wO92 = obj4;
        } else {
            obj = obj3;
        }
        defpackage.nq1.WmetiUbpKU9I((defpackage.n10) GcLuU6pT9wO92, e30Var);
        return obj;
    }

    public static void Ns0WNyEWdPsk(java.lang.String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        android.os.Trace.beginSection(str);
    }

    public static boolean OcTWLQzke1i2() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return defpackage.po1.ZpBGe2uQfcn8();
        }
        try {
            if (giKS3J6vZuNy == null) {
                ZpBGe2uQfcn8 = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                giKS3J6vZuNy = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) giKS3J6vZuNy.invoke(null, java.lang.Long.valueOf(ZpBGe2uQfcn8))).booleanValue();
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.lang.reflect.InvocationTargetException)) {
                android.util.Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static final void P05cfTpS5W5L(defpackage.yj1 yj1Var, android.content.Context context, final boolean z, final java.lang.String str, final long j) {
        if (defpackage.in1.fWTAfUmVKrZq(j) || str.length() == 0) {
            return;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        final android.content.Context context2 = context;
        java.util.List list = (java.util.List) defpackage.nq1.WmetiUbpKU9I.P05cfTpS5W5L(context2);
        if (list.isEmpty()) {
            return;
        }
        defpackage.sn0 sn0Var = yj1Var.ZpBGe2uQfcn8;
        defpackage.sn0 sn0Var2 = yj1Var.ZpBGe2uQfcn8;
        defpackage.lk1 lk1Var = defpackage.lk1.giKS3J6vZuNy;
        sn0Var.ZpBGe2uQfcn8(lk1Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) list.get(i);
            sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(new defpackage.h21(i), resolveInfo.loadLabel(packageManager).toString(), 0, new defpackage.y10() { // from class: i21
                @Override // defpackage.y10
                public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                    defpackage.nq1.s0TASMVLSWD5.Ns0WNyEWdPsk(context2, resolveInfo, java.lang.Boolean.valueOf(z), str, new defpackage.in1(j));
                    ((defpackage.mk1) obj).close();
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            }));
            i++;
            context2 = context;
        }
        sn0Var2.ZpBGe2uQfcn8(lk1Var);
    }

    public static final void QiMR8OkAhezm(defpackage.ci1 ci1Var, defpackage.c01 c01Var, long j) {
        defpackage.so soVar = (defpackage.so) ci1Var.oh71FJcDz6S2;
        soVar.getClass();
        defpackage.lt1 lt1Var = soVar.giKS3J6vZuNy;
        defpackage.lt1 lt1Var2 = soVar.ZpBGe2uQfcn8;
        boolean GE9mJIPrb8gP = defpackage.j80.GE9mJIPrb8gP(c01Var);
        long j2 = c01Var.giKS3J6vZuNy;
        if (GE9mJIPrb8gP) {
            defpackage.jn[] jnVarArr = lt1Var2.JhCgjQRTAOCT;
            defpackage.y7.I5Vdbaz9SDkL(0, jnVarArr.length, null, jnVarArr);
            lt1Var2.WDYagTQQm9ns = 0;
            defpackage.jn[] jnVarArr2 = lt1Var.JhCgjQRTAOCT;
            defpackage.y7.I5Vdbaz9SDkL(0, jnVarArr2.length, null, jnVarArr2);
            lt1Var.WDYagTQQm9ns = 0;
            soVar.fWTAfUmVKrZq = 0L;
        }
        if (!defpackage.j80.fNwYGHIYeJcR(c01Var)) {
            java.util.List list = c01Var.h3m55N1URyyK;
            if (list == null) {
                list = defpackage.av.WDYagTQQm9ns;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.g50 g50Var = (defpackage.g50) list.get(i);
                soVar.ZpBGe2uQfcn8(g50Var.ZpBGe2uQfcn8, defpackage.ws0.WDYagTQQm9ns(g50Var.WDYagTQQm9ns, j));
            }
            soVar.ZpBGe2uQfcn8(j2, defpackage.ws0.WDYagTQQm9ns(c01Var.gUjdnLbkVAaA, j));
        }
        if (defpackage.j80.fNwYGHIYeJcR(c01Var) && j2 - soVar.fWTAfUmVKrZq > 40) {
            defpackage.jn[] jnVarArr3 = lt1Var2.JhCgjQRTAOCT;
            defpackage.y7.I5Vdbaz9SDkL(0, jnVarArr3.length, null, jnVarArr3);
            lt1Var2.WDYagTQQm9ns = 0;
            defpackage.jn[] jnVarArr4 = lt1Var.JhCgjQRTAOCT;
            defpackage.y7.I5Vdbaz9SDkL(0, jnVarArr4.length, null, jnVarArr4);
            lt1Var.WDYagTQQm9ns = 0;
            soVar.fWTAfUmVKrZq = 0L;
        }
        soVar.fWTAfUmVKrZq = j2;
    }

    public static boolean T1fB7bDYiVJQ(java.io.File file, java.io.InputStream inputStream) {
        java.io.FileOutputStream fileOutputStream;
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.io.IOException e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (java.io.IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (java.io.IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException unused3) {
                }
            }
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static java.nio.MappedByteBuffer UmgHb6n58gfG(android.content.Context context, android.net.Uri uri) {
        android.os.ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (java.io.IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final defpackage.l6 VFeft99leXEK(defpackage.nm1 nm1Var, int i) {
        defpackage.l6 l6Var = nm1Var.ZpBGe2uQfcn8;
        defpackage.l6 l6Var2 = nm1Var.ZpBGe2uQfcn8;
        long j = nm1Var.giKS3J6vZuNy;
        int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(j);
        int WDYagTQQm9ns2 = defpackage.in1.WDYagTQQm9ns(j);
        int i2 = WDYagTQQm9ns2 + i;
        if (((i ^ i2) & (WDYagTQQm9ns2 ^ i2)) < 0) {
            i2 = l6Var2.oh71FJcDz6S2.length();
        }
        return l6Var.subSequence(WDYagTQQm9ns, java.lang.Math.min(i2, l6Var2.oh71FJcDz6S2.length()));
    }

    public static final float WDYagTQQm9ns(defpackage.qy0 qy0Var, boolean z, defpackage.o50[] o50VarArr, float f) {
        float f2 = Float.NaN;
        for (defpackage.o50 o50Var : o50VarArr) {
            float fWTAfUmVKrZq = qy0Var.fWTAfUmVKrZq(o50Var);
            if (!java.lang.Float.isNaN(f2)) {
                int i = z != (fWTAfUmVKrZq > f2) ? i + 1 : 0;
            }
            f2 = fWTAfUmVKrZq;
        }
        return java.lang.Float.isNaN(f2) ? f : f2;
    }

    public static final java.lang.String WmetiUbpKU9I(java.lang.Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final float XntWc4eZSQ8j(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final java.lang.Object ZVVdXbWmyCSK(defpackage.qk0 qk0Var) {
        java.lang.Object GE9mJIPrb8gP = qk0Var.GE9mJIPrb8gP();
        defpackage.wc0 wc0Var = GE9mJIPrb8gP instanceof defpackage.wc0 ? (defpackage.wc0) GE9mJIPrb8gP : null;
        if (wc0Var != null) {
            return wc0Var.BHfvd2J71qpO;
        }
        return null;
    }

    public static final void ZpBGe2uQfcn8(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j, final long j2, final long j3, final long j4, defpackage.vl0 vl0Var, defpackage.e30 e30Var, final int i) {
        defpackage.e30 e30Var2;
        final defpackage.vl0 vl0Var2;
        str2.getClass();
        e30Var.PS16moFv2oLu(-1145527699);
        int i2 = i | (e30Var.oh71FJcDz6S2(str) ? 4 : 2) | (e30Var.oh71FJcDz6S2(str2) ? 32 : 16) | (e30Var.oh71FJcDz6S2(str3) ? 256 : 128) | (e30Var.WDYagTQQm9ns(j) ? 2048 : 1024) | (e30Var.WDYagTQQm9ns(j2) ? 16384 : 8192) | (e30Var.WDYagTQQm9ns(j3) ? 131072 : 65536) | (e30Var.WDYagTQQm9ns(j4) ? 1048576 : 524288) | 12582912;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (4793491 & i2) != 4793490)) {
            defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.vl0 xahdJg25P1Bv = defpackage.nq1.xahdJg25P1Bv(defpackage.nn.fWTAfUmVKrZq(defpackage.nn.oh71FJcDz6S2(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), defpackage.j80.oCu53ZX2v4Ju(e30Var).fWTAfUmVKrZq), defpackage.j80.maCixPsq4ml2(e30Var).ZpBGe2uQfcn8, defpackage.j80.oCu53ZX2v4Ju(e30Var).fWTAfUmVKrZq), defpackage.pa1.WmetiUbpKU9I(defpackage.ma0.oCu53ZX2v4Ju(new defpackage.pf(j), new defpackage.pf(j2)))), 12.0f);
            defpackage.v61 ZpBGe2uQfcn82 = defpackage.u61.ZpBGe2uQfcn8(new defpackage.l7(12.0f, new defpackage.h7(0)), defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ, e30Var, 54);
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, xahdJg25P1Bv);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.h5 h5Var = defpackage.vi.oh71FJcDz6S2;
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, ZpBGe2uQfcn82);
            defpackage.h5 h5Var2 = defpackage.vi.WDYagTQQm9ns;
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            defpackage.h5 h5Var3 = defpackage.vi.QiMR8OkAhezm;
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var, valueOf);
            defpackage.n nVar = defpackage.vi.P05cfTpS5W5L;
            defpackage.t80.Mearx7yMn90V(e30Var, nVar);
            defpackage.h5 h5Var4 = defpackage.vi.JhCgjQRTAOCT;
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju);
            defpackage.vl0 JhCgjQRTAOCT = defpackage.nn.JhCgjQRTAOCT(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.oh71FJcDz6S2(40.0f), defpackage.j80.oCu53ZX2v4Ju(e30Var).fWTAfUmVKrZq), j3, defpackage.la0.blKFvluuDQOf);
            defpackage.vk0 JhCgjQRTAOCT2 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP, false);
            int hashCode2 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, JhCgjQRTAOCT);
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, JhCgjQRTAOCT2);
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR2);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode2, e30Var, h5Var3, e30Var, nVar);
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju2);
            defpackage.ym1.giKS3J6vZuNy(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var).P05cfTpS5W5L, e30Var, i2 & 14, 0, 131070);
            e30Var.XntWc4eZSQ8j(true);
            defpackage.zd0 zd0Var = new defpackage.zd0(1.0f, true);
            defpackage.gg ZpBGe2uQfcn83 = defpackage.eg.ZpBGe2uQfcn8(defpackage.vx1.giKS3J6vZuNy, defpackage.jVUAPb5NnIYW.s0TASMVLSWD5, e30Var, 0);
            int hashCode3 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR3 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju3 = defpackage.i61.oCu53ZX2v4Ju(e30Var, zd0Var);
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, ZpBGe2uQfcn83);
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR3);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode3, e30Var, h5Var3, e30Var, nVar);
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju3);
            defpackage.ym1.giKS3J6vZuNy(str2, defpackage.nq1.OVwOqzUGHcCU(sl0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), j4, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var).e6mdH7fiFuta, e30Var, ((i2 >> 3) & 14) | 48 | ((i2 >> 12) & 896), 0, 131064);
            defpackage.ym1.giKS3J6vZuNy(str3, null, defpackage.j80.maCixPsq4ml2(e30Var).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var).e6mdH7fiFuta, e30Var, (i2 >> 6) & 14, 0, 131066);
            e30Var2 = e30Var;
            e30Var2.XntWc4eZSQ8j(true);
            e30Var2.XntWc4eZSQ8j(true);
            vl0Var2 = sl0Var;
        } else {
            e30Var2 = e30Var;
            e30Var2.Jkfc0NcwyPL8();
            vl0Var2 = vl0Var;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20(str, str2, str3, j, j2, j3, j4, vl0Var2, i) { // from class: u70
                public final /* synthetic */ long GE9mJIPrb8gP;
                public final /* synthetic */ long Ns0WNyEWdPsk;
                public final /* synthetic */ long P05cfTpS5W5L;
                public final /* synthetic */ java.lang.String QiMR8OkAhezm;
                public final /* synthetic */ java.lang.String WDYagTQQm9ns;
                public final /* synthetic */ long e6mdH7fiFuta;
                public final /* synthetic */ defpackage.vl0 fNwYGHIYeJcR;
                public final /* synthetic */ java.lang.String oh71FJcDz6S2;

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(1);
                    defpackage.v70.ZpBGe2uQfcn8(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, (defpackage.e30) obj, IBvW5fLsPuHy);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static defpackage.ec1 blKFvluuDQOf(defpackage.c20 c20Var) {
        defpackage.ec1 ec1Var = new defpackage.ec1();
        ec1Var.QiMR8OkAhezm = defpackage.q70.T1fB7bDYiVJQ(ec1Var, ec1Var, c20Var);
        return ec1Var;
    }

    public static final boolean dG7RjM6DqYVL(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final defpackage.na1 e6mdH7fiFuta(defpackage.z20 z20Var, boolean z, boolean z2, defpackage.va vaVar) {
        long j;
        long oh71FJcDz6S2 = vaVar.oh71FJcDz6S2(z20Var, z2 ? z20Var.giKS3J6vZuNy : z20Var.fWTAfUmVKrZq);
        if (z ^ z2) {
            int i = defpackage.in1.fWTAfUmVKrZq;
            j = oh71FJcDz6S2 >> 32;
        } else {
            int i2 = defpackage.in1.fWTAfUmVKrZq;
            j = 4294967295L & oh71FJcDz6S2;
        }
        return z20Var.ZpBGe2uQfcn8((int) j);
    }

    public static final int fNwYGHIYeJcR(float f) {
        return java.lang.Math.round((float) java.lang.Math.ceil(f));
    }

    public static final void fWTAfUmVKrZq(defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-709502251);
        byte b = 0;
        if (e30Var.zJPqDeoF0Os1(i & 1, (i & 3) != 2)) {
            defpackage.ng1 ng1Var = defpackage.m71.ZpBGe2uQfcn8;
            defpackage.k71 k71Var = (defpackage.k71) e30Var.GE9mJIPrb8gP(ng1Var);
            defpackage.j71 frSwwKIlbUhK = defpackage.t80.frSwwKIlbUhK(e30Var);
            java.lang.Object[] objArr = {k71Var};
            defpackage.n80 n80Var = new defpackage.n80(29, new defpackage.b7(17, b), new defpackage.fWTAfUmVKrZq(20, k71Var, frSwwKIlbUhK));
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(k71Var) | e30Var.P05cfTpS5W5L(frSwwKIlbUhK);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.S0YpfprlOYIn(13, k71Var, frSwwKIlbUhK);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.wf0 wf0Var = (defpackage.wf0) jjTN4uUnoyEn(objArr, n80Var, (defpackage.n10) GcLuU6pT9wO9, e30Var, 0);
            defpackage.vx1.fWTAfUmVKrZq(ng1Var.ZpBGe2uQfcn8(wf0Var), defpackage.nn.OcTWLQzke1i2(-412824043, new defpackage.yh0(11, nhVar, wf0Var), e30Var), e30Var, 56);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.l2(i, 8, nhVar);
        }
    }

    public static boolean gUjdnLbkVAaA(java.io.File file, android.content.res.Resources resources, int i) {
        java.io.InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (java.lang.Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean T1fB7bDYiVJQ = T1fB7bDYiVJQ(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
            }
            return T1fB7bDYiVJQ;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final long giKS3J6vZuNy(int i) {
        long j = i << 32;
        int i2 = defpackage.ub0.zJPqDeoF0Os1;
        return j;
    }

    public static final defpackage.na1 h3m55N1URyyK(defpackage.na1 na1Var, defpackage.z20 z20Var, int i) {
        return new defpackage.na1(((defpackage.bn1) z20Var.WDYagTQQm9ns).ZpBGe2uQfcn8(i), i, na1Var.fWTAfUmVKrZq);
    }

    public static final java.lang.Object jjTN4uUnoyEn(java.lang.Object[] objArr, defpackage.e81 e81Var, defpackage.n10 n10Var, defpackage.e30 e30Var, int i) {
        return Mearx7yMn90V(java.util.Arrays.copyOf(objArr, objArr.length), e81Var, n10Var, e30Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final defpackage.l6 maCixPsq4ml2(defpackage.nm1 nm1Var) {
        defpackage.l6 l6Var = nm1Var.ZpBGe2uQfcn8;
        long j = nm1Var.giKS3J6vZuNy;
        l6Var.getClass();
        return l6Var.subSequence(defpackage.in1.oh71FJcDz6S2(j), defpackage.in1.WDYagTQQm9ns(j));
    }

    public static final defpackage.l6 oCu53ZX2v4Ju(defpackage.nm1 nm1Var, int i) {
        defpackage.l6 l6Var = nm1Var.ZpBGe2uQfcn8;
        long j = nm1Var.giKS3J6vZuNy;
        int oh71FJcDz6S2 = defpackage.in1.oh71FJcDz6S2(j);
        int i2 = oh71FJcDz6S2 - i;
        if (((oh71FJcDz6S2 ^ i2) & (i ^ oh71FJcDz6S2)) < 0) {
            i2 = 0;
        }
        return l6Var.subSequence(java.lang.Math.max(0, i2), defpackage.in1.oh71FJcDz6S2(j));
    }

    public static final defpackage.na1 oh71FJcDz6S2(final defpackage.yd1 yd1Var, final defpackage.z20 z20Var, defpackage.na1 na1Var) {
        int i = z20Var.fWTAfUmVKrZq;
        int i2 = z20Var.giKS3J6vZuNy;
        boolean z = yd1Var.giKS3J6vZuNy;
        final int i3 = z ? i2 : i;
        defpackage.bn1 bn1Var = (defpackage.bn1) z20Var.WDYagTQQm9ns;
        int i4 = z20Var.JhCgjQRTAOCT;
        defpackage.r20 r20Var = new defpackage.r20(i3, 1, z20Var);
        defpackage.yf0 yf0Var = defpackage.yf0.oh71FJcDz6S2;
        final defpackage.be0 oCu53ZX2v4Ju = defpackage.t80.oCu53ZX2v4Ju(yf0Var, r20Var);
        final int i5 = z ? i : i2;
        defpackage.be0 oCu53ZX2v4Ju2 = defpackage.t80.oCu53ZX2v4Ju(yf0Var, new defpackage.n10() { // from class: qa1
            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                defpackage.z20 z20Var2 = defpackage.z20.this;
                defpackage.bn1 bn1Var2 = (defpackage.bn1) z20Var2.WDYagTQQm9ns;
                int intValue = ((java.lang.Number) oCu53ZX2v4Ju.getValue()).intValue();
                defpackage.yd1 yd1Var2 = yd1Var;
                boolean z2 = yd1Var2.giKS3J6vZuNy;
                boolean z3 = yd1Var2.ZpBGe2uQfcn8() == defpackage.an.WDYagTQQm9ns;
                int i6 = i3;
                long e6mdH7fiFuta = bn1Var2.e6mdH7fiFuta(i6);
                defpackage.wm0 wm0Var = bn1Var2.giKS3J6vZuNy;
                int i7 = defpackage.in1.fWTAfUmVKrZq;
                int i8 = (int) (e6mdH7fiFuta >> 32);
                int JhCgjQRTAOCT = wm0Var.JhCgjQRTAOCT(i8);
                int i9 = wm0Var.oh71FJcDz6S2;
                if (JhCgjQRTAOCT != intValue) {
                    i8 = intValue >= i9 ? bn1Var2.oh71FJcDz6S2(i9 - 1) : bn1Var2.oh71FJcDz6S2(intValue);
                }
                int i10 = (int) (e6mdH7fiFuta & 4294967295L);
                if (wm0Var.JhCgjQRTAOCT(i10) != intValue) {
                    i10 = intValue >= i9 ? wm0Var.fWTAfUmVKrZq(i9 - 1, false) : wm0Var.fWTAfUmVKrZq(intValue, false);
                }
                int i11 = i5;
                if (i8 == i11) {
                    return z20Var2.ZpBGe2uQfcn8(i10);
                }
                if (i10 == i11) {
                    return z20Var2.ZpBGe2uQfcn8(i8);
                }
                if (!(z2 ^ z3) ? i6 >= i8 : i6 > i10) {
                    i8 = i10;
                }
                return z20Var2.ZpBGe2uQfcn8(i8);
            }
        });
        if (1 != na1Var.fWTAfUmVKrZq) {
            return (defpackage.na1) oCu53ZX2v4Ju2.getValue();
        }
        if (i3 == i4) {
            return na1Var;
        }
        if (((java.lang.Number) oCu53ZX2v4Ju.getValue()).intValue() != bn1Var.giKS3J6vZuNy.JhCgjQRTAOCT(i4)) {
            return (defpackage.na1) oCu53ZX2v4Ju2.getValue();
        }
        int i6 = na1Var.giKS3J6vZuNy;
        long e6mdH7fiFuta = bn1Var.e6mdH7fiFuta(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                defpackage.an anVar = defpackage.an.WDYagTQQm9ns;
                if (((z ? 1 : 0) ^ ((i2 < i ? defpackage.an.oh71FJcDz6S2 : i2 > i ? anVar : defpackage.an.QiMR8OkAhezm) != anVar ? 0 : 1)) == 0) {
                }
            }
            return z20Var.ZpBGe2uQfcn8(i3);
        }
        int i7 = defpackage.in1.fWTAfUmVKrZq;
        return (i6 == ((int) (e6mdH7fiFuta >> 32)) || i6 == ((int) (e6mdH7fiFuta & 4294967295L))) ? (defpackage.na1) oCu53ZX2v4Ju2.getValue() : z20Var.ZpBGe2uQfcn8(i3);
    }

    public static final void qjMheFZ0l9kA(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            defpackage.e80.ZpBGe2uQfcn8("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            java.lang.System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float XntWc4eZSQ8j = XntWc4eZSQ8j(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * XntWc4eZSQ8j);
                }
            }
            float sqrt = (float) java.lang.Math.sqrt(XntWc4eZSQ8j(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : XntWc4eZSQ8j(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float XntWc4eZSQ8j2 = XntWc4eZSQ8j(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    XntWc4eZSQ8j2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = XntWc4eZSQ8j2 / fArr11[i14];
        }
    }

    public static final long s0TASMVLSWD5(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final defpackage.mj0 w7APNrr0aGRc(defpackage.mj0 mj0Var) {
        defpackage.jd0 jd0Var = mj0Var.BHfvd2J71qpO.BHfvd2J71qpO;
        while (true) {
            defpackage.jd0 w7APNrr0aGRc = jd0Var.w7APNrr0aGRc();
            defpackage.jd0 jd0Var2 = null;
            if ((w7APNrr0aGRc != null ? w7APNrr0aGRc.fNwYGHIYeJcR : null) == null) {
                defpackage.mj0 Tw1MZxlLLWlb = jd0Var.IBvW5fLsPuHy.JhCgjQRTAOCT.Tw1MZxlLLWlb();
                Tw1MZxlLLWlb.getClass();
                return Tw1MZxlLLWlb;
            }
            defpackage.jd0 w7APNrr0aGRc2 = jd0Var.w7APNrr0aGRc();
            if (w7APNrr0aGRc2 != null) {
                jd0Var2 = w7APNrr0aGRc2.fNwYGHIYeJcR;
            }
            jd0Var2.getClass();
            defpackage.jd0 w7APNrr0aGRc3 = jd0Var.w7APNrr0aGRc();
            w7APNrr0aGRc3.getClass();
            jd0Var = w7APNrr0aGRc3.fNwYGHIYeJcR;
            jd0Var.getClass();
        }
    }

    public abstract void KrtOTfE6jiS2(boolean z);

    public void frSwwKIlbUhK(boolean z) {
    }
}
