package defpackage;

import com.combinations.level.experts.core.domain.model.Side;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nb {
    public int GWasM1elztuh;
    public int X1lG3V04pd;
    public int Yi7zF1RB1;
    public final Object xqGvceK5x;

    public nb(mb mbVar) {
        this.X1lG3V04pd = 0;
        Charset charset = i30.GWasM1elztuh;
        this.xqGvceK5x = mbVar;
        mbVar.EljAMC1QTz = this;
    }

    public c9 AvO7iQsrTN() {
        WRKkgoJXwDn(2);
        return ((mb) this.xqGvceK5x).E7jCp8Ls();
    }

    public void E7jCp8Ls(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 2) {
            int pog2g9KITJA = mbVar.pog2g9KITJA();
            if ((pog2g9KITJA & 3) != 0) {
                throw new w30("Failed to parse the message.");
            }
            int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.iwATDS1i01k()));
            } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
            return;
        }
        if (i != 5) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.iwATDS1i01k()));
            if (mbVar.xqGvceK5x()) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == this.GWasM1elztuh);
        this.X1lG3V04pd = arNh8D4Z5gB;
    }

    public void EljAMC1QTz(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Boolean.valueOf(mbVar.rQPn8YBR()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Boolean.valueOf(mbVar.rQPn8YBR()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public int GWasM1elztuh() {
        int i = this.X1lG3V04pd;
        if (i != 0) {
            this.GWasM1elztuh = i;
            this.X1lG3V04pd = 0;
        } else {
            this.GWasM1elztuh = ((mb) this.xqGvceK5x).arNh8D4Z5gB();
        }
        int i2 = this.GWasM1elztuh;
        if (i2 == 0 || i2 == this.Yi7zF1RB1) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public void JFJ3QoxA(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.uFEq9NpZ()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.uFEq9NpZ()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void Mjvvu5DE(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 1) {
            do {
                ((os0) h30Var).add(Long.valueOf(mbVar.Y6hRI1cF8()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int pog2g9KITJA = mbVar.pog2g9KITJA();
        if ((pog2g9KITJA & 7) != 0) {
            throw new w30("Failed to parse the message.");
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
        do {
            ((os0) h30Var).add(Long.valueOf(mbVar.Y6hRI1cF8()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
    }

    public void OOA6hdeuvCS(Object obj, nx0 nx0Var, zq zqVar) {
        mb mbVar = (mb) this.xqGvceK5x;
        int pog2g9KITJA = mbVar.pog2g9KITJA();
        if (mbVar.OOA6hdeuvCS >= 100) {
            throw new w30("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int JFJ3QoxA = mbVar.JFJ3QoxA(pog2g9KITJA);
        mbVar.OOA6hdeuvCS++;
        nx0Var.encWxUiV2(obj, this, zqVar);
        mbVar.Yi7zF1RB1(0);
        mbVar.OOA6hdeuvCS--;
        mbVar.mOu10nynGul(JFJ3QoxA);
    }

    public void WIEu4Ya2g8(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Long.valueOf(mbVar.mE4lRynR()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Long.valueOf(mbVar.mE4lRynR()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void WRKkgoJXwDn(int i) {
        if ((this.GWasM1elztuh & 7) != i) {
            throw w30.Yi7zF1RB1();
        }
    }

    public void WdrkLMV3xh(int i) {
        if (((mb) this.xqGvceK5x).X1lG3V04pd() != i) {
            throw w30.OOA6hdeuvCS();
        }
    }

    public Object X1lG3V04pd(int i) {
        return ((vm0) this.xqGvceK5x).EljAMC1QTz[this.X1lG3V04pd + i];
    }

    public void XnEVoBF0td1l(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 1) {
            do {
                ((os0) h30Var).add(Long.valueOf(mbVar.WIEu4Ya2g8()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int pog2g9KITJA = mbVar.pog2g9KITJA();
        if ((pog2g9KITJA & 7) != 0) {
            throw new w30("Failed to parse the message.");
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
        do {
            ((os0) h30Var).add(Long.valueOf(mbVar.WIEu4Ya2g8()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
    }

    public void Y6hRI1cF8(h30 h30Var, boolean z) {
        String WdrkLMV3xh;
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        if ((this.GWasM1elztuh & 7) != 2) {
            throw w30.Yi7zF1RB1();
        }
        do {
            if (z) {
                WRKkgoJXwDn(2);
                WdrkLMV3xh = mbVar.WRKkgoJXwDn();
            } else {
                WRKkgoJXwDn(2);
                WdrkLMV3xh = mbVar.WdrkLMV3xh();
            }
            ((os0) h30Var).add(WdrkLMV3xh);
            if (mbVar.xqGvceK5x()) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == this.GWasM1elztuh);
        this.X1lG3V04pd = arNh8D4Z5gB;
    }

    public int Yi7zF1RB1(int i) {
        return ((vm0) this.xqGvceK5x).xqGvceK5x[this.Yi7zF1RB1 + i];
    }

    public void YmKjaVtbfp5Z(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 2) {
            int pog2g9KITJA = mbVar.pog2g9KITJA();
            if ((pog2g9KITJA & 3) != 0) {
                throw new w30("Failed to parse the message.");
            }
            int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.jivtDDk9H()));
            } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
            return;
        }
        if (i != 5) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.jivtDDk9H()));
            if (mbVar.xqGvceK5x()) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == this.GWasM1elztuh);
        this.X1lG3V04pd = arNh8D4Z5gB;
    }

    public boolean arNh8D4Z5gB() {
        int i;
        mb mbVar = (mb) this.xqGvceK5x;
        if (mbVar.xqGvceK5x() || (i = this.GWasM1elztuh) == this.Yi7zF1RB1) {
            return false;
        }
        return mbVar.k8h8IjolWQ(i);
    }

    public void cilMamHF(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.pog2g9KITJA()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.pog2g9KITJA()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void encWxUiV2(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        if ((this.GWasM1elztuh & 7) != 2) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ((os0) h30Var).add(AvO7iQsrTN());
            if (mbVar.xqGvceK5x()) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == this.GWasM1elztuh);
        this.X1lG3V04pd = arNh8D4Z5gB;
    }

    public void iwATDS1i01k(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.Mjvvu5DE()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.Mjvvu5DE()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void jivtDDk9H(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Long.valueOf(mbVar.lv06NcmrQ()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Long.valueOf(mbVar.lv06NcmrQ()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void lv06NcmrQ(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Long.valueOf(mbVar.M3K9sHhK()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Long.valueOf(mbVar.M3K9sHhK()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void mE4lRynR(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 0) {
            do {
                ((os0) h30Var).add(Integer.valueOf(mbVar.cilMamHF()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + mbVar.pog2g9KITJA();
        do {
            ((os0) h30Var).add(Integer.valueOf(mbVar.cilMamHF()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
        WdrkLMV3xh(X1lG3V04pd);
    }

    public void mOu10nynGul(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 1) {
            do {
                ((os0) h30Var).add(Double.valueOf(mbVar.XnEVoBF0td1l()));
                if (mbVar.xqGvceK5x()) {
                    return;
                } else {
                    arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
                }
            } while (arNh8D4Z5gB == this.GWasM1elztuh);
            this.X1lG3V04pd = arNh8D4Z5gB;
            return;
        }
        if (i != 2) {
            throw w30.Yi7zF1RB1();
        }
        int pog2g9KITJA = mbVar.pog2g9KITJA();
        if ((pog2g9KITJA & 7) != 0) {
            throw new w30("Failed to parse the message.");
        }
        int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
        do {
            ((os0) h30Var).add(Double.valueOf(mbVar.XnEVoBF0td1l()));
        } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
    }

    public Object rQPn8YBR(yh1 yh1Var, Class cls, zq zqVar) {
        mb mbVar = (mb) this.xqGvceK5x;
        switch (yh1Var.ordinal()) {
            case 0:
                WRKkgoJXwDn(1);
                return Double.valueOf(mbVar.XnEVoBF0td1l());
            case 1:
                WRKkgoJXwDn(5);
                return Float.valueOf(mbVar.YmKjaVtbfp5Z());
            case 2:
                WRKkgoJXwDn(0);
                return Long.valueOf(mbVar.mE4lRynR());
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                WRKkgoJXwDn(0);
                return Long.valueOf(mbVar.M3K9sHhK());
            case 4:
                WRKkgoJXwDn(0);
                return Integer.valueOf(mbVar.Mjvvu5DE());
            case 5:
                WRKkgoJXwDn(1);
                return Long.valueOf(mbVar.WIEu4Ya2g8());
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                WRKkgoJXwDn(5);
                return Integer.valueOf(mbVar.iwATDS1i01k());
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                WRKkgoJXwDn(0);
                return Boolean.valueOf(mbVar.rQPn8YBR());
            case 8:
                WRKkgoJXwDn(2);
                return mbVar.WRKkgoJXwDn();
            case 9:
            default:
                o4.mE4lRynR("unsupported field type.");
                return null;
            case 10:
                WRKkgoJXwDn(2);
                nx0 GWasM1elztuh = ns0.X1lG3V04pd.GWasM1elztuh(cls);
                ay mOu10nynGul = GWasM1elztuh.mOu10nynGul();
                OOA6hdeuvCS(mOu10nynGul, GWasM1elztuh, zqVar);
                GWasM1elztuh.X1lG3V04pd(mOu10nynGul);
                return mOu10nynGul;
            case 11:
                return AvO7iQsrTN();
            case 12:
                WRKkgoJXwDn(0);
                return Integer.valueOf(mbVar.pog2g9KITJA());
            case 13:
                WRKkgoJXwDn(0);
                return Integer.valueOf(mbVar.uFEq9NpZ());
            case 14:
                WRKkgoJXwDn(5);
                return Integer.valueOf(mbVar.jivtDDk9H());
            case Side.ALL /* 15 */:
                WRKkgoJXwDn(1);
                return Long.valueOf(mbVar.Y6hRI1cF8());
            case 16:
                WRKkgoJXwDn(0);
                return Integer.valueOf(mbVar.cilMamHF());
            case 17:
                WRKkgoJXwDn(0);
                return Long.valueOf(mbVar.lv06NcmrQ());
        }
    }

    public void uFEq9NpZ(h30 h30Var) {
        int arNh8D4Z5gB;
        mb mbVar = (mb) this.xqGvceK5x;
        int i = this.GWasM1elztuh & 7;
        if (i == 2) {
            int pog2g9KITJA = mbVar.pog2g9KITJA();
            if ((pog2g9KITJA & 3) != 0) {
                throw new w30("Failed to parse the message.");
            }
            int X1lG3V04pd = mbVar.X1lG3V04pd() + pog2g9KITJA;
            do {
                ((os0) h30Var).add(Float.valueOf(mbVar.YmKjaVtbfp5Z()));
            } while (mbVar.X1lG3V04pd() < X1lG3V04pd);
            return;
        }
        if (i != 5) {
            throw w30.Yi7zF1RB1();
        }
        do {
            ((os0) h30Var).add(Float.valueOf(mbVar.YmKjaVtbfp5Z()));
            if (mbVar.xqGvceK5x()) {
                return;
            } else {
                arNh8D4Z5gB = mbVar.arNh8D4Z5gB();
            }
        } while (arNh8D4Z5gB == this.GWasM1elztuh);
        this.X1lG3V04pd = arNh8D4Z5gB;
    }

    public void xqGvceK5x(Object obj, nx0 nx0Var, zq zqVar) {
        int i = this.Yi7zF1RB1;
        this.Yi7zF1RB1 = ((this.GWasM1elztuh >>> 3) << 3) | 4;
        try {
            nx0Var.encWxUiV2(obj, this, zqVar);
            if (this.GWasM1elztuh == this.Yi7zF1RB1) {
            } else {
                throw new w30("Failed to parse the message.");
            }
        } finally {
            this.Yi7zF1RB1 = i;
        }
    }

    public nb(vm0 vm0Var) {
        this.xqGvceK5x = vm0Var;
    }
}
