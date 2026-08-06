package defpackage;

/* loaded from: classes.dex */
public final class ky implements defpackage.ek, defpackage.gp0, defpackage.kj, defpackage.g30, defpackage.kv0, defpackage.zx0 {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ ky(int i) {
        this.adDC3e2L = i;
    }

    public static android.graphics.Typeface DFo87pBq1E5(java.lang.String str, defpackage.dz dzVar, int i) {
        if (i == 0 && defpackage.x70.QoRHpC4k(dzVar, defpackage.dz.AARZUJiTa) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int abhbClRa = defpackage.w70.abhbClRa(dzVar, i);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(abhbClRa) : android.graphics.Typeface.create(str, abhbClRa);
    }

    public static android.graphics.Typeface JlrlGoKF(java.lang.String str, defpackage.dz dzVar, int i) {
        android.graphics.Typeface create;
        if (i == 0 && defpackage.x70.QoRHpC4k(dzVar, defpackage.dz.AARZUJiTa) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        create = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), dzVar.adDC3e2L, i == 1);
        return create;
    }

    public static final void SH1y5HwkJhh(defpackage.ky kyVar) {
        defpackage.hc1 hc1Var;
        defpackage.qu0 qu0Var;
        defpackage.qu0 qu0Var2;
        defpackage.hc1 hc1Var2 = defpackage.gz0.QQUzIjv3iOC5;
        do {
            hc1Var = defpackage.gz0.QQUzIjv3iOC5;
            qu0Var = (defpackage.qu0) hc1Var.getValue();
            defpackage.hu0 hu0Var = qu0Var.AARZUJiTa;
            defpackage.re0 re0Var = (defpackage.re0) hu0Var.get(kyVar);
            if (re0Var == null) {
                qu0Var2 = qu0Var;
            } else {
                java.lang.Object obj = re0Var.IHQe1A4L2xu;
                java.lang.Object obj2 = re0Var.oh6vYeIP;
                defpackage.yi1 yi1Var = hu0Var.adDC3e2L;
                defpackage.yi1 V7bD7b8KA = yi1Var.V7bD7b8KA(kyVar != null ? kyVar.hashCode() : 0, 0, kyVar);
                if (yi1Var != V7bD7b8KA) {
                    hu0Var = V7bD7b8KA == null ? defpackage.hu0.AARZUJiTa : new defpackage.hu0(V7bD7b8KA, hu0Var.xiZrDbcSW0 - 1);
                }
                defpackage.n nVar = defpackage.n.yIx6ChFVk;
                if (obj != nVar) {
                    java.lang.Object obj3 = hu0Var.get(obj);
                    obj3.getClass();
                    hu0Var = hu0Var.IHQe1A4L2xu(obj, new defpackage.re0(((defpackage.re0) obj3).IHQe1A4L2xu, obj2));
                }
                if (obj2 != nVar) {
                    java.lang.Object obj4 = hu0Var.get(obj2);
                    obj4.getClass();
                    hu0Var = hu0Var.IHQe1A4L2xu(obj2, new defpackage.re0(obj, ((defpackage.re0) obj4).oh6vYeIP));
                }
                java.lang.Object obj5 = obj != nVar ? qu0Var.adDC3e2L : obj2;
                if (obj2 != nVar) {
                    obj = qu0Var.xiZrDbcSW0;
                }
                qu0Var2 = new defpackage.qu0(obj5, obj, hu0Var);
            }
            if (qu0Var == qu0Var2) {
                return;
            }
        } while (!hc1Var.riuEU0zW4(qu0Var, qu0Var2));
    }

    public static defpackage.o01 cnag84Bm(java.lang.String str) {
        java.lang.Object obj;
        str.getClass();
        defpackage.gu guVar = defpackage.o01.QoRHpC4k;
        guVar.getClass();
        defpackage.kNAkVymC knakvymc = new defpackage.kNAkVymC(0, guVar);
        while (true) {
            if (!knakvymc.hasNext()) {
                obj = null;
                break;
            }
            obj = knakvymc.next();
            if (((defpackage.o01) obj).adDC3e2L.equals(str)) {
                break;
            }
        }
        return (defpackage.o01) obj;
    }

