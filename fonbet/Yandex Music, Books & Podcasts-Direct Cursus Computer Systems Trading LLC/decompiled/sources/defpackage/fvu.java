package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fvu implements lke {
    public final ile a;
    public final nke b;
    public final lm4 c = ern.a(fvu.class);
    public final List d = t75.c(wke.a);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final jyr f;
    public final jyr g;

    public fvu(ile ileVar, nke nkeVar) {
        this.a = ileVar;
        this.b = nkeVar;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: evu
            public final /* synthetic */ fvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ivu(this.b.a.b);
                    default:
                        return new eke(this.b.b.a(), new gke("wave_offline_informer"));
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: evu
            public final /* synthetic */ fvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ivu(this.b.a.b);
                    default:
                        return new eke(this.b.b.a(), new gke("wave_offline_informer"));
                }
            }
        });
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1243024233);
        int i2 = i & 1;
        if (oq5Var.P(i2, i2 != 0)) {
            hyf.m(null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 24);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        return jx7Var.p(v7g.z(34)) + 10 + 4;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.d;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
        jyr jyrVar = this.g;
        if (z) {
            ((eke) jyrVar.getValue()).b();
        } else {
            ((eke) jyrVar.getValue()).a();
        }
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.c;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return "wave_offline_informer";
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return ((ivu) this.f.getValue()).b;
    }

    @Override // defpackage.lke
    public final void start() {
        if (this.e.compareAndSet(false, true)) {
            ivu ivuVar = (ivu) this.f.getValue();
            ivuVar.getClass();
            ivuVar.a = gld.e(dm6.b());
            pjc b0 = zsd.b0(new cla(y1g.L((f7l) ivuVar.c.getValue()), 13));
            msa msaVar = nsa.b;
            ox6.B(new y4s(zsd.Y(b0, yd5.M(1, ssa.SECONDS)), 21), ivuVar.a, new lot(13, ivuVar));
        }
    }
}
