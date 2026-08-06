package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cnag84Bm implements java.lang.Runnable {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ cnag84Bm(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c2, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3 = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i3) {
            case 0:
                ((defpackage.G3OKOH3wZRC) obj).r1MBDhnF();
                return;
            case 1:
                defpackage.a1 a1Var = (defpackage.a1) obj;
                android.os.Trace.beginSection("measureAndLayout");
                try {
                    a1Var.EXtogiMhuM.kNAkVymC(true);
                    android.os.Trace.endSection();
                    android.os.Trace.beginSection("checkForSemanticsChanges");
                    try {
                        a1Var.xiZrDbcSW0();
                        android.os.Trace.endSection();
                        a1Var.hyxIchWRW = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.o1 o1Var = (defpackage.o1) obj;
                boolean xiZrDbcSW0 = o1Var.xiZrDbcSW0();
                defpackage.v0 v0Var = o1Var.adDC3e2L;
                if (xiZrDbcSW0) {
                    android.os.Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        v0Var.kNAkVymC(true);
                        defpackage.xk0 xk0Var = o1Var.cnag84Bm;
                        int[] iArr = xk0Var.oh6vYeIP;
                        long[] jArr = xk0Var.IHQe1A4L2xu;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!o1Var.adDC3e2L().IHQe1A4L2xu(i7)) {
                                                i2 = i4;
                                                o1Var.EXtogiMhuM.add(new defpackage.pi(i7, o1Var.SyNS6RMn, defpackage.qi.xiZrDbcSW0, null));
                                                o1Var.JlrlGoKF.riuEU0zW4(defpackage.ok1.IHQe1A4L2xu);
                                                j >>= 8;
                                                i6++;
                                                i4 = i2;
                                            }
                                        }
                                        i2 = i4;
                                        j >>= 8;
                                        i6++;
                                        i4 = i2;
                                    }
                                    int i8 = i4;
                                    if (i5 == 8) {
                                        i = i8;
                                    }
                                } else {
                                    i = i4;
                                }
                                if (i != length) {
                                    i4 = i + 1;
                                }
                            }
                        }
                        android.os.Trace.beginSection("ContentCapture:sendAppearEvents");
                        o1Var.SH1y5HwkJhh(v0Var.getSemanticsOwner().IHQe1A4L2xu(), o1Var.QoRHpC4k);
                        android.os.Trace.endSection();
                        o1Var.r1MBDhnF(o1Var.adDC3e2L());
                        o1Var.SyNS6RMn();
                        o1Var.G3OKOH3wZRC = false;
                        return;
                    } finally {
                    }
                }
                return;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nf.riuEU0zW4((com.corsair.ledger.MainActivity) obj);
                return;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.kf kfVar = (defpackage.kf) obj;
                java.lang.Runnable runnable = kfVar.xiZrDbcSW0;
                if (runnable != null) {
                    runnable.run();
                    kfVar.xiZrDbcSW0 = null;
                    return;
                }
                return;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.qo.F7NU4MC0GW((defpackage.qo) obj);
                return;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.wy wyVar = (defpackage.wy) obj;
                synchronized (wyVar.F7NU4MC0GW) {
                    try {
                        if (wyVar.EXtogiMhuM == null) {
                            return;
                        }
                        try {
                            defpackage.gz r1MBDhnF = wyVar.r1MBDhnF();
                            int i9 = r1MBDhnF.xiZrDbcSW0;
                            if (i9 == 2) {
                                synchronized (wyVar.F7NU4MC0GW) {
                                }
                            }
                            if (i9 != 0) {
                                throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = defpackage.ih1.IHQe1A4L2xu;
                                android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                defpackage.ky kyVar = wyVar.r1MBDhnF;
                                android.content.Context context = wyVar.IHQe1A4L2xu;
                                kyVar.getClass();
                                defpackage.gz[] gzVarArr = {r1MBDhnF};
                                defpackage.c80 c80Var = defpackage.pj1.IHQe1A4L2xu;
                                defpackage.l80.AARZUJiTa("TypefaceCompat.createFromFontInfo");
                                try {
                                    android.graphics.Typeface SyNS6RMn = defpackage.pj1.IHQe1A4L2xu.SyNS6RMn(context, gzVarArr);
                                    android.os.Trace.endSection();
                                    java.nio.MappedByteBuffer PAEGRtP0bX = defpackage.l80.PAEGRtP0bX(wyVar.IHQe1A4L2xu, r1MBDhnF.IHQe1A4L2xu);
                                    if (PAEGRtP0bX == null || SyNS6RMn == null) {
                                        throw new java.lang.RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        defpackage.y yVar = new defpackage.y(SyNS6RMn, defpackage.j70.UsuH8pd5P(PAEGRtP0bX));
                                        android.os.Trace.endSection();
                                        synchronized (wyVar.F7NU4MC0GW) {
                                            try {
                                                defpackage.s21 s21Var = wyVar.EXtogiMhuM;
                                                if (s21Var != null) {
                                                    s21Var.XZx205DYe(yVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        wyVar.oh6vYeIP();
                                        return;
                                    } finally {
                                        int i11 = defpackage.ih1.IHQe1A4L2xu;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (java.lang.Throwable th) {
                            synchronized (wyVar.F7NU4MC0GW) {
                                try {
                                    defpackage.s21 s21Var2 = wyVar.EXtogiMhuM;
                                    if (s21Var2 != null) {
                                        s21Var2.wll2JLbTBC2(th);
                                    }
                                    wyVar.oh6vYeIP();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.vx0 vx0Var = (defpackage.vx0) obj;
                defpackage.xd0 xd0Var = vx0Var.SH1y5HwkJhh;
                if (vx0Var.xiZrDbcSW0 == 0) {
                    vx0Var.AARZUJiTa = true;
                    xd0Var.F7NU4MC0GW(defpackage.md0.ON_PAUSE);
                }
                if (vx0Var.adDC3e2L == 0 && vx0Var.AARZUJiTa) {
                    xd0Var.F7NU4MC0GW(defpackage.md0.ON_STOP);
                    vx0Var.EXtogiMhuM = true;
                    return;
                }
                return;
            default:
                defpackage.h21.setRippleState$lambda$1((defpackage.h21) obj);
                return;
        }
    }
}
