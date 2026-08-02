package defpackage;

import flex.feature.timed.action.b;
import kotlin.a;

/* loaded from: classes4.dex */
public final class t8z0 implements fw {
    public final tse a;
    public final sls b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f = a.a(new x1z0(11));

    public t8z0(tse tseVar, sls slsVar) {
        this.a = tseVar;
        this.b = slsVar;
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: s8z0
            public final /* synthetic */ t8z0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                t8z0 t8z0Var = this.b;
                switch (i2) {
                    case 0:
                        return new flex.feature.timed.action.a(t8z0Var.a);
                    case 1:
                        return new b(t8z0Var.a);
                    default:
                        return new zzy0(t8z0Var.b);
                }
            }
        });
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: s8z0
            public final /* synthetic */ t8z0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                t8z0 t8z0Var = this.b;
                switch (i22) {
                    case 0:
                        return new flex.feature.timed.action.a(t8z0Var.a);
                    case 1:
                        return new b(t8z0Var.a);
                    default:
                        return new zzy0(t8z0Var.b);
                }
            }
        });
        final int i3 = 2;
        this.e = a.a(new sls(this) { // from class: s8z0
            public final /* synthetic */ t8z0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                t8z0 t8z0Var = this.b;
                switch (i22) {
                    case 0:
                        return new flex.feature.timed.action.a(t8z0Var.a);
                    case 1:
                        return new b(t8z0Var.a);
                    default:
                        return new zzy0(t8z0Var.b);
                }
            }
        });
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar) {
        if (krVar instanceof dtg) {
            return (flex.feature.timed.action.a) this.c.getValue();
        }
        if (krVar instanceof uph) {
            return (b) this.d.getValue();
        }
        if (krVar instanceof xzy0) {
            return (zzy0) this.e.getValue();
        }
        if (krVar instanceof bgy) {
            return (cgy) this.f.getValue();
        }
        return null;
    }

    @Override // defpackage.fw
    public final dw handler(kr krVar, klc klcVar) {
        return handler(krVar);
    }
}
