package defpackage;

import android.net.Uri;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.json.expressions.Expression;
import java.util.Map;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class z6k extends y6k {
    public final Map a;
    public final a b;

    public z6k(Map map, a aVar) {
        this.a = map;
        this.b = aVar;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        if (super.handleAction(f9lVar, fplVar, rvoVar)) {
            return true;
        }
        Expression url = f9lVar.getUrl();
        Uri uri = url != null ? (Uri) url.a(rvoVar) : null;
        String host = uri != null ? uri.getHost() : null;
        JSONObject payload = f9lVar.getPayload();
        Map e = payload != null ? ibb1.e(payload) : null;
        if (e == null) {
            e = b.f();
        }
        return handleCustomActionInternal(host, rvoVar, e, f9lVar.e(), fplVar);
    }

    public final boolean handleCustomActionInternal(String str, rvo rvoVar, Map map, String str2, fpl fplVar) {
        if (str == null || !this.a.keySet().contains(str)) {
            return false;
        }
        w3k w3kVar = new w3k(map, str);
        yzh yzhVar = new yzh(rvoVar);
        Map map2 = this.a;
        v920 v920Var = new v920(map2, yzhVar, fplVar, rvoVar, this, str2);
        w6k w6kVar = (w6k) map2.get(str);
        if (w6kVar == null) {
            return true;
        }
        w6kVar.a(v920Var, w3kVar, yzhVar);
        return true;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        if (super.handleAction(v3kVar, fplVar, rvoVar)) {
            return true;
        }
        Expression expression = v3kVar.k;
        Uri uri = expression != null ? (Uri) expression.a(rvoVar) : null;
        String host = uri != null ? uri.getHost() : null;
        JSONObject jSONObject = v3kVar.f;
        Map e = jSONObject != null ? ibb1.e(jSONObject) : null;
        if (e == null) {
            e = b.f();
        }
        return handleCustomActionInternal(host, rvoVar, e, v3kVar.h, fplVar);
    }
}
