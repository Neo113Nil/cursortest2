package defpackage;

/* loaded from: classes.dex */
public final class F7NU4MC0GW implements defpackage.j31, defpackage.ua, defpackage.dt, defpackage.id1, defpackage.eb, defpackage.hs0, defpackage.l41 {
    public java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public F7NU4MC0GW(int i) {
        this.adDC3e2L = i;
        switch (i) {
            case 13:
                break;
            case 14:
                this.xiZrDbcSW0 = new defpackage.tl1(0);
                this.AARZUJiTa = new defpackage.tl1(0);
                break;
            case 16:
                this.xiZrDbcSW0 = new defpackage.nl0();
                this.AARZUJiTa = new defpackage.nl0();
                break;
            case 17:
                this.xiZrDbcSW0 = new defpackage.xl0(new defpackage.ma0[16]);
                break;
            case 21:
                this.xiZrDbcSW0 = new java.util.LinkedHashMap();
                this.AARZUJiTa = new java.util.LinkedHashMap();
                break;
            case 27:
                this.xiZrDbcSW0 = new defpackage.c41(9);
                this.AARZUJiTa = new defpackage.gg0(16);
                break;
            case 28:
                this.xiZrDbcSW0 = new defpackage.xl0(new java.lang.ref.Reference[16]);
                this.AARZUJiTa = new java.lang.ref.ReferenceQueue();
                break;
            default:
                if (android.os.Build.VERSION.SDK_INT < 26) {
                    this.xiZrDbcSW0 = new defpackage.ZNF7fheNE(this);
                    break;
                } else {
                    this.xiZrDbcSW0 = new defpackage.flIYPhR0(this);
                    break;
                }
        }
    }

