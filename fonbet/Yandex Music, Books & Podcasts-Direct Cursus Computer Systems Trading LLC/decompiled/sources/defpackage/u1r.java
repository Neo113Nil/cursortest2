package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u1r extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ uqn t;
    public final /* synthetic */ rwo u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1r(float f, uqn uqnVar, rwo rwoVar, Function1 function1, int i) {
        super(1);
        this.r = i;
        this.s = f;
        this.t = uqnVar;
        this.u = rwoVar;
        this.v = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        switch (this.r) {
            case 0:
                sm0 sm0Var = (sm0) obj;
                float abs = Math.abs(((Number) sm0Var.e.getValue()).floatValue());
                float f2 = this.s;
                float abs2 = Math.abs(f2);
                x6k x6kVar = sm0Var.e;
                Function1 function1 = this.v;
                rwo rwoVar = this.u;
                uqn uqnVar = this.t;
                if (abs >= abs2) {
                    float d = w1r.d(((Number) x6kVar.getValue()).floatValue(), f2);
                    w1r.b(sm0Var, rwoVar, function1, d - uqnVar.a);
                    sm0Var.a();
                    uqnVar.a = d;
                } else {
                    w1r.b(sm0Var, rwoVar, function1, ((Number) x6kVar.getValue()).floatValue() - uqnVar.a);
                    uqnVar.a = ((Number) x6kVar.getValue()).floatValue();
                }
                break;
            default:
                sm0 sm0Var2 = (sm0) obj;
                float d2 = w1r.d(((Number) sm0Var2.e.getValue()).floatValue(), this.s);
                uqn uqnVar2 = this.t;
                float f3 = d2 - uqnVar2.a;
                try {
                    f = this.u.a(f3);
                } catch (CancellationException unused) {
                    sm0Var2.a();
                    f = 0.0f;
                }
                this.v.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || d2 != ((Number) sm0Var2.e.getValue()).floatValue()) {
                    sm0Var2.a();
                }
                uqnVar2.a += f;
                break;
        }
        return Unit.a;
    }
}
