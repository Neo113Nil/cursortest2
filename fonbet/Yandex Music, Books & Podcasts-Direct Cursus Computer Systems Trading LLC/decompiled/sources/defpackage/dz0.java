package defpackage;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class dz0 extends oyc {
    public static final dz0 a = new dz0();
    public static final List b = t75.c(new azc(mhb.ARRAY));
    public static final mhb c = mhb.STRING;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String jSONArray = ((JSONArray) ouj.j(list, list)).toString();
        jSONArray.getClass();
        return jSONArray;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toString";
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
