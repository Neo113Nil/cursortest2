package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class tbs extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ nf6 s;
    public final /* synthetic */ qbs t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbs(nf6 nf6Var, qbs qbsVar, int i) {
        super(0);
        this.r = i;
        this.s = nf6Var;
        this.t = qbsVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.t.d();
                fgq.v(this.s);
                break;
            case 1:
                this.t.b(false);
                fgq.v(this.s);
                break;
            case 2:
                this.t.m();
                fgq.v(this.s);
                break;
            case 3:
                this.t.n();
                fgq.v(this.s);
                break;
            default:
                ?? r0 = this.t.g;
                if (r0 != 0) {
                    r0.invoke();
                }
                fgq.v(this.s);
                break;
        }
        return Unit.a;
    }
}
