package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yyk implements zsq0, nyi {
    public final JsonParserComponent a;

    public yyk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vyk a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        zrk zrkVar = bzk.b;
        kvo kvoVar = bzk.a;
        ?? e = a.e(yf90Var, jSONObject, "angle", tmsVar, tlsVar, zrkVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        List P = wwg.P(yf90Var, jSONObject, "color_map", this.a.d5, bzk.d);
        rms rmsVar = wm11.f;
        tls tlsVar2 = b.a;
        return new vyk(kvoVar, P, a.f(yf90Var, jSONObject, "colors", rmsVar, bzk.c));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vyk vykVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "angle", vykVar.a);
        wwg.c0(yf90Var, jSONObject, "color_map", vykVar.b, this.a.d5);
        pvo pvoVar = vykVar.c;
        tls tlsVar = b.a;
        a.i(yf90Var, jSONObject, pvoVar);
        wwg.Z(yf90Var, jSONObject, "type", "gradient");
        return jSONObject;
    }
}
