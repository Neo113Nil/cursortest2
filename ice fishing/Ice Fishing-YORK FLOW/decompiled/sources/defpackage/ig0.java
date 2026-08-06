package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ig0 {
    public defpackage.cu1 QiMR8OkAhezm;
    public defpackage.hg0 WDYagTQQm9ns;
    public final android.view.View ZpBGe2uQfcn8;
    public android.graphics.Rect fNwYGHIYeJcR;
    public final defpackage.n80 giKS3J6vZuNy;
    public final defpackage.dg0 h3m55N1URyyK;
    public defpackage.em1 oh71FJcDz6S2;
    public defpackage.y10 fWTAfUmVKrZq = new defpackage.awuGf4qH8HFd(17);
    public defpackage.y10 JhCgjQRTAOCT = new defpackage.awuGf4qH8HFd(18);
    public defpackage.nm1 P05cfTpS5W5L = new defpackage.nm1("", defpackage.in1.giKS3J6vZuNy, 4);
    public defpackage.o60 e6mdH7fiFuta = defpackage.o60.oh71FJcDz6S2;
    public final java.util.ArrayList GE9mJIPrb8gP = new java.util.ArrayList();
    public final defpackage.be0 Ns0WNyEWdPsk = defpackage.t80.oCu53ZX2v4Ju(defpackage.yf0.oh71FJcDz6S2, new defpackage.l3(16, this));

    public ig0(android.view.View view, defpackage.c2 c2Var, defpackage.n80 n80Var) {
        this.ZpBGe2uQfcn8 = view;
        this.giKS3J6vZuNy = n80Var;
        this.h3m55N1URyyK = new defpackage.dg0(c2Var, n80Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.p31 ZpBGe2uQfcn8(android.view.inputmethod.EditorInfo editorInfo) {
        int i;
        defpackage.p31 p31Var;
        int i2;
        int i3;
        defpackage.nm1 nm1Var = this.P05cfTpS5W5L;
        java.lang.String str = nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2;
        long j = nm1Var.giKS3J6vZuNy;
        defpackage.o60 o60Var = this.e6mdH7fiFuta;
        int i4 = o60Var.JhCgjQRTAOCT;
        int i5 = o60Var.fWTAfUmVKrZq;
        if (i4 == 1) {
            i = 0;
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                defpackage.h7.P05cfTpS5W5L("invalid ImeAction");
                return null;
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        defpackage.oi0 oi0Var = o60Var.WDYagTQQm9ns;
        if (defpackage.ma0.QiMR8OkAhezm(oi0Var, defpackage.oi0.QiMR8OkAhezm)) {
            editorInfo.hintLocales = null;
            p31Var = null;
        } else {
            p31Var = null;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(oi0Var, 10));
            java.util.Iterator it = oi0Var.WDYagTQQm9ns.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.ni0) it.next()).ZpBGe2uQfcn8);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    i2 = 2;
                } else if (i5 == 4) {
                    i2 = 3;
                } else if (i5 == 5) {
                    i2 = 17;
                } else if (i5 == 6) {
                    i2 = 33;
                } else if (i5 == 7) {
                    i2 = 129;
                } else if (i5 == 8) {
                    i2 = 18;
                } else {
                    if (i5 != 9) {
                        defpackage.h7.P05cfTpS5W5L("Invalid Keyboard Type");
                        return p31Var;
                    }
                    i2 = 8194;
                }
                editorInfo.inputType = i2;
                if ((i2 & 1) == 1) {
                    editorInfo.inputType = i2 | 131072;
                    if (o60Var.JhCgjQRTAOCT == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                    int i6 = o60Var.ZpBGe2uQfcn8;
                    if (i6 == 1) {
                        editorInfo.inputType = i3 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i3 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i3 | 16384;
                    }
                    if (o60Var.giKS3J6vZuNy) {
                        editorInfo.inputType |= 32768;
                    }
                }
                int i7 = defpackage.in1.fWTAfUmVKrZq;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                defpackage.la0.Mearx7yMn90V(editorInfo, str);
                editorInfo.imeOptions |= 33554432;
                if (defpackage.kh1.ZpBGe2uQfcn8 || i5 == 7 || i5 == 8) {
                    defpackage.la0.frSwwKIlbUhK(editorInfo, false);
                } else {
                    defpackage.la0.frSwwKIlbUhK(editorInfo, true);
                    editorInfo.setSupportedHandwritingGestures(defpackage.ma0.oCu53ZX2v4Ju(defpackage.y1.fNwYGHIYeJcR(), defpackage.y1.OcTWLQzke1i2(), defpackage.y1.IJ0hOnjhPOri(), defpackage.y1.oCu53ZX2v4Ju(), defpackage.y1.blKFvluuDQOf(), defpackage.y1.UmgHb6n58gfG(), defpackage.y1.qjMheFZ0l9kA()));
                    editorInfo.setSupportedHandwritingGesturePreviews(defpackage.y7.XuMcJunjB8iA(new java.lang.Class[]{defpackage.y1.fNwYGHIYeJcR(), defpackage.y1.OcTWLQzke1i2(), defpackage.y1.IJ0hOnjhPOri(), defpackage.y1.oCu53ZX2v4Ju()}));
                }
                defpackage.eg0 eg0Var = defpackage.fg0.ZpBGe2uQfcn8;
                if (defpackage.ju.JhCgjQRTAOCT()) {
                    defpackage.ju.ZpBGe2uQfcn8().QiMR8OkAhezm(editorInfo);
                }
                defpackage.p31 p31Var2 = new defpackage.p31(this.P05cfTpS5W5L, new defpackage.k0(11, this), this.e6mdH7fiFuta.giKS3J6vZuNy, this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm);
                this.GE9mJIPrb8gP.add(new java.lang.ref.WeakReference(p31Var2));
                return p31Var2;
            }
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if ((i2 & 1) == 1) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        int i72 = defpackage.in1.fWTAfUmVKrZq;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        defpackage.la0.Mearx7yMn90V(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (defpackage.kh1.ZpBGe2uQfcn8) {
        }
        defpackage.la0.frSwwKIlbUhK(editorInfo, false);
        defpackage.eg0 eg0Var2 = defpackage.fg0.ZpBGe2uQfcn8;
        if (defpackage.ju.JhCgjQRTAOCT()) {
        }
        defpackage.p31 p31Var22 = new defpackage.p31(this.P05cfTpS5W5L, new defpackage.k0(11, this), this.e6mdH7fiFuta.giKS3J6vZuNy, this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm);
        this.GE9mJIPrb8gP.add(new java.lang.ref.WeakReference(p31Var22));
        return p31Var22;
    }
}
