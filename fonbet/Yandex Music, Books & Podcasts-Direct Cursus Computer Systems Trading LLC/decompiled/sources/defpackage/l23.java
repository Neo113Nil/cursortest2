package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class l23 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pt0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l23(pt0 pt0Var, int i) {
        super(1);
        this.r = i;
        this.s = pt0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                qv3 qv3Var = (qv3) obj;
                qv3Var.getClass();
                qdq.A(new k23(this.s, qv3Var, 0));
                break;
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new m23(this.s, r7wVar, 0));
                break;
            case 2:
                qv3 qv3Var2 = (qv3) obj;
                qv3Var2.getClass();
                qdq.A(new k23(this.s, qv3Var2, 1));
                break;
            case 3:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                qdq.A(new m23(this.s, r7wVar2, 1));
                break;
            case 4:
                qv3 qv3Var3 = (qv3) obj;
                qv3Var3.getClass();
                qdq.A(new k23(this.s, qv3Var3, 2));
                break;
            default:
                r7w r7wVar3 = (r7w) obj;
                r7wVar3.getClass();
                qdq.A(new m23(this.s, r7wVar3, 2));
                break;
        }
        return Unit.a;
    }
}
