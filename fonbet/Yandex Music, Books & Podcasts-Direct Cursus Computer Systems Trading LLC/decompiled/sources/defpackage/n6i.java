package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class n6i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j7i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6i(j7i j7iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j7iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                n6i n6iVar = new n6i(this.l, continuation, 0);
                n6iVar.k = obj;
                return n6iVar;
            default:
                n6i n6iVar2 = new n6i(this.l, continuation, 1);
                n6iVar2.k = obj;
                return n6iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vat vatVar = (vat) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((n6i) create(vatVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        j7i j7iVar = this.l;
        switch (i) {
            case 0:
                vat vatVar = (vat) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                xdr xdrVar = j7iVar.z;
                b0p b0pVar = ((a0p) ((Pair) vatVar.a).b).d;
                xdrVar.getClass();
                xdrVar.m(null, b0pVar);
                break;
            default:
                vat vatVar2 = (vat) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                j7iVar.x = (af5) vatVar2.c;
                break;
        }
        return Unit.a;
    }
}
