package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.st2;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSource$1", f = "FeedbackRemoteDataSource.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackRemoteDataSource$1 extends SuspendLambda implements wls {
    final /* synthetic */ st2 $appDispatchers;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackRemoteDataSource$1(b bVar, st2 st2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$appDispatchers = st2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackRemoteDataSource$1(this.this$0, this.$appDispatchers, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackRemoteDataSource$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr o = kotlinx.coroutines.flow.e.o(new mth(new rol0(new FeedbackRemoteDataSourceKt$debounce$1(this.this$0.b, this.$appDispatchers, 3000L, null)), 6));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (o.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
