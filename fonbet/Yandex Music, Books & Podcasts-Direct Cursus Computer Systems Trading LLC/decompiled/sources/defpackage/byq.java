package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class byq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ dyq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byq(dyq dyqVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = dyqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new byq(this.k, continuation, 0);
            default:
                return new byq(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((byq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((byq) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object[] objArr = 0;
        Continuation continuation = null;
        dyq dyqVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                xdr xdrVar = dyqVar.k;
                Context context = dyqVar.a;
                v3w.n(jo0.D(context) || jo0.b(context), xdrVar, null);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                x97.y(dyqVar.d, null, null, new byq(dyqVar, continuation, objArr == true ? 1 : 0), 3);
                break;
        }
        return Unit.a;
    }
}
