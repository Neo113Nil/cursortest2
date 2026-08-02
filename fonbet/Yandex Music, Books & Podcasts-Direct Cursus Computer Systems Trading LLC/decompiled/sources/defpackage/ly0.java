package defpackage;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class ly0 extends oyc {
    public static final ly0 a = new ly0();
    public static final List b = t75.c(new azc(mhb.ARRAY));
    public static final mhb c = mhb.BOOLEAN;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Boolean.valueOf(((JSONArray) ouj.i(list, 0)).length() == 0);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "isEmpty";
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
