package androidx.camera.core.featuregroup.impl;

import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1 extends DeferrableSurface {
    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture provideSurface() {
        return ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
    }
}
