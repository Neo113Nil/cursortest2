package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.byk0;
import defpackage.ck11;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tje;
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
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.SliderButtonKt$SliderHandler$2$1$2$1", f = "SliderButton.kt", l = {185, 200, 211}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SliderButtonKt$SliderHandler$2$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $alpha;
    final /* synthetic */ androidx.compose.animation.core.a $animatedOffset;
    final /* synthetic */ m3u0 $hasReachedThreshold$delegate;
    final /* synthetic */ tx40 $manualOffset$delegate;
    final /* synthetic */ float $maxDragPx;
    final /* synthetic */ sls $onCompleted;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.SliderButtonKt$SliderHandler$2$1$2$1$1", f = "SliderButton.kt", l = {194}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.ui.component.control.SliderButtonKt$SliderHandler$2$1$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ androidx.compose.animation.core.a $alpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a aVar, Continuation continuation) {
            super(2, continuation);
            this.$alpha = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$alpha, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.animation.core.a aVar = this.$alpha;
                Float f = new Float(1.0f);
                this.label = 1;
                if (androidx.compose.animation.core.a.d(aVar, f, null, null, null, this, 14) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderButtonKt$SliderHandler$2$1$2$1(androidx.compose.animation.core.a aVar, float f, sls slsVar, m3u0 m3u0Var, tx40 tx40Var, androidx.compose.animation.core.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.$animatedOffset = aVar;
        this.$maxDragPx = f;
        this.$onCompleted = slsVar;
        this.$hasReachedThreshold$delegate = m3u0Var;
        this.$manualOffset$delegate = tx40Var;
        this.$alpha = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderButtonKt$SliderHandler$2$1$2$1 sliderButtonKt$SliderHandler$2$1$2$1 = new SliderButtonKt$SliderHandler$2$1$2$1(this.$animatedOffset, this.$maxDragPx, this.$onCompleted, this.$hasReachedThreshold$delegate, this.$manualOffset$delegate, this.$alpha, continuation);
        sliderButtonKt$SliderHandler$2$1$2$1.L$0 = obj;
        return sliderButtonKt$SliderHandler$2$1$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderButtonKt$SliderHandler$2$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        if (r14.f(r0, r12) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (androidx.compose.animation.core.a.d(r7, r8, r9, null, null, r12, 12) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (androidx.compose.animation.core.a.d(r7, r8, r9, null, null, r12, 12) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SliderButtonKt$SliderHandler$2$1$2$1 sliderButtonKt$SliderHandler$2$1$2$1;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m3u0 m3u0Var = this.$hasReachedThreshold$delegate;
            byk0 byk0Var = yos0.a;
            boolean booleanValue = ((Boolean) m3u0Var.getValue()).booleanValue();
            androidx.compose.animation.core.a aVar = this.$animatedOffset;
            if (booleanValue) {
                Float f = new Float(this.$maxDragPx - this.$manualOffset$delegate.getFloatValue());
                ck11 K = sb2.K(300, 0, ubn.a, 2);
                this.L$0 = tseVar;
                this.label = 1;
                sliderButtonKt$SliderHandler$2$1$2$1 = this;
            } else {
                sliderButtonKt$SliderHandler$2$1$2$1 = this;
                Float f2 = new Float(-sliderButtonKt$SliderHandler$2$1$2$1.$manualOffset$delegate.getFloatValue());
                ck11 K2 = sb2.K(300, 0, ubn.a, 2);
                sliderButtonKt$SliderHandler$2$1$2$1.L$0 = null;
                sliderButtonKt$SliderHandler$2$1$2$1.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            sliderButtonKt$SliderHandler$2$1$2$1 = this;
            tje.N(tseVar, null, null, new AnonymousClass1(sliderButtonKt$SliderHandler$2$1$2$1.$alpha, null), 3);
            sliderButtonKt$SliderHandler$2$1$2$1.$onCompleted.invoke();
            tx40 tx40Var = sliderButtonKt$SliderHandler$2$1$2$1.$manualOffset$delegate;
            byk0 byk0Var2 = yos0.a;
            tx40Var.setFloatValue(0.0f);
            androidx.compose.animation.core.a aVar2 = sliderButtonKt$SliderHandler$2$1$2$1.$animatedOffset;
            Float f3 = new Float(0.0f);
            sliderButtonKt$SliderHandler$2$1$2$1.L$0 = null;
            sliderButtonKt$SliderHandler$2$1$2$1.label = 3;
        } else if (i == 2) {
            kotlin.b.b(obj);
            sliderButtonKt$SliderHandler$2$1$2$1 = this;
            tx40 tx40Var2 = sliderButtonKt$SliderHandler$2$1$2$1.$manualOffset$delegate;
            byk0 byk0Var22 = yos0.a;
            tx40Var2.setFloatValue(0.0f);
            androidx.compose.animation.core.a aVar22 = sliderButtonKt$SliderHandler$2$1$2$1.$animatedOffset;
            Float f32 = new Float(0.0f);
            sliderButtonKt$SliderHandler$2$1$2$1.L$0 = null;
            sliderButtonKt$SliderHandler$2$1$2$1.label = 3;
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
