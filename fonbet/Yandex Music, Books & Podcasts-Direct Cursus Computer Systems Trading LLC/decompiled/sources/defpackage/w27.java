package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class w27 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ h37 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w27(h37 h37Var, int i) {
        super(1);
        this.r = i;
        this.s = h37Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                rfk rfkVar = (rfk) obj;
                rfkVar.getClass();
                this.s.H(rfkVar, true);
                break;
            default:
                List list = (List) obj;
                list.getClass();
                h37 h37Var = this.s;
                x97.y(ot0.F(h37Var), null, null, new bv6(h37Var, list, null, 7), 3);
                break;
        }
        return Unit.a;
    }
}