    public static defpackage.nm0 ez2rX8ReCYw(defpackage.a6 a6Var, defpackage.gn0 gn0Var, android.os.Bundle bundle, defpackage.nd0 nd0Var, defpackage.zm0 zm0Var) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        uuid.getClass();
        gn0Var.getClass();
        nd0Var.getClass();
        return new defpackage.nm0(a6Var, gn0Var, bundle, nd0Var, zm0Var, uuid, null);
    }

    public static final float riuEU0zW4(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = java.lang.Math.abs(f);
        float signum = java.lang.Math.signum(f);
        int binarySearch = java.util.Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    @Override // defpackage.gp0
    public boolean AARZUJiTa(defpackage.d40 d40Var, defpackage.ma0 ma0Var) {
        return false;
    }

    @Override // defpackage.gp0
    public boolean EXtogiMhuM(defpackage.ma0 ma0Var) {
        defpackage.b71 abhbClRa = ma0Var.abhbClRa();
        boolean z = false;
        if (abhbClRa != null && abhbClRa.EXtogiMhuM) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.gp0
    public void F7NU4MC0GW(defpackage.ma0 ma0Var, long j, defpackage.d40 d40Var, int i, boolean z) {
        defpackage.ep0 ep0Var = ma0Var.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
        defpackage.w11 w11Var = defpackage.ip0.TFRaUu83X3E;
        ep0Var.F7NU4MC0GW.rzSERzFHIn(defpackage.ip0.Ye0N2xE9Hc, ip0Var.Q1EpAU06IV(j), d40Var, 1, z);
    }

    @Override // defpackage.gp0
    public boolean IHQe1A4L2xu(defpackage.lj0 lj0Var) {
        return false;
    }

    public android.graphics.Typeface SyNS6RMn(defpackage.g20 g20Var, defpackage.dz dzVar, int i) {
        switch (this.adDC3e2L) {
            case 19:
                return JlrlGoKF(g20Var.F7NU4MC0GW, dzVar, i);
            default:
                java.lang.String str = g20Var.F7NU4MC0GW;
                int i2 = dzVar.adDC3e2L / 100;
                if (i2 >= 0 && i2 < 2) {
                    str = str.concat("-thin");
                } else if (2 <= i2 && i2 < 4) {
                    str = str.concat("-light");
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        str = str.concat("-medium");
                    } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                        str = str.concat("-black");
                    }
                }
                android.graphics.Typeface typeface = null;
                if (str.length() != 0) {
                    android.graphics.Typeface DFo87pBq1E5 = DFo87pBq1E5(str, dzVar, i);
                    if (!defpackage.x70.QoRHpC4k(DFo87pBq1E5, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, defpackage.w70.abhbClRa(dzVar, i))) && !defpackage.x70.QoRHpC4k(DFo87pBq1E5, DFo87pBq1E5(null, dzVar, i))) {
                        typeface = DFo87pBq1E5;
                    }
                }
                return typeface == null ? DFo87pBq1E5(g20Var.F7NU4MC0GW, dzVar, i) : typeface;
        }
    }

    @Override // defpackage.zx0
    public void adDC3e2L() {
        switch (this.adDC3e2L) {
            case 21:
                break;
            default:
                android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.gp0
    public int oh6vYeIP() {
        return 8;
    }

    @Override // defpackage.gp0
    public boolean r1MBDhnF(defpackage.lj0 lj0Var) {
        return defpackage.h1.frpfPPIgqM9O(defpackage.e90.F7NU4MC0GW(defpackage.w70.D2vUnMij(lj0Var), false));
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 28:
                int hashCode = hashCode();
                defpackage.x70.G3OKOH3wZRC(16);
                java.lang.String num = java.lang.Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + defpackage.sz0.IHQe1A4L2xu(defpackage.i41.class).r1MBDhnF() + ">";
            case 29:
                int hashCode2 = hashCode();
                defpackage.x70.G3OKOH3wZRC(16);
                java.lang.String num2 = java.lang.Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + defpackage.sz0.IHQe1A4L2xu(defpackage.cn1.class).r1MBDhnF() + ">";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zx0
    public void xiZrDbcSW0(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (this.adDC3e2L) {
            case 21:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    android.util.Log.d("ProfileInstaller", str);
                    break;
                } else {
                    android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) obj);
                    break;
                }
                break;
        }
    }

    private final void QoRHpC4k() {
    }

    private final void G3OKOH3wZRC(int i, java.lang.Object obj) {
    }
}
