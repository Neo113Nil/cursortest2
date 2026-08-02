package com.squareup.cash.overlays;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Rect;
import android.os.ParcelUuid;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.core.view.MotionEventCompat;
import androidx.room.Room;
import app.cash.broadway.screen.Screen;
import app.cash.local.db.Local_tab_content;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.NextBestAction;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.plugins.ActionCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewEvent$LaunchClientRoute;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.cash.moneybot.views.rawmessages.RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.compose_ui.components.KeyPadChar;
import com.squareup.cash.mooncake.compose_ui.components.ShadowConfig;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.NearbyMetadata;
import com.squareup.cash.nearby.backend.RealNearbyAdvertiser;
import com.squareup.cash.nearby.backend.RealNearbyManager$$ExternalSyntheticLambda3;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.cash.offers.backend.api.OffersCollectionTrackingAction;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.db.OffersCollectionDetailQueries$forToken$2;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersHomeQueries$forId$2;
import com.squareup.cash.offers.db.OffersSearchQueries$forId$2;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.db.OffersSheetQueries$forSheetKey$2;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.widget.AmountSelector;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes6.dex */
public final /* synthetic */ class Overlay$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Overlay$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 17;
        OffersCollectionDetailQueries$forToken$2 offersCollectionDetailQueries$forToken$2 = OffersCollectionDetailQueries$forToken$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<ParcelUuid> serviceUuids;
        int i = this.$r8$classId;
        final int i2 = 1;
        r5 = null;
        r5 = null;
        UUID uuid = null;
        final int i3 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Context) obj).getClass();
                return ((Overlay) obj2).getAsView();
            case 1:
                List list = (List) obj;
                list.getClass();
                NextBestAction nextBestAction = (NextBestAction) CollectionsKt.getOrNull(((Number) ((ParcelableSnapshotMutableState) ((MoneybotHomePresenter) obj2).currentNbaIndex$delegate).getValue()).intValue(), list);
                if (nextBestAction == null) {
                    return null;
                }
                int size = list.size();
                String str = nextBestAction.nextBestActionId;
                String str2 = nextBestAction.title;
                String str3 = nextBestAction.subtitle;
                NextBestAction.Cta cta = nextBestAction.cta;
                String str4 = cta.text;
                String str5 = cta.clientRoute;
                String str6 = nextBestAction.category;
                return new MoneybotHomeViewModel.NextBestAction(str, str2, str3, str4, new MoneybotHomeViewModel.NextBestAction.Action(new MoneybotHomeViewEvent.LaunchNextBestAction(str, str5, str6)), size > 1 ? new MoneybotHomeViewModel.NextBestAction.Action(new MoneybotHomeViewEvent.SkipNextBestAction(str, str6)) : null, new MoneybotHomeViewEvent.NbaViewed(str, str6));
            case 2:
                ActionCardPresenter actionCardPresenter = (ActionCardPresenter) obj2;
                Function2 function2 = actionCardPresenter.onMessage;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = actionCardPresenter.analyticsService;
                PluginContext pluginContext = actionCardPresenter.pluginContext;
                ActionCardViewEvent actionCardViewEvent = (ActionCardViewEvent) obj;
                actionCardViewEvent.getClass();
                if (actionCardViewEvent instanceof ActionCardViewEvent.LaunchClientRoute) {
                    ActionCardViewEvent.LaunchClientRoute launchClientRoute = (ActionCardViewEvent.LaunchClientRoute) actionCardViewEvent;
                    String str7 = pluginContext.chatSessionId;
                    CdfEvent cdfEvent = launchClientRoute.cdfEvent;
                    String str8 = launchClientRoute.requestId;
                    if (cdfEvent != null) {
                        actionCardPresenter.analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
                    } else {
                        realMoneybotAnalyticsService.submitActionCardTap(str7, str8);
                    }
                    String str9 = launchClientRoute.hiddenMessage;
                    if (str9 != null) {
                        function2.invoke(str9, Boolean.TRUE);
                    }
                    RealRouter realRouter = actionCardPresenter.router;
                    String str10 = launchClientRoute.clientRoute;
                    Screen screen = pluginContext.contextScreen;
                    realRouter.route(new RoutingParams(screen, null, screen, null, null, str7 != null ? new FeatureContext.MoneybotChatContext(str7, str8) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), str10);
                } else {
                    if (!(actionCardViewEvent instanceof ActionCardViewEvent.SendHiddenMessage)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realMoneybotAnalyticsService.submitActionCardTap(pluginContext.chatSessionId, null);
                    function2.invoke(((ActionCardViewEvent.SendHiddenMessage) actionCardViewEvent).hiddenMessage, Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 3:
                RealAlertBannerPresenter realAlertBannerPresenter = (RealAlertBannerPresenter) obj2;
                Function2 function22 = (Function2) realAlertBannerPresenter.screen;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService2 = (RealMoneybotAnalyticsService) realAlertBannerPresenter.syncValueReader;
                PluginContext pluginContext2 = (PluginContext) realAlertBannerPresenter.featureFlagManager;
                CellActionCardViewEvent cellActionCardViewEvent = (CellActionCardViewEvent) obj;
                cellActionCardViewEvent.getClass();
                if (cellActionCardViewEvent instanceof CellActionCardViewEvent.LaunchClientRoute) {
                    CellActionCardViewEvent.LaunchClientRoute launchClientRoute2 = (CellActionCardViewEvent.LaunchClientRoute) cellActionCardViewEvent;
                    String str11 = pluginContext2.chatSessionId;
                    String str12 = launchClientRoute2.requestId;
                    realMoneybotAnalyticsService2.submitActionCardTap(str11, str12);
                    String str13 = launchClientRoute2.hiddenMessage;
                    if (str13 != null) {
                        function22.invoke(str13, Boolean.TRUE);
                    }
                    RealRouter realRouter2 = (RealRouter) realAlertBannerPresenter.router;
                    String str14 = launchClientRoute2.clientRoute;
                    Screen screen2 = pluginContext2.contextScreen;
                    realRouter2.route(new RoutingParams(screen2, null, screen2, null, null, str11 != null ? new FeatureContext.MoneybotChatContext(str11, str12) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), str14);
                } else {
                    if (!(cellActionCardViewEvent instanceof CellActionCardViewEvent.SendHiddenMessage)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realMoneybotAnalyticsService2.submitActionCardTap(pluginContext2.chatSessionId, null);
                    function22.invoke(((CellActionCardViewEvent.SendHiddenMessage) cellActionCardViewEvent).hiddenMessage, Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 4:
                NavigationCardPresenter navigationCardPresenter = (NavigationCardPresenter) obj2;
                NavigationCardViewEvent$LaunchClientRoute navigationCardViewEvent$LaunchClientRoute = (NavigationCardViewEvent$LaunchClientRoute) obj;
                navigationCardViewEvent$LaunchClientRoute.getClass();
                String str15 = navigationCardViewEvent$LaunchClientRoute.requestId;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService3 = (RealMoneybotAnalyticsService) navigationCardPresenter.analyticsService;
                PluginContext pluginContext3 = (PluginContext) navigationCardPresenter.pluginContext;
                String str16 = pluginContext3.chatSessionId;
                realMoneybotAnalyticsService3.submitActionCardTap(str16, str15);
                RealRouter realRouter3 = navigationCardPresenter.router;
                String str17 = navigationCardViewEvent$LaunchClientRoute.clientRoute;
                Screen screen3 = pluginContext3.contextScreen;
                realRouter3.route(new RoutingParams(screen3, null, screen3, null, null, str16 != null ? new FeatureContext.MoneybotChatContext(str16, str15) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), str17);
                return Unit.INSTANCE;
            case 5:
                VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
                versionedSavingsFolders.getClass();
                return MotionEventCompat.toSavingsFolders((TemplateCardPresenter) obj2, versionedSavingsFolders);
            case 6:
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                textureView.setOpaque(false);
                textureView.setSurfaceTextureListener((ParticleGridRenderer) obj2);
                return textureView;
            case 7:
                SlotContent.Table.Row row = (SlotContent.Table.Row) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, row.name + ", " + row.amount);
                return Unit.INSTANCE;
            case 8:
                TemplateCardViewModel.BottomPicker bottomPicker = (TemplateCardViewModel.BottomPicker) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                String str18 = bottomPicker.accessibilityLabel;
                if (str18 == null) {
                    str18 = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{bottomPicker.label, bottomPicker.subtitle}), " ", null, null, 0, null, null, 62);
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str18);
                return Unit.INSTANCE;
            case 9:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list2 = ((RawMessagesViewModel.Loaded) ((RawMessagesViewModel) obj2)).messages;
                lazyListScope.items(list2.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list2, 4), new ComposableLambdaImpl(new RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4(list2, i3), true, 802480018));
                return Unit.INSTANCE;
            case 10:
                ((View) obj).getClass();
                return Boolean.valueOf(!((ArrayList) ((PausedCompositionImpl) obj2).applier).contains(r1));
            case 11:
                AmountSelector amountSelector = (AmountSelector) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                if (Intrinsics.areEqual(amountSelector.getParent(), viewGroup)) {
                    return new Rect(amountSelector.getLeft(), amountSelector.getTop(), amountSelector.getRight(), amountSelector.getBottom());
                }
                a$$ExternalSyntheticBUOutline0.m$1("todo: calculate relative position w.r.t container");
                return null;
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, ((KeyPadChar) obj2).contentDescription);
                return Unit.INSTANCE;
            case 13:
                MooncakeLargeIcon mooncakeLargeIcon = (MooncakeLargeIcon) obj;
                mooncakeLargeIcon.getClass();
                mooncakeLargeIcon.setIcon((MooncakeLargeIcon.Icon) obj2);
                return Unit.INSTANCE;
            case 14:
                ShadowConfig shadowConfig = (ShadowConfig) obj2;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                cacheDrawScope.getClass();
                AndroidPaint Paint = ColorKt.Paint();
                Paint.m659setColor8_81llA(shadowConfig.color);
                Paint.setAlpha(shadowConfig.alpha);
                Paint.internalPaint.setMaskFilter(new BlurMaskFilter(cacheDrawScope.getDensity() * shadowConfig.blurRadius, BlurMaskFilter.Blur.NORMAL));
                return cacheDrawScope.onDrawWithContent(new CacheDrawScope$onDrawBehind$1(i3, new MoneyTabUIKt$$ExternalSyntheticLambda39(12, shadowConfig, shadowConfig.shape.mo175createOutlinePq9zytI(cacheDrawScope.cacheParams.mo587getSizeNHjbRc(), cacheDrawScope.cacheParams.getLayoutDirection(), cacheDrawScope), Paint)));
            case 15:
                RealNearbyAdvertiser realNearbyAdvertiser = (RealNearbyAdvertiser) obj2;
                ScanResult scanResult = (ScanResult) obj;
                scanResult.getClass();
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord != null && (serviceUuids = scanRecord.getServiceUuids()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : serviceUuids) {
                        if (!Intrinsics.areEqual(((ParcelUuid) obj3).getUuid(), UUID.fromString("0000FC44-0000-1000-8000-00805F9B34FB"))) {
                            arrayList.add(obj3);
                        }
                    }
                    ParcelUuid parcelUuid = (ParcelUuid) CollectionsKt.firstOrNull((List) arrayList);
                    if (parcelUuid != null) {
                        uuid = parcelUuid.getUuid();
                    }
                }
                if (uuid != null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    allocate.putLong(uuid.getMostSignificantBits());
                    allocate.putLong(uuid.getLeastSignificantBits());
                    byte[] array2 = allocate.array();
                    array2.getClass();
                    NearbyAdvertisement fromByteArray = PullRefreshKt.fromByteArray(array2);
                    NearbyMetadata nearbyMetadata = new NearbyMetadata(realNearbyAdvertiser.clock.m3790nanoTimeeFsXEgE(), scanResult.getRssi());
                    RealNearbyManager$$ExternalSyntheticLambda3 realNearbyManager$$ExternalSyntheticLambda3 = (RealNearbyManager$$ExternalSyntheticLambda3) realNearbyAdvertiser.listeners.get(fromByteArray.identifier);
                    if (realNearbyManager$$ExternalSyntheticLambda3 != null) {
                        realNearbyManager$$ExternalSyntheticLambda3.f$0.put(fromByteArray, nearbyMetadata);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope.getClass();
                Iterator it = ((ListSection) obj2).items.iterator();
                while (it.hasNext()) {
                    listOrderedStandardItemsScope.item(new ComposableLambdaImpl(new PoolCreateViewKt$$ExternalSyntheticLambda5((String) it.next(), 20), true, 484412704), null);
                }
                return Unit.INSTANCE;
            case 17:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                return OffersCollectionDetailQueries$forToken$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0), androidCursor.getLong(1), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 2, ((Local_tab_content.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).responseAdapter));
            case 18:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 19:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                return OffersHomeQueries$forId$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m(androidCursor2, 0), androidCursor2.getLong(1), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 2, ((BlockersConfig.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).target_balance_amountAdapter));
            case 20:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 21:
                OffersSearchQueries$forId$2 offersSearchQueries$forId$2 = OffersSearchQueries$forId$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor3, 0);
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 1, ((BlockersConfig.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).target_balance_amountAdapter);
                Long l = androidCursor3.getLong(2);
                Long l2 = androidCursor3.getLong(3);
                l2.getClass();
                return offersSearchQueries$forId$2.invoke(m, m2, l, l2);
            case 22:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 23:
                OffersSheetQueries$forSheetKey$2 offersSheetQueries$forSheetKey$2 = OffersSheetQueries$forSheetKey$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                Object m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor4, 0, ((OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter).sheet_keyAdapter);
                Long l3 = androidCursor4.getLong(1);
                OffersSheet.Adapter adapter = (OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter;
                Object m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor4, 2, adapter.offers_sheet_responseAdapter);
                String string2 = androidCursor4.getString(3);
                return offersSheetQueries$forSheetKey$2.invoke(m3, l3, m4, string2 != null ? (OfferType) adapter.offer_typeAdapter.decode(string2) : null);
            case 24:
                OffersSpanAction offersSpanAction = (OffersSpanAction) obj;
                offersSpanAction.getClass();
                ((RealOffersSpanManager) ((OffersDetailsPresenter) obj2).spanManager).onAction(offersSpanAction);
                return Unit.INSTANCE;
            case 25:
                OffersCollectionTrackingAction offersCollectionTrackingAction = (OffersCollectionTrackingAction) obj;
                offersCollectionTrackingAction.getClass();
                ((ToolbarTuckTargets) ((LocalCashBalancePresenter) obj2).service).onAction(offersCollectionTrackingAction);
                return Unit.INSTANCE;
            case 26:
                ((OffersHomePresenter) obj2).spanManager.onAction((OffersSpanAction) obj);
                return Unit.INSTANCE;
            case 27:
                OffersSpanAction offersSpanAction2 = (OffersSpanAction) obj;
                offersSpanAction2.getClass();
                ((RealOffersSpanManager) ((PoolsListPresenter) obj2).localeAssetProvider).onAction(offersSpanAction2);
                return Unit.INSTANCE;
            case 28:
                return Integer.valueOf(((OffersHomeListItemViewModel.CategoryTilesSectionViewModel) obj2).tiles.get(((Integer) obj).intValue()).hashCode());
            default:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope2 = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope2.getClass();
                for (final OffersTimelineViewModelV2.Item item : ((OffersTimelineViewModelV2) obj2).items) {
                    listOrderedStandardItemsScope2.item(new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.offers.views.timeline.OffersTimelineSheetV2Kt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = i3;
                            OffersTimelineViewModelV2.Item item2 = item;
                            switch (i4) {
                                case 0:
                                    Composer composer = (Composer) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, item2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str19 = item2.description;
                                        if (str19 == null) {
                                            gapComposer2.startReplaceGroup(-488351865);
                                        } else {
                                            gapComposer2.startReplaceGroup(-488351864);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str19, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 670711081), new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.offers.views.timeline.OffersTimelineSheetV2Kt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = i2;
                            OffersTimelineViewModelV2.Item item2 = item;
                            switch (i4) {
                                case 0:
                                    Composer composer = (Composer) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, item2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str19 = item2.description;
                                        if (str19 == null) {
                                            gapComposer2.startReplaceGroup(-488351865);
                                        } else {
                                            gapComposer2.startReplaceGroup(-488351864);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str19, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1305010090));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Overlay$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, byte b) {
        this.$r8$classId = 19;
        OffersHomeQueries$forId$2 offersHomeQueries$forId$2 = OffersHomeQueries$forId$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ Overlay$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, char c) {
        this.$r8$classId = 21;
        OffersSearchQueries$forId$2 offersSearchQueries$forId$2 = OffersSearchQueries$forId$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ Overlay$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, int i) {
        this.$r8$classId = 23;
        OffersSheetQueries$forSheetKey$2 offersSheetQueries$forSheetKey$2 = OffersSheetQueries$forSheetKey$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ Overlay$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
