package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class yn0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ b6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn0(b6 b6Var, int i) {
        super(1);
        this.r = i;
        this.s = b6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                return this.s.E(q1fVar);
            default:
                obj.getClass();
                return this.s.J(obj);
        }
    }
}
