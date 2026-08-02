package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hym implements u8s {
    public final t6f a;

    public hym(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cym a(t7k t7kVar, iym iymVar, JSONObject jSONObject) {
        szb F = h4a.F(t7kVar, iymVar.a, jSONObject, "get", vct.c);
        c9c c9cVar = iymVar.b;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        String str = (String) h4a.C(c9cVar, jSONObject, "name", s3fVar, ns9Var);
        String str2 = (String) h4a.L(iymVar.c, t7kVar, "new_value_variable_name", s3fVar, jSONObject);
        if (str2 == null) {
            str2 = "new_value";
        }
        c9c c9cVar2 = iymVar.d;
        t6f t6fVar = this.a;
        return new cym(F, str, str2, h4a.V(t7kVar, c9cVar2, jSONObject, "set", t6fVar.v1, t6fVar.t1), (nx8) h4a.C(iymVar.e, jSONObject, "value_type", vv8.v, ns9Var));
    }
}
