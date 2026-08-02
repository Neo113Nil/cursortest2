package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class kuw extends aur implements Function2 {
    public int j;
    public final /* synthetic */ fuw k;
    public final /* synthetic */ enj l;
    public final /* synthetic */ float m;
    public final /* synthetic */ enj n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuw(fuw fuwVar, enj enjVar, float f, enj enjVar2, long j, Continuation continuation) {
        super(2, continuation);
        this.k = fuwVar;
        this.l = enjVar;
        this.m = f;
        this.n = enjVar2;
        this.o = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new kuw(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kuw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2 = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            long j = this.l.a;
            long j2 = this.n.a;
            this.j = 1;
            fuw fuwVar = this.k;
            fuwVar.getClass();
            Object Q = gld.Q(new auw(fuwVar, this.m, j2, j, this.o, null), this);
            if (Q != obj2) {
                Q = Unit.a;
            }
            if (Q == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
