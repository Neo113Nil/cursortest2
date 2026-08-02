package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmm6;", "", "<anonymous>", "(Lmm6;)V"}, k = 3, mv = {1, 5, 1})
/* renamed from: aiq, reason: from Kotlin metadata */
/* loaded from: classes.dex */
final class T extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public Object j;
    public int k;
    public final /* synthetic */ biq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(biq biqVar, Continuation continuation) {
        super(2, continuation);
        this.l = biqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r3.invoke(r8, r7) == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r8 != r2) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        biq biqVar = this.l;
        AtomicInteger atomicInteger = biqVar.d;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (atomicInteger.get() <= 0) {
                xq0.q("Check failed.");
                return null;
            }
            saf.K(biqVar.a.getCoroutineContext());
            function2 = biqVar.b;
            zi3 zi3Var = biqVar.c;
            this.j = function2;
            this.k = 1;
            obj = zi3Var.l(this);
        } else if (i == 1) {
            function2 = (Function2) this.j;
            qgg.h0(obj);
            this.j = null;
            this.k = 2;
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return Unit.a;
            }
            saf.K(biqVar.a.getCoroutineContext());
            function2 = biqVar.b;
            zi3 zi3Var2 = biqVar.c;
            this.j = function2;
            this.k = 1;
            obj = zi3Var2.l(this);
        }
    }
}
