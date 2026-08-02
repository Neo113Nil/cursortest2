package defpackage;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class w9d extends by0 {
    public static final w9d d;
    public static final String e;
    public static final List f;

    static {
        mhb mhbVar = mhb.ARRAY;
        d = new w9d(mhbVar, 2);
        e = "getOptArrayFromArray";
        f = u75.h(new azc(mhbVar), new azc(mhb.INTEGER));
    }

    @Override // defpackage.by0, defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Object F = xp3.F(e, list);
        JSONArray jSONArray = F instanceof JSONArray ? (JSONArray) F : null;
        return jSONArray == null ? new JSONArray() : jSONArray;
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
