package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nl1 implements defpackage.vk0 {
    public final float JhCgjQRTAOCT;
    public final defpackage.ll1 ZpBGe2uQfcn8;
    public final defpackage.wv0 fWTAfUmVKrZq;
    public final defpackage.el1 giKS3J6vZuNy;

    public nl1(defpackage.ll1 ll1Var, defpackage.el1 el1Var, defpackage.wv0 wv0Var, float f) {
        this.ZpBGe2uQfcn8 = ll1Var;
        this.giKS3J6vZuNy = el1Var;
        this.fWTAfUmVKrZq = wv0Var;
        this.JhCgjQRTAOCT = f;
    }

    public static int WDYagTQQm9ns(java.util.List list, int i, defpackage.c20 c20Var) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj7 = list.get(i2);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj7), "TextField")) {
                int intValue = ((java.lang.Number) c20Var.QiMR8OkAhezm(obj7, java.lang.Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                defpackage.qk0 qk0Var = (defpackage.qk0) obj2;
                int intValue2 = qk0Var != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var, java.lang.Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                defpackage.qk0 qk0Var2 = (defpackage.qk0) obj3;
                int intValue3 = qk0Var2 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var2, java.lang.Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                defpackage.qk0 qk0Var3 = (defpackage.qk0) obj4;
                int intValue4 = qk0Var3 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var3, java.lang.Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                defpackage.qk0 qk0Var4 = (defpackage.qk0) obj5;
                int intValue5 = qk0Var4 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var4, java.lang.Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                defpackage.qk0 qk0Var5 = (defpackage.qk0) obj6;
                int intValue6 = qk0Var5 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var5, java.lang.Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    java.lang.Object obj8 = list.get(i8);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                defpackage.qk0 qk0Var6 = (defpackage.qk0) obj;
                int i9 = intValue4 + intValue5;
                return defpackage.nk.QiMR8OkAhezm(java.lang.Math.max(intValue + i9, java.lang.Math.max((qk0Var6 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var6, java.lang.Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, defpackage.nk.giKS3J6vZuNy(0, 0, 0, 0, 15));
            }
        }
        defpackage.ci0.giKS3J6vZuNy("Collection contains no element matching the predicate.");
        defpackage.h7.JhCgjQRTAOCT();
        return 0;
    }

    public final int JhCgjQRTAOCT(defpackage.fa0 fa0Var, java.util.List list, int i, defpackage.c20 c20Var) {
        java.lang.Object obj;
        int i2;
        int i3;
        int i4;
        java.lang.Object obj2;
        int i5;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i6;
        java.lang.Object obj5;
        int i7;
        java.lang.Object obj6;
        java.lang.Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj), "Leading")) {
                break;
            }
            i8++;
        }
        defpackage.qk0 qk0Var = (defpackage.qk0) obj;
        if (qk0Var != null) {
            i2 = i;
            i4 = defpackage.v70.IBvW5fLsPuHy(i2, qk0Var.GoIRkIe1iwj6(Integer.MAX_VALUE));
            i3 = ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var, java.lang.Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        defpackage.qk0 qk0Var2 = (defpackage.qk0) obj2;
        if (qk0Var2 != null) {
            i4 = defpackage.v70.IBvW5fLsPuHy(i4, qk0Var2.GoIRkIe1iwj6(Integer.MAX_VALUE));
            i5 = ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var2, java.lang.Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj3), "Label")) {
                break;
            }
            i10++;
        }
        java.lang.Object obj8 = (defpackage.qk0) obj3;
        int intValue = obj8 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(obj8, java.lang.Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        defpackage.qk0 qk0Var3 = (defpackage.qk0) obj4;
        if (qk0Var3 != null) {
            int intValue2 = ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var3, java.lang.Integer.valueOf(i4))).intValue();
            i4 = defpackage.v70.IBvW5fLsPuHy(i4, qk0Var3.GoIRkIe1iwj6(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        defpackage.qk0 qk0Var4 = (defpackage.qk0) obj5;
        if (qk0Var4 != null) {
            int intValue3 = ((java.lang.Number) c20Var.QiMR8OkAhezm(qk0Var4, java.lang.Integer.valueOf(i4))).intValue();
            i4 = defpackage.v70.IBvW5fLsPuHy(i4, qk0Var4.GoIRkIe1iwj6(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            java.lang.Object obj9 = list.get(i13);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj9), "TextField")) {
                int intValue4 = ((java.lang.Number) c20Var.QiMR8OkAhezm(obj9, java.lang.Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                java.lang.Object obj10 = (defpackage.qk0) obj6;
                int intValue5 = obj10 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(obj10, java.lang.Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.v70.ZVVdXbWmyCSK((defpackage.qk0) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                java.lang.Object obj11 = (defpackage.qk0) obj7;
                return giKS3J6vZuNy(fa0Var, intValue4, intValue, i3, i5, i6, i7, intValue5, obj11 != null ? ((java.lang.Number) c20Var.QiMR8OkAhezm(obj11, java.lang.Integer.valueOf(i2))).intValue() : 0, defpackage.nk.giKS3J6vZuNy(0, 0, 0, 0, 15), this.giKS3J6vZuNy.ZpBGe2uQfcn8());
            }
        }
        defpackage.ci0.giKS3J6vZuNy("Collection contains no element matching the predicate.");
        defpackage.h7.JhCgjQRTAOCT();
        return 0;
    }

    @Override // defpackage.vk0
    public final int QiMR8OkAhezm(defpackage.fa0 fa0Var, java.util.List list, int i) {
        return JhCgjQRTAOCT(fa0Var, list, i, new defpackage.oc1(4, (byte) 0));
    }

    @Override // defpackage.vk0
    public final int ZpBGe2uQfcn8(defpackage.fa0 fa0Var, java.util.List list, int i) {
        return JhCgjQRTAOCT(fa0Var, list, i, new defpackage.oc1(5, (byte) 0));
    }

    @Override // defpackage.vk0
    public final int e6mdH7fiFuta(defpackage.fa0 fa0Var, java.util.List list, int i) {
        return WDYagTQQm9ns(list, i, new defpackage.oc1(2, (byte) 0));
    }

    @Override // defpackage.vk0
    public final int fWTAfUmVKrZq(defpackage.fa0 fa0Var, java.util.List list, int i) {
        return WDYagTQQm9ns(list, i, new defpackage.oc1(3, (byte) 0));
    }

    public final int giKS3J6vZuNy(defpackage.fa0 fa0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        defpackage.wv0 wv0Var = this.fWTAfUmVKrZq;
        int OVwOqzUGHcCU = fa0Var.OVwOqzUGHcCU(wv0Var.ZpBGe2uQfcn8() + wv0Var.JhCgjQRTAOCT());
        int[] iArr = {i7, i5, i6, defpackage.t80.blKFvluuDQOf(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = java.lang.Math.max(i, iArr[i9]);
        }
        return defpackage.nk.oh71FJcDz6S2(java.lang.Math.max(i3, java.lang.Math.max(i4, OVwOqzUGHcCU + (i2 > 0 ? java.lang.Math.max(fa0Var.OVwOqzUGHcCU(this.JhCgjQRTAOCT * 2.0f), defpackage.t80.blKFvluuDQOf(defpackage.km0.ZpBGe2uQfcn8.giKS3J6vZuNy(f), 0, i2)) : 0) + i)) + i8, j);
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(final defpackage.xk0 xk0Var, java.util.List list, long j) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        defpackage.ry0 ry0Var;
        java.lang.Object obj4;
        int i2;
        defpackage.ry0 ry0Var2;
        java.lang.Object obj5;
        int i3;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.ry0 ry0Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        defpackage.ry0 ry0Var4;
        int i8;
        defpackage.ry0 ry0Var5;
        int i9;
        defpackage.ry0 ry0Var6;
        int i10;
        float f;
        defpackage.ry0 ry0Var7;
        defpackage.z31 z31Var;
        int i11;
        defpackage.ry0 ry0Var8;
        defpackage.ry0 ry0Var9;
        int i12;
        int i13;
        defpackage.nl1 nl1Var;
        int i14;
        float ZpBGe2uQfcn8 = this.giKS3J6vZuNy.ZpBGe2uQfcn8();
        defpackage.wv0 wv0Var = this.fWTAfUmVKrZq;
        final int OVwOqzUGHcCU = xk0Var.OVwOqzUGHcCU(wv0Var.JhCgjQRTAOCT());
        int OVwOqzUGHcCU2 = xk0Var.OVwOqzUGHcCU(wv0Var.ZpBGe2uQfcn8());
        long ZpBGe2uQfcn82 = defpackage.mk.ZpBGe2uQfcn8(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj), "Leading")) {
                break;
            }
            i15++;
        }
        defpackage.qk0 qk0Var = (defpackage.qk0) obj;
        defpackage.ry0 WDYagTQQm9ns = qk0Var != null ? qk0Var.WDYagTQQm9ns(ZpBGe2uQfcn82) : null;
        int i16 = WDYagTQQm9ns != null ? WDYagTQQm9ns.WDYagTQQm9ns : 0;
        int max = java.lang.Math.max(0, WDYagTQQm9ns != null ? WDYagTQQm9ns.oh71FJcDz6S2 : 0);
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        defpackage.qk0 qk0Var2 = (defpackage.qk0) obj2;
        defpackage.ry0 WDYagTQQm9ns2 = qk0Var2 != null ? qk0Var2.WDYagTQQm9ns(defpackage.nk.GE9mJIPrb8gP(-i16, 0, 2, ZpBGe2uQfcn82)) : null;
        int i18 = i16 + (WDYagTQQm9ns2 != null ? WDYagTQQm9ns2.WDYagTQQm9ns : 0);
        int max2 = java.lang.Math.max(max, WDYagTQQm9ns2 != null ? WDYagTQQm9ns2.oh71FJcDz6S2 : 0);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj3), "Prefix")) {
                break;
            }
            i19++;
        }
        defpackage.qk0 qk0Var3 = (defpackage.qk0) obj3;
        if (qk0Var3 != null) {
            i = i18;
            ry0Var = qk0Var3.WDYagTQQm9ns(defpackage.nk.GE9mJIPrb8gP(-i18, 0, 2, ZpBGe2uQfcn82));
        } else {
            i = i18;
            ry0Var = null;
        }
        int i20 = (ry0Var != null ? ry0Var.WDYagTQQm9ns : 0) + i;
        int max3 = java.lang.Math.max(max2, ry0Var != null ? ry0Var.oh71FJcDz6S2 : 0);
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj4), "Suffix")) {
                break;
            }
            i21++;
        }
        defpackage.qk0 qk0Var4 = (defpackage.qk0) obj4;
        if (qk0Var4 != null) {
            i2 = i20;
            ry0Var2 = qk0Var4.WDYagTQQm9ns(defpackage.nk.GE9mJIPrb8gP(-i20, 0, 2, ZpBGe2uQfcn82));
        } else {
            i2 = i20;
            ry0Var2 = null;
        }
        int i22 = i2 + (ry0Var2 != null ? ry0Var2.WDYagTQQm9ns : 0);
        int max4 = java.lang.Math.max(max3, ry0Var2 != null ? ry0Var2.oh71FJcDz6S2 : 0);
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i23);
            int i24 = size5;
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
        }
        defpackage.qk0 qk0Var5 = (defpackage.qk0) obj5;
        defpackage.z31 z31Var2 = new defpackage.z31();
        int i25 = -i22;
        z31Var2.WDYagTQQm9ns = qk0Var5 != null ? qk0Var5.WDYagTQQm9ns(defpackage.nk.e6mdH7fiFuta(i25, -OVwOqzUGHcCU2, ZpBGe2uQfcn82)) : null;
        int size6 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i3 = OVwOqzUGHcCU2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i26);
            i3 = OVwOqzUGHcCU2;
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj6), "Supporting")) {
                break;
            }
            i26++;
            OVwOqzUGHcCU2 = i3;
        }
        defpackage.qk0 qk0Var6 = (defpackage.qk0) obj6;
        int FhgBoOud6zyW = qk0Var6 != null ? qk0Var6.FhgBoOud6zyW(defpackage.mk.GE9mJIPrb8gP(j)) : 0;
        defpackage.ry0 ry0Var10 = (defpackage.ry0) z31Var2.WDYagTQQm9ns;
        int i27 = OVwOqzUGHcCU + (ry0Var10 != null ? ry0Var10.oh71FJcDz6S2 : 0);
        long e6mdH7fiFuta = defpackage.nk.e6mdH7fiFuta(i25, ((-i27) - i3) - FhgBoOud6zyW, defpackage.mk.ZpBGe2uQfcn8(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i28 = 0;
        while (i28 < size7) {
            int i29 = i27;
            defpackage.qk0 qk0Var7 = (defpackage.qk0) list.get(i28);
            int i30 = size7;
            float f2 = ZpBGe2uQfcn8;
            if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V(qk0Var7), "TextField")) {
                final defpackage.ry0 WDYagTQQm9ns3 = qk0Var7.WDYagTQQm9ns(e6mdH7fiFuta);
                long ZpBGe2uQfcn83 = defpackage.mk.ZpBGe2uQfcn8(e6mdH7fiFuta, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i31);
                    int i32 = size8;
                    int i33 = i31;
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V((defpackage.qk0) obj7), "Hint")) {
                        break;
                    }
                    i31 = i33 + 1;
                    size8 = i32;
                }
                defpackage.qk0 qk0Var8 = (defpackage.qk0) obj7;
                defpackage.ry0 WDYagTQQm9ns4 = qk0Var8 != null ? qk0Var8.WDYagTQQm9ns(ZpBGe2uQfcn83) : null;
                int max5 = java.lang.Math.max(max4, java.lang.Math.max(WDYagTQQm9ns3.oh71FJcDz6S2, WDYagTQQm9ns4 != null ? WDYagTQQm9ns4.oh71FJcDz6S2 : 0) + i29 + i3);
                int i34 = WDYagTQQm9ns != null ? WDYagTQQm9ns.WDYagTQQm9ns : 0;
                int i35 = WDYagTQQm9ns2 != null ? WDYagTQQm9ns2.WDYagTQQm9ns : 0;
                int i36 = ry0Var != null ? ry0Var.WDYagTQQm9ns : 0;
                int i37 = ry0Var2 != null ? ry0Var2.WDYagTQQm9ns : 0;
                int i38 = i35;
                int i39 = WDYagTQQm9ns3.WDYagTQQm9ns;
                defpackage.ry0 ry0Var11 = (defpackage.ry0) z31Var2.WDYagTQQm9ns;
                int i40 = i36 + i37;
                int QiMR8OkAhezm = defpackage.nk.QiMR8OkAhezm(java.lang.Math.max(i39 + i40, java.lang.Math.max((WDYagTQQm9ns4 != null ? WDYagTQQm9ns4.WDYagTQQm9ns : 0) + i40, ry0Var11 != null ? ry0Var11.WDYagTQQm9ns : 0)) + i34 + i38, j);
                defpackage.ry0 WDYagTQQm9ns5 = qk0Var6 != null ? qk0Var6.WDYagTQQm9ns(defpackage.mk.ZpBGe2uQfcn8(defpackage.nk.GE9mJIPrb8gP(0, -max5, 1, ZpBGe2uQfcn82), 0, QiMR8OkAhezm, 0, 0, 9)) : null;
                int i41 = WDYagTQQm9ns5 != null ? WDYagTQQm9ns5.oh71FJcDz6S2 : 0;
                int i42 = WDYagTQQm9ns3.oh71FJcDz6S2;
                defpackage.ry0 ry0Var12 = (defpackage.ry0) z31Var2.WDYagTQQm9ns;
                int i43 = ry0Var12 != null ? ry0Var12.oh71FJcDz6S2 : 0;
                int i44 = WDYagTQQm9ns != null ? WDYagTQQm9ns.oh71FJcDz6S2 : 0;
                if (WDYagTQQm9ns2 != null) {
                    ry0Var3 = WDYagTQQm9ns;
                    i4 = i43;
                    i5 = WDYagTQQm9ns2.oh71FJcDz6S2;
                } else {
                    ry0Var3 = WDYagTQQm9ns;
                    i4 = i43;
                    i5 = 0;
                }
                if (ry0Var != null) {
                    i6 = i44;
                    i7 = ry0Var.oh71FJcDz6S2;
                } else {
                    i6 = i44;
                    i7 = 0;
                }
                final defpackage.ry0 ry0Var13 = WDYagTQQm9ns2;
                if (ry0Var2 != null) {
                    defpackage.ry0 ry0Var14 = ry0Var;
                    i8 = ry0Var2.oh71FJcDz6S2;
                    ry0Var4 = ry0Var14;
                } else {
                    ry0Var4 = ry0Var;
                    i8 = 0;
                }
                final defpackage.ry0 ry0Var15 = ry0Var4;
                if (WDYagTQQm9ns4 != null) {
                    defpackage.ry0 ry0Var16 = ry0Var3;
                    i9 = WDYagTQQm9ns4.oh71FJcDz6S2;
                    ry0Var5 = ry0Var16;
                } else {
                    ry0Var5 = ry0Var3;
                    i9 = 0;
                }
                if (WDYagTQQm9ns5 != null) {
                    ry0Var7 = ry0Var5;
                    ry0Var6 = ry0Var2;
                    i10 = i6;
                    f = f2;
                    z31Var = z31Var2;
                    i11 = WDYagTQQm9ns5.oh71FJcDz6S2;
                    ry0Var8 = WDYagTQQm9ns4;
                    ry0Var9 = WDYagTQQm9ns5;
                    i12 = QiMR8OkAhezm;
                    i13 = 0;
                    i14 = i42;
                    nl1Var = this;
                } else {
                    ry0Var6 = ry0Var2;
                    i10 = i6;
                    f = f2;
                    ry0Var7 = ry0Var5;
                    z31Var = z31Var2;
                    i11 = 0;
                    ry0Var8 = WDYagTQQm9ns4;
                    ry0Var9 = WDYagTQQm9ns5;
                    i12 = QiMR8OkAhezm;
                    i13 = 0;
                    nl1Var = this;
                    i14 = i42;
                }
                final int giKS3J6vZuNy = nl1Var.giKS3J6vZuNy(xk0Var, i14, i4, i10, i5, i7, i8, i9, i11, j, f);
                final int i45 = giKS3J6vZuNy - i41;
                int size9 = list.size();
                int i46 = i13;
                while (i46 < size9) {
                    defpackage.qk0 qk0Var9 = (defpackage.qk0) list.get(i46);
                    if (defpackage.ma0.QiMR8OkAhezm(defpackage.h0.Mearx7yMn90V(qk0Var9), "Container")) {
                        final defpackage.ry0 WDYagTQQm9ns6 = qk0Var9.WDYagTQQm9ns(defpackage.nk.ZpBGe2uQfcn8(i12 != Integer.MAX_VALUE ? i12 : i13, i12, i45 != Integer.MAX_VALUE ? i45 : i13, i45));
                        final int i47 = i12;
                        final float f3 = f;
                        final defpackage.ry0 ry0Var17 = ry0Var6;
                        final defpackage.ry0 ry0Var18 = ry0Var7;
                        final defpackage.z31 z31Var3 = z31Var;
                        final defpackage.ry0 ry0Var19 = ry0Var8;
                        final defpackage.ry0 ry0Var20 = ry0Var9;
                        return xk0Var.hwoZxnIesQBZ(i47, giKS3J6vZuNy, defpackage.bv.WDYagTQQm9ns, new defpackage.y10(this, i45, OVwOqzUGHcCU, xk0Var, i47, giKS3J6vZuNy, WDYagTQQm9ns3, ry0Var19, ry0Var18, ry0Var13, ry0Var15, ry0Var17, WDYagTQQm9ns6, ry0Var20, f3) { // from class: ml1
                            public final /* synthetic */ float BHfvd2J71qpO;
                            public final /* synthetic */ int GE9mJIPrb8gP;
                            public final /* synthetic */ defpackage.ry0 Ns0WNyEWdPsk;
                            public final /* synthetic */ defpackage.xk0 P05cfTpS5W5L;
                            public final /* synthetic */ int QiMR8OkAhezm;
                            public final /* synthetic */ defpackage.ry0 T1fB7bDYiVJQ;
                            public final /* synthetic */ defpackage.ry0 WmetiUbpKU9I;
                            public final /* synthetic */ defpackage.ry0 XntWc4eZSQ8j;
                            public final /* synthetic */ int e6mdH7fiFuta;
                            public final /* synthetic */ defpackage.ry0 fNwYGHIYeJcR;
                            public final /* synthetic */ defpackage.ry0 gUjdnLbkVAaA;
                            public final /* synthetic */ defpackage.ry0 h3m55N1URyyK;
                            public final /* synthetic */ defpackage.nl1 oh71FJcDz6S2;
                            public final /* synthetic */ defpackage.ry0 s0TASMVLSWD5;

                            {
                                this.QiMR8OkAhezm = OVwOqzUGHcCU;
                                this.P05cfTpS5W5L = xk0Var;
                                this.e6mdH7fiFuta = i47;
                                this.GE9mJIPrb8gP = giKS3J6vZuNy;
                                this.Ns0WNyEWdPsk = WDYagTQQm9ns3;
                                this.fNwYGHIYeJcR = ry0Var19;
                                this.h3m55N1URyyK = ry0Var18;
                                this.gUjdnLbkVAaA = ry0Var13;
                                this.T1fB7bDYiVJQ = ry0Var15;
                                this.XntWc4eZSQ8j = ry0Var17;
                                this.WmetiUbpKU9I = WDYagTQQm9ns6;
                                this.s0TASMVLSWD5 = ry0Var20;
                                this.BHfvd2J71qpO = f3;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
                            @Override // defpackage.y10
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj8) {
                                int i48;
                                int i49;
                                defpackage.qy0 qy0Var = (defpackage.qy0) obj8;
                                defpackage.z31 z31Var4 = defpackage.z31.this;
                                java.lang.Object obj9 = z31Var4.WDYagTQQm9ns;
                                defpackage.nl1 nl1Var2 = this.oh71FJcDz6S2;
                                defpackage.xk0 xk0Var2 = this.P05cfTpS5W5L;
                                int i50 = this.e6mdH7fiFuta;
                                int i51 = this.GE9mJIPrb8gP;
                                defpackage.ry0 ry0Var21 = this.Ns0WNyEWdPsk;
                                defpackage.ry0 ry0Var22 = this.fNwYGHIYeJcR;
                                defpackage.ry0 ry0Var23 = this.h3m55N1URyyK;
                                defpackage.ry0 ry0Var24 = this.gUjdnLbkVAaA;
                                defpackage.ry0 ry0Var25 = this.T1fB7bDYiVJQ;
                                defpackage.ry0 ry0Var26 = this.XntWc4eZSQ8j;
                                defpackage.ry0 ry0Var27 = this.WmetiUbpKU9I;
                                defpackage.ry0 ry0Var28 = this.s0TASMVLSWD5;
                                if (obj9 != null) {
                                    int OVwOqzUGHcCU3 = xk0Var2.OVwOqzUGHcCU(nl1Var2.JhCgjQRTAOCT);
                                    int i52 = this.QiMR8OkAhezm;
                                    int i53 = OVwOqzUGHcCU3 + i52;
                                    defpackage.ry0 ry0Var29 = (defpackage.ry0) z31Var4.WDYagTQQm9ns;
                                    int i54 = ry0Var29.oh71FJcDz6S2 + i52;
                                    defpackage.sc0 layoutDirection = xk0Var2.getLayoutDirection();
                                    defpackage.ll1 ll1Var = nl1Var2.ZpBGe2uQfcn8;
                                    defpackage.qy0.QiMR8OkAhezm(qy0Var, ry0Var27, 0, 0);
                                    int i55 = i51 - (ry0Var28 != null ? ry0Var28.oh71FJcDz6S2 : 0);
                                    if (ry0Var23 != null) {
                                        i48 = i55;
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var23, 0, java.lang.Math.round(((i55 - ry0Var23.oh71FJcDz6S2) / 2.0f) * 1.0f));
                                    } else {
                                        i48 = i55;
                                    }
                                    float f4 = this.BHfvd2J71qpO;
                                    int blKFvluuDQOf = defpackage.t80.blKFvluuDQOf(f4, i53, i52);
                                    if (layoutDirection == defpackage.sc0.WDYagTQQm9ns) {
                                        if (ry0Var23 != null) {
                                            i49 = ry0Var23.WDYagTQQm9ns;
                                            int i56 = i49;
                                            int ZpBGe2uQfcn84 = ll1Var.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var29.WDYagTQQm9ns, (i50 - (ry0Var23 == null ? ry0Var23.WDYagTQQm9ns : 0)) - (ry0Var24 == null ? ry0Var24.WDYagTQQm9ns : 0), layoutDirection) + i56;
                                            if (ll1Var instanceof defpackage.ll1) {
                                                throw new java.lang.IllegalArgumentException("Unknown position: " + ll1Var);
                                            }
                                            defpackage.qy0.QiMR8OkAhezm(qy0Var, ry0Var29, defpackage.t80.blKFvluuDQOf(f4, ZpBGe2uQfcn84, ll1Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8(ry0Var29.WDYagTQQm9ns, (i50 - (ry0Var23 != null ? ry0Var23.WDYagTQQm9ns : 0)) - (ry0Var24 != null ? ry0Var24.WDYagTQQm9ns : 0), layoutDirection) + i56), blKFvluuDQOf);
                                            if (ry0Var25 != null) {
                                                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var25, ry0Var23 != null ? ry0Var23.WDYagTQQm9ns : 0, i54);
                                            }
                                            int i57 = (ry0Var23 != null ? ry0Var23.WDYagTQQm9ns : 0) + (ry0Var25 != null ? ry0Var25.WDYagTQQm9ns : 0);
                                            defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var21, i57, i54);
                                            if (ry0Var22 != null) {
                                                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var22, i57, i54);
                                            }
                                            if (ry0Var26 != null) {
                                                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var26, (i50 - (ry0Var24 != null ? ry0Var24.WDYagTQQm9ns : 0)) - ry0Var26.WDYagTQQm9ns, i54);
                                            }
                                            if (ry0Var24 != null) {
                                                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var24, i50 - ry0Var24.WDYagTQQm9ns, java.lang.Math.round(((i48 - ry0Var24.oh71FJcDz6S2) / 2.0f) * 1.0f));
                                            }
                                            if (ry0Var28 != null) {
                                                defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var28, 0, i48);
                                            }
                                        }
                                        i49 = 0;
                                        int i562 = i49;
                                        int ZpBGe2uQfcn842 = ll1Var.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var29.WDYagTQQm9ns, (i50 - (ry0Var23 == null ? ry0Var23.WDYagTQQm9ns : 0)) - (ry0Var24 == null ? ry0Var24.WDYagTQQm9ns : 0), layoutDirection) + i562;
                                        if (ll1Var instanceof defpackage.ll1) {
                                        }
                                    } else {
                                        if (ry0Var24 != null) {
                                            i49 = ry0Var24.WDYagTQQm9ns;
                                            int i5622 = i49;
                                            int ZpBGe2uQfcn8422 = ll1Var.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var29.WDYagTQQm9ns, (i50 - (ry0Var23 == null ? ry0Var23.WDYagTQQm9ns : 0)) - (ry0Var24 == null ? ry0Var24.WDYagTQQm9ns : 0), layoutDirection) + i5622;
                                            if (ll1Var instanceof defpackage.ll1) {
                                            }
                                        }
                                        i49 = 0;
                                        int i56222 = i49;
                                        int ZpBGe2uQfcn84222 = ll1Var.giKS3J6vZuNy.ZpBGe2uQfcn8(ry0Var29.WDYagTQQm9ns, (i50 - (ry0Var23 == null ? ry0Var23.WDYagTQQm9ns : 0)) - (ry0Var24 == null ? ry0Var24.WDYagTQQm9ns : 0), layoutDirection) + i56222;
                                        if (ll1Var instanceof defpackage.ll1) {
                                        }
                                    }
                                } else {
                                    float giKS3J6vZuNy2 = xk0Var2.giKS3J6vZuNy();
                                    defpackage.qy0.e6mdH7fiFuta(qy0Var, ry0Var27, 0L);
                                    int i58 = i51 - (ry0Var28 != null ? ry0Var28.oh71FJcDz6S2 : 0);
                                    int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(nl1Var2.fWTAfUmVKrZq.JhCgjQRTAOCT() * giKS3J6vZuNy2);
                                    if (ry0Var23 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var23, 0, java.lang.Math.round(((i58 - ry0Var23.oh71FJcDz6S2) / 2.0f) * 1.0f));
                                    }
                                    if (ry0Var25 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var25, ry0Var23 != null ? ry0Var23.WDYagTQQm9ns : 0, CZa7MwI9IzLd);
                                    }
                                    int i59 = (ry0Var23 != null ? ry0Var23.WDYagTQQm9ns : 0) + (ry0Var25 != null ? ry0Var25.WDYagTQQm9ns : 0);
                                    defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var21, i59, CZa7MwI9IzLd);
                                    if (ry0Var22 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var22, i59, CZa7MwI9IzLd);
                                    }
                                    if (ry0Var26 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var26, (i50 - (ry0Var24 != null ? ry0Var24.WDYagTQQm9ns : 0)) - ry0Var26.WDYagTQQm9ns, CZa7MwI9IzLd);
                                    }
                                    if (ry0Var24 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var24, i50 - ry0Var24.WDYagTQQm9ns, java.lang.Math.round(((i58 - ry0Var24.oh71FJcDz6S2) / 2.0f) * 1.0f));
                                    }
                                    if (ry0Var28 != null) {
                                        defpackage.qy0.GE9mJIPrb8gP(qy0Var, ry0Var28, 0, i58);
                                    }
                                }
                                return defpackage.gs1.ZpBGe2uQfcn8;
                            }
                        });
                    }
                    i46++;
                    i45 = i45;
                }
                defpackage.ci0.giKS3J6vZuNy("Collection contains no element matching the predicate.");
                defpackage.h7.JhCgjQRTAOCT();
                return null;
            }
            ZpBGe2uQfcn8 = f2;
            i28++;
            size7 = i30;
            i27 = i29;
            WDYagTQQm9ns = WDYagTQQm9ns;
        }
        defpackage.ci0.giKS3J6vZuNy("Collection contains no element matching the predicate.");
        defpackage.h7.JhCgjQRTAOCT();
        return null;
    }
}
