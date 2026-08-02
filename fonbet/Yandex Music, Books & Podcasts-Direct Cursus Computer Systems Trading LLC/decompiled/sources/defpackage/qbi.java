package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qbi extends uif implements Function0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbi(cci cciVar, jx7 jx7Var, tm0 tm0Var, boolean z) {
        super(0);
        this.t = cciVar;
        this.u = jx7Var;
        this.v = tm0Var;
        this.s = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return new bci((cci) this.t, (jx7) this.u, k9i.D, (tm0) this.v, this.s);
            case 1:
                d1n d1nVar = (d1n) this.t;
                boolean b = d1nVar.b();
                mm6 mm6Var = d1nVar.a;
                t6k t6kVar = d1nVar.h;
                Continuation continuation = null;
                boolean z = this.s;
                if (b != z) {
                    d1nVar.d.setValue(Boolean.valueOf(z));
                    d1nVar.f.h(0.0f);
                    x97.y(mm6Var, null, null, new c90(d1nVar, z ? t6kVar.e() : 0.0f, continuation, 3), 3);
                }
                d1nVar.g.h(((uqn) this.u).a);
                float f = ((uqn) this.v).a;
                if (t6kVar.e() != f) {
                    t6kVar.h(f);
                    if (d1nVar.b()) {
                        x97.y(mm6Var, null, null, new c90(d1nVar, f, continuation, 3), 3);
                    }
                }
                return Unit.a;
            default:
                return new zcq(this.s, (jx7) this.u, (gdq) this.t, (Function1) this.v);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbi(d1n d1nVar, boolean z, uqn uqnVar, uqn uqnVar2) {
        super(0);
        this.t = d1nVar;
        this.s = z;
        this.u = uqnVar;
        this.v = uqnVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbi(boolean z, jx7 jx7Var, gdq gdqVar, Function1 function1) {
        super(0);
        this.s = z;
        this.u = jx7Var;
        this.t = gdqVar;
        this.v = function1;
    }
}
