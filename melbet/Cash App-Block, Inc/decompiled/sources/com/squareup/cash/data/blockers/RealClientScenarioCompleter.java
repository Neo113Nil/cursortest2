package com.squareup.cash.data.blockers;

import androidx.room.util.DBUtil;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ScenarioPlanQueries$forClientScenario$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$2;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class RealClientScenarioCompleter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final FlowStarter flowStarter;
    public final RealProfileManager profileManager;
    public final AndroidStringManager stringManager;

    public RealClientScenarioCompleter(RealProfileManager realProfileManager, FlowStarter flowStarter, BlockerFlowListener blockerFlowListener, Analytics analytics, AndroidStringManager androidStringManager, AppService appService, BlockersDataNavigator blockersDataNavigator) {
        this.profileManager = realProfileManager;
        this.flowStarter = flowStarter;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChannelFlowTransformLatest completeClientScenario(ClientScenario clientScenario, BlockersData.AnalyticsData analyticsData, Screen screen, Screen screen2, BlockersData.Flow flow, boolean z, String str, List list, String str2, BlockersData.MoneybotContext moneybotContext, boolean z2) {
        clientScenario.getClass();
        screen.getClass();
        flow.getClass();
        list.getClass();
        RealProfileManager realProfileManager = this.profileManager;
        InstrumentQueries instrumentQueries = realProfileManager.scenarioPlanQueries;
        instrumentQueries.getClass();
        ScenarioPlanQueries$forClientScenario$2 scenarioPlanQueries$forClientScenario$2 = ScenarioPlanQueries$forClientScenario$2.INSTANCE;
        Continuation continuation = null;
        return FlowKt.transformLatest(FlowKt.take(StateFlowKt.runUntil(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(instrumentQueries, clientScenario, new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, (byte) 0, (boolean) (0 == true ? 1 : 0)))), realProfileManager.ioDispatcher), new SetNameViewKt$SetName$2$1(realProfileManager, clientScenario, continuation, 28), 3), new RealTransferManager$addCash$$inlined$map$1(((SyncValueReader) realProfileManager.syncValueReader.getValue()).getAllValues(AndroidSyncValueSpecs.ScenarioPlan), clientScenario, 21), new FlowExtensionsKt$doOnFirst$2(realProfileManager, clientScenario, continuation, 2), 0 == true ? 1 : 0), realProfileManager.signOutSignal), 1), new RealClientScenarioCompleter$completeClientScenario$$inlined$flatMapLatest$1(null, this, flow, screen2, screen, clientScenario, str, analyticsData, moneybotContext, z, z2, str2, list));
    }
}
