package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l4 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(int i, defpackage.kl klVar, int i2) {
        super(i, klVar);
        this.e6mdH7fiFuta = i2;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                return ((defpackage.l4) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(gs1Var);
            default:
                ((defpackage.l4) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.tx) obj)).s0TASMVLSWD5(gs1Var);
                return gs1Var;
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                return new defpackage.l4(2, klVar, 0);
            default:
                return new defpackage.l4(2, klVar, 1);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                defpackage.b80.KrtOTfE6jiS2(obj);
                return android.view.Choreographer.getInstance();
            default:
                defpackage.b80.KrtOTfE6jiS2(obj);
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }
}