    public static void SyNS6RMn(android.database.SQLException sQLException) {
        java.lang.String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!defpackage.rc1.AsxAYCCkb3Hi(message, "unique", true) && !defpackage.rc1.AsxAYCCkb3Hi(message, "2067", false) && !defpackage.rc1.AsxAYCCkb3Hi(message, "1555", false)) {
            throw sQLException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [lj0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [lj0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void kd6TUFXn(defpackage.ma0 ma0Var) {
        if (ma0Var.TFRaUu83X3E > 0) {
            if (ma0Var.wll2JLbTBC2.F7NU4MC0GW == defpackage.ia0.riuEU0zW4 && !ma0Var.QoRHpC4k() && !ma0Var.G3OKOH3wZRC() && !ma0Var.WLpAkxCo && ma0Var.yIx6ChFVk()) {
                defpackage.lj0 lj0Var = ma0Var.yIx6ChFVk.xiZrDbcSW0;
                if ((lj0Var.EXtogiMhuM & 256) != 0) {
                    while (lj0Var != null) {
                        if ((lj0Var.AARZUJiTa & 256) != 0) {
                            defpackage.ln lnVar = lj0Var;
                            ?? r5 = 0;
                            while (lnVar != 0) {
                                if (lnVar instanceof defpackage.h20) {
                                    defpackage.h20 h20Var = (defpackage.h20) lnVar;
                                    h20Var.QoRHpC4k(defpackage.w70.nBH8hAHy(h20Var, 256));
                                } else if ((lnVar.AARZUJiTa & 256) != 0 && (lnVar instanceof defpackage.ln)) {
                                    defpackage.lj0 lj0Var2 = lnVar.fnWB2E7cs;
                                    int i = 0;
                                    lnVar = lnVar;
                                    r5 = r5;
                                    while (lj0Var2 != null) {
                                        if ((lj0Var2.AARZUJiTa & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                lnVar = lj0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lnVar != 0) {
                                                    r5.oh6vYeIP(lnVar);
                                                    lnVar = 0;
                                                }
                                                r5.oh6vYeIP(lj0Var2);
                                            }
                                        }
                                        lj0Var2 = lj0Var2.SH1y5HwkJhh;
                                        lnVar = lnVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lnVar = defpackage.w70.riuEU0zW4(r5);
                            }
                        }
                        if ((lj0Var.EXtogiMhuM & 256) == 0) {
                            break;
                        } else {
                            lj0Var = lj0Var.SH1y5HwkJhh;
                        }
                    }
                }
            }
            ma0Var.hkbnNdmy = false;
            defpackage.xl0 QQUzIjv3iOC5 = ma0Var.QQUzIjv3iOC5();
            java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
            int i2 = QQUzIjv3iOC5.AARZUJiTa;
            for (int i3 = 0; i3 < i2; i3++) {
                kd6TUFXn((defpackage.ma0) objArr[i3]);
            }
        }
    }

    @Override // defpackage.hs0
    public boolean AARZUJiTa() {
        return ((defpackage.hs0) this.xiZrDbcSW0).AARZUJiTa();
    }

    public void C0U8sNJm() {
        if (!((defpackage.h41) this.xiZrDbcSW0).EXtogiMhuM) {
            defpackage.db.AARZUJiTa("Can not perform this action after onSaveInstanceState");
            return;
        }
        defpackage.iz0 iz0Var = (defpackage.iz0) this.AARZUJiTa;
        if (iz0Var == null) {
            iz0Var = new defpackage.iz0(this);
        }
        this.AARZUJiTa = iz0Var;
        try {
            defpackage.hd0.class.getDeclaredConstructor(null);
            defpackage.iz0 iz0Var2 = (defpackage.iz0) this.AARZUJiTa;
            if (iz0Var2 != null) {
                iz0Var2.IHQe1A4L2xu.add(defpackage.hd0.class.getName());
            }
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("Class " + defpackage.hd0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public boolean DFo87pBq1E5() {
        synchronized (this) {
            if (((java.util.concurrent.atomic.AtomicBoolean) this.AARZUJiTa).get()) {
                return false;
            }
            ((java.util.concurrent.atomic.AtomicInteger) this.xiZrDbcSW0).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.dt
    public boolean EXtogiMhuM(java.lang.CharSequence charSequence, int i, int i2, defpackage.wj1 wj1Var) {
        if ((wj1Var.r1MBDhnF & 4) > 0) {
            return true;
        }
        if (((defpackage.tk1) this.xiZrDbcSW0) == null) {
            this.xiZrDbcSW0 = new defpackage.tk1(charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(charSequence));
        }
        ((defpackage.ad1) this.AARZUJiTa).getClass();
        ((defpackage.tk1) this.xiZrDbcSW0).setSpan(new defpackage.xj1(wj1Var), i, i2, 33);
        return true;
    }

    public defpackage.ii0 EgCjBq0SZwJ() {
        return (defpackage.ii0) ((defpackage.qt0) this.AARZUJiTa).getValue();
    }

    @Override // defpackage.l41
    public java.lang.Object F7NU4MC0GW(java.lang.Object obj) {
        return ((defpackage.g00) this.AARZUJiTa).AARZUJiTa(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G3OKOH3wZRC() {
        java.lang.Object[] objArr;
        defpackage.xl0 xl0Var = (defpackage.xl0) this.xiZrDbcSW0;
        java.util.Arrays.sort(xl0Var.adDC3e2L, 0, xl0Var.AARZUJiTa, defpackage.hy.F7NU4MC0GW);
        int i = xl0Var.AARZUJiTa;
        defpackage.ma0[] ma0VarArr = (defpackage.ma0[]) this.AARZUJiTa;
        if (ma0VarArr != null) {
            int length = ma0VarArr.length;
            objArr = ma0VarArr;
        }
        objArr = new defpackage.ma0[java.lang.Math.max(16, i)];
        this.AARZUJiTa = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = xl0Var.adDC3e2L[i2];
        }
        xl0Var.AARZUJiTa();
        while (true) {
            i--;
            if (-1 >= i) {
                this.AARZUJiTa = objArr;
                return;
            }
            defpackage.ma0 ma0Var = objArr[i];
            ma0Var.getClass();
            if (ma0Var.hkbnNdmy) {
                kd6TUFXn(ma0Var);
            }
            objArr[i] = 0;
        }
    }

    @Override // defpackage.dt
    public java.lang.Object IHQe1A4L2xu() {
        return (defpackage.tk1) this.xiZrDbcSW0;
    }

    public boolean JlrlGoKF(long j) {
        java.lang.Object obj;
        java.util.List list = (java.util.List) ((defpackage.F7NU4MC0GW) this.AARZUJiTa).xiZrDbcSW0;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (defpackage.c80.G3OKOH3wZRC(((defpackage.uv0) obj).IHQe1A4L2xu, j)) {
                break;
            }
            i++;
        }
        defpackage.uv0 uv0Var = (defpackage.uv0) obj;
        if (uv0Var != null) {
            return uv0Var.EXtogiMhuM;
        }
        return false;
    }

    public void NHJTzaLwkd(java.lang.String str, defpackage.g41 g41Var) {
        g41Var.getClass();
        defpackage.h41 h41Var = (defpackage.h41) this.xiZrDbcSW0;
        synchronized (h41Var.r1MBDhnF) {
            if (h41Var.F7NU4MC0GW.containsKey(str)) {
                throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            h41Var.F7NU4MC0GW.put(str, g41Var);
        }
    }

    public void PAEGRtP0bX(android.os.Bundle bundle) {
        defpackage.h41 h41Var = (defpackage.h41) this.xiZrDbcSW0;
        defpackage.i41 i41Var = h41Var.IHQe1A4L2xu;
        if (!h41Var.adDC3e2L) {
            h41Var.IHQe1A4L2xu();
        }
        if (i41Var.EXtogiMhuM().EXtogiMhuM.compareTo(defpackage.nd0.EXtogiMhuM) >= 0) {
            defpackage.db.EgCjBq0SZwJ(i41Var.EXtogiMhuM().EXtogiMhuM, "performRestore cannot be called when owner is ");
            return;
        }
        if (h41Var.AARZUJiTa) {
            defpackage.db.AARZUJiTa("SavedStateRegistry was already restored.");
            return;
        }
        android.os.Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            android.os.Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                defpackage.c80.abhbClRa("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        h41Var.xiZrDbcSW0 = bundle2;
        h41Var.AARZUJiTa = true;
    }

    public void QQUzIjv3iOC5() {
        if (((defpackage.h50) this.AARZUJiTa) != null) {
            this.AARZUJiTa = null;
            ((defpackage.dd) this.xiZrDbcSW0).fzubgBFo(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x0892, code lost:
    
        if (r3 == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        if (defpackage.f71.SH1y5HwkJhh(4, r7).isEmpty() != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0874 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a3d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0ac6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0cc0  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0ce7  */
    /* JADX WARN: Type inference failed for: r3v106, types: [nt] */
    /* JADX WARN: Type inference failed for: r3v107, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2, types: [dOmtpLcqqI1y, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r45v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public defpackage.dOmtpLcqqI1y QoRHpC4k(int i) {
        float f;
        android.os.Bundle bundle;
        android.view.accessibility.AccessibilityManager accessibilityManager;
        defpackage.qb1 qb1Var;
        defpackage.a1 a1Var;
        defpackage.v0 v0Var;
        defpackage.vk0 vk0Var;
        defpackage.f71 f71Var;
        defpackage.ma0 ma0Var;
        defpackage.l21 l21Var;
        defpackage.b71 b71Var;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo;
        defpackage.dOmtpLcqqI1y domtplcqqi1y;
        android.text.SpannableString spannableString;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo3;
        defpackage.l21 l21Var2;
        int i2;
        defpackage.dOmtpLcqqI1y domtplcqqi1y2;
        java.lang.Object AARZUJiTa;
        int i3;
        java.lang.Object AARZUJiTa2;
        java.lang.Object AARZUJiTa3;
        defpackage.a1 a1Var2;
        boolean z;
        defpackage.f71 f71Var2;
        defpackage.kz0 DFo87pBq1E5;
        boolean z2;
        defpackage.TFRaUu83X3E tFRaUu83X3E;
        defpackage.TFRaUu83X3E tFRaUu83X3E2;
        defpackage.TFRaUu83X3E tFRaUu83X3E3;
        java.lang.String JlrlGoKF;
        defpackage.ey0 ey0Var;
        java.lang.Object AARZUJiTa4;
        defpackage.sd sdVar;
        defpackage.f51 f51Var;
        defpackage.f51 f51Var2;
        int i4;
        int F7NU4MC0GW;
        defpackage.v0 v0Var2;
        int F7NU4MC0GW2;
        java.lang.String str;
        defpackage.dOmtpLcqqI1y domtplcqqi1y3;
        java.lang.Object AARZUJiTa5;
        java.lang.Object AARZUJiTa6;
        defpackage.ma0 ma0Var2;
        java.util.List list;
        defpackage.ma0 V7bD7b8KA;
        boolean z3;
        boolean z4;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i5;
        boolean z5;
        defpackage.f71 f71Var3;
        int i6;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        defpackage.a1 a1Var3 = (defpackage.a1) this.AARZUJiTa;
        android.view.accessibility.AccessibilityManager accessibilityManager2 = a1Var3.ez2rX8ReCYw;
        defpackage.v0 v0Var3 = a1Var3.EXtogiMhuM;
        if (v0Var3.getComposeViewContext().r1MBDhnF.EXtogiMhuM().EXtogiMhuM == defpackage.nd0.adDC3e2L) {
            if (!accessibilityManager2.isEnabled()) {
                domtplcqqi1y3 = new defpackage.dOmtpLcqqI1y(android.view.accessibility.AccessibilityNodeInfo.obtain());
                i3 = i;
                a1Var2 = a1Var3;
                if (a1Var2.EgCjBq0SZwJ) {
                    if (i3 == a1Var2.cnag84Bm) {
                        a1Var2.G3OKOH3wZRC = domtplcqqi1y3;
                    }
                    if (i3 == a1Var2.QoRHpC4k) {
                        a1Var2.kd6TUFXn = domtplcqqi1y3;
                    }
                }
                return domtplcqqi1y3;
            }
            domtplcqqi1y3 = null;
            i3 = i;
            a1Var2 = a1Var3;
            if (a1Var2.EgCjBq0SZwJ) {
            }
            return domtplcqqi1y3;
        }
        defpackage.h71 h71Var = (defpackage.h71) a1Var3.ez2rX8ReCYw().oh6vYeIP(i);
        if (h71Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                domtplcqqi1y3 = new defpackage.dOmtpLcqqI1y(android.view.accessibility.AccessibilityNodeInfo.obtain());
                i3 = i;
                a1Var2 = a1Var3;
                if (a1Var2.EgCjBq0SZwJ) {
                }
                return domtplcqqi1y3;
            }
            domtplcqqi1y3 = null;
            i3 = i;
            a1Var2 = a1Var3;
            if (a1Var2.EgCjBq0SZwJ) {
            }
            return domtplcqqi1y3;
        }
        defpackage.f71 f71Var4 = h71Var.IHQe1A4L2xu;
        defpackage.b71 ez2rX8ReCYw = f71Var4.ez2rX8ReCYw();
        defpackage.ma0 ma0Var3 = f71Var4.r1MBDhnF;
        java.lang.Object AARZUJiTa7 = ez2rX8ReCYw.adDC3e2L.AARZUJiTa(defpackage.j71.cnag84Bm);
        if (AARZUJiTa7 == null) {
            AARZUJiTa7 = null;
        }
        boolean QoRHpC4k = defpackage.x70.QoRHpC4k(AARZUJiTa7, java.lang.Boolean.TRUE);
        if (QoRHpC4k) {
            if (!(android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.EoOhNTTfIN7K.adDC3e2L(accessibilityManager2) : true)) {
                i3 = i;
                a1Var2 = a1Var3;
                domtplcqqi1y3 = null;
                if (a1Var2.EgCjBq0SZwJ) {
                }
                return domtplcqqi1y3;
            }
        }
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        defpackage.dOmtpLcqqI1y domtplcqqi1y4 = new defpackage.dOmtpLcqqI1y(obtain);
        int i7 = android.os.Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            defpackage.EoOhNTTfIN7K.AARZUJiTa(obtain, QoRHpC4k);
            f = 0.0f;
        } else {
            f = 0.0f;
            domtplcqqi1y4.xiZrDbcSW0(64, QoRHpC4k);
        }
        if (i == -1) {
            java.lang.Object parentForAccessibility = v0Var3.getParentForAccessibility();
            bundle = 0;
            android.view.View view = parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null;
            domtplcqqi1y4.oh6vYeIP = -1;
            obtain.setParent(view);
        } else {
            bundle = 0;
            defpackage.f71 JlrlGoKF2 = f71Var4.JlrlGoKF();
            java.lang.Integer valueOf2 = JlrlGoKF2 != null ? java.lang.Integer.valueOf(JlrlGoKF2.xiZrDbcSW0) : null;
            if (valueOf2 == null) {
                defpackage.x50.r1MBDhnF("semanticsNode " + i + " has null parent");
                throw new defpackage.cf();
            }
            int intValue = valueOf2.intValue();
            if (intValue == v0Var3.getSemanticsOwner().IHQe1A4L2xu().xiZrDbcSW0) {
                intValue = -1;
            }
            domtplcqqi1y4.oh6vYeIP = intValue;
            obtain.setParent(v0Var3, intValue);
        }
        domtplcqqi1y4.r1MBDhnF = i;
        obtain.setSource(v0Var3, i);
        obtain.setBoundsInScreen(a1Var3.r1MBDhnF(h71Var));
        defpackage.vk0 vk0Var2 = a1Var3.Uv8CGu3G;
        defpackage.qb1 qb1Var2 = a1Var3.PAEGRtP0bX;
        android.content.res.Resources resources = v0Var3.getContext().getResources();
        domtplcqqi1y4.AARZUJiTa("android.view.View");
        defpackage.b71 b71Var2 = f71Var4.F7NU4MC0GW;
        defpackage.nl0 nl0Var = b71Var2.adDC3e2L;
        if (nl0Var.r1MBDhnF(defpackage.j71.frpfPPIgqM9O)) {
            domtplcqqi1y4.AARZUJiTa("android.widget.EditText");
        }
        if (nl0Var.r1MBDhnF(defpackage.j71.UsuH8pd5P)) {
            domtplcqqi1y4.AARZUJiTa("android.widget.TextView");
        }
        java.lang.Object AARZUJiTa8 = nl0Var.AARZUJiTa(defpackage.j71.NHJTzaLwkd);
        if (AARZUJiTa8 == null) {
            AARZUJiTa8 = bundle;
        }
        defpackage.l21 l21Var3 = (defpackage.l21) AARZUJiTa8;
        if (l21Var3 != null) {
            int i8 = l21Var3.IHQe1A4L2xu;
            if (f71Var4.cnag84Bm()) {
                accessibilityManager = accessibilityManager2;
                i6 = 4;
                qb1Var = qb1Var2;
            } else {
                accessibilityManager = accessibilityManager2;
                i6 = 4;
                qb1Var = qb1Var2;
            }
            if (i8 == i6) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.combinations.spin.balbi.R.string.tab));
            } else if (i8 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(com.combinations.spin.balbi.R.string.switch_role));
            } else {
                java.lang.String yIx6ChFVk = defpackage.a70.yIx6ChFVk(i8);
                if (i8 != 5 || f71Var4.G3OKOH3wZRC() || b71Var2.AARZUJiTa) {
                    domtplcqqi1y4.AARZUJiTa(yIx6ChFVk);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            qb1Var = qb1Var2;
        }
        obtain.setPackageName(v0Var3.getContext().getPackageName());
        obtain.setImportantForAccessibility(defpackage.h1.frpfPPIgqM9O(f71Var4));
        boolean adDC3e2L = i7 >= 34 ? defpackage.EoOhNTTfIN7K.adDC3e2L(accessibilityManager) : true;
        java.util.List SH1y5HwkJhh = defpackage.f71.SH1y5HwkJhh(4, f71Var4);
        int size = SH1y5HwkJhh.size();
        boolean z6 = adDC3e2L;
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = size;
            defpackage.f71 f71Var5 = (defpackage.f71) SH1y5HwkJhh.get(i10);
            java.util.List list2 = SH1y5HwkJhh;
            defpackage.x60 ez2rX8ReCYw2 = a1Var3.ez2rX8ReCYw();
            int i12 = i10;
            int i13 = f71Var5.xiZrDbcSW0;
            if (ez2rX8ReCYw2.IHQe1A4L2xu(i13)) {
                if (v0Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(f71Var5.r1MBDhnF) != null) {
                    defpackage.db.kd6TUFXn();
                    return bundle;
                }
                if (i13 != -1) {
                    defpackage.h71 h71Var2 = (defpackage.h71) a1Var3.ez2rX8ReCYw().oh6vYeIP(i13);
                    if (h71Var2 == null || (f71Var3 = h71Var2.IHQe1A4L2xu) == null) {
                        z5 = false;
                    } else {
                        java.lang.Object AARZUJiTa9 = f71Var3.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.cnag84Bm);
                        if (AARZUJiTa9 == null) {
                            AARZUJiTa9 = bundle;
                        }
                        z5 = defpackage.x70.QoRHpC4k(AARZUJiTa9, java.lang.Boolean.TRUE);
                    }
                    if (z6 || !z5) {
                        obtain.addChild(v0Var3, i13);
                    }
                    vk0Var2.xiZrDbcSW0(i13, i9);
                    i9++;
                }
            }
            i10 = i12 + 1;
            SH1y5HwkJhh = list2;
            size = i11;
        }
        int i14 = a1Var3.cnag84Bm;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo4 = domtplcqqi1y4.IHQe1A4L2xu;
        if (i == i14) {
            accessibilityNodeInfo4.setAccessibilityFocused(true);
            domtplcqqi1y4.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.F7NU4MC0GW);
        } else {
            accessibilityNodeInfo4.setAccessibilityFocused(false);
            domtplcqqi1y4.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.r1MBDhnF);
        }
        defpackage.l5 SiPhmbmu = defpackage.mj1.SiPhmbmu(f71Var4);
        if (SiPhmbmu != null) {
            v0Var3.getFontFamilyResolver();
            defpackage.qn density = v0Var3.getDensity();
            defpackage.v5 v5Var = a1Var3.wll2JLbTBC2;
            v0Var = v0Var3;
            java.lang.String str2 = SiPhmbmu.xiZrDbcSW0;
            ma0Var = ma0Var3;
            java.util.List list3 = SiPhmbmu.adDC3e2L;
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
            java.util.ArrayList arrayList3 = SiPhmbmu.AARZUJiTa;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                a1Var = a1Var3;
                int i15 = 0;
                while (i15 < size2) {
                    java.util.ArrayList arrayList4 = arrayList3;
                    defpackage.k5 k5Var = (defpackage.k5) arrayList3.get(i15);
                    int i16 = i15;
                    defpackage.ob1 ob1Var = (defpackage.ob1) k5Var.IHQe1A4L2xu;
                    int i17 = size2;
                    int i18 = k5Var.oh6vYeIP;
                    int i19 = k5Var.r1MBDhnF;
                    defpackage.vk0 vk0Var3 = vk0Var2;
                    defpackage.l21 l21Var4 = l21Var3;
                    defpackage.b71 b71Var3 = b71Var2;
                    long r1MBDhnF = ob1Var.IHQe1A4L2xu.r1MBDhnF();
                    defpackage.f71 f71Var6 = f71Var4;
                    long j = ob1Var.oh6vYeIP;
                    defpackage.dz dzVar = ob1Var.r1MBDhnF;
                    defpackage.bz bzVar = ob1Var.F7NU4MC0GW;
                    defpackage.jf1 jf1Var = ob1Var.SH1y5HwkJhh;
                    defpackage.ff0 ff0Var = ob1Var.ez2rX8ReCYw;
                    android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                    defpackage.dOmtpLcqqI1y domtplcqqi1y5 = domtplcqqi1y4;
                    long j2 = ob1Var.JlrlGoKF;
                    defpackage.ff1 ff1Var = ob1Var.DFo87pBq1E5;
                    defpackage.if1 if1Var = ob1Var.IHQe1A4L2xu;
                    android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                    defpackage.a70.v5iciZok(spannableString2, (defpackage.ae.r1MBDhnF(r1MBDhnF, if1Var.r1MBDhnF()) ? if1Var : r1MBDhnF != 16 ? new defpackage.me(r1MBDhnF) : defpackage.ad1.EXtogiMhuM).r1MBDhnF(), i18, i19);
                    android.text.SpannableString spannableString3 = spannableString2;
                    defpackage.a70.D2vUnMij(spannableString3, j, density, i18, i19);
                    if (dzVar == null && bzVar == null) {
                        i5 = 33;
                    } else {
                        i5 = 33;
                        spannableString3.setSpan(new android.text.style.StyleSpan(defpackage.w70.abhbClRa(dzVar == null ? defpackage.dz.AARZUJiTa : dzVar, bzVar != null ? bzVar.IHQe1A4L2xu : 0)), i18, i19, 33);
                    }
                    if (ff1Var != null) {
                        int i20 = ff1Var.IHQe1A4L2xu;
                        if ((i20 | 1) == i20) {
                            spannableString3.setSpan(new android.text.style.UnderlineSpan(), i18, i19, i5);
                        }
                        if ((i20 | 2) == i20) {
                            spannableString3.setSpan(new android.text.style.StrikethroughSpan(), i18, i19, i5);
                        }
                    }
                    if (jf1Var != null) {
                        spannableString3.setSpan(new android.text.style.ScaleXSpan(jf1Var.IHQe1A4L2xu), i18, i19, i5);
                    }
                    defpackage.a70.frpfPPIgqM9O(spannableString3, ff0Var, i18, i19);
                    if (j2 != 16) {
                        spannableString3.setSpan(new android.text.style.BackgroundColorSpan(defpackage.w70.yIx6ChFVk(j2)), i18, i19, i5);
                    }
                    i15 = i16 + 1;
                    spannableString2 = spannableString3;
                    accessibilityNodeInfo4 = accessibilityNodeInfo6;
                    arrayList3 = arrayList4;
                    size2 = i17;
                    vk0Var2 = vk0Var3;
                    b71Var2 = b71Var3;
                    l21Var3 = l21Var4;
                    f71Var4 = f71Var6;
                    obtain = accessibilityNodeInfo5;
                    domtplcqqi1y4 = domtplcqqi1y5;
                }
            } else {
                a1Var = a1Var3;
            }
            vk0Var = vk0Var2;
            f71Var = f71Var4;
            l21Var = l21Var3;
            b71Var = b71Var2;
            accessibilityNodeInfo = obtain;
            domtplcqqi1y = domtplcqqi1y4;
            android.text.SpannableString spannableString4 = spannableString2;
            accessibilityNodeInfo2 = accessibilityNodeInfo4;
            int length = str2.length();
            ?? r3 = defpackage.nt.adDC3e2L;
            if (list3 != null) {
                arrayList = new java.util.ArrayList(list3.size());
                int size3 = list3.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    java.lang.Object obj = list3.get(i21);
                    defpackage.k5 k5Var2 = (defpackage.k5) obj;
                    if ((k5Var2.IHQe1A4L2xu instanceof defpackage.ul1) && defpackage.m5.IHQe1A4L2xu(0, length, k5Var2.oh6vYeIP, k5Var2.r1MBDhnF)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r3;
            }
            int size4 = arrayList.size();
            for (int i22 = 0; i22 < size4; i22++) {
                defpackage.k5 k5Var3 = (defpackage.k5) arrayList.get(i22);
                defpackage.ul1 ul1Var = (defpackage.ul1) k5Var3.IHQe1A4L2xu;
                int i23 = k5Var3.oh6vYeIP;
                int i24 = k5Var3.r1MBDhnF;
                if (!(ul1Var instanceof defpackage.ul1)) {
                    defpackage.db.F7NU4MC0GW();
                    return bundle;
                }
                spannableString4.setSpan(new android.text.style.TtsSpan.VerbatimBuilder(ul1Var.IHQe1A4L2xu).build(), i23, i24, 33);
            }
            int length2 = str2.length();
            if (list3 != null) {
                arrayList2 = new java.util.ArrayList(list3.size());
                int size5 = list3.size();
                for (int i25 = 0; i25 < size5; i25++) {
                    java.lang.Object obj2 = list3.get(i25);
                    defpackage.k5 k5Var4 = (defpackage.k5) obj2;
                    if ((k5Var4.IHQe1A4L2xu instanceof defpackage.gl1) && defpackage.m5.IHQe1A4L2xu(0, length2, k5Var4.oh6vYeIP, k5Var4.r1MBDhnF)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r3;
            }
            int size6 = arrayList2.size();
            for (int i26 = 0; i26 < size6; i26++) {
                defpackage.k5 k5Var5 = (defpackage.k5) arrayList2.get(i26);
                defpackage.gl1 gl1Var = (defpackage.gl1) k5Var5.IHQe1A4L2xu;
                int i27 = k5Var5.oh6vYeIP;
                int i28 = k5Var5.r1MBDhnF;
                java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) v5Var.oh6vYeIP;
                java.lang.Object obj3 = weakHashMap.get(gl1Var);
                if (obj3 == null) {
                    obj3 = new android.text.style.URLSpan(gl1Var.IHQe1A4L2xu);
                    weakHashMap.put(gl1Var, obj3);
                }
                spannableString4.setSpan((android.text.style.URLSpan) obj3, i27, i28, 33);
            }
            int length3 = str2.length();
            if (list3 != null) {
                r3 = new java.util.ArrayList(list3.size());
                int size7 = list3.size();
                for (int i29 = 0; i29 < size7; i29++) {
                    java.lang.Object obj4 = list3.get(i29);
                    defpackage.k5 k5Var6 = (defpackage.k5) obj4;
                    if ((k5Var6.IHQe1A4L2xu instanceof defpackage.qe0) && defpackage.m5.IHQe1A4L2xu(0, length3, k5Var6.oh6vYeIP, k5Var6.r1MBDhnF)) {
                        r3.add(obj4);
                    }
                }
            }
            int size8 = r3.size();
            for (int i30 = 0; i30 < size8; i30++) {
                defpackage.k5 k5Var7 = (defpackage.k5) r3.get(i30);
                int i31 = k5Var7.oh6vYeIP;
                java.lang.Object obj5 = k5Var7.IHQe1A4L2xu;
                int i32 = k5Var7.r1MBDhnF;
                if (i31 != i32) {
                    defpackage.qe0 qe0Var = (defpackage.qe0) obj5;
                    if (qe0Var instanceof defpackage.pe0) {
                        obj5.getClass();
                        defpackage.pe0 pe0Var = (defpackage.pe0) obj5;
                        defpackage.k5 k5Var8 = new defpackage.k5(i31, i32, pe0Var);
                        java.util.WeakHashMap weakHashMap2 = (java.util.WeakHashMap) v5Var.r1MBDhnF;
                        java.lang.Object obj6 = weakHashMap2.get(k5Var8);
                        if (obj6 == null) {
                            obj6 = new android.text.style.URLSpan(pe0Var.IHQe1A4L2xu);
                            weakHashMap2.put(k5Var8, obj6);
                        }
                        spannableString4.setSpan((android.text.style.URLSpan) obj6, i31, i32, 33);
                    } else {
                        java.util.WeakHashMap weakHashMap3 = (java.util.WeakHashMap) v5Var.F7NU4MC0GW;
                        java.lang.Object obj7 = weakHashMap3.get(k5Var7);
                        if (obj7 == null) {
                            obj7 = new defpackage.cg(qe0Var);
                            weakHashMap3.put(k5Var7, obj7);
                        }
                        spannableString4.setSpan((android.text.style.ClickableSpan) obj7, i31, i32, 33);
                    }
                }
            }
            spannableString = (android.text.SpannableString) defpackage.a1.p4kuH6PDtgom(spannableString4);
        } else {
            a1Var = a1Var3;
            v0Var = v0Var3;
            vk0Var = vk0Var2;
            f71Var = f71Var4;
            ma0Var = ma0Var3;
            l21Var = l21Var3;
            b71Var = b71Var2;
            accessibilityNodeInfo = obtain;
            domtplcqqi1y = domtplcqqi1y4;
            spannableString = bundle;
            accessibilityNodeInfo2 = accessibilityNodeInfo4;
        }
        accessibilityNodeInfo2.setText(spannableString);
        defpackage.m71 m71Var = defpackage.j71.XZx205DYe;
        if (nl0Var.r1MBDhnF(m71Var)) {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
            accessibilityNodeInfo3.setContentInvalid(true);
            java.lang.Object AARZUJiTa10 = nl0Var.AARZUJiTa(m71Var);
            if (AARZUJiTa10 == null) {
                AARZUJiTa10 = bundle;
            }
            accessibilityNodeInfo3.setError((java.lang.CharSequence) AARZUJiTa10);
        } else {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
        }
        defpackage.f71 f71Var7 = f71Var;
        java.lang.String frpfPPIgqM9O = defpackage.mj1.frpfPPIgqM9O(f71Var7, resources);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.OtkytngK3Mr.AARZUJiTa(accessibilityNodeInfo2, frpfPPIgqM9O);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", frpfPPIgqM9O);
        }
        accessibilityNodeInfo3.setCheckable(defpackage.mj1.D2vUnMij(f71Var7));
        java.lang.Object AARZUJiTa11 = nl0Var.AARZUJiTa(defpackage.j71.yIx6ChFVk);
        if (AARZUJiTa11 == null) {
            AARZUJiTa11 = bundle;
        }
        defpackage.fh1 fh1Var = (defpackage.fh1) AARZUJiTa11;
        if (fh1Var != null) {
            if (fh1Var == defpackage.fh1.adDC3e2L) {
                accessibilityNodeInfo2.setChecked(true);
            } else if (fh1Var == defpackage.fh1.xiZrDbcSW0) {
                accessibilityNodeInfo2.setChecked(false);
            }
        }
        java.lang.Object AARZUJiTa12 = nl0Var.AARZUJiTa(defpackage.j71.p4kuH6PDtgom);
        if (AARZUJiTa12 == null) {
            AARZUJiTa12 = bundle;
        }
        java.lang.Boolean bool = (java.lang.Boolean) AARZUJiTa12;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (l21Var == null) {
                l21Var2 = l21Var;
                i2 = 4;
            } else {
                l21Var2 = l21Var;
                i2 = 4;
                if (l21Var2.IHQe1A4L2xu == 4) {
                    accessibilityNodeInfo3.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo2.setChecked(booleanValue);
        } else {
            l21Var2 = l21Var;
            i2 = 4;
        }
        defpackage.b71 b71Var4 = b71Var;
        if (!b71Var4.AARZUJiTa || defpackage.f71.SH1y5HwkJhh(i2, f71Var7).isEmpty()) {
            java.lang.Object AARZUJiTa13 = nl0Var.AARZUJiTa(defpackage.j71.IHQe1A4L2xu);
            if (AARZUJiTa13 == null) {
                AARZUJiTa13 = bundle;
            }
            java.util.List list4 = (java.util.List) AARZUJiTa13;
            accessibilityNodeInfo3.setContentDescription(list4 != null ? (java.lang.String) defpackage.td.gG5uWf3dqScO(list4) : bundle);
        }
        java.lang.Object AARZUJiTa14 = nl0Var.AARZUJiTa(defpackage.j71.QQUzIjv3iOC5);
        if (AARZUJiTa14 == null) {
            AARZUJiTa14 = bundle;
        }
        java.lang.String str3 = (java.lang.String) AARZUJiTa14;
        if (str3 != null) {
            defpackage.f71 f71Var8 = f71Var7;
            while (true) {
                if (f71Var8 == null) {
                    z4 = false;
                    break;
                }
                defpackage.b71 b71Var5 = f71Var8.F7NU4MC0GW;
                defpackage.m71 m71Var2 = defpackage.k71.IHQe1A4L2xu;
                if (b71Var5.adDC3e2L.r1MBDhnF(m71Var2)) {
                    z4 = ((java.lang.Boolean) b71Var5.r1MBDhnF(m71Var2)).booleanValue();
                    break;
                }
                f71Var8 = f71Var8.JlrlGoKF();
            }
            if (z4) {
                accessibilityNodeInfo3.setViewIdResourceName(str3);
            }
        }
        java.lang.Object AARZUJiTa15 = nl0Var.AARZUJiTa(defpackage.j71.EXtogiMhuM);
        if (AARZUJiTa15 == null) {
            AARZUJiTa15 = bundle;
        }
        if (((defpackage.ok1) AARZUJiTa15) != null) {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                domtplcqqi1y2 = domtplcqqi1y;
                domtplcqqi1y2.xiZrDbcSW0(2, true);
                AARZUJiTa = nl0Var.AARZUJiTa(defpackage.j71.riuEU0zW4);
                if (AARZUJiTa == null) {
                    AARZUJiTa = bundle;
                }
                if (((defpackage.ok1) AARZUJiTa) != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        accessibilityNodeInfo3.setTextEntryKey(true);
                    } else {
                        domtplcqqi1y2.xiZrDbcSW0(8, true);
                    }
                }
                i3 = i;
                if (i3 != -1) {
                    int F7NU4MC0GW3 = vk0Var.F7NU4MC0GW(f71Var7.xiZrDbcSW0);
                    if (F7NU4MC0GW3 != -1) {
                        accessibilityNodeInfo3.setDrawingOrder(F7NU4MC0GW3);
                    } else {
                        android.util.Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo3.setPassword(nl0Var.r1MBDhnF(defpackage.j71.wll2JLbTBC2));
                AARZUJiTa2 = nl0Var.AARZUJiTa(defpackage.j71.hyxIchWRW);
                if (AARZUJiTa2 == null) {
                    AARZUJiTa2 = bundle;
                }
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                accessibilityNodeInfo3.setEditable(defpackage.x70.QoRHpC4k(AARZUJiTa2, bool2));
                AARZUJiTa3 = nl0Var.AARZUJiTa(defpackage.j71.Uv8CGu3G);
                if (AARZUJiTa3 == null) {
                    AARZUJiTa3 = bundle;
                }
                java.lang.Integer num = (java.lang.Integer) AARZUJiTa3;
                accessibilityNodeInfo3.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo3.setEnabled(defpackage.mj1.cnag84Bm(f71Var7));
                defpackage.m71 m71Var3 = defpackage.j71.JlrlGoKF;
                accessibilityNodeInfo3.setFocusable(nl0Var.r1MBDhnF(m71Var3));
                if (accessibilityNodeInfo3.isFocusable()) {
                    a1Var2 = a1Var;
                } else {
                    accessibilityNodeInfo3.setFocused(((java.lang.Boolean) b71Var4.r1MBDhnF(m71Var3)).booleanValue());
                    if (!accessibilityNodeInfo3.isFocused()) {
                        a1Var2 = a1Var;
                        z = true;
                        accessibilityNodeInfo2.addAction(1);
                        accessibilityNodeInfo2.setVisibleToUser(defpackage.h1.D2vUnMij(f71Var7) ^ z);
                        if (f71Var7.cnag84Bm()) {
                            f71Var2 = f71Var7.JlrlGoKF();
                            f71Var2.getClass();
                        } else {
                            f71Var2 = f71Var7;
                        }
                        DFo87pBq1E5 = f71Var2.DFo87pBq1E5();
                        if ((DFo87pBq1E5.IHQe1A4L2xu >= DFo87pBq1E5.r1MBDhnF) || (DFo87pBq1E5.oh6vYeIP >= DFo87pBq1E5.F7NU4MC0GW)) {
                            z2 = false;
                            accessibilityNodeInfo2.setVisibleToUser(false);
                        } else {
                            z2 = false;
                        }
                        defpackage.fx0.kd6TUFXn(defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.ez2rX8ReCYw));
                        accessibilityNodeInfo2.setClickable(z2);
                        tFRaUu83X3E = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.oh6vYeIP);
                        if (tFRaUu83X3E != null) {
                            boolean QoRHpC4k2 = defpackage.x70.QoRHpC4k(defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.p4kuH6PDtgom), bool2);
                            boolean z7 = (l21Var2 != null && l21Var2.IHQe1A4L2xu == 4) || (l21Var2 != null && l21Var2.IHQe1A4L2xu == 3);
                            accessibilityNodeInfo2.setClickable(!z7 || (z7 && !QoRHpC4k2));
                            if (defpackage.mj1.cnag84Bm(f71Var7) && accessibilityNodeInfo3.isClickable()) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E.IHQe1A4L2xu, 16));
                            }
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        tFRaUu83X3E2 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.r1MBDhnF);
                        if (tFRaUu83X3E2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (defpackage.mj1.cnag84Bm(f71Var7)) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E2.IHQe1A4L2xu, 32));
                            }
                        }
                        tFRaUu83X3E3 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.QoRHpC4k);
                        if (tFRaUu83X3E3 != null) {
                            domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E3.IHQe1A4L2xu, 16384));
                        }
                        if (defpackage.mj1.cnag84Bm(f71Var7)) {
                            defpackage.TFRaUu83X3E tFRaUu83X3E4 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.ez2rX8ReCYw);
                            if (tFRaUu83X3E4 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E4.IHQe1A4L2xu, 2097152));
                            }
                            defpackage.TFRaUu83X3E tFRaUu83X3E5 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.cnag84Bm);
                            if (tFRaUu83X3E5 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E5.IHQe1A4L2xu, android.R.id.accessibilityActionImeEnter));
                            }
                            defpackage.TFRaUu83X3E tFRaUu83X3E6 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.G3OKOH3wZRC);
                            if (tFRaUu83X3E6 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E6.IHQe1A4L2xu, 65536));
                            }
                            defpackage.TFRaUu83X3E tFRaUu83X3E7 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.kd6TUFXn);
                            if (tFRaUu83X3E7 != null && accessibilityNodeInfo3.isFocused()) {
                                defpackage.f0 m13getClipboardManager = v0Var.m13getClipboardManager();
                                android.content.ClipboardManager clipboardManager = m13getClipboardManager.oh6vYeIP;
                                if (clipboardManager == null) {
                                    java.lang.Object systemService = m13getClipboardManager.IHQe1A4L2xu.getSystemService("clipboard");
                                    systemService.getClass();
                                    clipboardManager = (android.content.ClipboardManager) systemService;
                                    m13getClipboardManager.oh6vYeIP = clipboardManager;
                                }
                                android.content.ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E7.IHQe1A4L2xu, 32768));
                                }
                            }
                        }
                        JlrlGoKF = defpackage.a1.JlrlGoKF(f71Var7);
                        if (JlrlGoKF != null && JlrlGoKF.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(a1Var2.SH1y5HwkJhh(f71Var7), a1Var2.riuEU0zW4(f71Var7));
                            defpackage.TFRaUu83X3E tFRaUu83X3E8 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.SH1y5HwkJhh);
                            domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E8 == null ? tFRaUu83X3E8.IHQe1A4L2xu : bundle, 131072));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            list = (java.util.List) defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.IHQe1A4L2xu);
                            if ((list != null || list.isEmpty()) && nl0Var.r1MBDhnF(defpackage.a71.IHQe1A4L2xu) && (!nl0Var.r1MBDhnF(defpackage.j71.frpfPPIgqM9O) || defpackage.x70.QoRHpC4k(defpackage.l80.cnag84Bm(b71Var4, m71Var3), bool2))) {
                                V7bD7b8KA = ma0Var.V7bD7b8KA();
                                while (true) {
                                    if (V7bD7b8KA == null) {
                                        V7bD7b8KA = bundle;
                                        break;
                                    }
                                    defpackage.b71 abhbClRa = V7bD7b8KA.abhbClRa();
                                    if (abhbClRa != null && abhbClRa.AARZUJiTa) {
                                        if (abhbClRa.adDC3e2L.r1MBDhnF(defpackage.j71.frpfPPIgqM9O)) {
                                            break;
                                        }
                                    }
                                    V7bD7b8KA = V7bD7b8KA.V7bD7b8KA();
                                }
                                if (V7bD7b8KA != null) {
                                    defpackage.b71 abhbClRa2 = V7bD7b8KA.abhbClRa();
                                    if (abhbClRa2 != null) {
                                        java.lang.Object AARZUJiTa16 = abhbClRa2.adDC3e2L.AARZUJiTa(defpackage.j71.JlrlGoKF);
                                        if (AARZUJiTa16 == null) {
                                            AARZUJiTa16 = bundle;
                                        }
                                        z3 = defpackage.x70.QoRHpC4k(AARZUJiTa16, java.lang.Boolean.TRUE);
                                    } else {
                                        z3 = false;
                                    }
                                }
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            }
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add("androidx.compose.ui.semantics.id");
                            java.lang.CharSequence adDC3e2L2 = domtplcqqi1y2.adDC3e2L();
                            if (adDC3e2L2 != null && adDC3e2L2.length() != 0 && nl0Var.r1MBDhnF(defpackage.a71.IHQe1A4L2xu)) {
                                arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (nl0Var.r1MBDhnF(defpackage.j71.QQUzIjv3iOC5)) {
                                arrayList5.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (nl0Var.r1MBDhnF(defpackage.j71.lpprD5VAS)) {
                                arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo2.setAvailableExtraData(arrayList5);
                            }
                        }
                        ey0Var = (defpackage.ey0) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.r1MBDhnF);
                        if (ey0Var != null) {
                            float f2 = ey0Var.IHQe1A4L2xu;
                            defpackage.b71 SyNS6RMn = f71Var7.SyNS6RMn();
                            defpackage.m71 m71Var4 = defpackage.a71.riuEU0zW4;
                            if (SyNS6RMn.adDC3e2L.r1MBDhnF(m71Var4)) {
                                domtplcqqi1y2.AARZUJiTa("android.widget.SeekBar");
                            } else {
                                domtplcqqi1y2.AARZUJiTa("android.widget.ProgressBar");
                            }
                            defpackage.ey0 ey0Var2 = defpackage.ey0.r1MBDhnF;
                            if (ey0Var != defpackage.ey0.r1MBDhnF) {
                                accessibilityNodeInfo2.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) new defpackage.FyULxpbU8bu(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, valueOf.floatValue(), java.lang.Float.valueOf(ey0Var.IHQe1A4L2xu().IHQe1A4L2xu).floatValue(), f2)).IHQe1A4L2xu);
                            }
                            if (f71Var7.SyNS6RMn().adDC3e2L.r1MBDhnF(m71Var4) && defpackage.mj1.cnag84Bm(f71Var7)) {
                                float floatValue = java.lang.Float.valueOf(ey0Var.IHQe1A4L2xu().IHQe1A4L2xu).floatValue();
                                float floatValue2 = valueOf.floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (f2 < floatValue) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.adDC3e2L);
                                }
                                float floatValue3 = valueOf.floatValue();
                                float floatValue4 = java.lang.Float.valueOf(ey0Var.IHQe1A4L2xu().IHQe1A4L2xu).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (f2 > floatValue3) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.xiZrDbcSW0);
                                }
                            }
                        }
                        defpackage.ci0.ez2rX8ReCYw(domtplcqqi1y2, f71Var7);
                        AARZUJiTa4 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                        if (AARZUJiTa4 == null) {
                            AARZUJiTa4 = bundle;
                        }
                        sdVar = (defpackage.sd) AARZUJiTa4;
                        if (sdVar != null) {
                            accessibilityNodeInfo2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(sdVar.IHQe1A4L2xu, sdVar.oh6vYeIP, false, 0));
                        } else {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.Object AARZUJiTa17 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.adDC3e2L);
                            if (AARZUJiTa17 == null) {
                                AARZUJiTa17 = bundle;
                            }
                            if (AARZUJiTa17 != null) {
                                java.util.List SH1y5HwkJhh2 = defpackage.f71.SH1y5HwkJhh(4, f71Var7);
                                int size9 = SH1y5HwkJhh2.size();
                                for (int i33 = 0; i33 < size9; i33++) {
                                    defpackage.f71 f71Var9 = (defpackage.f71) SH1y5HwkJhh2.get(i33);
                                    if (f71Var9.ez2rX8ReCYw().adDC3e2L.r1MBDhnF(defpackage.j71.p4kuH6PDtgom)) {
                                        arrayList6.add(f71Var9);
                                    }
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                boolean QoRHpC4k3 = defpackage.h1.QoRHpC4k(arrayList6);
                                accessibilityNodeInfo2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(QoRHpC4k3 ? 1 : arrayList6.size(), QoRHpC4k3 ? arrayList6.size() : 1, false, 0));
                            }
                        }
                        defpackage.h1.hyxIchWRW(domtplcqqi1y2, f71Var7);
                        f51Var = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.V7bD7b8KA);
                        defpackage.TFRaUu83X3E tFRaUu83X3E9 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.F7NU4MC0GW);
                        if (f51Var != null && tFRaUu83X3E9 != null) {
                            AARZUJiTa6 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                            if (AARZUJiTa6 == null) {
                                AARZUJiTa6 = bundle;
                            }
                            if (AARZUJiTa6 == null) {
                                java.lang.Object AARZUJiTa18 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.adDC3e2L);
                                if (AARZUJiTa18 == null) {
                                    AARZUJiTa18 = bundle;
                                }
                                if (AARZUJiTa18 == null) {
                                    domtplcqqi1y2.AARZUJiTa("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((java.lang.Number) f51Var.oh6vYeIP.IHQe1A4L2xu()).floatValue() > f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (defpackage.mj1.cnag84Bm(f71Var7)) {
                                boolean kd6TUFXn = defpackage.a1.kd6TUFXn(f51Var);
                                defpackage.w90 w90Var = defpackage.w90.xiZrDbcSW0;
                                if (kd6TUFXn) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.adDC3e2L);
                                    ma0Var2 = ma0Var;
                                    domtplcqqi1y2.IHQe1A4L2xu(ma0Var2.nBH8hAHy == w90Var ? defpackage.d6FAb9xVJ8GU.EXtogiMhuM : defpackage.d6FAb9xVJ8GU.SH1y5HwkJhh);
                                } else {
                                    ma0Var2 = ma0Var;
                                }
                                if (defpackage.a1.G3OKOH3wZRC(f51Var)) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.xiZrDbcSW0);
                                    domtplcqqi1y2.IHQe1A4L2xu(ma0Var2.nBH8hAHy == w90Var ? defpackage.d6FAb9xVJ8GU.SH1y5HwkJhh : defpackage.d6FAb9xVJ8GU.EXtogiMhuM);
                                }
                            }
                        }
                        f51Var2 = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.PAEGRtP0bX);
                        if (f51Var2 != null && tFRaUu83X3E9 != null) {
                            AARZUJiTa5 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                            if (AARZUJiTa5 == null) {
                                AARZUJiTa5 = bundle;
                            }
                            if (AARZUJiTa5 == null) {
                                java.lang.Object AARZUJiTa19 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.adDC3e2L);
                                if (AARZUJiTa19 == null) {
                                    AARZUJiTa19 = bundle;
                                }
                                if (AARZUJiTa19 == null) {
                                    domtplcqqi1y2.AARZUJiTa("android.widget.ScrollView");
                                }
                            }
                            if (((java.lang.Number) f51Var2.oh6vYeIP.IHQe1A4L2xu()).floatValue() > f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (defpackage.mj1.cnag84Bm(f71Var7)) {
                                if (defpackage.a1.kd6TUFXn(f51Var2)) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.adDC3e2L);
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.riuEU0zW4);
                                }
                                if (defpackage.a1.G3OKOH3wZRC(f51Var2)) {
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.xiZrDbcSW0);
                                    domtplcqqi1y2.IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU.AARZUJiTa);
                                }
                            }
                        }
                        i4 = android.os.Build.VERSION.SDK_INT;
                        if (i4 >= 29) {
                            defpackage.s21.QoRHpC4k(domtplcqqi1y2, f71Var7);
                        }
                        java.lang.CharSequence charSequence = (java.lang.CharSequence) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.F7NU4MC0GW);
                        if (i4 >= 28) {
                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (defpackage.mj1.cnag84Bm(f71Var7)) {
                            defpackage.TFRaUu83X3E tFRaUu83X3E10 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.EgCjBq0SZwJ);
                            if (tFRaUu83X3E10 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E10.IHQe1A4L2xu, 262144));
                            }
                            defpackage.TFRaUu83X3E tFRaUu83X3E11 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.fnWB2E7cs);
                            if (tFRaUu83X3E11 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E11.IHQe1A4L2xu, 524288));
                            }
                            defpackage.TFRaUu83X3E tFRaUu83X3E12 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.kNAkVymC);
                            if (tFRaUu83X3E12 != null) {
                                domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E12.IHQe1A4L2xu, 1048576));
                            }
                            defpackage.b71 SyNS6RMn2 = f71Var7.SyNS6RMn();
                            defpackage.m71 m71Var5 = defpackage.a71.PAEGRtP0bX;
                            if (SyNS6RMn2.adDC3e2L.r1MBDhnF(m71Var5)) {
                                java.util.List list5 = (java.util.List) f71Var7.SyNS6RMn().r1MBDhnF(m71Var5);
                                int size10 = list5.size();
                                defpackage.wk0 wk0Var = defpackage.a1.WLpAkxCo;
                                if (size10 >= wk0Var.oh6vYeIP) {
                                    throw new java.lang.IllegalStateException("Can't have more than " + wk0Var.oh6vYeIP + " custom actions for one widget");
                                }
                                defpackage.qb1 qb1Var3 = new defpackage.qb1();
                                defpackage.fl0 IHQe1A4L2xu = defpackage.up0.IHQe1A4L2xu();
                                defpackage.qb1 qb1Var4 = qb1Var;
                                if (qb1Var4.adDC3e2L) {
                                    defpackage.mj1.QoRHpC4k(qb1Var4);
                                }
                                if (defpackage.s21.G3OKOH3wZRC(qb1Var4.xiZrDbcSW0, qb1Var4.EXtogiMhuM, i3) >= 0) {
                                    defpackage.fl0 fl0Var = (defpackage.fl0) qb1Var4.oh6vYeIP(i3);
                                    int[] iArr = wk0Var.IHQe1A4L2xu;
                                    int i34 = wk0Var.oh6vYeIP;
                                    int[] iArr2 = new int[16];
                                    int i35 = 0;
                                    int i36 = 0;
                                    while (i35 < i34) {
                                        int i37 = iArr[i35];
                                        int i38 = i34;
                                        int i39 = i36 + 1;
                                        defpackage.fl0 fl0Var2 = fl0Var;
                                        if (iArr2.length < i39) {
                                            iArr2 = java.util.Arrays.copyOf(iArr2, java.lang.Math.max(i39, (iArr2.length * 3) / 2));
                                        }
                                        iArr2[i36] = i37;
                                        i35++;
                                        i36 = i39;
                                        i34 = i38;
                                        fl0Var = fl0Var2;
                                    }
                                    defpackage.fl0 fl0Var3 = fl0Var;
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    if (list5.size() > 0) {
                                        defpackage.fx0.kd6TUFXn(list5.get(0));
                                        fl0Var3.getClass();
                                        throw bundle;
                                    }
                                    if (arrayList7.size() > 0) {
                                        defpackage.fx0.kd6TUFXn(arrayList7.get(0));
                                        if (i36 <= 0) {
                                            defpackage.db.cnag84Bm("Index must be between 0 and size");
                                            return bundle;
                                        }
                                        int i40 = iArr2[0];
                                        throw bundle;
                                    }
                                } else if (list5.size() > 0) {
                                    defpackage.fx0.kd6TUFXn(list5.get(0));
                                    wk0Var.oh6vYeIP(0);
                                    throw bundle;
                                }
                                a1Var2.V7bD7b8KA.F7NU4MC0GW(i3, qb1Var3);
                                qb1Var4.F7NU4MC0GW(i3, IHQe1A4L2xu);
                            }
                        }
                        boolean kd6TUFXn2 = defpackage.mj1.kd6TUFXn(f71Var7, resources);
                        if (android.os.Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo2.setScreenReaderFocusable(kd6TUFXn2);
                        } else {
                            domtplcqqi1y2.xiZrDbcSW0(1, kd6TUFXn2);
                        }
                        F7NU4MC0GW = a1Var2.frpfPPIgqM9O.F7NU4MC0GW(i3);
                        if (F7NU4MC0GW != -1) {
                            defpackage.a70.nBH8hAHy(v0Var.getAndroidViewsHandler$ui(), F7NU4MC0GW);
                            v0Var2 = v0Var;
                            accessibilityNodeInfo2.setTraversalBefore(v0Var2, F7NU4MC0GW);
                            a1Var2.oh6vYeIP(i3, domtplcqqi1y2, a1Var2.p4kuH6PDtgom, bundle);
                        } else {
                            v0Var2 = v0Var;
                        }
                        F7NU4MC0GW2 = a1Var2.SiPhmbmu.F7NU4MC0GW(i3);
                        if (F7NU4MC0GW2 != -1) {
                            defpackage.a70.nBH8hAHy(v0Var2.getAndroidViewsHandler$ui(), F7NU4MC0GW2);
                        }
                        str = (java.lang.String) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.k71.oh6vYeIP);
                        if (str != null) {
                            domtplcqqi1y2.AARZUJiTa(str);
                        }
                        domtplcqqi1y3 = domtplcqqi1y2;
                        if (a1Var2.EgCjBq0SZwJ) {
                        }
                        return domtplcqqi1y3;
                    }
                    accessibilityNodeInfo2.addAction(2);
                    a1Var2 = a1Var;
                    a1Var2.QoRHpC4k = i3;
                }
                z = true;
                accessibilityNodeInfo2.setVisibleToUser(defpackage.h1.D2vUnMij(f71Var7) ^ z);
                if (f71Var7.cnag84Bm()) {
                }
                DFo87pBq1E5 = f71Var2.DFo87pBq1E5();
                if ((DFo87pBq1E5.IHQe1A4L2xu >= DFo87pBq1E5.r1MBDhnF) | (DFo87pBq1E5.oh6vYeIP >= DFo87pBq1E5.F7NU4MC0GW)) {
                }
                defpackage.fx0.kd6TUFXn(defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.ez2rX8ReCYw));
                accessibilityNodeInfo2.setClickable(z2);
                tFRaUu83X3E = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.oh6vYeIP);
                if (tFRaUu83X3E != null) {
                }
                accessibilityNodeInfo2.setLongClickable(false);
                tFRaUu83X3E2 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.r1MBDhnF);
                if (tFRaUu83X3E2 != null) {
                }
                tFRaUu83X3E3 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.QoRHpC4k);
                if (tFRaUu83X3E3 != null) {
                }
                if (defpackage.mj1.cnag84Bm(f71Var7)) {
                }
                JlrlGoKF = defpackage.a1.JlrlGoKF(f71Var7);
                if (JlrlGoKF != null) {
                    accessibilityNodeInfo3.setTextSelection(a1Var2.SH1y5HwkJhh(f71Var7), a1Var2.riuEU0zW4(f71Var7));
                    defpackage.TFRaUu83X3E tFRaUu83X3E82 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.SH1y5HwkJhh);
                    domtplcqqi1y2.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(tFRaUu83X3E82 == null ? tFRaUu83X3E82.IHQe1A4L2xu : bundle, 131072));
                    accessibilityNodeInfo2.addAction(256);
                    accessibilityNodeInfo2.addAction(512);
                    accessibilityNodeInfo2.setMovementGranularities(11);
                    list = (java.util.List) defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.IHQe1A4L2xu);
                    if (list != null) {
                    }
                    V7bD7b8KA = ma0Var.V7bD7b8KA();
                    while (true) {
                        if (V7bD7b8KA == null) {
                        }
                        V7bD7b8KA = V7bD7b8KA.V7bD7b8KA();
                    }
                    if (V7bD7b8KA != null) {
                    }
                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                }
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                }
                ey0Var = (defpackage.ey0) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.r1MBDhnF);
                if (ey0Var != null) {
                }
                defpackage.ci0.ez2rX8ReCYw(domtplcqqi1y2, f71Var7);
                AARZUJiTa4 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                if (AARZUJiTa4 == null) {
                }
                sdVar = (defpackage.sd) AARZUJiTa4;
                if (sdVar != null) {
                }
                defpackage.h1.hyxIchWRW(domtplcqqi1y2, f71Var7);
                f51Var = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.V7bD7b8KA);
                defpackage.TFRaUu83X3E tFRaUu83X3E92 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.F7NU4MC0GW);
                if (f51Var != null) {
                    AARZUJiTa6 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                    if (AARZUJiTa6 == null) {
                    }
                    if (AARZUJiTa6 == null) {
                    }
                    if (((java.lang.Number) f51Var.oh6vYeIP.IHQe1A4L2xu()).floatValue() > f) {
                    }
                    if (defpackage.mj1.cnag84Bm(f71Var7)) {
                    }
                }
                f51Var2 = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.PAEGRtP0bX);
                if (f51Var2 != null) {
                    AARZUJiTa5 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
                    if (AARZUJiTa5 == null) {
                    }
                    if (AARZUJiTa5 == null) {
                    }
                    if (((java.lang.Number) f51Var2.oh6vYeIP.IHQe1A4L2xu()).floatValue() > f) {
                    }
                    if (defpackage.mj1.cnag84Bm(f71Var7)) {
                    }
                }
                i4 = android.os.Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.F7NU4MC0GW);
                if (i4 >= 28) {
                }
                if (defpackage.mj1.cnag84Bm(f71Var7)) {
                }
                boolean kd6TUFXn22 = defpackage.mj1.kd6TUFXn(f71Var7, resources);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                }
                F7NU4MC0GW = a1Var2.frpfPPIgqM9O.F7NU4MC0GW(i3);
                if (F7NU4MC0GW != -1) {
                }
                F7NU4MC0GW2 = a1Var2.SiPhmbmu.F7NU4MC0GW(i3);
                if (F7NU4MC0GW2 != -1) {
                }
                str = (java.lang.String) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.k71.oh6vYeIP);
                if (str != null) {
                }
                domtplcqqi1y3 = domtplcqqi1y2;
                if (a1Var2.EgCjBq0SZwJ) {
                }
                return domtplcqqi1y3;
            }
            accessibilityNodeInfo2.setHeading(true);
        }
        domtplcqqi1y2 = domtplcqqi1y;
        AARZUJiTa = nl0Var.AARZUJiTa(defpackage.j71.riuEU0zW4);
        if (AARZUJiTa == null) {
        }
        if (((defpackage.ok1) AARZUJiTa) != null) {
        }
        i3 = i;
        if (i3 != -1) {
        }
        accessibilityNodeInfo3.setPassword(nl0Var.r1MBDhnF(defpackage.j71.wll2JLbTBC2));
        AARZUJiTa2 = nl0Var.AARZUJiTa(defpackage.j71.hyxIchWRW);
        if (AARZUJiTa2 == null) {
        }
        java.lang.Boolean bool22 = java.lang.Boolean.TRUE;
        accessibilityNodeInfo3.setEditable(defpackage.x70.QoRHpC4k(AARZUJiTa2, bool22));
        AARZUJiTa3 = nl0Var.AARZUJiTa(defpackage.j71.Uv8CGu3G);
        if (AARZUJiTa3 == null) {
        }
        java.lang.Integer num2 = (java.lang.Integer) AARZUJiTa3;
        accessibilityNodeInfo3.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo3.setEnabled(defpackage.mj1.cnag84Bm(f71Var7));
        defpackage.m71 m71Var32 = defpackage.j71.JlrlGoKF;
        accessibilityNodeInfo3.setFocusable(nl0Var.r1MBDhnF(m71Var32));
        if (accessibilityNodeInfo3.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo2.setVisibleToUser(defpackage.h1.D2vUnMij(f71Var7) ^ z);
        if (f71Var7.cnag84Bm()) {
        }
        DFo87pBq1E5 = f71Var2.DFo87pBq1E5();
        if ((DFo87pBq1E5.IHQe1A4L2xu >= DFo87pBq1E5.r1MBDhnF) | (DFo87pBq1E5.oh6vYeIP >= DFo87pBq1E5.F7NU4MC0GW)) {
        }
        defpackage.fx0.kd6TUFXn(defpackage.l80.cnag84Bm(b71Var4, defpackage.j71.ez2rX8ReCYw));
        accessibilityNodeInfo2.setClickable(z2);
        tFRaUu83X3E = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.oh6vYeIP);
        if (tFRaUu83X3E != null) {
        }
        accessibilityNodeInfo2.setLongClickable(false);
        tFRaUu83X3E2 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.r1MBDhnF);
        if (tFRaUu83X3E2 != null) {
        }
        tFRaUu83X3E3 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(b71Var4, defpackage.a71.QoRHpC4k);
        if (tFRaUu83X3E3 != null) {
        }
        if (defpackage.mj1.cnag84Bm(f71Var7)) {
        }
        JlrlGoKF = defpackage.a1.JlrlGoKF(f71Var7);
        if (JlrlGoKF != null) {
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
        }
        ey0Var = (defpackage.ey0) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.r1MBDhnF);
        if (ey0Var != null) {
        }
        defpackage.ci0.ez2rX8ReCYw(domtplcqqi1y2, f71Var7);
        AARZUJiTa4 = f71Var7.ez2rX8ReCYw().adDC3e2L.AARZUJiTa(defpackage.j71.xiZrDbcSW0);
        if (AARZUJiTa4 == null) {
        }
        sdVar = (defpackage.sd) AARZUJiTa4;
        if (sdVar != null) {
        }
        defpackage.h1.hyxIchWRW(domtplcqqi1y2, f71Var7);
        f51Var = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.V7bD7b8KA);
        defpackage.TFRaUu83X3E tFRaUu83X3E922 = (defpackage.TFRaUu83X3E) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.a71.F7NU4MC0GW);
        if (f51Var != null) {
        }
        f51Var2 = (defpackage.f51) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.PAEGRtP0bX);
        if (f51Var2 != null) {
        }
        i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        java.lang.CharSequence charSequence22 = (java.lang.CharSequence) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.j71.F7NU4MC0GW);
        if (i4 >= 28) {
        }
        if (defpackage.mj1.cnag84Bm(f71Var7)) {
        }
        boolean kd6TUFXn222 = defpackage.mj1.kd6TUFXn(f71Var7, resources);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
        }
        F7NU4MC0GW = a1Var2.frpfPPIgqM9O.F7NU4MC0GW(i3);
        if (F7NU4MC0GW != -1) {
        }
        F7NU4MC0GW2 = a1Var2.SiPhmbmu.F7NU4MC0GW(i3);
        if (F7NU4MC0GW2 != -1) {
        }
        str = (java.lang.String) defpackage.l80.cnag84Bm(f71Var7.SyNS6RMn(), defpackage.k71.oh6vYeIP);
        if (str != null) {
        }
        domtplcqqi1y3 = domtplcqqi1y2;
        if (a1Var2.EgCjBq0SZwJ) {
        }
        return domtplcqqi1y3;
    }

    @Override // defpackage.id1
    public boolean SH1y5HwkJhh(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.sb0 sb0Var = (defpackage.sb0) this.xiZrDbcSW0;
        return defpackage.x70.QoRHpC4k(sb0Var.oh6vYeIP(obj), sb0Var.oh6vYeIP(obj2));
    }

    public void UsuH8pd5P(android.view.View view, float[] fArr) {
        android.view.View view2;
        float[] fArr2 = (float[]) this.xiZrDbcSW0;
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            UsuH8pd5P((android.view.View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            defpackage.c80.frpfPPIgqM9O(fArr2);
            if (fArr2.length >= 16) {
                float f3 = (fArr2[8] * 0.0f) + (fArr2[4] * f2) + (fArr2[0] * f) + fArr2[12];
                float f4 = (fArr2[9] * 0.0f) + (fArr2[5] * f2) + (fArr2[1] * f) + fArr2[13];
                float f5 = (fArr2[10] * 0.0f) + (fArr2[6] * f2) + (fArr2[2] * f) + fArr2[14];
                float f6 = (fArr2[11] * 0.0f) + (fArr2[7] * f2) + (fArr2[3] * f) + fArr2[15];
                fArr2[12] = f3;
                fArr2[13] = f4;
                fArr2[14] = f5;
                fArr2[15] = f6;
            }
            defpackage.h1.p4kuH6PDtgom(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            defpackage.c80.frpfPPIgqM9O(fArr2);
            if (fArr2.length >= 16) {
                float f7 = (fArr2[8] * 0.0f) + (fArr2[4] * top) + (fArr2[0] * left) + fArr2[12];
                float f8 = (fArr2[9] * 0.0f) + (fArr2[5] * top) + (fArr2[1] * left) + fArr2[13];
                float f9 = (fArr2[10] * 0.0f) + (fArr2[6] * top) + (fArr2[2] * left) + fArr2[14];
                float f10 = (fArr2[11] * 0.0f) + (fArr2[7] * top) + (fArr2[3] * left) + fArr2[15];
                fArr2[12] = f7;
                fArr2[13] = f8;
                fArr2[14] = f9;
                fArr2[15] = f10;
            }
            defpackage.h1.p4kuH6PDtgom(fArr, fArr2);
            view2 = view;
        } else {
            int[] iArr = (int[]) this.AARZUJiTa;
            view2 = view;
            view2.getLocationInWindow(iArr);
            float f11 = -view2.getScrollX();
            float f12 = -view2.getScrollY();
            defpackage.c80.frpfPPIgqM9O(fArr2);
            if (fArr2.length >= 16) {
                float f13 = (fArr2[8] * 0.0f) + (fArr2[4] * f12) + (fArr2[0] * f11) + fArr2[12];
                float f14 = (fArr2[9] * 0.0f) + (fArr2[5] * f12) + (fArr2[1] * f11) + fArr2[13];
                float f15 = (fArr2[10] * 0.0f) + (fArr2[6] * f12) + (fArr2[2] * f11) + fArr2[14];
                float f16 = (fArr2[11] * 0.0f) + (fArr2[7] * f12) + (fArr2[3] * f11) + fArr2[15];
                fArr2[12] = f13;
                fArr2[13] = f14;
                fArr2[14] = f15;
                fArr2[15] = f16;
            }
            defpackage.h1.p4kuH6PDtgom(fArr, fArr2);
            float f17 = iArr[0];
            float f18 = iArr[1];
            defpackage.c80.frpfPPIgqM9O(fArr2);
            if (fArr2.length >= 16) {
                float f19 = (fArr2[8] * 0.0f) + (fArr2[4] * f18) + (fArr2[0] * f17) + fArr2[12];
                float f20 = (fArr2[9] * 0.0f) + (fArr2[5] * f18) + (fArr2[1] * f17) + fArr2[13];
                float f21 = (fArr2[10] * 0.0f) + (fArr2[6] * f18) + (fArr2[2] * f17) + fArr2[14];
                float f22 = (fArr2[11] * 0.0f) + (fArr2[7] * f18) + (fArr2[3] * f17) + fArr2[15];
                fArr2[12] = f19;
                fArr2[13] = f20;
                fArr2[14] = f21;
                fArr2[15] = f22;
            }
            defpackage.h1.p4kuH6PDtgom(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view2.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        defpackage.ci0.QPwENk36pDC(fArr2, matrix);
        defpackage.h1.p4kuH6PDtgom(fArr, fArr2);
    }

    public android.view.autofill.AutofillId V7bD7b8KA(long j) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return null;
        }
        android.view.contentcapture.ContentCaptureSession F7NU4MC0GW = defpackage.b0.F7NU4MC0GW(this.xiZrDbcSW0);
        defpackage.FyULxpbU8bu V7bD7b8KA = defpackage.s70.V7bD7b8KA((android.view.View) this.AARZUJiTa);
        java.util.Objects.requireNonNull(V7bD7b8KA);
        return defpackage.ri.oh6vYeIP(F7NU4MC0GW, defpackage.e7.oh6vYeIP(V7bD7b8KA.IHQe1A4L2xu), j);
    }

    public void abhbClRa(android.os.Bundle bundle) {
        defpackage.h41 h41Var = (defpackage.h41) this.xiZrDbcSW0;
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        android.os.Bundle bundle2 = h41Var.xiZrDbcSW0;
        if (bundle2 != null) {
            SyNS6RMn.putAll(bundle2);
        }
        synchronized (h41Var.r1MBDhnF) {
            for (java.util.Map.Entry entry : h41Var.F7NU4MC0GW.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                android.os.Bundle IHQe1A4L2xu = ((defpackage.g41) entry.getValue()).IHQe1A4L2xu();
                str.getClass();
                SyNS6RMn.putBundle(str, IHQe1A4L2xu);
            }
        }
        if (SyNS6RMn.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", SyNS6RMn);
    }

    @Override // defpackage.id1
    public void adDC3e2L(defpackage.hd1 hd1Var) {
        defpackage.fl0 fl0Var = (defpackage.fl0) this.AARZUJiTa;
        fl0Var.IHQe1A4L2xu();
        defpackage.hl0 hl0Var = (defpackage.hl0) hd1Var.xiZrDbcSW0;
        java.lang.Object[] objArr = hl0Var.oh6vYeIP;
        long[] jArr = hl0Var.r1MBDhnF;
        int i = hl0Var.adDC3e2L;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            java.lang.Object obj = objArr[i];
            java.lang.Object oh6vYeIP = ((defpackage.sb0) this.xiZrDbcSW0).oh6vYeIP(obj);
            int F7NU4MC0GW = fl0Var.F7NU4MC0GW(oh6vYeIP);
            int i3 = F7NU4MC0GW >= 0 ? fl0Var.r1MBDhnF[F7NU4MC0GW] : 0;
            if (i3 == 7) {
                hd1Var.remove(obj);
            } else {
                fl0Var.AARZUJiTa(i3 + 1, oh6vYeIP);
            }
            i = i2;
        }
    }

    @Override // defpackage.eb
    public void cancel() {
        if (((defpackage.y6) this.AARZUJiTa).compareAndSet(1, 1)) {
            return;
        }
        ((defpackage.k7) this.xiZrDbcSW0).IHQe1A4L2xu();
    }

    public android.os.Bundle cnag84Bm(java.lang.String str) {
        android.os.Bundle bundle;
        defpackage.h41 h41Var = (defpackage.h41) this.xiZrDbcSW0;
        if (!h41Var.AARZUJiTa) {
            defpackage.db.AARZUJiTa("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        android.os.Bundle bundle2 = h41Var.xiZrDbcSW0;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                defpackage.c80.abhbClRa(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            h41Var.xiZrDbcSW0 = null;
        }
        return bundle;
    }

    @Override // defpackage.l41
    public java.lang.Object ez2rX8ReCYw(defpackage.q31 q31Var, java.lang.Object obj) {
        return ((defpackage.k00) this.xiZrDbcSW0).adDC3e2L(q31Var, obj);
    }

    public defpackage.g41 fnWB2E7cs(java.lang.String str) {
        defpackage.g41 g41Var;
        defpackage.h41 h41Var = (defpackage.h41) this.xiZrDbcSW0;
        synchronized (h41Var.r1MBDhnF) {
            java.util.Iterator it = h41Var.F7NU4MC0GW.entrySet().iterator();
            do {
                g41Var = null;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str2 = (java.lang.String) entry.getKey();
                defpackage.g41 g41Var2 = (defpackage.g41) entry.getValue();
                if (defpackage.x70.QoRHpC4k(str2, str)) {
                    g41Var = g41Var2;
                }
            } while (g41Var == null);
        }
        return g41Var;
    }

    public void kNAkVymC() {
        java.lang.String str = (java.lang.String) this.xiZrDbcSW0;
        if (((java.nio.channels.FileChannel) this.AARZUJiTa) != null) {
            return;
        }
        try {
            java.io.File file = new java.io.File(str);
            java.io.File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file).getChannel();
            this.AARZUJiTa = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (java.lang.Throwable th) {
            java.nio.channels.FileChannel fileChannel = (java.nio.channels.FileChannel) this.AARZUJiTa;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.AARZUJiTa = null;
            throw new java.lang.IllegalStateException("Unable to lock file: '" + str + "'.", th);
        }
    }

    public void nBH8hAHy() {
        synchronized (this) {
            ((java.util.concurrent.atomic.AtomicInteger) this.xiZrDbcSW0).decrementAndGet();
            if (((java.util.concurrent.atomic.AtomicInteger) this.xiZrDbcSW0).get() < 0) {
                throw new java.lang.IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // defpackage.ua
    public void oh6vYeIP(android.view.View view, float[] fArr) {
        defpackage.c80.frpfPPIgqM9O(fArr);
        UsuH8pd5P(view, fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.j31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public defpackage.i31 r1MBDhnF(java.lang.String str) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileChannel fileChannel2;
        str.getClass();
        defpackage.o21 o21Var = (defpackage.o21) this.AARZUJiTa;
        if (!str.equals(":memory:")) {
            str = o21Var.r1MBDhnF.IHQe1A4L2xu.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        defpackage.pu puVar = new defpackage.pu(str, (o21Var.IHQe1A4L2xu || o21Var.oh6vYeIP || str.equals(":memory:")) ? false : true);
        java.util.concurrent.locks.ReentrantLock reentrantLock = puVar.IHQe1A4L2xu;
        reentrantLock.lock();
        defpackage.F7NU4MC0GW f7nu4mc0gw = puVar.oh6vYeIP;
        if (f7nu4mc0gw != null) {
            try {
                f7nu4mc0gw.kNAkVymC();
            } catch (java.lang.Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (o21Var.oh6vYeIP) {
                    throw new java.lang.IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                defpackage.i31 r1MBDhnF = ((defpackage.j31) this.xiZrDbcSW0).r1MBDhnF(str);
                if (o21Var.IHQe1A4L2xu) {
                    defpackage.o21.oh6vYeIP(r1MBDhnF);
                    if (o21Var.r1MBDhnF.AARZUJiTa == defpackage.p21.xiZrDbcSW0) {
                        defpackage.a70.JlrlGoKF(r1MBDhnF, "PRAGMA synchronous = NORMAL");
                    } else {
                        defpackage.a70.JlrlGoKF(r1MBDhnF, "PRAGMA synchronous = FULL");
                    }
                    o21Var.F7NU4MC0GW.F7NU4MC0GW(r1MBDhnF);
                } else {
                    try {
                        o21Var.oh6vYeIP = true;
                        defpackage.o21.IHQe1A4L2xu(o21Var, r1MBDhnF);
                        o21Var.oh6vYeIP = false;
                    } catch (java.lang.Throwable th2) {
                        o21Var.oh6vYeIP = false;
                        throw th2;
                    }
                }
                if (f7nu4mc0gw != null && (fileChannel2 = (java.nio.channels.FileChannel) f7nu4mc0gw.AARZUJiTa) != null) {
                    try {
                        fileChannel2.close();
                        f7nu4mc0gw.AARZUJiTa = null;
                    } finally {
                    }
                }
                return r1MBDhnF;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new java.lang.IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (java.lang.Throwable th4) {
            if (f7nu4mc0gw != null && (fileChannel = (java.nio.channels.FileChannel) f7nu4mc0gw.AARZUJiTa) != null) {
                try {
                    fileChannel.close();
                    f7nu4mc0gw.AARZUJiTa = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    @Override // defpackage.j31
    public boolean riuEU0zW4() {
        return ((defpackage.j31) this.xiZrDbcSW0).riuEU0zW4();
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 29:
                return "Bounds{lower=" + ((defpackage.i60) this.xiZrDbcSW0) + " upper=" + ((defpackage.i60) this.AARZUJiTa) + "}";
            default:
                return super.toString();
        }
    }

    public void v5iciZok(defpackage.i31 i31Var, java.util.ArrayList arrayList) {
        i31Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            try {
                ((defpackage.fm) this.xiZrDbcSW0).v5iciZok(i31Var, obj);
            } catch (android.database.SQLException e) {
                SyNS6RMn(e);
                ((defpackage.h1) this.AARZUJiTa).nBH8hAHy(i31Var, obj);
            }
        }
    }

    @Override // defpackage.hs0
    public java.util.List xiZrDbcSW0(java.lang.Integer num) {
        java.util.List xiZrDbcSW0 = ((defpackage.hs0) this.xiZrDbcSW0).xiZrDbcSW0(null);
        defpackage.ia1 ia1Var = (defpackage.ia1) this.AARZUJiTa;
        int i = ia1Var.V7bD7b8KA;
        return i < 0 ? xiZrDbcSW0 : defpackage.td.flIYPhR0(defpackage.w70.DFo87pBq1E5(ia1Var, num, i, java.lang.Integer.valueOf(ia1Var.D2vUnMij(ia1Var.oh6vYeIP, i))), xiZrDbcSW0);
    }

    public /* synthetic */ F7NU4MC0GW(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    public F7NU4MC0GW(defpackage.h41 h41Var) {
        this.adDC3e2L = 23;
        this.xiZrDbcSW0 = h41Var;
        this.AARZUJiTa = new defpackage.F7NU4MC0GW(22, h41Var);
    }

    public F7NU4MC0GW(defpackage.ma0 ma0Var, defpackage.ii0 ii0Var) {
        this.adDC3e2L = 11;
        this.xiZrDbcSW0 = ma0Var;
        this.AARZUJiTa = defpackage.c80.nBH8hAHy(ii0Var);
    }

    public F7NU4MC0GW(java.lang.String str) {
        this.adDC3e2L = 9;
        this.xiZrDbcSW0 = str.concat(".lck");
    }

    public F7NU4MC0GW(defpackage.m0 m0Var) {
        this.adDC3e2L = 4;
        this.xiZrDbcSW0 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.AARZUJiTa = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public F7NU4MC0GW(defpackage.k7 k7Var) {
        this.adDC3e2L = 18;
        this.xiZrDbcSW0 = k7Var;
        this.AARZUJiTa = new defpackage.y6(0);
    }

    public F7NU4MC0GW(defpackage.o21 o21Var, defpackage.j31 j31Var) {
        this.adDC3e2L = 2;
        j31Var.getClass();
        this.AARZUJiTa = o21Var;
        this.xiZrDbcSW0 = j31Var;
    }

    public /* synthetic */ F7NU4MC0GW(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    public F7NU4MC0GW(defpackage.sb0 sb0Var) {
        this.adDC3e2L = 12;
        this.xiZrDbcSW0 = sb0Var;
        defpackage.fl0 fl0Var = defpackage.up0.IHQe1A4L2xu;
        this.AARZUJiTa = new defpackage.fl0();
    }

    public F7NU4MC0GW(android.view.WindowInsetsAnimation.Bounds bounds) {
        android.graphics.Insets lowerBound;
        android.graphics.Insets upperBound;
        this.adDC3e2L = 29;
        lowerBound = bounds.getLowerBound();
        this.xiZrDbcSW0 = defpackage.i60.r1MBDhnF(lowerBound);
        upperBound = bounds.getUpperBound();
        this.AARZUJiTa = defpackage.i60.r1MBDhnF(upperBound);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F7NU4MC0GW(defpackage.a1 a1Var) {
        this(1);
        this.adDC3e2L = 1;
        this.AARZUJiTa = a1Var;
    }

    public F7NU4MC0GW(float[] fArr) {
        this.adDC3e2L = 3;
        this.xiZrDbcSW0 = fArr;
        this.AARZUJiTa = new int[2];
    }
}
