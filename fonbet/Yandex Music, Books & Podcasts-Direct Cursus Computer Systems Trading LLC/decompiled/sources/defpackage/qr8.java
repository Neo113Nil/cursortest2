package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qr8 implements gip, py7 {
    public final t6f a;

    public qr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        szb a = e5f.a(t7kVar, jSONObject, "data", vct.g);
        Object opt = jSONObject.opt("data_element_name");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        if (str == null) {
            str = "it";
        }
        return new pr8(a, str, etn.S(t7kVar, jSONObject, "prototypes", this.a.p2, vq2.o));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pr8 pr8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "data", pr8Var.a);
        etn.l0(t7kVar, jSONObject, "data_element_name", pr8Var.b);
        etn.n0(t7kVar, jSONObject, "prototypes", pr8Var.c, this.a.p2);
        return jSONObject;
    }
}
