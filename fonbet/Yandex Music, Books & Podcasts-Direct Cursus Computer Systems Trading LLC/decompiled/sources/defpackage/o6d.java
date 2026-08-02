package defpackage;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class o6d extends oyc {
    public static final o6d a = new o6d();
    public static final List b = t75.c(new azc(mhb.ARRAY));
    public static final mhb c = mhb.INTEGER;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Long.valueOf(((JSONArray) ouj.i(list, 0)).length());
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "len";
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
