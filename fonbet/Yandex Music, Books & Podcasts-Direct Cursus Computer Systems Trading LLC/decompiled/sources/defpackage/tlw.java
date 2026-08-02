package defpackage;

import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.s0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class tlw implements w2q {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ double e;
    public final /* synthetic */ s0 f;

    public tlw(boolean z, xqn xqnVar, long j, long j2, double d, s0 s0Var) {
        this.a = z;
        this.b = xqnVar;
        this.c = j;
        this.d = j2;
        this.e = d;
        this.f = s0Var;
    }

    public final void a(boolean z) {
        long j = this.c;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            s0 s0Var = this.f;
            s0Var.getClass();
            qrl q = c0.q();
            q.j(this.d);
            q.h(longValue);
            q.i(z);
            q.d();
            c0.h((c0) q.b, this.e);
            q.k(s0Var);
            this.b.a = (c0) q.b();
        }
    }

    public final void b(boolean z) {
        s0 s0Var = this.f;
        s0Var.getClass();
        qrl q = c0.q();
        q.j(0L);
        q.h(1L);
        q.i(z);
        q.d();
        c0.h((c0) q.b, this.e);
        q.k(s0Var);
        this.b.a = (c0) q.b();
    }

    @Override // defpackage.w2q
    public final Object c(foc focVar) {
        focVar.getClass();
        return Unit.a;
    }

    @Override // defpackage.w2q
    public final Object g(faq faqVar) {
        faqVar.getClass();
        boolean z = faqVar instanceof daq;
        boolean z2 = this.a;
        if (z) {
            b(!z2);
        } else if (faqVar instanceof naq) {
            a(!z2);
        } else if (faqVar instanceof saq) {
            a(!z2);
        } else {
            if (!(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
            a(!z2);
        }
        return Unit.a;
    }

    @Override // defpackage.w2q
    public final Object h(jzs jzsVar) {
        jzsVar.getClass();
        a(!this.a);
        return Unit.a;
    }

    @Override // defpackage.w2q
    public final Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof j1q) {
            b(true);
        } else if (m1qVar instanceof c2q) {
            a(true);
        } else {
            if (!(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            a(true);
        }
        return Unit.a;
    }

    @Override // defpackage.w2q
    public final Object j(i5u i5uVar) {
        i5uVar.getClass();
        a(!this.a);
        return Unit.a;
    }

    @Override // defpackage.w2q
    public final Object k(k4d k4dVar) {
        k4dVar.getClass();
        b(!this.a);
        return Unit.a;
    }
}
