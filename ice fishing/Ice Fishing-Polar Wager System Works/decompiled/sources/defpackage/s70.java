package defpackage;

/* loaded from: classes.dex */
public abstract class s70 {
    public static final void AARZUJiTa(defpackage.vm1 vm1Var, defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.xd0 xd0Var) {
        f7nu4mc0gw.getClass();
        xd0Var.getClass();
        defpackage.z31 z31Var = (defpackage.z31) vm1Var.r1MBDhnF("androidx.lifecycle.savedstate.vm.tag");
        if (z31Var == null || z31Var.AARZUJiTa) {
            return;
        }
        z31Var.ez2rX8ReCYw(f7nu4mc0gw, xd0Var);
        defpackage.nd0 nd0Var = xd0Var.EXtogiMhuM;
        if (nd0Var == defpackage.nd0.xiZrDbcSW0 || nd0Var.compareTo(defpackage.nd0.EXtogiMhuM) >= 0) {
            f7nu4mc0gw.C0U8sNJm();
        } else {
            xd0Var.IHQe1A4L2xu(new defpackage.an(f7nu4mc0gw, xd0Var));
        }
    }

    public static final java.util.ArrayList C0U8sNJm(android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList oh6vYeIP = android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.qvFH3dnF.oh6vYeIP(bundle, str, defpackage.a70.QoRHpC4k(defpackage.sz0.IHQe1A4L2xu(android.os.Bundle.class))) : bundle.getParcelableArrayList(str);
        if (oh6vYeIP != null) {
            return oh6vYeIP;
        }
        defpackage.c80.abhbClRa(str);
        throw null;
    }

