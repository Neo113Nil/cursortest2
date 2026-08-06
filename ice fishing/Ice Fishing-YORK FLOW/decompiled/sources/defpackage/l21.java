package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class l21 implements defpackage.m21, defpackage.im, defpackage.ht1 {
    public static defpackage.l21 oh71FJcDz6S2;
    public final /* synthetic */ int WDYagTQQm9ns;

    public l21(defpackage.w2 w2Var) {
        this.WDYagTQQm9ns = 18;
    }

    public static final defpackage.ws1 P05cfTpS5W5L(java.lang.String str, int i) {
        java.util.WeakHashMap weakHashMap = defpackage.rw1.maCixPsq4ml2;
        return new defpackage.ws1(new defpackage.y80(0, 0, 0, 0), str);
    }

    public static final int QiMR8OkAhezm(int i, long j) {
        int i2 = defpackage.mo1.giKS3J6vZuNy;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final void WDYagTQQm9ns(defpackage.l21 l21Var) {
        defpackage.gg1 gg1Var;
        defpackage.jy0 jy0Var;
        defpackage.jy0 jy0Var2;
        defpackage.gg1 gg1Var2 = defpackage.m31.dG7RjM6DqYVL;
        do {
            gg1Var = defpackage.m31.dG7RjM6DqYVL;
            jy0Var = (defpackage.jy0) gg1Var.getValue();
            defpackage.by0 by0Var = jy0Var.P05cfTpS5W5L;
            defpackage.th0 th0Var = (defpackage.th0) by0Var.get(l21Var);
            if (th0Var == null) {
                jy0Var2 = jy0Var;
            } else {
                java.lang.Object obj = th0Var.ZpBGe2uQfcn8;
                java.lang.Object obj2 = th0Var.giKS3J6vZuNy;
                defpackage.vp1 vp1Var = by0Var.WDYagTQQm9ns;
                defpackage.vp1 maCixPsq4ml2 = vp1Var.maCixPsq4ml2(l21Var != null ? l21Var.hashCode() : 0, 0, l21Var);
                if (vp1Var != maCixPsq4ml2) {
                    by0Var = maCixPsq4ml2 == null ? defpackage.by0.QiMR8OkAhezm : new defpackage.by0(maCixPsq4ml2, by0Var.oh71FJcDz6S2 - 1);
                }
                defpackage.jVUAPb5NnIYW jvuapb5nniyw = defpackage.jVUAPb5NnIYW.BXaznwstz2U0;
                if (obj != jvuapb5nniyw) {
                    java.lang.Object obj3 = by0Var.get(obj);
                    obj3.getClass();
                    by0Var = by0Var.ZpBGe2uQfcn8(obj, new defpackage.th0(((defpackage.th0) obj3).ZpBGe2uQfcn8, obj2));
                }
                if (obj2 != jvuapb5nniyw) {
                    java.lang.Object obj4 = by0Var.get(obj2);
                    obj4.getClass();
                    by0Var = by0Var.ZpBGe2uQfcn8(obj2, new defpackage.th0(obj, ((defpackage.th0) obj4).giKS3J6vZuNy));
                }
                java.lang.Object obj5 = obj != jvuapb5nniyw ? jy0Var.oh71FJcDz6S2 : obj2;
                if (obj2 != jvuapb5nniyw) {
                    obj = jy0Var.QiMR8OkAhezm;
                }
                jy0Var2 = new defpackage.jy0(obj5, obj, by0Var);
            }
            if (jy0Var == jy0Var2) {
                return;
            }
        } while (!gg1Var.P05cfTpS5W5L(jy0Var, jy0Var2));
    }

    public static defpackage.rw1 e6mdH7fiFuta(defpackage.e30 e30Var) {
        defpackage.rw1 rw1Var;
        android.view.View view = (android.view.View) e30Var.GE9mJIPrb8gP(defpackage.j0.oh71FJcDz6S2);
        java.util.WeakHashMap weakHashMap = defpackage.rw1.maCixPsq4ml2;
        synchronized (weakHashMap) {
            try {
                java.lang.Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new defpackage.rw1(view);
                    weakHashMap.put(view, obj);
                }
                rw1Var = (defpackage.rw1) obj;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(rw1Var) | e30Var.P05cfTpS5W5L(view);
        java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
        if (P05cfTpS5W5L || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
            GcLuU6pT9wO9 = new defpackage.m91(13, rw1Var, view);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
        }
        defpackage.nq1.oh71FJcDz6S2(rw1Var, (defpackage.y10) GcLuU6pT9wO9, e30Var);
        return rw1Var;
    }

    public static final defpackage.v4 oh71FJcDz6S2(java.lang.String str, int i) {
        java.util.WeakHashMap weakHashMap = defpackage.rw1.maCixPsq4ml2;
        return new defpackage.v4(str, i);
    }

    public static long s0TASMVLSWD5(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public boolean GE9mJIPrb8gP(java.lang.CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.m21
    public void JhCgjQRTAOCT(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (this.WDYagTQQm9ns) {
            case 0:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                    default:
                        str = "";
                        break;
                    case defpackage.n70.giKS3J6vZuNy /* 10 */:
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

    @Override // defpackage.ht1
    public int Ns0WNyEWdPsk() {
        return 0;
    }

    @Override // defpackage.ft1
    public defpackage.g6 T1fB7bDYiVJQ(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return j < 0 ? g6Var : g6Var2;
    }

    @Override // defpackage.m21
    public void fWTAfUmVKrZq() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                break;
            default:
                android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.ht1
    public int gUjdnLbkVAaA() {
        return 0;
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 6:
                int hashCode = hashCode();
                defpackage.jr0.XntWc4eZSQ8j(16);
                java.lang.String num = java.lang.Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + defpackage.b41.ZpBGe2uQfcn8(defpackage.b81.class).fWTAfUmVKrZq() + ">";
            case 7:
                int hashCode2 = hashCode();
                defpackage.jr0.XntWc4eZSQ8j(16);
                java.lang.String num2 = java.lang.Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + defpackage.b41.ZpBGe2uQfcn8(defpackage.ru1.class).fWTAfUmVKrZq() + ">";
            case 8:
                int hashCode3 = hashCode();
                defpackage.jr0.XntWc4eZSQ8j(16);
                java.lang.String num3 = java.lang.Integer.toString(hashCode3, 16);
                num3.getClass();
                return "CreationExtras.Key@" + num3 + "<" + defpackage.b41.ZpBGe2uQfcn8(android.os.Bundle.class).fWTAfUmVKrZq() + ">";
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                return "SharingStarted.Eagerly";
            case 11:
                return "SharingStarted.Lazily";
            case 13:
                return "ReusedSlotId";
            case 26:
                int hashCode4 = hashCode();
                defpackage.jr0.XntWc4eZSQ8j(16);
                java.lang.String num4 = java.lang.Integer.toString(hashCode4, 16);
                num4.getClass();
                return "CreationExtras.Key@" + num4 + "<" + defpackage.b41.ZpBGe2uQfcn8(android.app.Application.class).fWTAfUmVKrZq() + ">";
            case 27:
                int hashCode5 = hashCode();
                defpackage.jr0.XntWc4eZSQ8j(16);
                java.lang.String num5 = java.lang.Integer.toString(hashCode5, 16);
                num5.getClass();
                return "CreationExtras.Key@" + num5 + "<" + defpackage.b41.ZpBGe2uQfcn8(java.lang.String.class).fWTAfUmVKrZq() + ">";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l21(int i) {
        this.WDYagTQQm9ns = i;
    }

    private final void h3m55N1URyyK() {
    }

    private final void WmetiUbpKU9I(int i, java.lang.Object obj) {
    }

    @Override // defpackage.ft1
    public defpackage.g6 fNwYGHIYeJcR(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return g6Var3;
    }
}
