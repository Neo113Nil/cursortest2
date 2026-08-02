package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class us6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uif s;
    public final /* synthetic */ xqn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public us6(Function1 function1, xqn xqnVar, int i) {
        super(0);
        this.r = i;
        switch (i) {
            case 1:
                this.s = (uif) function1;
                this.t = xqnVar;
                super(0);
                break;
            default:
                this.s = (uif) function1;
                this.t = xqnVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.invoke(this.t.a);
                break;
            default:
                this.s.invoke(this.t.a);
                break;
        }
        return Unit.a;
    }
}
