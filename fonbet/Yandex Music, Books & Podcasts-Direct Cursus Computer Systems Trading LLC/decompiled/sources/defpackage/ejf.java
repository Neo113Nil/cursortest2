package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ejf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejf(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                ejf ejfVar = new ejf(this.l, continuation, 0);
                ejfVar.k = obj;
                return ejfVar;
            default:
                ejf ejfVar2 = new ejf(this.l, continuation, 1);
                ejfVar2.k = obj;
                return ejfVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ejf) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ejf) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.l;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(StringsKt.M((CharSequence) pair.a, str, false));
            default:
                lpi lpiVar = (lpi) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                lpiVar.e();
                ec7.e(lpiVar, "splash", str);
                return Unit.a;
        }
    }
}
