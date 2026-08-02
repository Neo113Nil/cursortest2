package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class w28 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w28(x0 x0Var, int i) {
        super(1);
        this.r = i;
        this.s = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.T("success");
                break;
            default:
                ((r7w) obj).getClass();
                this.s.T("failure");
                break;
        }
        return Unit.a;
    }
}
