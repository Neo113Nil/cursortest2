package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rqt implements gip, py7 {
    public static qqt c(t7k t7kVar, JSONObject jSONObject) {
        return new qqt(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.e, kzj.C, bcx.h), (String) etn.P("name", jSONObject));
    }

    public static JSONObject d(t7k t7kVar, qqt qqtVar) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", qqtVar.a);
        etn.l0(t7kVar, jSONObject, "type", "url");
        szb szbVar = qqtVar.b;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put(Constants.KEY_VALUE, b);
                return jSONObject;
            }
            jSONObject.put(Constants.KEY_VALUE, ((Uri) b).toString());
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (qqt) obj);
    }
}
