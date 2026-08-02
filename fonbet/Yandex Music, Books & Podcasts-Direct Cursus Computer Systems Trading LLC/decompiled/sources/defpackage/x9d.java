package defpackage;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class x9d extends oyc {
    public static final x9d a = new x9d();
    public static final List b = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
    public static final mhb c = mhb.ARRAY;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Object G = xp3.G(list, jSONArray, true);
        JSONArray jSONArray2 = G instanceof JSONArray ? (JSONArray) G : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "getOptArrayFromDict";
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
