package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mqt implements gip, py7 {
    public static lqt c(t7k t7kVar, JSONObject jSONObject) {
        return new lqt(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.e, kzj.C, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, lqt lqtVar) {
        JSONObject w = ouj.w(t7kVar, "type", "url");
        szb szbVar = lqtVar.a;
        if (szbVar == null) {
            return w;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                w.put(Constants.KEY_VALUE, b);
                return w;
            }
            w.put(Constants.KEY_VALUE, ((Uri) b).toString());
            return w;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return w;
        }
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (lqt) obj);
    }
}
