package defpackage;

/* loaded from: classes.dex */
public final class AsxAYCCkb3Hi extends defpackage.wKlPRKlRnfqr {
    public static defpackage.AsxAYCCkb3Hi AARZUJiTa;
    public static defpackage.AsxAYCCkb3Hi adDC3e2L;
    public static defpackage.AsxAYCCkb3Hi xiZrDbcSW0;
    public java.lang.Object F7NU4MC0GW;
    public final /* synthetic */ int r1MBDhnF;
    public static final defpackage.l11 EXtogiMhuM = defpackage.l11.xiZrDbcSW0;
    public static final defpackage.l11 riuEU0zW4 = defpackage.l11.adDC3e2L;

    public /* synthetic */ AsxAYCCkb3Hi(int i) {
        this.r1MBDhnF = i;
    }

    public boolean AARZUJiTa(int i) {
        if (i <= 0 || !EXtogiMhuM(i - 1)) {
            return false;
        }
        return i == r1MBDhnF().length() || !EXtogiMhuM(i);
    }

    public boolean EXtogiMhuM(int i) {
        if (i < 0 || i >= r1MBDhnF().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(r1MBDhnF().codePointAt(i));
    }

    @Override // defpackage.wKlPRKlRnfqr
    public final int[] F7NU4MC0GW(int i) {
        int i2;
        switch (this.r1MBDhnF) {
            case 0:
                int length = r1MBDhnF().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (breakIterator == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            defpackage.x70.Ye0N2xE9Hc("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return oh6vYeIP(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = r1MBDhnF().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !EXtogiMhuM(i - 1) && !AARZUJiTa(i)) {
                    java.text.BreakIterator breakIterator3 = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (breakIterator3 == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator4 = (java.text.BreakIterator) this.F7NU4MC0GW;
                if (breakIterator4 == null) {
                    defpackage.x70.Ye0N2xE9Hc("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !EXtogiMhuM(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !EXtogiMhuM(preceding2 - 1)) {
                    return oh6vYeIP(preceding2, i);
                }
                return null;
            default:
                if (r1MBDhnF().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = r1MBDhnF().length();
                defpackage.rf1 rf1Var = (defpackage.rf1) this.F7NU4MC0GW;
                defpackage.l11 l11Var = riuEU0zW4;
                if (i > length3) {
                    if (rf1Var == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    i2 = rf1Var.IHQe1A4L2xu(r1MBDhnF().length());
                } else {
                    if (rf1Var == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    int IHQe1A4L2xu = rf1Var.IHQe1A4L2xu(i);
                    i2 = adDC3e2L(IHQe1A4L2xu, l11Var) + 1 == i ? IHQe1A4L2xu : IHQe1A4L2xu - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return oh6vYeIP(adDC3e2L(i2, EXtogiMhuM), adDC3e2L(i2, l11Var) + 1);
        }
    }

    @Override // defpackage.wKlPRKlRnfqr
    public final int[] IHQe1A4L2xu(int i) {
        int i2;
        switch (this.r1MBDhnF) {
            case 0:
                int length = r1MBDhnF().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (breakIterator == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            defpackage.x70.Ye0N2xE9Hc("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return oh6vYeIP(i, following);
                    }
                    if (breakIterator2 == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (r1MBDhnF().length() <= 0 || i >= r1MBDhnF().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!EXtogiMhuM(i) && (!EXtogiMhuM(i) || (i != 0 && EXtogiMhuM(i - 1)))) {
                    java.text.BreakIterator breakIterator3 = (java.text.BreakIterator) this.F7NU4MC0GW;
                    if (breakIterator3 == null) {
                        defpackage.x70.Ye0N2xE9Hc("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator4 = (java.text.BreakIterator) this.F7NU4MC0GW;
                if (breakIterator4 == null) {
                    defpackage.x70.Ye0N2xE9Hc("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !AARZUJiTa(following2)) {
                    return null;
                }
                return oh6vYeIP(i, following2);
            default:
                if (r1MBDhnF().length() <= 0 || i >= r1MBDhnF().length()) {
                    return null;
                }
                defpackage.rf1 rf1Var = (defpackage.rf1) this.F7NU4MC0GW;
                defpackage.l11 l11Var = EXtogiMhuM;
                if (i < 0) {
                    if (rf1Var == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    i2 = rf1Var.IHQe1A4L2xu(0);
                } else {
                    if (rf1Var == null) {
                        defpackage.x70.Ye0N2xE9Hc("layoutResult");
                        throw null;
                    }
                    int IHQe1A4L2xu = rf1Var.IHQe1A4L2xu(i);
                    i2 = adDC3e2L(IHQe1A4L2xu, l11Var) == i ? IHQe1A4L2xu : IHQe1A4L2xu + 1;
                }
                defpackage.rf1 rf1Var2 = (defpackage.rf1) this.F7NU4MC0GW;
                if (rf1Var2 == null) {
                    defpackage.x70.Ye0N2xE9Hc("layoutResult");
                    throw null;
                }
                if (i2 >= rf1Var2.oh6vYeIP.oh6vYeIP) {
                    return null;
                }
                return oh6vYeIP(adDC3e2L(i2, l11Var), adDC3e2L(i2, riuEU0zW4) + 1);
        }
    }

    public int adDC3e2L(int i, defpackage.l11 l11Var) {
        defpackage.rf1 rf1Var = (defpackage.rf1) this.F7NU4MC0GW;
        if (rf1Var == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        int r1MBDhnF = rf1Var.r1MBDhnF(i);
        defpackage.rf1 rf1Var2 = (defpackage.rf1) this.F7NU4MC0GW;
        if (rf1Var2 == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        defpackage.l11 adDC3e2L2 = rf1Var2.adDC3e2L(r1MBDhnF);
        defpackage.rf1 rf1Var3 = (defpackage.rf1) this.F7NU4MC0GW;
        if (l11Var != adDC3e2L2) {
            if (rf1Var3 != null) {
                return rf1Var3.r1MBDhnF(i);
            }
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        if (rf1Var3 == null) {
            defpackage.x70.Ye0N2xE9Hc("layoutResult");
            throw null;
        }
        defpackage.nk0 nk0Var = rf1Var3.oh6vYeIP;
        nk0Var.oh6vYeIP(i);
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.t2 t2Var = ((defpackage.gt0) arrayList.get(defpackage.f70.JlrlGoKF(i, arrayList))).IHQe1A4L2xu;
        return (t2Var.F7NU4MC0GW.adDC3e2L(i - r4.F7NU4MC0GW) + r4.oh6vYeIP) - 1;
    }

    public void xiZrDbcSW0(java.lang.String str) {
        switch (this.r1MBDhnF) {
            case 0:
                this.IHQe1A4L2xu = str;
                java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.F7NU4MC0GW;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    defpackage.x70.Ye0N2xE9Hc("impl");
                    throw null;
                }
            default:
                this.IHQe1A4L2xu = str;
                java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.F7NU4MC0GW;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    defpackage.x70.Ye0N2xE9Hc("impl");
                    throw null;
                }
        }
    }
}
