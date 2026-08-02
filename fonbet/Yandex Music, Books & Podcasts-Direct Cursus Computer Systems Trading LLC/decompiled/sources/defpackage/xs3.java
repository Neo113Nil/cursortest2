package defpackage;

/* loaded from: classes.dex */
public final class xs3 extends k9 {
    public final /* synthetic */ ys3 h;

    public xs3(ys3 ys3Var) {
        this.h = ys3Var;
    }

    @Override // defpackage.k9
    public final String i() {
        vs3 vs3Var = (vs3) this.h.a.get();
        if (vs3Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + vs3Var.a + "]";
    }
}
