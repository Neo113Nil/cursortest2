package ru.yandex.taxi.settings.presentation.menu_item;

import defpackage.iae0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Liae0;", "experiment", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Liae0;)Liae0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.presentation.menu_item.PushDisabledMenuItemPresenter$attachView$1", f = "PushDisabledMenuItemPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushDisabledMenuItemPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PushDisabledMenuItemPresenter$attachView$1 pushDisabledMenuItemPresenter$attachView$1 = new PushDisabledMenuItemPresenter$attachView$1(3, (Continuation) obj3);
        pushDisabledMenuItemPresenter$attachView$1.L$0 = (iae0) obj2;
        return pushDisabledMenuItemPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iae0 iae0Var = (iae0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return iae0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
