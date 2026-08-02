package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f28 extends oyc {
    public static final f28 a = new f28();
    public static final List b = t75.c(new azc(mhb.DICT));
    public static final mhb c = mhb.BOOLEAN;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return Boolean.valueOf(((JSONObject) ouj.i(list, 0)).length() == 0);
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
        return d;
    }
}
