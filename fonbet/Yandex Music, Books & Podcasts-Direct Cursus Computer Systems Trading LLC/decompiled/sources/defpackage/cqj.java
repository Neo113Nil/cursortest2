package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class cqj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mm6 c;

    public /* synthetic */ cqj(mm6 mm6Var, Function1 function1) {
        this.a = 2;
        this.c = mm6Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            case 1:
                this.b.invoke(this.c);
                break;
            default:
                x97.y(this.c, null, null, new jqj(this.b, (Continuation) null, 2), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cqj(Function1 function1, mm6 mm6Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = mm6Var;
    }
}
