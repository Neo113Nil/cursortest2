package ru.yandex.taxi.masstransit.domain;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luu30;", "<anonymous>", "(Ltse;)Luu30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtVerticalsInteractor$observeTransportVertical$2", f = "MtVerticalsInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtVerticalsInteractor$observeTransportVertical$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luu30;", "it", "", "<anonymous>", "(Luu30;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.domain.MtVerticalsInteractor$observeTransportVertical$2$1", f = "MtVerticalsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.domain.MtVerticalsInteractor$observeTransportVertical$2$1, reason: invalid class name */
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
            return ((AnonymousClass1) create((uu30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            uu30 uu30Var = (uu30) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = uu30Var.a;
            return Boolean.valueOf((zoneAddress != null ? zoneAddress.b : null) != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtVerticalsInteractor$observeTransportVertical$2(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtVerticalsInteractor$observeTransportVertical$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtVerticalsInteractor$observeTransportVertical$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        gci0 d = kotlinx.coroutines.flow.e.d(this.this$0.b.b);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        this.label = 1;
        Object x = kotlinx.coroutines.flow.e.x(d, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
