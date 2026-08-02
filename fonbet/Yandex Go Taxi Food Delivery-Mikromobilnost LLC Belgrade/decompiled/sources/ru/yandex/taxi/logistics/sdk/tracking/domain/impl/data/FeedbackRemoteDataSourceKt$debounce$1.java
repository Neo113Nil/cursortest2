package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.st2;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1", f = "FeedbackRemoteDataSource.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackRemoteDataSourceKt$debounce$1 extends SuspendLambda implements wls {
    final /* synthetic */ st2 $appDispatchers;
    final /* synthetic */ tpr $this_debounce;
    final /* synthetic */ long $waitMillis;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1$1", f = "FeedbackRemoteDataSource.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ st2 $appDispatchers;
        final /* synthetic */ tpr $this_debounce;
        final /* synthetic */ long $waitMillis;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, st2 st2Var, long j, vpr vprVar, Continuation continuation) {
            super(2, continuation);
            this.$this_debounce = tprVar;
            this.$appDispatchers = st2Var;
            this.$waitMillis = j;
            this.$$this$flow = vprVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_debounce, this.$appDispatchers, this.$waitMillis, this.$$this$flow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                fse coroutineContext = tseVar.getCoroutineContext();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                tpr tprVar = this.$this_debounce;
                c cVar = new c(ref$ObjectRef, tseVar, this.$appDispatchers, this.$waitMillis, coroutineContext, this.$$this$flow);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (tprVar.collect(cVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackRemoteDataSourceKt$debounce$1(tpr tprVar, st2 st2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_debounce = tprVar;
        this.$appDispatchers = st2Var;
        this.$waitMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedbackRemoteDataSourceKt$debounce$1 feedbackRemoteDataSourceKt$debounce$1 = new FeedbackRemoteDataSourceKt$debounce$1(this.$this_debounce, this.$appDispatchers, this.$waitMillis, continuation);
        feedbackRemoteDataSourceKt$debounce$1.L$0 = obj;
        return feedbackRemoteDataSourceKt$debounce$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackRemoteDataSourceKt$debounce$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_debounce, this.$appDispatchers, this.$waitMillis, vprVar, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
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
