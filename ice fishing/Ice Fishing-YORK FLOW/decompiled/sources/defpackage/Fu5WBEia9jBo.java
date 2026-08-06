package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class Fu5WBEia9jBo extends defpackage.Jkfc0NcwyPL8 {
    public static defpackage.Fu5WBEia9jBo QiMR8OkAhezm;
    public static defpackage.Fu5WBEia9jBo WDYagTQQm9ns;
    public static defpackage.Fu5WBEia9jBo oh71FJcDz6S2;
    public java.lang.Object JhCgjQRTAOCT;
    public final /* synthetic */ int fWTAfUmVKrZq;
    public static final defpackage.a51 P05cfTpS5W5L = defpackage.a51.oh71FJcDz6S2;
    public static final defpackage.a51 e6mdH7fiFuta = defpackage.a51.WDYagTQQm9ns;

    public /* synthetic */ Fu5WBEia9jBo(int i) {
        this.fWTAfUmVKrZq = i;
    }

    public int GE9mJIPrb8gP(int i, defpackage.a51 a51Var) {
        defpackage.bn1 bn1Var = (defpackage.bn1) this.JhCgjQRTAOCT;
        if (bn1Var == null) {
            defpackage.ma0.hH0RRJrNssvh("layoutResult");
            throw null;
        }
        int oh71FJcDz6S22 = bn1Var.oh71FJcDz6S2(i);
        defpackage.bn1 bn1Var2 = (defpackage.bn1) this.JhCgjQRTAOCT;
        if (bn1Var2 == null) {
            defpackage.ma0.hH0RRJrNssvh("layoutResult");
            throw null;
        }
        defpackage.a51 QiMR8OkAhezm2 = bn1Var2.QiMR8OkAhezm(oh71FJcDz6S22);
        defpackage.bn1 bn1Var3 = (defpackage.bn1) this.JhCgjQRTAOCT;
        if (a51Var != QiMR8OkAhezm2) {
            if (bn1Var3 != null) {
                return bn1Var3.oh71FJcDz6S2(i);
            }
            defpackage.ma0.hH0RRJrNssvh("layoutResult");
            throw null;
        }
        if (bn1Var3 != null) {
            return bn1Var3.giKS3J6vZuNy.fWTAfUmVKrZq(i, false) - 1;
        }
        defpackage.ma0.hH0RRJrNssvh("layoutResult");
        throw null;
    }

    public void Ns0WNyEWdPsk(java.lang.String str) {
        switch (this.fWTAfUmVKrZq) {
            case 0:
                this.ZpBGe2uQfcn8 = str;
                java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    defpackage.ma0.hH0RRJrNssvh("impl");
                    throw null;
                }
            default:
                this.ZpBGe2uQfcn8 = str;
                java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    defpackage.ma0.hH0RRJrNssvh("impl");
                    throw null;
                }
        }
    }

    @Override // defpackage.Jkfc0NcwyPL8
    public final int[] ZpBGe2uQfcn8(int i) {
        int i2;
        switch (this.fWTAfUmVKrZq) {
            case 0:
                int length = fWTAfUmVKrZq().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (breakIterator == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            defpackage.ma0.hH0RRJrNssvh("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return giKS3J6vZuNy(i, following);
                    }
                    if (breakIterator2 == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (fWTAfUmVKrZq().length() <= 0 || i >= fWTAfUmVKrZq().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!h3m55N1URyyK(i) && (!h3m55N1URyyK(i) || (i != 0 && h3m55N1URyyK(i - 1)))) {
                    java.text.BreakIterator breakIterator3 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (breakIterator3 == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator4 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                if (breakIterator4 == null) {
                    defpackage.ma0.hH0RRJrNssvh("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !fNwYGHIYeJcR(following2)) {
                    return null;
                }
                return giKS3J6vZuNy(i, following2);
            default:
                if (fWTAfUmVKrZq().length() <= 0 || i >= fWTAfUmVKrZq().length()) {
                    return null;
                }
                defpackage.bn1 bn1Var = (defpackage.bn1) this.JhCgjQRTAOCT;
                defpackage.a51 a51Var = P05cfTpS5W5L;
                if (i < 0) {
                    if (bn1Var == null) {
                        defpackage.ma0.hH0RRJrNssvh("layoutResult");
                        throw null;
                    }
                    i2 = bn1Var.giKS3J6vZuNy.JhCgjQRTAOCT(0);
                } else {
                    if (bn1Var == null) {
                        defpackage.ma0.hH0RRJrNssvh("layoutResult");
                        throw null;
                    }
                    int JhCgjQRTAOCT = bn1Var.giKS3J6vZuNy.JhCgjQRTAOCT(i);
                    i2 = GE9mJIPrb8gP(JhCgjQRTAOCT, a51Var) == i ? JhCgjQRTAOCT : JhCgjQRTAOCT + 1;
                }
                defpackage.bn1 bn1Var2 = (defpackage.bn1) this.JhCgjQRTAOCT;
                if (bn1Var2 == null) {
                    defpackage.ma0.hH0RRJrNssvh("layoutResult");
                    throw null;
                }
                if (i2 >= bn1Var2.giKS3J6vZuNy.oh71FJcDz6S2) {
                    return null;
                }
                return giKS3J6vZuNy(GE9mJIPrb8gP(i2, a51Var), GE9mJIPrb8gP(i2, e6mdH7fiFuta) + 1);
        }
    }

    @Override // defpackage.Jkfc0NcwyPL8
    public final int[] e6mdH7fiFuta(int i) {
        int i2;
        switch (this.fWTAfUmVKrZq) {
            case 0:
                int length = fWTAfUmVKrZq().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    java.text.BreakIterator breakIterator = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (breakIterator == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    java.text.BreakIterator breakIterator2 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            defpackage.ma0.hH0RRJrNssvh("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return giKS3J6vZuNy(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = fWTAfUmVKrZq().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !h3m55N1URyyK(i - 1) && !fNwYGHIYeJcR(i)) {
                    java.text.BreakIterator breakIterator3 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                    if (breakIterator3 == null) {
                        defpackage.ma0.hH0RRJrNssvh("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator4 = (java.text.BreakIterator) this.JhCgjQRTAOCT;
                if (breakIterator4 == null) {
                    defpackage.ma0.hH0RRJrNssvh("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !h3m55N1URyyK(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h3m55N1URyyK(preceding2 - 1)) {
                    return giKS3J6vZuNy(preceding2, i);
                }
                return null;
            default:
                if (fWTAfUmVKrZq().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = fWTAfUmVKrZq().length();
                defpackage.bn1 bn1Var = (defpackage.bn1) this.JhCgjQRTAOCT;
                defpackage.a51 a51Var = e6mdH7fiFuta;
                if (i > length3) {
                    if (bn1Var == null) {
                        defpackage.ma0.hH0RRJrNssvh("layoutResult");
                        throw null;
                    }
                    i2 = bn1Var.giKS3J6vZuNy.JhCgjQRTAOCT(fWTAfUmVKrZq().length());
                } else {
                    if (bn1Var == null) {
                        defpackage.ma0.hH0RRJrNssvh("layoutResult");
                        throw null;
                    }
                    int JhCgjQRTAOCT = bn1Var.giKS3J6vZuNy.JhCgjQRTAOCT(i);
                    i2 = GE9mJIPrb8gP(JhCgjQRTAOCT, a51Var) + 1 == i ? JhCgjQRTAOCT : JhCgjQRTAOCT - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return giKS3J6vZuNy(GE9mJIPrb8gP(i2, P05cfTpS5W5L), GE9mJIPrb8gP(i2, a51Var) + 1);
        }
    }

    public boolean fNwYGHIYeJcR(int i) {
        if (i <= 0 || !h3m55N1URyyK(i - 1)) {
            return false;
        }
        return i == fWTAfUmVKrZq().length() || !h3m55N1URyyK(i);
    }

    public boolean h3m55N1URyyK(int i) {
        if (i < 0 || i >= fWTAfUmVKrZq().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(fWTAfUmVKrZq().codePointAt(i));
    }
}
