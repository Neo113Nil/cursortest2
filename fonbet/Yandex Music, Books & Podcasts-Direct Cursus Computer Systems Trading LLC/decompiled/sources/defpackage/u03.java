package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ iwe s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u03(iwe iweVar, int i) {
        super(1);
        this.r = i;
        this.s = iweVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((et2) obj).getClass();
                qdq.A(new k5(11, this.s));
                break;
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new v03(this.s, r7wVar, 0));
                break;
            case 2:
                Unit unit = (Unit) obj;
                unit.getClass();
                qdq.A(new ha0(19, this.s, unit));
                break;
            default:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                qdq.A(new v03(this.s, r7wVar2, 1));
                break;
        }
        return Unit.a;
    }
}
