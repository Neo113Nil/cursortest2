package ru.yandex.taxi.clarifypoint;

import defpackage.dbl0;
import defpackage.lyb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.clarifypoint.ClarifyPointControllerImpl$subscribeToRouteStats$2", f = "ClarifyPointControllerImpl.kt", l = {219}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ClarifyPointControllerImpl$subscribeToRouteStats$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<tpr> $routeStatsFlow;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldbl0;", "it", "Lvyb;", "<anonymous>", "(Ldbl0;)Lvyb;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.clarifypoint.ClarifyPointControllerImpl$subscribeToRouteStats$2$1", f = "ClarifyPointControllerImpl.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.clarifypoint.ClarifyPointControllerImpl$subscribeToRouteStats$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, b bVar) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((dbl0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ru.yandex.taxi.persuggest.clarifypoints.a aVar = this.this$0.f;
            this.label = 1;
            Object a = aVar.a(this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClarifyPointControllerImpl$subscribeToRouteStats$2(Ref$ObjectRef ref$ObjectRef, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$routeStatsFlow = ref$ObjectRef;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClarifyPointControllerImpl$subscribeToRouteStats$2(this.$routeStatsFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClarifyPointControllerImpl$subscribeToRouteStats$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(e.I(this.$routeStatsFlow.element, new AnonymousClass1(null, this.this$0)), new ClarifyPointControllerImpl$subscribeToRouteStats$2$invokeSuspend$$inlined$safeCollect$1(null, this.this$0));
            lyb lybVar = new lyb();
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(lybVar, this) == coroutineSingletons) {
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
