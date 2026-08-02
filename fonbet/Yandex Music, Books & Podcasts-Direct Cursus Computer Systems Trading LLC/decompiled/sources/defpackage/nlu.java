package defpackage;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class nlu {
    public final slu a;
    public final kxi b;
    public final xdr c;
    public final qfn d;
    public final cvo e;

    public nlu(slu sluVar, kxi kxiVar) {
        kxiVar.getClass();
        this.a = sluVar;
        this.b = kxiVar;
        this.c = sluVar.h;
        String str = sluVar.e.a.a;
        Locale locale = Locale.US;
        this.d = new qfn(hrg.q("radio-mobile-home-discovery_block-", ouj.s(locale, str, locale), "-default"));
        this.e = ((jnq) sluVar.f.b).b;
    }
}