    public static final boolean D2vUnMij(int i, defpackage.kz0 kz0Var, defpackage.kz0 kz0Var2) {
        if (i == 3) {
            float f = kz0Var2.r1MBDhnF;
            float f2 = kz0Var2.IHQe1A4L2xu;
            float f3 = kz0Var.r1MBDhnF;
            return (f > f3 || f2 >= f3) && f2 > kz0Var.IHQe1A4L2xu;
        }
        if (i == 4) {
            float f4 = kz0Var2.IHQe1A4L2xu;
            float f5 = kz0Var2.r1MBDhnF;
            float f6 = kz0Var.IHQe1A4L2xu;
            return (f4 < f6 || f5 <= f6) && f5 < kz0Var.r1MBDhnF;
        }
        if (i == 5) {
            float f7 = kz0Var2.F7NU4MC0GW;
            float f8 = kz0Var2.oh6vYeIP;
            float f9 = kz0Var.F7NU4MC0GW;
            return (f7 > f9 || f8 >= f9) && f8 > kz0Var.oh6vYeIP;
        }
        if (i != 6) {
            defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = kz0Var2.oh6vYeIP;
        float f11 = kz0Var2.F7NU4MC0GW;
        float f12 = kz0Var.oh6vYeIP;
        return (f10 < f12 || f11 <= f12) && f11 < kz0Var.F7NU4MC0GW;
    }

    public static final boolean DFo87pBq1E5(defpackage.sv0 sv0Var) {
        return sv0Var.EXtogiMhuM && !sv0Var.F7NU4MC0GW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.r1MBDhnF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.IHQe1A4L2xu - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.F7NU4MC0GW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.oh6vYeIP - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean EXtogiMhuM(defpackage.kz0 kz0Var, defpackage.kz0 kz0Var2, defpackage.kz0 kz0Var3, int i) {
        boolean riuEU0zW4 = riuEU0zW4(i, kz0Var3, kz0Var);
        float f = kz0Var3.oh6vYeIP;
        float f2 = kz0Var3.F7NU4MC0GW;
        float f3 = kz0Var3.IHQe1A4L2xu;
        float f4 = kz0Var3.r1MBDhnF;
        float f5 = kz0Var.F7NU4MC0GW;
        float f6 = kz0Var.oh6vYeIP;
        float f7 = kz0Var.r1MBDhnF;
        float f8 = kz0Var.IHQe1A4L2xu;
        if (!riuEU0zW4 && riuEU0zW4(i, kz0Var2, kz0Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final defpackage.gy EgCjBq0SZwJ(defpackage.xl0 xl0Var, defpackage.kz0 kz0Var, int i) {
        defpackage.kz0 F7NU4MC0GW;
        defpackage.gy gyVar = null;
        if (i == 3) {
            F7NU4MC0GW = kz0Var.F7NU4MC0GW((kz0Var.r1MBDhnF - kz0Var.IHQe1A4L2xu) + 1.0f, 0.0f);
        } else if (i == 4) {
            F7NU4MC0GW = kz0Var.F7NU4MC0GW(-((kz0Var.r1MBDhnF - kz0Var.IHQe1A4L2xu) + 1.0f), 0.0f);
        } else if (i == 5) {
            F7NU4MC0GW = kz0Var.F7NU4MC0GW(0.0f, (kz0Var.F7NU4MC0GW - kz0Var.oh6vYeIP) + 1.0f);
        } else {
            if (i != 6) {
                defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
                return null;
            }
            F7NU4MC0GW = kz0Var.F7NU4MC0GW(0.0f, -((kz0Var.F7NU4MC0GW - kz0Var.oh6vYeIP) + 1.0f));
        }
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i2 = xl0Var.AARZUJiTa;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.gy gyVar2 = (defpackage.gy) objArr[i3];
            if (defpackage.mj1.wll2JLbTBC2(gyVar2)) {
                defpackage.kz0 UsuH8pd5P = defpackage.mj1.UsuH8pd5P(gyVar2);
                if (v5iciZok(UsuH8pd5P, F7NU4MC0GW, kz0Var, i)) {
                    gyVar = gyVar2;
                    F7NU4MC0GW = UsuH8pd5P;
                }
            }
        }
        return gyVar;
    }

    public static final void F7NU4MC0GW(defpackage.r31 r31Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(832919318);
        int i2 = (t10Var.EXtogiMhuM(r31Var) ? 4 : 2) | i | (t10Var.EXtogiMhuM(sfVar) ? 32 : 16);
        if ((i2 & 19) == 18 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
        } else {
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.uc0(8);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.g00 g00Var = (defpackage.g00) mAr5m2L7gYDP;
            defpackage.cn1 IHQe1A4L2xu = defpackage.df0.IHQe1A4L2xu(t10Var);
            if (IHQe1A4L2xu == null) {
                defpackage.db.AARZUJiTa("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            defpackage.xc IHQe1A4L2xu2 = defpackage.sz0.IHQe1A4L2xu(defpackage.r7.class);
            defpackage.u50 u50Var = new defpackage.u50(0);
            u50Var.IHQe1A4L2xu(defpackage.sz0.IHQe1A4L2xu(defpackage.r7.class), g00Var);
            defpackage.r7 r7Var = (defpackage.r7) defpackage.l80.nBH8hAHy(IHQe1A4L2xu2, IHQe1A4L2xu, u50Var.oh6vYeIP(), IHQe1A4L2xu instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
            r7Var.r1MBDhnF = new defpackage.in1(r31Var);
            r31Var.oh6vYeIP(r7Var.oh6vYeIP, sfVar, t10Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 15, r31Var, sfVar);
        }
    }

    public static final void IHQe1A4L2xu(final defpackage.mj0 mj0Var, defpackage.yc0 yc0Var, final defpackage.ct0 ct0Var, final defpackage.j6 j6Var, defpackage.c8 c8Var, defpackage.qm qmVar, boolean z, defpackage.e2 e2Var, final defpackage.g00 g00Var, defpackage.t10 t10Var, final int i) {
        final defpackage.yc0 yc0Var2;
        final defpackage.c8 c8Var2;
        final defpackage.qm qmVar2;
        final boolean z2;
        final defpackage.e2 e2Var2;
        defpackage.e2 e2Var3;
        int i2;
        defpackage.yc0 yc0Var3;
        boolean z3;
        defpackage.qm qmVar3;
        defpackage.e2 e2Var4;
        t10Var.QUKZkWRtw6(53695811);
        int i3 = i | (t10Var.xiZrDbcSW0(mj0Var) ? 4 : 2) | 46861328 | (t10Var.EXtogiMhuM(g00Var) ? 536870912 : 268435456);
        if (t10Var.lpprD5VAS(i3 & 1, (306783379 & i3) != 306783378)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                defpackage.sc0 sc0Var = defpackage.ad0.IHQe1A4L2xu;
                java.lang.Object[] objArr = new java.lang.Object[0];
                defpackage.F7NU4MC0GW f7nu4mc0gw = defpackage.yc0.abhbClRa;
                boolean F7NU4MC0GW = t10Var.F7NU4MC0GW(0) | t10Var.F7NU4MC0GW(0);
                java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
                if (F7NU4MC0GW || mAr5m2L7gYDP == obj) {
                    mAr5m2L7gYDP = new defpackage.g(17);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                }
                defpackage.yc0 yc0Var4 = (defpackage.yc0) defpackage.e90.NHJTzaLwkd(objArr, f7nu4mc0gw, (defpackage.vz) mAr5m2L7gYDP, t10Var, 0);
                c8Var2 = defpackage.n.G3OKOH3wZRC;
                float f = defpackage.sb1.IHQe1A4L2xu;
                defpackage.qn qnVar = (defpackage.qn) t10Var.SH1y5HwkJhh(defpackage.ph.EXtogiMhuM);
                boolean r1MBDhnF = t10Var.r1MBDhnF(qnVar.oh6vYeIP());
                java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                if (r1MBDhnF || mAr5m2L7gYDP2 == obj) {
                    mAr5m2L7gYDP2 = new defpackage.hm(new defpackage.sa1(qnVar));
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                }
                defpackage.hm hmVar = (defpackage.hm) mAr5m2L7gYDP2;
                boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(hmVar);
                java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
                if (xiZrDbcSW0 || mAr5m2L7gYDP3 == obj) {
                    mAr5m2L7gYDP3 = new defpackage.qm(hmVar);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
                }
                defpackage.qm qmVar4 = (defpackage.qm) mAr5m2L7gYDP3;
                defpackage.qh qhVar = defpackage.rs0.IHQe1A4L2xu;
                t10Var.AsxAYCCkb3Hi(282942128);
                defpackage.f2 f2Var = (defpackage.f2) t10Var.SH1y5HwkJhh(defpackage.rs0.IHQe1A4L2xu);
                if (f2Var == null) {
                    t10Var.QoRHpC4k(false);
                    e2Var3 = null;
                } else {
                    boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(f2Var);
                    java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
                    if (xiZrDbcSW02 || mAr5m2L7gYDP4 == obj) {
                        java.lang.Object e2Var5 = new defpackage.e2(f2Var.IHQe1A4L2xu, f2Var.oh6vYeIP, f2Var.r1MBDhnF, f2Var.F7NU4MC0GW);
                        t10Var.OtkytngK3Mr(e2Var5);
                        mAr5m2L7gYDP4 = e2Var5;
                    }
                    e2Var3 = (defpackage.e2) mAr5m2L7gYDP4;
                    t10Var.QoRHpC4k(false);
                }
                i2 = i3 & (-238551153);
                yc0Var3 = yc0Var4;
                z3 = true;
                qmVar3 = qmVar4;
                e2Var4 = e2Var3;
            } else {
                t10Var.WLpAkxCo();
                c8Var2 = c8Var;
                qmVar3 = qmVar;
                z3 = z;
                e2Var4 = e2Var;
                i2 = i3 & (-238551153);
                yc0Var3 = yc0Var;
            }
            t10Var.G3OKOH3wZRC();
            defpackage.f70.IHQe1A4L2xu(mj0Var, yc0Var3, ct0Var, qmVar3, z3, e2Var4, c8Var2, j6Var, g00Var, t10Var, 806907264 | (i2 & 14), 6 | ((i2 >> 18) & 7168));
            qmVar2 = qmVar3;
            z2 = z3;
            e2Var2 = e2Var4;
            yc0Var2 = yc0Var3;
        } else {
            t10Var.WLpAkxCo();
            yc0Var2 = yc0Var;
            c8Var2 = c8Var;
            qmVar2 = qmVar;
            z2 = z;
            e2Var2 = e2Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(yc0Var2, ct0Var, j6Var, c8Var2, qmVar2, z2, e2Var2, g00Var, i) { // from class: gb0
                public final /* synthetic */ defpackage.ct0 AARZUJiTa;
                public final /* synthetic */ defpackage.g00 DFo87pBq1E5;
                public final /* synthetic */ defpackage.j6 EXtogiMhuM;
                public final /* synthetic */ defpackage.e2 JlrlGoKF;
                public final /* synthetic */ defpackage.qm SH1y5HwkJhh;
                public final /* synthetic */ boolean ez2rX8ReCYw;
                public final /* synthetic */ defpackage.c8 riuEU0zW4;
                public final /* synthetic */ defpackage.yc0 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(24961);
                    defpackage.s70.IHQe1A4L2xu(defpackage.mj0.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, (defpackage.t10) obj2, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final boolean JlrlGoKF(defpackage.sv0 sv0Var) {
        return !sv0Var.EXtogiMhuM && sv0Var.F7NU4MC0GW;
    }

    public static java.lang.String NHJTzaLwkd(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int PAEGRtP0bX(android.os.Bundle bundle, java.lang.String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        defpackage.c80.abhbClRa(str);
        throw null;
    }

    public static final defpackage.bg0 QQUzIjv3iOC5(defpackage.bg0 bg0Var) {
        defpackage.ma0 ma0Var = bg0Var.EgCjBq0SZwJ.EgCjBq0SZwJ;
        while (true) {
            defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
            defpackage.ma0 ma0Var2 = null;
            if ((V7bD7b8KA != null ? V7bD7b8KA.JlrlGoKF : null) == null) {
                defpackage.bg0 QuX7t5UZl9 = ma0Var.yIx6ChFVk.F7NU4MC0GW.QuX7t5UZl9();
                QuX7t5UZl9.getClass();
                return QuX7t5UZl9;
            }
            defpackage.ma0 V7bD7b8KA2 = ma0Var.V7bD7b8KA();
            if (V7bD7b8KA2 != null) {
                ma0Var2 = V7bD7b8KA2.JlrlGoKF;
            }
            ma0Var2.getClass();
            defpackage.ma0 V7bD7b8KA3 = ma0Var.V7bD7b8KA();
            V7bD7b8KA3.getClass();
            ma0Var = V7bD7b8KA3.JlrlGoKF;
            ma0Var.getClass();
        }
    }

    public static final int SH1y5HwkJhh(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final boolean SiPhmbmu(java.lang.Object obj) {
        return obj == defpackage.ci0.oh6vYeIP;
    }

    public static final void SyNS6RMn(defpackage.gy gyVar, defpackage.xl0 xl0Var) {
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitChildren called on an unattached node");
        }
        defpackage.xl0 xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var = gyVar.adDC3e2L;
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        if (lj0Var2 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var2, lj0Var);
        } else {
            xl0Var2.oh6vYeIP(lj0Var2);
        }
        while (true) {
            int i = xl0Var2.AARZUJiTa;
            if (i == 0) {
                return;
            }
            defpackage.lj0 lj0Var3 = (defpackage.lj0) xl0Var2.ez2rX8ReCYw(i - 1);
            if ((lj0Var3.EXtogiMhuM & 1024) == 0) {
                defpackage.w70.EXtogiMhuM(xl0Var2, lj0Var3);
            } else {
                while (true) {
                    if (lj0Var3 == null) {
                        break;
                    }
                    if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                        defpackage.xl0 xl0Var3 = null;
                        while (lj0Var3 != null) {
                            if (lj0Var3 instanceof defpackage.gy) {
                                defpackage.gy gyVar2 = (defpackage.gy) lj0Var3;
                                if (gyVar2.kd6TUFXn && !defpackage.w70.D2vUnMij(gyVar2).WLpAkxCo) {
                                    if (gyVar2.pm90rNzI5F().IHQe1A4L2xu) {
                                        xl0Var.oh6vYeIP(gyVar2);
                                    } else {
                                        SyNS6RMn(gyVar2, xl0Var);
                                    }
                                }
                            } else if ((lj0Var3.AARZUJiTa & 1024) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                int i2 = 0;
                                for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                    if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            lj0Var3 = lj0Var4;
                                        } else {
                                            if (xl0Var3 == null) {
                                                xl0Var3 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var3 != null) {
                                                xl0Var3.oh6vYeIP(lj0Var3);
                                                lj0Var3 = null;
                                            }
                                            xl0Var3.oh6vYeIP(lj0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var3);
                        }
                    } else {
                        lj0Var3 = lj0Var3.SH1y5HwkJhh;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object TFRaUu83X3E(long j, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.ah1 ah1Var;
        int i;
        defpackage.rz0 rz0Var;
        if (fjVar instanceof defpackage.ah1) {
            ah1Var = (defpackage.ah1) fjVar;
            int i2 = ah1Var.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ah1Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ah1Var.riuEU0zW4;
                i = ah1Var.SH1y5HwkJhh;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (j > 0) {
                        defpackage.rz0 rz0Var2 = new defpackage.rz0();
                        try {
                            ah1Var.EXtogiMhuM = rz0Var2;
                            ah1Var.SH1y5HwkJhh = 1;
                            defpackage.zg1 zg1Var = new defpackage.zg1(j, ah1Var);
                            rz0Var2.adDC3e2L = zg1Var;
                            java.lang.Object Uv8CGu3G = Uv8CGu3G(zg1Var, k00Var);
                            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                            return Uv8CGu3G == vjVar ? vjVar : Uv8CGu3G;
                        } catch (defpackage.yg1 e) {
                            e = e;
                            rz0Var = rz0Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rz0Var = ah1Var.EXtogiMhuM;
                try {
                    defpackage.f70.nBH8hAHy(obj);
                    return obj;
                } catch (defpackage.yg1 e2) {
                    e = e2;
                }
                if (e.adDC3e2L != rz0Var.adDC3e2L) {
                    throw e;
                }
                return null;
            }
        }
        ah1Var = new defpackage.ah1(fjVar);
        java.lang.Object obj2 = ah1Var.riuEU0zW4;
        i = ah1Var.SH1y5HwkJhh;
        if (i != 0) {
        }
        if (e.adDC3e2L != rz0Var.adDC3e2L) {
        }
        return null;
    }

    public static final defpackage.t61 UsuH8pd5P(java.lang.Object obj) {
        if (obj != defpackage.ci0.oh6vYeIP) {
            return (defpackage.t61) obj;
        }
        defpackage.db.AARZUJiTa("Does not contain segment");
        return null;
    }

    public static final java.lang.Object Uv8CGu3G(defpackage.zg1 zg1Var, defpackage.k00 k00Var) {
        java.lang.Object bfVar;
        java.lang.Object AsxAYCCkb3Hi;
        defpackage.x80.UsuH8pd5P(zg1Var, true, new defpackage.nq(defpackage.fm.C0U8sNJm(zg1Var.SH1y5HwkJhh.xiZrDbcSW0()).AARZUJiTa(zg1Var.ez2rX8ReCYw, zg1Var, zg1Var.riuEU0zW4)));
        try {
            if (k00Var instanceof defpackage.v7) {
                defpackage.mj1.kNAkVymC(2, k00Var);
                bfVar = k00Var.adDC3e2L(zg1Var, zg1Var);
            } else {
                bfVar = defpackage.c80.wll2JLbTBC2(k00Var, zg1Var, zg1Var);
            }
        } catch (java.lang.Throwable th) {
            bfVar = new defpackage.bf(th, false);
        }
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (bfVar == vjVar || (AsxAYCCkb3Hi = zg1Var.AsxAYCCkb3Hi(bfVar)) == defpackage.gq1.xiZrDbcSW0) {
            return vjVar;
        }
        if (AsxAYCCkb3Hi instanceof defpackage.bf) {
            java.lang.Throwable th2 = ((defpackage.bf) AsxAYCCkb3Hi).IHQe1A4L2xu;
            if (!(th2 instanceof defpackage.yg1)) {
                throw th2;
            }
            if (((defpackage.yg1) th2).adDC3e2L != zg1Var) {
                throw th2;
            }
            if (bfVar instanceof defpackage.bf) {
                throw ((defpackage.bf) bfVar).IHQe1A4L2xu;
            }
        } else {
            bfVar = defpackage.gq1.SiPhmbmu(AsxAYCCkb3Hi);
        }
        return bfVar;
    }

    public static defpackage.FyULxpbU8bu V7bD7b8KA(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return new defpackage.FyULxpbU8bu(defpackage.p5.oh6vYeIP(view));
        }
        return null;
    }

    public static final java.lang.Object WLpAkxCo(defpackage.q21 q21Var, defpackage.g00 g00Var, defpackage.ej ejVar) {
        defpackage.yh1 yh1Var;
        defpackage.t01 t01Var = new defpackage.t01(g00Var, null, 2);
        defpackage.xh1 xh1Var = (defpackage.xh1) ejVar.xiZrDbcSW0().cnag84Bm(defpackage.xh1.xiZrDbcSW0);
        defpackage.nj njVar = xh1Var != null ? xh1Var.adDC3e2L : null;
        if (njVar != null) {
            return defpackage.fm.QPwENk36pDC(njVar, t01Var, ejVar);
        }
        defpackage.bb bbVar = new defpackage.bb(1, defpackage.c80.V7bD7b8KA(ejVar));
        bbVar.PAEGRtP0bX();
        try {
            yh1Var = q21Var.F7NU4MC0GW;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            bbVar.fnWB2E7cs(new java.lang.IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (yh1Var != null) {
            yh1Var.execute(new defpackage.r21(bbVar, q21Var, t01Var));
            return bbVar.kNAkVymC();
        }
        defpackage.x70.Ye0N2xE9Hc("internalTransactionExecutor");
        throw null;
    }

    public static final void XZx205DYe(defpackage.ia1 ia1Var, defpackage.b6 b6Var, int i) {
        while (true) {
            int i2 = ia1Var.V7bD7b8KA;
            if (i > i2 && i < ia1Var.kNAkVymC) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            ia1Var.hyxIchWRW();
            if (ia1Var.NHJTzaLwkd(ia1Var.V7bD7b8KA)) {
                b6Var.G3OKOH3wZRC();
            }
            ia1Var.SH1y5HwkJhh();
        }
    }

    public static android.content.Intent abhbClRa(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String NHJTzaLwkd = NHJTzaLwkd(context, componentName);
        if (NHJTzaLwkd == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), NHJTzaLwkd);
        return NHJTzaLwkd(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static final int adDC3e2L(int i, defpackage.xl0 xl0Var) {
        int i2 = xl0Var.AARZUJiTa - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            java.lang.Object[] objArr = xl0Var.adDC3e2L;
            int i5 = ((defpackage.r70) objArr[i4]).IHQe1A4L2xu;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((defpackage.r70) objArr[i3]).IHQe1A4L2xu) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final java.lang.Object cnag84Bm(defpackage.q21 q21Var, defpackage.g00 g00Var, defpackage.ej ejVar) {
        return (q21Var.riuEU0zW4() && q21Var.ez2rX8ReCYw() && q21Var.SH1y5HwkJhh()) ? g00Var.AARZUJiTa(ejVar) : ejVar.xiZrDbcSW0().cnag84Bm(defpackage.gb.AARZUJiTa) == null ? g00Var.AARZUJiTa(ejVar) : WLpAkxCo(q21Var, g00Var, ejVar);
    }

    public static defpackage.c81 ez2rX8ReCYw(defpackage.c81 c81Var) {
        defpackage.rg0 rg0Var = c81Var.adDC3e2L;
        rg0Var.oh6vYeIP();
        return rg0Var.DFo87pBq1E5 > 0 ? c81Var : defpackage.c81.xiZrDbcSW0;
    }

    public static final boolean fnWB2E7cs(defpackage.gy gyVar, int i, defpackage.g00 g00Var) {
        defpackage.kz0 kz0Var;
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.gy[16]);
        SyNS6RMn(gyVar, xl0Var);
        int i2 = xl0Var.AARZUJiTa;
        if (i2 <= 1) {
            defpackage.gy gyVar2 = (defpackage.gy) (i2 == 0 ? null : xl0Var.adDC3e2L[0]);
            if (gyVar2 != null) {
                return ((java.lang.Boolean) g00Var.AARZUJiTa(gyVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                defpackage.kz0 UsuH8pd5P = defpackage.mj1.UsuH8pd5P(gyVar);
                float f = UsuH8pd5P.IHQe1A4L2xu;
                float f2 = UsuH8pd5P.oh6vYeIP;
                kz0Var = new defpackage.kz0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
                    return false;
                }
                defpackage.kz0 UsuH8pd5P2 = defpackage.mj1.UsuH8pd5P(gyVar);
                float f3 = UsuH8pd5P2.r1MBDhnF;
                float f4 = UsuH8pd5P2.F7NU4MC0GW;
                kz0Var = new defpackage.kz0(f3, f4, f3, f4);
            }
            defpackage.gy EgCjBq0SZwJ = EgCjBq0SZwJ(xl0Var, kz0Var, i);
            if (EgCjBq0SZwJ != null) {
                return ((java.lang.Boolean) g00Var.AARZUJiTa(EgCjBq0SZwJ)).booleanValue();
            }
        }
        return false;
    }

    public static final long frpfPPIgqM9O(int i, defpackage.kz0 kz0Var, defpackage.kz0 kz0Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = kz0Var.IHQe1A4L2xu;
            f2 = kz0Var2.r1MBDhnF;
        } else if (i == 4) {
            f = kz0Var2.IHQe1A4L2xu;
            f2 = kz0Var.r1MBDhnF;
        } else if (i == 5) {
            f = kz0Var.oh6vYeIP;
            f2 = kz0Var2.F7NU4MC0GW;
        } else {
            if (i != 6) {
                defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = kz0Var2.oh6vYeIP;
            f2 = kz0Var.F7NU4MC0GW;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = kz0Var.oh6vYeIP;
            f3 = ((kz0Var.F7NU4MC0GW - f7) / 2.0f) + f7;
            f4 = kz0Var2.oh6vYeIP;
            f5 = kz0Var2.F7NU4MC0GW;
        } else {
            if (i != 5 && i != 6) {
                defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = kz0Var.IHQe1A4L2xu;
            f3 = ((kz0Var.r1MBDhnF - f8) / 2.0f) + f8;
            f4 = kz0Var2.IHQe1A4L2xu;
            f5 = kz0Var2.r1MBDhnF;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final java.lang.Object hkbnNdmy(long j, defpackage.AARZUJiTa aARZUJiTa, defpackage.aw0 aw0Var) {
        long j2;
        defpackage.ad1 ad1Var = defpackage.zr.adDC3e2L;
        boolean z = j > 0;
        if (z) {
            defpackage.bs bsVar = defpackage.bs.NANOSECONDS;
            long oh6vYeIP = defpackage.zr.oh6vYeIP(j, defpackage.x70.wKlPRKlRnfqr(999999L, bsVar));
            int i = ((int) oh6vYeIP) & 1;
            if (i == 1 && oh6vYeIP != defpackage.zr.xiZrDbcSW0 && oh6vYeIP != defpackage.zr.AARZUJiTa) {
                j2 = oh6vYeIP >> 1;
            } else if (oh6vYeIP == defpackage.zr.xiZrDbcSW0) {
                j2 = Long.MAX_VALUE;
            } else if (oh6vYeIP == defpackage.zr.AARZUJiTa) {
                j2 = Long.MIN_VALUE;
            } else {
                long j3 = oh6vYeIP >> 1;
                if (i != 0) {
                    bsVar = defpackage.bs.MILLISECONDS;
                }
                j2 = java.util.concurrent.TimeUnit.MILLISECONDS.convert(j3, bsVar.adDC3e2L);
            }
        } else {
            if (z) {
                defpackage.db.F7NU4MC0GW();
                return null;
            }
            j2 = 0;
        }
        if (j2 > 0) {
            return Uv8CGu3G(new defpackage.zg1(j2, aw0Var), aARZUJiTa);
        }
        throw new defpackage.yg1("Timed out immediately", null);
    }

    public static void hyxIchWRW(android.view.Window window, boolean z) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            defpackage.OtkytngK3Mr.adDC3e2L(window, z);
        } else {
            if (i >= 30) {
                defpackage.OtkytngK3Mr.F7NU4MC0GW(window, z);
                return;
            }
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final boolean kNAkVymC(int i, defpackage.c4 c4Var, defpackage.gy gyVar, defpackage.kz0 kz0Var) {
        if (mAr5m2L7gYDP(i, c4Var, gyVar, kz0Var)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.x70.WLpAkxCo(gyVar, i, new defpackage.xq0(((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner()).xiZrDbcSW0(), gyVar, kz0Var, i, c4Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float kd6TUFXn(float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat(((int) ((java.lang.Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final java.lang.Boolean lpprD5VAS(int i, defpackage.c4 c4Var, defpackage.gy gyVar, defpackage.kz0 kz0Var) {
        int ordinal = gyVar.fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (nBH8hAHy == null) {
                    defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = nBH8hAHy.fzubgBFo().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        java.lang.Boolean lpprD5VAS = lpprD5VAS(i, c4Var, nBH8hAHy, kz0Var);
                        if (!defpackage.x70.QoRHpC4k(lpprD5VAS, java.lang.Boolean.FALSE)) {
                            return lpprD5VAS;
                        }
                        if (kz0Var == null) {
                            if (nBH8hAHy.fzubgBFo() != defpackage.fy.xiZrDbcSW0) {
                                defpackage.db.AARZUJiTa("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            defpackage.gy C0U8sNJm = defpackage.mj1.C0U8sNJm(nBH8hAHy);
                            if (C0U8sNJm == null) {
                                defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                                return null;
                            }
                            kz0Var = defpackage.mj1.UsuH8pd5P(C0U8sNJm);
                        }
                        return java.lang.Boolean.valueOf(kNAkVymC(i, c4Var, gyVar, kz0Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            defpackage.db.F7NU4MC0GW();
                            return null;
                        }
                        defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (kz0Var == null) {
                    kz0Var = defpackage.mj1.UsuH8pd5P(nBH8hAHy);
                }
                return java.lang.Boolean.valueOf(kNAkVymC(i, c4Var, gyVar, kz0Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return gyVar.pm90rNzI5F().IHQe1A4L2xu ? (java.lang.Boolean) c4Var.AARZUJiTa(gyVar) : kz0Var == null ? java.lang.Boolean.valueOf(fnWB2E7cs(gyVar, i, c4Var)) : java.lang.Boolean.valueOf(mAr5m2L7gYDP(i, c4Var, gyVar, kz0Var));
                }
                defpackage.db.F7NU4MC0GW();
                return null;
            }
        }
        return java.lang.Boolean.valueOf(fnWB2E7cs(gyVar, i, c4Var));
    }

    public static final boolean mAr5m2L7gYDP(int i, defpackage.c4 c4Var, defpackage.gy gyVar, defpackage.kz0 kz0Var) {
        defpackage.gy EgCjBq0SZwJ;
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.gy[16]);
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitChildren called on an unattached node");
        }
        defpackage.xl0 xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var = gyVar.adDC3e2L;
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        if (lj0Var2 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var2, lj0Var);
        } else {
            xl0Var2.oh6vYeIP(lj0Var2);
        }
        while (true) {
            int i2 = xl0Var2.AARZUJiTa;
            if (i2 == 0) {
                break;
            }
            defpackage.lj0 lj0Var3 = (defpackage.lj0) xl0Var2.ez2rX8ReCYw(i2 - 1);
            if ((lj0Var3.EXtogiMhuM & 1024) == 0) {
                defpackage.w70.EXtogiMhuM(xl0Var2, lj0Var3);
            } else {
                while (true) {
                    if (lj0Var3 == null) {
                        break;
                    }
                    if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                        defpackage.xl0 xl0Var3 = null;
                        while (lj0Var3 != null) {
                            if (lj0Var3 instanceof defpackage.gy) {
                                defpackage.gy gyVar2 = (defpackage.gy) lj0Var3;
                                if (gyVar2.kd6TUFXn) {
                                    xl0Var.oh6vYeIP(gyVar2);
                                }
                            } else if ((lj0Var3.AARZUJiTa & 1024) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                int i3 = 0;
                                for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                    if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            lj0Var3 = lj0Var4;
                                        } else {
                                            if (xl0Var3 == null) {
                                                xl0Var3 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var3 != null) {
                                                xl0Var3.oh6vYeIP(lj0Var3);
                                                lj0Var3 = null;
                                            }
                                            xl0Var3.oh6vYeIP(lj0Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var3);
                        }
                    } else {
                        lj0Var3 = lj0Var3.SH1y5HwkJhh;
                    }
                }
            }
        }
        while (xl0Var.AARZUJiTa != 0 && (EgCjBq0SZwJ = EgCjBq0SZwJ(xl0Var, kz0Var, i)) != null) {
            if (EgCjBq0SZwJ.pm90rNzI5F().IHQe1A4L2xu) {
                return ((java.lang.Boolean) c4Var.AARZUJiTa(EgCjBq0SZwJ)).booleanValue();
            }
            if (kNAkVymC(i, c4Var, EgCjBq0SZwJ, kz0Var)) {
                return true;
            }
            xl0Var.SH1y5HwkJhh(EgCjBq0SZwJ);
        }
        return false;
    }

    public static final int nBH8hAHy(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void oh6vYeIP(defpackage.nm0 nm0Var, defpackage.r31 r31Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(233973821);
        if ((((t10Var.EXtogiMhuM(nm0Var) ? 4 : 2) | i | (t10Var.EXtogiMhuM(r31Var) ? 32 : 16)) & 147) == 146 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
        } else {
            defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.df0.IHQe1A4L2xu.IHQe1A4L2xu(nm0Var), defpackage.ye0.IHQe1A4L2xu.IHQe1A4L2xu(nm0Var), defpackage.cf0.IHQe1A4L2xu.IHQe1A4L2xu(nm0Var)}, defpackage.h1.XZx205DYe(1808964477, new defpackage.ma(3, r31Var, sfVar), t10Var), t10Var, 56);
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.qm0(nm0Var, r31Var, sfVar, i, 0);
        }
    }

    public static final boolean p4kuH6PDtgom(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final void r1MBDhnF(final defpackage.a01 a01Var, defpackage.mj0 mj0Var, boolean z, defpackage.t10 t10Var, final int i, final int i2) {
        boolean z2;
        int i3;
        defpackage.mj0 mj0Var2;
        final boolean z3;
        long j;
        a01Var.getClass();
        t10Var.QUKZkWRtw6(833642345);
        int i4 = i | (t10Var.xiZrDbcSW0(a01Var) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (t10Var.AARZUJiTa(z2) ? 256 : 128);
        }
        boolean z4 = true;
        if (t10Var.lpprD5VAS(i3 & 1, (i3 & 147) != 146)) {
            final boolean z5 = i5 != 0 ? true : z2;
            if (z5) {
                t10Var.AsxAYCCkb3Hi(-2028585778);
                t10Var.QoRHpC4k(false);
                j = defpackage.ig1.oh6vYeIP(a01Var.F7NU4MC0GW);
            } else {
                t10Var.AsxAYCCkb3Hi(-2028584592);
                j = ((defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu)).C0U8sNJm;
                t10Var.QoRHpC4k(false);
            }
            final long j2 = j;
            final long j3 = ((defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu)).kd6TUFXn;
            int hashCode = a01Var.IHQe1A4L2xu.hashCode();
            final int i6 = ((hashCode >>> 3) & 5) + 3;
            final double d = (hashCode & 63) * 0.09817477042468103d;
            boolean z6 = ((hashCode >>> 9) & 1) == 1;
            mj0Var2 = mj0Var;
            defpackage.mj0 r1MBDhnF = defpackage.ba1.r1MBDhnF(mj0Var2, 64.0f);
            boolean adDC3e2L = ((i3 & 896) == 256) | t10Var.adDC3e2L(j2) | t10Var.adDC3e2L(j3) | t10Var.F7NU4MC0GW(i6);
            java.lang.Object v5iciZok = t10Var.v5iciZok();
            if ((v5iciZok instanceof java.lang.Double) && d == ((java.lang.Number) v5iciZok).doubleValue()) {
                z4 = false;
            } else {
                t10Var.qvFH3dnF(java.lang.Double.valueOf(d));
            }
            boolean AARZUJiTa = adDC3e2L | z4 | t10Var.AARZUJiTa(z6);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (AARZUJiTa || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                final boolean z7 = z6;
                defpackage.g00 g00Var = new defpackage.g00() { // from class: b01
                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                        float f;
                        float f2;
                        defpackage.xr xrVar = (defpackage.xr) obj;
                        xrVar.getClass();
                        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> 32)) / 2.0f) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L)) / 2.0f) & 4294967295L);
                        float oh6vYeIP = defpackage.z91.oh6vYeIP(xrVar.r1MBDhnF()) * 0.42f;
                        boolean z8 = z5;
                        float f3 = z8 ? 0.35f : 0.12f;
                        long j4 = j2;
                        float f4 = oh6vYeIP * 1.15f;
                        xrVar.QQUzIjv3iOC5(new defpackage.py0(defpackage.fm.yIx6ChFVk(new defpackage.ae(defpackage.ae.oh6vYeIP(j4, f3)), new defpackage.ae(j3)), floatToRawIntBits, 1.4f * oh6vYeIP), f4, floatToRawIntBits, defpackage.nv.WLpAkxCo);
                        defpackage.xr.v5iciZok(xrVar, j4, f4, floatToRawIntBits, new defpackage.zc1(2.0f), 104);
                        long j5 = floatToRawIntBits;
                        defpackage.y2 IHQe1A4L2xu = defpackage.z2.IHQe1A4L2xu();
                        android.graphics.Path path = IHQe1A4L2xu.IHQe1A4L2xu;
                        int i7 = i6;
                        int i8 = i7 * 2;
                        int i9 = 0;
                        while (i9 < i8) {
                            if (i9 % 2 == 0) {
                                f = oh6vYeIP;
                                f2 = f;
                            } else {
                                f = 0.45f * oh6vYeIP;
                                f2 = oh6vYeIP;
                            }
                            long j6 = j5;
                            double d2 = ((i9 * 3.141592653589793d) / i7) + d;
                            int i10 = i7;
                            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j6 >> 32)) + ((float) (java.lang.Math.cos(d2) * f));
                            long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) + ((float) (java.lang.Math.sin(d2) * r6))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
                            if (i9 == 0) {
                                path.moveTo(java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)));
                            } else {
                                IHQe1A4L2xu.r1MBDhnF(java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)));
                            }
                            i9++;
                            i7 = i10;
                            oh6vYeIP = f2;
                            j5 = j6;
                        }
                        long j7 = j5;
                        float f5 = oh6vYeIP;
                        path.close();
                        defpackage.xr.FyULxpbU8bu(xrVar, IHQe1A4L2xu, defpackage.ae.oh6vYeIP(j4, z8 ? 0.85f : 0.3f), null, 60);
                        if (z7) {
                            defpackage.xr.v5iciZok(xrVar, defpackage.ae.oh6vYeIP(defpackage.ae.oh6vYeIP, 0.35f), f5 * 0.22f, j7, null, 120);
                        }
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                };
                t10Var.OtkytngK3Mr(g00Var);
                mAr5m2L7gYDP = g00Var;
            }
            defpackage.s21.IHQe1A4L2xu(r1MBDhnF, (defpackage.g00) mAr5m2L7gYDP, t10Var, 0);
            z3 = z5;
        } else {
            mj0Var2 = mj0Var;
            t10Var.WLpAkxCo();
            z3 = z2;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            final defpackage.mj0 mj0Var3 = mj0Var2;
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var3, z3, i, i2) { // from class: c01
                public final /* synthetic */ boolean AARZUJiTa;
                public final /* synthetic */ int EXtogiMhuM;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                {
                    this.EXtogiMhuM = i2;
                }

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(49);
                    defpackage.s70.r1MBDhnF(defpackage.a01.this, this.xiZrDbcSW0, this.AARZUJiTa, (defpackage.t10) obj, hyxIchWRW, this.EXtogiMhuM);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final boolean riuEU0zW4(int i, defpackage.kz0 kz0Var, defpackage.kz0 kz0Var2) {
        if (i == 3 || i == 4) {
            return kz0Var.F7NU4MC0GW > kz0Var2.oh6vYeIP && kz0Var.oh6vYeIP < kz0Var2.F7NU4MC0GW;
        }
        if (i == 5 || i == 6) {
            return kz0Var.r1MBDhnF > kz0Var2.IHQe1A4L2xu && kz0Var.IHQe1A4L2xu < kz0Var2.r1MBDhnF;
        }
        defpackage.db.AARZUJiTa("This function should only be used for 2-D focus search");
        return false;
    }

    public static final boolean v5iciZok(defpackage.kz0 kz0Var, defpackage.kz0 kz0Var2, defpackage.kz0 kz0Var3, int i) {
        if (!D2vUnMij(i, kz0Var, kz0Var3)) {
            return false;
        }
        if (D2vUnMij(i, kz0Var2, kz0Var3) && !EXtogiMhuM(kz0Var3, kz0Var, kz0Var2, i)) {
            return !EXtogiMhuM(kz0Var3, kz0Var2, kz0Var, i) && frpfPPIgqM9O(i, kz0Var3, kz0Var) < frpfPPIgqM9O(i, kz0Var3, kz0Var2);
        }
        return true;
    }

    public static final long wll2JLbTBC2(defpackage.sv0 sv0Var, boolean z) {
        long F7NU4MC0GW = defpackage.gq0.F7NU4MC0GW(sv0Var.r1MBDhnF, sv0Var.AARZUJiTa);
        if (z || !sv0Var.oh6vYeIP()) {
            return F7NU4MC0GW;
        }
        return 0L;
    }

    public static void xiZrDbcSW0(java.lang.StringBuilder sb, java.lang.Object obj, defpackage.g00 g00Var) {
        if (g00Var != null) {
            sb.append((java.lang.CharSequence) g00Var.AARZUJiTa(obj));
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

    public static final long yIx6ChFVk(long j, float f) {
        return (java.lang.Float.isNaN(f) || f >= 1.0f) ? j : defpackage.ae.oh6vYeIP(j, defpackage.ae.F7NU4MC0GW(j) * f);
    }

    public abstract int G3OKOH3wZRC(java.lang.String str, byte[] bArr, int i, int i2);

    public abstract java.lang.String QoRHpC4k(byte[] bArr, int i, int i2);
}
