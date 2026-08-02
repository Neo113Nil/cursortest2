package app.cash.zipline.loader;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes3.dex */
public abstract class FastCodeUpdatesKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyPendingInvitations.deepLinkSpecs;
    }

    /* renamed from: withDevelopmentServerPush-SxA4cEA$default, reason: not valid java name */
    public static ChannelFlowTransformLatest m1429withDevelopmentServerPushSxA4cEA$default(AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2, ZiplineHttpClient ziplineHttpClient) {
        Duration.Companion companion = Duration.Companion;
        return FlowKt.transformLatest(appLockMonitor$special$$inlined$map$2, new FastCodeUpdatesKt$withDevelopmentServerPush$1(ziplineHttpClient, DurationKt.toDuration(500, DurationUnit.MILLISECONDS), (Continuation) null));
    }
}
