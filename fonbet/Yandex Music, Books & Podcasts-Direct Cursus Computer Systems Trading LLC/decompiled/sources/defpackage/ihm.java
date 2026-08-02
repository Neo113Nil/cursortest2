package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ihm extends uif implements Function0 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ long s;
    public final /* synthetic */ wqn t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihm(long j, mgs mgsVar, wqn wqnVar, long j2, ywg ywgVar) {
        super(0);
        this.s = j;
        this.v = mgsVar;
        this.t = wqnVar;
        this.u = j2;
        this.w = ywgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                jhm jhmVar = (jhm) this.v;
                this.t.a = jhmVar.getPositionProvider().a((aqe) this.w, this.s, jhmVar.getParentLayoutDirection(), this.u);
                break;
            default:
                ywg ywgVar = (ywg) this.w;
                mgs mgsVar = (mgs) this.v;
                long d = this.s - mgsVar.d();
                mgsVar.c();
                wqn wqnVar = this.t;
                wqnVar.a--;
                if (1 <= d && d < this.u) {
                    mgsVar.b();
                    mgsVar.i(d, d, new ncs(4, ywgVar));
                } else if (d <= 0) {
                    ywgVar.invoke();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihm(wqn wqnVar, jhm jhmVar, aqe aqeVar, long j, long j2) {
        super(0);
        this.t = wqnVar;
        this.v = jhmVar;
        this.w = aqeVar;
        this.s = j;
        this.u = j2;
    }
}
