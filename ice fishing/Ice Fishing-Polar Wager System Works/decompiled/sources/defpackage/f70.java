package defpackage;

/* loaded from: classes.dex */
public abstract class f70 {
    public static final /* synthetic */ int F7NU4MC0GW = 0;
    public static final /* synthetic */ int IHQe1A4L2xu = 0;
    public static final /* synthetic */ int oh6vYeIP = 0;
    public static java.lang.Thread r1MBDhnF;

    public static final int AARZUJiTa(defpackage.k31 k31Var, java.lang.String str) {
        k31Var.getClass();
        int columnCount = k31Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(k31Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        java.lang.String str2 = "`" + str + '`';
        int columnCount2 = k31Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(k31Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (android.os.Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = k31Var.getColumnCount();
            java.lang.String concat = ".".concat(str);
            java.lang.String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                java.lang.String columnName = k31Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final defpackage.e70 C0U8sNJm(defpackage.kz0 kz0Var) {
        return new defpackage.e70(java.lang.Math.round(kz0Var.IHQe1A4L2xu), java.lang.Math.round(kz0Var.oh6vYeIP), java.lang.Math.round(kz0Var.r1MBDhnF), java.lang.Math.round(kz0Var.F7NU4MC0GW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [g00] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [lj0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [lj0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void D2vUnMij(defpackage.lj0 lj0Var, java.lang.Object obj, defpackage.g00 g00Var) {
        defpackage.ep0 ep0Var;
        if (!lj0Var.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var2 = lj0Var.adDC3e2L.riuEU0zW4;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(lj0Var);
        while (D2vUnMij != null) {
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                while (lj0Var2 != null) {
                    if ((lj0Var2.AARZUJiTa & 262144) != 0) {
                        defpackage.ln lnVar = lj0Var2;
                        ?? r4 = 0;
                        while (lnVar != 0) {
                            if (lnVar instanceof defpackage.ui1) {
                                defpackage.ui1 ui1Var = (defpackage.ui1) lnVar;
                                if (!(obj.equals(ui1Var.JlrlGoKF()) ? ((java.lang.Boolean) g00Var.AARZUJiTa(ui1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((lnVar.AARZUJiTa & 262144) != 0 && (lnVar instanceof defpackage.ln)) {
                                defpackage.lj0 lj0Var3 = lnVar.fnWB2E7cs;
                                int i = 0;
                                lnVar = lnVar;
                                r4 = r4;
                                while (lj0Var3 != null) {
                                    if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            lnVar = lj0Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lnVar != 0) {
                                                r4.oh6vYeIP(lnVar);
                                                lnVar = 0;
                                            }
                                            r4.oh6vYeIP(lj0Var3);
                                        }
                                    }
                                    lj0Var3 = lj0Var3.SH1y5HwkJhh;
                                    lnVar = lnVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            lnVar = defpackage.w70.riuEU0zW4(r4);
                        }
                    }
                    lj0Var2 = lj0Var2.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var2 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
    }

    public static final defpackage.i41 DFo87pBq1E5(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_saved_state_registry_owner);
            defpackage.i41 i41Var = tag instanceof defpackage.i41 ? (defpackage.i41) tag : null;
            if (i41Var != null) {
                return i41Var;
            }
            java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(view);
            view = EgCjBq0SZwJ instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ : null;
        }
        return null;
    }

    public static defpackage.nl0 EXtogiMhuM() {
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        return new defpackage.nl0();
    }

    public static final boolean EgCjBq0SZwJ(defpackage.ma0 ma0Var) {
        if (ma0Var.JlrlGoKF == null) {
            return false;
        }
        defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
        return (V7bD7b8KA != null ? V7bD7b8KA.JlrlGoKF : null) == null || ma0Var.wll2JLbTBC2.oh6vYeIP;
    }

    public static final void F7NU4MC0GW(final boolean z, final defpackage.k00 k00Var, defpackage.t10 t10Var, final int i) {
        int i2;
        t10Var.QUKZkWRtw6(-642000585);
        if ((i & 6) == 0) {
            i2 = (t10Var.AARZUJiTa(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.EXtogiMhuM(k00Var) ? 32 : 16;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object obj = (defpackage.go0) t10Var.SH1y5HwkJhh(defpackage.ze0.IHQe1A4L2xu);
            if (obj == null) {
                t10Var.AsxAYCCkb3Hi(950836184);
                android.view.View view = (android.view.View) t10Var.SH1y5HwkJhh(defpackage.j1.adDC3e2L);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_navigation_event_dispatcher_owner);
                    java.lang.Object obj2 = tag instanceof defpackage.go0 ? (defpackage.go0) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(view);
                        view = EgCjBq0SZwJ instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ : null;
                    }
                }
                t10Var.QoRHpC4k(false);
            } else {
                t10Var.AsxAYCCkb3Hi(950834231);
                t10Var.QoRHpC4k(false);
            }
            if (obj == null) {
                t10Var.AsxAYCCkb3Hi(1512740606);
                obj = (defpackage.uq0) t10Var.SH1y5HwkJhh(defpackage.af0.IHQe1A4L2xu);
                if (obj == null) {
                    t10Var.AsxAYCCkb3Hi(1208426157);
                    android.view.View view2 = (android.view.View) t10Var.SH1y5HwkJhh(defpackage.j1.adDC3e2L);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        java.lang.Object tag2 = view2.getTag(com.combinations.spin.balbi.R.id.view_tree_on_back_pressed_dispatcher_owner);
                        java.lang.Object obj3 = tag2 instanceof defpackage.uq0 ? (defpackage.uq0) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            java.lang.Object EgCjBq0SZwJ2 = defpackage.e90.EgCjBq0SZwJ(view2);
                            view2 = EgCjBq0SZwJ2 instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ2 : null;
                        }
                    }
                } else {
                    t10Var.AsxAYCCkb3Hi(1208423708);
                }
                t10Var.QoRHpC4k(false);
                if (obj == null) {
                    t10Var.AsxAYCCkb3Hi(1208428160);
                    java.lang.Object obj4 = (android.content.Context) t10Var.SH1y5HwkJhh(defpackage.j1.oh6vYeIP);
                    while (true) {
                        if (!(obj4 instanceof android.content.ContextWrapper)) {
                            obj4 = null;
                            break;
                        } else if (obj4 instanceof defpackage.uq0) {
                            break;
                        } else {
                            obj4 = ((android.content.ContextWrapper) obj4).getBaseContext();
                        }
                    }
                    obj = (defpackage.uq0) obj4;
                } else {
                    t10Var.AsxAYCCkb3Hi(1208423789);
                }
                t10Var.QoRHpC4k(false);
            } else {
                t10Var.AsxAYCCkb3Hi(1512737723);
            }
            t10Var.QoRHpC4k(false);
            if (obj == null) {
                defpackage.db.AARZUJiTa("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(obj);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj5 = defpackage.bh.IHQe1A4L2xu;
            if (xiZrDbcSW0 || mAr5m2L7gYDP == obj5) {
                defpackage.go0 go0Var = obj instanceof defpackage.go0 ? (defpackage.go0) obj : null;
                defpackage.y IHQe1A4L2xu2 = go0Var != null ? go0Var.IHQe1A4L2xu() : null;
                defpackage.uq0 uq0Var = obj instanceof defpackage.uq0 ? (defpackage.uq0) obj : null;
                mAr5m2L7gYDP = new defpackage.q7(IHQe1A4L2xu2, uq0Var != null ? uq0Var.oh6vYeIP() : null);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            java.lang.Object obj6 = (defpackage.q7) mAr5m2L7gYDP;
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP2 == obj5) {
                mAr5m2L7gYDP2 = defpackage.s21.NHJTzaLwkd(t10Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            defpackage.uj ujVar = (defpackage.uj) mAr5m2L7gYDP2;
            long j = t10Var.Ye0N2xE9Hc;
            boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(obj6) | t10Var.adDC3e2L(j);
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW02 || mAr5m2L7gYDP3 == obj5) {
                mAr5m2L7gYDP3 = new defpackage.mg(ujVar, new defpackage.qw0(j, obj));
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            final defpackage.mg mgVar = (defpackage.mg) mAr5m2L7gYDP3;
            t10Var.AsxAYCCkb3Hi(-348514256);
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(mgVar) | t10Var.EXtogiMhuM(k00Var);
            java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP4 == obj5) {
                mAr5m2L7gYDP4 = new defpackage.DSux0S2nxMSk(9, mgVar, k00Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
            }
            defpackage.s21.DFo87pBq1E5((defpackage.vz) mAr5m2L7gYDP4, t10Var);
            int i3 = i2;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(mgVar) | (i4 == 4);
            java.lang.Object mAr5m2L7gYDP5 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM2 || mAr5m2L7gYDP5 == obj5) {
                mAr5m2L7gYDP5 = new defpackage.g00() { // from class: rw0
                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj7) {
                        defpackage.mg mgVar2 = defpackage.mg.this;
                        mgVar2.adDC3e2L(z);
                        return new defpackage.tw0((defpackage.be0) obj7, mgVar2);
                    }
                };
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP5);
            }
            defpackage.c80.r1MBDhnF(valueOf, mgVar, null, (defpackage.g00) mAr5m2L7gYDP5, t10Var, i4);
            boolean EXtogiMhuM3 = t10Var.EXtogiMhuM(obj6) | t10Var.EXtogiMhuM(mgVar);
            java.lang.Object mAr5m2L7gYDP6 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM3 || mAr5m2L7gYDP6 == obj5) {
                mAr5m2L7gYDP6 = new defpackage.r1MBDhnF(20, obj6, mgVar);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP6);
            }
            defpackage.s21.r1MBDhnF(obj6, mgVar, (defpackage.g00) mAr5m2L7gYDP6, t10Var);
            t10Var.QoRHpC4k(false);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00() { // from class: sw0
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj7, java.lang.Object obj8) {
                    ((java.lang.Integer) obj8).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(i | 1);
                    defpackage.f70.F7NU4MC0GW(z, k00Var, (defpackage.t10) obj7, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final boolean G3OKOH3wZRC(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0287, code lost:
    
        if (r44.AARZUJiTa(true) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IHQe1A4L2xu(defpackage.mj0 mj0Var, defpackage.yc0 yc0Var, defpackage.ct0 ct0Var, defpackage.qm qmVar, boolean z, defpackage.e2 e2Var, defpackage.c8 c8Var, defpackage.j6 j6Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i, int i2) {
        int i3;
        int i4;
        defpackage.yc0 yc0Var2;
        int i5;
        boolean z2;
        java.lang.Object obj;
        boolean z3;
        boolean xiZrDbcSW0;
        java.lang.Object rc0Var;
        defpackage.yc0 yc0Var3;
        boolean z4;
        defpackage.pc0 pc0Var;
        defpackage.mj0 mj0Var2;
        t10Var.QUKZkWRtw6(924924659);
        if ((i & 6) == 0) {
            i3 = (t10Var.xiZrDbcSW0(mj0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= t10Var.xiZrDbcSW0(yc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= t10Var.xiZrDbcSW0(ct0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= t10Var.AARZUJiTa(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= t10Var.AARZUJiTa(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= t10Var.xiZrDbcSW0(qmVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= t10Var.AARZUJiTa(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= t10Var.xiZrDbcSW0(e2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= t10Var.xiZrDbcSW0(c8Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (t10Var.xiZrDbcSW0(j6Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 |= t10Var.EXtogiMhuM(g00Var) ? 2048 : 1024;
        }
        if (t10Var.lpprD5VAS(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) != 0 && !t10Var.NHJTzaLwkd()) {
                t10Var.WLpAkxCo();
            }
            int i7 = i3 & (-234881025);
            t10Var.G3OKOH3wZRC();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            defpackage.sl0 D2vUnMij = defpackage.c80.D2vUnMij(g00Var, t10Var);
            boolean z5 = (((i10 & 14) ^ 6) > 4 && t10Var.xiZrDbcSW0(yc0Var)) || (i10 & 6) == 4;
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
            if (z5 || mAr5m2L7gYDP == obj2) {
                defpackage.hb0 hb0Var = new defpackage.hb0();
                hb0Var.IHQe1A4L2xu = new defpackage.nt0(Integer.MAX_VALUE);
                hb0Var.oh6vYeIP = new defpackage.nt0(Integer.MAX_VALUE);
                defpackage.n nVar = defpackage.n.AsxAYCCkb3Hi;
                i5 = i6;
                defpackage.wb0 wb0Var = new defpackage.wb0(D2vUnMij, 1);
                defpackage.v5 v5Var = defpackage.db1.IHQe1A4L2xu;
                mAr5m2L7gYDP = new defpackage.pc0(0, 0, defpackage.ec1.class, new defpackage.yn(new defpackage.k7(new defpackage.yn(wb0Var, nVar), yc0Var, hb0Var, 4), nVar), "value", "getValue()Ljava/lang/Object;");
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            } else {
                i5 = i6;
            }
            defpackage.pc0 pc0Var2 = (defpackage.pc0) mAr5m2L7gYDP;
            int i11 = i7 >> 9;
            int i12 = (i11 & 112) | i9;
            boolean z6 = ((((i12 & 112) ^ 48) > 32 && t10Var.AARZUJiTa(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && t10Var.xiZrDbcSW0(yc0Var)) || (i12 & 6) == 4);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (z6 || mAr5m2L7gYDP2 == obj2) {
                mAr5m2L7gYDP2 = new defpackage.gc0(yc0Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            defpackage.gc0 gc0Var = (defpackage.gc0) mAr5m2L7gYDP2;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP3 == obj2) {
                mAr5m2L7gYDP3 = defpackage.s21.NHJTzaLwkd(t10Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            defpackage.uj ujVar = (defpackage.uj) mAr5m2L7gYDP3;
            defpackage.p20 p20Var = (defpackage.p20) t10Var.SH1y5HwkJhh(defpackage.ph.AARZUJiTa);
            defpackage.c41 c41Var = !((java.lang.Boolean) t10Var.SH1y5HwkJhh(defpackage.ph.PAEGRtP0bX)).booleanValue() ? defpackage.pc1.IHQe1A4L2xu : null;
            int i13 = i5 << 18;
            int i14 = (i7 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z7 = ((((i14 & 896) ^ 384) > 256 && t10Var.xiZrDbcSW0(ct0Var)) || (i14 & 384) == 256) | ((((i14 & 112) ^ 48) > 32 && t10Var.xiZrDbcSW0(yc0Var)) || (i14 & 48) == 32) | ((((i14 & 7168) ^ 3072) > 2048 && t10Var.AARZUJiTa(false)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) <= 16384) {
            }
            if ((i14 & 24576) != 16384) {
                z2 = false;
                boolean F7NU4MC0GW2 = z7 | z2 | t10Var.F7NU4MC0GW(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && t10Var.xiZrDbcSW0(c8Var)) || (i14 & 1572864) == 1048576);
                if (((i14 & 29360128) ^ 12582912) <= 8388608) {
                    obj = null;
                    if (t10Var.xiZrDbcSW0(null)) {
                        z3 = true;
                        xiZrDbcSW0 = (((i14 & 234881024) ^ 100663296) <= 67108864 && t10Var.xiZrDbcSW0(obj)) | F7NU4MC0GW2 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && t10Var.xiZrDbcSW0(j6Var)) || (i14 & 805306368) == 536870912) | t10Var.xiZrDbcSW0(p20Var) | t10Var.xiZrDbcSW0(c41Var);
                        java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
                        if (!xiZrDbcSW0 || mAr5m2L7gYDP4 == obj2) {
                            yc0Var3 = yc0Var;
                            z4 = true;
                            rc0Var = new defpackage.rc0(yc0Var3, ct0Var, pc0Var2, j6Var, ujVar, p20Var, c41Var, c8Var);
                            pc0Var = pc0Var2;
                            t10Var.OtkytngK3Mr(rc0Var);
                        } else {
                            rc0Var = mAr5m2L7gYDP4;
                            pc0Var = pc0Var2;
                            z4 = true;
                            yc0Var3 = yc0Var;
                        }
                        defpackage.rc0 rc0Var2 = (defpackage.rc0) rc0Var;
                        defpackage.ks0 ks0Var = defpackage.ks0.adDC3e2L;
                        if (z) {
                            t10Var.AsxAYCCkb3Hi(-2077147368);
                            if ((((i8 & 14) ^ 6) <= 4 || !t10Var.xiZrDbcSW0(yc0Var3)) && (i8 & 6) != 4) {
                                z4 = false;
                            }
                            boolean F7NU4MC0GW3 = z4 | t10Var.F7NU4MC0GW(0);
                            java.lang.Object mAr5m2L7gYDP5 = t10Var.mAr5m2L7gYDP();
                            if (F7NU4MC0GW3 || mAr5m2L7gYDP5 == obj2) {
                                mAr5m2L7gYDP5 = new defpackage.lc0(yc0Var3);
                                t10Var.OtkytngK3Mr(mAr5m2L7gYDP5);
                            }
                            mj0Var2 = defpackage.x70.wll2JLbTBC2((defpackage.lc0) mAr5m2L7gYDP5, yc0Var3.cnag84Bm, ks0Var);
                            t10Var.QoRHpC4k(false);
                        } else {
                            t10Var.AsxAYCCkb3Hi(-2076718545);
                            t10Var.QoRHpC4k(false);
                            mj0Var2 = defpackage.jj0.IHQe1A4L2xu;
                        }
                        yc0Var2 = yc0Var3;
                        defpackage.e90.IHQe1A4L2xu(pc0Var, defpackage.mj1.hkbnNdmy(defpackage.s21.SiPhmbmu(mj0Var.r1MBDhnF(yc0Var3.JlrlGoKF).r1MBDhnF(yc0Var3.DFo87pBq1E5), pc0Var, gc0Var, ks0Var, z).r1MBDhnF(mj0Var2).r1MBDhnF(yc0Var3.SyNS6RMn.riuEU0zW4), yc0Var3, ks0Var, e2Var, z, qmVar, yc0Var3.AARZUJiTa), yc0Var2.QoRHpC4k, rc0Var2, t10Var, 0);
                    }
                } else {
                    obj = null;
                }
                z3 = false;
                xiZrDbcSW0 = (((i14 & 234881024) ^ 100663296) <= 67108864 && t10Var.xiZrDbcSW0(obj)) | F7NU4MC0GW2 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && t10Var.xiZrDbcSW0(j6Var)) || (i14 & 805306368) == 536870912) | t10Var.xiZrDbcSW0(p20Var) | t10Var.xiZrDbcSW0(c41Var);
                java.lang.Object mAr5m2L7gYDP42 = t10Var.mAr5m2L7gYDP();
                if (xiZrDbcSW0) {
                }
                yc0Var3 = yc0Var;
                z4 = true;
                rc0Var = new defpackage.rc0(yc0Var3, ct0Var, pc0Var2, j6Var, ujVar, p20Var, c41Var, c8Var);
                pc0Var = pc0Var2;
                t10Var.OtkytngK3Mr(rc0Var);
                defpackage.rc0 rc0Var22 = (defpackage.rc0) rc0Var;
                defpackage.ks0 ks0Var2 = defpackage.ks0.adDC3e2L;
                if (z) {
                }
                yc0Var2 = yc0Var3;
                defpackage.e90.IHQe1A4L2xu(pc0Var, defpackage.mj1.hkbnNdmy(defpackage.s21.SiPhmbmu(mj0Var.r1MBDhnF(yc0Var3.JlrlGoKF).r1MBDhnF(yc0Var3.DFo87pBq1E5), pc0Var, gc0Var, ks0Var2, z).r1MBDhnF(mj0Var2).r1MBDhnF(yc0Var3.SyNS6RMn.riuEU0zW4), yc0Var3, ks0Var2, e2Var, z, qmVar, yc0Var3.AARZUJiTa), yc0Var2.QoRHpC4k, rc0Var22, t10Var, 0);
            }
            z2 = true;
            boolean F7NU4MC0GW22 = z7 | z2 | t10Var.F7NU4MC0GW(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && t10Var.xiZrDbcSW0(c8Var)) || (i14 & 1572864) == 1048576);
            if (((i14 & 29360128) ^ 12582912) <= 8388608) {
            }
            z3 = false;
            xiZrDbcSW0 = (((i14 & 234881024) ^ 100663296) <= 67108864 && t10Var.xiZrDbcSW0(obj)) | F7NU4MC0GW22 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && t10Var.xiZrDbcSW0(j6Var)) || (i14 & 805306368) == 536870912) | t10Var.xiZrDbcSW0(p20Var) | t10Var.xiZrDbcSW0(c41Var);
            java.lang.Object mAr5m2L7gYDP422 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW0) {
            }
            yc0Var3 = yc0Var;
            z4 = true;
            rc0Var = new defpackage.rc0(yc0Var3, ct0Var, pc0Var2, j6Var, ujVar, p20Var, c41Var, c8Var);
            pc0Var = pc0Var2;
            t10Var.OtkytngK3Mr(rc0Var);
            defpackage.rc0 rc0Var222 = (defpackage.rc0) rc0Var;
            defpackage.ks0 ks0Var22 = defpackage.ks0.adDC3e2L;
            if (z) {
            }
            yc0Var2 = yc0Var3;
            defpackage.e90.IHQe1A4L2xu(pc0Var, defpackage.mj1.hkbnNdmy(defpackage.s21.SiPhmbmu(mj0Var.r1MBDhnF(yc0Var3.JlrlGoKF).r1MBDhnF(yc0Var3.DFo87pBq1E5), pc0Var, gc0Var, ks0Var22, z).r1MBDhnF(mj0Var2).r1MBDhnF(yc0Var3.SyNS6RMn.riuEU0zW4), yc0Var3, ks0Var22, e2Var, z, qmVar, yc0Var3.AARZUJiTa), yc0Var2.QoRHpC4k, rc0Var222, t10Var, 0);
        } else {
            yc0Var2 = yc0Var;
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.ka(mj0Var, yc0Var2, ct0Var, qmVar, z, e2Var, c8Var, j6Var, g00Var, i, i2);
        }
    }

    public static final int JlrlGoKF(int i, java.util.List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            defpackage.gt0 gt0Var = (defpackage.gt0) list.get(i3);
            char c = gt0Var.F7NU4MC0GW > i ? (char) 1 : gt0Var.adDC3e2L <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void NHJTzaLwkd(defpackage.nl0 nl0Var, java.lang.Object obj) {
        boolean z;
        long[] jArr = nl0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj2 = nl0Var.oh6vYeIP[i4];
                        java.lang.Object obj3 = nl0Var.r1MBDhnF[i4];
                        if (obj3 instanceof defpackage.ol0) {
                            defpackage.ol0 ol0Var = (defpackage.ol0) obj3;
                            ol0Var.JlrlGoKF(obj);
                            z = ol0Var.AARZUJiTa();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            nl0Var.JlrlGoKF(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void PAEGRtP0bX(defpackage.t10 t10Var, defpackage.g00 g00Var) {
        t10Var.oh6vYeIP(new defpackage.ui0(g00Var, 2), defpackage.ok1.IHQe1A4L2xu);
    }

    public static void QQUzIjv3iOC5(defpackage.oa1 oa1Var, defpackage.oa1 oa1Var2, defpackage.g00 g00Var) {
        if (oa1Var != oa1Var2) {
            oa1Var2.getClass();
            defpackage.oa1.G3OKOH3wZRC(oa1Var);
            oa1Var2.r1MBDhnF();
        } else if (oa1Var instanceof defpackage.ri1) {
            ((defpackage.ri1) oa1Var).kd6TUFXn = g00Var;
        } else if (oa1Var instanceof defpackage.si1) {
            ((defpackage.si1) oa1Var).EXtogiMhuM = g00Var;
        } else {
            defpackage.db.xiZrDbcSW0(oa1Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static defpackage.oa1 QoRHpC4k() {
        return (defpackage.oa1) defpackage.wa1.oh6vYeIP.adDC3e2L();
    }

    public static defpackage.vm1 SH1y5HwkJhh(java.lang.Class cls) {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                java.lang.Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (defpackage.vm1) newInstance;
            } catch (java.lang.IllegalAccessException e) {
                defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e);
                return null;
            } catch (java.lang.InstantiationException e2) {
                defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (java.lang.NoSuchMethodException e3) {
            defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ui1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [g00] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [lj0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [lj0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void SiPhmbmu(defpackage.ui1 ui1Var, defpackage.g00 g00Var) {
        if (!((defpackage.lj0) ui1Var).adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitSubtreeIf called on an unattached node");
        }
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var = ((defpackage.lj0) ui1Var).adDC3e2L;
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        if (lj0Var2 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var);
        } else {
            xl0Var.oh6vYeIP(lj0Var2);
        }
        while (true) {
            int i = xl0Var.AARZUJiTa;
            if (i == 0) {
                return;
            }
            defpackage.lj0 lj0Var3 = (defpackage.lj0) xl0Var.ez2rX8ReCYw(i - 1);
            if ((lj0Var3.EXtogiMhuM & 262144) != 0) {
                for (defpackage.lj0 lj0Var4 = lj0Var3; lj0Var4 != null && lj0Var4.kd6TUFXn; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                    if ((lj0Var4.AARZUJiTa & 262144) != 0) {
                        defpackage.ln lnVar = lj0Var4;
                        ?? r7 = 0;
                        while (lnVar != 0) {
                            if (lnVar instanceof defpackage.ui1) {
                                defpackage.ui1 ui1Var2 = (defpackage.ui1) lnVar;
                                defpackage.ti1 ti1Var = (defpackage.x70.QoRHpC4k(ui1Var.JlrlGoKF(), ui1Var2.JlrlGoKF()) && ui1Var.getClass() == ui1Var2.getClass()) ? (defpackage.ti1) g00Var.AARZUJiTa(ui1Var2) : defpackage.ti1.adDC3e2L;
                                if (ti1Var == defpackage.ti1.AARZUJiTa) {
                                    return;
                                }
                                if (ti1Var == defpackage.ti1.xiZrDbcSW0) {
                                    break;
                                }
                            } else if ((lnVar.AARZUJiTa & 262144) != 0 && (lnVar instanceof defpackage.ln)) {
                                defpackage.lj0 lj0Var5 = lnVar.fnWB2E7cs;
                                int i2 = 0;
                                lnVar = lnVar;
                                r7 = r7;
                                while (lj0Var5 != null) {
                                    if ((lj0Var5.AARZUJiTa & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            lnVar = lj0Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lnVar != 0) {
                                                r7.oh6vYeIP(lnVar);
                                                lnVar = 0;
                                            }
                                            r7.oh6vYeIP(lj0Var5);
                                        }
                                    }
                                    lj0Var5 = lj0Var5.SH1y5HwkJhh;
                                    lnVar = lnVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            lnVar = defpackage.w70.riuEU0zW4(r7);
                        }
                    }
                }
            }
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var3);
        }
    }

    public static final android.graphics.Rect SyNS6RMn(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, android.text.style.MetricAffectingSpan.class) != i2) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final void UsuH8pd5P(defpackage.k00 k00Var, defpackage.t10 t10Var, java.lang.Object obj) {
        if (t10Var.QPwENk36pDC || !defpackage.x70.QoRHpC4k(t10Var.mAr5m2L7gYDP(), obj)) {
            t10Var.OtkytngK3Mr(obj);
            t10Var.oh6vYeIP(k00Var, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V7bD7b8KA(defpackage.lj0 lj0Var, defpackage.vz vzVar) {
        defpackage.eq0 eq0Var = lj0Var.ez2rX8ReCYw;
        if (eq0Var == null) {
            eq0Var = new defpackage.eq0((defpackage.dq0) lj0Var);
            lj0Var.ez2rX8ReCYw = eq0Var;
        }
        defpackage.ws0 snapshotObserver = ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(lj0Var)).getSnapshotObserver();
        snapshotObserver.IHQe1A4L2xu.oh6vYeIP(eq0Var, defpackage.q0.v5iciZok, vzVar);
    }

    public static final boolean abhbClRa(defpackage.nl0 nl0Var, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(obj);
        if (AARZUJiTa == null) {
            return false;
        }
        if (!(AARZUJiTa instanceof defpackage.ol0)) {
            if (!AARZUJiTa.equals(obj2)) {
                return false;
            }
            nl0Var.ez2rX8ReCYw(obj);
            return true;
        }
        defpackage.ol0 ol0Var = (defpackage.ol0) AARZUJiTa;
        boolean JlrlGoKF = ol0Var.JlrlGoKF(obj2);
        if (JlrlGoKF && ol0Var.AARZUJiTa()) {
            nl0Var.ez2rX8ReCYw(obj);
        }
        return JlrlGoKF;
    }

    public static final void adDC3e2L(defpackage.nl0 nl0Var, java.lang.Object obj, java.lang.Object obj2) {
        int xiZrDbcSW0 = nl0Var.xiZrDbcSW0(obj);
        boolean z = xiZrDbcSW0 < 0;
        java.lang.Object obj3 = z ? null : nl0Var.r1MBDhnF[xiZrDbcSW0];
        if (obj3 != null) {
            if (obj3 instanceof defpackage.ol0) {
                ((defpackage.ol0) obj3).IHQe1A4L2xu(obj2);
            } else if (obj3 != obj2) {
                defpackage.ol0 ol0Var = new defpackage.ol0();
                ol0Var.IHQe1A4L2xu(obj3);
                ol0Var.IHQe1A4L2xu(obj2);
                obj2 = ol0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            nl0Var.r1MBDhnF[xiZrDbcSW0] = obj2;
            return;
        }
        int i = ~xiZrDbcSW0;
        nl0Var.oh6vYeIP[i] = obj;
        nl0Var.r1MBDhnF[i] = obj2;
    }

    public static final int cnag84Bm(defpackage.k31 k31Var, java.lang.String str) {
        k31Var.getClass();
        int AARZUJiTa = AARZUJiTa(k31Var, str);
        if (AARZUJiTa >= 0) {
            return AARZUJiTa;
        }
        int columnCount = k31Var.getColumnCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(k31Var.getColumnName(i));
        }
        throw new java.lang.IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + defpackage.td.cSNyPqwud(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int ez2rX8ReCYw(int i, java.util.List list) {
        int i2;
        int i3 = ((defpackage.gt0) defpackage.td.NWDBeGGF(list)).r1MBDhnF;
        if (i > ((defpackage.gt0) defpackage.td.NWDBeGGF(list)).r1MBDhnF) {
            defpackage.y50.IHQe1A4L2xu("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            defpackage.gt0 gt0Var = (defpackage.gt0) list.get(i2);
            char c = gt0Var.oh6vYeIP > i ? (char) 1 : gt0Var.r1MBDhnF <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i2, "Found paragraph index ", " should be in range [0, ");
        JlrlGoKF.append(list.size());
        JlrlGoKF.append(").\nDebug info: index=");
        JlrlGoKF.append(i);
        JlrlGoKF.append(", paragraphs=[");
        JlrlGoKF.append(defpackage.xe0.IHQe1A4L2xu(list, null, new defpackage.uc0(6), 31));
        JlrlGoKF.append(']');
        defpackage.y50.IHQe1A4L2xu(JlrlGoKF.toString());
        return i2;
    }

    public static defpackage.oa1 fnWB2E7cs(defpackage.oa1 oa1Var) {
        if (oa1Var instanceof defpackage.ri1) {
            defpackage.ri1 ri1Var = (defpackage.ri1) oa1Var;
            if (ri1Var.fnWB2E7cs == defpackage.j70.DFo87pBq1E5()) {
                ri1Var.kd6TUFXn = null;
                return oa1Var;
            }
        }
        if (oa1Var instanceof defpackage.si1) {
            defpackage.si1 si1Var = (defpackage.si1) oa1Var;
            if (si1Var.riuEU0zW4 == defpackage.j70.DFo87pBq1E5()) {
                si1Var.EXtogiMhuM = null;
                return oa1Var;
            }
        }
        defpackage.oa1 AARZUJiTa = defpackage.wa1.AARZUJiTa(oa1Var, null, false);
        AARZUJiTa.SH1y5HwkJhh();
        return AARZUJiTa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [g00] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [lj0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [lj0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void frpfPPIgqM9O(defpackage.lj0 lj0Var, java.lang.String str, defpackage.g00 g00Var) {
        if (!lj0Var.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitSubtreeIf called on an unattached node");
        }
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var2 = lj0Var.adDC3e2L;
        defpackage.lj0 lj0Var3 = lj0Var2.SH1y5HwkJhh;
        if (lj0Var3 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var2);
        } else {
            xl0Var.oh6vYeIP(lj0Var3);
        }
        while (true) {
            int i = xl0Var.AARZUJiTa;
            if (i == 0) {
                return;
            }
            defpackage.lj0 lj0Var4 = (defpackage.lj0) xl0Var.ez2rX8ReCYw(i - 1);
            if ((lj0Var4.EXtogiMhuM & 262144) != 0) {
                for (defpackage.lj0 lj0Var5 = lj0Var4; lj0Var5 != null && lj0Var5.kd6TUFXn; lj0Var5 = lj0Var5.SH1y5HwkJhh) {
                    if ((lj0Var5.AARZUJiTa & 262144) != 0) {
                        defpackage.ln lnVar = lj0Var5;
                        ?? r6 = 0;
                        while (lnVar != 0) {
                            if (lnVar instanceof defpackage.ui1) {
                                defpackage.ui1 ui1Var = (defpackage.ui1) lnVar;
                                defpackage.ti1 ti1Var = str.equals(ui1Var.JlrlGoKF()) ? (defpackage.ti1) g00Var.AARZUJiTa(ui1Var) : defpackage.ti1.adDC3e2L;
                                if (ti1Var == defpackage.ti1.AARZUJiTa) {
                                    return;
                                }
                                if (ti1Var == defpackage.ti1.xiZrDbcSW0) {
                                    break;
                                }
                            } else if ((lnVar.AARZUJiTa & 262144) != 0 && (lnVar instanceof defpackage.ln)) {
                                defpackage.lj0 lj0Var6 = lnVar.fnWB2E7cs;
                                int i2 = 0;
                                lnVar = lnVar;
                                r6 = r6;
                                while (lj0Var6 != null) {
                                    if ((lj0Var6.AARZUJiTa & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            lnVar = lj0Var6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lnVar != 0) {
                                                r6.oh6vYeIP(lnVar);
                                                lnVar = 0;
                                            }
                                            r6.oh6vYeIP(lj0Var6);
                                        }
                                    }
                                    lj0Var6 = lj0Var6.SH1y5HwkJhh;
                                    lnVar = lnVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            lnVar = defpackage.w70.riuEU0zW4(r6);
                        }
                    }
                }
            }
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var4);
        }
    }

    public static java.lang.Object kNAkVymC(defpackage.j jVar, defpackage.vz vzVar) {
        defpackage.oa1 ri1Var;
        defpackage.oa1 oa1Var = (defpackage.oa1) defpackage.wa1.oh6vYeIP.adDC3e2L();
        if (oa1Var instanceof defpackage.ri1) {
            defpackage.ri1 ri1Var2 = (defpackage.ri1) oa1Var;
            if (ri1Var2.fnWB2E7cs == defpackage.j70.DFo87pBq1E5()) {
                defpackage.g00 g00Var = ri1Var2.kd6TUFXn;
                defpackage.g00 g00Var2 = ri1Var2.EgCjBq0SZwJ;
                try {
                    ((defpackage.ri1) oa1Var).kd6TUFXn = defpackage.wa1.ez2rX8ReCYw(jVar, g00Var, true);
                    ((defpackage.ri1) oa1Var).EgCjBq0SZwJ = g00Var2;
                    return vzVar.IHQe1A4L2xu();
                } finally {
                    ri1Var2.kd6TUFXn = g00Var;
                    ri1Var2.EgCjBq0SZwJ = g00Var2;
                }
            }
        }
        if (oa1Var == null || (oa1Var instanceof defpackage.rl0)) {
            ri1Var = new defpackage.ri1(oa1Var instanceof defpackage.rl0 ? (defpackage.rl0) oa1Var : null, jVar, null, true, false);
        } else {
            ri1Var = oa1Var.kNAkVymC(jVar);
        }
        try {
            defpackage.oa1 SH1y5HwkJhh = ri1Var.SH1y5HwkJhh();
            try {
                java.lang.Object IHQe1A4L2xu2 = vzVar.IHQe1A4L2xu();
                defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh);
                ri1Var.r1MBDhnF();
                return IHQe1A4L2xu2;
            } catch (java.lang.Throwable th) {
                defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            ri1Var.r1MBDhnF();
            throw th2;
        }
    }

    public static final void kd6TUFXn(defpackage.t10 t10Var, java.lang.Integer num, defpackage.k00 k00Var) {
        if (t10Var.QPwENk36pDC) {
            t10Var.oh6vYeIP(k00Var, num);
        }
    }

    public static final void nBH8hAHy(java.lang.Object obj) {
        if (obj instanceof defpackage.p11) {
            throw ((defpackage.p11) obj).adDC3e2L;
        }
    }

    public static final void oh6vYeIP(final defpackage.qn0 qn0Var, defpackage.mj0 mj0Var, defpackage.e8 e8Var, defpackage.g00 g00Var, defpackage.g00 g00Var2, defpackage.g00 g00Var3, defpackage.g00 g00Var4, final defpackage.g00 g00Var5, defpackage.t10 t10Var, final int i) {
        defpackage.g00 g00Var6;
        defpackage.g00 g00Var7;
        int i2;
        defpackage.e8 e8Var2;
        char c;
        final defpackage.mj0 mj0Var2;
        final defpackage.g00 g00Var8;
        final defpackage.g00 g00Var9;
        final defpackage.g00 g00Var10;
        final defpackage.g00 g00Var11;
        final defpackage.e8 e8Var3;
        t10Var.QUKZkWRtw6(1840250294);
        int i3 = i | (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | 844852608;
        char c2 = t10Var.EXtogiMhuM(g00Var5) ? (char) 4 : (char) 2;
        if ((306783379 & i3) == 306783378 && (c2 & 3) == 2 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
            mj0Var2 = mj0Var;
            e8Var3 = e8Var;
            g00Var8 = g00Var;
            g00Var9 = g00Var2;
            g00Var10 = g00Var3;
            g00Var11 = g00Var4;
        } else {
            t10Var.Ye0N2xE9Hc();
            int i4 = i & 1;
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (i4 == 0 || t10Var.NHJTzaLwkd()) {
                defpackage.e8 e8Var4 = defpackage.n.xiZrDbcSW0;
                java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                if (mAr5m2L7gYDP == ad1Var) {
                    mAr5m2L7gYDP = new defpackage.uc0(16);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                }
                g00Var6 = (defpackage.g00) mAr5m2L7gYDP;
                java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                if (mAr5m2L7gYDP2 == ad1Var) {
                    mAr5m2L7gYDP2 = new defpackage.uc0(18);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                }
                g00Var7 = (defpackage.g00) mAr5m2L7gYDP2;
                i2 = i3 & (-264241153);
                e8Var2 = e8Var4;
                c = c2;
                mj0Var2 = defpackage.jj0.IHQe1A4L2xu;
                g00Var8 = g00Var6;
                g00Var9 = g00Var7;
            } else {
                t10Var.WLpAkxCo();
                mj0Var2 = mj0Var;
                g00Var9 = g00Var2;
                g00Var6 = g00Var3;
                g00Var7 = g00Var4;
                i2 = i3 & (-264241153);
                c = c2;
                e8Var2 = e8Var;
                g00Var8 = g00Var;
            }
            t10Var.G3OKOH3wZRC();
            boolean z = (c & 14) == 4;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (z || mAr5m2L7gYDP3 == ad1Var) {
                defpackage.ln0 ln0Var = new defpackage.ln0(qn0Var.oh6vYeIP.EgCjBq0SZwJ);
                g00Var5.AARZUJiTa(ln0Var);
                mAr5m2L7gYDP3 = ln0Var.r1MBDhnF();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            g00Var10 = g00Var6;
            g00Var11 = g00Var7;
            e8Var3 = e8Var2;
            r1MBDhnF(qn0Var, (defpackage.kn0) mAr5m2L7gYDP3, mj0Var2, e8Var3, g00Var8, g00Var9, g00Var10, g00Var11, t10Var, (i2 & 8078) | 100884480);
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var2, e8Var3, g00Var8, g00Var9, g00Var10, g00Var11, g00Var5, i) { // from class: tn0
                public final /* synthetic */ defpackage.e8 AARZUJiTa;
                public final /* synthetic */ defpackage.g00 EXtogiMhuM;
                public final /* synthetic */ defpackage.g00 JlrlGoKF;
                public final /* synthetic */ defpackage.g00 SH1y5HwkJhh;
                public final /* synthetic */ defpackage.g00 ez2rX8ReCYw;
                public final /* synthetic */ defpackage.g00 riuEU0zW4;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(49);
                    defpackage.f70.oh6vYeIP(defpackage.qn0.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, (defpackage.t10) obj, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v21, types: [gn0, kn0] */
    /* JADX WARN: Type inference failed for: r12v3, types: [t10] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v21, types: [ej] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r23v2, types: [ej] */
    /* JADX WARN: Type inference failed for: r23v4, types: [ej] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, li1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r1MBDhnF(final defpackage.qn0 qn0Var, final defpackage.kn0 kn0Var, final defpackage.mj0 mj0Var, final defpackage.e8 e8Var, final defpackage.g00 g00Var, final defpackage.g00 g00Var2, final defpackage.g00 g00Var3, final defpackage.g00 g00Var4, defpackage.t10 t10Var, final int i) {
        defpackage.po0 po0Var;
        defpackage.ud0 ud0Var;
        int i2;
        defpackage.sl0 sl0Var;
        final defpackage.sl0 sl0Var2;
        boolean z;
        java.lang.Object obj;
        defpackage.po0 po0Var2;
        defpackage.no noVar;
        defpackage.po0 po0Var3;
        final defpackage.gg ggVar;
        defpackage.nm0 nm0Var;
        boolean z2;
        defpackage.el0 el0Var;
        defpackage.g00 g00Var5;
        defpackage.sl0 sl0Var3;
        defpackage.ec1 ec1Var;
        ?? r15;
        defpackage.s61 s61Var;
        defpackage.li1 li1Var;
        defpackage.nm0 nm0Var2;
        defpackage.no noVar2;
        java.lang.Object obj2;
        defpackage.gg ggVar2;
        defpackage.sl0 sl0Var4;
        defpackage.no noVar3;
        java.lang.Object obj3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        java.util.ArrayList arrayList;
        int length;
        int i3;
        java.lang.String str;
        defpackage.gn0 IHQe1A4L2xu2;
        defpackage.kn0 kn0Var2;
        int i4;
        android.os.Bundle bundle;
        defpackage.gn0 IHQe1A4L2xu3;
        defpackage.kn0 kn0Var3;
        defpackage.t10 t10Var2;
        t10Var.QUKZkWRtw6(-1964664536);
        int i5 = (i & 6) == 0 ? (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= t10Var.EXtogiMhuM(kn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= t10Var.xiZrDbcSW0(mj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= t10Var.xiZrDbcSW0(e8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= t10Var.EXtogiMhuM(g00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= t10Var.EXtogiMhuM(g00Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= t10Var.EXtogiMhuM(g00Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= t10Var.EXtogiMhuM(g00Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= t10Var.EXtogiMhuM(null) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
            t10Var2 = t10Var;
        } else {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) != 0 && !t10Var.NHJTzaLwkd()) {
                t10Var.WLpAkxCo();
            }
            t10Var.G3OKOH3wZRC();
            defpackage.ud0 ud0Var2 = (defpackage.ud0) t10Var.SH1y5HwkJhh(defpackage.ye0.IHQe1A4L2xu);
            defpackage.cn1 IHQe1A4L2xu4 = defpackage.df0.IHQe1A4L2xu(t10Var);
            if (IHQe1A4L2xu4 == null) {
                defpackage.db.AARZUJiTa("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            defpackage.bn1 AARZUJiTa = IHQe1A4L2xu4.AARZUJiTa();
            qn0Var.getClass();
            defpackage.ym0 ym0Var = qn0Var.oh6vYeIP;
            ym0Var.getClass();
            defpackage.po0 po0Var4 = ym0Var.EgCjBq0SZwJ;
            if (!defpackage.x70.QoRHpC4k(ym0Var.cnag84Bm, defpackage.l80.SyNS6RMn(AARZUJiTa))) {
                if (!ym0Var.xiZrDbcSW0.isEmpty()) {
                    defpackage.db.AARZUJiTa("ViewModelStore should be set before setGraph call");
                    return;
                }
                ym0Var.cnag84Bm = defpackage.l80.SyNS6RMn(AARZUJiTa);
            }
            kn0Var.getClass();
            ym0Var.getClass();
            java.util.LinkedHashMap linkedHashMap = ym0Var.fnWB2E7cs;
            defpackage.nn0 nn0Var = kn0Var.SH1y5HwkJhh;
            defpackage.l6 l6Var = ym0Var.xiZrDbcSW0;
            if (!l6Var.isEmpty() && ym0Var.riuEU0zW4() == defpackage.nd0.adDC3e2L) {
                defpackage.db.AARZUJiTa("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z3 = false;
            if (defpackage.x70.QoRHpC4k(ym0Var.r1MBDhnF, kn0Var)) {
                po0Var = po0Var4;
                ud0Var = ud0Var2;
                i2 = i6;
                int adDC3e2L = nn0Var.oh6vYeIP.adDC3e2L();
                for (int i7 = 0; i7 < adDC3e2L; i7++) {
                    defpackage.gn0 gn0Var = (defpackage.gn0) nn0Var.oh6vYeIP.xiZrDbcSW0(i7);
                    defpackage.kn0 kn0Var4 = ym0Var.r1MBDhnF;
                    kn0Var4.getClass();
                    int r1MBDhnF2 = kn0Var4.SH1y5HwkJhh.oh6vYeIP.r1MBDhnF(i7);
                    defpackage.kn0 kn0Var5 = ym0Var.r1MBDhnF;
                    kn0Var5.getClass();
                    defpackage.qb1 qb1Var = kn0Var5.SH1y5HwkJhh.oh6vYeIP;
                    if (qb1Var.adDC3e2L) {
                        defpackage.mj1.QoRHpC4k(qb1Var);
                    }
                    int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(qb1Var.xiZrDbcSW0, qb1Var.EXtogiMhuM, r1MBDhnF2);
                    if (G3OKOH3wZRC >= 0) {
                        java.lang.Object[] objArr = qb1Var.AARZUJiTa;
                        java.lang.Object obj4 = objArr[G3OKOH3wZRC];
                        objArr[G3OKOH3wZRC] = gn0Var;
                    }
                }
                java.util.Iterator it = l6Var.iterator();
                while (it.hasNext()) {
                    defpackage.nm0 nm0Var3 = (defpackage.nm0) it.next();
                    int i8 = defpackage.gn0.riuEU0zW4;
                    defpackage.y11 y11Var = new defpackage.y11(defpackage.a81.wll2JLbTBC2(defpackage.x80.PAEGRtP0bX(nm0Var3.xiZrDbcSW0)));
                    defpackage.gn0 gn0Var2 = ym0Var.r1MBDhnF;
                    gn0Var2.getClass();
                    java.util.Iterator it2 = y11Var.iterator();
                    while (true) {
                        java.util.ListIterator listIterator = (java.util.ListIterator) ((defpackage.x11) it2).xiZrDbcSW0;
                        if (listIterator.hasPrevious()) {
                            defpackage.gn0 gn0Var3 = (defpackage.gn0) listIterator.previous();
                            if (defpackage.x70.QoRHpC4k(gn0Var3, ym0Var.r1MBDhnF) && gn0Var2.equals(kn0Var)) {
                            }
                            if (gn0Var2 instanceof defpackage.kn0) {
                                gn0Var2 = ((defpackage.kn0) gn0Var2).SH1y5HwkJhh.IHQe1A4L2xu(gn0Var3.xiZrDbcSW0.IHQe1A4L2xu);
                                gn0Var2.getClass();
                            }
                        }
                    }
                    nm0Var3.xiZrDbcSW0 = gn0Var2;
                }
            } else {
                defpackage.kn0 kn0Var6 = ym0Var.r1MBDhnF;
                if (kn0Var6 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ym0Var.JlrlGoKF.keySet());
                    int size = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        java.lang.Object obj5 = arrayList2.get(i9);
                        int i10 = i9 + 1;
                        java.lang.Integer num = (java.lang.Integer) obj5;
                        num.getClass();
                        java.util.ArrayList arrayList3 = arrayList2;
                        int intValue = num.intValue();
                        java.util.Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((defpackage.um0) it3.next()).F7NU4MC0GW = true;
                            size = size;
                            i10 = i10;
                        }
                        int i11 = size;
                        int i12 = i10;
                        boolean kd6TUFXn = ym0Var.kd6TUFXn(intValue, null, new defpackage.co0(z3, true, -1, z3, z3, -1, -1));
                        for (java.util.Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((defpackage.um0) it4.next()).F7NU4MC0GW = false;
                            kd6TUFXn = kd6TUFXn;
                        }
                        if (kd6TUFXn) {
                            ym0Var.SyNS6RMn(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        size = i11;
                        i9 = i12;
                        z3 = false;
                    }
                    ym0Var.SyNS6RMn(kn0Var6.xiZrDbcSW0.IHQe1A4L2xu, true, false);
                }
                ym0Var.r1MBDhnF = kn0Var;
                defpackage.po0 po0Var5 = ym0Var.EgCjBq0SZwJ;
                defpackage.qn0 qn0Var2 = ym0Var.IHQe1A4L2xu;
                defpackage.a6 a6Var = qn0Var2.r1MBDhnF;
                android.os.Bundle bundle2 = ym0Var.F7NU4MC0GW;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        defpackage.c80.abhbClRa("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        java.lang.String str2 = stringArrayList.get(i13);
                        i13++;
                        int i14 = size2;
                        java.lang.String str3 = str2;
                        po0Var5.oh6vYeIP(str3);
                        if (bundle2.containsKey(str3) && bundle2.getBundle(str3) == null) {
                            defpackage.c80.abhbClRa(str3);
                            throw null;
                        }
                        size2 = i14;
                    }
                }
                android.os.Bundle[] bundleArr = ym0Var.adDC3e2L;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        android.os.Bundle[] bundleArr2 = bundleArr;
                        android.os.Bundle bundle3 = bundleArr2[i15];
                        bundle3.getClass();
                        int i16 = length2;
                        bundle3.setClassLoader(defpackage.rm0.class.getClassLoader());
                        java.lang.String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            defpackage.c80.abhbClRa("nav-entry-state:id");
                            throw null;
                        }
                        int PAEGRtP0bX = defpackage.s70.PAEGRtP0bX(bundle3, "nav-entry-state:destination-id");
                        int i17 = i15;
                        android.os.Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            defpackage.c80.abhbClRa("nav-entry-state:args");
                            throw null;
                        }
                        android.os.Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            defpackage.c80.abhbClRa("nav-entry-state:saved-state");
                            throw null;
                        }
                        defpackage.gn0 F7NU4MC0GW2 = ym0Var.F7NU4MC0GW(PAEGRtP0bX, null);
                        if (F7NU4MC0GW2 == null) {
                            int i18 = defpackage.gn0.riuEU0zW4;
                            throw new java.lang.IllegalStateException("Restoring the Navigation back stack failed: destination " + defpackage.x80.V7bD7b8KA(a6Var, PAEGRtP0bX) + " cannot be found from the current destination " + ym0Var.EXtogiMhuM());
                        }
                        defpackage.nd0 riuEU0zW4 = ym0Var.riuEU0zW4();
                        defpackage.zm0 zm0Var = ym0Var.cnag84Bm;
                        a6Var.getClass();
                        riuEU0zW4.getClass();
                        android.content.Context context = a6Var.IHQe1A4L2xu;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        defpackage.nm0 nm0Var4 = new defpackage.nm0(a6Var, F7NU4MC0GW2, bundle4, riuEU0zW4, zm0Var, string, bundle5);
                        defpackage.oo0 oh6vYeIP2 = po0Var5.oh6vYeIP(F7NU4MC0GW2.adDC3e2L);
                        java.lang.Object obj6 = linkedHashMap.get(oh6vYeIP2);
                        java.lang.Object obj7 = obj6;
                        if (obj6 == null) {
                            defpackage.um0 um0Var = new defpackage.um0(qn0Var2, oh6vYeIP2);
                            linkedHashMap.put(oh6vYeIP2, um0Var);
                            obj7 = um0Var;
                        }
                        l6Var.addLast(nm0Var4);
                        ((defpackage.um0) obj7).IHQe1A4L2xu(nm0Var4);
                        defpackage.kn0 kn0Var7 = nm0Var4.xiZrDbcSW0.AARZUJiTa;
                        if (kn0Var7 != null) {
                            ym0Var.ez2rX8ReCYw(nm0Var4, ym0Var.xiZrDbcSW0(kn0Var7.xiZrDbcSW0.IHQe1A4L2xu));
                        }
                        i15 = i17 + 1;
                        bundleArr = bundleArr2;
                        length2 = i16;
                    }
                    ym0Var.oh6vYeIP.IHQe1A4L2xu();
                    ym0Var.adDC3e2L = null;
                }
                java.util.Collection values = defpackage.yh0.XZx205DYe(po0Var5.IHQe1A4L2xu).values();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj8 : values) {
                    if (!((defpackage.oo0) obj8).oh6vYeIP) {
                        arrayList4.add(obj8);
                    }
                }
                int size3 = arrayList4.size();
                int i19 = 0;
                while (i19 < size3) {
                    java.lang.Object obj9 = arrayList4.get(i19);
                    i19++;
                    defpackage.oo0 oo0Var = (defpackage.oo0) obj9;
                    java.lang.Object obj10 = linkedHashMap.get(oo0Var);
                    if (obj10 == null) {
                        oo0Var.getClass();
                        obj10 = new defpackage.um0(qn0Var2, oo0Var);
                        linkedHashMap.put(oo0Var, obj10);
                    }
                    oo0Var.getClass();
                    oo0Var.IHQe1A4L2xu = (defpackage.um0) obj10;
                    oo0Var.oh6vYeIP = true;
                }
                if (ym0Var.r1MBDhnF == null || !l6Var.isEmpty()) {
                    po0Var = po0Var4;
                    ud0Var = ud0Var2;
                    i2 = i6;
                    ym0Var.oh6vYeIP();
                } else {
                    android.app.Activity activity = qn0Var2.F7NU4MC0GW;
                    if (!qn0Var2.adDC3e2L && activity != null) {
                        android.content.Intent intent = activity.getIntent();
                        defpackage.ym0 ym0Var2 = qn0Var2.oh6vYeIP;
                        if (intent != null) {
                            android.os.Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (java.lang.Exception e) {
                                    i2 = i6;
                                    android.util.Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    iArr = null;
                                }
                            } else {
                                iArr = null;
                            }
                            i2 = i6;
                            java.util.ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                            android.os.Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                SyNS6RMn.putAll(bundle6);
                            }
                            if (iArr == null || iArr.length == 0) {
                                ?? SH1y5HwkJhh = ym0Var2.SH1y5HwkJhh();
                                iArr2 = iArr;
                                ud0Var = ud0Var2;
                                po0Var = po0Var4;
                                defpackage.fn0 adDC3e2L2 = SH1y5HwkJhh.adDC3e2L(new defpackage.v5(intent.getData(), intent.getAction(), intent.getType(), 10), SH1y5HwkJhh);
                                if (adDC3e2L2 != null) {
                                    defpackage.gn0 gn0Var4 = adDC3e2L2.adDC3e2L;
                                    defpackage.l6 l6Var2 = new defpackage.l6();
                                    defpackage.gn0 gn0Var5 = gn0Var4;
                                    while (true) {
                                        defpackage.jn0 jn0Var = gn0Var5.xiZrDbcSW0;
                                        defpackage.kn0 kn0Var8 = gn0Var5.AARZUJiTa;
                                        if (kn0Var8 == null || kn0Var8.SH1y5HwkJhh.r1MBDhnF != jn0Var.IHQe1A4L2xu) {
                                            l6Var2.addFirst(gn0Var5);
                                        }
                                        if (!defpackage.x70.QoRHpC4k(kn0Var8, null) && kn0Var8 != null) {
                                            gn0Var5 = kn0Var8;
                                        }
                                    }
                                    java.util.List boH8X4DXyc4 = defpackage.td.boH8X4DXyc4(l6Var2);
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(boH8X4DXyc4, 10));
                                    java.util.Iterator it5 = boH8X4DXyc4.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(java.lang.Integer.valueOf(((defpackage.gn0) it5.next()).xiZrDbcSW0.IHQe1A4L2xu));
                                    }
                                    int[] iArr4 = new int[arrayList5.size()];
                                    java.util.Iterator it6 = arrayList5.iterator();
                                    int i20 = 0;
                                    while (it6.hasNext()) {
                                        iArr4[i20] = ((java.lang.Number) it6.next()).intValue();
                                        i20++;
                                    }
                                    android.os.Bundle IHQe1A4L2xu5 = gn0Var4.IHQe1A4L2xu(adDC3e2L2.xiZrDbcSW0);
                                    if (IHQe1A4L2xu5 != null) {
                                        SyNS6RMn.putAll(IHQe1A4L2xu5);
                                    }
                                    iArr3 = iArr4;
                                    arrayList = null;
                                    if (iArr3 != null && iArr3.length != 0) {
                                        ym0Var2.getClass();
                                        defpackage.kn0 kn0Var9 = ym0Var2.r1MBDhnF;
                                        length = iArr3.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i21 = iArr3[i3];
                                            if (i3 == 0) {
                                                defpackage.kn0 kn0Var10 = ym0Var2.r1MBDhnF;
                                                kn0Var10.getClass();
                                                IHQe1A4L2xu3 = kn0Var10.xiZrDbcSW0.IHQe1A4L2xu == i21 ? ym0Var2.r1MBDhnF : null;
                                            } else {
                                                kn0Var9.getClass();
                                                IHQe1A4L2xu3 = kn0Var9.SH1y5HwkJhh.IHQe1A4L2xu(i21);
                                            }
                                            if (IHQe1A4L2xu3 == null) {
                                                int i22 = defpackage.gn0.riuEU0zW4;
                                                str = defpackage.x80.V7bD7b8KA(ym0Var2.IHQe1A4L2xu.r1MBDhnF, i21);
                                                break;
                                            }
                                            if (i3 != iArr3.length - 1 && (IHQe1A4L2xu3 instanceof defpackage.kn0)) {
                                                while (true) {
                                                    kn0Var3 = (defpackage.kn0) IHQe1A4L2xu3;
                                                    kn0Var3.getClass();
                                                    defpackage.nn0 nn0Var2 = kn0Var3.SH1y5HwkJhh;
                                                    if (!(nn0Var2.IHQe1A4L2xu(nn0Var2.r1MBDhnF) instanceof defpackage.kn0)) {
                                                        break;
                                                    } else {
                                                        IHQe1A4L2xu3 = nn0Var2.IHQe1A4L2xu(nn0Var2.r1MBDhnF);
                                                    }
                                                }
                                                kn0Var9 = kn0Var3;
                                            }
                                            i3++;
                                        }
                                        if (str == null) {
                                            android.util.Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            SyNS6RMn.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr3.length;
                                            android.os.Bundle[] bundleArr3 = new android.os.Bundle[length3];
                                            for (int i23 = 0; i23 < length3; i23++) {
                                                android.os.Bundle SyNS6RMn2 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                                                SyNS6RMn2.putAll(SyNS6RMn);
                                                if (arrayList != null && (bundle = (android.os.Bundle) arrayList.get(i23)) != null) {
                                                    SyNS6RMn2.putAll(bundle);
                                                }
                                                bundleArr3[i23] = SyNS6RMn2;
                                            }
                                            int flags = intent.getFlags();
                                            int i24 = 268435456 & flags;
                                            if (i24 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                android.content.Context context2 = qn0Var2.IHQe1A4L2xu;
                                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                                android.content.ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context2.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList6.size();
                                                    try {
                                                        for (android.content.Intent abhbClRa = defpackage.s70.abhbClRa(context2, component); abhbClRa != null; abhbClRa = defpackage.s70.abhbClRa(context2, abhbClRa.getComponent())) {
                                                            arrayList6.add(size4, abhbClRa);
                                                        }
                                                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                                                        android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new java.lang.IllegalArgumentException(e2);
                                                    }
                                                }
                                                arrayList6.add(intent);
                                                if (arrayList6.isEmpty()) {
                                                    defpackage.db.AARZUJiTa("No intents added to TaskStackBuilder; cannot startActivities");
                                                    return;
                                                }
                                                android.content.Intent[] intentArr = (android.content.Intent[]) arrayList6.toArray(new android.content.Intent[0]);
                                                intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
                                                context2.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i24 != 0) {
                                                if (ym0Var2.xiZrDbcSW0.isEmpty()) {
                                                    i4 = 0;
                                                } else {
                                                    defpackage.kn0 kn0Var11 = ym0Var2.r1MBDhnF;
                                                    kn0Var11.getClass();
                                                    i4 = 0;
                                                    ym0Var2.SyNS6RMn(kn0Var11.xiZrDbcSW0.IHQe1A4L2xu, true, false);
                                                }
                                                while (i4 < iArr3.length) {
                                                    int i25 = iArr3[i4];
                                                    int i26 = i4 + 1;
                                                    android.os.Bundle bundle7 = bundleArr3[i4];
                                                    defpackage.gn0 F7NU4MC0GW3 = ym0Var2.F7NU4MC0GW(i25, null);
                                                    if (F7NU4MC0GW3 == null) {
                                                        int i27 = defpackage.gn0.riuEU0zW4;
                                                        throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.x80.V7bD7b8KA(a6Var, i25) + " cannot be found from the current destination " + ym0Var2.EXtogiMhuM());
                                                    }
                                                    ym0Var2.JlrlGoKF(F7NU4MC0GW3, bundle7, defpackage.j70.NHJTzaLwkd(new defpackage.r1MBDhnF(16, F7NU4MC0GW3, qn0Var2)));
                                                    i4 = i26;
                                                }
                                                qn0Var2.adDC3e2L = true;
                                            } else {
                                                defpackage.kn0 kn0Var12 = ym0Var2.r1MBDhnF;
                                                int length4 = iArr3.length;
                                                for (int i28 = 0; i28 < length4; i28++) {
                                                    int i29 = iArr3[i28];
                                                    android.os.Bundle bundle8 = bundleArr3[i28];
                                                    if (i28 == 0) {
                                                        IHQe1A4L2xu2 = ym0Var2.r1MBDhnF;
                                                    } else {
                                                        kn0Var12.getClass();
                                                        IHQe1A4L2xu2 = kn0Var12.SH1y5HwkJhh.IHQe1A4L2xu(i29);
                                                    }
                                                    if (IHQe1A4L2xu2 == null) {
                                                        int i30 = defpackage.gn0.riuEU0zW4;
                                                        throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.x80.V7bD7b8KA(a6Var, i29) + " cannot be found in graph " + kn0Var12);
                                                    }
                                                    if (i28 == iArr3.length - 1) {
                                                        defpackage.kn0 kn0Var13 = ym0Var2.r1MBDhnF;
                                                        kn0Var13.getClass();
                                                        ym0Var2.JlrlGoKF(IHQe1A4L2xu2, bundle8, new defpackage.co0(false, false, kn0Var13.xiZrDbcSW0.IHQe1A4L2xu, true, false, 0, 0));
                                                    } else if (IHQe1A4L2xu2 instanceof defpackage.kn0) {
                                                        while (true) {
                                                            kn0Var2 = (defpackage.kn0) IHQe1A4L2xu2;
                                                            kn0Var2.getClass();
                                                            defpackage.nn0 nn0Var3 = kn0Var2.SH1y5HwkJhh;
                                                            if (!(nn0Var3.IHQe1A4L2xu(nn0Var3.r1MBDhnF) instanceof defpackage.kn0)) {
                                                                break;
                                                            } else {
                                                                IHQe1A4L2xu2 = nn0Var3.IHQe1A4L2xu(nn0Var3.r1MBDhnF);
                                                            }
                                                        }
                                                        kn0Var12 = kn0Var2;
                                                    }
                                                }
                                                qn0Var2.adDC3e2L = true;
                                            }
                                        }
                                    }
                                    defpackage.kn0 kn0Var14 = ym0Var.r1MBDhnF;
                                    kn0Var14.getClass();
                                    ym0Var.JlrlGoKF(kn0Var14, null, null);
                                }
                            } else {
                                iArr2 = iArr;
                                po0Var = po0Var4;
                                ud0Var = ud0Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr3 = iArr2;
                            if (iArr3 != null) {
                                ym0Var2.getClass();
                                defpackage.kn0 kn0Var92 = ym0Var2.r1MBDhnF;
                                length = iArr3.length;
                                i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                    }
                                    i3++;
                                }
                                if (str == null) {
                                }
                            }
                            defpackage.kn0 kn0Var142 = ym0Var.r1MBDhnF;
                            kn0Var142.getClass();
                            ym0Var.JlrlGoKF(kn0Var142, null, null);
                        }
                    }
                    po0Var = po0Var4;
                    ud0Var = ud0Var2;
                    i2 = i6;
                    defpackage.kn0 kn0Var1422 = ym0Var.r1MBDhnF;
                    kn0Var1422.getClass();
                    ym0Var.JlrlGoKF(kn0Var1422, null, null);
                }
            }
            defpackage.po0 po0Var6 = po0Var;
            defpackage.oo0 oh6vYeIP3 = po0Var6.oh6vYeIP("composable");
            defpackage.gg ggVar3 = oh6vYeIP3 instanceof defpackage.gg ? (defpackage.gg) oh6vYeIP3 : null;
            if (ggVar3 == null) {
                defpackage.az0 kd6TUFXn2 = t10Var.kd6TUFXn();
                if (kd6TUFXn2 != null) {
                    final int i31 = 2;
                    kd6TUFXn2.F7NU4MC0GW = new defpackage.k00() { // from class: un0
                        @Override // defpackage.k00
                        public final java.lang.Object adDC3e2L(java.lang.Object obj11, java.lang.Object obj12) {
                            int i32 = i31;
                            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                            int i33 = i;
                            switch (i32) {
                                case 0:
                                    ((java.lang.Integer) obj12).getClass();
                                    int hyxIchWRW = defpackage.a70.hyxIchWRW(i33 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj11, hyxIchWRW);
                                    break;
                                case 1:
                                    ((java.lang.Integer) obj12).getClass();
                                    int hyxIchWRW2 = defpackage.a70.hyxIchWRW(i33 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj11, hyxIchWRW2);
                                    break;
                                default:
                                    ((java.lang.Integer) obj12).getClass();
                                    int hyxIchWRW3 = defpackage.a70.hyxIchWRW(i33 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj11, hyxIchWRW3);
                                    break;
                            }
                            return ok1Var;
                        }
                    };
                    return;
                }
                return;
            }
            ?? r12 = t10Var;
            defpackage.sl0 ez2rX8ReCYw = defpackage.c80.ez2rX8ReCYw(ggVar3.oh6vYeIP().adDC3e2L, r12);
            java.lang.Object mAr5m2L7gYDP = r12.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            java.lang.Object obj11 = mAr5m2L7gYDP;
            if (mAr5m2L7gYDP == ad1Var) {
                defpackage.mt0 mt0Var = new defpackage.mt0(0.0f);
                r12.OtkytngK3Mr(mt0Var);
                obj11 = mt0Var;
            }
            defpackage.mt0 mt0Var2 = (defpackage.mt0) obj11;
            java.lang.Object mAr5m2L7gYDP2 = r12.mAr5m2L7gYDP();
            java.lang.Object obj12 = mAr5m2L7gYDP2;
            if (mAr5m2L7gYDP2 == ad1Var) {
                defpackage.qt0 nBH8hAHy = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
                r12.OtkytngK3Mr(nBH8hAHy);
                obj12 = nBH8hAHy;
            }
            defpackage.sl0 sl0Var5 = (defpackage.sl0) obj12;
            boolean z4 = ((java.util.List) ez2rX8ReCYw.getValue()).size() > 1;
            boolean xiZrDbcSW0 = r12.xiZrDbcSW0(ez2rX8ReCYw) | r12.EXtogiMhuM(ggVar3);
            java.lang.Object mAr5m2L7gYDP3 = r12.mAr5m2L7gYDP();
            if (xiZrDbcSW0 || mAr5m2L7gYDP3 == ad1Var) {
                defpackage.gg ggVar4 = ggVar3;
                defpackage.cl clVar = new defpackage.cl(ggVar4, ez2rX8ReCYw, mt0Var2, sl0Var5, null, 2);
                sl0Var = ez2rX8ReCYw;
                sl0Var2 = sl0Var5;
                ggVar3 = ggVar4;
                r12.OtkytngK3Mr(clVar);
                mAr5m2L7gYDP3 = clVar;
            } else {
                sl0Var = ez2rX8ReCYw;
                sl0Var2 = sl0Var5;
            }
            defpackage.c80.adDC3e2L(z4, (defpackage.k00) mAr5m2L7gYDP3, r12, 0);
            defpackage.ud0 ud0Var3 = ud0Var;
            boolean EXtogiMhuM = r12.EXtogiMhuM(qn0Var) | r12.EXtogiMhuM(ud0Var3);
            java.lang.Object mAr5m2L7gYDP4 = r12.mAr5m2L7gYDP();
            int i32 = 18;
            java.lang.Object obj13 = mAr5m2L7gYDP4;
            if (EXtogiMhuM || mAr5m2L7gYDP4 == ad1Var) {
                defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(i32, qn0Var, ud0Var3);
                r12.OtkytngK3Mr(r1mbdhnf);
                obj13 = r1mbdhnf;
            }
            defpackage.s21.oh6vYeIP(ud0Var3, (defpackage.g00) obj13, r12);
            defpackage.s31 nBH8hAHy2 = defpackage.j70.nBH8hAHy(r12);
            defpackage.sl0 ez2rX8ReCYw2 = defpackage.c80.ez2rX8ReCYw(ym0Var.riuEU0zW4, r12);
            java.lang.Object mAr5m2L7gYDP5 = r12.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP5 == ad1Var) {
                z = false;
                defpackage.yn QoRHpC4k = defpackage.c80.QoRHpC4k(new defpackage.vn0(ez2rX8ReCYw2, false ? 1 : 0));
                r12.OtkytngK3Mr(QoRHpC4k);
                obj = QoRHpC4k;
            } else {
                z = false;
                obj = mAr5m2L7gYDP5;
            }
            defpackage.ec1 ec1Var2 = (defpackage.ec1) obj;
            defpackage.nm0 nm0Var5 = (defpackage.nm0) defpackage.td.FyULxpbU8bu((java.util.List) ec1Var2.getValue());
            java.lang.Object mAr5m2L7gYDP6 = r12.mAr5m2L7gYDP();
            java.lang.Object obj14 = mAr5m2L7gYDP6;
            if (mAr5m2L7gYDP6 == ad1Var) {
                int i33 = defpackage.tp0.IHQe1A4L2xu;
                defpackage.el0 el0Var2 = new defpackage.el0(6);
                r12.OtkytngK3Mr(el0Var2);
                obj14 = el0Var2;
            }
            defpackage.el0 el0Var3 = (defpackage.el0) obj14;
            if (nm0Var5 != null) {
                r12.AsxAYCCkb3Hi(-1797250687);
                boolean EXtogiMhuM2 = r12.EXtogiMhuM(ggVar3) | ((((i2 & 3670016) ^ 1572864) > 1048576 && r12.xiZrDbcSW0(g00Var3)) || (i2 & 1572864) == 1048576) | ((i2 & 57344) == 16384);
                java.lang.Object mAr5m2L7gYDP7 = r12.mAr5m2L7gYDP();
                if (EXtogiMhuM2 || mAr5m2L7gYDP7 == ad1Var) {
                    final int i34 = 1;
                    po0Var3 = po0Var6;
                    ggVar = ggVar3;
                    nm0Var = nm0Var5;
                    z2 = false;
                    el0Var = el0Var3;
                    defpackage.g00 g00Var6 = new defpackage.g00() { // from class: rn0
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj15) {
                            int i35 = i34;
                            defpackage.sl0 sl0Var6 = sl0Var2;
                            defpackage.g00 g00Var7 = g00Var;
                            defpackage.g00 g00Var8 = g00Var3;
                            defpackage.gg ggVar5 = ggVar;
                            defpackage.p4 p4Var = (defpackage.p4) obj15;
                            switch (i35) {
                                case 0:
                                    defpackage.gn0 gn0Var6 = ((defpackage.nm0) p4Var.oh6vYeIP()).xiZrDbcSW0;
                                    gn0Var6.getClass();
                                    defpackage.fg fgVar = (defpackage.fg) gn0Var6;
                                    if (((java.lang.Boolean) ggVar5.r1MBDhnF.getValue()).booleanValue() || ((java.lang.Boolean) sl0Var6.getValue()).booleanValue()) {
                                        int i36 = defpackage.gn0.riuEU0zW4;
                                        for (defpackage.gn0 gn0Var7 : defpackage.x80.PAEGRtP0bX(fgVar)) {
                                        }
                                        return (defpackage.su) g00Var8.AARZUJiTa(p4Var);
                                    }
                                    int i37 = defpackage.gn0.riuEU0zW4;
                                    for (defpackage.gn0 gn0Var8 : defpackage.x80.PAEGRtP0bX(fgVar)) {
                                    }
                                    return (defpackage.su) g00Var7.AARZUJiTa(p4Var);
                                default:
                                    defpackage.gn0 gn0Var9 = ((defpackage.nm0) p4Var.r1MBDhnF()).xiZrDbcSW0;
                                    gn0Var9.getClass();
                                    defpackage.fg fgVar2 = (defpackage.fg) gn0Var9;
                                    if (((java.lang.Boolean) ggVar5.r1MBDhnF.getValue()).booleanValue() || ((java.lang.Boolean) sl0Var6.getValue()).booleanValue()) {
                                        int i38 = defpackage.gn0.riuEU0zW4;
                                        for (defpackage.gn0 gn0Var10 : defpackage.x80.PAEGRtP0bX(fgVar2)) {
                                        }
                                        return (defpackage.cu) g00Var8.AARZUJiTa(p4Var);
                                    }
                                    int i39 = defpackage.gn0.riuEU0zW4;
                                    for (defpackage.gn0 gn0Var11 : defpackage.x80.PAEGRtP0bX(fgVar2)) {
                                    }
                                    return (defpackage.cu) g00Var7.AARZUJiTa(p4Var);
                            }
                        }
                    };
                    r12.OtkytngK3Mr(g00Var6);
                    mAr5m2L7gYDP7 = g00Var6;
                } else {
                    el0Var = el0Var3;
                    po0Var3 = po0Var6;
                    ggVar = ggVar3;
                    nm0Var = nm0Var5;
                    z2 = false;
                }
                defpackage.g00 g00Var7 = (defpackage.g00) mAr5m2L7gYDP7;
                boolean EXtogiMhuM3 = r12.EXtogiMhuM(ggVar) | (((((i2 & 29360128) ^ 12582912) <= 8388608 || !r12.xiZrDbcSW0(g00Var4)) && (i2 & 12582912) != 8388608) ? z2 : true) | ((i2 & 458752) == 131072 ? true : z2);
                java.lang.Object mAr5m2L7gYDP8 = r12.mAr5m2L7gYDP();
                if (EXtogiMhuM3 || mAr5m2L7gYDP8 == ad1Var) {
                    final int i35 = 0;
                    g00Var5 = g00Var7;
                    defpackage.g00 g00Var8 = new defpackage.g00() { // from class: rn0
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj15) {
                            int i352 = i35;
                            defpackage.sl0 sl0Var6 = sl0Var2;
                            defpackage.g00 g00Var72 = g00Var2;
                            defpackage.g00 g00Var82 = g00Var4;
                            defpackage.gg ggVar5 = ggVar;
                            defpackage.p4 p4Var = (defpackage.p4) obj15;
                            switch (i352) {
                                case 0:
                                    defpackage.gn0 gn0Var6 = ((defpackage.nm0) p4Var.oh6vYeIP()).xiZrDbcSW0;
                                    gn0Var6.getClass();
                                    defpackage.fg fgVar = (defpackage.fg) gn0Var6;
                                    if (((java.lang.Boolean) ggVar5.r1MBDhnF.getValue()).booleanValue() || ((java.lang.Boolean) sl0Var6.getValue()).booleanValue()) {
                                        int i36 = defpackage.gn0.riuEU0zW4;
                                        for (defpackage.gn0 gn0Var7 : defpackage.x80.PAEGRtP0bX(fgVar)) {
                                        }
                                        return (defpackage.su) g00Var82.AARZUJiTa(p4Var);
                                    }
                                    int i37 = defpackage.gn0.riuEU0zW4;
                                    for (defpackage.gn0 gn0Var8 : defpackage.x80.PAEGRtP0bX(fgVar)) {
                                    }
                                    return (defpackage.su) g00Var72.AARZUJiTa(p4Var);
                                default:
                                    defpackage.gn0 gn0Var9 = ((defpackage.nm0) p4Var.r1MBDhnF()).xiZrDbcSW0;
                                    gn0Var9.getClass();
                                    defpackage.fg fgVar2 = (defpackage.fg) gn0Var9;
                                    if (((java.lang.Boolean) ggVar5.r1MBDhnF.getValue()).booleanValue() || ((java.lang.Boolean) sl0Var6.getValue()).booleanValue()) {
                                        int i38 = defpackage.gn0.riuEU0zW4;
                                        for (defpackage.gn0 gn0Var10 : defpackage.x80.PAEGRtP0bX(fgVar2)) {
                                        }
                                        return (defpackage.cu) g00Var82.AARZUJiTa(p4Var);
                                    }
                                    int i39 = defpackage.gn0.riuEU0zW4;
                                    for (defpackage.gn0 gn0Var11 : defpackage.x80.PAEGRtP0bX(fgVar2)) {
                                    }
                                    return (defpackage.cu) g00Var72.AARZUJiTa(p4Var);
                            }
                        }
                    };
                    r12.OtkytngK3Mr(g00Var8);
                    mAr5m2L7gYDP8 = g00Var8;
                } else {
                    g00Var5 = g00Var7;
                }
                final defpackage.g00 g00Var9 = (defpackage.g00) mAr5m2L7gYDP8;
                boolean z5 = (i2 & 234881024) == 67108864 ? true : z2;
                java.lang.Object mAr5m2L7gYDP9 = r12.mAr5m2L7gYDP();
                int i36 = 17;
                java.lang.Object obj15 = mAr5m2L7gYDP9;
                if (z5 || mAr5m2L7gYDP9 == ad1Var) {
                    defpackage.uc0 uc0Var = new defpackage.uc0(i36);
                    r12.OtkytngK3Mr(uc0Var);
                    obj15 = uc0Var;
                }
                final defpackage.g00 g00Var10 = (defpackage.g00) obj15;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                boolean EXtogiMhuM4 = r12.EXtogiMhuM(ggVar);
                java.lang.Object mAr5m2L7gYDP10 = r12.mAr5m2L7gYDP();
                java.lang.Object obj16 = mAr5m2L7gYDP10;
                if (EXtogiMhuM4 || mAr5m2L7gYDP10 == ad1Var) {
                    defpackage.r1MBDhnF r1mbdhnf2 = new defpackage.r1MBDhnF(i36, ec1Var2, ggVar);
                    r12.OtkytngK3Mr(r1mbdhnf2);
                    obj16 = r1mbdhnf2;
                }
                defpackage.s21.oh6vYeIP(bool, (defpackage.g00) obj16, r12);
                java.lang.Object mAr5m2L7gYDP11 = r12.mAr5m2L7gYDP();
                java.lang.Object obj17 = mAr5m2L7gYDP11;
                if (mAr5m2L7gYDP11 == ad1Var) {
                    defpackage.s61 s61Var2 = new defpackage.s61(nm0Var);
                    r12.OtkytngK3Mr(s61Var2);
                    obj17 = s61Var2;
                }
                defpackage.s61 s61Var3 = (defpackage.s61) obj17;
                defpackage.r41 r41Var = defpackage.qi1.IHQe1A4L2xu;
                boolean xiZrDbcSW02 = r12.xiZrDbcSW0(s61Var3);
                java.lang.Object mAr5m2L7gYDP12 = r12.mAr5m2L7gYDP();
                if (xiZrDbcSW02 || mAr5m2L7gYDP12 == ad1Var) {
                    defpackage.oa1 QoRHpC4k2 = QoRHpC4k();
                    defpackage.g00 adDC3e2L3 = QoRHpC4k2 != null ? QoRHpC4k2.adDC3e2L() : null;
                    sl0Var3 = sl0Var2;
                    defpackage.oa1 fnWB2E7cs = fnWB2E7cs(QoRHpC4k2);
                    ec1Var = ec1Var2;
                    try {
                        defpackage.li1 li1Var2 = new defpackage.li1(s61Var3, null, "entry");
                        QQUzIjv3iOC5(QoRHpC4k2, fnWB2E7cs, adDC3e2L3);
                        r12.OtkytngK3Mr(li1Var2);
                        mAr5m2L7gYDP12 = li1Var2;
                    } catch (java.lang.Throwable th) {
                        QQUzIjv3iOC5(QoRHpC4k2, fnWB2E7cs, adDC3e2L3);
                        throw th;
                    }
                } else {
                    sl0Var3 = sl0Var2;
                    ec1Var = ec1Var2;
                }
                ?? r8 = (defpackage.li1) mAr5m2L7gYDP12;
                if (s61Var3 != null) {
                    r12.AsxAYCCkb3Hi(-1357607479);
                    java.lang.Object value = s61Var3.r1MBDhnF.getValue();
                    java.lang.Object value2 = s61Var3.oh6vYeIP.getValue();
                    boolean xiZrDbcSW03 = r12.xiZrDbcSW0(s61Var3);
                    java.lang.Object mAr5m2L7gYDP13 = r12.mAr5m2L7gYDP();
                    if (xiZrDbcSW03 || mAr5m2L7gYDP13 == ad1Var) {
                        r15 = null;
                        defpackage.AARZUJiTa aARZUJiTa = new defpackage.AARZUJiTa(s61Var3, r15, 18);
                        r12.OtkytngK3Mr(aARZUJiTa);
                        obj3 = aARZUJiTa;
                    } else {
                        r15 = null;
                        obj3 = mAr5m2L7gYDP13;
                    }
                    defpackage.s21.EXtogiMhuM(value, value2, (defpackage.k00) obj3, r12);
                    r12.QoRHpC4k(false);
                } else {
                    r15 = null;
                    r12.AsxAYCCkb3Hi(-1357145920);
                    r8.IHQe1A4L2xu(s61Var3.oh6vYeIP.getValue(), r12, 0);
                    r12.QoRHpC4k(false);
                }
                boolean xiZrDbcSW04 = r12.xiZrDbcSW0(r8);
                java.lang.Object mAr5m2L7gYDP14 = r12.mAr5m2L7gYDP();
                java.lang.Object obj18 = mAr5m2L7gYDP14;
                if (xiZrDbcSW04 || mAr5m2L7gYDP14 == ad1Var) {
                    defpackage.ni1 ni1Var = new defpackage.ni1(r8, 1);
                    r12.OtkytngK3Mr(ni1Var);
                    obj18 = ni1Var;
                }
                defpackage.s21.oh6vYeIP(r8, (defpackage.g00) obj18, r12);
                if (((java.lang.Boolean) sl0Var3.getValue()).booleanValue()) {
                    r12.AsxAYCCkb3Hi(-1795016672);
                    java.lang.Float valueOf = java.lang.Float.valueOf(mt0Var2.AARZUJiTa());
                    boolean xiZrDbcSW05 = r12.xiZrDbcSW0(sl0Var) | r12.EXtogiMhuM(s61Var3);
                    java.lang.Object mAr5m2L7gYDP15 = r12.mAr5m2L7gYDP();
                    if (xiZrDbcSW05 || mAr5m2L7gYDP15 == ad1Var) {
                        ?? r23 = r15;
                        mAr5m2L7gYDP15 = new defpackage.AARZUJiTa(s61Var3, sl0Var, mt0Var2, r23, 11);
                        r12.OtkytngK3Mr(mAr5m2L7gYDP15);
                        noVar3 = r23;
                    } else {
                        noVar3 = r15;
                    }
                    defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP15, r12, valueOf);
                    r12.QoRHpC4k(false);
                    s61Var = s61Var3;
                    nm0Var2 = nm0Var;
                    li1Var = r8;
                    noVar2 = noVar3;
                } else {
                    ?? r232 = r15;
                    r12.AsxAYCCkb3Hi(-1794598265);
                    boolean EXtogiMhuM5 = r12.EXtogiMhuM(s61Var3) | r12.EXtogiMhuM(nm0Var) | r12.xiZrDbcSW0(r8);
                    java.lang.Object mAr5m2L7gYDP16 = r12.mAr5m2L7gYDP();
                    if (EXtogiMhuM5 || mAr5m2L7gYDP16 == ad1Var) {
                        s61Var = s61Var3;
                        defpackage.nm0 nm0Var6 = nm0Var;
                        li1Var = r8;
                        mAr5m2L7gYDP16 = new defpackage.x3(s61Var, nm0Var6, li1Var, (defpackage.ej) r232, 4);
                        nm0Var2 = nm0Var6;
                        r12.OtkytngK3Mr(mAr5m2L7gYDP16);
                    } else {
                        s61Var = s61Var3;
                        nm0Var2 = nm0Var;
                        li1Var = r8;
                    }
                    defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP16, r12, nm0Var2);
                    r12.QoRHpC4k(false);
                    noVar2 = r232;
                }
                boolean EXtogiMhuM6 = r12.EXtogiMhuM(el0Var) | r12.EXtogiMhuM(ggVar) | r12.xiZrDbcSW0(g00Var5) | r12.xiZrDbcSW0(g00Var9) | r12.xiZrDbcSW0(g00Var10);
                java.lang.Object mAr5m2L7gYDP17 = r12.mAr5m2L7gYDP();
                if (EXtogiMhuM6 || mAr5m2L7gYDP17 == ad1Var) {
                    final defpackage.gg ggVar5 = ggVar;
                    final defpackage.el0 el0Var4 = el0Var;
                    final defpackage.g00 g00Var11 = g00Var5;
                    po0Var2 = po0Var3;
                    final defpackage.sl0 sl0Var6 = sl0Var3;
                    final defpackage.ec1 ec1Var3 = ec1Var;
                    obj2 = new defpackage.g00() { // from class: sn0
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj19) {
                            defpackage.p4 p4Var = (defpackage.p4) obj19;
                            float f = 0.0f;
                            if (!((java.util.List) ec1Var3.getValue()).contains(p4Var.oh6vYeIP())) {
                                return new defpackage.zi(defpackage.cu.oh6vYeIP, defpackage.su.oh6vYeIP, 0.0f, new defpackage.da1(defpackage.g4.AARZUJiTa));
                            }
                            java.lang.String str4 = ((defpackage.nm0) p4Var.oh6vYeIP()).SH1y5HwkJhh;
                            defpackage.el0 el0Var5 = defpackage.el0.this;
                            int oh6vYeIP4 = el0Var5.oh6vYeIP(str4);
                            if (oh6vYeIP4 >= 0) {
                                f = el0Var5.r1MBDhnF[oh6vYeIP4];
                            } else {
                                el0Var5.F7NU4MC0GW(str4, 0.0f);
                            }
                            if (!defpackage.x70.QoRHpC4k(((defpackage.nm0) p4Var.r1MBDhnF()).SH1y5HwkJhh, ((defpackage.nm0) p4Var.oh6vYeIP()).SH1y5HwkJhh)) {
                                f = (((java.lang.Boolean) ggVar5.r1MBDhnF.getValue()).booleanValue() || ((java.lang.Boolean) sl0Var6.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            el0Var5.F7NU4MC0GW(((defpackage.nm0) p4Var.r1MBDhnF()).SH1y5HwkJhh, f);
                            return new defpackage.zi((defpackage.cu) g00Var11.AARZUJiTa(p4Var), (defpackage.su) g00Var9.AARZUJiTa(p4Var), f, (defpackage.da1) g00Var10.AARZUJiTa(p4Var));
                        }
                    };
                    ggVar2 = ggVar5;
                    sl0Var4 = sl0Var6;
                    el0Var = el0Var4;
                    r12.OtkytngK3Mr(obj2);
                } else {
                    ggVar2 = ggVar;
                    obj2 = mAr5m2L7gYDP17;
                    po0Var2 = po0Var3;
                    sl0Var4 = sl0Var3;
                }
                defpackage.g00 g00Var12 = (defpackage.g00) obj2;
                java.lang.Object mAr5m2L7gYDP18 = r12.mAr5m2L7gYDP();
                java.lang.Object obj19 = mAr5m2L7gYDP18;
                if (mAr5m2L7gYDP18 == ad1Var) {
                    defpackage.uc0 uc0Var2 = new defpackage.uc0(19);
                    r12.OtkytngK3Mr(uc0Var2);
                    obj19 = uc0Var2;
                }
                defpackage.li1 li1Var3 = li1Var;
                defpackage.x70.IHQe1A4L2xu(li1Var3, mj0Var, g00Var12, e8Var, (defpackage.g00) obj19, defpackage.h1.XZx205DYe(820763100, new defpackage.xn0(s61Var, nm0Var2, nBH8hAHy2, sl0Var4, ec1Var), r12), r12, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                java.lang.Object xiZrDbcSW06 = li1Var3.IHQe1A4L2xu.xiZrDbcSW0();
                java.lang.Object value3 = li1Var3.F7NU4MC0GW.getValue();
                boolean xiZrDbcSW07 = r12.xiZrDbcSW0(li1Var3) | r12.EXtogiMhuM(qn0Var) | r12.EXtogiMhuM(nm0Var2) | r12.EXtogiMhuM(ggVar2) | r12.EXtogiMhuM(el0Var);
                java.lang.Object mAr5m2L7gYDP19 = r12.mAr5m2L7gYDP();
                if (xiZrDbcSW07 || mAr5m2L7gYDP19 == ad1Var) {
                    defpackage.yn0 yn0Var = new defpackage.yn0(li1Var3, qn0Var, nm0Var2, el0Var, ec1Var, ggVar2, null);
                    r12.OtkytngK3Mr(yn0Var);
                    mAr5m2L7gYDP19 = yn0Var;
                }
                defpackage.s21.EXtogiMhuM(xiZrDbcSW06, value3, (defpackage.k00) mAr5m2L7gYDP19, r12);
                r12.QoRHpC4k(false);
                noVar = noVar2;
            } else {
                po0Var2 = po0Var6;
                noVar = null;
                r12.AsxAYCCkb3Hi(-1789446406);
                r12.QoRHpC4k(z);
            }
            defpackage.oo0 oh6vYeIP4 = po0Var2.oh6vYeIP("dialog");
            defpackage.no noVar4 = oh6vYeIP4 instanceof defpackage.no ? (defpackage.no) oh6vYeIP4 : noVar;
            if (noVar4 == null) {
                defpackage.az0 kd6TUFXn3 = r12.kd6TUFXn();
                if (kd6TUFXn3 != null) {
                    final int i37 = 0;
                    kd6TUFXn3.F7NU4MC0GW = new defpackage.k00() { // from class: un0
                        @Override // defpackage.k00
                        public final java.lang.Object adDC3e2L(java.lang.Object obj112, java.lang.Object obj122) {
                            int i322 = i37;
                            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                            int i332 = i;
                            switch (i322) {
                                case 0:
                                    ((java.lang.Integer) obj122).getClass();
                                    int hyxIchWRW = defpackage.a70.hyxIchWRW(i332 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW);
                                    break;
                                case 1:
                                    ((java.lang.Integer) obj122).getClass();
                                    int hyxIchWRW2 = defpackage.a70.hyxIchWRW(i332 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW2);
                                    break;
                                default:
                                    ((java.lang.Integer) obj122).getClass();
                                    int hyxIchWRW3 = defpackage.a70.hyxIchWRW(i332 | 1);
                                    defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW3);
                                    break;
                            }
                            return ok1Var;
                        }
                    };
                    return;
                }
                return;
            }
            defpackage.ci0.adDC3e2L(noVar4, r12, 0);
            t10Var2 = r12;
        }
        defpackage.az0 kd6TUFXn4 = t10Var2.kd6TUFXn();
        if (kd6TUFXn4 != null) {
            final int i38 = 1;
            kd6TUFXn4.F7NU4MC0GW = new defpackage.k00() { // from class: un0
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj112, java.lang.Object obj122) {
                    int i322 = i38;
                    defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                    int i332 = i;
                    switch (i322) {
                        case 0:
                            ((java.lang.Integer) obj122).getClass();
                            int hyxIchWRW = defpackage.a70.hyxIchWRW(i332 | 1);
                            defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW);
                            break;
                        case 1:
                            ((java.lang.Integer) obj122).getClass();
                            int hyxIchWRW2 = defpackage.a70.hyxIchWRW(i332 | 1);
                            defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW2);
                            break;
                        default:
                            ((java.lang.Integer) obj122).getClass();
                            int hyxIchWRW3 = defpackage.a70.hyxIchWRW(i332 | 1);
                            defpackage.f70.r1MBDhnF(qn0Var, kn0Var, mj0Var, e8Var, g00Var, g00Var2, g00Var3, g00Var4, (defpackage.t10) obj112, hyxIchWRW3);
                            break;
                    }
                    return ok1Var;
                }
            };
        }
    }

    public static final defpackage.p11 riuEU0zW4(java.lang.Throwable th) {
        th.getClass();
        return new defpackage.p11(th);
    }

    public static final android.graphics.Rect v5iciZok(defpackage.e70 e70Var) {
        return new android.graphics.Rect(e70Var.IHQe1A4L2xu, e70Var.oh6vYeIP, e70Var.r1MBDhnF, e70Var.F7NU4MC0GW);
    }

    public static void xiZrDbcSW0(defpackage.x9 x9Var) {
        x9Var.SH1y5HwkJhh(null, false);
    }
}
