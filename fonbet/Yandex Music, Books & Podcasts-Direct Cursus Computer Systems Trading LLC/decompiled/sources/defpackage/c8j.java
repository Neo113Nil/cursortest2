package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c8j extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ f8j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8j(f8j f8jVar, int i) {
        super(0);
        this.r = i;
        this.s = f8jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                f8j f8jVar = this.s;
                mu3 mu3Var = f8jVar.B;
                mu3Var.getClass();
                f8jVar.U0(mu3Var, f8jVar.A);
                break;
            default:
                f8j f8jVar2 = this.s.n;
                if (f8jVar2 != null) {
                    f8jVar2.i1();
                }
                break;
        }
        return Unit.a;
    }
}
