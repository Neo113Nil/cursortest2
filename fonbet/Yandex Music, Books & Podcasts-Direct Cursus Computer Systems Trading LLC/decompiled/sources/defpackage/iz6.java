package defpackage;

/* loaded from: classes4.dex */
public final class iz6 implements gfu {
    public final es6 a;
    public final jek b;
    public final sdk c;
    public final bf d;
    public final tc1 e;

    public iz6(es6 es6Var, jek jekVar, sdk sdkVar, bf bfVar, tc1 tc1Var) {
        this.a = es6Var;
        this.b = jekVar;
        this.c = sdkVar;
        this.d = bfVar;
        this.e = tc1Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        if (!cls.equals(cz6.class)) {
            xq0.q("Unknown view model");
            return null;
        }
        return new cz6(this.a, this.b, this.c, this.d, this.e);
    }
}
