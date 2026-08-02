package com.squareup.cash.music.views;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelUuid;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.SwipeContext;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.moneybothome.EntryPointSurface;
import com.squareup.cash.cdf.moneybothome.Gesture;
import com.squareup.cash.cdf.moneybothome.MoneybotHomeBrowseViewPage;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.db.CryptoStatementQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.PromotedAppletTile;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenterKt$WhenMappings;
import com.squareup.cash.moneybot.presenters.plugins.PendingInput;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.screens.HomeItemType;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewEvent;
import com.squareup.cash.moneybot.views.chat.RotatingPromptItem;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.cash.moneybot.views.plugins.TokenRange;
import com.squareup.cash.moneybot.views.plugins.TokenizedText;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.components.OnPressBehaviour;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.RealNearbyAdvertiser;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.nearby.backend.ble.RealBleManager$startAdvertising$callback$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.PillViewModel;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.paychecks.applets.presenters.PaychecksAppletTilePresenter$WhenMappings;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.backend.api.GeneralPaychecksException;
import com.squareup.cash.paychecks.backend.api.mapper.PaycheckAllocationDistributionMappersKt;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.views.ConfigurationRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.DestinationAllocationRowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XFloat;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$CategoryToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.UiState;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda6(Context context, Function1 function1) {
        this.$r8$classId = 11;
        this.f$1 = function1;
        this.f$0 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.squareup.cash.moneybot.screens.HomeSourceContext] */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.squareup.cash.moneybot.screens.HomeSourceContext] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EntryPointSurface entryPointSurface;
        MoneybotChatScreen moneybotChatScreen;
        ChatKickoffParams chatKickoffParams;
        String str;
        String str2;
        int i = this.$r8$classId;
        int i2 = 5;
        int i3 = 10;
        int i4 = 20;
        int i5 = 4;
        int i6 = 3;
        int i7 = 0;
        Continuation continuation = null;
        TokenRange tokenRange = null;
        MoneybotChatScreen copy$default = null;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                MusicViewModel.Loaded loaded = (MusicViewModel.Loaded) obj3;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = loaded.tracks;
                lazyListScope.items(list.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 0), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, loaded, (Function1) obj2, i3), true, 802480018));
                if (loaded.hasSelectedTrack) {
                    LazyListScope.item$default(lazyListScope, null, null, TrackRowKt.f507lambda$1966024485, 3);
                }
                return Unit.INSTANCE;
            case 1:
                ((TransactionWrapper) obj).getClass();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = ((RealPromotedAppletTileStore) obj3).database;
                GpsConfigQueries gpsConfigQueries = cashAccountDatabaseImpl.promotedAppletTileQueries;
                gpsConfigQueries.driver.execute(1633878677, "DELETE FROM promotedAppletTiles", null);
                gpsConfigQueries.notifyQueries(1633878677, new CashMapViewKt$$ExternalSyntheticLambda0(25));
                for (Object obj4 : (ArrayList) obj2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    PromotedAppletTile promotedAppletTile = (PromotedAppletTile) obj4;
                    GpsConfigQueries gpsConfigQueries2 = cashAccountDatabaseImpl.promotedAppletTileQueries;
                    String name = promotedAppletTile.appletId.name();
                    String str3 = promotedAppletTile.title;
                    String str4 = promotedAppletTile.subtitle;
                    Image image = promotedAppletTile.image;
                    gpsConfigQueries2.getClass();
                    name.getClass();
                    gpsConfigQueries2.driver.execute(-1565920134, "INSERT OR REPLACE INTO promotedAppletTiles (appletId, sortOrder, title, subtitle, image)\nVALUES (?, ?, ?, ?, ?)", new CryptoStatementQueries$$ExternalSyntheticLambda2(name, i7, str3, str4, image, gpsConfigQueries2));
                    gpsConfigQueries2.notifyQueries(-1565920134, new CashMapViewKt$$ExternalSyntheticLambda0(26));
                    i7 = i8;
                }
                return Unit.INSTANCE;
            case 2:
                ApiResult.Failure failure = (ApiResult.Failure) obj;
                failure.getClass();
                ((RealChatManager) obj3).analyticsService.submitChatError((String) obj2, AnalyticsMappersKt.toErrorName(failure), "pushMessages");
                return Unit.INSTANCE;
            case 3:
                ((DisposableEffectScope) obj).getClass();
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i5, (MutableState) obj3, (MoneybotChatPresenter) obj2);
            case 4:
                MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) obj3;
                SwipeContext swipeContext = (SwipeContext) obj;
                swipeContext.getClass();
                moneybotHomePresenter.shouldAnimateHomeEntrance = true;
                Analytics analytics = ((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService).analytics;
                String uuid = RealUuidGenerator.generate().toString();
                uuid.getClass();
                ((MutableState) obj2).setValue(uuid);
                boolean z = swipeContext.usedSwipeGesture;
                if (z) {
                    analytics.track(new AppNavigateOpenSpace(AppNavigateOpenSpace.Source.SWIPE, null, AppNavigateOpenSpace.Space.MONEYBOT_HOME, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), null);
                }
                SwipeContext.Source source = swipeContext.source;
                switch (source != null ? MoneybotHomePresenterKt$WhenMappings.$EnumSwitchMapping$0[source.ordinal()] : -1) {
                    case -1:
                    case 6:
                        entryPointSurface = null;
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        entryPointSurface = EntryPointSurface.MONEY;
                        break;
                    case 2:
                        entryPointSurface = EntryPointSurface.PAYMENT_PAD;
                        break;
                    case 3:
                    case 4:
                        entryPointSurface = EntryPointSurface.ACTIVITY;
                        break;
                    case 5:
                        entryPointSurface = EntryPointSurface.NEIGHBORHOODS;
                        break;
                }
                analytics.track(new MoneybotHomeBrowseViewPage(uuid, entryPointSurface, z ? Gesture.SWIPE : Gesture.TAP), null);
                return Unit.INSTANCE;
            case 5:
                RealAlertBannerPresenter realAlertBannerPresenter = (RealAlertBannerPresenter) obj3;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) realAlertBannerPresenter.syncValueReader;
                MutableState mutableState = (MutableState) obj2;
                PromptButtonListViewEvent promptButtonListViewEvent = (PromptButtonListViewEvent) obj;
                promptButtonListViewEvent.getClass();
                if (promptButtonListViewEvent instanceof PromptButtonListViewEvent.PromptTapped) {
                    PromptButtonListViewEvent.PromptTapped promptTapped = (PromptButtonListViewEvent.PromptTapped) promptButtonListViewEvent;
                    for (CdfEvent cdfEvent : promptTapped.tapCdfEvents) {
                        Pair[] cdfEventParams = realAlertBannerPresenter.cdfEventParams();
                        realMoneybotAnalyticsService.submitCdfEvent(cdfEvent, (Pair[]) Arrays.copyOf(cdfEventParams, cdfEventParams.length));
                    }
                    ((Function2) realAlertBannerPresenter.router).invoke(promptTapped.prompt, Boolean.FALSE);
                } else {
                    if (!(promptButtonListViewEvent instanceof PromptButtonListViewEvent.PromptRendered)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PromptButtonListViewEvent.PromptRendered promptRendered = (PromptButtonListViewEvent.PromptRendered) promptButtonListViewEvent;
                    if (((Set) mutableState.getValue()).add(promptRendered.id)) {
                        for (CdfEvent cdfEvent2 : promptRendered.viewCdfEvents) {
                            Pair[] cdfEventParams2 = realAlertBannerPresenter.cdfEventParams();
                            realMoneybotAnalyticsService.submitCdfEvent(cdfEvent2, (Pair[]) Arrays.copyOf(cdfEventParams2, cdfEventParams2.length));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                EarningsHeaderPresenter earningsHeaderPresenter = (EarningsHeaderPresenter) obj3;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService2 = (RealMoneybotAnalyticsService) earningsHeaderPresenter.stringManager;
                MutableState mutableState2 = (MutableState) obj2;
                SuggestionListViewEvent suggestionListViewEvent = (SuggestionListViewEvent) obj;
                suggestionListViewEvent.getClass();
                if (suggestionListViewEvent instanceof SuggestionListViewEvent.SuggestionTapped) {
                    SuggestionListViewEvent.SuggestionTapped suggestionTapped = (SuggestionListViewEvent.SuggestionTapped) suggestionListViewEvent;
                    for (CdfEvent cdfEvent3 : suggestionTapped.tapCdfEvents) {
                        Pair[] cdfEventParams$1 = earningsHeaderPresenter.cdfEventParams$1();
                        realMoneybotAnalyticsService2.submitCdfEvent(cdfEvent3, (Pair[]) Arrays.copyOf(cdfEventParams$1, cdfEventParams$1.length));
                    }
                    JobKt.launch$default((CoroutineScope) earningsHeaderPresenter.moneyFormatter, null, null, new MusicPresenter$models$2$1(earningsHeaderPresenter, suggestionTapped, continuation, i4), 3);
                    ChatKickoffParams chatKickoffParams2 = new ChatKickoffParams(null, CollectionsKt__CollectionsJVMKt.listOf(new Message.TextMessage(null, Message.Role.ROLE_USER, null, suggestionTapped.prompt, true, false)), 12);
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) earningsHeaderPresenter.currentMonthFilter;
                    MoneybotChatEntryPoint moneybotChatEntryPoint = MoneybotChatEntryPoint.MONEYBOT_HOME;
                    String str5 = ((PluginContext) earningsHeaderPresenter.nowAtEntry).homeSessionId;
                    if (str5 != null) {
                        HomeItemType homeItemType = HomeItemType.WIDGET;
                        continuation = new HomeSourceContext(str5, 4);
                    }
                    screenNavigator.goTo(new MoneybotChatScreen(chatKickoffParams2, moneybotChatEntryPoint, (HomeSourceContext) continuation, suggestionTapped.suggestionsId, (MoneybotPendingSheet$TransferOptionPicker) null, 48));
                } else {
                    if (!(suggestionListViewEvent instanceof SuggestionListViewEvent.SuggestionRendered)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SuggestionListViewEvent.SuggestionRendered suggestionRendered = (SuggestionListViewEvent.SuggestionRendered) suggestionListViewEvent;
                    if (((Set) mutableState2.getValue()).add(suggestionRendered.clientSuggestionId)) {
                        for (CdfEvent cdfEvent4 : suggestionRendered.viewCdfEvents) {
                            Pair[] cdfEventParams$12 = earningsHeaderPresenter.cdfEventParams$1();
                            realMoneybotAnalyticsService2.submitCdfEvent(cdfEvent4, (Pair[]) Arrays.copyOf(cdfEventParams$12, cdfEventParams$12.length));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                PendingInput.TransferOptionPicker transferOptionPicker = (PendingInput.TransferOptionPicker) ((PendingInput) obj3);
                String str6 = transferOptionPicker.placeholderKey;
                PluginContext pluginContext = ((TemplateCardPresenter) obj2).pluginContext;
                String str7 = pluginContext.renderableKey;
                Money money = transferOptionPicker.amount;
                List list2 = transferOptionPicker.transferOptions;
                String str8 = transferOptionPicker.title;
                String str9 = transferOptionPicker.cta;
                TransferOptionPickerSelection transferOptionPickerSelection = transferOptionPicker.selectedOption;
                List list3 = transferOptionPicker.hiddenOptionValues;
                boolean z2 = transferOptionPicker.balanceGatingEnabled;
                boolean z3 = transferOptionPicker.forceDarkMode;
                MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker = new MoneybotPendingSheet$TransferOptionPicker(str6, str7, money, list2, str8, str9, transferOptionPickerSelection, z3, list3, z2);
                Screen screen = pluginContext.contextScreen;
                MoneybotChatScreen moneybotChatScreen2 = screen instanceof MoneybotChatScreen ? (MoneybotChatScreen) screen : null;
                if (((moneybotChatScreen2 == null || (chatKickoffParams = moneybotChatScreen2.chatKickoffParams) == null) ? null : chatKickoffParams.sessionId) != null) {
                    copy$default = MoneybotChatScreen.copy$default(moneybotChatScreen2, null, moneybotPendingSheet$TransferOptionPicker, 31);
                } else {
                    String str10 = pluginContext.chatSessionId;
                    if (moneybotChatScreen2 != null) {
                        ChatKickoffParams chatKickoffParams3 = moneybotChatScreen2.chatKickoffParams;
                        if (str10 != null) {
                            if (chatKickoffParams3 != null) {
                                List list4 = chatKickoffParams3.initialMessages;
                                boolean z4 = chatKickoffParams3.autoSend;
                                byte[] bArr = chatKickoffParams3.rawKickoffMessagesBytes;
                                list4.getClass();
                                chatKickoffParams3 = new ChatKickoffParams(list4, z4, str10, bArr);
                            } else {
                                chatKickoffParams3 = new ChatKickoffParams(str10, null, 11);
                            }
                        }
                        copy$default = MoneybotChatScreen.copy$default(moneybotChatScreen2, chatKickoffParams3, moneybotPendingSheet$TransferOptionPicker, 30);
                    } else if (str10 != null) {
                        moneybotChatScreen = new MoneybotChatScreen(new ChatKickoffParams(str10, null, 11), (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, moneybotPendingSheet$TransferOptionPicker, 30);
                        return new TransferOptionPickerScreen(money, list2, askedQuestion, str8, str9, transferOptionPickerSelection, list3, z2, z3, moneybotChatScreen);
                    }
                }
                moneybotChatScreen = copy$default;
                return new TransferOptionPickerScreen(money, list2, askedQuestion, str8, str9, transferOptionPickerSelection, list3, z2, z3, moneybotChatScreen);
            case 8:
                RotatingPromptItem rotatingPromptItem = (RotatingPromptItem) obj3;
                Function1 function1 = (Function1) obj2;
                RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
                relativeLayoutBounds.getClass();
                if (rotatingPromptItem.slotIndex == 0 && !rotatingPromptItem.isIncoming) {
                    function1.invoke(Integer.valueOf(((int) relativeLayoutBounds.bottomRight) - ((int) relativeLayoutBounds.topLeft)));
                }
                return Unit.INSTANCE;
            case 9:
                Animatable animatable = (Animatable) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                if (((RotatingPromptItem) obj3).isOutgoing) {
                    reusableGraphicsLayerScope.setAlpha(1.0f - ((Number) animatable.getValue()).floatValue());
                    reusableGraphicsLayerScope.setTranslationY(((Number) animatable.getValue()).floatValue() * (-(reusableGraphicsLayerScope.graphicsDensity.getDensity() * 30.0f)));
                }
                return Unit.INSTANCE;
            case 10:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                ((ParcelableSnapshotMutableIntState) obj3).setIntValue((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                ((ParcelableSnapshotMutableIntState) obj2).setIntValue((int) Float.intBitsToFloat((int) (layoutCoordinates.mo843localToWindowMKHz9U(0L) & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
            case 11:
                Function1 function12 = (Function1) obj2;
                Context context = (Context) obj3;
                List list5 = (List) obj;
                list5.getClass();
                if (!list5.isEmpty()) {
                    List<Uri> list6 = list5;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    for (Uri uri : list6) {
                        String uri2 = uri.toString();
                        uri2.getClass();
                        String type2 = context.getContentResolver().getType(uri);
                        if (type2 == null) {
                            type2 = "image/jpeg";
                        }
                        arrayList.add(new MoneybotChatViewEvent.AttachData.Attachment(uri2, type2));
                    }
                    function12.invoke(new MoneybotChatViewEvent.AttachData(arrayList));
                }
                return Unit.INSTANCE;
            case 12:
                Lifecycle lifecycle = (Lifecycle) obj3;
                ParticleGridRenderer particleGridRenderer = (ParticleGridRenderer) obj2;
                ((DisposableEffectScope) obj).getClass();
                lifecycle.addObserver(particleGridRenderer);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i2, lifecycle, particleGridRenderer);
            case 13:
                Function1 function13 = (Function1) obj2;
                int intValue = ((Integer) obj).intValue();
                Iterator it = ((TokenizedText) obj3).tokens.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        TokenRange tokenRange2 = (TokenRange) next;
                        if (intValue >= tokenRange2.start && intValue < tokenRange2.end) {
                            tokenRange = next;
                        }
                    }
                }
                TokenRange tokenRange3 = tokenRange;
                if (tokenRange3 != null) {
                    function13.invoke(tokenRange3.placeholderKey);
                }
                return Unit.INSTANCE;
            case 14:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i9 = SplitButtons.$r8$clinit;
                layoutSpec.getClass();
                return new XFloat((((XFloat) ((SplitButtons$$ExternalSyntheticLambda0) obj3).invoke(layoutSpec)).value / 2.0f) - (((SplitButtons) obj2).spacing / 2.0f));
            case 15:
                OnPressBehaviour onPressBehaviour = (OnPressBehaviour) obj3;
                State state = (State) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                if (onPressBehaviour == OnPressBehaviour.SCALE_WHOLE_BUTTON) {
                    reusableGraphicsLayerScope2.setScaleX(((Number) state.getValue()).floatValue());
                    reusableGraphicsLayerScope2.setScaleY(((Number) state.getValue()).floatValue());
                }
                return Unit.INSTANCE;
            case 16:
                NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) obj3;
                RealNearbyManager realNearbyManager = (RealNearbyManager) obj2;
                ((DisposableEffectScope) obj).getClass();
                Timber.Forest.d("NEARBY: startAdvertising " + nearbyAdvertisement.toUuid(), new Object[0]);
                RealNearbyAdvertiser realNearbyAdvertiser = realNearbyManager.nearbyAdvertiser;
                RealBleManager realBleManager = realNearbyAdvertiser.bleManager;
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new UUID[]{UUID.fromString("0000FC44-0000-1000-8000-00805F9B34FB"), nearbyAdvertisement.toUuid()});
                listOf.getClass();
                AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeTxPowerLevel(true);
                List list7 = listOf;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new ParcelUuid((UUID) it2.next()));
                }
                includeTxPowerLevel.getClass();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    includeTxPowerLevel.addServiceUuid((ParcelUuid) it3.next());
                }
                AdvertiseData build = includeTxPowerLevel.build();
                AdvertiseSettings build2 = new AdvertiseSettings.Builder().setConnectable(false).setAdvertiseMode(2).setTxPowerLevel(1).setTimeout(0).build();
                RealBleManager$startAdvertising$callback$1 realBleManager$startAdvertising$callback$1 = new RealBleManager$startAdvertising$callback$1();
                BluetoothLeAdvertiser bluetoothLeAdvertiser = realBleManager.btAdvertiser;
                if (bluetoothLeAdvertiser != null) {
                    bluetoothLeAdvertiser.startAdvertising(build2, build, realBleManager$startAdvertising$callback$1);
                }
                realNearbyAdvertiser.activeAdvertisements.put(nearbyAdvertisement, realBleManager$startAdvertising$callback$1);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(6, nearbyAdvertisement, realNearbyManager);
            case 17:
                RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) obj2;
                Iterator it4 = ((List) obj3).iterator();
                while (it4.hasNext()) {
                    ErrorEvent.Meta.Companion companion = ((EngagedItemToken) it4.next()).token;
                    if (companion instanceof EngagedItemToken$Token$MerchantToken) {
                        str = ((EngagedItemToken$Token$MerchantToken) companion).value;
                    } else if (companion instanceof EngagedItemToken$Token$CategoryToken) {
                        str = ((EngagedItemToken$Token$CategoryToken) companion).value;
                    } else if (companion != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    GpsConfigQueries gpsConfigQueries3 = realOffersTabRepository.cashDatabase.offersRecentlyViewedQueries;
                    gpsConfigQueries3.getClass();
                    str.getClass();
                    gpsConfigQueries3.driver.execute(1023738195, "DELETE FROM offersRecentlyViewed\nWHERE token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 20));
                    gpsConfigQueries3.notifyQueries(1023738195, new OffersHomeQueries$$ExternalSyntheticLambda1(22));
                }
                return Unit.INSTANCE;
            case 18:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 1, ((Alias$Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).sync_stateAdapter);
                Long l = androidCursor.getLong(2);
                l.getClass();
                return ((OffersAvatarKt$$ExternalSyntheticLambda0) obj3).invoke(m1431m, m, l);
            case 19:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((OffersSheet.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).offer_typeAdapter.encode((OfferType) obj3));
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, (byte[]) ((OffersSheet.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).sheet_keyAdapter.encode((OfferSheetKey) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key));
                return Unit.INSTANCE;
            case 21:
                Function1 function14 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                ListIterator listIterator = ((OffersHomeListItemViewModel.CategoryPillsSectionViewModel) obj3).models.listIterator(0);
                while (listIterator.hasNext()) {
                    PillViewModel pillViewModel = (PillViewModel) listIterator.next();
                    Modifier testTag = TestTagKt.testTag(Modifier.Companion.$$INSTANCE, "OfferFilterChip");
                    pillViewModel.getClass();
                    FilterBarScope.legacyChip$default(filterBarScope, new UtilsKt$$ExternalSyntheticLambda0(29, function14, pillViewModel), testTag, false, false, null, pillViewModel.text, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(pillViewModel, 16), true, 1030518084), 20);
                }
                return Unit.INSTANCE;
            case 22:
                AccountPickerViewModel.AccountList accountList = (AccountPickerViewModel.AccountList) obj3;
                Function1 function15 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.items$default(lazyListScope2, accountList.accountViewModels.size(), new OffersStyledTextKt$$ExternalSyntheticLambda0(19), new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(i6, accountList, function15), true, -1547552712), 4);
                if (!accountList.isInEditMode) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new MusicViewKt$$ExternalSyntheticLambda7(i4, function15), true, -892160666), 3);
                }
                return Unit.INSTANCE;
            case 23:
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                List list8 = ((AliasPickerViewModel) obj3).accountAliases;
                lazyListScope3.items(list8.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list8, 5), new ComposableLambdaImpl(new AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4(list8, (MutableState) obj2, i7), true, 802480018));
                return Unit.INSTANCE;
            case 24:
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                P2PListRowKt.selectCustomerItems(lazyListScope4, (SelectCustomerViewModel) obj3, (Function1) obj2);
                return Unit.INSTANCE;
            case 25:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) obj2;
                UiState uiState = (UiState) obj;
                PaychecksUiState.Applet buildApplet = uiState != null ? WindowInfoImpl.Companion.buildApplet(poolsListPresenter, uiState) : null;
                PaychecksUiState.PaychecksAppletState paychecksAppletState = buildApplet != null ? buildApplet.state : null;
                int i10 = paychecksAppletState == null ? -1 : PaychecksAppletTilePresenter$WhenMappings.$EnumSwitchMapping$0[paychecksAppletState.ordinal()];
                PaychecksAppletTileModel.Loading loading = PaychecksAppletTileModel.Loading.INSTANCE;
                if (i10 != -1) {
                    if (i10 == 1) {
                        String str11 = buildApplet.title;
                        if (str11 == null) {
                            str11 = androidStringManager.get(R.string.paychecks_applet_title);
                        }
                        return new PaychecksAppletTileModel.Uninstalled(str11, androidStringManager.get(R.string.paychecks_applet_subtitle_nux_banking_packaging_half_width_cash_green), buildApplet.clientRoute, promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null);
                    }
                    if (i10 == 2) {
                        PaychecksUiState.Applet.RolloverAwareContent rolloverAwareContent = buildApplet.label;
                        Instant instant = (Instant) poolsListPresenter.navigator;
                        instant.getClass();
                        Long l2 = rolloverAwareContent.rolloverDate;
                        String str12 = (String) (l2 != null ? instant.isBefore(Instant.ofEpochMilli(l2.longValue())) : false ? rolloverAwareContent.preRolloverContent : rolloverAwareContent.postRolloverContent);
                        MatcherMatchResult find = new Regex("\\*\\*(.*?)\\*\\*").find(str12);
                        String obj5 = (find == null || (str2 = (String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1)) == null) ? null : StringsKt.trim(str2).toString();
                        String obj6 = StringsKt.trim(new Regex("\\*\\*.*?\\*\\*").replace(str12, "")).toString();
                        String str13 = buildApplet.title;
                        if (str13 == null) {
                            str13 = androidStringManager.get(R.string.paychecks_applet_title);
                        }
                        String str14 = str13;
                        String str15 = buildApplet.clientRoute;
                        PaychecksUiState.PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = buildApplet.benefitsStatusSection;
                        return new PaychecksAppletTileModel.Installed(str14, obj5, obj6, str15, (paychecksBenefitsStatusSection != null ? paychecksBenefitsStatusSection.state : null) == PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.ACTIVE_STATE);
                    }
                    if (i10 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((ErrorReporter) poolsListPresenter.localeAssetProvider).report(new GeneralPaychecksException("Unexpected " + buildApplet.state + " state when building Paychecks applet model"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return loading;
            case 26:
                AllocationDistribution allocationDistribution = (AllocationDistribution) obj;
                allocationDistribution.getClass();
                return PaycheckAllocationDistributionMappersKt.toCondensedPaycheckAllocationDistribution((LocalHomePresenter) obj3, allocationDistribution, (PaychecksUiConfiguration) ((State) obj2).getValue());
            case 27:
                AllocationDistribution allocationDistribution2 = (AllocationDistribution) obj;
                allocationDistribution2.getClass();
                return PaycheckAllocationDistributionMappersKt.toCondensedPaycheckAllocationDistribution((TapToPayPresenter) obj3, allocationDistribution2, (PaychecksUiConfiguration) ((MutableState) obj2).getValue());
            case 28:
                EditDistributionViewModel.Content.Configuration configuration = (EditDistributionViewModel.Content.Configuration) obj3;
                Function1 function16 = (Function1) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, configuration.accessibilityLabel);
                String str16 = configuration.accessibilityActionLabel;
                if (str16 == null) {
                    str16 = configuration.action.text;
                }
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, str16, new ConfigurationRowKt$$ExternalSyntheticLambda0(function16, configuration, 1));
                return Unit.INSTANCE;
            default:
                DestinationAllocationRowViewModel destinationAllocationRowViewModel = (DestinationAllocationRowViewModel) obj3;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, destinationAllocationRowViewModel.accessibilityContent.label);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, destinationAllocationRowViewModel.accessibilityContent.actionLabel, new DestinationAllocationRowKt$$ExternalSyntheticLambda2((Function1) obj2, destinationAllocationRowViewModel, 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
