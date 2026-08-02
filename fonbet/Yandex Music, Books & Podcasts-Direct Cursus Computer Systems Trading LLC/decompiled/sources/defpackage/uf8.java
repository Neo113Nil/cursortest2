package defpackage;

import android.net.Uri;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uf8 implements gip, py7 {
    public final t6f a;

    public uf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final tf8 a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.t1;
        return new tf8(etn.Y(t7kVar, jSONObject, "on_fail_actions", jyrVar), etn.Y(t7kVar, jSONObject, "on_success_actions", jyrVar), e5f.b(t7kVar, jSONObject, "url", vct.e, kzj.C, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, tf8 tf8Var) {
        JSONObject jSONObject = new JSONObject();
        List list = tf8Var.a;
        jyr jyrVar = this.a.t1;
        etn.n0(t7kVar, jSONObject, "on_fail_actions", list, jyrVar);
        etn.n0(t7kVar, jSONObject, "on_success_actions", tf8Var.b, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "download");
        szb szbVar = tf8Var.c;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put("url", b);
                return jSONObject;
            }
            jSONObject.put("url", ((Uri) b).toString());
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }
}
