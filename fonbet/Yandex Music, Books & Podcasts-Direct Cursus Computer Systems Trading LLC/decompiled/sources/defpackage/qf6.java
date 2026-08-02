package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class qf6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ nf6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf6(nf6 nf6Var, int i) {
        super(0);
        this.r = i;
        this.s = nf6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                fgq.v(this.s);
                break;
            default:
                fgq.v(this.s);
                break;
        }
        return Unit.a;
    }
}
