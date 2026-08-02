package defpackage;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cz6 extends bfu {
    public final es6 k;
    public final jek l;
    public final sdk m;
    public final bf n;
    public final tc1 o;
    public final voi p;
    public final voi q;
    public final voi r;
    public final voi s;
    public final voi t;
    public final voi u;
    public hz6 v;
    public qds w;
    public f2a x;

    public cz6(es6 es6Var, jek jekVar, sdk sdkVar, bf bfVar, tc1 tc1Var) {
        this.k = es6Var;
        this.l = jekVar;
        this.m = sdkVar;
        this.n = bfVar;
        this.o = tc1Var;
        voi voiVar = new voi();
        this.p = voiVar;
        voi voiVar2 = new voi();
        this.q = voiVar2;
        this.r = voiVar;
        this.s = voiVar2;
        voi voiVar3 = new voi();
        this.t = voiVar3;
        this.u = voiVar3;
    }

    public static final void a(cz6 cz6Var, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
        JSONObject jSONObject3 = jSONObject.getJSONObject("card");
        voi voiVar = cz6Var.p;
        jSONObject2.getClass();
        jSONObject3.getClass();
        voiVar.m(new xy6(new tv8(jSONObject2, jSONObject3, c5b.a)));
    }
}
