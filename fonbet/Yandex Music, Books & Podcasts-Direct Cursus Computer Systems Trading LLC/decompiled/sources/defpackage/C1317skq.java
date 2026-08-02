package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lodr;", "it", "", "<anonymous>", "(Lodr;)Z"}, k = 3, mv = {1, 5, 1})
/* renamed from: skq, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
final class C1317skq extends aur implements Function2<odr<Object>, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object j;
    public final /* synthetic */ odr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317skq(odr odrVar, Continuation continuation) {
        super(2, continuation);
        this.k = odrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        C1317skq c1317skq = new C1317skq(this.k, continuation);
        c1317skq.j = obj;
        return c1317skq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1317skq) create((odr) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        odr odrVar = (odr) this.j;
        odr odrVar2 = this.k;
        boolean z = false;
        if (!(odrVar2 instanceof r97) && !(odrVar2 instanceof pdc) && odrVar == odrVar2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
