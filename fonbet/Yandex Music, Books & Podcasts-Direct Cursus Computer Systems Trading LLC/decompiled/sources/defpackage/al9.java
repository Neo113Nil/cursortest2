package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class al9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wl9 s;
    public final /* synthetic */ jl9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al9(wl9 wl9Var, jl9 jl9Var, int i) {
        super(1);
        this.r = i;
        this.s = wl9Var;
        this.t = jl9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                float longValue = ((Number) obj).longValue();
                wl9 wl9Var = this.s;
                wl9Var.setMinValue(longValue);
                this.t.G(wl9Var);
                break;
            default:
                float longValue2 = ((Number) obj).longValue();
                wl9 wl9Var2 = this.s;
                wl9Var2.setMaxValue(longValue2);
                this.t.G(wl9Var2);
                break;
        }
        return Unit.a;
    }
}
