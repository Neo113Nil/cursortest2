package com.squareup.cash.sharesheet;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.ReadonlySharedFlow;

/* loaded from: classes7.dex */
public final class RealShareTargetsManager$addSmsTarget$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $smsPackage$inlined;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object this$0;

    public RealShareTargetsManager$addSmsTarget$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, ShareTarget shareTarget, StuckPlayerDetector stuckPlayerDetector) {
        this.$r8$classId = 1;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
        this.$smsPackage$inlined = shareTarget;
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 3;
        Object obj = this.$smsPackage$inlined;
        Object obj2 = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, (StuckPlayerDetector) obj2, (String) obj, i2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, (ShareTarget) obj, (StuckPlayerDetector) obj2, i3), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((ReadonlySharedFlow) flow).$$delegate_0.collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, (MarkwonConfiguration) obj2, (ZiplineHistoryDataJavaScripter) obj, 12), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((RealShareTargetsManager$addSmsTarget$$inlined$map$1) flow).collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, (MarkwonConfiguration) obj2, (Query) obj, 13), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((SwipeableState$special$$inlined$filter$1) flow).collect(new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2(flowCollector, (Quat) obj2, (MutableState) obj, 1), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((SwipeableState$special$$inlined$filter$1) flow).collect(new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2(flowCollector, (Quat) obj2, (MutableState) obj, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1) flow).collect(new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2(flowCollector, (Quat) obj2, (MutableState) obj, 0), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1) flow).collect(new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2(flowCollector, (Quat) obj2, (MutableState) obj, i3), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect9 = flow.collect(new TakeUntil$collectSafely$2.AnonymousClass1(flowCollector, (RealSellerCardViewModelProducer) obj2, (Merchant) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealShareTargetsManager$addSmsTarget$$inlined$map$1(Flow flow, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
        this.$smsPackage$inlined = obj2;
    }
}
