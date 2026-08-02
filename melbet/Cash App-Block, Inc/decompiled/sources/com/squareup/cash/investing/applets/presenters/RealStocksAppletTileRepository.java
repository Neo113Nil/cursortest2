package com.squareup.cash.investing.applets.presenters;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Favorite$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$OtpInfo$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowSlices;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealStocksAppletTileRepository {
    public final DerivedStateFlow availabilityState;
    public final StocksAppletTilePriceMovementRepository priceMovementRepository;
    public final ReadonlyStateFlow stocksActivity;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StocksActivity {
        public static final /* synthetic */ StocksActivity[] $VALUES;
        public static final StocksActivity INVESTED;
        public static final StocksActivity NEVER_INVESTED;
        public static final StocksActivity ZERO_BALANCE;

        static {
            StocksActivity stocksActivity = new StocksActivity("INVESTED", 0);
            INVESTED = stocksActivity;
            StocksActivity stocksActivity2 = new StocksActivity("NEVER_INVESTED", 1);
            NEVER_INVESTED = stocksActivity2;
            StocksActivity stocksActivity3 = new StocksActivity("ZERO_BALANCE", 2);
            ZERO_BALANCE = stocksActivity3;
            $VALUES = new StocksActivity[]{stocksActivity, stocksActivity2, stocksActivity3};
        }

        public static StocksActivity valueOf(String str) {
            return (StocksActivity) Enum.valueOf(StocksActivity.class, str);
        }

        public static StocksActivity[] values() {
            return (StocksActivity[]) $VALUES.clone();
        }
    }

    public interface StocksModel {

        public final class Uninstalled implements StocksModel {
            public static final Uninstalled INSTANCE = new Uninstalled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Uninstalled);
            }

            public final int hashCode() {
                return -1414716359;
            }

            public final String toString() {
                return "Uninstalled";
            }
        }
    }

    public RealStocksAppletTileRepository(AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, StocksAppletTilePriceMovementRepository stocksAppletTilePriceMovementRepository, RealFamilyAccountsManager realFamilyAccountsManager, RealFamilyProfileManager realFamilyProfileManager, CoroutineScope coroutineScope, RealFeatureEligibilityRepository realFeatureEligibilityRepository) {
        Object obj;
        this.stringManager = androidStringManager;
        this.priceMovementRepository = stocksAppletTilePriceMovementRepository;
        this.availabilityState = StateFlowKt.combineState(StateFlowKt.mapState(Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$AllowSlices.INSTANCE), new ActivityItemLayout$$ExternalSyntheticLambda4(24)), FlowKt.stateIn(realFeatureEligibilityRepository.currentEligibleFeatures(), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), EmptySet.INSTANCE), realFamilyProfileManager.familyProfile, new InstrumentCellKt$$ExternalSyntheticLambda11(2));
        DerivedStateFlow isActivelySponsored = realFamilyAccountsManager.isActivelySponsored();
        AndroidSyncValueSpecs$Favorite$1 androidSyncValueSpecs$Favorite$1 = AndroidSyncValueSpecs.InvestPortfolioState;
        StateFlow singleValue = syncValueReader.getSingleValue(androidSyncValueSpecs$Favorite$1);
        AndroidSyncValueSpecs$OtpInfo$1 androidSyncValueSpecs$OtpInfo$1 = AndroidSyncValueSpecs.InvestTradingState;
        int i = 3;
        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(StateFlowKt.combineState(isActivelySponsored, singleValue, syncValueReader.getSingleValue(androidSyncValueSpecs$OtpInfo$1), new InstrumentCellKt$$ExternalSyntheticLambda11(i)), new AnchoredDraggableNode$drag$2(null, this, 23));
        StartedWhileSubscribed startedWhileSubscribed = new StartedWhileSubscribed(0L, Long.MAX_VALUE);
        int ordinal = ((StocksActivity) ((Function0) StateFlowKt.combineState(realFamilyAccountsManager.isActivelySponsored(), syncValueReader.getSingleValue(androidSyncValueSpecs$Favorite$1), syncValueReader.getSingleValue(androidSyncValueSpecs$OtpInfo$1), new InstrumentCellKt$$ExternalSyntheticLambda11(i)).getValue).invoke()).ordinal();
        if (ordinal == 0) {
            obj = RealStocksAppletTileRepository$StocksModel$Installed$LoadingPriceMovement.INSTANCE;
        } else if (ordinal == 1) {
            obj = StocksModel.Uninstalled.INSTANCE;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            obj = zeroBalanceModel();
        }
        this.stocksActivity = FlowKt.stateIn(transformLatest, coroutineScope, startedWhileSubscribed, obj);
    }

    public final RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement zeroBalanceModel() {
        AndroidStringManager androidStringManager = this.stringManager;
        return new RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement(0L, androidStringManager.get(R.string.applets_pres_investing_zero_percent), androidStringManager.get(R.string.applets_pres_investing_today), StocksAppletTileModel.Installed.ChangeDirection.ZERO, new InvestingGraphContentModel.Loading(null, 31));
    }
}
