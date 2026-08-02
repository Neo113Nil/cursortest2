package ru.yandex.taxi.main_screen_custom.presentation;

import defpackage.e3s0;
import defpackage.gqf0;
import defpackage.mnf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main_screen_custom.presentation.PromoOverMapViewPresenter$promoClicked$1", f = "PromoOverMapViewPresenter.kt", l = {206}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PromoOverMapViewPresenter$promoClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ mnf0 $config;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoOverMapViewPresenter$promoClicked$1(v vVar, mnf0 mnf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$config = mnf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoOverMapViewPresenter$promoClicked$1(this.this$0, this.$config, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoOverMapViewPresenter$promoClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e3s0 e3s0Var = this.this$0.J;
            gqf0 gqf0Var = this.$config.b;
            this.label = 1;
            if (((com.yandex.go.shortcuts.impl.b) e3s0Var).b(gqf0Var, this) == coroutineSingletons) {
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
