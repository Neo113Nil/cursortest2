package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qa implements lod {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.a) {
            case 0:
                ma maVar = (ma) this.b;
                rodVar.getClass();
                JSONObject jSONObject3 = rodVar.a;
                if (jSONObject3 != null) {
                    maVar.c = jSONObject3.optString("access_token");
                    maVar.a = jSONObject3.optInt("expires_at");
                    maVar.b = jSONObject3.optInt("expires_in");
                    maVar.e = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    maVar.d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                j18 j18Var = (j18) this.b;
                g3c g3cVar = rodVar.d;
                if (g3cVar != null) {
                    j18Var.z(g3cVar);
                    break;
                } else {
                    JSONObject jSONObject4 = rodVar.c;
                    i18 i18Var = new i18();
                    try {
                        i18Var.a = jSONObject4.getString("user_code");
                        i18Var.b = jSONObject4.getLong("expires_in");
                        j18Var.A(i18Var);
                        break;
                    } catch (JSONException unused) {
                        j18Var.z(new g3c(0, "", "Malformed server response"));
                        return;
                    }
                }
            case 2:
                rodVar.getClass();
                try {
                    if (rodVar.d == null && (jSONObject = rodVar.a) != null && jSONObject.getBoolean("success")) {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (it.hasNext()) {
                            zsd.Z(((mgb) it.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
            default:
                rodVar.getClass();
                try {
                    if (rodVar.d == null && (jSONObject2 = rodVar.a) != null && jSONObject2.getBoolean("success")) {
                        zsd.Z(((dpe) this.b).a);
                        break;
                    }
                } catch (JSONException unused3) {
                    return;
                }
                break;
        }
    }
}
