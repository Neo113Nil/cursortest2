package com.squareup.cash.arcade.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RadioKt$Radio$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $activeAlpha;
    public final /* synthetic */ Animatable $activeStrokeWidth;
    public final /* synthetic */ boolean $isInScreenshotTest;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ SpringSpec $smoothSharpAnimationSpecDp;
    public final /* synthetic */ Object $smoothSharpAnimationSpecFloat;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.cash.arcade.components.RadioKt$Radio$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Animatable $activeStrokeWidth;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ SpringSpec $smoothSharpAnimationSpecDp;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Animatable animatable, SpringSpec springSpec, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$activeStrokeWidth = animatable;
            this.$smoothSharpAnimationSpecDp = springSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            SpringSpec springSpec = this.$smoothSharpAnimationSpecDp;
            Animatable animatable = this.$activeStrokeWidth;
            switch (i) {
                case 0:
                    return new AnonymousClass1(animatable, springSpec, continuation, 0);
                case 1:
                    return new AnonymousClass1(animatable, springSpec, continuation, 1);
                case 2:
                    return new AnonymousClass1(animatable, springSpec, continuation, 2);
                default:
                    return new AnonymousClass1(animatable, springSpec, continuation, 3);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Dp dp = new Dp(8.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$activeStrokeWidth, dp, this.$smoothSharpAnimationSpecDp, null, null, this, 12) == coroutineSingletons) {
                            break;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f = new Float(1.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$activeStrokeWidth, f, this.$smoothSharpAnimationSpecDp, null, null, this, 12) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Dp dp2 = new Dp(1.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$activeStrokeWidth, dp2, this.$smoothSharpAnimationSpecDp, null, null, this, 12) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$activeStrokeWidth, f2, this.$smoothSharpAnimationSpecDp, null, null, this, 12) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioKt$Radio$3$1(Animatable animatable, boolean z, boolean z2, SpringSpec springSpec, List list, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$activeStrokeWidth = animatable;
        this.$isInScreenshotTest = z;
        this.$selected = z2;
        this.$smoothSharpAnimationSpecDp = springSpec;
        this.L$0 = list;
        this.$activeAlpha = parcelableSnapshotMutableIntState;
        this.$smoothSharpAnimationSpecFloat = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$smoothSharpAnimationSpecFloat;
        Object obj3 = this.$activeAlpha;
        switch (i) {
            case 0:
                RadioKt$Radio$3$1 radioKt$Radio$3$1 = new RadioKt$Radio$3$1(this.$isInScreenshotTest, this.$selected, this.$activeStrokeWidth, this.$smoothSharpAnimationSpecDp, (Animatable) obj3, (SpringSpec) obj2, continuation);
                radioKt$Radio$3$1.L$0 = obj;
                return radioKt$Radio$3$1;
            default:
                return new RadioKt$Radio$3$1(this.$activeStrokeWidth, this.$isInScreenshotTest, this.$selected, this.$smoothSharpAnimationSpecDp, (List) this.L$0, (ParcelableSnapshotMutableIntState) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RadioKt$Radio$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(3000, r17) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r8.snapTo(r1, r17) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (kotlinx.coroutines.JobKt.yield(r17) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r8.snapTo(r2, r17) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        if (r8.snapTo(r1, r17) == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        if (r8.snapTo(r1, r17) == r9) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d8 -> B:9:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00df -> B:10:0x00dc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        float f;
        Float f2;
        int i = this.$r8$classId;
        boolean z = this.$selected;
        boolean z2 = this.$isInScreenshotTest;
        Object obj2 = this.$activeAlpha;
        int i2 = 0;
        Object obj3 = this.$smoothSharpAnimationSpecFloat;
        Animatable animatable = this.$activeStrokeWidth;
        int i3 = 3;
        int i4 = 2;
        Continuation continuation = null;
        int i5 = 1;
        switch (i) {
            case 0:
                SpringSpec springSpec = (SpringSpec) obj3;
                Animatable animatable2 = (Animatable) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                SpringSpec springSpec2 = this.$smoothSharpAnimationSpecDp;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z2) {
                        if (!z) {
                            Dp dp = new Dp(2.0f);
                            this.L$0 = coroutineScope;
                            this.label = 2;
                            break;
                        } else {
                            Dp dp2 = new Dp(6.0f);
                            this.L$0 = coroutineScope;
                            this.label = 1;
                            break;
                        }
                        return coroutineSingletons2;
                    }
                } else if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable, springSpec2, continuation, i2), 3);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable2, springSpec, continuation, i5), 3);
                } else {
                    if (i6 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable, springSpec2, continuation, i4), 3);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable2, springSpec, continuation, 3), 3);
                }
                return Unit.INSTANCE;
            default:
                List list = (List) this.L$0;
                MutableState mutableState = (MutableState) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                float f3 = RecyclerView.DECELERATION_RATE;
                switch (i7) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        parcelableSnapshotMutableIntState.setIntValue(0);
                        mutableState.setValue(Boolean.FALSE);
                        Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        if (!z2) {
                            return Unit.INSTANCE;
                        }
                        this.label = 2;
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        if (!z) {
                            coroutineSingletons = coroutineSingletons3;
                            parcelableSnapshotMutableIntState.setIntValue((parcelableSnapshotMutableIntState.getIntValue() + 1) % list.size());
                            coroutineSingletons3 = coroutineSingletons;
                            i3 = 3;
                            this.label = 2;
                            break;
                        } else {
                            mutableState.setValue(Boolean.TRUE);
                            Float f5 = new Float(f3);
                            this.label = i3;
                            break;
                        }
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        this.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        Float f6 = new Float(1.0f);
                        this.label = 5;
                        coroutineSingletons = coroutineSingletons3;
                        f = f3;
                        if (Animatable.animateTo$default(this.$activeStrokeWidth, f6, this.$smoothSharpAnimationSpecDp, null, null, this, 12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        parcelableSnapshotMutableIntState.setIntValue((parcelableSnapshotMutableIntState.getIntValue() + 1) % list.size());
                        mutableState.setValue(Boolean.FALSE);
                        f2 = new Float(f);
                        this.label = 6;
                        if (animatable.snapTo(f2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f3 = f;
                        coroutineSingletons3 = coroutineSingletons;
                        i3 = 3;
                        this.label = 2;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        coroutineSingletons = coroutineSingletons3;
                        f = 0.0f;
                        parcelableSnapshotMutableIntState.setIntValue((parcelableSnapshotMutableIntState.getIntValue() + 1) % list.size());
                        mutableState.setValue(Boolean.FALSE);
                        f2 = new Float(f);
                        this.label = 6;
                        if (animatable.snapTo(f2, this) == coroutineSingletons) {
                        }
                        f3 = f;
                        coroutineSingletons3 = coroutineSingletons;
                        i3 = 3;
                        this.label = 2;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        coroutineSingletons = coroutineSingletons3;
                        f = 0.0f;
                        f3 = f;
                        coroutineSingletons3 = coroutineSingletons;
                        i3 = 3;
                        this.label = 2;
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioKt$Radio$3$1(boolean z, boolean z2, Animatable animatable, SpringSpec springSpec, Animatable animatable2, SpringSpec springSpec2, Continuation continuation) {
        super(2, continuation);
        this.$isInScreenshotTest = z;
        this.$selected = z2;
        this.$activeStrokeWidth = animatable;
        this.$smoothSharpAnimationSpecDp = springSpec;
        this.$activeAlpha = animatable2;
        this.$smoothSharpAnimationSpecFloat = springSpec2;
    }
}
