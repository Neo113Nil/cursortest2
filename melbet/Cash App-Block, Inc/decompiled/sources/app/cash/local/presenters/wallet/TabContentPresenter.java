package app.cash.local.presenters.wallet;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.RealBrandFollowPresenter$Factory$Impl;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.presenters.wallet.TabContentPresenterKt;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.OrderStatusKt;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Brand;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Followed;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.R;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$OtpInfo$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NeighborhoodsSegmentedTab;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NeighborhoodsTabEmbeddedMap;
import com.squareup.cash.featureflags.LocalFeatureFlags$NeighborhoodsPosCanUnlink;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.data.real.RealPayDataLoader$loadPayData$2;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.compose.LifecycleKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class TabContentPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final ArrayList brandCollectionSections;
    public final ArrayList brandCollections;
    public final RealBrandFollowPresenter$Factory$Impl brandFollowPresenterFactory;
    public final AndroidClock clock;
    public final FeatureFlag$EnabledDisabledFeatureFlag$Options embeddedMap;
    public final GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive;
    public final FeatureFlagManager featureFlagManager;
    public final RealLocalLauncher launcher;
    public final GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer;
    public final RealMarketingMessageRepository marketingMessageRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealLocalOrderRepository orderRepository;
    public final RefreshMarketingMessages refreshMarketingMessages;
    public final FeatureFlag$EnabledDisabledFeatureFlag$Options segmentedTab;
    public final boolean showMapButton;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;
    public final Lazy tabToolbarPresenter$delegate;
    public final TabToolbarPresenter$Factory$Impl tabToolbarTransformerFactory;
    public final SharedFlowImpl toolbarEvents;
    public final ArrayList widgetList;

    public TabContentPresenter(RealLocalBrandSyncer realLocalBrandSyncer, RealLocalOrderRepository realLocalOrderRepository, AndroidStringManager androidStringManager, AndroidClock androidClock, Analytics analytics, RealLocalLauncher realLocalLauncher, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, LocalInstalledStore localInstalledStore, FeatureFlagManager featureFlagManager, RealMarketingMessageRepository realMarketingMessageRepository, RefreshMarketingMessages refreshMarketingMessages, RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl, GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse, BetterNavigator.ScreenNavigator screenNavigator) {
        this.syncer = realLocalBrandSyncer;
        this.orderRepository = realLocalOrderRepository;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.analytics = analytics;
        this.launcher = realLocalLauncher;
        this.tabToolbarTransformerFactory = tabToolbarPresenter$Factory$Impl;
        this.store = localInstalledStore;
        this.featureFlagManager = featureFlagManager;
        this.marketingMessageRepository = realMarketingMessageRepository;
        this.refreshMarketingMessages = refreshMarketingMessages;
        this.brandFollowPresenterFactory = realBrandFollowPresenter$Factory$Impl;
        this.navigator = screenNavigator;
        List list = getNeighborhoodsTabContentResponse.applet_ordering;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            TabContentWidget tabContentWidget = null;
            if (!it.hasNext()) {
                this.widgetList = arrayList;
                this.enrollmentIncentive = getNeighborhoodsTabContentResponse.enrollment_incentive;
                this.localCashExplainer = getNeighborhoodsTabContentResponse.local_cash_explainer;
                List list2 = getNeighborhoodsTabContentResponse.brand_collection_sections;
                ArrayList filterNotNull = CollectionsKt.filterNotNull(list2.isEmpty() ? CollectionsKt__CollectionsJVMKt.listOf(getNeighborhoodsTabContentResponse.brand_collection) : list2);
                this.brandCollectionSections = filterNotNull;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = filterNotNull.iterator();
                while (it2.hasNext()) {
                    BrandCollectionData brandCollectionData = BrandCollectionDataKt.toBrandCollectionData((BrandCollection) it2.next());
                    if (brandCollectionData != null) {
                        arrayList2.add(brandCollectionData);
                    }
                }
                this.brandCollections = arrayList2;
                Boolean bool = getNeighborhoodsTabContentResponse.show_map_button;
                this.showMapButton = bool != null ? bool.booleanValue() : false;
                this.toolbarEvents = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                this.tabToolbarPresenter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Worker$$ExternalSyntheticLambda0(this, 22));
                this.segmentedTab = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$NeighborhoodsSegmentedTab.INSTANCE);
                this.embeddedMap = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$NeighborhoodsTabEmbeddedMap.INSTANCE);
                return;
            }
            int ordinal = ((GetNeighborhoodsTabContentResponse.AppletType) it.next()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    tabContentWidget = TabContentWidget.LOCAL_CASH;
                } else if (ordinal == 2) {
                    tabContentWidget = TabContentWidget.REORDER;
                } else if (ordinal == 3) {
                    tabContentWidget = TabContentWidget.BRAND_COLLECTION;
                } else if (ordinal == 4) {
                    tabContentWidget = TabContentWidget.FOLLOWING;
                } else {
                    if (ordinal != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        throw null;
                    }
                    tabContentWidget = TabContentWidget.MARKETING_MESSAGE;
                }
            }
            if (tabContentWidget != null) {
                arrayList.add(tabContentWidget);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0c8a  */
    /* JADX WARN: Type inference failed for: r0v5, types: [app.cash.broadway.presenter.molecule.MoleculePresenter] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [app.cash.local.primitives.OrderStatus] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [com.squareup.protos.cash.local.client.v1.LocalColor] */
    /* JADX WARN: Type inference failed for: r14v17, types: [com.squareup.protos.cash.local.client.v1.LocalColor] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r42v1, types: [app.cash.local.viewmodels.wallet.BrandCollectionModel] */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1, types: [com.squareup.protos.cash.local.client.v1.LocalImage] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.squareup.protos.cash.local.client.v1.LocalText] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4, types: [com.squareup.protos.cash.local.client.v1.LocalImage] */
    /* JADX WARN: Type inference failed for: r47v5 */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r48v5 */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r49v3 */
    /* JADX WARN: Type inference failed for: r49v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r49v5 */
    /* JADX WARN: Type inference failed for: r49v6 */
    /* JADX WARN: Type inference failed for: r49v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r49v8 */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Type inference failed for: r50v1, types: [com.squareup.protos.cash.local.client.v1.LocalImage] */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v4 */
    /* JADX WARN: Type inference failed for: r50v5, types: [app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge] */
    /* JADX WARN: Type inference failed for: r50v6 */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1, types: [app.cash.local.primitives.OrderStatus] */
    /* JADX WARN: Type inference failed for: r51v2 */
    /* JADX WARN: Type inference failed for: r5v32, types: [com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [com.squareup.protos.cash.local.client.v1.LocalImage] */
    /* JADX WARN: Type inference failed for: r8v30 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalHomeViewModel models(Flow flow, Composer composer, int i) {
        Object zzmhVar;
        TabContentPresenter tabContentPresenter;
        MutableState mutableState;
        int i2;
        ArrayList arrayList;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Integer num;
        TabContentPresenter tabContentPresenter2;
        char c;
        Continuation continuation;
        Object zzmhVar2;
        GapComposer gapComposer;
        Boolean bool;
        Map map;
        MutableState mutableState5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        char c2;
        Continuation continuation2;
        Object localCashIncentive;
        Iterator it;
        FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options;
        MutableState mutableState6;
        Iterator it2;
        Object obj;
        ArrayList arrayList4;
        Resources resources;
        ?? listOfNotNull;
        Object obj2;
        String str;
        ?? r50;
        LinkedHashMap linkedHashMap;
        Object obj3;
        ?? r46;
        LocalText localText;
        String str2;
        String str3;
        MutableState mutableState7;
        Iterator it3;
        Object obj4;
        Resources resources2;
        ?? r47;
        Iterator it4;
        LocalFulfillment.InStoreDetails inStoreDetails;
        String str4;
        ?? r5;
        Iterator it5;
        LinkedHashMap linkedHashMap2;
        Continuation brandCollectionModel;
        FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options2;
        ?? r14;
        Color color;
        Object obj5;
        MarketingMessageBadge marketingMessageBadge;
        ?? r502;
        MutableState mutableState8;
        Iterator it6;
        MutableState mutableState9;
        String str5;
        LocalText localText2;
        LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder pastOrder;
        LocalText localText3;
        AndroidSyncValueSpecs$OtpInfo$1 androidSyncValueSpecs$OtpInfo$1 = AndroidSyncValueSpecs.LocalAccount;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources3 = androidStringManager.resources;
        flow.getClass();
        ?? r3 = (GapComposer) composer;
        r3.startReplaceGroup(146152619);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = r3.changedInstance(this);
        Object rememberedValue = r3.rememberedValue();
        int i3 = 15;
        Object obj6 = Composer.Companion.Empty;
        Continuation continuation3 = null;
        if (changedInstance || rememberedValue == obj6) {
            rememberedValue = new BlockRunner$cancel$1(this, continuation3, i3);
            r3.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect((Composer) r3, unit, (Function2) rememberedValue);
        Object rememberedValue2 = r3.rememberedValue();
        if (rememberedValue2 == obj6) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            r3.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState10 = (MutableState) rememberedValue2;
        Object rememberedValue3 = r3.rememberedValue();
        int i4 = 11;
        if (rememberedValue3 == obj6) {
            rememberedValue3 = new DateInputKt$$ExternalSyntheticLambda5(i4, mutableState10);
            r3.updateRememberedValue(rememberedValue3);
        }
        SwipeKt.SwipeHandler(this, (Function1) rememberedValue3, r3, ((i >> 3) & 14) | 48);
        Object[] objArr = {unit};
        boolean changedInstance2 = r3.changedInstance(this);
        Object rememberedValue4 = r3.rememberedValue();
        if (changedInstance2 || rememberedValue4 == obj6) {
            rememberedValue4 = new EventBridge$sendEvent$1(this, mutableState10, continuation3, 9);
            r3.updateRememberedValue(rememberedValue4);
        }
        LifecycleKt.LifecycleLaunchedEffect(objArr, null, null, (Function2) rememberedValue4, r3, 0);
        TabToolbarInternalViewModel tabToolbarInternalViewModel = (TabToolbarInternalViewModel) ((MoleculePresenter) this.tabToolbarPresenter$delegate.getValue()).models(this.toolbarEvents, r3, 0);
        Object[] objArr2 = new Object[0];
        Object rememberedValue5 = r3.rememberedValue();
        if (rememberedValue5 == obj6) {
            rememberedValue5 = new LocalMapKt$$ExternalSyntheticLambda3(10);
            r3.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue5, r3, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue6 = r3.rememberedValue();
        if (rememberedValue6 == obj6) {
            rememberedValue6 = new LocalMapKt$$ExternalSyntheticLambda3(11);
            r3.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue6, r3, 48);
        Integer valueOf = Integer.valueOf(((RefreshState) mutableState11.getValue()).key);
        boolean changedInstance3 = r3.changedInstance(this) | r3.changed(mutableState12) | r3.changed(mutableState11);
        Object rememberedValue7 = r3.rememberedValue();
        if (changedInstance3 || rememberedValue7 == obj6) {
            rememberedValue7 = new TabContentPresenter$models$4$1(this, mutableState12, mutableState11, null);
            r3.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect((Composer) r3, valueOf, (Function2) rememberedValue7);
        Object[] objArr4 = new Object[0];
        Object rememberedValue8 = r3.rememberedValue();
        if (rememberedValue8 == obj6) {
            rememberedValue8 = new LocalMapKt$$ExternalSyntheticLambda3(12);
            r3.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue8, r3, 48);
        List list = (List) mutableState13.getValue();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it7 = list.iterator();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            ?? r21 = continuation3;
            if (!it7.hasNext()) {
                MutableState mutableState14 = mutableState11;
                MutableState mutableState15 = mutableState12;
                ArrayList filterNotNull = CollectionsKt.filterNotNull(arrayList5);
                Integer valueOf2 = Integer.valueOf(((RefreshState) mutableState14.getValue()).key);
                boolean changedInstance4 = r3.changedInstance(this) | r3.changed(mutableState13) | r3.changed(mutableState14);
                Object rememberedValue9 = r3.rememberedValue();
                if (changedInstance4 || rememberedValue9 == obj6) {
                    tabContentPresenter = this;
                    mutableState = mutableState14;
                    i2 = 0;
                    zzmhVar = new zzmh(tabContentPresenter, mutableState13, mutableState, (Continuation) r21, 9);
                    arrayList = filterNotNull;
                    mutableState2 = mutableState13;
                    r3.updateRememberedValue(zzmhVar);
                } else {
                    tabContentPresenter = this;
                    mutableState = mutableState14;
                    arrayList = filterNotNull;
                    zzmhVar = rememberedValue9;
                    i2 = 0;
                    mutableState2 = mutableState13;
                }
                Updater.LaunchedEffect((Composer) r3, valueOf2, (Function2) zzmhVar);
                Object[] objArr5 = new Object[i2];
                Object rememberedValue10 = r3.rememberedValue();
                if (rememberedValue10 == obj6) {
                    rememberedValue10 = new LocalMapKt$$ExternalSyntheticLambda3(13);
                    r3.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState16 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue10, r3, 48);
                Object[] objArr6 = new Object[i2];
                Object rememberedValue11 = r3.rememberedValue();
                if (rememberedValue11 == obj6) {
                    rememberedValue11 = new LocalMapKt$$ExternalSyntheticLambda3(14);
                    r3.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState17 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue11, r3, 48);
                Integer valueOf3 = Integer.valueOf(((RefreshState) mutableState.getValue()).key);
                boolean changedInstance5 = r3.changedInstance(tabContentPresenter) | r3.changed(mutableState16) | r3.changed(mutableState17) | r3.changed(mutableState);
                Object rememberedValue12 = r3.rememberedValue();
                if (changedInstance5 || rememberedValue12 == obj6) {
                    mutableState3 = mutableState;
                    mutableState4 = mutableState17;
                    num = valueOf3;
                    zzmo zzmoVar = new zzmo(tabContentPresenter, mutableState16, mutableState4, mutableState3, null, 13);
                    tabContentPresenter2 = tabContentPresenter;
                    r3.updateRememberedValue(zzmoVar);
                    rememberedValue12 = zzmoVar;
                } else {
                    num = valueOf3;
                    mutableState3 = mutableState;
                    mutableState4 = mutableState17;
                    tabContentPresenter2 = tabContentPresenter;
                }
                Updater.LaunchedEffect((Composer) r3, num, (Function2) rememberedValue12);
                Object rememberedValue13 = r3.rememberedValue();
                LocalInstalledStore localInstalledStore = tabContentPresenter2.store;
                if (rememberedValue13 == obj6) {
                    c = 15;
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalPosCheckIn), 15);
                    r3.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
                    rememberedValue13 = realLocalInstalledStore$hideBrands$$inlined$map$1;
                } else {
                    c = 15;
                }
                MutableState mutableState18 = mutableState4;
                MutableState mutableState19 = mutableState3;
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue13, null, null, r3, 48, 2);
                Object rememberedValue14 = r3.rememberedValue();
                if (rememberedValue14 == obj6) {
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$12 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(LocalInstalledStoreKt.localCashBalanceOrNothing(localInstalledStore), 14);
                    r3.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$12);
                    rememberedValue14 = realLocalInstalledStore$hideBrands$$inlined$map$12;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue14, null, null, r3, 48, 2);
                Object rememberedValue15 = r3.rememberedValue();
                if (rememberedValue15 == obj6) {
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$13 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(androidSyncValueSpecs$OtpInfo$1), i2);
                    r3.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$13);
                    rememberedValue15 = realLocalInstalledStore$hideBrands$$inlined$map$13;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue15, Boolean.TRUE, null, r3, 48, 2);
                Set keySet = ((Map) mutableState18.getValue()).keySet();
                boolean changed = r3.changed(mutableState18) | r3.changedInstance(tabContentPresenter2);
                Object rememberedValue16 = r3.rememberedValue();
                if (changed || rememberedValue16 == obj6) {
                    continuation = null;
                    rememberedValue16 = new TabContentPresenter$models$7$1(tabContentPresenter2, mutableState18, continuation, i2);
                    r3.updateRememberedValue(rememberedValue16);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect((Composer) r3, keySet, (Function2) rememberedValue16);
                Object rememberedValue17 = r3.rememberedValue();
                if (rememberedValue17 == obj6) {
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$14 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(androidSyncValueSpecs$OtpInfo$1), 22);
                    r3.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$14);
                    rememberedValue17 = realLocalInstalledStore$hideBrands$$inlined$map$14;
                }
                Boolean bool2 = Boolean.FALSE;
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue17, bool2, null, r3, 48, 2);
                Object rememberedValue18 = r3.rememberedValue();
                if (rememberedValue18 == obj6) {
                    rememberedValue18 = Updater.mutableStateOf$default(bool2);
                    r3.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState20 = (MutableState) rememberedValue18;
                Map map2 = (Map) mutableState18.getValue();
                Boolean bool3 = (Boolean) mutableState20.getValue();
                bool3.getClass();
                boolean changed2 = r3.changed(mutableState18) | r3.changedInstance(tabContentPresenter2) | r3.changed(collectAsState4);
                Object rememberedValue19 = r3.rememberedValue();
                if (changed2 || rememberedValue19 == obj6) {
                    gapComposer = r3;
                    bool = bool3;
                    map = map2;
                    zzmhVar2 = new zzmh(this, mutableState18, mutableState20, collectAsState4, null, 10);
                    tabContentPresenter2 = this;
                    mutableState5 = mutableState18;
                    gapComposer.updateRememberedValue(zzmhVar2);
                } else {
                    gapComposer = r3;
                    zzmhVar2 = rememberedValue19;
                    bool = bool3;
                    mutableState5 = mutableState18;
                    map = map2;
                }
                Updater.LaunchedEffect(map, bool, (Function2) zzmhVar2, gapComposer);
                Object rememberedValue20 = gapComposer.rememberedValue();
                if (rememberedValue20 == obj6) {
                    rememberedValue20 = Updater.mutableStateOf$default(bool2);
                    gapComposer.updateRememberedValue(rememberedValue20);
                }
                MutableState mutableState21 = (MutableState) rememberedValue20;
                Object rememberedValue21 = gapComposer.rememberedValue();
                if (rememberedValue21 == obj6) {
                    rememberedValue21 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) tabContentPresenter2.featureFlagManager).peekCurrentValue(LocalFeatureFlags$NeighborhoodsPosCanUnlink.INSTANCE)).enabled());
                    gapComposer.updateRememberedValue(rememberedValue21);
                }
                boolean booleanValue = ((Boolean) rememberedValue21).booleanValue();
                Object rememberedValue22 = gapComposer.rememberedValue();
                ArrayList arrayList6 = tabContentPresenter2.brandCollections;
                ArrayList arrayList7 = tabContentPresenter2.widgetList;
                if (rememberedValue22 == obj6) {
                    if (arrayList7.contains(TabContentWidget.BRAND_COLLECTION)) {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.take(((BrandCollectionData) it8.next()).locations, 10), arrayList8);
                            arrayList6 = arrayList6;
                        }
                        arrayList2 = arrayList6;
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList9 = new ArrayList();
                        Iterator it9 = arrayList8.iterator();
                        while (it9.hasNext()) {
                            Object next = it9.next();
                            if (hashSet.add(((BrandCollectionData.Location) next).brandSpot)) {
                                arrayList9.add(next);
                            }
                        }
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                        Iterator it10 = arrayList9.iterator();
                        while (it10.hasNext()) {
                            BrandCollectionData.Location location = (BrandCollectionData.Location) it10.next();
                            BrandSpot brandSpot = location.brandSpot;
                            linkedHashMap3.put(brandSpot, new BrandCollectionBrandFollowPresenter(tabContentPresenter2.brandFollowPresenterFactory.create(brandSpot, LocalTabScreen.INSTANCE, location.banner, tabContentPresenter2.navigator), FlowKt.MutableSharedFlow$default(0, 50, null, 4)));
                            booleanValue = booleanValue;
                            it10 = it10;
                            arrayList7 = arrayList7;
                        }
                        arrayList3 = arrayList7;
                        z = booleanValue;
                        c2 = 4;
                        rememberedValue22 = linkedHashMap3;
                    } else {
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        z = booleanValue;
                        c2 = 4;
                        rememberedValue22 = EmptyMap.INSTANCE;
                        rememberedValue22.getClass();
                    }
                    gapComposer.updateRememberedValue(rememberedValue22);
                } else {
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    z = booleanValue;
                    c2 = 4;
                }
                Map map3 = (Map) rememberedValue22;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                gapComposer.startReplaceGroup(-1281105303);
                for (Map.Entry entry : map3.entrySet()) {
                    BrandSpot brandSpot2 = (BrandSpot) entry.getKey();
                    BrandCollectionBrandFollowPresenter brandCollectionBrandFollowPresenter = (BrandCollectionBrandFollowPresenter) entry.getValue();
                    gapComposer.startMovableGroup(1385201730, brandCollectionBrandFollowPresenter.presenter);
                    BrandFollowViewModel brandFollowViewModel = (BrandFollowViewModel) brandCollectionBrandFollowPresenter.presenter.models(brandCollectionBrandFollowPresenter.events, gapComposer, 0);
                    gapComposer.end(false);
                    linkedHashMap4.put(brandSpot2, brandFollowViewModel);
                }
                gapComposer.end(false);
                Object rememberedValue23 = gapComposer.rememberedValue();
                RealMarketingMessageRepository realMarketingMessageRepository = tabContentPresenter2.marketingMessageRepository;
                if (rememberedValue23 == obj6) {
                    rememberedValue23 = realMarketingMessageRepository.getMarketingMessages();
                    gapComposer.updateRememberedValue(rememberedValue23);
                }
                GapComposer gapComposer2 = gapComposer;
                Resources resources4 = resources3;
                List list2 = (List) Updater.collectAsState((Flow) rememberedValue23, null, null, gapComposer2, 48, 2).getValue();
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                List list3 = list2;
                Object rememberedValue24 = gapComposer2.rememberedValue();
                int i7 = 1;
                if (rememberedValue24 == obj6) {
                    rememberedValue24 = FlowKt.distinctUntilChanged(new SupportHomePresenter$models$lambda$5$$inlined$map$1(realMarketingMessageRepository.getMarketingMessages(), i7));
                    gapComposer2.updateRememberedValue(rememberedValue24);
                }
                int i8 = 1;
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue24, Boolean.FALSE, null, gapComposer2, 48, 2);
                Integer valueOf4 = Integer.valueOf(((RefreshState) mutableState19.getValue()).key);
                boolean changedInstance6 = gapComposer2.changedInstance(tabContentPresenter2) | gapComposer2.changed(mutableState19);
                Object rememberedValue25 = gapComposer2.rememberedValue();
                if (changedInstance6 || rememberedValue25 == obj6) {
                    continuation2 = null;
                    rememberedValue25 = new TabContentPresenter$models$7$1(tabContentPresenter2, mutableState19, continuation2, i8);
                    gapComposer2.updateRememberedValue(rememberedValue25);
                } else {
                    continuation2 = null;
                }
                Updater.LaunchedEffect(gapComposer2, valueOf4, (Function2) rememberedValue25);
                Continuation continuation4 = continuation2;
                LinkedHashMap linkedHashMap5 = linkedHashMap4;
                TabContentPresenter tabContentPresenter3 = tabContentPresenter2;
                MutableState mutableState22 = mutableState5;
                RealPayDataLoader$loadPayData$2 realPayDataLoader$loadPayData$2 = new RealPayDataLoader$loadPayData$2(flow, null, tabContentPresenter3, z, map3, mutableState22, mutableState15, mutableState2, collectAsState2, collectAsState, mutableState21, mutableState19);
                TabContentPresenter tabContentPresenter4 = tabContentPresenter3;
                MutableState mutableState23 = mutableState22;
                Updater.LaunchedEffect(gapComposer2, flow, realPayDataLoader$loadPayData$2);
                LocalCashBalance localCashBalance = (LocalCashBalance) collectAsState2.getValue();
                LocalPOSCheckIn localPOSCheckIn = (LocalPOSCheckIn) collectAsState.getValue();
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options3 = tabContentPresenter4.segmentedTab;
                if (!featureFlag$EnabledDisabledFeatureFlag$Options3.enabled()) {
                    if (localCashBalance != null) {
                        Long l = localCashBalance.amount;
                        ?? r52 = localCashBalance;
                        if (l == null) {
                            r52 = continuation4;
                        }
                        if (r52 != 0) {
                            LocalCurrencyCode localCurrencyCode = LocalCurrencyCode.USD;
                            localCashIncentive = new LocalHomeViewModel.TabContent.Widget.LocalCash(LocalsKt.format(r52), tabContentPresenter4.localCashExplainer, (localPOSCheckIn == null || !LocalsKt.getCheckedIn(localPOSCheckIn)) ? LocalHomeViewModel.TabContent.Widget.LocalCash.CheckIn.AVAILABLE : LocalHomeViewModel.TabContent.Widget.LocalCash.CheckIn.LINKED);
                            ArrayList arrayList10 = new ArrayList();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                int ordinal = ((TabContentWidget) it.next()).ordinal();
                                if (ordinal != 0) {
                                    AndroidClock androidClock = tabContentPresenter4.clock;
                                    if (ordinal != i8) {
                                        if (ordinal == 2) {
                                            featureFlag$EnabledDisabledFeatureFlag$Options = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                            gapComposer2.startReplaceGroup(2009354380);
                                            gapComposer2.end(false);
                                            listOfNotNull = new ArrayList();
                                            Iterator it11 = arrayList2.iterator();
                                            while (it11.hasNext()) {
                                                BrandCollectionData brandCollectionData = (BrandCollectionData) it11.next();
                                                boolean enabled = tabContentPresenter4.embeddedMap.enabled();
                                                brandCollectionData.getClass();
                                                ArrayList arrayList11 = brandCollectionData.locations;
                                                if (arrayList11.isEmpty()) {
                                                    it5 = it11;
                                                    brandCollectionModel = continuation4;
                                                    linkedHashMap2 = linkedHashMap5;
                                                } else {
                                                    String str6 = brandCollectionData.title;
                                                    String str7 = brandCollectionData.subtitle;
                                                    String str8 = brandCollectionData.caption;
                                                    it5 = it11;
                                                    ?? r472 = enabled ? brandCollectionData.mastheadImage : continuation4;
                                                    ?? r48 = enabled ? brandCollectionData.primaryCtaButtonLabel : continuation4;
                                                    ?? r49 = enabled ? brandCollectionData.primaryCtaClientRoute : continuation4;
                                                    List take = CollectionsKt.take(arrayList11, 10);
                                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                                                    for (Iterator it12 = take.iterator(); it12.hasNext(); it12 = it12) {
                                                        BrandCollectionData.Location location2 = (BrandCollectionData.Location) it12.next();
                                                        arrayList12.add(TabContentPresenterKt.toModel(location2, androidClock, androidStringManager, (BrandFollowViewModel) linkedHashMap5.get(location2.brandSpot)));
                                                    }
                                                    linkedHashMap2 = linkedHashMap5;
                                                    brandCollectionModel = new BrandCollectionModel(str6, str7, str8, arrayList12, r472, r48, r49, tabContentPresenter4.showMapButton);
                                                }
                                                if (brandCollectionModel != null) {
                                                    listOfNotNull.add(brandCollectionModel);
                                                }
                                                linkedHashMap5 = linkedHashMap2;
                                                it11 = it5;
                                            }
                                        } else if (ordinal == 3) {
                                            gapComposer2.startReplaceGroup(2009090012);
                                            Map map4 = (Map) mutableState23.getValue();
                                            map4.getClass();
                                            List<Map.Entry> sortedWith = CollectionsKt.sortedWith(map4.entrySet(), new ViewPager.AnonymousClass1(15));
                                            ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                                            for (Map.Entry entry2 : sortedWith) {
                                                BrandSpot brandSpot3 = (BrandSpot) entry2.getKey();
                                                LocalCard localCard = (LocalCard) entry2.getValue();
                                                String str9 = localCard.title;
                                                if (str9 == null) {
                                                    str9 = localCard.cashtag_with_prefix;
                                                    str9.getClass();
                                                }
                                                Image image = localCard.artwork_image;
                                                ?? localImage = image != null ? new LocalImage(image.light_url, image.dark_url, (Long) null, (Long) null, (LocalColor) null, 60) : continuation4;
                                                LocalCard.ColorPalette colorPalette = localCard.color_palette;
                                                if (colorPalette == null || (color = colorPalette.background_color) == null) {
                                                    featureFlag$EnabledDisabledFeatureFlag$Options2 = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                                    r14 = continuation4;
                                                } else {
                                                    featureFlag$EnabledDisabledFeatureFlag$Options2 = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                                    Color.ModeVariant modeVariant = color.light;
                                                    modeVariant.getClass();
                                                    String str10 = modeVariant.srgb;
                                                    Color.ModeVariant modeVariant2 = color.dark;
                                                    modeVariant2.getClass();
                                                    r14 = new LocalColor(str10, modeVariant2.srgb);
                                                }
                                                arrayList13.add(new LocalHomeViewModel$TabContent$Widget$Portfolio$Brand(brandSpot3, str9, localImage, r14));
                                                featureFlag$EnabledDisabledFeatureFlag$Options3 = featureFlag$EnabledDisabledFeatureFlag$Options2;
                                            }
                                            featureFlag$EnabledDisabledFeatureFlag$Options = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                            Object localHomeViewModel$TabContent$Widget$Portfolio$Followed = new LocalHomeViewModel$TabContent$Widget$Portfolio$Followed(arrayList13);
                                            if (arrayList13.isEmpty()) {
                                                localHomeViewModel$TabContent$Widget$Portfolio$Followed = continuation4;
                                            }
                                            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(localHomeViewModel$TabContent$Widget$Portfolio$Followed);
                                            gapComposer2.end(false);
                                        } else {
                                            if (ordinal != 4) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1182172266, false);
                                            }
                                            gapComposer2.startReplaceGroup(2008194174);
                                            gapComposer2.end(false);
                                            MarketingMessageData marketingMessageData = (MarketingMessageData) CollectionsKt.firstOrNull(list3);
                                            if (marketingMessageData != null) {
                                                LocalColor localColor = marketingMessageData.backgroundColor;
                                                LocalImage localImage2 = marketingMessageData.image;
                                                String str11 = marketingMessageData.cashtag;
                                                Instant instant = marketingMessageData.startsAt;
                                                ZoneId systemDefault = ZoneId.systemDefault();
                                                systemDefault.getClass();
                                                String formatDaysOrDate$default = DateTimesKt.formatDaysOrDate$default(instant, androidStringManager, systemDefault);
                                                String str12 = marketingMessageData.message;
                                                ?? r492 = list3.size() > i8 ? i8 : 0;
                                                MarketingMessageOfferDetails marketingMessageOfferDetails = marketingMessageData.offerDetails;
                                                MarketingMessageData.Badge badge = marketingMessageData.badge;
                                                if ((marketingMessageOfferDetails != null ? marketingMessageOfferDetails.status : continuation4) == Offer.OfferStatus.OFFER_STATUS_REDEEMED) {
                                                    marketingMessageBadge = new MarketingMessageBadge(androidStringManager.get(R.string.local_presenters_marketing_message_redeemed), badge != null ? badge.isViewed : true);
                                                } else if (badge == null) {
                                                    r502 = continuation4;
                                                    obj5 = new LocalHomeViewModel.TabContent.Widget.MarketingMessage(localColor, localImage2, str11, formatDaysOrDate$default, str12, marketingMessageData, r492, r502, ((Boolean) collectAsState5.getValue()).booleanValue());
                                                } else {
                                                    marketingMessageBadge = new MarketingMessageBadge(badge.text, badge.isViewed);
                                                }
                                                r502 = marketingMessageBadge;
                                                obj5 = new LocalHomeViewModel.TabContent.Widget.MarketingMessage(localColor, localImage2, str11, formatDaysOrDate$default, str12, marketingMessageData, r492, r502, ((Boolean) collectAsState5.getValue()).booleanValue());
                                            } else {
                                                obj5 = continuation4;
                                            }
                                            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(obj5);
                                            featureFlag$EnabledDisabledFeatureFlag$Options = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                        }
                                        mutableState6 = mutableState23;
                                        it2 = it;
                                        obj = localCashIncentive;
                                        arrayList4 = arrayList;
                                        resources = resources4;
                                    } else {
                                        featureFlag$EnabledDisabledFeatureFlag$Options = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                        LinkedHashMap linkedHashMap6 = linkedHashMap5;
                                        gapComposer2.startReplaceGroup(2007464713);
                                        gapComposer2.end(false);
                                        if (((List) mutableState15.getValue()).isEmpty()) {
                                            linkedHashMap5 = linkedHashMap6;
                                            mutableState6 = mutableState23;
                                            it2 = it;
                                            obj = localCashIncentive;
                                            resources = resources4;
                                            if (arrayList.isEmpty()) {
                                                arrayList4 = arrayList;
                                                obj2 = continuation4;
                                            } else {
                                                arrayList4 = arrayList;
                                                obj2 = new LocalHomeViewModel.TabContent.Widget.PastOrders(CollectionsKt.take(arrayList4, 1));
                                            }
                                        } else {
                                            List<LocalOrder> list4 = (List) mutableState15.getValue();
                                            ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                            for (LocalOrder localOrder : list4) {
                                                LocalOrder.OrderStatus orderStatus = localOrder.order_status;
                                                ?? orderStatus2 = orderStatus != null ? OrderStatusKt.toOrderStatus(orderStatus) : continuation4;
                                                LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode displayMode = OpenTabStateKt.isClosedInStoreOpenTab(localOrder) ? LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.InStoreOpenTabClosed : LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.Standard;
                                                LocalOrder.LocalOrderBrand localOrderBrand = localOrder.local_order_brand;
                                                if (localOrderBrand == null || (str = localOrderBrand.cashtag) == null) {
                                                    Object obj7 = localOrderBrand != null ? localOrderBrand.name : continuation4;
                                                    if (obj7 == null) {
                                                        str = localOrder.local_brand_name;
                                                        str.getClass();
                                                    } else {
                                                        str = obj7;
                                                    }
                                                }
                                                Iterator it13 = localOrder.order_summary.iterator();
                                                while (true) {
                                                    if (it13.hasNext()) {
                                                        LocalImage localImage3 = ((LocalOrder.OrderSummaryLine) it13.next()).item_image;
                                                        if (localImage3 != null) {
                                                            r50 = localImage3;
                                                        }
                                                    } else {
                                                        r50 = continuation4;
                                                    }
                                                }
                                                LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode displayMode2 = LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.InStoreOpenTabClosed;
                                                if (displayMode == displayMode2) {
                                                    localText = LocalTextsKt.toLocalText(androidStringManager.get(R.string.local_presenters_open_tab_complete));
                                                } else if (orderStatus2 == 0 || (str2 = orderStatus2.currentStatusFulfillmentLabel) == null || (localText = LocalTextsKt.toLocalText(str2)) == null) {
                                                    LocalFulfillment localFulfillment = localOrder.fulfillment;
                                                    if (localFulfillment != null) {
                                                        Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                                                        linkedHashMap = linkedHashMap6;
                                                        LocalLocationSummary localLocationSummary = localOrder.location_summary;
                                                        localLocationSummary.getClass();
                                                        obj3 = DateTimesKt.estimatedTime(fulfillment, androidStringManager, ZoneId.of(localLocationSummary.time_zone));
                                                    } else {
                                                        linkedHashMap = linkedHashMap6;
                                                        obj3 = continuation4;
                                                    }
                                                    if (obj3 == null) {
                                                        localText = LocalTextsKt.toLocalText("Estimated completion time missing");
                                                        r46 = localText;
                                                        String str13 = localOrder.token;
                                                        str13.getClass();
                                                        LocalOrder.LocalOrderBrand localOrderBrand2 = localOrder.local_order_brand;
                                                        ?? r44 = localOrderBrand2 != null ? localOrderBrand2.artwork_image : continuation4;
                                                        if (displayMode == displayMode2) {
                                                            Long l2 = localOrder.paid_at;
                                                            if (l2 != null) {
                                                                long longValue = l2.longValue();
                                                                DateTimeFormatter dateTimeFormatter = DateTimesKt.hourOnlyPatternNoAmPm;
                                                                if (longValue < 1000000000000L) {
                                                                    longValue *= 1000;
                                                                }
                                                                Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
                                                                ofEpochMilli.getClass();
                                                                Instant ofEpochMilli2 = Instant.ofEpochMilli(androidClock.millis());
                                                                str3 = str13;
                                                                mutableState7 = mutableState23;
                                                                it3 = it;
                                                                obj4 = localCashIncentive;
                                                                long max = Math.max(1L, ChronoUnit.MINUTES.between(ofEpochMilli, ofEpochMilli2));
                                                                if (max < 60) {
                                                                    Long valueOf5 = Long.valueOf(max);
                                                                    ArrayMap arrayMap = new ArrayMap(1);
                                                                    arrayMap.put("count", valueOf5);
                                                                    resources4.getClass();
                                                                    Resources resources5 = resources4;
                                                                    String format2 = new MessageFormat(resources5.getString(R.string.local_presenters_open_tab_minutes_ago)).format(arrayMap);
                                                                    format2.getClass();
                                                                    r5 = format2;
                                                                    resources2 = resources5;
                                                                } else if (max < 1440) {
                                                                    Object[] objArr7 = {Long.valueOf(ChronoUnit.HOURS.between(ofEpochMilli, ofEpochMilli2))};
                                                                    resources4.getClass();
                                                                    resources2 = resources4;
                                                                    String format3 = new MessageFormat(resources2.getString(R.string.local_presenters_hours_ago_short)).format(objArr7);
                                                                    format3.getClass();
                                                                    r5 = format3;
                                                                } else {
                                                                    resources2 = resources4;
                                                                    Object[] objArr8 = {Long.valueOf(ChronoUnit.DAYS.between(ofEpochMilli, ofEpochMilli2))};
                                                                    resources2.getClass();
                                                                    String format4 = new MessageFormat(resources2.getString(R.string.local_presenters_days_ago_short)).format(objArr8);
                                                                    format4.getClass();
                                                                    r5 = format4;
                                                                }
                                                            } else {
                                                                str3 = str13;
                                                                mutableState7 = mutableState23;
                                                                it3 = it;
                                                                obj4 = localCashIncentive;
                                                                resources2 = resources4;
                                                                r5 = continuation4;
                                                            }
                                                            r47 = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, r5}), " · ", null, null, 0, null, null, 62);
                                                        } else {
                                                            str3 = str13;
                                                            mutableState7 = mutableState23;
                                                            it3 = it;
                                                            obj4 = localCashIncentive;
                                                            resources2 = resources4;
                                                            r47 = continuation4;
                                                        }
                                                        it4 = localOrder.order_summary.iterator();
                                                        int i9 = 0;
                                                        while (it4.hasNext()) {
                                                            Integer num2 = ((LocalOrder.OrderSummaryLine) it4.next()).quantity;
                                                            i9 += num2 != null ? num2.intValue() : 0;
                                                        }
                                                        LocalFulfillment localFulfillment2 = localOrder.fulfillment;
                                                        arrayList14.add(new LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder(str3, r44, str, r46, r47, i9, (localFulfillment2 != null || (inStoreDetails = localFulfillment2.in_store_details) == null || (str4 = inStoreDetails.ordering_station_label) == null || StringsKt.isBlank(str4)) ? continuation4 : str4, r50, displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.Standard ? orderStatus2 : continuation4, displayMode));
                                                        localCashIncentive = obj4;
                                                        resources4 = resources2;
                                                        it = it3;
                                                        mutableState23 = mutableState7;
                                                        linkedHashMap6 = linkedHashMap;
                                                    } else {
                                                        r46 = obj3;
                                                        String str132 = localOrder.token;
                                                        str132.getClass();
                                                        LocalOrder.LocalOrderBrand localOrderBrand22 = localOrder.local_order_brand;
                                                        if (localOrderBrand22 != null) {
                                                        }
                                                        if (displayMode == displayMode2) {
                                                        }
                                                        it4 = localOrder.order_summary.iterator();
                                                        int i92 = 0;
                                                        while (it4.hasNext()) {
                                                        }
                                                        LocalFulfillment localFulfillment22 = localOrder.fulfillment;
                                                        arrayList14.add(new LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder(str3, r44, str, r46, r47, i92, (localFulfillment22 != null || (inStoreDetails = localFulfillment22.in_store_details) == null || (str4 = inStoreDetails.ordering_station_label) == null || StringsKt.isBlank(str4)) ? continuation4 : str4, r50, displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.Standard ? orderStatus2 : continuation4, displayMode));
                                                        localCashIncentive = obj4;
                                                        resources4 = resources2;
                                                        it = it3;
                                                        mutableState23 = mutableState7;
                                                        linkedHashMap6 = linkedHashMap;
                                                    }
                                                }
                                                linkedHashMap = linkedHashMap6;
                                                r46 = localText;
                                                String str1322 = localOrder.token;
                                                str1322.getClass();
                                                LocalOrder.LocalOrderBrand localOrderBrand222 = localOrder.local_order_brand;
                                                if (localOrderBrand222 != null) {
                                                }
                                                if (displayMode == displayMode2) {
                                                }
                                                it4 = localOrder.order_summary.iterator();
                                                int i922 = 0;
                                                while (it4.hasNext()) {
                                                }
                                                LocalFulfillment localFulfillment222 = localOrder.fulfillment;
                                                arrayList14.add(new LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder(str3, r44, str, r46, r47, i922, (localFulfillment222 != null || (inStoreDetails = localFulfillment222.in_store_details) == null || (str4 = inStoreDetails.ordering_station_label) == null || StringsKt.isBlank(str4)) ? continuation4 : str4, r50, displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.Standard ? orderStatus2 : continuation4, displayMode));
                                                localCashIncentive = obj4;
                                                resources4 = resources2;
                                                it = it3;
                                                mutableState23 = mutableState7;
                                                linkedHashMap6 = linkedHashMap;
                                            }
                                            linkedHashMap5 = linkedHashMap6;
                                            mutableState6 = mutableState23;
                                            it2 = it;
                                            obj = localCashIncentive;
                                            resources = resources4;
                                            obj2 = new LocalHomeViewModel.TabContent.Widget.ActiveOrders(arrayList14);
                                            arrayList4 = arrayList;
                                        }
                                        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(obj2);
                                    }
                                } else {
                                    featureFlag$EnabledDisabledFeatureFlag$Options = featureFlag$EnabledDisabledFeatureFlag$Options3;
                                    mutableState6 = mutableState23;
                                    it2 = it;
                                    obj = localCashIncentive;
                                    arrayList4 = arrayList;
                                    resources = resources4;
                                    gapComposer2.startReplaceGroup(2007351129);
                                    gapComposer2.end(false);
                                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(obj);
                                }
                                CollectionsKt__MutableCollectionsKt.addAll((Iterable) listOfNotNull, arrayList10);
                                localCashIncentive = obj;
                                arrayList = arrayList4;
                                resources4 = resources;
                                featureFlag$EnabledDisabledFeatureFlag$Options3 = featureFlag$EnabledDisabledFeatureFlag$Options;
                                it = it2;
                                mutableState23 = mutableState6;
                                i8 = 1;
                                tabContentPresenter4 = this;
                            }
                            FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options4 = featureFlag$EnabledDisabledFeatureFlag$Options3;
                            boolean z2 = !((Boolean) collectAsState3.getValue()).booleanValue();
                            RefreshState refreshState = (RefreshState) mutableState19.getValue();
                            LocalHomeViewModel.TabContent tabContent = new LocalHomeViewModel.TabContent(tabToolbarInternalViewModel, arrayList10, z2, refreshState.key <= 0 && !(refreshState.activeOrdersLoaded && refreshState.pastOrdersLoaded && refreshState.addedCardsLoaded && refreshState.marketingMessagesLoaded), featureFlag$EnabledDisabledFeatureFlag$Options4.enabled());
                            gapComposer2.end(false);
                            return tabContent;
                        }
                    }
                    GetNeighborhoodsTabContentResponse.EnrollmentIncentive enrollmentIncentive = tabContentPresenter4.enrollmentIncentive;
                    if (enrollmentIncentive != null) {
                        LocalImage localImage4 = enrollmentIncentive.hero_image;
                        String str14 = enrollmentIncentive.headline;
                        String str15 = enrollmentIncentive.body;
                        String str16 = enrollmentIncentive.accept_cta_button_label;
                        if (str16 != null) {
                            localCashIncentive = new LocalHomeViewModel.TabContent.Widget.LocalCashIncentive(localImage4, str14, str15, str16);
                            ArrayList arrayList102 = new ArrayList();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options42 = featureFlag$EnabledDisabledFeatureFlag$Options3;
                            boolean z22 = !((Boolean) collectAsState3.getValue()).booleanValue();
                            RefreshState refreshState2 = (RefreshState) mutableState19.getValue();
                            LocalHomeViewModel.TabContent tabContent2 = new LocalHomeViewModel.TabContent(tabToolbarInternalViewModel, arrayList102, z22, refreshState2.key <= 0 && !(refreshState2.activeOrdersLoaded && refreshState2.pastOrdersLoaded && refreshState2.addedCardsLoaded && refreshState2.marketingMessagesLoaded), featureFlag$EnabledDisabledFeatureFlag$Options42.enabled());
                            gapComposer2.end(false);
                            return tabContent2;
                        }
                    }
                }
                localCashIncentive = continuation4;
                ArrayList arrayList1022 = new ArrayList();
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options422 = featureFlag$EnabledDisabledFeatureFlag$Options3;
                boolean z222 = !((Boolean) collectAsState3.getValue()).booleanValue();
                RefreshState refreshState22 = (RefreshState) mutableState19.getValue();
                LocalHomeViewModel.TabContent tabContent22 = new LocalHomeViewModel.TabContent(tabToolbarInternalViewModel, arrayList1022, z222, refreshState22.key <= 0 && !(refreshState22.activeOrdersLoaded && refreshState22.pastOrdersLoaded && refreshState22.addedCardsLoaded && refreshState22.marketingMessagesLoaded), featureFlag$EnabledDisabledFeatureFlag$Options422.enabled());
                gapComposer2.end(false);
                return tabContent22;
            }
            Object next2 = it7.next();
            int i10 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw r21;
            }
            GetSuggestedReordersResponse.Reorder reorder = (GetSuggestedReordersResponse.Reorder) next2;
            LocalActionOrdering.PastOrder pastOrder2 = reorder.order;
            if (pastOrder2 == null) {
                mutableState8 = mutableState11;
                it6 = it7;
                mutableState9 = mutableState12;
                pastOrder = r21;
            } else {
                Long l3 = pastOrder2.last_ordered_at;
                if (l3 != null) {
                    Instant ofEpochMilli3 = Instant.ofEpochMilli(l3.longValue());
                    ofEpochMilli3.getClass();
                    ZoneId systemDefault2 = ZoneId.systemDefault();
                    systemDefault2.getClass();
                    DateTimeFormatter dateTimeFormatter2 = DateTimesKt.hourOnlyPatternNoAmPm;
                    ZonedDateTime now = ZonedDateTime.now(systemDefault2);
                    it6 = it7;
                    ChronoUnit chronoUnit = ChronoUnit.DAYS;
                    mutableState9 = mutableState12;
                    mutableState8 = mutableState11;
                    ZonedDateTime plusMinutes = now.truncatedTo(chronoUnit).plusMinutes(1L);
                    ZonedDateTime atZone = ofEpochMilli3.atZone(systemDefault2);
                    if (atZone.isAfter(plusMinutes)) {
                        Object[] objArr9 = {Long.valueOf(ChronoUnit.HOURS.between(atZone, now))};
                        resources3.getClass();
                        str5 = new MessageFormat(resources3.getString(R.string.local_presenters_hours_ago_short)).format(objArr9);
                        str5.getClass();
                    } else {
                        Object[] objArr10 = {Long.valueOf(chronoUnit.between(atZone.toLocalDate(), now.toLocalDate()))};
                        resources3.getClass();
                        str5 = new MessageFormat(resources3.getString(R.string.local_presenters_days_ago_short)).format(objArr10);
                        str5.getClass();
                    }
                } else {
                    mutableState8 = mutableState11;
                    it6 = it7;
                    mutableState9 = mutableState12;
                    str5 = r21;
                }
                LocalFulfillment localFulfillment3 = reorder.fulfillment;
                if (localFulfillment3 != null) {
                    Fulfillment fulfillment2 = FulfillmentKt.toFulfillment(localFulfillment3);
                    LocalFulfillmentType localFulfillmentType = fulfillment2.f911type;
                    LocalText estimatedTime = DateTimesKt.estimatedTime(fulfillment2, androidStringManager, ZoneId.systemDefault());
                    if (estimatedTime != null) {
                        if (!DateTimesKt.hasFriendlyEstimatedTimeText(fulfillment2)) {
                            switch (TabContentPresenterKt.WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    Path$$ExternalSyntheticBUOutline0.m$1(localFulfillmentType, "Unsupported type ");
                                    return null;
                                case 5:
                                    String str17 = estimatedTime.text;
                                    if (str17 != null) {
                                        if (StringsKt.isBlank(str17)) {
                                            str17 = r21;
                                        }
                                        if (str17 != null) {
                                            resources3.getClass();
                                            String format5 = new MessageFormat(resources3.getString(R.string.local_presenters_delivery_in)).format(new Object[]{str17});
                                            format5.getClass();
                                            localText3 = LocalTextsKt.toLocalText(format5);
                                            estimatedTime = localText3;
                                            break;
                                        }
                                    }
                                    break;
                                case 6:
                                    String str18 = estimatedTime.text;
                                    if (str18 != null) {
                                        if (StringsKt.isBlank(str18)) {
                                            str18 = r21;
                                        }
                                        if (str18 != null) {
                                            resources3.getClass();
                                            String format6 = new MessageFormat(resources3.getString(R.string.local_presenters_pickup_in)).format(new Object[]{str18});
                                            format6.getClass();
                                            localText3 = LocalTextsKt.toLocalText(format6);
                                            estimatedTime = localText3;
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        }
                        localText2 = estimatedTime;
                    }
                    estimatedTime = r21;
                    localText2 = estimatedTime;
                } else {
                    localText2 = r21;
                }
                String str19 = pastOrder2.order_token;
                if (str19 == null) {
                    str19 = String.valueOf(i6);
                }
                String str20 = str19;
                str20.getClass();
                String str21 = reorder.brand_cashtag;
                str21.getClass();
                String str22 = str5 == null ? "" : str5;
                String str23 = reorder.summary;
                String str24 = str23 == null ? "" : str23;
                Iterator it14 = pastOrder2.cart_line_selections.iterator();
                int i11 = 0;
                while (it14.hasNext()) {
                    Integer num3 = ((LocalCart.Line.Selection) it14.next()).quantity;
                    i11 += num3 != null ? num3.intValue() : 0;
                }
                LocalImage localImage5 = reorder.item_image;
                String str25 = reorder.button_title;
                if (str25 == null) {
                    str25 = androidStringManager.get(R.string.local_presenters_reorder);
                }
                pastOrder = new LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder(str20, str21, str22, str24, i11, localImage5, localText2, str25);
            }
            arrayList5.add(pastOrder);
            continuation3 = r21;
            i5 = i10;
            it7 = it6;
            mutableState12 = mutableState9;
            mutableState11 = mutableState8;
        }
    }
}
