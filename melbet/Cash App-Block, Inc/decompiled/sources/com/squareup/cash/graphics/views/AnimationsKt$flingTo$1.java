package com.squareup.cash.graphics.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AnimationsKt$flingTo$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Quat $dst;
    public final /* synthetic */ float $flingScale;
    public final /* synthetic */ SpringSpec $springSpec;
    public final /* synthetic */ Quat $this_flingTo;
    public final /* synthetic */ long $velocity;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.cash.graphics.views.AnimationsKt$flingTo$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ FlowCollector $$this$flow;
        public final /* synthetic */ Quat $dst;
        public final /* synthetic */ float $flingScale;
        public final /* synthetic */ SpringSpec $springSpec;
        public final /* synthetic */ Quat $this_flingTo;
        public final /* synthetic */ long $velocity;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Quat quat, Quat quat2, long j, FlowCollector flowCollector, float f, SpringSpec springSpec, Continuation continuation) {
            super(2, continuation);
            this.$this_flingTo = quat;
            this.$dst = quat2;
            this.$velocity = j;
            this.$$this$flow = flowCollector;
            this.$flingScale = f;
            this.$springSpec = springSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flingTo, this.$dst, this.$velocity, this.$$this$flow, this.$flingScale, this.$springSpec, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            final int i2 = 1;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                Quat quat = this.$this_flingTo;
                float[] eulerAngles = quat.toEulerAngles();
                float[] eulerAngles2 = this.$dst.toEulerAngles();
                long j = this.$velocity;
                float[] eulerAngles3 = quat.times(new Quat((float) Math.toRadians(-RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (j >> 32)), -15.0d, 15.0d)), AnimationsKt.Y_AXIS)).times(new Quat((float) Math.toRadians(-RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), -15.0d, 15.0d)), AnimationsKt.X_AXIS)).toEulerAngles();
                final int i3 = 0;
                final Animatable[] animatableArr = {AnimatableKt.Animatable(eulerAngles[0], 0.01f), AnimatableKt.Animatable(eulerAngles[1], 0.01f), AnimatableKt.Animatable(eulerAngles[2], 0.01f)};
                ArrayList arrayList = new ArrayList(3);
                int i4 = 0;
                int i5 = 0;
                while (i4 < 3) {
                    int i6 = i5 + 1;
                    float floatValue = ((Number) animatableArr[i4].getValue()).floatValue();
                    float f = eulerAngles2[i5] - floatValue;
                    float[] fArr = eulerAngles;
                    double d = f;
                    if (d > 3.141592653589793d) {
                        f -= 6.2831855f;
                    } else if (d < -3.141592653589793d) {
                        f += 6.2831855f;
                    }
                    arrayList.add(new Float(floatValue + f));
                    i4++;
                    eulerAngles = fArr;
                    i5 = i6;
                }
                float[] fArr2 = eulerAngles;
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                IntProgressionIterator it = intRange.iterator();
                while (it.hasNext) {
                    int nextInt = it.nextInt();
                    arrayList2.add(new Float((float) ((((((eulerAngles3[nextInt] - fArr2[nextInt]) + 3.141592653589793d) % 6.283185307179586d) + 6.283185307179586d) % 6.283185307179586d) - 3.141592653589793d)));
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new Float(((Number) it2.next()).floatValue() * this.$flingScale));
                }
                float[] floatArray = CollectionsKt.toFloatArray(arrayList3);
                int i7 = 0;
                int i8 = 0;
                while (i7 < 3) {
                    JobKt.launch(coroutineScope, (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue(), CoroutineStart.UNDISPATCHED, new BufferCountKt$bufferSkip$1(animatableArr[i7], arrayList, i8, this.$springSpec, floatArray, null, 5));
                    i7++;
                    i8++;
                }
                SafeFlow safeFlow = new SafeFlow(new GLThread$start$2(Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.graphics.views.AnimationsKt$flingTo$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i2;
                        boolean z = false;
                        Animatable[] animatableArr2 = animatableArr;
                        switch (i9) {
                            case 0:
                                int i10 = 0;
                                while (true) {
                                    if (i10 < 3) {
                                        if (animatableArr2[i10].isRunning()) {
                                            z = true;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                return Boolean.valueOf(z);
                            default:
                                ArrayList arrayList4 = new ArrayList(3);
                                for (int i11 = 0; i11 < 3; i11++) {
                                    arrayList4.add(Float.valueOf(((Number) animatableArr2[i11].getValue()).floatValue()));
                                }
                                return new Quat(CollectionsKt.toFloatArray(arrayList4));
                        }
                    }
                }), new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.graphics.views.AnimationsKt$flingTo$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i3;
                        boolean z = false;
                        Animatable[] animatableArr2 = animatableArr;
                        switch (i9) {
                            case 0:
                                int i10 = 0;
                                while (true) {
                                    if (i10 < 3) {
                                        if (animatableArr2[i10].isRunning()) {
                                            z = true;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                return Boolean.valueOf(z);
                            default:
                                ArrayList arrayList4 = new ArrayList(3);
                                for (int i11 = 0; i11 < 3; i11++) {
                                    arrayList4.add(Float.valueOf(((Number) animatableArr2[i11].getValue()).floatValue()));
                                }
                                return new Quat(CollectionsKt.toFloatArray(arrayList4));
                        }
                    }
                }), 12), (Continuation) null, i2));
                this.L$0 = null;
                this.label = 1;
                if (safeFlow.collect(this.$$this$flow, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationsKt$flingTo$1(Quat quat, Quat quat2, long j, float f, SpringSpec springSpec, Continuation continuation) {
        super(2, continuation);
        this.$this_flingTo = quat;
        this.$dst = quat2;
        this.$velocity = j;
        this.$flingScale = f;
        this.$springSpec = springSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimationsKt$flingTo$1 animationsKt$flingTo$1 = new AnimationsKt$flingTo$1(this.$this_flingTo, this.$dst, this.$velocity, this.$flingScale, this.$springSpec, continuation);
        animationsKt$flingTo$1.L$0 = obj;
        return animationsKt$flingTo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimationsKt$flingTo$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flingTo, this.$dst, this.$velocity, flowCollector, this.$flingScale, this.$springSpec, null);
            this.L$0 = null;
            this.label = 1;
            if (JobKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
