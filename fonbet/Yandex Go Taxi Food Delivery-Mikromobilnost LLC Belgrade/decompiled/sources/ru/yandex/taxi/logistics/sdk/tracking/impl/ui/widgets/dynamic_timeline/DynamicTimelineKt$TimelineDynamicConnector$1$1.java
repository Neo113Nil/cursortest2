package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.ubn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.DynamicTimelineKt$TimelineDynamicConnector$1$1", f = "DynamicTimeline.kt", l = {208, 209}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicTimelineKt$TimelineDynamicConnector$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ androidx.compose.animation.core.a $progressValue;
    final /* synthetic */ long $timeToFinish;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTimelineKt$TimelineDynamicConnector$1$1(boolean z, androidx.compose.animation.core.a aVar, float f, long j, Continuation continuation) {
        super(2, continuation);
        this.$isActive = z;
        this.$progressValue = aVar;
        this.$initialProgress = f;
        this.$timeToFinish = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicTimelineKt$TimelineDynamicConnector$1$1(this.$isActive, this.$progressValue, this.$initialProgress, this.$timeToFinish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicTimelineKt$TimelineDynamicConnector$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (androidx.compose.animation.core.a.d(r4, r5, r6, null, null, r11, 12) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r12.f(r4, r11) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isActive) {
                androidx.compose.animation.core.a aVar = this.$progressValue;
                Float f = new Float(this.$initialProgress);
                this.label = 1;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        androidx.compose.animation.core.a aVar2 = this.$progressValue;
        Float f2 = new Float(1.0f);
        ck11 K = sb2.K((int) this.$timeToFinish, 0, ubn.d, 2);
        this.label = 2;
    }
}
