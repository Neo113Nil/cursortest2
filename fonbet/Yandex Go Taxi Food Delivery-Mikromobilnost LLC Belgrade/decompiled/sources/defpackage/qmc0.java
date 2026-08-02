package defpackage;

import android.content.Context;
import kotlin.a;
import ru.yandex.taxi.plaque.api.dependencies.PlaqueEnvironment;

/* loaded from: classes9.dex */
public final class qmc0 {
    public static final rhh h = new rhh();
    public final Context a;
    public final PlaqueEnvironment b;
    public final hjc0 c;
    public final lic0 d;
    public final i3y e;
    public final i3y f;
    public final i3y g;

    public qmc0(Context context, PlaqueEnvironment plaqueEnvironment, hjc0 hjc0Var, lic0 lic0Var) {
        this.a = context;
        this.b = plaqueEnvironment;
        this.c = hjc0Var;
        this.d = lic0Var;
        final int i = 0;
        this.e = a.a(new sls(this) { // from class: pmc0
            public final /* synthetic */ qmc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                qmc0 qmc0Var = this.b;
                switch (i2) {
                    case 0:
                        return new v8o(qmc0Var.a, qmc0Var.b);
                    case 1:
                        return new sg20((v8o) qmc0Var.e.getValue(), qmc0Var.c);
                    default:
                        return new hic0((sg20) qmc0Var.f.getValue(), (v8o) qmc0Var.e.getValue(), qmc0Var.c);
                }
            }
        });
        final int i2 = 1;
        this.f = a.a(new sls(this) { // from class: pmc0
            public final /* synthetic */ qmc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                qmc0 qmc0Var = this.b;
                switch (i22) {
                    case 0:
                        return new v8o(qmc0Var.a, qmc0Var.b);
                    case 1:
                        return new sg20((v8o) qmc0Var.e.getValue(), qmc0Var.c);
                    default:
                        return new hic0((sg20) qmc0Var.f.getValue(), (v8o) qmc0Var.e.getValue(), qmc0Var.c);
                }
            }
        });
        final int i3 = 2;
        this.g = a.a(new sls(this) { // from class: pmc0
            public final /* synthetic */ qmc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                qmc0 qmc0Var = this.b;
                switch (i22) {
                    case 0:
                        return new v8o(qmc0Var.a, qmc0Var.b);
                    case 1:
                        return new sg20((v8o) qmc0Var.e.getValue(), qmc0Var.c);
                    default:
                        return new hic0((sg20) qmc0Var.f.getValue(), (v8o) qmc0Var.e.getValue(), qmc0Var.c);
                }
            }
        });
    }
}
