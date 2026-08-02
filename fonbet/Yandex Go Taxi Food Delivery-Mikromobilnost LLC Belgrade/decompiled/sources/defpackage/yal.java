package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yal implements zsq0, nyi {
    public static wal c(yf90 yf90Var, JSONObject jSONObject) {
        return new wal(a.b(yf90Var, jSONObject, "color", wm11.f, b.b, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, wal walVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", walVar.a, b.a);
        wwg.Z(yf90Var, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (wal) obj);
    }
}
