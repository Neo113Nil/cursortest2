package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ywg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywg(int i, long j, Object obj, Object obj2) {
        super(0);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.s = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vwg Z0;
        switch (this.r) {
            case 0:
                qpf qpfVar = ((zwg) this.t).f;
                jsk jskVar = null;
                if (quj.Y(qpfVar.a) || qpfVar.c) {
                    f8j f8jVar = qpfVar.a().n;
                    if (f8jVar != null) {
                        jskVar = f8jVar.i;
                    }
                } else {
                    f8j f8jVar2 = qpfVar.a().n;
                    if (f8jVar2 != null && (Z0 = f8jVar2.Z0()) != null) {
                        jskVar = Z0.i;
                    }
                }
                if (jskVar == null) {
                    jskVar = ((uzj) this.u).getPlacementScope();
                }
                vwg Z02 = qpfVar.a().Z0();
                Z02.getClass();
                jsk.f(jskVar, Z02, this.s);
                break;
            default:
                mgs mgsVar = (mgs) this.u;
                long j = ((wqn) this.t).a;
                long j2 = this.s;
                if (j > 0) {
                    mgsVar.e.invoke(Long.valueOf(j2));
                }
                mgsVar.d.invoke(Long.valueOf(j2));
                mgsVar.b();
                mgsVar.f();
                mgsVar.k = 1;
                break;
        }
        return Unit.a;
    }
}
