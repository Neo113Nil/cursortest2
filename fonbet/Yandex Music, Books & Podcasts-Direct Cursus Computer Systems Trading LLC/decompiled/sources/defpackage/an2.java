package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class an2 {
    public final gn2 a;
    public final uu1 b;
    public final ybf c;
    public final by7 d;

    public an2(jfu jfuVar, ri1 ri1Var, gn2 gn2Var, uu1 uu1Var) {
        this.a = gn2Var;
        this.b = uu1Var;
        ybf ybfVar = new ybf(ern.a(vo2.class), new r71(jfuVar, 2), new vz(18, new ri1(25, ri1Var)));
        this.c = ybfVar;
        this.d = asq.K(((vo2) ybfVar.getValue()).G(), new tf2(23));
    }

    public final void a(final zn2 zn2Var, hq5 hq5Var, final int i) {
        xmn r;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2145857699);
        if ((((oq5Var.f(zn2Var) ? 32 : 16) | i | (oq5Var.h(this) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (!((Boolean) this.b.invoke()).booleanValue()) {
                r = oq5Var.r();
                if (r != null) {
                    final int i2 = 0;
                    function2 = new Function2(this, zn2Var, i, i2) { // from class: zm2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ an2 b;
                        public final /* synthetic */ zn2 c;

                        {
                            this.a = i2;
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i3 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i3) {
                                case 0:
                                    this.b.a(this.c, hq5Var2, rvf.R(7));
                                    break;
                                default:
                                    this.b.a(this.c, hq5Var2, rvf.R(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            etn.l(ao2.a.a(zn2Var), ild.C(-856554851, new m32(5, this, (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)), oq5Var), oq5Var, 56);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i3 = 1;
            function2 = new Function2(this, zn2Var, i, i3) { // from class: zm2
                public final /* synthetic */ int a;
                public final /* synthetic */ an2 b;
                public final /* synthetic */ zn2 c;

                {
                    this.a = i3;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i32 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i32) {
                        case 0:
                            this.b.a(this.c, hq5Var2, rvf.R(7));
                            break;
                        default:
                            this.b.a(this.c, hq5Var2, rvf.R(7));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }
}
