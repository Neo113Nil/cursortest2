package defpackage;

import defpackage.okq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@we7(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lokq$a;", "msg", "", "<anonymous>", "(Lokq$a;)V"}, k = 3, mv = {1, 5, 1})
/* renamed from: rkq, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
final class C0959rkq extends aur implements Function2<okq.a<Object>, Continuation<? super Unit>, Object> {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ okq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0959rkq(okq okqVar, Continuation continuation) {
        super(2, continuation);
        this.l = okqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        C0959rkq c0959rkq = new C0959rkq(this.l, continuation);
        c0959rkq.k = obj;
        return c0959rkq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0959rkq) create((okq.a) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (defpackage.okq.b(r4, (okq.a.b) r6, r5) == r0) goto L40;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            okq.a aVar = (okq.a) this.k;
            boolean z = aVar instanceof okq.a.C0021a;
            okq okqVar = this.l;
            if (z) {
                okq.a.C0021a c0021a = (okq.a.C0021a) aVar;
                this.j = 1;
                odr odrVar = (odr) okqVar.g.getValue();
                if (!(odrVar instanceof r97)) {
                    if (odrVar instanceof qjn) {
                        if (odrVar == c0021a.a) {
                            obj2 = okqVar.f(this);
                            if (obj2 != nm6Var) {
                                obj2 = Unit.a;
                            }
                        }
                    } else if (Intrinsics.d(odrVar, zht.a)) {
                        obj2 = okqVar.f(this);
                        if (obj2 != nm6Var) {
                            obj2 = Unit.a;
                        }
                    } else if (odrVar instanceof pdc) {
                        xq0.q("Can't read in final state.");
                        return null;
                    }
                }
                obj2 = Unit.a;
            } else if (aVar instanceof okq.a.b) {
                this.j = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
