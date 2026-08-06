package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kz0 extends defpackage.mi1 implements defpackage.c20 {
    public defpackage.lz0 GE9mJIPrb8gP;
    public java.lang.CharSequence Ns0WNyEWdPsk;
    public final /* synthetic */ java.lang.CharSequence T1fB7bDYiVJQ;
    public final /* synthetic */ defpackage.lz0 WmetiUbpKU9I;
    public final /* synthetic */ long XntWc4eZSQ8j;
    public defpackage.to0 e6mdH7fiFuta;
    public long fNwYGHIYeJcR;
    public /* synthetic */ java.lang.Object gUjdnLbkVAaA;
    public int h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(long j, defpackage.kl klVar, defpackage.lz0 lz0Var, java.lang.CharSequence charSequence) {
        super(2, klVar);
        this.T1fB7bDYiVJQ = charSequence;
        this.XntWc4eZSQ8j = j;
        this.WmetiUbpKU9I = lz0Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.kz0) XntWc4eZSQ8j((defpackage.kl) obj2, defpackage.jd.fNwYGHIYeJcR(obj))).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.kz0 kz0Var = new defpackage.kz0(this.XntWc4eZSQ8j, klVar, this.WmetiUbpKU9I, this.T1fB7bDYiVJQ);
        kz0Var.gUjdnLbkVAaA = obj;
        return kz0Var;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        android.view.textclassifier.TextSelection.Request.Builder defaultLocales;
        android.view.textclassifier.TextSelection.Request build;
        android.view.textclassifier.TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j;
        android.view.textclassifier.TextClassification textClassification;
        defpackage.to0 to0Var;
        android.view.textclassifier.TextSelection textSelection;
        java.lang.CharSequence charSequence;
        defpackage.lz0 lz0Var;
        android.view.textclassifier.TextClassification textClassification2;
        int i = this.h3m55N1URyyK;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            android.view.textclassifier.TextClassifier fNwYGHIYeJcR = defpackage.jd.fNwYGHIYeJcR(this.gUjdnLbkVAaA);
            defpackage.NkfcFfdaVTox.oCu53ZX2v4Ju();
            long j2 = this.XntWc4eZSQ8j;
            int oh71FJcDz6S2 = defpackage.in1.oh71FJcDz6S2(j2);
            int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(j2);
            java.lang.CharSequence charSequence2 = this.T1fB7bDYiVJQ;
            android.view.textclassifier.TextSelection.Request.Builder Ns0WNyEWdPsk = defpackage.NkfcFfdaVTox.Ns0WNyEWdPsk(charSequence2, oh71FJcDz6S2, WDYagTQQm9ns);
            defpackage.lz0 lz0Var2 = this.WmetiUbpKU9I;
            defaultLocales = Ns0WNyEWdPsk.setDefaultLocales(lz0Var2.giKS3J6vZuNy());
            int i2 = android.os.Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = fNwYGHIYeJcR.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long JhCgjQRTAOCT = defpackage.j80.JhCgjQRTAOCT(selectionStartIndex, selectionEndIndex);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    to0Var = lz0Var2.WDYagTQQm9ns;
                    this.gUjdnLbkVAaA = suggestSelection;
                    this.e6mdH7fiFuta = to0Var;
                    this.GE9mJIPrb8gP = lz0Var2;
                    this.Ns0WNyEWdPsk = charSequence2;
                    this.fNwYGHIYeJcR = JhCgjQRTAOCT;
                    this.h3m55N1URyyK = 1;
                    if (to0Var.JhCgjQRTAOCT(this) != tmVar) {
                        textSelection = suggestSelection;
                        charSequence = charSequence2;
                        lz0Var = lz0Var2;
                        j = JhCgjQRTAOCT;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        lz0Var.QiMR8OkAhezm.setValue(new defpackage.xj1(charSequence, j, textClassification2));
                    }
                    return tmVar;
                }
            }
            this.fNwYGHIYeJcR = JhCgjQRTAOCT;
            this.h3m55N1URyyK = 2;
            if (defpackage.lz0.ZpBGe2uQfcn8(this.WmetiUbpKU9I, this.T1fB7bDYiVJQ, JhCgjQRTAOCT, fNwYGHIYeJcR, this) != tmVar) {
                j = JhCgjQRTAOCT;
            }
            return tmVar;
        }
        if (i == 1) {
            j = this.fNwYGHIYeJcR;
            charSequence = this.Ns0WNyEWdPsk;
            lz0Var = this.GE9mJIPrb8gP;
            to0Var = this.e6mdH7fiFuta;
            textSelection = defpackage.jd.h3m55N1URyyK(this.gUjdnLbkVAaA);
            defpackage.b80.KrtOTfE6jiS2(obj);
            try {
                textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                lz0Var.QiMR8OkAhezm.setValue(new defpackage.xj1(charSequence, j, textClassification2));
            } finally {
                to0Var.giKS3J6vZuNy(null);
            }
        } else {
            if (i != 2) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.fNwYGHIYeJcR;
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        return new defpackage.in1(j);
    }
}
