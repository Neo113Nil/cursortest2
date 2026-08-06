package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i61 {
    public static final defpackage.n80 GE9mJIPrb8gP;
    public static final java.lang.Object Ns0WNyEWdPsk;
    public static final defpackage.n80 P05cfTpS5W5L;
    public static final defpackage.n80 QiMR8OkAhezm;
    public static final defpackage.z2 WDYagTQQm9ns;
    public static final defpackage.n80 e6mdH7fiFuta;
    public static final defpackage.z2 fNwYGHIYeJcR;
    public static final defpackage.n80 oh71FJcDz6S2;
    public static final float[] ZpBGe2uQfcn8 = new float[91];
    public static final java.lang.Object[] giKS3J6vZuNy = new java.lang.Object[0];
    public static final java.lang.Object fWTAfUmVKrZq = new java.lang.Object();
    public static final defpackage.z2 JhCgjQRTAOCT = new defpackage.z2(1000);

    static {
        new defpackage.z2(1007);
        WDYagTQQm9ns = new defpackage.z2(1008);
        new defpackage.z2(1002);
        int i = 29;
        oh71FJcDz6S2 = new defpackage.n80(i, new defpackage.f81(24), new defpackage.g81(14));
        QiMR8OkAhezm = new defpackage.n80(i, new defpackage.f81(25), new defpackage.g81(15));
        P05cfTpS5W5L = new defpackage.n80(i, new defpackage.f81(26), new defpackage.g81(16));
        e6mdH7fiFuta = new defpackage.n80(i, new defpackage.f81(27), new defpackage.g81(17));
        GE9mJIPrb8gP = new defpackage.n80(i, new defpackage.f81(28), new defpackage.g81(18));
        Ns0WNyEWdPsk = new java.lang.Object();
        fNwYGHIYeJcR = new defpackage.z2(1022);
    }

    public static final defpackage.vl0 BHfvd2J71qpO(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.ft(y10Var));
    }

    public static final android.os.Bundle GE9mJIPrb8gP(defpackage.bw0... bw0VarArr) {
        android.os.Bundle bundle = new android.os.Bundle(bw0VarArr.length);
        for (defpackage.bw0 bw0Var : bw0VarArr) {
            java.lang.String str = (java.lang.String) bw0Var.WDYagTQQm9ns;
            java.lang.Object obj = bw0Var.oh71FJcDz6S2;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) obj).charValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else if (obj instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) obj);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) obj);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (java.lang.String[]) obj);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) obj);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (java.io.Serializable) obj);
                }
            } else if (obj instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) obj);
            } else if (obj instanceof android.os.IBinder) {
                bundle.putBinder(str, (android.os.IBinder) obj);
            } else if (obj instanceof android.util.Size) {
                bundle.putSize(str, (android.util.Size) obj);
            } else {
                if (!(obj instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (android.util.SizeF) obj);
            }
        }
        return bundle;
    }

    public static final int IBvW5fLsPuHy(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (java.lang.Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !java.lang.Float.isNaN(f2) ? 1 : 0;
    }

    public static final float[] IJ0hOnjhPOri(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final void JhCgjQRTAOCT(defpackage.wg0 wg0Var, defpackage.y10 y10Var, defpackage.n10 n10Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-1868327245);
        int i2 = (e30Var.P05cfTpS5W5L(wg0Var) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | (e30Var.P05cfTpS5W5L(n10Var) ? 256 : 128);
        int i3 = 0;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            boolean P05cfTpS5W5L2 = ((i2 & 112) == 32) | e30Var.P05cfTpS5W5L(wg0Var) | ((i2 & 896) == 256);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.eSwlWMUpitz8(wg0Var, y10Var, n10Var, i3);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.nq1.oh71FJcDz6S2(wg0Var, (defpackage.y10) GcLuU6pT9wO9, e30Var);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.p71(wg0Var, y10Var, n10Var, i, 1);
        }
    }

    public static final void KrtOTfE6jiS2(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            defpackage.h80.ZpBGe2uQfcn8("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        defpackage.h80.ZpBGe2uQfcn8("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final java.lang.Object[] Mearx7yMn90V(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (java.lang.Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArr2 = java.util.Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return java.util.Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void Ns0WNyEWdPsk(long j, defpackage.fv0 fv0Var) {
        if (fv0Var == defpackage.fv0.WDYagTQQm9ns) {
            if (defpackage.mk.QiMR8OkAhezm(j) != Integer.MAX_VALUE) {
                return;
            }
            defpackage.h80.fWTAfUmVKrZq("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (defpackage.mk.P05cfTpS5W5L(j) != Integer.MAX_VALUE) {
                return;
            }
            defpackage.h80.fWTAfUmVKrZq("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final float[] OcTWLQzke1i2(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static void P05cfTpS5W5L(java.lang.Throwable th, java.lang.Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            java.lang.Integer num = defpackage.bb0.ZpBGe2uQfcn8;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            java.lang.reflect.Method method = defpackage.xy0.ZpBGe2uQfcn8;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static defpackage.xf QiMR8OkAhezm(defpackage.xf xfVar) {
        defpackage.av1 av1Var = defpackage.h0.P05cfTpS5W5L;
        if (defpackage.jr0.maCixPsq4ml2(xfVar.giKS3J6vZuNy, 12884901888L)) {
            defpackage.u51 u51Var = (defpackage.u51) xfVar;
            defpackage.av1 av1Var2 = u51Var.JhCgjQRTAOCT;
            if (!h3m55N1URyyK(av1Var2, av1Var)) {
                return new defpackage.u51(u51Var.ZpBGe2uQfcn8, u51Var.P05cfTpS5W5L, av1Var, dG7RjM6DqYVL(fNwYGHIYeJcR(defpackage.ARgw6UjYb9W7.fWTAfUmVKrZq.giKS3J6vZuNy, av1Var2.ZpBGe2uQfcn8(), av1Var.ZpBGe2uQfcn8()), u51Var.e6mdH7fiFuta), u51Var.Ns0WNyEWdPsk, u51Var.gUjdnLbkVAaA, u51Var.WDYagTQQm9ns, u51Var.oh71FJcDz6S2, u51Var.QiMR8OkAhezm, -1);
            }
        }
        return xfVar;
    }

    public static final boolean T1fB7bDYiVJQ(defpackage.s31 s31Var, float f, float f2) {
        float f3 = s31Var.ZpBGe2uQfcn8;
        if (f > s31Var.fWTAfUmVKrZq || f3 > f) {
            return false;
        }
        return f2 <= s31Var.JhCgjQRTAOCT && s31Var.giKS3J6vZuNy <= f2;
    }

    public static final defpackage.vl0 UmgHb6n58gfG(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.yb0(null, y10Var));
    }

    public static final defpackage.vl0 VFeft99leXEK(defpackage.e30 e30Var, defpackage.vl0 vl0Var) {
        if (vl0Var.giKS3J6vZuNy(defpackage.n.BHfvd2J71qpO)) {
            return vl0Var;
        }
        e30Var.Fu5WBEia9jBo(1219399079, 0, null, null);
        defpackage.vl0 vl0Var2 = (defpackage.vl0) vl0Var.ZpBGe2uQfcn8(new defpackage.T1fB7bDYiVJQ(4, e30Var), defpackage.sl0.ZpBGe2uQfcn8);
        e30Var.XntWc4eZSQ8j(false);
        return vl0Var2;
    }

    public static final void WDYagTQQm9ns(defpackage.rf1 rf1Var) {
        int i = rf1Var.P05cfTpS5W5L;
        int[] iArr = rf1Var.oh71FJcDz6S2;
        java.lang.Object[] objArr = rf1Var.QiMR8OkAhezm;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != Ns0WNyEWdPsk) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        rf1Var.WDYagTQQm9ns = false;
        rf1Var.P05cfTpS5W5L = i2;
    }

    public static final defpackage.jy WmetiUbpKU9I(defpackage.h61 h61Var, java.lang.String[] strArr, defpackage.y10 y10Var) {
        defpackage.bw0 bw0Var;
        defpackage.wa0 JhCgjQRTAOCT2 = h61Var.JhCgjQRTAOCT();
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        defpackage.hq1 hq1Var = JhCgjQRTAOCT2.giKS3J6vZuNy;
        hq1Var.getClass();
        defpackage.sc1 sc1Var = new defpackage.sc1();
        int i = 0;
        for (java.lang.String str : strArr2) {
            java.util.LinkedHashMap linkedHashMap = hq1Var.fWTAfUmVKrZq;
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            java.util.Set set = (java.util.Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                sc1Var.addAll(set);
            } else {
                sc1Var.add(str);
            }
        }
        java.lang.String[] strArr3 = (java.lang.String[]) defpackage.wc1.XntWc4eZSQ8j(sc1Var).toArray(new java.lang.String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i >= length) {
                bw0Var = new defpackage.bw0(strArr3, iArr);
                break;
            }
            java.lang.String str2 = strArr3[i];
            java.util.LinkedHashMap linkedHashMap2 = hq1Var.oh71FJcDz6S2;
            java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
            lowerCase2.getClass();
            java.lang.Integer num = (java.lang.Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                defpackage.h7.w7APNrr0aGRc("There is no table with name ".concat(str2));
                bw0Var = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        java.lang.String[] strArr4 = (java.lang.String[]) bw0Var.WDYagTQQm9ns;
        int[] iArr2 = (int[]) bw0Var.oh71FJcDz6S2;
        strArr4.getClass();
        iArr2.getClass();
        return new defpackage.jy(defpackage.nn.QiMR8OkAhezm(new defpackage.f71(new defpackage.e2(hq1Var, iArr2, strArr4, null, 11)), -1), h61Var, y10Var, 1);
    }

    public static final defpackage.jk XntWc4eZSQ8j(defpackage.xf xfVar, defpackage.xf xfVar2) {
        return xfVar == xfVar2 ? new defpackage.hk(xfVar, xfVar, 1) : (defpackage.jr0.maCixPsq4ml2(xfVar.giKS3J6vZuNy, 12884901888L) && defpackage.jr0.maCixPsq4ml2(xfVar2.giKS3J6vZuNy, 12884901888L)) ? new defpackage.ik((defpackage.u51) xfVar, (defpackage.u51) xfVar2) : new defpackage.jk(xfVar, xfVar2, 0);
    }

    public static final defpackage.vl0 ZVVdXbWmyCSK(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.gt(y10Var));
    }

    public static final void ZpBGe2uQfcn8(defpackage.em1 em1Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(2080741862);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(em1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        int i3 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.nq1.ZpBGe2uQfcn8(em1Var, nhVar, e30Var, i2 & 126);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.pg(em1Var, nhVar, i, i3);
        }
    }

    public static final defpackage.vl0 blKFvluuDQOf(defpackage.y10 y10Var) {
        return new defpackage.yb0(y10Var, null);
    }

    public static final float[] dG7RjM6DqYVL(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final defpackage.y20 e6mdH7fiFuta(defpackage.y20 y20Var) {
        if (y20Var == null) {
            y20Var = null;
        }
        if (y20Var != null) {
            return y20Var;
        }
        defpackage.ej.giKS3J6vZuNy("Inconsistent composition");
        defpackage.h7.JhCgjQRTAOCT();
        return null;
    }

    public static final float[] fNwYGHIYeJcR(float[] fArr, float[] fArr2, float[] fArr3) {
        OcTWLQzke1i2(fArr, fArr2);
        OcTWLQzke1i2(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] IJ0hOnjhPOri = IJ0hOnjhPOri(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return dG7RjM6DqYVL(IJ0hOnjhPOri, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final void fWTAfUmVKrZq(final com.ice.fishing.wolberta.data.local.Item item, final defpackage.n10 n10Var, final defpackage.n10 n10Var2, defpackage.e30 e30Var, int i) {
        int i2;
        item.getClass();
        n10Var.getClass();
        n10Var2.getClass();
        e30Var.PS16moFv2oLu(-1232749440);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e30Var.oh71FJcDz6S2(item) : e30Var.P05cfTpS5W5L(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var2) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            final float f = (int) (((android.content.res.Configuration) e30Var.GE9mJIPrb8gP(defpackage.j0.ZpBGe2uQfcn8)).screenWidthDp * 0.05f);
            defpackage.nq1.JhCgjQRTAOCT(n10Var, new defpackage.iq(3), defpackage.nn.OcTWLQzke1i2(2012173705, new defpackage.c20() { // from class: sp
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.pj pjVar;
                    defpackage.pj pjVar2;
                    long giKS3J6vZuNy2;
                    defpackage.e30 e30Var2 = (defpackage.e30) obj;
                    int intValue = ((java.lang.Integer) obj2).intValue();
                    if (e30Var2.zJPqDeoF0Os1(intValue & 1, (intValue & 3) != 2)) {
                        defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
                        defpackage.vl0 oh71FJcDz6S22 = defpackage.nn.oh71FJcDz6S2(defpackage.h0.WmetiUbpKU9I(defpackage.nq1.Rl68HURFBtL3(defpackage.ce1.JhCgjQRTAOCT(defpackage.nq1.zJPqDeoF0Os1(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), f, 0.0f, 2), 0.0f, ((android.content.res.Configuration) e30Var2.GE9mJIPrb8gP(defpackage.j0.ZpBGe2uQfcn8)).screenHeightDp * 0.85f, 1), defpackage.nq1.Fu5WBEia9jBo(e30Var2)), defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq), defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq);
                        long j = defpackage.j80.maCixPsq4ml2(e30Var2).gUjdnLbkVAaA;
                        defpackage.q50 q50Var = defpackage.la0.blKFvluuDQOf;
                        defpackage.vl0 xahdJg25P1Bv = defpackage.nq1.xahdJg25P1Bv(defpackage.nn.JhCgjQRTAOCT(oh71FJcDz6S22, j, q50Var), 16.0f);
                        defpackage.l7 l7Var = new defpackage.l7(12.0f, new defpackage.h7(0));
                        defpackage.ca caVar = defpackage.jVUAPb5NnIYW.s0TASMVLSWD5;
                        defpackage.gg ZpBGe2uQfcn82 = defpackage.eg.ZpBGe2uQfcn8(l7Var, caVar, e30Var2, 6);
                        int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR2 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, xahdJg25P1Bv);
                        defpackage.wi.fWTAfUmVKrZq.getClass();
                        defpackage.pj pjVar3 = defpackage.vi.giKS3J6vZuNy;
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            e30Var2.Ns0WNyEWdPsk(pjVar3);
                        } else {
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.h5 h5Var = defpackage.vi.oh71FJcDz6S2;
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, ZpBGe2uQfcn82);
                        defpackage.h5 h5Var2 = defpackage.vi.WDYagTQQm9ns;
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR2);
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
                        defpackage.h5 h5Var3 = defpackage.vi.QiMR8OkAhezm;
                        defpackage.t80.w6IV1lieBIux(h5Var3, e30Var2, valueOf);
                        defpackage.n nVar = defpackage.vi.P05cfTpS5W5L;
                        defpackage.t80.Mearx7yMn90V(e30Var2, nVar);
                        defpackage.h5 h5Var4 = defpackage.vi.JhCgjQRTAOCT;
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju);
                        defpackage.vl0 xahdJg25P1Bv2 = defpackage.nq1.xahdJg25P1Bv(defpackage.nn.JhCgjQRTAOCT(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).GE9mJIPrb8gP, 0.18f), q50Var), 14.0f);
                        defpackage.gg ZpBGe2uQfcn83 = defpackage.eg.ZpBGe2uQfcn8(new defpackage.l7(6.0f, new defpackage.h7(0)), caVar, e30Var2, 6);
                        int hashCode2 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR3 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, xahdJg25P1Bv2);
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            e30Var2.Ns0WNyEWdPsk(pjVar3);
                        } else {
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, ZpBGe2uQfcn83);
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR3);
                        defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode2, e30Var2, h5Var3, e30Var2, nVar);
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju2);
                        final com.ice.fishing.wolberta.data.local.Item item2 = item;
                        final int i3 = 1;
                        defpackage.ym1.giKS3J6vZuNy(item2.getName(), null, defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var2).P05cfTpS5W5L, e30Var2, 0, 0, 131066);
                        defpackage.ym1.giKS3J6vZuNy(item2.getType().WDYagTQQm9ns, null, defpackage.j80.maCixPsq4ml2(e30Var2).oh71FJcDz6S2, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var2).e6mdH7fiFuta, e30Var2, 0, 0, 131066);
                        e30Var2.XntWc4eZSQ8j(true);
                        defpackage.vl0 giKS3J6vZuNy3 = defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f);
                        final int i4 = 0;
                        defpackage.v61 ZpBGe2uQfcn84 = defpackage.u61.ZpBGe2uQfcn8(new defpackage.l7(8.0f, new defpackage.h7(0)), defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ, e30Var2, 6);
                        int hashCode3 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR4 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju3 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, giKS3J6vZuNy3);
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            pjVar = pjVar3;
                            e30Var2.Ns0WNyEWdPsk(pjVar);
                        } else {
                            pjVar = pjVar3;
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, ZpBGe2uQfcn84);
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR4);
                        defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode3, e30Var2, h5Var3, e30Var2, nVar);
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju3);
                        defpackage.pj pjVar4 = pjVar;
                        defpackage.nq1.s0TASMVLSWD5(item2.getStyle().WDYagTQQm9ns, defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.18f), defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, null, e30Var2, 0);
                        if (item2.getVeggie()) {
                            e30Var2.NkfcFfdaVTox(1970464539);
                            defpackage.nq1.s0TASMVLSWD5(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_vegetarian, e30Var2), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.18f), defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, null, e30Var2, 0);
                            e30Var2.XntWc4eZSQ8j(false);
                        } else {
                            e30Var2.NkfcFfdaVTox(955116115);
                            e30Var2.XntWc4eZSQ8j(false);
                        }
                        e30Var2.XntWc4eZSQ8j(true);
                        defpackage.m90.e6mdH7fiFuta(null, defpackage.nn.OcTWLQzke1i2(-1742788639, new defpackage.d20() { // from class: tp
                            @Override // defpackage.d20
                            public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.j60 j60Var;
                                long j2;
                                java.lang.String xahdJg25P1Bv3;
                                long j3;
                                int i5 = i4;
                                defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                                com.ice.fishing.wolberta.data.local.Item item3 = item2;
                                switch (i5) {
                                    case 0:
                                        defpackage.w61 w61Var = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var3 = (defpackage.e30) obj4;
                                        int intValue2 = ((java.lang.Integer) obj5).intValue();
                                        w61Var.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= e30Var3.oh71FJcDz6S2(w61Var) ? 4 : 2;
                                        }
                                        if (e30Var3.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            for (defpackage.bw0 bw0Var : defpackage.ma0.oCu53ZX2v4Ju(new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_time, e30Var3), item3.getTime()), new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_score, e30Var3), java.lang.String.valueOf(item3.getScore())))) {
                                                defpackage.m90.P05cfTpS5W5L((java.lang.String) bw0Var.WDYagTQQm9ns, w61Var.ZpBGe2uQfcn8(), (java.lang.String) bw0Var.oh71FJcDz6S2, e30Var3, 0);
                                            }
                                            break;
                                        } else {
                                            e30Var3.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    case 1:
                                        defpackage.w61 w61Var2 = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var4 = (defpackage.e30) obj4;
                                        int intValue3 = ((java.lang.Integer) obj5).intValue();
                                        w61Var2.getClass();
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= e30Var4.oh71FJcDz6S2(w61Var2) ? 4 : 2;
                                        }
                                        if (e30Var4.zJPqDeoF0Os1(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_heat, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getHeat().WDYagTQQm9ns, e30Var4, 0);
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_region, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getType().WDYagTQQm9ns, e30Var4, 0);
                                            break;
                                        } else {
                                            e30Var4.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    default:
                                        defpackage.e30 e30Var5 = (defpackage.e30) obj4;
                                        int intValue4 = ((java.lang.Integer) obj5).intValue();
                                        ((defpackage.w61) obj3).getClass();
                                        if (e30Var5.zJPqDeoF0Os1(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            if (item3.getMarked()) {
                                                j60Var = defpackage.h0.BHfvd2J71qpO;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var = new defpackage.i60("Filled.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i6 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    java.util.ArrayList arrayList = new java.util.ArrayList(32);
                                                    arrayList.add(new defpackage.fx0(17.0f, 3.0f));
                                                    arrayList.add(new defpackage.dx0(7.0f));
                                                    arrayList.add(new defpackage.kx0(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f));
                                                    arrayList.add(new defpackage.ex0(5.0f, 21.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, -3.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, 3.0f));
                                                    arrayList.add(new defpackage.sx0(5.0f));
                                                    arrayList.add(new defpackage.kx0(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
                                                    arrayList.add(defpackage.bx0.fWTAfUmVKrZq);
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var, arrayList, lf1Var);
                                                    j60Var = i60Var.giKS3J6vZuNy();
                                                    defpackage.h0.BHfvd2J71qpO = j60Var;
                                                }
                                            } else {
                                                j60Var = defpackage.vx1.s0TASMVLSWD5;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var2 = new defpackage.i60("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i7 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var2 = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    defpackage.k0 k0Var = new defpackage.k0(16, (byte) 0);
                                                    java.util.ArrayList arrayList2 = (java.util.ArrayList) k0Var.oh71FJcDz6S2;
                                                    k0Var.WmetiUbpKU9I(17.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 3.0f);
                                                    k0Var.Ns0WNyEWdPsk(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                                    k0Var.T1fB7bDYiVJQ(5.0f, 21.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, -3.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(19.0f, 5.0f);
                                                    k0Var.Ns0WNyEWdPsk(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                                    k0Var.oh71FJcDz6S2();
                                                    k0Var.WmetiUbpKU9I(17.0f, 18.0f);
                                                    k0Var.XntWc4eZSQ8j(-5.0f, -2.18f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 18.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 5.0f);
                                                    arrayList2.add(new defpackage.lx0(10.0f));
                                                    arrayList2.add(new defpackage.rx0(13.0f));
                                                    k0Var.oh71FJcDz6S2();
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var2, arrayList2, lf1Var2);
                                                    j60Var = i60Var2.giKS3J6vZuNy();
                                                    defpackage.vx1.s0TASMVLSWD5 = j60Var;
                                                }
                                            }
                                            defpackage.j60 j60Var2 = j60Var;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239652496);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239654477);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.f60.ZpBGe2uQfcn8(j60Var2, defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.oh71FJcDz6S2(28.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, e30Var5, 432, 0);
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239659826);
                                                xahdJg25P1Bv3 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_saved_remove, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239662064);
                                                xahdJg25P1Bv3 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_save_later, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            java.lang.String str = xahdJg25P1Bv3;
                                            defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var5.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).P05cfTpS5W5L;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239667824);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239669805);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.ym1.giKS3J6vZuNy(str, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, pn1Var, e30Var5, 0, 0, 131066);
                                            break;
                                        } else {
                                            e30Var5.Jkfc0NcwyPL8();
                                            break;
                                        }
                                }
                                return gs1Var;
                            }
                        }, e30Var2), e30Var2, 48);
                        defpackage.m90.e6mdH7fiFuta(null, defpackage.nn.OcTWLQzke1i2(1357133642, new defpackage.d20() { // from class: tp
                            @Override // defpackage.d20
                            public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.j60 j60Var;
                                long j2;
                                java.lang.String xahdJg25P1Bv3;
                                long j3;
                                int i5 = i3;
                                defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                                com.ice.fishing.wolberta.data.local.Item item3 = item2;
                                switch (i5) {
                                    case 0:
                                        defpackage.w61 w61Var = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var3 = (defpackage.e30) obj4;
                                        int intValue2 = ((java.lang.Integer) obj5).intValue();
                                        w61Var.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= e30Var3.oh71FJcDz6S2(w61Var) ? 4 : 2;
                                        }
                                        if (e30Var3.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            for (defpackage.bw0 bw0Var : defpackage.ma0.oCu53ZX2v4Ju(new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_time, e30Var3), item3.getTime()), new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_score, e30Var3), java.lang.String.valueOf(item3.getScore())))) {
                                                defpackage.m90.P05cfTpS5W5L((java.lang.String) bw0Var.WDYagTQQm9ns, w61Var.ZpBGe2uQfcn8(), (java.lang.String) bw0Var.oh71FJcDz6S2, e30Var3, 0);
                                            }
                                            break;
                                        } else {
                                            e30Var3.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    case 1:
                                        defpackage.w61 w61Var2 = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var4 = (defpackage.e30) obj4;
                                        int intValue3 = ((java.lang.Integer) obj5).intValue();
                                        w61Var2.getClass();
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= e30Var4.oh71FJcDz6S2(w61Var2) ? 4 : 2;
                                        }
                                        if (e30Var4.zJPqDeoF0Os1(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_heat, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getHeat().WDYagTQQm9ns, e30Var4, 0);
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_region, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getType().WDYagTQQm9ns, e30Var4, 0);
                                            break;
                                        } else {
                                            e30Var4.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    default:
                                        defpackage.e30 e30Var5 = (defpackage.e30) obj4;
                                        int intValue4 = ((java.lang.Integer) obj5).intValue();
                                        ((defpackage.w61) obj3).getClass();
                                        if (e30Var5.zJPqDeoF0Os1(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            if (item3.getMarked()) {
                                                j60Var = defpackage.h0.BHfvd2J71qpO;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var = new defpackage.i60("Filled.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i6 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    java.util.ArrayList arrayList = new java.util.ArrayList(32);
                                                    arrayList.add(new defpackage.fx0(17.0f, 3.0f));
                                                    arrayList.add(new defpackage.dx0(7.0f));
                                                    arrayList.add(new defpackage.kx0(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f));
                                                    arrayList.add(new defpackage.ex0(5.0f, 21.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, -3.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, 3.0f));
                                                    arrayList.add(new defpackage.sx0(5.0f));
                                                    arrayList.add(new defpackage.kx0(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
                                                    arrayList.add(defpackage.bx0.fWTAfUmVKrZq);
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var, arrayList, lf1Var);
                                                    j60Var = i60Var.giKS3J6vZuNy();
                                                    defpackage.h0.BHfvd2J71qpO = j60Var;
                                                }
                                            } else {
                                                j60Var = defpackage.vx1.s0TASMVLSWD5;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var2 = new defpackage.i60("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i7 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var2 = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    defpackage.k0 k0Var = new defpackage.k0(16, (byte) 0);
                                                    java.util.ArrayList arrayList2 = (java.util.ArrayList) k0Var.oh71FJcDz6S2;
                                                    k0Var.WmetiUbpKU9I(17.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 3.0f);
                                                    k0Var.Ns0WNyEWdPsk(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                                    k0Var.T1fB7bDYiVJQ(5.0f, 21.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, -3.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(19.0f, 5.0f);
                                                    k0Var.Ns0WNyEWdPsk(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                                    k0Var.oh71FJcDz6S2();
                                                    k0Var.WmetiUbpKU9I(17.0f, 18.0f);
                                                    k0Var.XntWc4eZSQ8j(-5.0f, -2.18f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 18.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 5.0f);
                                                    arrayList2.add(new defpackage.lx0(10.0f));
                                                    arrayList2.add(new defpackage.rx0(13.0f));
                                                    k0Var.oh71FJcDz6S2();
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var2, arrayList2, lf1Var2);
                                                    j60Var = i60Var2.giKS3J6vZuNy();
                                                    defpackage.vx1.s0TASMVLSWD5 = j60Var;
                                                }
                                            }
                                            defpackage.j60 j60Var2 = j60Var;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239652496);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239654477);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.f60.ZpBGe2uQfcn8(j60Var2, defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.oh71FJcDz6S2(28.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, e30Var5, 432, 0);
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239659826);
                                                xahdJg25P1Bv3 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_saved_remove, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239662064);
                                                xahdJg25P1Bv3 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_save_later, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            java.lang.String str = xahdJg25P1Bv3;
                                            defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var5.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).P05cfTpS5W5L;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239667824);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239669805);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.ym1.giKS3J6vZuNy(str, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, pn1Var, e30Var5, 0, 0, 131066);
                                            break;
                                        } else {
                                            e30Var5.Jkfc0NcwyPL8();
                                            break;
                                        }
                                }
                                return gs1Var;
                            }
                        }, e30Var2), e30Var2, 48);
                        defpackage.vl0 xahdJg25P1Bv3 = defpackage.nq1.xahdJg25P1Bv(defpackage.nn.JhCgjQRTAOCT(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.08f), q50Var), 12.0f);
                        defpackage.gg ZpBGe2uQfcn85 = defpackage.eg.ZpBGe2uQfcn8(new defpackage.l7(8.0f, new defpackage.h7(0)), caVar, e30Var2, 6);
                        int hashCode4 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR5 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju4 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, xahdJg25P1Bv3);
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            pjVar2 = pjVar4;
                            e30Var2.Ns0WNyEWdPsk(pjVar2);
                        } else {
                            pjVar2 = pjVar4;
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, ZpBGe2uQfcn85);
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR5);
                        defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode4, e30Var2, h5Var3, e30Var2, nVar);
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju4);
                        defpackage.vl0 giKS3J6vZuNy4 = defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f);
                        defpackage.v61 ZpBGe2uQfcn86 = defpackage.u61.ZpBGe2uQfcn8(defpackage.vx1.WDYagTQQm9ns, defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j, e30Var2, 54);
                        int hashCode5 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR6 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju5 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, giKS3J6vZuNy4);
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            e30Var2.Ns0WNyEWdPsk(pjVar2);
                        } else {
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, ZpBGe2uQfcn86);
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR6);
                        defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode5, e30Var2, h5Var3, e30Var2, nVar);
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju5);
                        defpackage.pj pjVar5 = pjVar2;
                        defpackage.ym1.giKS3J6vZuNy(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_popularity, e30Var2), null, defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var2).e6mdH7fiFuta, e30Var2, 0, 0, 131066);
                        defpackage.ym1.giKS3J6vZuNy(defpackage.q70.w6IV1lieBIux(com.ice.fishing.wolberta.R.string.detail_score_format, new java.lang.Object[]{java.lang.Integer.valueOf(item2.getScore())}, e30Var2), null, defpackage.j80.maCixPsq4ml2(e30Var2).GE9mJIPrb8gP, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var2).e6mdH7fiFuta, e30Var2, 0, 0, 131066);
                        e30Var2.XntWc4eZSQ8j(true);
                        defpackage.vl0 JhCgjQRTAOCT2 = defpackage.nn.JhCgjQRTAOCT(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.fWTAfUmVKrZq(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), 8.0f), defpackage.q61.ZpBGe2uQfcn8(4.0f)), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.15f), q50Var);
                        defpackage.vk0 JhCgjQRTAOCT3 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.oh71FJcDz6S2, false);
                        int hashCode6 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                        defpackage.ay0 fNwYGHIYeJcR7 = e30Var2.fNwYGHIYeJcR();
                        defpackage.vl0 oCu53ZX2v4Ju6 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, JhCgjQRTAOCT2);
                        e30Var2.fhbmYuu9J3cT();
                        if (e30Var2.Fu5WBEia9jBo) {
                            e30Var2.Ns0WNyEWdPsk(pjVar5);
                        } else {
                            e30Var2.lXYSMswtzmix();
                        }
                        defpackage.t80.w6IV1lieBIux(h5Var, e30Var2, JhCgjQRTAOCT3);
                        defpackage.t80.w6IV1lieBIux(h5Var2, e30Var2, fNwYGHIYeJcR7);
                        defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode6, e30Var2, h5Var3, e30Var2, nVar);
                        defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, oCu53ZX2v4Ju6);
                        defpackage.ab.ZpBGe2uQfcn8(defpackage.nn.JhCgjQRTAOCT(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.giKS3J6vZuNy(defpackage.ce1.giKS3J6vZuNy, item2.getScore() / 100.0f), defpackage.q61.ZpBGe2uQfcn8(4.0f)), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).oh71FJcDz6S2, 0.7f), q50Var), e30Var2, 0);
                        e30Var2.XntWc4eZSQ8j(true);
                        e30Var2.XntWc4eZSQ8j(true);
                        if (item2.getMarked()) {
                            e30Var2.NkfcFfdaVTox(-238191460);
                            giKS3J6vZuNy2 = defpackage.j80.maCixPsq4ml2(e30Var2).oh71FJcDz6S2;
                            e30Var2.XntWc4eZSQ8j(false);
                        } else {
                            e30Var2.NkfcFfdaVTox(-238189370);
                            giKS3J6vZuNy2 = defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.18f);
                            e30Var2.XntWc4eZSQ8j(false);
                        }
                        final int i5 = 2;
                        defpackage.vx1.ZpBGe2uQfcn8(n10Var2, giKS3J6vZuNy2, null, 14.0f, defpackage.nn.OcTWLQzke1i2(161143046, new defpackage.d20() { // from class: tp
                            @Override // defpackage.d20
                            public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.j60 j60Var;
                                long j2;
                                java.lang.String xahdJg25P1Bv32;
                                long j3;
                                int i52 = i5;
                                defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                                com.ice.fishing.wolberta.data.local.Item item3 = item2;
                                switch (i52) {
                                    case 0:
                                        defpackage.w61 w61Var = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var3 = (defpackage.e30) obj4;
                                        int intValue2 = ((java.lang.Integer) obj5).intValue();
                                        w61Var.getClass();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= e30Var3.oh71FJcDz6S2(w61Var) ? 4 : 2;
                                        }
                                        if (e30Var3.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            for (defpackage.bw0 bw0Var : defpackage.ma0.oCu53ZX2v4Ju(new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_time, e30Var3), item3.getTime()), new defpackage.bw0(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_score, e30Var3), java.lang.String.valueOf(item3.getScore())))) {
                                                defpackage.m90.P05cfTpS5W5L((java.lang.String) bw0Var.WDYagTQQm9ns, w61Var.ZpBGe2uQfcn8(), (java.lang.String) bw0Var.oh71FJcDz6S2, e30Var3, 0);
                                            }
                                            break;
                                        } else {
                                            e30Var3.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    case 1:
                                        defpackage.w61 w61Var2 = (defpackage.w61) obj3;
                                        defpackage.e30 e30Var4 = (defpackage.e30) obj4;
                                        int intValue3 = ((java.lang.Integer) obj5).intValue();
                                        w61Var2.getClass();
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= e30Var4.oh71FJcDz6S2(w61Var2) ? 4 : 2;
                                        }
                                        if (e30Var4.zJPqDeoF0Os1(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_heat, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getHeat().WDYagTQQm9ns, e30Var4, 0);
                                            defpackage.m90.P05cfTpS5W5L(defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_region, e30Var4), w61Var2.ZpBGe2uQfcn8(), item3.getType().WDYagTQQm9ns, e30Var4, 0);
                                            break;
                                        } else {
                                            e30Var4.Jkfc0NcwyPL8();
                                            break;
                                        }
                                    default:
                                        defpackage.e30 e30Var5 = (defpackage.e30) obj4;
                                        int intValue4 = ((java.lang.Integer) obj5).intValue();
                                        ((defpackage.w61) obj3).getClass();
                                        if (e30Var5.zJPqDeoF0Os1(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            if (item3.getMarked()) {
                                                j60Var = defpackage.h0.BHfvd2J71qpO;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var = new defpackage.i60("Filled.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i6 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    java.util.ArrayList arrayList = new java.util.ArrayList(32);
                                                    arrayList.add(new defpackage.fx0(17.0f, 3.0f));
                                                    arrayList.add(new defpackage.dx0(7.0f));
                                                    arrayList.add(new defpackage.kx0(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f));
                                                    arrayList.add(new defpackage.ex0(5.0f, 21.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, -3.0f));
                                                    arrayList.add(new defpackage.mx0(7.0f, 3.0f));
                                                    arrayList.add(new defpackage.sx0(5.0f));
                                                    arrayList.add(new defpackage.kx0(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
                                                    arrayList.add(defpackage.bx0.fWTAfUmVKrZq);
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var, arrayList, lf1Var);
                                                    j60Var = i60Var.giKS3J6vZuNy();
                                                    defpackage.h0.BHfvd2J71qpO = j60Var;
                                                }
                                            } else {
                                                j60Var = defpackage.vx1.s0TASMVLSWD5;
                                                if (j60Var == null) {
                                                    defpackage.i60 i60Var2 = new defpackage.i60("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                    int i7 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    defpackage.lf1 lf1Var2 = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                                                    defpackage.k0 k0Var = new defpackage.k0(16, (byte) 0);
                                                    java.util.ArrayList arrayList2 = (java.util.ArrayList) k0Var.oh71FJcDz6S2;
                                                    k0Var.WmetiUbpKU9I(17.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 3.0f);
                                                    k0Var.Ns0WNyEWdPsk(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                                    k0Var.T1fB7bDYiVJQ(5.0f, 21.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, -3.0f);
                                                    k0Var.XntWc4eZSQ8j(7.0f, 3.0f);
                                                    k0Var.T1fB7bDYiVJQ(19.0f, 5.0f);
                                                    k0Var.Ns0WNyEWdPsk(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                                    k0Var.oh71FJcDz6S2();
                                                    k0Var.WmetiUbpKU9I(17.0f, 18.0f);
                                                    k0Var.XntWc4eZSQ8j(-5.0f, -2.18f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 18.0f);
                                                    k0Var.T1fB7bDYiVJQ(7.0f, 5.0f);
                                                    arrayList2.add(new defpackage.lx0(10.0f));
                                                    arrayList2.add(new defpackage.rx0(13.0f));
                                                    k0Var.oh71FJcDz6S2();
                                                    defpackage.i60.ZpBGe2uQfcn8(i60Var2, arrayList2, lf1Var2);
                                                    j60Var = i60Var2.giKS3J6vZuNy();
                                                    defpackage.vx1.s0TASMVLSWD5 = j60Var;
                                                }
                                            }
                                            defpackage.j60 j60Var2 = j60Var;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239652496);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239654477);
                                                j2 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.f60.ZpBGe2uQfcn8(j60Var2, defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.oh71FJcDz6S2(28.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), j2, e30Var5, 432, 0);
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239659826);
                                                xahdJg25P1Bv32 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_saved_remove, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239662064);
                                                xahdJg25P1Bv32 = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.detail_save_later, e30Var5);
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            java.lang.String str = xahdJg25P1Bv32;
                                            defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var5.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).P05cfTpS5W5L;
                                            if (item3.getMarked()) {
                                                e30Var5.NkfcFfdaVTox(239667824);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            } else {
                                                e30Var5.NkfcFfdaVTox(239669805);
                                                j3 = ((defpackage.uf) e30Var5.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                e30Var5.XntWc4eZSQ8j(false);
                                            }
                                            defpackage.ym1.giKS3J6vZuNy(str, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, pn1Var, e30Var5, 0, 0, 131066);
                                            break;
                                        } else {
                                            e30Var5.Jkfc0NcwyPL8();
                                            break;
                                        }
                                }
                                return gs1Var;
                            }
                        }, e30Var2), e30Var2, 27648, 4);
                        defpackage.vx1.ZpBGe2uQfcn8(n10Var, defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.12f), null, 0.0f, defpackage.nn.giKS3J6vZuNy, e30Var2, 24576, 12);
                        e30Var2.XntWc4eZSQ8j(true);
                    } else {
                        e30Var2.Jkfc0NcwyPL8();
                    }
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            }, e30Var), e30Var, ((i2 >> 3) & 14) | 432);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(item, n10Var, n10Var2, i, 8);
        }
    }

    public static final long frSwwKIlbUhK(long j) {
        return defpackage.q70.oh71FJcDz6S2(java.lang.Float.isNaN(defpackage.jt1.giKS3J6vZuNy(j)) ? 0.0f : defpackage.jt1.giKS3J6vZuNy(j), java.lang.Float.isNaN(defpackage.jt1.fWTAfUmVKrZq(j)) ? 0.0f : defpackage.jt1.fWTAfUmVKrZq(j));
    }

    public static defpackage.vl0 gUjdnLbkVAaA(defpackage.vl0 vl0Var, defpackage.d20 d20Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.bj(d20Var));
    }

    public static final defpackage.lp giKS3J6vZuNy(android.content.Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        defpackage.p00 ZpBGe2uQfcn82 = defpackage.q00.ZpBGe2uQfcn8(f);
        if (ZpBGe2uQfcn82 == null) {
            ZpBGe2uQfcn82 = new defpackage.nh0(f);
        }
        return new defpackage.lp(f2, f, ZpBGe2uQfcn82);
    }

    public static final boolean h3m55N1URyyK(defpackage.av1 av1Var, defpackage.av1 av1Var2) {
        if (av1Var == av1Var2) {
            return true;
        }
        return java.lang.Math.abs(av1Var.ZpBGe2uQfcn8 - av1Var2.ZpBGe2uQfcn8) < 0.001f && java.lang.Math.abs(av1Var.giKS3J6vZuNy - av1Var2.giKS3J6vZuNy) < 0.001f;
    }

    public static final java.lang.Object[] jjTN4uUnoyEn(java.util.Collection collection) {
        collection.getClass();
        int size = collection.size();
        java.lang.Object[] objArr = giKS3J6vZuNy;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return java.util.Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final int maCixPsq4ml2(defpackage.x7 x7Var, java.lang.Object obj, int i) {
        int i2 = x7Var.QiMR8OkAhezm;
        if (i2 == 0) {
            return -1;
        }
        try {
            int GE9mJIPrb8gP2 = defpackage.vx1.GE9mJIPrb8gP(x7Var.WDYagTQQm9ns, i2, i);
            if (GE9mJIPrb8gP2 < 0 || defpackage.ma0.QiMR8OkAhezm(obj, x7Var.oh71FJcDz6S2[GE9mJIPrb8gP2])) {
                return GE9mJIPrb8gP2;
            }
            int i3 = GE9mJIPrb8gP2 + 1;
            while (i3 < i2 && x7Var.WDYagTQQm9ns[i3] == i) {
                if (defpackage.ma0.QiMR8OkAhezm(obj, x7Var.oh71FJcDz6S2[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = GE9mJIPrb8gP2 - 1; i4 >= 0 && x7Var.WDYagTQQm9ns[i4] == i; i4--) {
                if (defpackage.ma0.QiMR8OkAhezm(obj, x7Var.oh71FJcDz6S2[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public static final defpackage.vl0 oCu53ZX2v4Ju(defpackage.e30 e30Var, defpackage.vl0 vl0Var) {
        e30Var.NkfcFfdaVTox(439770924);
        defpackage.vl0 VFeft99leXEK = VFeft99leXEK(e30Var, vl0Var);
        e30Var.XntWc4eZSQ8j(false);
        return VFeft99leXEK;
    }

    public static final boolean oh71FJcDz6S2(defpackage.pn1 pn1Var) {
        defpackage.fz0 fz0Var;
        defpackage.sz0 sz0Var = pn1Var.fWTAfUmVKrZq;
        defpackage.tu tuVar = (sz0Var == null || (fz0Var = sz0Var.giKS3J6vZuNy) == null) ? null : new defpackage.tu(fz0Var.giKS3J6vZuNy);
        boolean z = false;
        if (tuVar != null && tuVar.ZpBGe2uQfcn8 == 1) {
            z = true;
        }
        return !z;
    }

    public static final defpackage.vl0 qjMheFZ0l9kA(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.qt0(y10Var));
    }

    public static final defpackage.vl0 s0TASMVLSWD5(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.xs(y10Var));
    }

    public static final defpackage.vl0 w7APNrr0aGRc(defpackage.vl0 vl0Var, boolean z, defpackage.in0 in0Var) {
        return vl0Var.fWTAfUmVKrZq(z ? new defpackage.pz(in0Var) : defpackage.sl0.ZpBGe2uQfcn8);
    }
}
