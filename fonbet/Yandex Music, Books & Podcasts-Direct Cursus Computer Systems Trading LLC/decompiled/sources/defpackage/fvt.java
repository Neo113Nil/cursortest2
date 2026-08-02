package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fvt implements lod {
    public final /* synthetic */ evt a;
    public final /* synthetic */ String b;

    public fvt(evt evtVar, String str) {
        this.a = evtVar;
        this.b = str;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        rodVar.getClass();
        g3c g3cVar = rodVar.d;
        JSONObject jSONObject = rodVar.a;
        evt evtVar = this.a;
        if (g3cVar != null) {
            evtVar.a(g3cVar.b);
            return;
        }
        if (jSONObject == null) {
            xq0.q("Required value was null.");
            return;
        }
        ConcurrentHashMap concurrentHashMap = utm.a;
        String str = this.b;
        str.getClass();
        utm.a.put(str, jSONObject);
        evtVar.b(jSONObject);
    }
}
