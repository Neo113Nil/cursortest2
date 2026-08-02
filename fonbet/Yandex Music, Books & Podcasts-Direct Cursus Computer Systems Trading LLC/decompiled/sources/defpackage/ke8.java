package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ke8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ le8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke8(le8 le8Var, int i) {
        super(1);
        this.r = i;
        this.s = le8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.invoke();
                break;
            case 1:
                this.s.invoke();
                break;
            case 2:
                this.s.invoke();
                break;
            default:
                this.s.invoke();
                break;
        }
        return Unit.a;
    }
}
