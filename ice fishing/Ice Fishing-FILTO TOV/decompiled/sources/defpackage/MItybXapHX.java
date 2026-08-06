package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class MItybXapHX extends J3Xc8BaqpN8 {
    public static MItybXapHX AvO7iQsrTN;
    public static MItybXapHX EljAMC1QTz;
    public static MItybXapHX OOA6hdeuvCS;
    public static final pu0 encWxUiV2 = pu0.EljAMC1QTz;
    public static final pu0 mOu10nynGul = pu0.OOA6hdeuvCS;
    public final /* synthetic */ int X1lG3V04pd;
    public Object xqGvceK5x;

    public /* synthetic */ MItybXapHX(int i) {
        this.X1lG3V04pd = i;
    }

    public boolean AvO7iQsrTN(int i) {
        if (i <= 0 || !encWxUiV2(i - 1)) {
            return false;
        }
        return i == X1lG3V04pd().length() || !encWxUiV2(i);
    }

    public void EljAMC1QTz(String str) {
        switch (this.X1lG3V04pd) {
            case 0:
                this.GWasM1elztuh = str;
                BreakIterator breakIterator = (BreakIterator) this.xqGvceK5x;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    o30.YXi2hvwn7WL("impl");
                    throw null;
                }
            default:
                this.GWasM1elztuh = str;
                BreakIterator breakIterator2 = (BreakIterator) this.xqGvceK5x;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    o30.YXi2hvwn7WL("impl");
                    throw null;
                }
        }
    }

    @Override // defpackage.J3Xc8BaqpN8
    public final int[] GWasM1elztuh(int i) {
        int i2;
        switch (this.X1lG3V04pd) {
            case 0:
                int length = X1lG3V04pd().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.xqGvceK5x;
                    if (breakIterator == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.xqGvceK5x;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            o30.YXi2hvwn7WL("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return Yi7zF1RB1(i, following);
                    }
                    if (breakIterator2 == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (X1lG3V04pd().length() <= 0 || i >= X1lG3V04pd().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!encWxUiV2(i) && (!encWxUiV2(i) || (i != 0 && encWxUiV2(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.xqGvceK5x;
                    if (breakIterator3 == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.xqGvceK5x;
                if (breakIterator4 == null) {
                    o30.YXi2hvwn7WL("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !AvO7iQsrTN(following2)) {
                    return null;
                }
                return Yi7zF1RB1(i, following2);
            default:
                if (X1lG3V04pd().length() <= 0 || i >= X1lG3V04pd().length()) {
                    return null;
                }
                m81 m81Var = (m81) this.xqGvceK5x;
                pu0 pu0Var = encWxUiV2;
                if (i < 0) {
                    if (m81Var == null) {
                        o30.YXi2hvwn7WL("layoutResult");
                        throw null;
                    }
                    i2 = m81Var.GWasM1elztuh(0);
                } else {
                    if (m81Var == null) {
                        o30.YXi2hvwn7WL("layoutResult");
                        throw null;
                    }
                    int GWasM1elztuh = m81Var.GWasM1elztuh(i);
                    i2 = OOA6hdeuvCS(GWasM1elztuh, pu0Var) == i ? GWasM1elztuh : GWasM1elztuh + 1;
                }
                m81 m81Var2 = (m81) this.xqGvceK5x;
                if (m81Var2 == null) {
                    o30.YXi2hvwn7WL("layoutResult");
                    throw null;
                }
                if (i2 >= m81Var2.Yi7zF1RB1.Yi7zF1RB1) {
                    return null;
                }
                return Yi7zF1RB1(OOA6hdeuvCS(i2, pu0Var), OOA6hdeuvCS(i2, mOu10nynGul) + 1);
        }
    }

    public int OOA6hdeuvCS(int i, pu0 pu0Var) {
        m81 m81Var = (m81) this.xqGvceK5x;
        if (m81Var == null) {
            o30.YXi2hvwn7WL("layoutResult");
            throw null;
        }
        int X1lG3V04pd = m81Var.X1lG3V04pd(i);
        m81 m81Var2 = (m81) this.xqGvceK5x;
        if (m81Var2 == null) {
            o30.YXi2hvwn7WL("layoutResult");
            throw null;
        }
        pu0 OOA6hdeuvCS2 = m81Var2.OOA6hdeuvCS(X1lG3V04pd);
        m81 m81Var3 = (m81) this.xqGvceK5x;
        if (pu0Var != OOA6hdeuvCS2) {
            if (m81Var3 != null) {
                return m81Var3.X1lG3V04pd(i);
            }
            o30.YXi2hvwn7WL("layoutResult");
            throw null;
        }
        if (m81Var3 == null) {
            o30.YXi2hvwn7WL("layoutResult");
            throw null;
        }
        hf0 hf0Var = m81Var3.Yi7zF1RB1;
        hf0Var.Yi7zF1RB1(i);
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        c1 c1Var = ((un0) arrayList.get(l60.uFEq9NpZ(i, arrayList))).GWasM1elztuh;
        return (c1Var.xqGvceK5x.OOA6hdeuvCS(i - r4.xqGvceK5x) + r4.Yi7zF1RB1) - 1;
    }

    public boolean encWxUiV2(int i) {
        if (i < 0 || i >= X1lG3V04pd().length()) {
            return false;
        }
        return Character.isLetterOrDigit(X1lG3V04pd().codePointAt(i));
    }

    @Override // defpackage.J3Xc8BaqpN8
    public final int[] xqGvceK5x(int i) {
        int i2;
        switch (this.X1lG3V04pd) {
            case 0:
                int length = X1lG3V04pd().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.xqGvceK5x;
                    if (breakIterator == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.xqGvceK5x;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            o30.YXi2hvwn7WL("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return Yi7zF1RB1(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = X1lG3V04pd().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !encWxUiV2(i - 1) && !AvO7iQsrTN(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.xqGvceK5x;
                    if (breakIterator3 == null) {
                        o30.YXi2hvwn7WL("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.xqGvceK5x;
                if (breakIterator4 == null) {
                    o30.YXi2hvwn7WL("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !encWxUiV2(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !encWxUiV2(preceding2 - 1)) {
                    return Yi7zF1RB1(preceding2, i);
                }
                return null;
            default:
                if (X1lG3V04pd().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = X1lG3V04pd().length();
                m81 m81Var = (m81) this.xqGvceK5x;
                pu0 pu0Var = mOu10nynGul;
                if (i > length3) {
                    if (m81Var == null) {
                        o30.YXi2hvwn7WL("layoutResult");
                        throw null;
                    }
                    i2 = m81Var.GWasM1elztuh(X1lG3V04pd().length());
                } else {
                    if (m81Var == null) {
                        o30.YXi2hvwn7WL("layoutResult");
                        throw null;
                    }
                    int GWasM1elztuh = m81Var.GWasM1elztuh(i);
                    i2 = OOA6hdeuvCS(GWasM1elztuh, pu0Var) + 1 == i ? GWasM1elztuh : GWasM1elztuh - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return Yi7zF1RB1(OOA6hdeuvCS(i2, encWxUiV2), OOA6hdeuvCS(i2, pu0Var) + 1);
        }
    }
}
