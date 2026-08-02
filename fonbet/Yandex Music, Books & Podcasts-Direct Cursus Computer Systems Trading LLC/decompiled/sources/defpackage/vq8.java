package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vq8 implements u8s {
    public final t6f a;

    public vq8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sq8 a(t7k t7kVar, yq8 yq8Var, JSONObject jSONObject) {
        boolean z = yq8Var instanceof xq8;
        t6f t6fVar = this.a;
        if (z) {
            oq8 oq8Var = (oq8) t6fVar.c2.getValue();
            pq8 pq8Var = ((xq8) yq8Var).a;
            oq8Var.getClass();
            c9c c9cVar = pq8Var.a;
            t6f t6fVar2 = oq8Var.a;
            return new rq8(new lq8(h4a.J(t7kVar, c9cVar, jSONObject, "items", t6fVar2.f2, t6fVar2.d2, vq1.h)));
        }
        if (!(yq8Var instanceof wq8)) {
            b6e.s();
            return null;
        }
        iq8 iq8Var = (iq8) t6fVar.Z1.getValue();
        kq8 kq8Var = ((wq8) yq8Var).a;
        iq8Var.getClass();
        return new qq8(iq8.b(t7kVar, kq8Var, jSONObject));
    }
}
