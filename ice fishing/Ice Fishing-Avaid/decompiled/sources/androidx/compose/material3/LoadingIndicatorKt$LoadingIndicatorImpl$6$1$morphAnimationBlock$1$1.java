package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.graphics.shapes.Morph;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;

/* compiled from: LoadingIndicator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1", f = "LoadingIndicator.kt", i = {0, 0, 0, 1, 1}, l = {405, 406}, m = "invokeSuspend", n = {"$this$launch", "morphAnimationSpec", "deferred", "$this$launch", "morphAnimationSpec"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $currentMorphIndex$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $morphProgress;
    final /* synthetic */ MutableFloatState $morphRotationTargetAngle$delegate;
    final /* synthetic */ List<Morph> $morphSequence;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1(Animatable<Float, AnimationVector1D> animatable, List<Morph> list, MutableIntState mutableIntState, MutableFloatState mutableFloatState, Continuation<? super LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1> continuation) {
        super(2, continuation);
        this.$morphProgress = animatable;
        this.$morphSequence = list;
        this.$currentMorphIndex$delegate = mutableIntState;
        this.$morphRotationTargetAngle$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1 = new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1(this.$morphProgress, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, continuation);
        loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1.L$0 = obj;
        return loadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008f -> B:7:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SpringSpec spring;
        CoroutineScope coroutineScope;
        SpringSpec springSpec;
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            spring = AnimationSpecKt.spring(0.6f, 200.0f, Boxing.boxFloat(0.1f));
            coroutineScope = coroutineScope2;
        } else {
            if (i == 1) {
                Deferred deferred = (Deferred) this.L$2;
                SpringSpec springSpec2 = (SpringSpec) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope3;
                this.L$1 = springSpec2;
                this.L$2 = null;
                this.label = 2;
                if (deferred.await(this) != coroutine_suspended) {
                    springSpec = springSpec2;
                    coroutineScope = coroutineScope3;
                    SpringSpec springSpec3 = springSpec;
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(this.$morphProgress, springSpec, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, null), 3, null);
                    this.L$0 = coroutineScope;
                    this.L$1 = springSpec3;
                    this.L$2 = async$default;
                    this.label = 1;
                    if (DelayKt.delay(650L, this) != coroutine_suspended) {
                        coroutineScope3 = coroutineScope;
                        springSpec2 = springSpec3;
                        deferred = async$default;
                        this.L$0 = coroutineScope3;
                        this.L$1 = springSpec2;
                        this.L$2 = null;
                        this.label = 2;
                        if (deferred.await(this) != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spring = (SpringSpec) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        springSpec = spring;
        SpringSpec springSpec32 = springSpec;
        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LoadingIndicatorKt$LoadingIndicatorImpl$6$1$morphAnimationBlock$1$1$deferred$1(this.$morphProgress, springSpec, this.$morphSequence, this.$currentMorphIndex$delegate, this.$morphRotationTargetAngle$delegate, null), 3, null);
        this.L$0 = coroutineScope;
        this.L$1 = springSpec32;
        this.L$2 = async$default;
        this.label = 1;
        if (DelayKt.delay(650L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
