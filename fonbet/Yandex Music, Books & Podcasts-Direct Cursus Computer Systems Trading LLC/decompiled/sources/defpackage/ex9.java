package defpackage;

/* loaded from: classes3.dex */
public final class ex9 implements fx9 {
    public final k79 a;
    public boolean b;

    public ex9(k79 k79Var) {
        this.a = k79Var;
    }

    @Override // defpackage.fx9
    public final k79 getItem() {
        return this.a;
    }

    @Override // defpackage.fx9
    public final k79 q() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
