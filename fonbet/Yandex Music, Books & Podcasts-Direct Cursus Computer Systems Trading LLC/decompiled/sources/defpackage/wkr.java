package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class wkr extends oyc {
    public static final wkr a = new wkr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.COLOR;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        try {
            return new c85(bow.v((String) ouj.j(list, list)));
        } catch (IllegalArgumentException e) {
            ghh.J("toColor", list, "Unable to convert value to Color, expected format #AARRGGBB.", e);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toColor";
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
