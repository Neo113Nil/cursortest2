package ru.yandex.taxi.masstransit.geopayment.stopselector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.s340;
import defpackage.tiu0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wiu0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorPresenter$attachView$2", f = "MtStopSelectorPresenter.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopSelectorPresenter$attachView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ s340 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lwiu0;", "stopsUIState", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lwiu0;)Lwiu0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorPresenter$attachView$2$1", f = "MtStopSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorPresenter$attachView$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (wiu0) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            wiu0 wiu0Var = (wiu0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return wiu0Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopSelectorPresenter$attachView$2(s340 s340Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s340Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopSelectorPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopSelectorPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.D.a();
            tiu0 tiu0Var = this.this$0.E;
            m0 m0Var = new m0(a, new d(new m0(kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) tiu0Var.a).d), tiu0Var.d, new StopsSelectorInteractor$uiState$1(3, null)), tiu0Var), new AnonymousClass1(3, null));
            pi00 pi00Var = new pi00(25, this.this$0);
            this.label = 1;
            if (m0Var.collect(pi00Var, this) == coroutineSingletons) {
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
