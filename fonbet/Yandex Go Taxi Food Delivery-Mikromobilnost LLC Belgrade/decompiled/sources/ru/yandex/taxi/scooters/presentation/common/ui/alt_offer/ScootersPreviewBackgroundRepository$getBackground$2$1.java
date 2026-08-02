package ru.yandex.taxi.scooters.presentation.common.ui.alt_offer;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/LayerDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/LayerDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.ScootersPreviewBackgroundRepository$getBackground$2$1", f = "ScootersPreviewBackgroundRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPreviewBackgroundRepository$getBackground$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isCompoundDrawable;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewBackgroundRepository$getBackground$2$1(boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$isCompoundDrawable = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreviewBackgroundRepository$getBackground$2$1(this.$isCompoundDrawable, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreviewBackgroundRepository$getBackground$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean z = this.$isCompoundDrawable;
        a aVar = this.this$0;
        if (!z) {
            Drawable[] drawableArr = {a.a(aVar, qje.t(xng0.bgMain, aVar.a), true)};
            a aVar2 = this.this$0;
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            layerDrawable.setLayerInsetTop(0, aVar2.d);
            this.this$0.f = layerDrawable;
            return layerDrawable;
        }
        Drawable a = a.a(aVar, qje.t(xng0.bgMinor, aVar.a), true);
        a aVar3 = this.this$0;
        Drawable[] drawableArr2 = {a, a.a(aVar3, qje.t(xng0.bgMain, aVar3.a), false)};
        a aVar4 = this.this$0;
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        layerDrawable2.setLayerInsetTop(0, aVar4.d);
        layerDrawable2.setLayerInsetTop(1, aVar4.d);
        layerDrawable2.setLayerInsetBottom(1, tje.u(56, aVar4.a));
        this.this$0.g = layerDrawable2;
        return layerDrawable2;
    }
}
