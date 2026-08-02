package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class kav implements jav {
    public final qav a;
    public final kxi b;
    public final xdr c;
    public final qfn d;
    public final cvo e;

    public kav(qav qavVar, kxi kxiVar) {
        kxiVar.getClass();
        this.a = qavVar;
        this.b = kxiVar;
        this.c = qavVar.h;
        String str = qavVar.e.a.a;
        Locale locale = Locale.US;
        this.d = new qfn(hrg.q("radio-mobile-home-discovery_block-", ouj.s(locale, str, locale), "-default"));
        this.e = ((jnq) qavVar.f.b).b;
    }

    @Override // defpackage.jav
    public final void a(boolean z, nav navVar, int i, String str) {
        navVar.getClass();
        str.getClass();
        gs4 gs4Var = this.a.f;
        gs4Var.r().h(zdg.J(navVar, i, str), z);
    }

    @Override // defpackage.jav
    public final pfn b() {
        return this.d;
    }

    @Override // defpackage.jav
    public final void c(oav oavVar) {
        Object value;
        ght ghtVar;
        oavVar.getClass();
        qav qavVar = this.a;
        qavVar.f.q(oavVar.a);
        xdr xdrVar = qavVar.h;
        do {
            value = xdrVar.getValue();
            ghtVar = (ght) value;
            if (ghtVar instanceof tgt) {
                tgt tgtVar = (tgt) ghtVar;
                String str = tgtVar.a;
                List list = tgtVar.b;
                list.getClass();
                ghtVar = new tgt(str, list, oavVar);
            }
        } while (!xdrVar.k(value, ghtVar));
    }

    @Override // defpackage.jav
    public final kxi d() {
        return this.b;
    }

    @Override // defpackage.jav
    public final cvo e() {
        return this.e;
    }

    @Override // defpackage.jav
    public final b70 f() {
        b70 b70Var = this.a.f.r().c;
        if (b70Var != null) {
            return b70Var;
        }
        xq0.x("Required value was null.");
        return null;
    }

    @Override // defpackage.jav
    public final xdr getState() {
        return this.c;
    }
}
