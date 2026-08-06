package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jz0 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz0(java.lang.Object obj, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.GE9mJIPrb8gP = obj;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
            case 0:
                return ((defpackage.jz0) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
            default:
                ((defpackage.jz0) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
                return gs1Var;
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.GE9mJIPrb8gP;
        switch (i) {
            case 0:
                return new defpackage.jz0((defpackage.lz0) obj2, klVar, 0);
            default:
                return new defpackage.jz0((defpackage.n10) obj2, klVar, 1);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        java.lang.String str;
        android.view.textclassifier.TextClassificationContext build;
        android.view.textclassifier.TextClassifier createTextClassificationSession;
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.GE9mJIPrb8gP;
        switch (i) {
            case 0:
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.lz0 lz0Var = (defpackage.lz0) obj2;
                android.content.Context context = lz0Var.giKS3J6vZuNy;
                defpackage.ma1 ma1Var = lz0Var.fWTAfUmVKrZq;
                android.view.textclassifier.TextClassificationManager Ns0WNyEWdPsk = defpackage.jd.Ns0WNyEWdPsk(context.getSystemService(defpackage.jd.XntWc4eZSQ8j()));
                int ordinal = ma1Var.ordinal();
                if (ordinal == 0) {
                    str = "edittext";
                } else {
                    if (ordinal != 1) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return null;
                    }
                    str = "textview";
                }
                defpackage.mg1.QiMR8OkAhezm();
                build = defpackage.mg1.fWTAfUmVKrZq(context.getPackageName(), str).build();
                createTextClassificationSession = Ns0WNyEWdPsk.createTextClassificationSession(build);
                lz0Var.oh71FJcDz6S2 = createTextClassificationSession;
                return createTextClassificationSession;
            default:
                defpackage.b80.KrtOTfE6jiS2(obj);
                ((defpackage.n10) obj2).ZpBGe2uQfcn8();
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }
}
