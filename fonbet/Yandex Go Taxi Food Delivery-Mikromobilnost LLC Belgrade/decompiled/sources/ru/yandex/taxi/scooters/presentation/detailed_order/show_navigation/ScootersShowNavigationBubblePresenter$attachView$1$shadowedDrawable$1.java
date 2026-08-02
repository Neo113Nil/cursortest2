package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import defpackage.fwo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1", f = "ScootersShowNavigationBubblePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $height;
    final /* synthetic */ GradientDrawable $original;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ fwo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1(GradientDrawable gradientDrawable, int i, int i2, fwo0 fwo0Var, Continuation continuation) {
        super(2, continuation);
        this.$original = gradientDrawable;
        this.$width = i;
        this.$height = i2;
        this.this$0 = fwo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1(this.$original, this.$width, this.$height, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShowNavigationBubblePresenter$attachView$1$shadowedDrawable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$original.setSize(this.$width, this.$height);
        fwo0 fwo0Var = this.this$0;
        ru.yandex.taxi.design.utils.a aVar = fwo0Var.A;
        GradientDrawable gradientDrawable = this.$original;
        Context context = fwo0Var.x;
        int i = xng0.effectShadowBottom;
        float w = tje.w(8, context);
        float w2 = tje.w(20, context);
        int u = qje.u(context.getTheme(), i);
        aVar.getClass();
        return aVar.e(gradientDrawable, 0.0f, w, w2, u, true);
    }
}
