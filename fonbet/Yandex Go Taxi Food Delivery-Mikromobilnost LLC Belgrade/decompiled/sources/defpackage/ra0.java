package defpackage;

import com.yandex.go.payments.cards.ui.e;
import com.yandex.go.payments.domain.q0;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes13.dex */
public final class ra0 extends hz4 {
    public static final ymu p = new ymu(4, dt5.b, (Object) null);
    public final m6 e;
    public final hn8 f;
    public final xqw g;
    public final va0 h;
    public final l9z i;
    public final s760 j;
    public final q0 k;
    public final e l;
    public ymu m;
    public g18 n;
    public final tc8 o;

    public ra0(m6 m6Var, hn8 hn8Var, xqw xqwVar, va0 va0Var, l9z l9zVar, s760 s760Var, q0 q0Var, e eVar) {
        super(h2b1.b);
        this.e = m6Var;
        this.f = hn8Var;
        this.g = xqwVar;
        this.h = va0Var;
        this.i = l9zVar;
        this.j = s760Var;
        this.k = q0Var;
        this.l = eVar;
        this.m = p;
        this.o = new tc8(0);
    }

    public static final void f(ra0 ra0Var, ylm0 ylm0Var) {
        ra0Var.getClass();
        Integer num = ylm0Var.b;
        String str = ylm0Var.a;
        Integer num2 = ylm0Var.c;
        boolean z = false;
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (1 <= intValue && intValue < 13 && intValue2 >= 0) {
                    z = true;
                }
            }
        }
        Object obj = ra0Var.a;
        if (z) {
            ((pa0) obj).a(str, ylm0Var.b, num2);
        } else {
            ((pa0) obj).a(str, null, null);
        }
    }

    @Override // defpackage.hz4
    public final void d() {
        super.d();
        ymu ymuVar = this.m;
        l8x l8xVar = (l8x) ymuVar.c;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ymuVar.c = null;
        this.m = p;
        g18 g18Var = this.n;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    public final void g(mb8 mb8Var) {
        tc8 tc8Var = this.o;
        CardType a = tc8Var.a();
        tc8Var.e = mb8Var;
        CardType a2 = tc8Var.a();
        va0 va0Var = this.h;
        if (a2 != a) {
            ((ba0) va0Var.Dg()).updateCvnComment(a2.b());
        }
        va0Var.z = a2;
        ((ba0) va0Var.Dg()).updateCvnComment(a2.b());
        ((ba0) va0Var.Dg()).setCardImage(a2);
        ((ba0) va0Var.Dg()).setConfirmButtonEnabled(tc8Var.b());
        ((pa0) this.a).b(tc8Var.e.c);
    }
}
