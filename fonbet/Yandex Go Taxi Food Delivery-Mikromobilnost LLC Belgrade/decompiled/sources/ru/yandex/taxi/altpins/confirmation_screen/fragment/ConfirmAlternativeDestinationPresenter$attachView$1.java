package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import defpackage.cwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v2e;
import defpackage.wls;
import defpackage.x2e;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.models.OptionType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$attachView$1", f = "ConfirmAlternativeDestinationPresenter.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ConfirmAlternativeDestinationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ x2e $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v2e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/altpins/models/OptionType;", ClidProvider.STATE, "<unused var>", "Lru/yandex/taxi/theme/ThemeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$attachView$1$1", f = "ConfirmAlternativeDestinationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (OptionType) obj;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OptionType optionType = (OptionType) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return optionType;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAlternativeDestinationPresenter$attachView$1(v2e v2eVar, x2e x2eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v2eVar;
        this.$mvpView = x2eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmAlternativeDestinationPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmAlternativeDestinationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            v2e v2eVar = this.this$0;
            g X = e.X(new m0(v2eVar.D, v2eVar.C.a(), new AnonymousClass1(3, null)), new ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            x2e x2eVar = this.$mvpView;
            o oVar = new o(X, new ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            cwc cwcVar = new cwc(4, x2eVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(cwcVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
