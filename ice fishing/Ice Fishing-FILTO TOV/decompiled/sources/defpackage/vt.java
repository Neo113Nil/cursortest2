package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vt implements zj0, fz, dq0, fs0, wh {
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ vt(int i) {
        this.OOA6hdeuvCS = i;
    }

    public static Typeface E7jCp8Ls(String str, ou ouVar, int i) {
        Typeface create;
        if (i == 0 && o30.rQPn8YBR(ouVar, ou.AvO7iQsrTN) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ouVar.OOA6hdeuvCS, i == 1);
        return create;
    }

    public static final void JFJ3QoxA(vt vtVar) {
        p51 p51Var;
        mp0 mp0Var;
        mp0 mp0Var2;
        p51 p51Var2 = gt0.arNh8D4Z5gB;
        do {
            p51Var = gt0.arNh8D4Z5gB;
            mp0Var = (mp0) p51Var.getValue();
            dp0 dp0Var = mp0Var.AvO7iQsrTN;
            ra0 ra0Var = (ra0) dp0Var.get(vtVar);
            if (ra0Var == null) {
                mp0Var2 = mp0Var;
            } else {
                Object obj = ra0Var.GWasM1elztuh;
                Object obj2 = ra0Var.Yi7zF1RB1;
                za1 za1Var = dp0Var.OOA6hdeuvCS;
                za1 cilMamHF = za1Var.cilMamHF(vtVar != null ? vtVar.hashCode() : 0, 0, vtVar);
                if (za1Var != cilMamHF) {
                    dp0Var = cilMamHF == null ? dp0.AvO7iQsrTN : new dp0(cilMamHF, dp0Var.EljAMC1QTz - 1);
                }
                b9xEq24R1 b9xeq24r1 = b9xEq24R1.A1EKNP6CxJ;
                if (obj != b9xeq24r1) {
                    Object obj3 = dp0Var.get(obj);
                    obj3.getClass();
                    dp0Var = dp0Var.GWasM1elztuh(obj, new ra0(((ra0) obj3).GWasM1elztuh, obj2));
                }
                if (obj2 != b9xeq24r1) {
                    Object obj4 = dp0Var.get(obj2);
                    obj4.getClass();
                    dp0Var = dp0Var.GWasM1elztuh(obj2, new ra0(obj, ((ra0) obj4).Yi7zF1RB1));
                }
                Object obj5 = obj != b9xeq24r1 ? mp0Var.OOA6hdeuvCS : obj2;
                if (obj2 != b9xeq24r1) {
                    obj = mp0Var.EljAMC1QTz;
                }
                mp0Var2 = new mp0(obj5, obj, dp0Var);
            }
            if (mp0Var == mp0Var2) {
                return;
            }
        } while (!p51Var.encWxUiV2(mp0Var, mp0Var2));
    }

    public static Typeface XnEVoBF0td1l(String str, ou ouVar, int i) {
        if (i == 0 && o30.rQPn8YBR(ouVar, ou.AvO7iQsrTN) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int pog2g9KITJA = fb1.pog2g9KITJA(ouVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(pog2g9KITJA) : Typeface.create(str, pog2g9KITJA);
    }

    public static final float mOu10nynGul(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
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
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static fh0 rQPn8YBR(kp kpVar, xh0 xh0Var, Bundle bundle, m90 m90Var, qh0 qh0Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        xh0Var.getClass();
        m90Var.getClass();
        return new fh0(kpVar, xh0Var, bundle, m90Var, qh0Var, uuid, null);
    }

    @Override // defpackage.zj0
    public boolean AvO7iQsrTN(nz nzVar, g60 g60Var) {
        return false;
    }

    @Override // defpackage.fs0
    public void EljAMC1QTz(int i, Object obj) {
        String str;
        switch (this.OOA6hdeuvCS) {
            case 19:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
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
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zj0
    public boolean GWasM1elztuh(he0 he0Var) {
        return false;
    }

    @Override // defpackage.fs0
    public void OOA6hdeuvCS() {
        switch (this.OOA6hdeuvCS) {
            case 19:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.zj0
    public boolean X1lG3V04pd(he0 he0Var) {
        return o30.EXrPz3p7hFb(w60.AvO7iQsrTN(vc0.eUH21U3apd(he0Var), false));
    }

    @Override // defpackage.zj0
    public int Yi7zF1RB1() {
        return 8;
    }

    @Override // defpackage.zj0
    public boolean encWxUiV2(g60 g60Var) {
        zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
        boolean z = false;
        if (WdrkLMV3xh != null && WdrkLMV3xh.encWxUiV2) {
            z = true;
        }
        return !z;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 25:
                int hashCode = hashCode();
                ki1.Y6hRI1cF8(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + st0.GWasM1elztuh(yw0.class).Yi7zF1RB1() + ">";
            case 26:
                int hashCode2 = hashCode();
                ki1.Y6hRI1cF8(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + st0.GWasM1elztuh(ff1.class).Yi7zF1RB1() + ">";
            case 27:
                int hashCode3 = hashCode();
                ki1.Y6hRI1cF8(16);
                String num3 = Integer.toString(hashCode3, 16);
                num3.getClass();
                return "CreationExtras.Key@" + num3 + "<" + st0.GWasM1elztuh(Bundle.class).Yi7zF1RB1() + ">";
            case 28:
                return "SharingStarted.Eagerly";
            case 29:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public Typeface uFEq9NpZ(dy dyVar, ou ouVar, int i) {
        String str;
        switch (this.OOA6hdeuvCS) {
            case 17:
                dyVar.getClass();
                return E7jCp8Ls("sans-serif", ouVar, i);
            default:
                dyVar.getClass();
                int i2 = ouVar.OOA6hdeuvCS / 100;
                if (i2 >= 0 && i2 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i2 || i2 >= 4) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface XnEVoBF0td1l = XnEVoBF0td1l(str, ouVar, i);
                    if (!o30.rQPn8YBR(XnEVoBF0td1l, Typeface.create(Typeface.DEFAULT, fb1.pog2g9KITJA(ouVar, i))) && !o30.rQPn8YBR(XnEVoBF0td1l, XnEVoBF0td1l(null, ouVar, i))) {
                        typeface = XnEVoBF0td1l;
                    }
                }
                return typeface == null ? XnEVoBF0td1l("sans-serif", ouVar, i) : typeface;
        }
    }

    @Override // defpackage.zj0
    public void xqGvceK5x(g60 g60Var, long j, nz nzVar, int i, boolean z) {
        xj0 xj0Var = g60Var.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.xqGvceK5x;
        yu0 yu0Var = bk0.z19UFEN2I;
        xj0Var.xqGvceK5x.NsRGN7gRqWF(bk0.qugwajBSa59j, bk0Var.R46bVSe7ra(j), nzVar, 1, z);
    }

    private final void iwATDS1i01k() {
    }

    private final void WIEu4Ya2g8(int i, Object obj) {
    }
}
