package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class yna extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hoa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yna(hoa hoaVar, int i) {
        super(0);
        this.r = i;
        this.s = hoaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                zi3 zi3Var = this.s.u;
                if (zi3Var != null) {
                    zi3Var.c(uma.a);
                }
                return Unit.a;
            default:
                return Boolean.valueOf(!this.s.c1());
        }
    }
}
