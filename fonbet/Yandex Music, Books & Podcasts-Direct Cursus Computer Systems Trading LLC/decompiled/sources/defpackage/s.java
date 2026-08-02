package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s implements lod {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ s(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.a;
        rodVar.getClass();
        switch (i) {
            case 0:
                try {
                    if (rodVar.d == null && (jSONObject = rodVar.a) != null && jSONObject.getBoolean("success")) {
                        Iterator it = this.b.iterator();
                        while (it.hasNext()) {
                            zsd.Z(((dpe) it.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                try {
                    if (rodVar.d == null && (jSONObject2 = rodVar.a) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = this.b.iterator();
                        while (it2.hasNext()) {
                            zsd.Z(((dpe) it2.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
