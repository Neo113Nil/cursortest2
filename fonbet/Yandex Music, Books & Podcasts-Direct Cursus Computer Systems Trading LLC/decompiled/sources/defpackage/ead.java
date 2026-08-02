package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ead extends by0 {
    public static final ead d = new ead(mhb.DICT, 1);
    public static final String e = "getOptDictFromArray";
    public static final List f = u75.h(new azc(mhb.ARRAY), new azc(mhb.INTEGER));

    @Override // defpackage.by0, defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Object E = xp3.E(e, list, false);
        JSONObject jSONObject = E instanceof JSONObject ? (JSONObject) E : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // defpackage.by0, defpackage.oyc
    public final List b() {
        return f;
    }

    @Override // defpackage.oyc
    public final String c() {
        return e;
    }
}
