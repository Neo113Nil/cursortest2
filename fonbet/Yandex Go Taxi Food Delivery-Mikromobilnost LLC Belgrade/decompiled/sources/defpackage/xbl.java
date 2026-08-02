package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xbl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public xbl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final acl c(yf90 yf90Var, acl aclVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new acl(wcx.i(Q, jSONObject, "item_spacing", i, aclVar != null ? aclVar.a : null, this.a.F3), wcx.j(Q, jSONObject, "max_visible_items", wm11.b, i, aclVar != null ? aclVar.b : null, b.h, zbl.c));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, acl aclVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "item_spacing", aclVar.a, this.a.F3);
        wcx.q(yf90Var, jSONObject, "max_visible_items", aclVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "stretch");
        return jSONObject;
    }
}
