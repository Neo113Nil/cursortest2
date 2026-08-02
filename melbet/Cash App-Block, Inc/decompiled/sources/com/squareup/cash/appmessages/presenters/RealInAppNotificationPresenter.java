package com.squareup.cash.appmessages.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.db.InAppNotificationMessageQueries$firstMessage$2;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.wire.GrpcMethod;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealInAppNotificationPresenter implements MoleculePresenter {
    public final AndroidAccessibilityManager accessibilityManager;
    public final GrpcMethod actionPerformer;
    public final RealAppMessageManager appMessageManager;
    public final LocalTabContentQueries inAppNotificationMessageQueries;
    public final CoroutineContext ioDispatcher;
    public final AppMessageClientService service;

    public RealInAppNotificationPresenter(RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, AndroidAccessibilityManager androidAccessibilityManager, RealAppMessageManager realAppMessageManager, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.service = appMessageClientService;
        this.accessibilityManager = androidAccessibilityManager;
        this.appMessageManager = realAppMessageManager;
        this.ioDispatcher = coroutineContext;
        this.inAppNotificationMessageQueries = cashAccountDatabaseImpl.inAppNotificationMessageQueries;
        this.actionPerformer = realAppMessageActionPerformer$Factory$Impl.create$1(navigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(941586364);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            LocalTabContentQueries localTabContentQueries = this.inAppNotificationMessageQueries;
            localTabContentQueries.getClass();
            InAppNotificationMessageQueries$firstMessage$2 inAppNotificationMessageQueries$firstMessage$2 = InAppNotificationMessageQueries$firstMessage$2.INSTANCE;
            SqlDriver sqlDriver = localTabContentQueries.driver;
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(localTabContentQueries);
            sqlDriver.getClass();
            FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(6, DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1535018994, new String[]{"inAppNotificationMessage"}, sqlDriver, "InAppNotificationMessage.sq", "firstMessage", "SELECT inAppNotificationMessage.messageToken, inAppNotificationMessage.campaignToken, inAppNotificationMessage.isBadged, inAppNotificationMessage.duration, inAppNotificationMessage.assetUrl, inAppNotificationMessage.action, inAppNotificationMessage.animation, inAppNotificationMessage.image, inAppNotificationMessage.avatar, inAppNotificationMessage.priority, inAppNotificationMessage.expiresAtUtc FROM inAppNotificationMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC\nLIMIT 1", cashApp$$ExternalSyntheticLambda2)), this.ioDispatcher), this);
            gapComposer.updateRememberedValue(finishSetupTileBadgeCounter);
            rememberedValue = finishSetupTileBadgeCounter;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, InAppNotificationModel.NotAvailable.INSTANCE, null, gapComposer, 0, 2);
        InAppNotificationModel inAppNotificationModel = (InAppNotificationModel) collectAsState.getValue();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new RealGcmRegistrar$unregister$2(this, collectAsState, continuation, 11);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, inAppNotificationModel, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new DataStoreImpl$data$1(flow, continuation, this, 18));
        InAppNotificationModel inAppNotificationModel2 = (InAppNotificationModel) collectAsState.getValue();
        gapComposer.end(false);
        return inAppNotificationModel2;
    }
}
