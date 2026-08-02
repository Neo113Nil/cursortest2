package defpackage;

import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ikr extends oyc {
    public static final ikr a = new ikr();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhb.INTEGER;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        list.get(1).getClass();
        return Long.valueOf(StringsKt.T(str, (String) r4, 0, false, 2));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "index";
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
