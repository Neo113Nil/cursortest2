package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class gl9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wl9 s;
    public final /* synthetic */ ouq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl9(wl9 wl9Var, ouq ouqVar, int i) {
        super(1);
        this.r = i;
        this.s = wl9Var;
        this.t = ouqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.t.a = ((Number) obj).longValue();
                wl9 wl9Var = this.s;
                wl9Var.requestLayout();
                wl9Var.invalidate();
                break;
            default:
                this.t.b = ((Number) obj).longValue();
                wl9 wl9Var2 = this.s;
                wl9Var2.requestLayout();
                wl9Var2.invalidate();
                break;
        }
        return Unit.a;
    }
}
