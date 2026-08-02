package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hg0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d28 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg0(d28 d28Var, int i) {
        super(1);
        this.r = i;
        this.s = d28Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                d28 d28Var = this.s;
                d28Var.show();
                return new hi(3, d28Var);
            default:
                d28 d28Var2 = this.s;
                if (d28Var2.e.a) {
                    d28Var2.d.invoke();
                }
                return Unit.a;
        }
    }
}
