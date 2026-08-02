package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e28 extends oyc {
    public static final e28 a = new e28();
    public static final List b = u75.h(new azc(mhb.DICT), new azc(mhb.STRING));
    public static final mhb c = mhb.BOOLEAN;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        JSONObject jSONObject = (JSONObject) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        return Boolean.valueOf(jSONObject.has((String) obj));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "containsKey";
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
