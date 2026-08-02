package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zkk implements zsq0, yey0 {
    public static blk c(yf90 yf90Var, blk blkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        wms wmsVar = wm11.a;
        return new blk(wcx.j(Q, jSONObject, "locale", wm11.c, i, blkVar != null ? blkVar.a : null, q5z.c, q5z.b), wcx.a(Q, jSONObject, "raw_text_variable", i, blkVar != null ? blkVar.b : null));
    }

    public static JSONObject d(yf90 yf90Var, blk blkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "locale", blkVar.a);
        wcx.t(yf90Var, jSONObject, "raw_text_variable", blkVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "currency");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (blk) obj);
    }
}
