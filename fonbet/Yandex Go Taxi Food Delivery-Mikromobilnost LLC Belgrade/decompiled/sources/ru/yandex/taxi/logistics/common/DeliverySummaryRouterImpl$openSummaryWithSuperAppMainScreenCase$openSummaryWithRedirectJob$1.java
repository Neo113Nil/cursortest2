package ru.yandex.taxi.logistics.common;

import com.yandex.go.taxi.tariffs.internal.repository.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.fre0;
import defpackage.h55;
import defpackage.m950;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.common.DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1", f = "DeliverySummaryRouterImpl.kt", l = {275}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ fre0 $summaryRouter;
    final /* synthetic */ String $tariffClass;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lza31;", "it", "", "<anonymous>", "(Ljava/util/List;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.common.DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1$1", f = "DeliverySummaryRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.common.DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return Boolean.valueOf(!list.isEmpty());
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1(a aVar, String str, fre0 fre0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffClass = str;
        this.$summaryRouter = fre0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1(this.this$0, this.$tariffClass, this.$summaryRouter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliverySummaryRouterImpl$openSummaryWithSuperAppMainScreenCase$openSummaryWithRedirectJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            h i2 = ((k) this.this$0.c).i();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
            if (e.x(i2, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar = this.this$0;
        String str = this.$tariffClass;
        m950 m950Var = this.$summaryRouter;
        mi31 a = aVar.l.a(str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, null);
        zy11 zy11Var = zy11.a;
        if (a != null) {
            aVar.i.c(SelectionOrigin.DELIVERY_CANCEL, a.a, true);
            return zy11Var;
        }
        ((h55) m950Var).i();
        return zy11Var;
    }
}
