package ru.yandex.taxi.search.presenter;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.cvw;
import defpackage.irg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.presenter.BaseAddressSearchPresenter$setViewShadow$1", f = "BaseAddressSearchPresenter.kt", l = {147}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseAddressSearchPresenter$setViewShadow$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddressSearchPresenter$setViewShadow$1(f fVar, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseAddressSearchPresenter$setViewShadow$1(this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAddressSearchPresenter$setViewShadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.design.utils.b bVar = this.this$0.B;
            int i2 = irg0.block_v2_corner_radius;
            this.label = 1;
            obj = bVar.a(tje.r(i2, bVar.a), true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        cvw.c0(this.$view, (Drawable) obj);
        return zy11.a;
    }
}
