package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class jr0 {
    public static final defpackage.ru JhCgjQRTAOCT;
    public static final defpackage.ru QiMR8OkAhezm;
    public static final defpackage.ru WDYagTQQm9ns;
    public static final defpackage.ru fWTAfUmVKrZq;
    public static final defpackage.ru oh71FJcDz6S2;
    public static final defpackage.nh ZpBGe2uQfcn8 = new defpackage.nh(-32124039, false, new defpackage.b7(10, 0));
    public static final defpackage.kp giKS3J6vZuNy = new defpackage.kp(1.0f, 1.0f);
    public static final defpackage.uu P05cfTpS5W5L = new defpackage.uu(false);
    public static final defpackage.uu e6mdH7fiFuta = new defpackage.uu(true);
    public static final defpackage.rb0[] GE9mJIPrb8gP = new defpackage.rb0[0];
    public static final defpackage.n80 Ns0WNyEWdPsk = new defpackage.n80(29, new defpackage.b7(22, 0), new defpackage.lp0(12));
    public static final defpackage.zn1 fNwYGHIYeJcR = new defpackage.zn1(0, new long[0], new java.lang.Object[0]);

    static {
        int i = 1;
        fWTAfUmVKrZq = new defpackage.ru("COMPLETING_ALREADY", i);
        JhCgjQRTAOCT = new defpackage.ru("COMPLETING_WAITING_CHILDREN", i);
        WDYagTQQm9ns = new defpackage.ru("COMPLETING_RETRY", i);
        oh71FJcDz6S2 = new defpackage.ru("TOO_LATE_TO_CANCEL", i);
        QiMR8OkAhezm = new defpackage.ru("SEALED", i);
    }

    public static byte[] BHfvd2J71qpO(byte[] bArr) {
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

    public static final defpackage.ZVVdXbWmyCSK BXaznwstz2U0(java.lang.Object[] objArr) {
        return new defpackage.ZVVdXbWmyCSK(objArr);
    }

    public static final defpackage.fv CZa7MwI9IzLd(defpackage.jp1 jp1Var, defpackage.y10 y10Var, java.lang.Object obj, defpackage.e30 e30Var) {
        e30Var.Fu5WBEia9jBo(-422486745, 0, jp1Var, null);
        boolean QiMR8OkAhezm2 = jp1Var.QiMR8OkAhezm();
        defpackage.ti tiVar = jp1Var.ZpBGe2uQfcn8;
        defpackage.fv fvVar = defpackage.fv.WDYagTQQm9ns;
        defpackage.fv fvVar2 = defpackage.fv.QiMR8OkAhezm;
        defpackage.fv fvVar3 = defpackage.fv.oh71FJcDz6S2;
        if (QiMR8OkAhezm2) {
            e30Var.NkfcFfdaVTox(-212166497);
            e30Var.XntWc4eZSQ8j(false);
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(obj)).booleanValue()) {
                fvVar = fvVar3;
            } else if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(tiVar.oh71FJcDz6S2())).booleanValue()) {
                fvVar = fvVar2;
            }
        } else {
            e30Var.NkfcFfdaVTox(-211892364);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO9;
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(tiVar.oh71FJcDz6S2())).booleanValue()) {
                fo0Var.setValue(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(obj)).booleanValue()) {
                fvVar = fvVar3;
            } else if (((java.lang.Boolean) fo0Var.getValue()).booleanValue()) {
                fvVar = fvVar2;
            }
            e30Var.XntWc4eZSQ8j(false);
        }
        e30Var.XntWc4eZSQ8j(false);
        return fvVar;
    }

    public static final defpackage.vl0 EPEWHACkMcF1(defpackage.vl0 vl0Var, defpackage.pd1 pd1Var, defpackage.xl1 xl1Var, defpackage.yl1 yl1Var, defpackage.vl vlVar) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.ok1(pd1Var, xl1Var, yl1Var, vlVar));
    }

    public static final java.lang.Object Fu5WBEia9jBo(defpackage.nz nzVar, int i, defpackage.y10 y10Var) {
        int i2;
        int i3;
        java.lang.Object obj;
        defpackage.ul0 ul0Var;
        defpackage.ie0 KN4muQto0Nd5;
        int size;
        int i4;
        defpackage.or0 or0Var;
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
        }
        defpackage.ul0 ul0Var2 = nzVar.WDYagTQQm9ns.e6mdH7fiFuta;
        defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(nzVar);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (UmgHb6n58gfG == null) {
                ul0Var = null;
                break;
            }
            if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 1024) != 0) {
                while (ul0Var2 != null) {
                    if ((ul0Var2.QiMR8OkAhezm & 1024) != 0) {
                        ul0Var = ul0Var2;
                        defpackage.ho0 ho0Var = null;
                        while (ul0Var != null) {
                            if (ul0Var instanceof defpackage.nz) {
                                break loop0;
                            }
                            if ((ul0Var.QiMR8OkAhezm & 1024) != 0 && (ul0Var instanceof defpackage.xo)) {
                                int i5 = 0;
                                for (defpackage.ul0 ul0Var3 = ((defpackage.xo) ul0Var).ZVVdXbWmyCSK; ul0Var3 != null; ul0Var3 = ul0Var3.GE9mJIPrb8gP) {
                                    if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            ul0Var = ul0Var3;
                                        } else {
                                            if (ho0Var == null) {
                                                ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var != null) {
                                                ho0Var.giKS3J6vZuNy(ul0Var);
                                                ul0Var = null;
                                            }
                                            ho0Var.giKS3J6vZuNy(ul0Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            ul0Var = defpackage.la0.P05cfTpS5W5L(ho0Var);
                        }
                    }
                    ul0Var2 = ul0Var2.e6mdH7fiFuta;
                }
            }
            UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
            ul0Var2 = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
        }
        defpackage.nz nzVar2 = (defpackage.nz) ul0Var;
        if ((nzVar2 == null || !defpackage.ma0.QiMR8OkAhezm(nzVar2.KN4muQto0Nd5(), nzVar.KN4muQto0Nd5())) && (KN4muQto0Nd5 = nzVar.KN4muQto0Nd5()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                defpackage.h7.P05cfTpS5W5L("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (KN4muQto0Nd5.BHfvd2J71qpO.ZpBGe2uQfcn8.QiMR8OkAhezm().gUjdnLbkVAaA <= 0 || KN4muQto0Nd5.BHfvd2J71qpO.ZpBGe2uQfcn8.QiMR8OkAhezm().Ns0WNyEWdPsk.isEmpty() || !KN4muQto0Nd5.s0TASMVLSWD5) {
                return y10Var.P05cfTpS5W5L(defpackage.ie0.maCixPsq4ml2);
            }
            boolean xbkEJUK1coRZ = KN4muQto0Nd5.xbkEJUK1coRZ(i6);
            defpackage.gf0 gf0Var = KN4muQto0Nd5.BHfvd2J71qpO;
            int min = xbkEJUK1coRZ ? java.lang.Math.min(gf0Var.ZpBGe2uQfcn8.QiMR8OkAhezm().gUjdnLbkVAaA - 1, ((defpackage.pf0) defpackage.hf.EgL5gQQnyJKX(gf0Var.ZpBGe2uQfcn8.QiMR8OkAhezm().Ns0WNyEWdPsk)).ZpBGe2uQfcn8) : java.lang.Math.max(0, ((defpackage.mw0) gf0Var.ZpBGe2uQfcn8.WDYagTQQm9ns.giKS3J6vZuNy).P05cfTpS5W5L());
            defpackage.z31 z31Var = new defpackage.z31();
            defpackage.gb gbVar = KN4muQto0Nd5.ZVVdXbWmyCSK;
            gbVar.getClass();
            defpackage.ee0 ee0Var = new defpackage.ee0(min, min);
            gbVar.ZpBGe2uQfcn8.giKS3J6vZuNy(ee0Var);
            z31Var.WDYagTQQm9ns = ee0Var;
            defpackage.tf0 tf0Var = KN4muQto0Nd5.BHfvd2J71qpO.ZpBGe2uQfcn8;
            if (tf0Var.QiMR8OkAhezm().Ns0WNyEWdPsk.isEmpty()) {
                i3 = 0;
            } else {
                defpackage.of0 QiMR8OkAhezm2 = tf0Var.QiMR8OkAhezm();
                int QiMR8OkAhezm3 = (int) (QiMR8OkAhezm2.T1fB7bDYiVJQ == defpackage.fv0.WDYagTQQm9ns ? QiMR8OkAhezm2.QiMR8OkAhezm() & 4294967295L : QiMR8OkAhezm2.QiMR8OkAhezm() >> 32);
                defpackage.of0 QiMR8OkAhezm4 = tf0Var.QiMR8OkAhezm();
                java.util.List list = QiMR8OkAhezm4.Ns0WNyEWdPsk;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((defpackage.pf0) list.get(i8)).Ns0WNyEWdPsk;
                    }
                    size = (i7 / list.size()) + QiMR8OkAhezm4.WmetiUbpKU9I;
                }
                if (size != 0 && (i4 = QiMR8OkAhezm3 / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = KN4muQto0Nd5.BHfvd2J71qpO.ZpBGe2uQfcn8.QiMR8OkAhezm().gUjdnLbkVAaA;
            if (i9 > i10) {
                i9 = i10;
            }
            while (obj == null && KN4muQto0Nd5.YZh1E3mnTFwf((defpackage.ee0) z31Var.WDYagTQQm9ns, i6) && i2 < i9) {
                defpackage.ee0 ee0Var2 = (defpackage.ee0) z31Var.WDYagTQQm9ns;
                int i11 = ee0Var2.ZpBGe2uQfcn8;
                int i12 = ee0Var2.giKS3J6vZuNy;
                if (KN4muQto0Nd5.xbkEJUK1coRZ(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                defpackage.gb gbVar2 = KN4muQto0Nd5.ZVVdXbWmyCSK;
                gbVar2.getClass();
                defpackage.ee0 ee0Var3 = new defpackage.ee0(i11, i12);
                gbVar2.ZpBGe2uQfcn8.giKS3J6vZuNy(ee0Var3);
                KN4muQto0Nd5.ZVVdXbWmyCSK.ZpBGe2uQfcn8.GE9mJIPrb8gP((defpackage.ee0) z31Var.WDYagTQQm9ns);
                z31Var.WDYagTQQm9ns = ee0Var3;
                i2++;
                defpackage.la0.UmgHb6n58gfG(KN4muQto0Nd5).Ns0WNyEWdPsk();
                obj = y10Var.P05cfTpS5W5L(new defpackage.he0(KN4muQto0Nd5, z31Var, i6));
            }
            KN4muQto0Nd5.ZVVdXbWmyCSK.ZpBGe2uQfcn8.GE9mJIPrb8gP((defpackage.ee0) z31Var.WDYagTQQm9ns);
            defpackage.la0.UmgHb6n58gfG(KN4muQto0Nd5).Ns0WNyEWdPsk();
            return obj;
        }
        return null;
    }

    public static final boolean GE9mJIPrb8gP(defpackage.bn1 bn1Var, int i) {
        defpackage.wm0 wm0Var = bn1Var.giKS3J6vZuNy;
        int JhCgjQRTAOCT2 = wm0Var.JhCgjQRTAOCT(i);
        return i == bn1Var.oh71FJcDz6S2(JhCgjQRTAOCT2) || i == wm0Var.fWTAfUmVKrZq(JhCgjQRTAOCT2, false) ? bn1Var.QiMR8OkAhezm(i) != bn1Var.ZpBGe2uQfcn8(i) : bn1Var.ZpBGe2uQfcn8(i) != bn1Var.ZpBGe2uQfcn8(i - 1);
    }

    public static final void GcLuU6pT9wO9(defpackage.qk0 qk0Var, defpackage.ry ryVar, long j, defpackage.y10 y10Var) {
        if (defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var)) != 0.0f) {
            ryVar.getClass();
            qk0Var.FhgBoOud6zyW(qk0Var.Jkfc0NcwyPL8(Integer.MAX_VALUE));
            return;
        }
        defpackage.n70.s0TASMVLSWD5(qk0Var);
        defpackage.ry0 WDYagTQQm9ns2 = qk0Var.WDYagTQQm9ns(j);
        y10Var.P05cfTpS5W5L(WDYagTQQm9ns2);
        ryVar.getClass();
        WDYagTQQm9ns2.m6iZQUu7XjoL();
        WDYagTQQm9ns2.Rl68HURFBtL3();
    }

    public static final boolean IBvW5fLsPuHy(int i) {
        int type;
        return (!KrtOTfE6jiS2(i) || (type = java.lang.Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int IJ0hOnjhPOri(android.view.View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        java.lang.Object obj = null;
        while (view != null) {
            java.lang.Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
            view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
        }
        return i3;
    }

    public static final void JhCgjQRTAOCT(final defpackage.vl0 vl0Var, final defpackage.k7 k7Var, final defpackage.m7 m7Var, defpackage.da daVar, int i, int i2, defpackage.e30 e30Var, final int i3) {
        final defpackage.da daVar2;
        final int i4;
        final int i5;
        e30Var.PS16moFv2oLu(-1303174015);
        int i6 = i3 | 224256;
        if (e30Var.zJPqDeoF0Os1(i6 & 1, (599187 & i6) != 599186)) {
            defpackage.da daVar3 = defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ;
            fWTAfUmVKrZq(vl0Var, k7Var, m7Var, defpackage.jVUAPb5NnIYW.hH0RRJrNssvh, e30Var, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            daVar2 = daVar3;
        } else {
            e30Var.Jkfc0NcwyPL8();
            daVar2 = daVar;
            i4 = i;
            i5 = i2;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20(k7Var, m7Var, daVar2, i4, i5, i3) { // from class: my
                public final /* synthetic */ int GE9mJIPrb8gP;
                public final /* synthetic */ defpackage.da P05cfTpS5W5L;
                public final /* synthetic */ defpackage.m7 QiMR8OkAhezm;
                public final /* synthetic */ int e6mdH7fiFuta;
                public final /* synthetic */ defpackage.k7 oh71FJcDz6S2;

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(1573303);
                    defpackage.jr0.JhCgjQRTAOCT(defpackage.vl0.this, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, (defpackage.e30) obj, IBvW5fLsPuHy);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static long Jkfc0NcwyPL8(java.io.InputStream inputStream, int i) {
        byte[] Wc0TdmRSwbbi = Wc0TdmRSwbbi(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (Wc0TdmRSwbbi[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final boolean KrtOTfE6jiS2(int i) {
        return java.lang.Character.isWhitespace(i) || i == 160;
    }

    public static final boolean Mearx7yMn90V(int i) {
        int type = java.lang.Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static void NkfcFfdaVTox(java.io.ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long Ns0WNyEWdPsk(android.graphics.PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L);
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
    public static byte[] OVwOqzUGHcCU(java.io.FileInputStream fileInputStream, int i, int i2) {
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

    public static final int OcTWLQzke1i2(defpackage.wm0 wm0Var, long j, defpackage.cu1 cu1Var) {
        float oh71FJcDz6S22 = cu1Var != null ? cu1Var.oh71FJcDz6S2() : 0.0f;
        int i = (int) (4294967295L & j);
        int WDYagTQQm9ns2 = wm0Var.WDYagTQQm9ns(java.lang.Float.intBitsToFloat(i));
        if (java.lang.Float.intBitsToFloat(i) < wm0Var.oh71FJcDz6S2(WDYagTQQm9ns2) - oh71FJcDz6S22 || java.lang.Float.intBitsToFloat(i) > wm0Var.giKS3J6vZuNy(WDYagTQQm9ns2) + oh71FJcDz6S22) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i2) < (-oh71FJcDz6S22) || java.lang.Float.intBitsToFloat(i2) > wm0Var.JhCgjQRTAOCT + oh71FJcDz6S22) {
            return -1;
        }
        return WDYagTQQm9ns2;
    }

    public static final int P05cfTpS5W5L(defpackage.hg0 hg0Var, long j, defpackage.cu1 cu1Var) {
        long maCixPsq4ml2;
        int OcTWLQzke1i2;
        defpackage.cn1 JhCgjQRTAOCT2 = hg0Var.JhCgjQRTAOCT();
        if (JhCgjQRTAOCT2 != null) {
            defpackage.wm0 wm0Var = JhCgjQRTAOCT2.ZpBGe2uQfcn8.giKS3J6vZuNy;
            defpackage.rc0 fWTAfUmVKrZq2 = hg0Var.fWTAfUmVKrZq();
            if (fWTAfUmVKrZq2 != null && (OcTWLQzke1i2 = OcTWLQzke1i2(wm0Var, (maCixPsq4ml2 = fWTAfUmVKrZq2.maCixPsq4ml2(j)), cu1Var)) != -1) {
                return wm0Var.QiMR8OkAhezm(defpackage.ws0.ZpBGe2uQfcn8(maCixPsq4ml2, (wm0Var.giKS3J6vZuNy(OcTWLQzke1i2) + wm0Var.oh71FJcDz6S2(OcTWLQzke1i2)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static void PS16moFv2oLu(java.io.ByteArrayOutputStream byteArrayOutputStream, int i) {
        NkfcFfdaVTox(byteArrayOutputStream, i, 2);
    }

    public static final defpackage.j2 QiMR8OkAhezm() {
        return new defpackage.j2(new android.graphics.Paint(7));
    }

    public static final defpackage.rb0 UmgHb6n58gfG(defpackage.rb0 rb0Var) {
        return rb0Var.giKS3J6vZuNy().oh71FJcDz6S2() ? rb0Var : new defpackage.ks0(rb0Var);
    }

    public static final android.view.View VFeft99leXEK(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = java.lang.Math.min(IJ0hOnjhPOri(view, com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner), IJ0hOnjhPOri(view, com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner));
        android.view.View view2 = view;
        int i = 0;
        android.view.View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof android.view.ViewGroup)) {
                    return view2;
                }
            } else if (dG7RjM6DqYVL(view) == null) {
                i++;
                java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
                android.view.View view4 = view2;
                view2 = view;
                view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final void WDYagTQQm9ns(defpackage.x20 x20Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(275184941);
        int i2 = i | 2;
        boolean z = false;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                defpackage.ru1 ZpBGe2uQfcn82 = defpackage.mi0.ZpBGe2uQfcn8(e30Var);
                if (ZpBGe2uQfcn82 == null) {
                    defpackage.h7.P05cfTpS5W5L("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                x20Var = (defpackage.x20) defpackage.vx1.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(defpackage.x20.class), ZpBGe2uQfcn82.WDYagTQQm9ns(), ZVVdXbWmyCSK(ZpBGe2uQfcn82), defpackage.fc0.ZpBGe2uQfcn8(e30Var));
            } else {
                e30Var.Jkfc0NcwyPL8();
            }
            e30Var.WmetiUbpKU9I();
            defpackage.fo0 fNwYGHIYeJcR2 = defpackage.w60.fNwYGHIYeJcR(x20Var.fWTAfUmVKrZq, e30Var);
            if (((defpackage.w20) fNwYGHIYeJcR2.getValue()).fWTAfUmVKrZq == defpackage.v20.WDYagTQQm9ns && ((defpackage.w20) fNwYGHIYeJcR2.getValue()).giKS3J6vZuNy == defpackage.u20.oh71FJcDz6S2) {
                z = true;
            }
            defpackage.t80.fWTAfUmVKrZq(null, defpackage.nn.OcTWLQzke1i2(149052118, new defpackage.lw(x20Var, fNwYGHIYeJcR2, z), e30Var), e30Var, 48);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.l2(i, 6, x20Var);
        }
    }

    public static byte[] Wc0TdmRSwbbi(java.io.InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                defpackage.h7.P05cfTpS5W5L(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static defpackage.vl0 WmetiUbpKU9I(defpackage.vl0 vl0Var, defpackage.in0 in0Var, defpackage.c61 c61Var, boolean z, defpackage.n10 n10Var) {
        defpackage.vl0 gUjdnLbkVAaA;
        if (c61Var != null) {
            gUjdnLbkVAaA = new defpackage.te(in0Var, c61Var, false, z, null, n10Var);
        } else if (c61Var == null) {
            gUjdnLbkVAaA = new defpackage.te(in0Var, null, false, z, null, n10Var);
        } else if (in0Var != null) {
            defpackage.sj sjVar = defpackage.z60.ZpBGe2uQfcn8;
            gUjdnLbkVAaA = new defpackage.a70(in0Var, c61Var).fWTAfUmVKrZq(new defpackage.te(in0Var, null, false, z, null, n10Var));
        } else {
            gUjdnLbkVAaA = defpackage.i61.gUjdnLbkVAaA(defpackage.sl0.ZpBGe2uQfcn8, new defpackage.ue(c61Var, z, n10Var));
        }
        return vl0Var.fWTAfUmVKrZq(gUjdnLbkVAaA);
    }

    public static void XntWc4eZSQ8j(int i) {
        if (2 > i || i >= 37) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "radix ", " was not in valid range ");
            h3m55N1URyyK.append(new defpackage.p90(2, 36, 1));
            throw new java.lang.IllegalArgumentException(h3m55N1URyyK.toString());
        }
    }

    public static final defpackage.ym ZVVdXbWmyCSK(defpackage.ru1 ru1Var) {
        return ru1Var instanceof defpackage.y40 ? ((defpackage.y40) ru1Var).JhCgjQRTAOCT() : defpackage.xm.giKS3J6vZuNy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ZpBGe2uQfcn8(defpackage.jp1 jp1Var, defpackage.y10 y10Var, defpackage.vl0 vl0Var, defpackage.ov ovVar, defpackage.ew ewVar, defpackage.c20 c20Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        defpackage.nh nhVar2;
        defpackage.ti tiVar;
        defpackage.ov ovVar2;
        boolean oh71FJcDz6S22;
        java.lang.Object GcLuU6pT9wO9;
        defpackage.ew ewVar2;
        boolean oh71FJcDz6S23;
        java.lang.Object GcLuU6pT9wO92;
        java.lang.Object GcLuU6pT9wO93;
        defpackage.fo0 fo0Var;
        boolean P05cfTpS5W5L2;
        java.lang.Object GcLuU6pT9wO94;
        java.lang.Object oh71FJcDz6S24;
        defpackage.fv fvVar;
        boolean z;
        java.lang.Object GcLuU6pT9wO95;
        java.lang.Object GcLuU6pT9wO96;
        defpackage.kp1 kp1Var;
        defpackage.kp1 kp1Var2;
        java.lang.Object obj;
        boolean z2;
        defpackage.ep1 ep1Var;
        boolean P05cfTpS5W5L3;
        java.lang.Object GcLuU6pT9wO97;
        defpackage.ov ovVar3;
        defpackage.ew ewVar3;
        boolean QiMR8OkAhezm2;
        java.lang.Object GcLuU6pT9wO98;
        java.lang.Object GcLuU6pT9wO99;
        boolean z3;
        e30Var.PS16moFv2oLu(1912839215);
        int i2 = i | (e30Var.oh71FJcDz6S2(jp1Var) ? 4 : 2) | (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | (e30Var.oh71FJcDz6S2(vl0Var) ? 256 : 128) | (e30Var.oh71FJcDz6S2(ovVar) ? 2048 : 1024) | (e30Var.oh71FJcDz6S2(ewVar) ? 16384 : 8192) | (e30Var.P05cfTpS5W5L(c20Var) ? 131072 : 65536) | 1572864;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (4793491 & i2) != 4793490)) {
            defpackage.pw0 pw0Var = jp1Var.JhCgjQRTAOCT;
            defpackage.ti tiVar2 = jp1Var.ZpBGe2uQfcn8;
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(pw0Var.getValue())).booleanValue() || ((java.lang.Boolean) y10Var.P05cfTpS5W5L(tiVar2.oh71FJcDz6S2())).booleanValue() || jp1Var.QiMR8OkAhezm() || jp1Var.JhCgjQRTAOCT()) {
                e30Var.NkfcFfdaVTox(-232386135);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z4 = ((i5 ^ 6) > 4 && e30Var.oh71FJcDz6S2(jp1Var)) || (i4 & 6) == 4;
                java.lang.Object GcLuU6pT9wO910 = e30Var.GcLuU6pT9wO9();
                java.lang.Object obj2 = defpackage.cj.ZpBGe2uQfcn8;
                if (z4 || GcLuU6pT9wO910 == obj2) {
                    GcLuU6pT9wO910 = tiVar2.oh71FJcDz6S2();
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO910);
                }
                if (jp1Var.QiMR8OkAhezm()) {
                    GcLuU6pT9wO910 = tiVar2.oh71FJcDz6S2();
                }
                e30Var.NkfcFfdaVTox(1844425648);
                defpackage.fv CZa7MwI9IzLd = CZa7MwI9IzLd(jp1Var, y10Var, GcLuU6pT9wO910, e30Var);
                e30Var.XntWc4eZSQ8j(false);
                java.lang.Object value = jp1Var.JhCgjQRTAOCT.getValue();
                e30Var.NkfcFfdaVTox(1844425648);
                defpackage.fv CZa7MwI9IzLd2 = CZa7MwI9IzLd(jp1Var, y10Var, value, e30Var);
                e30Var.XntWc4eZSQ8j(false);
                int i6 = i5 | 3072;
                int i7 = (i6 & 14) ^ 6;
                boolean z5 = (i7 > 4 && e30Var.oh71FJcDz6S2(jp1Var)) || (i6 & 6) == 4;
                java.lang.Object GcLuU6pT9wO911 = e30Var.GcLuU6pT9wO9();
                if (z5 || GcLuU6pT9wO911 == obj2) {
                    GcLuU6pT9wO911 = new defpackage.jp1(new defpackage.go0(CZa7MwI9IzLd), jp1Var, jp1Var.fWTAfUmVKrZq.concat(" > EnterExitTransition"));
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO911);
                }
                defpackage.jp1 jp1Var2 = (defpackage.jp1) GcLuU6pT9wO911;
                boolean oh71FJcDz6S25 = ((i7 > 4 && e30Var.oh71FJcDz6S2(jp1Var)) || (i6 & 6) == 4) | e30Var.oh71FJcDz6S2(jp1Var2);
                java.lang.Object GcLuU6pT9wO912 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S25 || GcLuU6pT9wO912 == obj2) {
                    GcLuU6pT9wO912 = new defpackage.m91(7, jp1Var, jp1Var2);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO912);
                }
                defpackage.nq1.oh71FJcDz6S2(jp1Var2, (defpackage.y10) GcLuU6pT9wO912, e30Var);
                if (jp1Var.QiMR8OkAhezm()) {
                    jp1Var2.Ns0WNyEWdPsk(CZa7MwI9IzLd, CZa7MwI9IzLd2);
                } else {
                    jp1Var2.XntWc4eZSQ8j(CZa7MwI9IzLd2);
                    jp1Var2.Ns0WNyEWdPsk.setValue(java.lang.Boolean.FALSE);
                }
                defpackage.lq1 lq1Var = defpackage.kv.ZpBGe2uQfcn8;
                boolean oh71FJcDz6S26 = e30Var.oh71FJcDz6S2(jp1Var2);
                java.lang.Object GcLuU6pT9wO913 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S26 || GcLuU6pT9wO913 == obj2) {
                    GcLuU6pT9wO913 = defpackage.w60.hH0RRJrNssvh(ovVar);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO913);
                }
                defpackage.fo0 fo0Var2 = (defpackage.fo0) GcLuU6pT9wO913;
                defpackage.ti tiVar3 = jp1Var2.ZpBGe2uQfcn8;
                defpackage.ti tiVar4 = jp1Var2.ZpBGe2uQfcn8;
                defpackage.pw0 pw0Var2 = jp1Var2.JhCgjQRTAOCT;
                java.lang.Object oh71FJcDz6S27 = tiVar3.oh71FJcDz6S2();
                java.lang.Object value2 = pw0Var2.getValue();
                defpackage.fv fvVar2 = defpackage.fv.oh71FJcDz6S2;
                if (oh71FJcDz6S27 == value2 && tiVar4.oh71FJcDz6S2() == fvVar2) {
                    if (jp1Var2.QiMR8OkAhezm()) {
                        fo0Var2.setValue(ovVar);
                    } else {
                        fo0Var2.setValue(defpackage.ov.giKS3J6vZuNy);
                    }
                } else if (pw0Var2.getValue() == fvVar2) {
                    defpackage.kp1 kp1Var3 = ((defpackage.ov) fo0Var2.getValue()).ZpBGe2uQfcn8;
                    defpackage.kp1 kp1Var4 = ovVar.ZpBGe2uQfcn8;
                    defpackage.vw vwVar = kp1Var4.ZpBGe2uQfcn8;
                    if (vwVar == null) {
                        vwVar = kp1Var3.ZpBGe2uQfcn8;
                    }
                    java.util.Map map = kp1Var3.fWTAfUmVKrZq;
                    java.util.Map map2 = kp1Var4.fWTAfUmVKrZq;
                    map.getClass();
                    map2.getClass();
                    tiVar = tiVar4;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
                    linkedHashMap.putAll(map2);
                    fo0Var2.setValue(new defpackage.ov(new defpackage.kp1(vwVar, (defpackage.q70) null, linkedHashMap, 32)));
                    ovVar2 = (defpackage.ov) fo0Var2.getValue();
                    oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(jp1Var2);
                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                    if (!oh71FJcDz6S22 || GcLuU6pT9wO9 == obj2) {
                        GcLuU6pT9wO9 = defpackage.w60.hH0RRJrNssvh(ewVar);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                    }
                    defpackage.fo0 fo0Var3 = (defpackage.fo0) GcLuU6pT9wO9;
                    if (tiVar.oh71FJcDz6S2() == pw0Var2.getValue() || tiVar.oh71FJcDz6S2() != fvVar2) {
                        if (pw0Var2.getValue() != fvVar2) {
                            defpackage.kp1 kp1Var5 = ((defpackage.ew) fo0Var3.getValue()).ZpBGe2uQfcn8;
                            defpackage.kp1 kp1Var6 = ewVar.ZpBGe2uQfcn8;
                            defpackage.vw vwVar2 = kp1Var6.ZpBGe2uQfcn8;
                            if (vwVar2 == null) {
                                vwVar2 = kp1Var5.ZpBGe2uQfcn8;
                            }
                            boolean z6 = kp1Var6.giKS3J6vZuNy || kp1Var5.giKS3J6vZuNy;
                            java.util.Map map3 = kp1Var5.fWTAfUmVKrZq;
                            java.util.Map map4 = kp1Var6.fWTAfUmVKrZq;
                            map3.getClass();
                            map4.getClass();
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(map3);
                            linkedHashMap2.putAll(map4);
                            fo0Var3.setValue(new defpackage.ew(new defpackage.kp1(vwVar2, (defpackage.q70) null, z6, linkedHashMap2)));
                        }
                    } else if (jp1Var2.QiMR8OkAhezm()) {
                        fo0Var3.setValue(ewVar);
                    } else {
                        fo0Var3.setValue(defpackage.ew.giKS3J6vZuNy);
                    }
                    ewVar2 = (defpackage.ew) fo0Var3.getValue();
                    java.lang.Object w6IV1lieBIux = defpackage.w60.w6IV1lieBIux(c20Var, e30Var);
                    java.lang.Object QiMR8OkAhezm3 = c20Var.QiMR8OkAhezm(tiVar.oh71FJcDz6S2(), pw0Var2.getValue());
                    oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(jp1Var2) | e30Var.oh71FJcDz6S2(w6IV1lieBIux);
                    GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                    defpackage.ep1 ep1Var2 = null;
                    if (!oh71FJcDz6S23 || GcLuU6pT9wO92 == obj2) {
                        GcLuU6pT9wO92 = new defpackage.oh71FJcDz6S2(jp1Var2, w6IV1lieBIux, null == true ? 1 : 0, 1);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                    }
                    defpackage.c20 c20Var2 = (defpackage.c20) GcLuU6pT9wO92;
                    GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                    if (GcLuU6pT9wO93 == obj2) {
                        GcLuU6pT9wO93 = defpackage.w60.hH0RRJrNssvh(QiMR8OkAhezm3);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
                    }
                    fo0Var = (defpackage.fo0) GcLuU6pT9wO93;
                    P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(c20Var2);
                    GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                    if (!P05cfTpS5W5L2 || GcLuU6pT9wO94 == obj2) {
                        GcLuU6pT9wO94 = new defpackage.bf1(c20Var2, fo0Var, null == true ? 1 : 0, 0);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
                    }
                    defpackage.nq1.GE9mJIPrb8gP((defpackage.c20) GcLuU6pT9wO94, e30Var, defpackage.gs1.ZpBGe2uQfcn8);
                    oh71FJcDz6S24 = tiVar.oh71FJcDz6S2();
                    fvVar = defpackage.fv.QiMR8OkAhezm;
                    if (oh71FJcDz6S24 != fvVar && pw0Var2.getValue() == fvVar && ((java.lang.Boolean) fo0Var.getValue()).booleanValue()) {
                        e30Var.NkfcFfdaVTox(-229368781);
                        z3 = false;
                        e30Var.XntWc4eZSQ8j(false);
                        nhVar2 = nhVar;
                    } else {
                        e30Var.NkfcFfdaVTox(-230699766);
                        z = i3 != 4;
                        GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                        if (!z || GcLuU6pT9wO95 == obj2) {
                            GcLuU6pT9wO95 = new defpackage.v5();
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
                        }
                        defpackage.v5 v5Var = (defpackage.v5) GcLuU6pT9wO95;
                        GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
                        if (GcLuU6pT9wO96 == obj2) {
                            GcLuU6pT9wO96 = defpackage.pj.fNwYGHIYeJcR;
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO96);
                        }
                        defpackage.n10 n10Var = (defpackage.n10) GcLuU6pT9wO96;
                        e30Var.NkfcFfdaVTox(-167964673);
                        e30Var.XntWc4eZSQ8j(false);
                        e30Var.NkfcFfdaVTox(-167961890);
                        e30Var.XntWc4eZSQ8j(false);
                        kp1Var = ovVar2.ZpBGe2uQfcn8;
                        kp1Var2 = ewVar2.ZpBGe2uQfcn8;
                        e30Var.NkfcFfdaVTox(-911382324);
                        e30Var.XntWc4eZSQ8j(false);
                        e30Var.NkfcFfdaVTox(-911179709);
                        e30Var.XntWc4eZSQ8j(false);
                        e30Var.NkfcFfdaVTox(-910935677);
                        e30Var.XntWc4eZSQ8j(false);
                        float[] fArr = defpackage.ag.ZpBGe2uQfcn8;
                        e30Var.NkfcFfdaVTox(-910130296);
                        e30Var.XntWc4eZSQ8j(false);
                        defpackage.lq1 lq1Var2 = defpackage.nn.ZVVdXbWmyCSK;
                        if (kp1Var.ZpBGe2uQfcn8 == null || kp1Var2.ZpBGe2uQfcn8 != null) {
                            obj = obj2;
                            z2 = false;
                            e30Var.NkfcFfdaVTox(-703709976);
                            e30Var.XntWc4eZSQ8j(false);
                            ep1Var = null;
                        } else {
                            e30Var.NkfcFfdaVTox(-703879421);
                            java.lang.Object GcLuU6pT9wO914 = e30Var.GcLuU6pT9wO9();
                            if (GcLuU6pT9wO914 == obj2) {
                                GcLuU6pT9wO914 = "Built-in alpha";
                                e30Var.EgL5gQQnyJKX("Built-in alpha");
                            }
                            obj = obj2;
                            ep1Var = defpackage.vx1.WmetiUbpKU9I(jp1Var2, lq1Var2, (java.lang.String) GcLuU6pT9wO914, e30Var, 384, 0);
                            z2 = false;
                            e30Var.XntWc4eZSQ8j(false);
                        }
                        e30Var.NkfcFfdaVTox(-703472888);
                        e30Var.XntWc4eZSQ8j(z2);
                        e30Var.NkfcFfdaVTox(-703222904);
                        e30Var.XntWc4eZSQ8j(z2);
                        P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(ep1Var) | e30Var.oh71FJcDz6S2(ovVar2) | e30Var.oh71FJcDz6S2(ewVar2) | e30Var.P05cfTpS5W5L(null) | e30Var.oh71FJcDz6S2(jp1Var2) | e30Var.P05cfTpS5W5L(null);
                        GcLuU6pT9wO97 = e30Var.GcLuU6pT9wO9();
                        if (!P05cfTpS5W5L3 || GcLuU6pT9wO97 == obj) {
                            ovVar3 = ovVar2;
                            GcLuU6pT9wO97 = new defpackage.hv(ep1Var, ep1Var2, jp1Var2, ovVar3, ewVar2, null == true ? 1 : 0);
                            ewVar3 = ewVar2;
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO97);
                        } else {
                            ovVar3 = ovVar2;
                            ewVar3 = ewVar2;
                        }
                        defpackage.hv hvVar = (defpackage.hv) GcLuU6pT9wO97;
                        QiMR8OkAhezm2 = e30Var.QiMR8OkAhezm(true) | e30Var.oh71FJcDz6S2(n10Var);
                        GcLuU6pT9wO98 = e30Var.GcLuU6pT9wO9();
                        if (!QiMR8OkAhezm2 || GcLuU6pT9wO98 == obj) {
                            GcLuU6pT9wO98 = new defpackage.jv(true, n10Var);
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO98);
                        }
                        defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
                        defpackage.vl0 fWTAfUmVKrZq2 = defpackage.vx1.w7APNrr0aGRc(sl0Var, (defpackage.y10) GcLuU6pT9wO98).fWTAfUmVKrZq(new defpackage.gv(jp1Var2, ovVar3, ewVar3, n10Var, hvVar)).fWTAfUmVKrZq(sl0Var);
                        e30Var.NkfcFfdaVTox(-7404393);
                        e30Var.XntWc4eZSQ8j(false);
                        defpackage.vl0 fWTAfUmVKrZq3 = vl0Var.fWTAfUmVKrZq(fWTAfUmVKrZq2.fWTAfUmVKrZq(sl0Var));
                        GcLuU6pT9wO99 = e30Var.GcLuU6pT9wO9();
                        if (GcLuU6pT9wO99 == obj) {
                            GcLuU6pT9wO99 = new defpackage.r5(v5Var);
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO99);
                        }
                        defpackage.r5 r5Var = (defpackage.r5) GcLuU6pT9wO99;
                        int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq3);
                        defpackage.wi.fWTAfUmVKrZq.getClass();
                        defpackage.n10 n10Var2 = defpackage.vi.giKS3J6vZuNy;
                        e30Var.fhbmYuu9J3cT();
                        if (e30Var.Fu5WBEia9jBo) {
                            e30Var.lXYSMswtzmix();
                        } else {
                            e30Var.Ns0WNyEWdPsk(n10Var2);
                        }
                        defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, r5Var);
                        defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR2);
                        java.lang.Object valueOf = java.lang.Integer.valueOf(hashCode);
                        defpackage.c20 c20Var3 = defpackage.vi.QiMR8OkAhezm;
                        if (e30Var.Fu5WBEia9jBo) {
                            e30Var.giKS3J6vZuNy(c20Var3, valueOf);
                        }
                        defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
                        defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
                        nhVar2 = nhVar;
                        nhVar2.JhCgjQRTAOCT(v5Var, e30Var, 48);
                        e30Var.XntWc4eZSQ8j(true);
                        z3 = false;
                        e30Var.XntWc4eZSQ8j(false);
                    }
                    e30Var.XntWc4eZSQ8j(z3);
                }
                tiVar = tiVar4;
                ovVar2 = (defpackage.ov) fo0Var2.getValue();
                oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(jp1Var2);
                GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                if (!oh71FJcDz6S22) {
                }
                GcLuU6pT9wO9 = defpackage.w60.hH0RRJrNssvh(ewVar);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                defpackage.fo0 fo0Var32 = (defpackage.fo0) GcLuU6pT9wO9;
                if (tiVar.oh71FJcDz6S2() == pw0Var2.getValue()) {
                }
                if (pw0Var2.getValue() != fvVar2) {
                }
                ewVar2 = (defpackage.ew) fo0Var32.getValue();
                java.lang.Object w6IV1lieBIux2 = defpackage.w60.w6IV1lieBIux(c20Var, e30Var);
                java.lang.Object QiMR8OkAhezm32 = c20Var.QiMR8OkAhezm(tiVar.oh71FJcDz6S2(), pw0Var2.getValue());
                oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(jp1Var2) | e30Var.oh71FJcDz6S2(w6IV1lieBIux2);
                GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                defpackage.ep1 ep1Var22 = null;
                if (!oh71FJcDz6S23) {
                }
                GcLuU6pT9wO92 = new defpackage.oh71FJcDz6S2(jp1Var2, w6IV1lieBIux2, null == true ? 1 : 0, 1);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                defpackage.c20 c20Var22 = (defpackage.c20) GcLuU6pT9wO92;
                GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                if (GcLuU6pT9wO93 == obj2) {
                }
                fo0Var = (defpackage.fo0) GcLuU6pT9wO93;
                P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(c20Var22);
                GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                if (!P05cfTpS5W5L2) {
                }
                GcLuU6pT9wO94 = new defpackage.bf1(c20Var22, fo0Var, null == true ? 1 : 0, 0);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
                defpackage.nq1.GE9mJIPrb8gP((defpackage.c20) GcLuU6pT9wO94, e30Var, defpackage.gs1.ZpBGe2uQfcn8);
                oh71FJcDz6S24 = tiVar.oh71FJcDz6S2();
                fvVar = defpackage.fv.QiMR8OkAhezm;
                if (oh71FJcDz6S24 != fvVar) {
                }
                e30Var.NkfcFfdaVTox(-230699766);
                if (i3 != 4) {
                }
                GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                if (!z) {
                }
                GcLuU6pT9wO95 = new defpackage.v5();
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
                defpackage.v5 v5Var2 = (defpackage.v5) GcLuU6pT9wO95;
                GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
                if (GcLuU6pT9wO96 == obj2) {
                }
                defpackage.n10 n10Var3 = (defpackage.n10) GcLuU6pT9wO96;
                e30Var.NkfcFfdaVTox(-167964673);
                e30Var.XntWc4eZSQ8j(false);
                e30Var.NkfcFfdaVTox(-167961890);
                e30Var.XntWc4eZSQ8j(false);
                kp1Var = ovVar2.ZpBGe2uQfcn8;
                kp1Var2 = ewVar2.ZpBGe2uQfcn8;
                e30Var.NkfcFfdaVTox(-911382324);
                e30Var.XntWc4eZSQ8j(false);
                e30Var.NkfcFfdaVTox(-911179709);
                e30Var.XntWc4eZSQ8j(false);
                e30Var.NkfcFfdaVTox(-910935677);
                e30Var.XntWc4eZSQ8j(false);
                float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                e30Var.NkfcFfdaVTox(-910130296);
                e30Var.XntWc4eZSQ8j(false);
                defpackage.lq1 lq1Var22 = defpackage.nn.ZVVdXbWmyCSK;
                if (kp1Var.ZpBGe2uQfcn8 == null || kp1Var2.ZpBGe2uQfcn8 != null) {
                }
                e30Var.NkfcFfdaVTox(-703472888);
                e30Var.XntWc4eZSQ8j(z2);
                e30Var.NkfcFfdaVTox(-703222904);
                e30Var.XntWc4eZSQ8j(z2);
                P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(ep1Var) | e30Var.oh71FJcDz6S2(ovVar2) | e30Var.oh71FJcDz6S2(ewVar2) | e30Var.P05cfTpS5W5L(null) | e30Var.oh71FJcDz6S2(jp1Var2) | e30Var.P05cfTpS5W5L(null);
                GcLuU6pT9wO97 = e30Var.GcLuU6pT9wO9();
                if (P05cfTpS5W5L3) {
                }
                ovVar3 = ovVar2;
                GcLuU6pT9wO97 = new defpackage.hv(ep1Var, ep1Var22, jp1Var2, ovVar3, ewVar2, null == true ? 1 : 0);
                ewVar3 = ewVar2;
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO97);
                defpackage.hv hvVar2 = (defpackage.hv) GcLuU6pT9wO97;
                QiMR8OkAhezm2 = e30Var.QiMR8OkAhezm(true) | e30Var.oh71FJcDz6S2(n10Var3);
                GcLuU6pT9wO98 = e30Var.GcLuU6pT9wO9();
                if (!QiMR8OkAhezm2) {
                }
                GcLuU6pT9wO98 = new defpackage.jv(true, n10Var3);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO98);
                defpackage.sl0 sl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
                defpackage.vl0 fWTAfUmVKrZq22 = defpackage.vx1.w7APNrr0aGRc(sl0Var2, (defpackage.y10) GcLuU6pT9wO98).fWTAfUmVKrZq(new defpackage.gv(jp1Var2, ovVar3, ewVar3, n10Var3, hvVar2)).fWTAfUmVKrZq(sl0Var2);
                e30Var.NkfcFfdaVTox(-7404393);
                e30Var.XntWc4eZSQ8j(false);
                defpackage.vl0 fWTAfUmVKrZq32 = vl0Var.fWTAfUmVKrZq(fWTAfUmVKrZq22.fWTAfUmVKrZq(sl0Var2));
                GcLuU6pT9wO99 = e30Var.GcLuU6pT9wO9();
                if (GcLuU6pT9wO99 == obj) {
                }
                defpackage.r5 r5Var2 = (defpackage.r5) GcLuU6pT9wO99;
                int hashCode2 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
                defpackage.ay0 fNwYGHIYeJcR22 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq32);
                defpackage.wi.fWTAfUmVKrZq.getClass();
                defpackage.n10 n10Var22 = defpackage.vi.giKS3J6vZuNy;
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                }
                defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, r5Var2);
                defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR22);
                java.lang.Object valueOf2 = java.lang.Integer.valueOf(hashCode2);
                defpackage.c20 c20Var32 = defpackage.vi.QiMR8OkAhezm;
                if (e30Var.Fu5WBEia9jBo) {
                }
                defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
                defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju2);
                nhVar2 = nhVar;
                nhVar2.JhCgjQRTAOCT(v5Var2, e30Var, 48);
                e30Var.XntWc4eZSQ8j(true);
                z3 = false;
                e30Var.XntWc4eZSQ8j(false);
                e30Var.XntWc4eZSQ8j(z3);
            } else {
                e30Var.NkfcFfdaVTox(-229362829);
                e30Var.XntWc4eZSQ8j(false);
                nhVar2 = nhVar;
            }
        } else {
            nhVar2 = nhVar;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.s5(jp1Var, y10Var, vl0Var, ovVar, ewVar, c20Var, nhVar2, i);
        }
    }

    public static final android.graphics.Paint blKFvluuDQOf(defpackage.j2 j2Var) {
        if (j2Var == null) {
            defpackage.d80.ZpBGe2uQfcn8("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + defpackage.b41.ZpBGe2uQfcn8(j2Var.getClass()).giKS3J6vZuNy());
        }
        return (android.graphics.Paint) j2Var.giKS3J6vZuNy;
    }

    public static final defpackage.aj dG7RjM6DqYVL(android.view.View view) {
        java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_compose_view_context);
        java.lang.ref.WeakReference weakReference = tag instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) tag : null;
        if (weakReference != null) {
            return (defpackage.aj) weakReference.get();
        }
        return null;
    }

    public static final long e6mdH7fiFuta(defpackage.hg0 hg0Var, defpackage.s31 s31Var, defpackage.s31 s31Var2, int i) {
        long qjMheFZ0l9kA = qjMheFZ0l9kA(hg0Var, s31Var, i);
        if (defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA)) {
            return defpackage.in1.giKS3J6vZuNy;
        }
        long qjMheFZ0l9kA2 = qjMheFZ0l9kA(hg0Var, s31Var2, i);
        if (defpackage.in1.fWTAfUmVKrZq(qjMheFZ0l9kA2)) {
            return defpackage.in1.giKS3J6vZuNy;
        }
        int i2 = (int) (qjMheFZ0l9kA >> 32);
        int i3 = (int) (qjMheFZ0l9kA2 & 4294967295L);
        return defpackage.j80.JhCgjQRTAOCT(java.lang.Math.min(i2, i2), java.lang.Math.max(i3, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int fNwYGHIYeJcR(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static final void fWTAfUmVKrZq(defpackage.vl0 vl0Var, defpackage.k7 k7Var, defpackage.m7 m7Var, defpackage.jVUAPb5NnIYW jvuapb5nniyw, defpackage.e30 e30Var, int i) {
        int i2;
        java.lang.Object obj;
        int i3;
        boolean z;
        java.lang.Object obj2;
        java.lang.Object obj3 = defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ;
        java.lang.Object obj4 = defpackage.la0.oh71FJcDz6S2;
        e30Var.PS16moFv2oLu(-1956591841);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(k7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(m7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(obj3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= e30Var.JhCgjQRTAOCT(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= e30Var.JhCgjQRTAOCT(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj = jvuapb5nniyw;
            i2 |= e30Var.oh71FJcDz6S2(obj) ? 1048576 : 524288;
        } else {
            obj = jvuapb5nniyw;
        }
        if ((i & 12582912) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(obj4) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (e30Var.zJPqDeoF0Os1(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z2 = i5 == 1048576;
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj5 = defpackage.cj.ZpBGe2uQfcn8;
            if (z2 || GcLuU6pT9wO9 == obj5) {
                obj.getClass();
                GcLuU6pT9wO9 = new defpackage.py();
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.py pyVar = (defpackage.py) GcLuU6pT9wO9;
            int i6 = i4 >> 3;
            int i7 = 6;
            boolean oh71FJcDz6S22 = ((((i6 & 896) ^ 384) > 256 && e30Var.oh71FJcDz6S2(obj3)) || (i6 & 384) == 256) | ((((i6 & 14) ^ 6) > 4 && e30Var.oh71FJcDz6S2(k7Var)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && e30Var.oh71FJcDz6S2(m7Var)) || (i6 & 48) == 32) | ((((i6 & 7168) ^ 3072) > 2048 && e30Var.JhCgjQRTAOCT(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && e30Var.JhCgjQRTAOCT(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | e30Var.oh71FJcDz6S2(pyVar);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S22 || GcLuU6pT9wO92 == obj5) {
                i3 = i5;
                java.lang.Object ryVar = new defpackage.ry(k7Var, m7Var, k7Var.ZpBGe2uQfcn8(), new defpackage.zm(), m7Var.ZpBGe2uQfcn8(), pyVar);
                e30Var.EgL5gQQnyJKX(ryVar);
                GcLuU6pT9wO92 = ryVar;
            } else {
                i3 = i5;
            }
            defpackage.ry ryVar2 = (defpackage.ry) GcLuU6pT9wO92;
            boolean z3 = (i3 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (z3 || GcLuU6pT9wO93 == obj5) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                z = true;
                arrayList.add(new defpackage.nh(-1192950673, true, new defpackage.b7(15, (byte) 0)));
                jvuapb5nniyw.getClass();
                e30Var.EgL5gQQnyJKX(arrayList);
                obj2 = arrayList;
            } else {
                z = true;
                obj2 = GcLuU6pT9wO93;
            }
            defpackage.nh nhVar = new defpackage.nh(1271844412, z, new defpackage.T1fB7bDYiVJQ(i7, (java.util.List) obj2));
            boolean oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(ryVar2);
            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S23 || GcLuU6pT9wO94 == obj5) {
                GcLuU6pT9wO94 = new defpackage.tm0(ryVar2);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
            }
            defpackage.vk0 vk0Var = (defpackage.vk0) GcLuU6pT9wO94;
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, vl0Var);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.n10 n10Var = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(n10Var);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, vk0Var);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR2);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
            nhVar.QiMR8OkAhezm(e30Var, 0);
            e30Var.XntWc4eZSQ8j(true);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.lh(vl0Var, k7Var, m7Var, jvuapb5nniyw, i, 1);
        }
    }

    public static boolean frSwwKIlbUhK(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }

    public static final void giKS3J6vZuNy(com.ice.fishing.wolberta.data.local.Item item, defpackage.n10 n10Var, defpackage.y10 y10Var, defpackage.e30 e30Var, int i) {
        int i2;
        n10Var.getClass();
        y10Var.getClass();
        e30Var.PS16moFv2oLu(-1138066785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e30Var.oh71FJcDz6S2(item) : e30Var.P05cfTpS5W5L(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(y10Var) ? 256 : 128;
        }
        int i3 = 0;
        if (!e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            e30Var.Jkfc0NcwyPL8();
        } else if (item == null) {
            e30Var.NkfcFfdaVTox(324361575);
            e30Var.XntWc4eZSQ8j(false);
        } else {
            e30Var.NkfcFfdaVTox(324361576);
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(item) | ((i2 & 896) == 256);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.rp(y10Var, item, i3);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.i61.fWTAfUmVKrZq(item, n10Var, (defpackage.n10) GcLuU6pT9wO9, e30Var, (i2 & 112) | com.ice.fishing.wolberta.data.local.Item.$stable);
            e30Var.XntWc4eZSQ8j(false);
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(item, n10Var, y10Var, i, 7);
        }
    }

    public static final defpackage.vl0 hH0RRJrNssvh(defpackage.vl0 vl0Var, defpackage.kf0 kf0Var, defpackage.af0 af0Var, defpackage.fv0 fv0Var, boolean z) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.bf0(kf0Var, af0Var, fv0Var, z));
    }

    public static final boolean jjTN4uUnoyEn(android.view.KeyEvent keyEvent) {
        long qjMheFZ0l9kA = defpackage.w60.qjMheFZ0l9kA(keyEvent);
        int i = defpackage.ub0.zJPqDeoF0Os1;
        return defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.P05cfTpS5W5L) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.s0TASMVLSWD5) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.jjTN4uUnoyEn) || defpackage.ub0.ZpBGe2uQfcn8(qjMheFZ0l9kA, defpackage.ub0.WmetiUbpKU9I);
    }

    public static final boolean maCixPsq4ml2(long j, long j2) {
        return j == j2;
    }

    public static final defpackage.vl0 oCu53ZX2v4Ju(defpackage.iz izVar) {
        return new defpackage.jz(izVar);
    }

    public static final long oh71FJcDz6S2(float f, float f2, int i) {
        float f3 = f2 + f;
        float f4 = ((i / 3) * f3) + (f / 2.0f);
        return (java.lang.Float.floatToRawIntBits(((i % 3) * f3) + r4) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L);
    }

    public static final long qjMheFZ0l9kA(defpackage.hg0 hg0Var, defpackage.s31 s31Var, int i) {
        defpackage.p81 p81Var = defpackage.pa1.XntWc4eZSQ8j;
        defpackage.cn1 JhCgjQRTAOCT2 = hg0Var.JhCgjQRTAOCT();
        defpackage.wm0 wm0Var = JhCgjQRTAOCT2 != null ? JhCgjQRTAOCT2.ZpBGe2uQfcn8.giKS3J6vZuNy : null;
        defpackage.rc0 fWTAfUmVKrZq2 = hg0Var.fWTAfUmVKrZq();
        return (wm0Var == null || fWTAfUmVKrZq2 == null) ? defpackage.in1.giKS3J6vZuNy : wm0Var.P05cfTpS5W5L(s31Var.e6mdH7fiFuta(fWTAfUmVKrZq2.maCixPsq4ml2(0L)), i, p81Var);
    }

    public static defpackage.vl0 s0TASMVLSWD5(defpackage.vl0 vl0Var, boolean z, java.lang.String str, defpackage.n10 n10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.te(null, null, true, z, str, n10Var));
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
    public static void w7APNrr0aGRc(defpackage.p0 p0Var, android.util.LongSparseArray longSparseArray) {
        android.view.translation.TranslationResponseValue value;
        java.lang.CharSequence text;
        defpackage.lb1 lb1Var;
        defpackage.jb1 jb1Var;
        defpackage.y10 y10Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            android.view.translation.ViewTranslationResponse WmetiUbpKU9I = defpackage.d0.WmetiUbpKU9I(longSparseArray.get(keyAt));
            if (WmetiUbpKU9I != null && value != null && text != null && (lb1Var = (defpackage.lb1) p0Var.WDYagTQQm9ns().giKS3J6vZuNy((int) keyAt)) != null && (jb1Var = lb1Var.ZpBGe2uQfcn8) != null) {
                java.lang.Object QiMR8OkAhezm2 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.fNwYGHIYeJcR);
                if (QiMR8OkAhezm2 == null) {
                    QiMR8OkAhezm2 = null;
                }
                defpackage.xahdJg25P1Bv xahdjg25p1bv = (defpackage.xahdJg25P1Bv) QiMR8OkAhezm2;
                if (xahdjg25p1bv != null && (y10Var = (defpackage.y10) xahdjg25p1bv.giKS3J6vZuNy) != null) {
                }
            }
        }
    }

    public static final defpackage.vl0 xahdJg25P1Bv(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.nt0(y10Var));
    }

    public static final java.lang.Object z16KqenTjq8o(java.lang.Object obj) {
        defpackage.s60 s60Var;
        defpackage.t60 t60Var = obj instanceof defpackage.t60 ? (defpackage.t60) obj : null;
        return (t60Var == null || (s60Var = t60Var.ZpBGe2uQfcn8) == null) ? obj : s60Var;
    }

    public abstract boolean T1fB7bDYiVJQ(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, defpackage.KrtOTfE6jiS2 krtOTfE6jiS22);

    public abstract boolean gUjdnLbkVAaA(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean h3m55N1URyyK(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, defpackage.jjTN4uUnoyEn jjtn4uunoyen);

    public abstract void w6IV1lieBIux(defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, defpackage.KrtOTfE6jiS2 krtOTfE6jiS22);

    public abstract void zJPqDeoF0Os1(defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, java.lang.Thread thread);
}
