package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import com.yandex.div2.l1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v6l implements zsq0, nyi {
    public static u6l c(yf90 yf90Var, JSONObject jSONObject) {
        return new u6l(a.b(yf90Var, jSONObject, "value", l1.a, DivRadialGradientRelativeRadius$Value.FROM_STRING, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, u6l u6lVar) {
        JSONObject w = n.w(yf90Var, "type", "relative");
        a.h(yf90Var, w, "value", u6lVar.a, DivRadialGradientRelativeRadius$Value.TO_STRING);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (u6l) obj);
    }
}
