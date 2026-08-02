package com.google.maps.android.compose.clustering;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class ClusteringKt$rememberClusterRenderer$2$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ MutableState $clusterContentAnchorState;
    public final /* synthetic */ MutableState $clusterContentState;
    public final /* synthetic */ MutableState $clusterContentZIndexState;
    public final /* synthetic */ MutableState $clusterItemContentAnchorState;
    public final /* synthetic */ MutableState $clusterItemContentState;
    public final /* synthetic */ MutableState $clusterItemContentZIndexState;
    public final /* synthetic */ ClusterManager $clusterManager;
    public final /* synthetic */ MutableState $clusterRendererState;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState $viewRendererState;
    public /* synthetic */ CoroutineScope L$0;
    public /* synthetic */ GoogleMap L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusteringKt$rememberClusterRenderer$2$1(Context context, ClusterManager clusterManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, Continuation continuation) {
        super(3, continuation);
        this.$context = context;
        this.$clusterManager = clusterManager;
        this.$viewRendererState = mutableState;
        this.$clusterContentState = mutableState2;
        this.$clusterItemContentState = mutableState3;
        this.$clusterContentAnchorState = mutableState4;
        this.$clusterItemContentAnchorState = mutableState5;
        this.$clusterContentZIndexState = mutableState6;
        this.$clusterItemContentZIndexState = mutableState7;
        this.$clusterRendererState = mutableState8;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState = this.$clusterItemContentZIndexState;
        MutableState mutableState2 = this.$clusterRendererState;
        ClusteringKt$rememberClusterRenderer$2$1 clusteringKt$rememberClusterRenderer$2$1 = new ClusteringKt$rememberClusterRenderer$2$1(this.$context, this.$clusterManager, this.$viewRendererState, this.$clusterContentState, this.$clusterItemContentState, this.$clusterContentAnchorState, this.$clusterItemContentAnchorState, this.$clusterContentZIndexState, mutableState, mutableState2, (Continuation) obj3);
        clusteringKt$rememberClusterRenderer$2$1.L$0 = (CoroutineScope) obj;
        clusteringKt$rememberClusterRenderer$2$1.L$1 = (GoogleMap) obj2;
        clusteringKt$rememberClusterRenderer$2$1.invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = this.L$0;
        GoogleMap googleMap = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(obj);
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        this.$clusterRendererState.setValue(new ComposeUiClusterRenderer(this.$context, coroutineScope, googleMap, this.$clusterManager, this.$viewRendererState, this.$clusterContentState, this.$clusterItemContentState, this.$clusterContentAnchorState, this.$clusterItemContentAnchorState, this.$clusterContentZIndexState, this.$clusterItemContentZIndexState));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        JobKt.awaitCancellation(this);
        return coroutineSingletons;
    }
}
