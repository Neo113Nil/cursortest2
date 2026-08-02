package ru.yandex.taxi.altpins.source.overlay;

import defpackage.d02;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zz1;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.source.overlay.AltpinSourceOverlayPresenter$attachView$1", f = "AltpinSourceOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinSourceOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ d02 $mvpView;
    int label;
    final /* synthetic */ zz1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinSourceOverlayPresenter$attachView$1(d02 d02Var, zz1 zz1Var, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = d02Var;
        this.this$0 = zz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltpinSourceOverlayPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AltpinSourceOverlayPresenter$attachView$1 altpinSourceOverlayPresenter$attachView$1 = (AltpinSourceOverlayPresenter$attachView$1) create((ThemeType) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        altpinSourceOverlayPresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$mvpView.w1(this.this$0.x);
        return zy11.a;
    }
}
