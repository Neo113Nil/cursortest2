package com.squareup.cash.borrow.backend;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BorrowEntryPointVerboseLogging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class RealBorrowDataManager {
    public static final BorrowData.AppletData.EntryPointData LocalHiddenEntryPointData;
    public final Analytics analytics;
    public final Version appVersion;
    public final boolean borrowEntryPointVerboseLoggingEnabled;
    public final n borrowGlobalEntryPointGate;
    public final ErrorReporter errorReporter;
    public final SyncValueReader syncValueReader;

    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(AppSupport.Platform.ANDROID);
        ByteString byteString = ByteString.EMPTY;
        LocalHiddenEntryPointData = new BorrowData.AppletData.EntryPointData(CollectionsKt__CollectionsJVMKt.listOf(new AppSupport(listOf, null, null, byteString)), null, new BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2(new BorrowData.AppletData.EntryPointData.HiddenEntryPoint(null, byteString)), byteString);
    }

    public RealBorrowDataManager(SyncValueReader syncValueReader, n nVar, Analytics analytics, ErrorReporter errorReporter, FeatureFlagManager featureFlagManager, String str) {
        this.syncValueReader = syncValueReader;
        this.borrowGlobalEntryPointGate = nVar;
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.borrowEntryPointVerboseLoggingEnabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BorrowEntryPointVerboseLogging.INSTANCE)).enabled();
        Version decode = Strings.decode(str);
        decode.getClass();
        this.appVersion = decode;
    }

    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 borrowHomeEntryPoint(boolean z) {
        Continuation continuation = null;
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new CardModelView$iconTexture$$inlined$map$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BorrowData), 17)), new AnchoredDraggableNode$drag$2(continuation, this, 9))), new InteractiveCardState$animateLock$2(z, this, continuation, 3), 3);
    }
}
