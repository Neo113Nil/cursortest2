package ru.yandex.taxi.plus.sdk.prefetch;

import com.yandex.go.plus.experiment.PlusModeExperiment;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.d6d0;
import defpackage.jbh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.cashback.interactors.d;
import ru.yandex.taxi.cashback.interactors.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.prefetch.PlusDataPrefetchInteractorImpl$prefetch$1", f = "PlusDataPrefetchInteractorImpl.kt", l = {25, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusDataPrefetchInteractorImpl$prefetch$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusDataPrefetchInteractorImpl$prefetch$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusDataPrefetchInteractorImpl$prefetch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusDataPrefetchInteractorImpl$prefetch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (ru.yandex.taxi.plus.sdk.prefetch.a.a(r1, (java.lang.String) r10, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            d6d0 d6d0Var = aVar.d;
            this.L$0 = aVar;
            this.label = 1;
            obj = e.y(e.K(new ru.yandex.taxi.cashback.interactors.b(((jbh) d6d0Var.a).c(PlusModeExperiment.d).a(), d6d0Var), new f(new mth(new d(((e0) d6d0Var.b).g), 6), d6d0Var)), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
