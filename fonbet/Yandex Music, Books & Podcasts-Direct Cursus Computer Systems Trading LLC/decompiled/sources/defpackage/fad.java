package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fad extends oyc {
    public static final fad a = new fad();
    public static final List b;
    public static final mhb c;

    static {
        mhb mhbVar = mhb.DICT;
        b = u75.h(new azc(mhbVar), new azc(mhb.STRING, true));
        c = mhbVar;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        JSONObject jSONObject = new JSONObject();
        Object G = xp3.G(list, jSONObject, true);
        JSONObject jSONObject2 = G instanceof JSONObject ? (JSONObject) G : null;
        return jSONObject2 == null ? jSONObject : jSONObject2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getOptDictFromDict";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return false;
    }
}
