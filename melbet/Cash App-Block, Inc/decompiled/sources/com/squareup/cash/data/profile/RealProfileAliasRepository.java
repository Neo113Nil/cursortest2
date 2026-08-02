package com.squareup.cash.data.profile;

import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1;
import com.squareup.cash.featureflags.JsonFeatureFlags$MigratedSyncValuesFlag;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class RealProfileAliasRepository {
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioContext;
    public final InstrumentQueries profileAliasQueries;
    public final SyncValueReader syncValueReader;

    public RealProfileAliasRepository(SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext) {
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = syncValueReader;
        this.ioContext = coroutineContext;
        this.profileAliasQueries = cashAccountDatabaseImpl.profileAliasQueries;
    }

    public static ProfileAlias toProfileAlias(com.squareup.protos.franklin.common.ProfileAlias profileAlias) {
        UiAlias uiAlias = profileAlias.alias;
        uiAlias.getClass();
        String str = uiAlias.canonical_text;
        str.getClass();
        Boolean bool = profileAlias.verified;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        UiAlias uiAlias2 = profileAlias.alias;
        uiAlias2.getClass();
        UiAlias.Type type2 = uiAlias2.f1363type;
        type2.getClass();
        return new ProfileAlias(type2, str, booleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AppLockMonitor$special$$inlined$map$2 all() {
        SyncValueType syncValueType = SyncValueType.PROFILE_ALIAS;
        RealProfileAliasRepository$allProfileValues$1 realProfileAliasRepository$allProfileValues$1 = RealProfileAliasRepository$allProfileValues$1.INSTANCE;
        InstrumentQueries instrumentQueries = this.profileAliasQueries;
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries, (byte) 0, 0 == true ? 1 : 0);
        sqlDriver.getClass();
        FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1740338354, new String[]{"profileAlias"}, sqlDriver, "ProfileAlias.sq", "select", "SELECT profileAlias.canonical_text, profileAlias.verified, profileAlias.type\nFROM profileAlias", storageLinkQueries$$ExternalSyntheticLambda8)), this.ioContext);
        StateFlow allValues = this.syncValueReader.getAllValues(AndroidSyncValueSpecs.ProfileAlias, new Matcher$$ExternalSyntheticLambda9(this));
        JsonFeatureFlags$MigratedSyncValuesFlag jsonFeatureFlags$MigratedSyncValuesFlag = JsonFeatureFlags$MigratedSyncValuesFlag.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
        return new AppLockMonitor$special$$inlined$map$2(FlowKt.transformLatest(realFeatureFlagManager.peekValues(jsonFeatureFlags$MigratedSyncValuesFlag), new FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1(null, syncValueType, allValues, realFeatureFlagManager, mapToList)), 9);
    }
}
