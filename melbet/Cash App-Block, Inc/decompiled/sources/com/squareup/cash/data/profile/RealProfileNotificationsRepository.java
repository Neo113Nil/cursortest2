package com.squareup.cash.data.profile;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.protos.cash.notificationsettings.api.v1.NotificationSettingsService;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncValueType;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealProfileNotificationsRepository {
    public static final List TYPE_ORDER = CollectionsKt__CollectionsKt.listOf((Object[]) new UiAlias.Type[]{UiAlias.Type.APP, UiAlias.Type.SMS, UiAlias.Type.EMAIL});
    public final CashAccountDatabaseImpl cashDatabase;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final NotificationSettingsChecker notificationSettingsChecker;
    public final NotificationSettingsService service;
    public final SyncValueReader syncValueReader;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationChannelToggleState.values().length];
            try {
                NotificationChannelToggleState notificationChannelToggleState = NotificationChannelToggleState.Enabled;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NotificationChannelToggleState notificationChannelToggleState2 = NotificationChannelToggleState.Enabled;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealProfileNotificationsRepository(NotificationSettingsService notificationSettingsService, FeatureFlagManager featureFlagManager, NotificationSettingsChecker notificationSettingsChecker, SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.service = notificationSettingsService;
        this.featureFlagManager = featureFlagManager;
        this.notificationSettingsChecker = notificationSettingsChecker;
        this.syncValueReader = syncValueReader;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }

    public final Flow getAliasNotificationPreferences() {
        InstrumentQueries instrumentQueries = this.cashDatabase.notificationPreferenceQueries;
        RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 realProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 = RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1.INSTANCE;
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0 = new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, 0);
        sqlDriver.getClass();
        SafeFlow flow = DBUtil.toFlow(new SimpleQuery(1099024973, new String[]{"notificationPreference"}, sqlDriver, "NotificationPreference.sq", "select", "SELECT notificationPreference.canonical_text, notificationPreference.enabled, notificationPreference.type\nFROM notificationPreference", offlineQueries$$ExternalSyntheticLambda0));
        CoroutineContext coroutineContext = this.ioDispatcher;
        return FlowKt.flowOn(Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.NOTIFICATION_PREFERENCE, new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(flow, coroutineContext), this, 22), new RealTransferManager$addCash$$inlined$map$1(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.NotificationPreference, new FlowStarter$$ExternalSyntheticLambda0(29)), this, 23)), coroutineContext);
    }

    public final ChannelFlowTransformLatest getNotificationSettings() {
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.NotificationSettings), 24)), new AnchoredDraggableNode$drag$2(null, this, 13));
    }
}
