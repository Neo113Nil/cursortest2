package defpackage;

import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yb91 {
    public final gr91 a;
    public cr71 b;
    public final h491 c;
    public final cwb1 d;

    public yb91() {
        gr91 gr91Var = new gr91();
        this.a = gr91Var;
        this.b = gr91Var.b.j();
        this.c = new h491();
        this.d = new cwb1();
        final int i = 1;
        Callable callable = new Callable(this) { // from class: t391
            public final /* synthetic */ yb91 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                yb91 yb91Var = this.b;
                switch (i2) {
                    case 0:
                        return new hma1(yb91Var.c);
                    default:
                        return new hma1(yb91Var.d);
                }
            }
        };
        cga1 cga1Var = gr91Var.d;
        cga1Var.a("internal.registerCallback", callable);
        final int i2 = 0;
        cga1Var.a("internal.eventLogger", new Callable(this) { // from class: t391
            public final /* synthetic */ yb91 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i22 = i2;
                yb91 yb91Var = this.b;
                switch (i22) {
                    case 0:
                        return new hma1(yb91Var.c);
                    default:
                        return new hma1(yb91Var.d);
                }
            }
        });
    }

    public final boolean a(y391 y391Var) {
        h491 h491Var = this.c;
        try {
            h491Var.b(y391Var);
            this.a.c.o("runtime.counter", new n591(Double.valueOf(0.0d)));
            this.d.a(this.b.j(), h491Var);
            if (h491Var.c().equals(h491Var.a())) {
                return !((ArrayList) h491Var.d()).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void b(r0 r0Var) {
        s591 s591Var;
        try {
            gr91 gr91Var = this.a;
            this.b = gr91Var.b.j();
            if (gr91Var.a(this.b, (s0[]) r0Var.r().toArray(new s0[0])) instanceof g591) {
                throw new IllegalStateException("Program loading failed");
            }
            for (q0 q0Var : r0Var.s().r()) {
                List s = q0Var.s();
                String r = q0Var.r();
                Iterator it = s.iterator();
                while (it.hasNext()) {
                    r691 a = gr91Var.a(this.b, (s0) it.next());
                    if (!(a instanceof i691)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    cr71 cr71Var = this.b;
                    if (cr71Var.l(r)) {
                        r691 q = cr71Var.q(r);
                        if (!(q instanceof s591)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(r)));
                        }
                        s591Var = (s591) q;
                    } else {
                        s591Var = null;
                    }
                    if (s591Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(r)));
                    }
                    s591Var.c(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
