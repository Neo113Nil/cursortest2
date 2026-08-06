package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class em implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.fm oh71FJcDz6S2;

    public /* synthetic */ em(defpackage.fm fmVar, defpackage.rb1 rb1Var) {
        this.WDYagTQQm9ns = 3;
        this.oh71FJcDz6S2 = fmVar;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        boolean isText;
        int i = this.WDYagTQQm9ns;
        java.lang.StringBuilder sb = null;
        boolean z = true;
        defpackage.fm fmVar = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.o1 o1Var = (defpackage.o1) obj;
                defpackage.pw0 pw0Var = fmVar.IJ0hOnjhPOri.ZVVdXbWmyCSK;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                pw0Var.setValue(bool);
                fmVar.IJ0hOnjhPOri.BHfvd2J71qpO.setValue(bool);
                defpackage.hg0 hg0Var = fmVar.IJ0hOnjhPOri;
                isText = o1Var.ZpBGe2uQfcn8.isText();
                java.lang.CharSequence textValue = isText ? o1Var.ZpBGe2uQfcn8.getTextValue() : null;
                textValue.getClass();
                defpackage.fm.jVUAPb5NnIYW(hg0Var, (java.lang.String) textValue, fmVar.VFeft99leXEK, fmVar.oCu53ZX2v4Ju);
                return bool;
            case 1:
                java.util.List list = (java.util.List) obj;
                if (fmVar.IJ0hOnjhPOri.JhCgjQRTAOCT() != null) {
                    defpackage.cn1 JhCgjQRTAOCT = fmVar.IJ0hOnjhPOri.JhCgjQRTAOCT();
                    JhCgjQRTAOCT.getClass();
                    list.add(JhCgjQRTAOCT.ZpBGe2uQfcn8);
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                defpackage.fm.jVUAPb5NnIYW(fmVar.IJ0hOnjhPOri, ((defpackage.l6) obj).oh71FJcDz6S2, fmVar.VFeft99leXEK, fmVar.oCu53ZX2v4Ju);
                return java.lang.Boolean.TRUE;
            default:
                defpackage.l6 l6Var = (defpackage.l6) obj;
                if (fmVar.VFeft99leXEK || !fmVar.oCu53ZX2v4Ju) {
                    z = false;
                } else {
                    defpackage.wm1 wm1Var = fmVar.IJ0hOnjhPOri.WDYagTQQm9ns;
                    if (wm1Var != null) {
                        java.util.List oCu53ZX2v4Ju = defpackage.ma0.oCu53ZX2v4Ju(new defpackage.dx(), new defpackage.og(l6Var, 1));
                        defpackage.hg0 hg0Var2 = fmVar.IJ0hOnjhPOri;
                        defpackage.n80 n80Var = hg0Var2.JhCgjQRTAOCT;
                        defpackage.ql qlVar = hg0Var2.maCixPsq4ml2;
                        defpackage.nm1 fNwYGHIYeJcR = n80Var.fNwYGHIYeJcR(oCu53ZX2v4Ju);
                        wm1Var.ZpBGe2uQfcn8(null, fNwYGHIYeJcR);
                        qlVar.P05cfTpS5W5L(fNwYGHIYeJcR);
                    } else {
                        defpackage.nm1 nm1Var = fmVar.maCixPsq4ml2;
                        java.lang.String str = nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2;
                        long j = nm1Var.giKS3J6vZuNy;
                        int i2 = defpackage.in1.fWTAfUmVKrZq;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        l6Var.getClass();
                        if (i4 >= i3) {
                            sb = new java.lang.StringBuilder();
                            sb.append((java.lang.CharSequence) str, 0, i3);
                            sb.append((java.lang.CharSequence) l6Var);
                            sb.append((java.lang.CharSequence) str, i4, str.length());
                        } else {
                            defpackage.p81.giKS3J6vZuNy(i4, i3, ") is less than start index (", "End index (");
                        }
                        java.lang.String obj2 = sb.toString();
                        int length = l6Var.oh71FJcDz6S2.length() + ((int) (fmVar.maCixPsq4ml2.giKS3J6vZuNy >> 32));
                        fmVar.IJ0hOnjhPOri.maCixPsq4ml2.P05cfTpS5W5L(new defpackage.nm1(obj2, defpackage.j80.JhCgjQRTAOCT(length, length), 4));
                    }
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    public /* synthetic */ em(defpackage.fm fmVar, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = fmVar;
    }
}
