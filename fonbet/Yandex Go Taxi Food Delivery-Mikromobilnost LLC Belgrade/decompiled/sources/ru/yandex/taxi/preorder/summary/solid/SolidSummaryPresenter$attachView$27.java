package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.address.models.Address;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6t0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$27", f = "SolidSummaryPresenter.kt", l = {1116}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$27 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lcom/yandex/go/address/models/Address;", "sourceAddress", "Lkotlin/Triple;", "", "Lpex0;", "<anonymous>", "(Lfnx0;Lcom/yandex/go/address/models/Address;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$27$2", f = "SolidSummaryPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$27$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, l lVar) {
            super(3, continuation);
            this.this$0 = lVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.this$0);
            anonymousClass2.L$0 = (fnx0) obj;
            anonymousClass2.L$1 = (Address) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            fnx0 fnx0Var = (fnx0) this.L$0;
            Address address = (Address) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Triple(Boolean.valueOf(this.this$0.H0.a(fnx0Var.c)), address, fnx0Var.c);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$27(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$attachView$27(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$attachView$27) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.X(new m0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.x).j.b(), new j(this.this$0.I0.f()), new AnonymousClass2(null, this.this$0)), new SolidSummaryPresenter$attachView$27$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new SolidSummaryPresenter$attachView$27$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            x6t0 x6t0Var = new x6t0();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(x6t0Var, this) == coroutineSingletons) {
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
