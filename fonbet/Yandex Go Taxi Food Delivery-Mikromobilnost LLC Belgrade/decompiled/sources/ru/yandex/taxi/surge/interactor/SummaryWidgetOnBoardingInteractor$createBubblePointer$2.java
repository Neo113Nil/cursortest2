package ru.yandex.taxi.surge.interactor;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.dzg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/LayerDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/LayerDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetOnBoardingInteractor$createBubblePointer$2", f = "SummaryWidgetOnBoardingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetOnBoardingInteractor$createBubblePointer$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetOnBoardingInteractor$createBubblePointer$2(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryWidgetOnBoardingInteractor$createBubblePointer$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetOnBoardingInteractor$createBubblePointer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Context context = this.this$0.e;
        int i = xng0.effectShadowBottom;
        float w = tje.w(8, context);
        float w2 = tje.w(20, context);
        int u = qje.u(context.getTheme(), i);
        Drawable mutate = tje.y(dzg0.bubble_default_pointer, this.this$0.e).mutate();
        mutate.setTint(qje.t(xng0.bgMain, this.this$0.e));
        ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) this.this$0.a.c.get();
        aVar.getClass();
        BitmapDrawable e = aVar.e(mutate, 0.0f, w, w2, u, true);
        int d = aVar.d(mutate);
        int b = aVar.b(mutate);
        float f = ru.yandex.taxi.design.utils.a.f(w2, 0.0f);
        float f2 = ru.yandex.taxi.design.utils.a.f(w2, w);
        int g = ru.yandex.taxi.design.utils.a.g(w2, d, f);
        int g2 = ru.yandex.taxi.design.utils.a.g(w2, b, f2);
        int c = (int) ru.yandex.taxi.design.utils.a.c(w2, 0.0f);
        int c2 = (int) ru.yandex.taxi.design.utils.a.c(w2, w);
        Rect rect = new Rect(c, c2, g - (d + c), g2 - (b + c2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{e});
        layerDrawable.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return layerDrawable;
    }
}
