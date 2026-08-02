package com.squareup.cash.crypto.backend.profile;

import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.google.android.gms.internal.mlkit_vision_face.zznf;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class RealBitcoinProfileRepo {
    public final FeatureFlagManager featureFlagManager;
    public final RealProfileManager profileManager;
    public final SyncValueReader syncValueReader;

    public RealBitcoinProfileRepo(FeatureFlagManager featureFlagManager, RealProfileManager realProfileManager, SyncValueReader syncValueReader) {
        this.featureFlagManager = featureFlagManager;
        this.profileManager = realProfileManager;
        this.syncValueReader = syncValueReader;
    }

    public final ChannelFlowTransformLatest getProfile() {
        return Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.CRYPTOCURRENCY_PROFILE, zznf.getProfileFlow(this.profileManager), new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CryptocurrencyProfile), 24), 13));
    }
}
