package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ntd extends xci implements yr5, amd, qof, ipa, w9t {
    public final ftd o;
    public cib p;

    public ntd(cib cibVar) {
        ftd ftdVar = new ftd();
        this.o = ftdVar;
        ftdVar.c.h(0.0f);
        this.p = cibVar;
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        long K = f8jVar.K(0L);
        ftd ftdVar = this.o;
        ftdVar.a.setValue(new enj(K));
        ftdVar.b.setValue(new nmq(nt0.Q(f8jVar.j())));
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.xci
    public final void K0() {
        Continuation continuation;
        hn5 hn5Var;
        cib cibVar = this.p;
        cibVar.getClass();
        ftd ftdVar = this.o;
        ftdVar.getClass();
        ((s2r) cibVar.b).add(ftdVar);
        Context context = (Context) men.t(this, AndroidCompositionLocals_androidKt.b);
        while (true) {
            continuation = null;
            if (!(context instanceof hn5)) {
                if (!(context instanceof ContextWrapper)) {
                    hn5Var = null;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                }
            } else {
                hn5Var = (hn5) context;
                break;
            }
        }
        if (hn5Var == null) {
            return;
        }
        x97.y(G0(), null, null, new ptd(hn5Var, this, continuation, 0), 3);
    }

    @Override // defpackage.xci
    public final void L0() {
        ftd ftdVar = this.o;
        ftdVar.a.setValue(new enj(9205357640488583168L));
        ftdVar.b.setValue(new nmq(9205357640488583168L));
        ftdVar.e = false;
        xod b = ftdVar.b();
        if (b != null) {
            ((uod) men.t(this, es5.g)).a(b);
        }
        ftdVar.d.setValue(null);
        cib cibVar = this.p;
        cibVar.getClass();
        ((s2r) cibVar.b).remove(ftdVar);
    }

    @Override // defpackage.xci
    public final void M0() {
        ftd ftdVar = this.o;
        ftdVar.a.setValue(new enj(9205357640488583168L));
        ftdVar.b.setValue(new nmq(9205357640488583168L));
        ftdVar.e = false;
    }

    @Override // defpackage.qof
    public final void R(wof wofVar) {
        ftd ftdVar = this.o;
        wofVar.getClass();
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            if ((ftdVar.c() & 9223372034707292159L) == 9205357640488583168L) {
                ftdVar.a.setValue(new enj(wofVar.K(0L)));
                ftdVar.b.setValue(new nmq(nt0.Q(wofVar.j())));
            }
        } finally {
            wyf.b0(G, Q, e);
        }
    }

    @Override // defpackage.w9t
    public final Object h() {
        return ttd.b;
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        ftd ftdVar = this.o;
        try {
            ftdVar.e = true;
            if (eeh.b(nmq.c(opfVar.a.e())) >= 1) {
                uod uodVar = (uod) men.t(this, es5.g);
                xod b = ftdVar.b();
                if (b != null) {
                    if (b.s) {
                        b = null;
                    }
                    if (b != null) {
                        jpa.T(opfVar, b, new mtd(opfVar, b));
                        yd5.s(opfVar, b);
                    }
                }
                b = uodVar.b();
                ftdVar.d.setValue(b);
                jpa.T(opfVar, b, new mtd(opfVar, b));
                yd5.s(opfVar, b);
            } else {
                opfVar.a();
            }
            ftdVar.e = false;
        } catch (Throwable th) {
            ftdVar.e = false;
            throw th;
        }
    }
}
