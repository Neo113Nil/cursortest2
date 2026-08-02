package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class u9i extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j4x s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9i(int i, j4x j4xVar) {
        super(1);
        this.r = i;
        this.s = j4xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.k("success");
                break;
            default:
                ((r7w) obj).getClass();
                this.s.k("failure");
                break;
        }
        return Unit.a;
    }
}
