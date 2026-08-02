package defpackage;

import defpackage.okq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lrjc;", "", "<anonymous>", "(Lrjc;)V"}, k = 3, mv = {1, 5, 1})
/* renamed from: wkq, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
final class C1319wkq extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ okq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319wkq(okq okqVar, Continuation continuation) {
        super(2, continuation);
        this.l = okqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        C1319wkq c1319wkq = new C1319wkq(this.l, continuation);
        c1319wkq.k = obj;
        return c1319wkq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1319wkq) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        okq okqVar = this.l;
        xdr xdrVar = okqVar.g;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.k;
            odr odrVar = (odr) xdrVar.getValue();
            if (!(odrVar instanceof r97)) {
                okqVar.i.a(new okq.a.C0021a(odrVar));
            }
            vkq vkqVar = new vkq(new clc(xdrVar, new C1317skq(odrVar, null), 3));
            this.j = 1;
            if (zsd.e0(rjcVar, vkqVar, this) == nm6Var) {
                return nm6Var;
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
