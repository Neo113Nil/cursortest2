package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class euw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fuw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ euw(fuw fuwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fuwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                euw euwVar = new euw(this.l, continuation, 0);
                euwVar.k = obj;
                return euwVar;
            case 1:
                euw euwVar2 = new euw(this.l, continuation, 1);
                euwVar2.k = obj;
                return euwVar2;
            default:
                euw euwVar3 = new euw(this.l, continuation, 2);
                euwVar3.k = obj;
                return euwVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((euw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        fuw fuwVar = this.l;
        Continuation continuation = null;
        int i2 = 3;
        switch (i) {
            case 0:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                fuw fuwVar2 = this.l;
                x8a x8aVar = fuwVar2.k;
                x8aVar.getClass();
                long b = x8aVar.b(bzf.s(Float.MAX_VALUE, Float.MAX_VALUE));
                Continuation continuation2 = null;
                if (yzt.b(b) != 0.0f) {
                    x97.y(mm6Var, null, null, new ztw(fuwVar2, b, continuation2, 2), 3);
                }
                if (yzt.c(b) != 0.0f) {
                    x97.y(mm6Var, null, null, new ztw(fuwVar2, b, continuation2, 3), 3);
                }
                if (((Number) fuwVar2.d.e()).floatValue() < 1.0f) {
                    x97.y(mm6Var, null, null, new duw(fuwVar2, continuation2, 0), 3);
                }
                return Unit.a;
            case 1:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                x97.y(mm6Var2, null, null, new duw(fuwVar, continuation, 1), 3);
                x97.y(mm6Var2, null, null, new duw(fuwVar, continuation, 2), 3);
                x97.y(mm6Var2, null, null, new duw(fuwVar, continuation, i2), 3);
                x97.y(mm6Var2, null, null, new duw(fuwVar, continuation, 4), 3);
                return x97.y(mm6Var2, null, null, new duw(fuwVar, continuation, 5), 3);
            default:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return x97.y(mm6Var3, null, null, new duw(fuwVar, continuation, 6), 3);
        }
    }
}
