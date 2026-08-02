package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j99 implements u8s {
    public final t6f a;

    public j99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        c9c c9cVar = ((k99) d7fVar).a;
        t6f t6fVar = this.a;
        return new g99((jz8) h4a.D(t7kVar, c9cVar, jSONObject, "neighbour_page_width", t6fVar.H3, t6fVar.F3));
    }
}
