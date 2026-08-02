package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* loaded from: classes3.dex */
public final class alr extends oyc {
    public static final alr a = new alr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.URL;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.j(list, list);
        try {
            try {
                new URL(str);
                return new lpt(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (IllegalArgumentException e) {
            ghh.J("toUrl", list, "Unable to convert value to Url.", e);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toUrl";
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
