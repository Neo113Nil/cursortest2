package app.cash.badging.backend;

import android.content.Context;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import app.cash.badging.api.Badger2;
import app.cash.broadway.presenter.molecule.RenavigationDispatcher;
import app.cash.broadway.presenter.molecule.SwipeCallbackDispatcher;
import app.cash.broadway.ui.compose.FullScreenAggregator;
import app.cash.broadway.ui.compose.FullScreenNode;
import app.cash.broadway.ui.compose.OrientationAggregator;
import app.cash.broadway.ui.compose.OrientationNode;
import app.cash.broadway.ui.compose.SecureScreenAggregator;
import app.cash.broadway.ui.compose.SecureScreenNode;
import app.cash.local.backend.CartBuilderKey;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.LocalAddBrandsViewEvent;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Toggled;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderState;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.map.LocalMapPinKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.size.DimensionKt;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.mikepenz.markdown.compose.elements.MarkdownCheckBoxKt$MarkdownCheckBox$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda6;
import com.squareup.cash.badging.db.BadgeQueries$ClearQuery;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class RealBadger2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RealBadger2$$ExternalSyntheticLambda0(RealBadger2 realBadger2, Badger2.BadgingInfo badgingInfo) {
        this.$r8$classId = 1;
        this.f$1 = realBadger2;
        this.f$0 = badgingInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v20 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 13;
        int i4 = 29;
        int i5 = 11;
        int i6 = 5;
        int i7 = 2;
        byte b = 0;
        int i8 = 3;
        int i9 = 1;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                RealBadger2 realBadger2 = (RealBadger2) obj2;
                ((TransactionWrapper) obj).getClass();
                for (Map.Entry entry : ((BadgeCounts) obj3).group_counts.entrySet()) {
                    String str = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    LocalTabContentQueries localTabContentQueries = realBadger2.badgeCountQueries;
                    localTabContentQueries.getClass();
                    str.getClass();
                    localTabContentQueries.driver.execute(-782352465, "INSERT OR REPLACE INTO badgeCount\nVALUES (?, ?)", new PoolGoalMetKt$$ExternalSyntheticLambda6(str, localTabContentQueries, intValue, 7));
                    localTabContentQueries.notifyQueries(-782352465, new AvatarsKt$$ExternalSyntheticLambda2(i8));
                }
                break;
            case 1:
                Badger2.BadgingInfo badgingInfo = (Badger2.BadgingInfo) obj3;
                ((TransactionWrapper) obj).getClass();
                LocalTabContentQueries localTabContentQueries2 = ((RealBadger2) obj2).badgeGroupQueries;
                String str2 = badgingInfo.externalToken;
                ItemType itemType = badgingInfo.itemType;
                localTabContentQueries2.getClass();
                str2.getClass();
                localTabContentQueries2.driver.execute(546413585, "DELETE FROM badgeGroup\nWHERE external_token = ? AND item_type = ?", new UtilsKt$$ExternalSyntheticLambda0(26, str2, localTabContentQueries2, itemType));
                localTabContentQueries2.notifyQueries(546413585, new AvatarsKt$$ExternalSyntheticLambda2(4));
                for (String str3 : badgingInfo.countGroups) {
                    localTabContentQueries2.getClass();
                    str2.getClass();
                    str3.getClass();
                    localTabContentQueries2.driver.execute(698079519, "INSERT INTO badgeGroup\nVALUES (?, ?, ?)", new n3$$ExternalSyntheticLambda0(str2, localTabContentQueries2, itemType, str3, 22));
                    localTabContentQueries2.notifyQueries(698079519, new AvatarsKt$$ExternalSyntheticLambda2(i6));
                }
                break;
            case 2:
                RealBadger2 realBadger22 = (RealBadger2) obj2;
                for (Badger2.Badge badge : (Badger2.Badge[]) obj3) {
                    LocalTabContentQueries localTabContentQueries3 = realBadger22.badgeQueries;
                    String str4 = badge.externalToken;
                    ItemType itemType2 = badge.f907type;
                    long j = badge.externalVersion;
                    Instant now = DimensionKt.now(realBadger22.clock);
                    Long valueOf = Long.valueOf(j);
                    localTabContentQueries3.getClass();
                    str4.getClass();
                    if (((Number) new BadgeQueries$ClearQuery(localTabContentQueries3, now, valueOf, str4, itemType2, new AvatarsKt$$ExternalSyntheticLambda2(8)).executeAsOne()).longValue() == 0) {
                        Timber.Forest.w("Tried to clear badge for untracked item: " + badge + ". Was badging info updated?", new Object[0]);
                    }
                }
                break;
            case 3:
                RealBadger2 realBadger23 = (RealBadger2) obj2;
                LocalTabContentQueries localTabContentQueries4 = realBadger23.badgeGroupQueries;
                for (Badger2.BadgingInfo badgingInfo2 : (List) obj3) {
                    LocalTabContentQueries localTabContentQueries5 = realBadger23.badgeQueries;
                    String str5 = badgingInfo2.externalToken;
                    boolean z = badgingInfo2.isBadged;
                    ItemType itemType3 = badgingInfo2.itemType;
                    localTabContentQueries5.getClass();
                    SqlDriver sqlDriver = localTabContentQueries5.driver;
                    str5.getClass();
                    Long l = (Long) new BadgeQueries$VersionQuery(localTabContentQueries5, str5, itemType3, new AvatarsKt$$ExternalSyntheticLambda2(i2)).executeAsOneOrNull();
                    if (l == null && z) {
                        sqlDriver.execute(1020060846, "INSERT INTO badge\nVALUES (?, ?, ?, NULL, NULL, NULL)", new BadgeQueries$$ExternalSyntheticLambda6(str5, localTabContentQueries5, itemType3, badgingInfo2.externalVersion, 1));
                        localTabContentQueries5.notifyQueries(1020060846, new AvatarsKt$$ExternalSyntheticLambda2(7));
                        localTabContentQueries4.transactionWithWrapper(new RealBadger2$$ExternalSyntheticLambda0(realBadger23, badgingInfo2));
                    } else if (l != null) {
                        long longValue = l.longValue();
                        long j2 = badgingInfo2.externalVersion;
                        if (longValue < j2) {
                            if (z) {
                                sqlDriver.execute(1365007038, "UPDATE badge\nSET badge_version = ?,\n  cleared_version = NULL,\n  cleared_at = NULL,\n  clear_succeeded_at = NULL\nWHERE external_token = ?\nAND item_type = ?", new BadgeQueries$$ExternalSyntheticLambda6(j2, str5, localTabContentQueries5, itemType3));
                                localTabContentQueries5.notifyQueries(1365007038, new AvatarsKt$$ExternalSyntheticLambda2(i3));
                                localTabContentQueries4.transactionWithWrapper(new RealBadger2$$ExternalSyntheticLambda0(realBadger23, badgingInfo2));
                            } else {
                                sqlDriver.execute(868394912, "DELETE FROM badge\nWHERE external_token = ?\nAND item_type = ?\nAND badge_version <= ?", new BadgeQueries$$ExternalSyntheticLambda6(str5, localTabContentQueries5, itemType3, j2, 0));
                                localTabContentQueries5.notifyQueries(868394912, new AvatarsKt$$ExternalSyntheticLambda2(12));
                            }
                        }
                    }
                }
                break;
            case 4:
                RenavigationDispatcher renavigationDispatcher = (RenavigationDispatcher) obj3;
                Function0 function0 = (Function0) obj2;
                ((DisposableEffectScope) obj).getClass();
                renavigationDispatcher.getClass();
                function0.getClass();
                if (renavigationDispatcher.handler == null) {
                    renavigationDispatcher.handler = function0;
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("A RenavigationHandler has already been registered in ", renavigationDispatcher.name, "."));
                    break;
                }
            case 5:
                SwipeCallbackDispatcher swipeCallbackDispatcher = (SwipeCallbackDispatcher) obj3;
                Function1 function1 = (Function1) obj2;
                ((DisposableEffectScope) obj).getClass();
                function1.getClass();
                if (swipeCallbackDispatcher.handle == null) {
                    swipeCallbackDispatcher.handle = function1;
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("A SwipeHandler has already been registered in ", swipeCallbackDispatcher.name, "."));
                    break;
                }
            case 6:
                FullScreenAggregator fullScreenAggregator = (FullScreenAggregator) obj3;
                FullScreenNode fullScreenNode = (FullScreenNode) obj2;
                ((DisposableEffectScope) obj).getClass();
                fullScreenAggregator.getClass();
                fullScreenNode.getClass();
                fullScreenAggregator.nodes.add(fullScreenNode);
                Function0 function02 = fullScreenAggregator.enabledChangedCallback;
                fullScreenNode.enabledChangedCallback = function02;
                if (function02 != null) {
                    function02.invoke();
                }
                break;
            case 7:
                OrientationAggregator orientationAggregator = (OrientationAggregator) obj3;
                OrientationNode orientationNode = (OrientationNode) obj2;
                ((DisposableEffectScope) obj).getClass();
                orientationAggregator.getClass();
                orientationNode.getClass();
                orientationAggregator.nodes.add(orientationNode);
                Function0 function03 = orientationAggregator.orientationChangedCallback;
                orientationNode.orientationChangedCallback = function03;
                if (function03 != null) {
                    function03.invoke();
                }
                break;
            case 8:
                SecureScreenAggregator secureScreenAggregator = (SecureScreenAggregator) obj3;
                SecureScreenNode secureScreenNode = (SecureScreenNode) obj2;
                ((DisposableEffectScope) obj).getClass();
                secureScreenAggregator.getClass();
                secureScreenNode.getClass();
                secureScreenAggregator.nodes.add(secureScreenNode);
                Function0 function04 = secureScreenAggregator.enabledChangedCallback;
                secureScreenNode.enabledChangedCallback = function04;
                if (function04 != null) {
                    function04.invoke();
                }
                break;
            case 9:
                RealCartBuilderManager realCartBuilderManager = (RealCartBuilderManager) obj3;
                ((CartBuilderKey) obj).getClass();
                break;
            case 10:
                GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj3;
                LocalTabContentQueries localTabContentQueries6 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBytes(0, getBrandCollectionResponse != null ? (byte[]) ((Local_tab_content.Adapter) localTabContentQueries6.local_tab_contentAdapter).responseAdapter.encode(getBrandCollectionResponse) : 0);
                break;
            case 11:
                GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) obj3;
                LocalTabContentQueries localTabContentQueries7 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, getNeighborhoodsTabContentResponse != null ? (byte[]) ((Local_tab_content.Adapter) localTabContentQueries7.local_tab_contentAdapter).responseAdapter.encode(getNeighborhoodsTabContentResponse) : null);
                break;
            case 12:
                ComboSlot comboSlot = (ComboSlot) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                int i10 = comboSlot.numberOfSelections;
                ArrayList arrayList = new ArrayList(i10);
                while (b < i10) {
                    arrayList.add(new Pair(new LocalMenuComboDetailsViewModel.SectionIndex(b), linkedHashMap.get(new ComboSlotToken(comboSlot.token))));
                    b++;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int i11 = ((LocalMenuComboDetailsViewModel.SectionIndex) pair.first).value;
                    CartEntry.ComboSlotSelection comboSlotSelection = (CartEntry.ComboSlotSelection) pair.second;
                    Pair pair2 = comboSlotSelection != null ? new Pair(new LocalMenuComboDetailsViewModel.SectionIndex(i11), comboSlotSelection) : null;
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                break;
            case 13:
                LocalBrandProfileViewEvent localBrandProfileViewEvent = (LocalBrandProfileViewEvent) obj;
                localBrandProfileViewEvent.getClass();
                JobKt.launch$default((CoroutineScope) obj3, null, null, new EventBridge$sendEvent$1((MutableSharedFlow) obj2, localBrandProfileViewEvent, r12, 4), 3);
                break;
            case 14:
                FocusRequester focusRequester = (FocusRequester) obj3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((MutableState) obj2).setValue(bool);
                if (booleanValue) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                } else {
                    focusRequester.freeFocus();
                }
                break;
            case 15:
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj3;
                Function1 function12 = (Function1) obj2;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                List list = localBrandLocationMenuViewModel.menuCategories;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) list.get(i12);
                    lazyGridIntervalContent.item(new MenuCategoryToken(menuCategory.token), new LocationMenu$$ExternalSyntheticLambda6(8), "content_type_category", new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(18, menuCategory, localBrandLocationMenuViewModel), true, -466498216));
                    LocalBrandLocationMenuViewModel.MenuCategory.Style style = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
                    List list2 = menuCategory.items;
                    lazyGridIntervalContent.items(list2.size(), new Latch$await$2$2(7, new CachedPageEventFlow$$ExternalSyntheticLambda0(menuCategory, 23), list2), null, new Latch$await$2$2(8, new LocationMenu$$ExternalSyntheticLambda6(9), list2), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list2, menuCategory, function12, i9), true, -1117249557));
                }
                break;
            case 16:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                ((SnapshotStateMap) obj3).put(new MenuItemModifierListToken(((LocalMenuItemDetailsViewModel.ItemModifier) obj2).mo1295getTokenQpp493U()), new Offset(ValueInsets.positionInParent(layoutCoordinates)));
                break;
            case 17:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                ArrayList arrayList3 = ((LocalBrandLocationMenuCarouselContentModel) obj3).entries;
                lazyListScope.items(arrayList3.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(1, arrayList3), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList3, (Function1) obj2, i9), true, 2039820996));
                break;
            case 18:
                Function1 function13 = (Function1) obj3;
                LocalBrandLocationCartViewModel.Selection selection = (LocalBrandLocationCartViewModel.Selection) obj2;
                CartItemCounterViewEvent cartItemCounterViewEvent = (CartItemCounterViewEvent) obj;
                cartItemCounterViewEvent.getClass();
                if (cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Increment) {
                    function13.invoke(new LocalBrandLocationCartViewEvent.ItemIncrement(selection.index));
                } else if (!(cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Trash) && !(cartItemCounterViewEvent instanceof CartItemCounterViewEvent.Decrement)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    function13.invoke(new LocalBrandLocationCartViewEvent.ItemDecrement(selection.index));
                }
                break;
            case 19:
                LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = (LocalBrandLocationOpenTabViewModel) obj3;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                int i13 = 17;
                LazyListScope.item$default(lazyListScope2, null, "open_tab_summary_header", new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(localBrandLocationOpenTabViewModel, i13), true, 1730223410), 1);
                List list3 = localBrandLocationOpenTabViewModel.errors;
                lazyListScope2.items(list3.size(), null, new Latch$await$2$2(i5, new LocationMenu$$ExternalSyntheticLambda6(i13), list3), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(i8, (Function1) obj2, list3), true, 802480018));
                List list4 = localBrandLocationOpenTabViewModel.rounds;
                lazyListScope2.items(list4.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list4, 2), new ComposableLambdaImpl(new MarkdownCheckBoxKt$MarkdownCheckBox$1(i9, list4, localBrandLocationOpenTabViewModel), true, 2039820996));
                String str6 = localBrandLocationOpenTabViewModel.subtotalAmount;
                if (str6 != null) {
                    LazyListScope.item$default(lazyListScope2, null, "open_tab_subtotal", new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda1(str6, i8), true, -669815214), 1);
                }
                break;
            case 20:
                ((Function1) obj3).invoke(new LocalAddBrandsViewEvent.BrandToggled(((LocalAddBrandsViewModel.BrandCard) obj2).brandToken, ((Boolean) obj).booleanValue()));
                break;
            case 21:
                Function1 function14 = (Function1) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                List list5 = ((LocalCashAllActivityViewModel) obj3).sections;
                int size2 = list5.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    LocalCashAllActivityViewModel.Section section = (LocalCashAllActivityViewModel.Section) list5.get(i14);
                    LazyListScope.item$default(lazyListScope3, null, null, LocalAddBrandsViewKt.f45lambda$293385129, 3);
                    String str7 = section.header;
                    if (str7 != null) {
                        LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda1(str7, 4), true, 1397814647), 3);
                    }
                    List list6 = section.rows;
                    lazyListScope3.items(list6.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list6, 3), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(4, function14, list6), true, 802480018));
                }
                break;
            case 22:
                LocalEditorialContent.BrandCarousel brandCarousel = (LocalEditorialContent.BrandCarousel) obj3;
                Function1 function15 = (Function1) obj2;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                ArrayList arrayList4 = brandCarousel.carouselImages;
                int size3 = arrayList4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    LazyListScope.item$default(lazyListScope4, Boxes$$ExternalSyntheticOutline1.m(i15, brandCarousel.brandSpot.brandToken, "-"), null, new ComposableLambdaImpl(new RecoveryGuideViewKt$$ExternalSyntheticLambda5((LocalEditorialContent.BrandCarousel.CarouselImage) arrayList4.get(i15), brandCarousel, function15, i15, 1), true, -507302790), 2);
                }
                break;
            case 23:
                Function1 function16 = (Function1) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                List list7 = ((LocalEditorialViewModel) obj3).contents;
                int size4 = list7.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    LocalEditorialContent localEditorialContent = (LocalEditorialContent) list7.get(i16);
                    if (localEditorialContent instanceof LocalEditorialContent.Image) {
                        LazyListScope.item$default(lazyListScope5, null, Reflection.factory.getOrCreateKotlinClass(localEditorialContent.getClass()), new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3((LocalEditorialContent.Image) localEditorialContent, 20), true, 1218245873), 1);
                    } else if (localEditorialContent instanceof LocalEditorialContent.BrandCarousel) {
                        LazyListScope.item$default(lazyListScope5, null, Reflection.factory.getOrCreateKotlinClass(localEditorialContent.getClass()), new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(i4, (LocalEditorialContent.BrandCarousel) localEditorialContent, function16), true, -1264139864), 1);
                    } else if (localEditorialContent instanceof LocalEditorialContent.Spacer) {
                        LazyListScope.item$default(lazyListScope5, null, Reflection.factory.getOrCreateKotlinClass(localEditorialContent.getClass()), new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3((LocalEditorialContent.Spacer) localEditorialContent, 21), true, -1213454871), 1);
                    } else if (!(localEditorialContent instanceof LocalEditorialContent.Text)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        LazyListScope.item$default(lazyListScope5, null, Reflection.factory.getOrCreateKotlinClass(localEditorialContent.getClass()), new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(i9, localEditorialContent, (Object) function16), true, -1162769878), 1);
                    }
                }
                break;
            case 24:
                FulfillmentPickerViewModel.Pickup pickup = (FulfillmentPickerViewModel.Pickup) obj3;
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                ArrayList arrayList5 = pickup.locations;
                lazyListScope6.items(arrayList5.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(2, arrayList5), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList5, pickup, (MutableState) obj2, i7), true, 2039820996));
                break;
            case 25:
                SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays = (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) obj3;
                Function1 function17 = (Function1) obj2;
                LazyListScope lazyListScope7 = (LazyListScope) obj;
                lazyListScope7.getClass();
                LazyListScope.item$default(lazyListScope7, "scheduling_time_picker_header_text", null, FulfillmentRadioCellKt.lambda$530328720, 2);
                LazyListScope.item$default(lazyListScope7, "scheduling_time_picker_day_options", null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(i8, (Object) loadedDays, (Object) function17), true, -2038065913), 2);
                SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState timesState = loadedDays.timesState;
                if (timesState.equals(SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadingTimes.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope7, null, "scheduling_time_picker_loading_spinner", FulfillmentRadioCellKt.lambda$27469448, 1);
                } else if (timesState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes) {
                    List list8 = loadedDays.selectedDay.day_times;
                    SchedulingTime selectedTime = zzuh.getSelectedTime(loadedDays);
                    String str8 = selectedTime != null ? selectedTime.scheduling_day_time_token : null;
                    if (list8.isEmpty()) {
                        LazyListScope.item$default(lazyListScope7, null, "scheduling_time_picker_empty_state_banner", new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(loadedDays, 22), true, 376812300), 1);
                    } else {
                        lazyListScope7.items(list8.size(), new Latch$await$2$2(i3, new Savers_androidKt$$ExternalSyntheticLambda0(b, i4), list8), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list8, 5), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(list8, str8, function17, list8, 1), true, 2039820996));
                    }
                } else if (!timesState.equals(SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.FailedToLoadTimes.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    LazyListScope.item$default(lazyListScope7, null, null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda6(7, function17), true, 996316304), 3);
                }
                break;
            case 26:
                TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = (TableQrCodeCameraViewFinderManager) obj2;
                ((Context) obj).getClass();
                PreviewView previewView = new PreviewView((Context) obj3);
                Threads.checkMainThread();
                PreviewView.AnonymousClass1 anonymousClass1 = previewView.mSurfaceProvider;
                anonymousClass1.getClass();
                tableQrCodeCameraViewFinderManager.getClass();
                tableQrCodeCameraViewFinderManager.preview.setSurfaceProvider(anonymousClass1);
                break;
            case 27:
                TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager2 = (TableQrCodeCameraViewFinderManager) obj3;
                ((DisposableEffectScope) obj).getClass();
                ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                Context context = tableQrCodeCameraViewFinderManager2.context;
                ChainingListenableFuture switchViewKt = SwitchViewKt.getInstance(context);
                switchViewKt.addListener(new AFd1wSDK$$ExternalSyntheticLambda2(i4, switchViewKt, tableQrCodeCameraViewFinderManager2, (TableQrCodeCameraViewFinderState) obj2), context.getMainExecutor());
                tableQrCodeCameraViewFinderManager2.orientationEventListener.this$0 = new NetworkFetcher$fetch$2(1, tableQrCodeCameraViewFinderManager2.imageAnalysis, ImageAnalysis.class, "setTargetRotation", "setTargetRotation(I)V", 0, 10);
                tableQrCodeCameraViewFinderManager2.cameraLifecycleOwner.lifecycle.setCurrentState(Lifecycle.State.RESUMED);
                break;
            case 28:
                ((Function1) obj3).invoke(new LocalBrandBannerEvent$Toggled(((LocalBrandBannerModel) obj2).f917type, ((Boolean) obj).booleanValue()));
                break;
            default:
                LazyListScope lazyListScope8 = (LazyListScope) obj;
                lazyListScope8.getClass();
                List list9 = ((BrandCollectionModel) obj3).locations;
                lazyListScope8.items(list9.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list9, 6), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(i6, (Function1) obj2, list9), true, 802480018));
                for (int size5 = list9.size(); size5 < 11; size5++) {
                    LazyListScope.item$default(lazyListScope8, null, null, LocalMapPinKt.lambda$1441591038, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealBadger2$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
