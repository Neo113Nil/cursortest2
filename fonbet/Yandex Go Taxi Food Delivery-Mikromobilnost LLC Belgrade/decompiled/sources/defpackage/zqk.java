package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.e0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zqk implements zsq0, yey0 {
    public static brk c(yf90 yf90Var, brk brkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        qkj qkjVar = e0.b;
        exq exqVar = brkVar != null ? brkVar.a : null;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new brk(wcx.j(Q, jSONObject, "unit", qkjVar, i, exqVar, tlsVar, kbsVar), wcx.e(Q, jSONObject, "value", wm11.b, i, brkVar != null ? brkVar.b : null, b.h, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, brk brkVar) {
        JSONObject w = n.w(yf90Var, "type", "translation-fixed");
        wcx.p(brkVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", w);
        wcx.q(yf90Var, w, "value", brkVar.b);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (brk) obj);
    }
}
