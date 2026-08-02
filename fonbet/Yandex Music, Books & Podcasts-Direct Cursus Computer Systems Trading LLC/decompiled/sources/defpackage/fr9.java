package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fr9 implements gip, py7 {
    public final t6f a;

    public fr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        return new pq9(e5f.b(t7kVar, jSONObject, "text", vct.c, bcx.i, bcx.h), etn.Y(t7kVar, jSONObject, "actions", t6fVar.t1), etn.Y(t7kVar, jSONObject, "images", t6fVar.S8), etn.Y(t7kVar, jSONObject, "ranges", t6fVar.P8));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pq9 pq9Var) {
        JSONObject jSONObject = new JSONObject();
        List list = pq9Var.a;
        t6f t6fVar = this.a;
        etn.n0(t7kVar, jSONObject, "actions", list, t6fVar.t1);
        etn.n0(t7kVar, jSONObject, "images", pq9Var.b, t6fVar.S8);
        etn.n0(t7kVar, jSONObject, "ranges", pq9Var.c, t6fVar.P8);
        e5f.g(t7kVar, jSONObject, "text", pq9Var.d);
        return jSONObject;
    }
}
