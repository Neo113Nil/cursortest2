package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.byk0;
import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.wls;
import defpackage.yos0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.SliderButtonKt$SliderHandler$2$1$3$1", f = "SliderButton.kt", l = {216, 226}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SliderButtonKt$SliderHandler$2$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatedOffset;
    final /* synthetic */ tx40 $manualOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderButtonKt$SliderHandler$2$1$3$1(androidx.compose.animation.core.a aVar, tx40 tx40Var, Continuation continuation) {
        super(2, continuation);
        this.$animatedOffset = aVar;
        this.$manualOffset$delegate = tx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderButtonKt$SliderHandler$2$1$3$1(this.$animatedOffset, this.$manualOffset$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderButtonKt$SliderHandler$2$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r11.f(r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (androidx.compose.animation.core.a.d(r4, r5, r6, null, null, r9, 12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SliderButtonKt$SliderHandler$2$1$3$1 sliderButtonKt$SliderHandler$2$1$3$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.$animatedOffset;
            tx40 tx40Var = this.$manualOffset$delegate;
            byk0 byk0Var = yos0.a;
            Float f = new Float(-tx40Var.getFloatValue());
            ck11 K = sb2.K(300, 0, ubn.a, 2);
            this.label = 1;
            sliderButtonKt$SliderHandler$2$1$3$1 = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            sliderButtonKt$SliderHandler$2$1$3$1 = this;
        }
        tx40 tx40Var2 = sliderButtonKt$SliderHandler$2$1$3$1.$manualOffset$delegate;
        byk0 byk0Var2 = yos0.a;
        tx40Var2.setFloatValue(0.0f);
        androidx.compose.animation.core.a aVar2 = sliderButtonKt$SliderHandler$2$1$3$1.$animatedOffset;
        Float f2 = new Float(0.0f);
        sliderButtonKt$SliderHandler$2$1$3$1.label = 2;
    }
}
