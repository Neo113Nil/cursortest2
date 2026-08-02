package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class kkq implements lke {
    public final int a;
    public final vdr b;
    public final String c;
    public final hke d;
    public final Function2 e;
    public final Function2 f;
    public final lm4 g;
    public final List h;
    public final jyr i;

    public kkq(int i, vdr vdrVar, String str, hke hkeVar, Function2 function2, j3 j3Var, int i2) {
        j3Var = (i2 & 64) != 0 ? null : j3Var;
        vdrVar.getClass();
        this.a = i;
        this.b = vdrVar;
        this.c = str;
        this.d = hkeVar;
        this.e = function2;
        this.f = j3Var;
        this.g = ern.a(kkq.class);
        this.h = u75.h(vke.a, wke.a);
        this.i = btf.b(new oxo(24, this));
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        Function1 function1;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1508505007);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            oq5Var.Z(-1629703538);
            boolean f = oq5Var.f(i());
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                final int i3 = 0;
                final Function2 function2 = this.e;
                K = new Function1() { // from class: jkq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        switch (i3) {
                            case 0:
                                context.getClass();
                                function2.invoke(context, this.i());
                                break;
                            default:
                                context.getClass();
                                function2.invoke(context, this.i());
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function1 function12 = (Function1) K;
            oq5Var.p(false);
            final Function2 function22 = this.f;
            if (function22 == null) {
                oq5Var.Z(-1629598387);
                oq5Var.p(false);
                function1 = null;
            } else {
                oq5Var.Z(-1629598386);
                boolean f2 = oq5Var.f(i());
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    final int i4 = 1;
                    K2 = new Function1() { // from class: jkq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            switch (i4) {
                                case 0:
                                    context.getClass();
                                    function22.invoke(context, this.i());
                                    break;
                                default:
                                    context.getClass();
                                    function22.invoke(context, this.i());
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                function1 = (Function1) K2;
                oq5Var.p(false);
            }
            cb0.o(this.a, 0, oq5Var, null, function12, function1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 19);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        return jx7Var.p(v7g.z(20)) + 14 + 6;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.h;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
        if (z) {
            i().b();
        } else {
            i().a();
        }
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.g;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return this.c;
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return this.b;
    }

    public final eke i() {
        return (eke) this.i.getValue();
    }
}
