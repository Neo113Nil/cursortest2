package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z51 implements lke {
    public final yfl a;
    public final nke b;
    public final jyr c;
    public final String d;
    public final lm4 e;
    public final jyr f;
    public final jyr g;
    public final float h;
    public final List i;

    public z51(yfl yflVar, nke nkeVar) {
        this.a = yflVar;
        this.b = nkeVar;
        final int i = 0;
        jyr b = btf.b(new Function0(this) { // from class: v51
            public final /* synthetic */ z51 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.a.a();
                    case 1:
                        z51 z51Var = this.b;
                        return new xdl(z51Var.b.a(), new fke(z51Var.d));
                    default:
                        return asq.K(((mfl) this.b.c.getValue()).b, new s8i(17, ern.a(udl.class)));
                }
            }
        });
        this.c = b;
        this.d = "donation";
        this.e = ern.a(z51.class);
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: v51
            public final /* synthetic */ z51 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.a.a();
                    case 1:
                        z51 z51Var = this.b;
                        return new xdl(z51Var.b.a(), new fke(z51Var.d));
                    default:
                        return asq.K(((mfl) this.b.c.getValue()).b, new s8i(17, ern.a(udl.class)));
                }
            }
        });
        final int i3 = 2;
        this.g = btf.b(new Function0(this) { // from class: v51
            public final /* synthetic */ z51 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.b.a.a();
                    case 1:
                        z51 z51Var = this.b;
                        return new xdl(z51Var.b.a(), new fke(z51Var.d));
                    default:
                        return asq.K(((mfl) this.b.c.getValue()).b, new s8i(17, ern.a(udl.class)));
                }
            }
        });
        this.h = 12;
        this.i = t75.c(wke.a);
        ox6.B(new fs(2, new ez(((mfl) b.getValue()).b, 7)), cmd.a, new ri(9, this));
    }

    @Override // defpackage.lke
    public final pjc a(jx7 jx7Var) {
        jx7Var.getClass();
        return new u21(1, new bca((pjc) ((mfl) this.c.getValue()).c.getValue(), 18), this, jx7Var);
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-178990658);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            xdl xdlVar = (xdl) this.f.getValue();
            xdlVar.getClass();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = oq5Var.f(mm6Var) | oq5Var.f(context);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                context.getClass();
                yfl yflVar = this.a;
                b61 b61Var = new b61(mm6Var, yflVar.a(), xdlVar, (nfl) yflVar.d.getValue(), new wnd(context, 1, false));
                oq5Var.k0(b61Var);
                K2 = b61Var;
            }
            saf.k((b61) K2, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 2);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        return jx7Var.p(v7g.z(24)) + 14 + 6;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.i;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
        if (z) {
            return;
        }
        xdl xdlVar = (xdl) this.f.getValue();
        xdlVar.getClass();
        if (Intrinsics.d(xdl.d, "")) {
            return;
        }
        String str = xdl.d;
        gke gkeVar = xdlVar.c;
        if (gkeVar == null) {
            return;
        }
        xdlVar.a.b(gkeVar, str);
        xdl.d = "";
    }

    @Override // defpackage.lke
    public final float f() {
        return this.h;
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.e;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return this.d;
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return (vdr) this.g.getValue();
    }

    @Override // defpackage.lke
    public final boolean h(lke lkeVar) {
        return !CollectionsKt.I(u75.h("concert", "donation", "common"), lkeVar != null ? lkeVar.getTag() : null);
    }
}
