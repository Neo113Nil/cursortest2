package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jxo extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxo(long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                jxo jxoVar = new jxo(this.l, continuation, 0);
                jxoVar.k = obj;
                return jxoVar;
            default:
                jxo jxoVar2 = new jxo(this.l, continuation, 1);
                jxoVar2.k = obj;
                return jxoVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((jxo) create((hyo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((jxo) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        long j = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                iyo iyoVar = ((hyo) this.k).a;
                iyo.a(iyoVar, iyoVar.j, j, 1);
                break;
            default:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                lpiVar.e();
                lpiVar.h(new hmm.a("show_time"), Long.valueOf(j));
                break;
        }
        return Unit.a;
    }
}
