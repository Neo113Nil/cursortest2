package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.datastore.core.DataStoreImpl$data$1;
import app.cash.molecule.GatedFrameClock;
import com.datadog.android.Datadog$getInstance$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Datadog$getInstance$1$1 $boundsProvider;
    public final /* synthetic */ NodeCoordinator $childCoordinates;
    public final /* synthetic */ LaunchTracker$$ExternalSyntheticLambda0 $parentRect;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, NodeCoordinator nodeCoordinator, Datadog$getInstance$1$1 datadog$getInstance$1$1, LaunchTracker$$ExternalSyntheticLambda0 launchTracker$$ExternalSyntheticLambda0, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = nodeCoordinator;
        this.$boundsProvider = datadog$getInstance$1$1;
        this.$parentRect = launchTracker$$ExternalSyntheticLambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, continuation);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
        JobKt.launch$default(coroutineScope, null, null, new DataStoreImpl$data$1(bringIntoViewResponderNode, this.$childCoordinates, this.$boundsProvider, null, 5), 3);
        return JobKt.launch$default(coroutineScope, null, null, new GatedFrameClock.AnonymousClass1(bringIntoViewResponderNode, this.$parentRect, null, 1), 3);
    }
}
