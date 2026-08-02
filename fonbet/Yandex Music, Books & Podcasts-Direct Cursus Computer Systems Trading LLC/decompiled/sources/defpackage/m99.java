package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m99 implements gip, py7 {
    public final t6f a;

    public m99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l99 a(t7k t7kVar, JSONObject jSONObject) {
        return new l99(e5f.b(t7kVar, jSONObject, "image_url", vct.e, kzj.C, bcx.h), (kc8) etn.O(t7kVar, jSONObject, "insets", this.a.E));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, l99 l99Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = l99Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("image_url", b);
                } else {
                    jSONObject.put("image_url", ((Uri) b).toString());
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "insets", l99Var.b, this.a.E);
        etn.l0(t7kVar, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
