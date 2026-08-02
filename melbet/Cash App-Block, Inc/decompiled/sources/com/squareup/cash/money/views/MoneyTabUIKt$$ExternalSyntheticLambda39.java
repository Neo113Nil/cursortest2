package com.squareup.cash.money.views;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelUuid;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.core.math.MathUtils;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.navigation.compose.NavHostKt$NavHost$32;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda18;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import coil3.Extras;
import coil3.RealImageLoader;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.FilterBarChipType;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.treehouse.RadioBinding$value$1;
import com.squareup.cash.beacondetection.real.BeaconScanner$startScanning$callback$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSetAllocationAmountWithKeypad;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.genericelements.components.GenericTreeElementsView;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.presenters.MoneybotChatContentFactory;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Empty;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Error;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loading;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import com.squareup.cash.moneybot.views.home.MoneybotHomeScaffoldContentScope;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.components.ShadowConfig;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.nearby.backend.RealNearbyAdvertiser;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.backend.RealNearbyManager$$ExternalSyntheticLambda3;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.collection.OffersCollectionListingKt;
import com.squareup.cash.offers.views.listing.LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1;
import com.squareup.cash.offers.views.listing.LazyScopeExtensionsKt$itemsWithImpressions$1;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.p2pblocking.views.AllowlistSelectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.PaychecksActivityItemPresenter;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.ItemCoordinates;
import com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.common.Money;
import com.squareup.util.android.Views$waitForMeasure$attachListener$1$listener$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda39 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda39(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Uri uri;
        int i = this.$r8$classId;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        int i2 = 14;
        int i3 = 7;
        int i4 = 6;
        int i5 = 15;
        int i6 = 4;
        int i7 = 3;
        final int i8 = 0;
        final int i9 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj3;
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda40(toolbarNestedScrollExpander, i9), true, 1227429745), 3);
                List list = ((MoneyTabModel.Loaded) obj4).sectionViewModels;
                list.getClass();
                cardNestedScrollExpander.getClass();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ViewModel viewModel = (ViewModel) list.get(i10);
                    if (viewModel instanceof ViewModel.HeaderModel) {
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new HypeWelcomeUIKt$$ExternalSyntheticLambda5((ViewModel.HeaderModel) viewModel, 19), true, 1962203728), 3);
                    } else {
                        if (!(viewModel instanceof ViewModel.ItemList)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ViewModel.ItemList itemList = (ViewModel.ItemList) viewModel;
                        List list2 = itemList.items;
                        Section.Layout layout = itemList.layout;
                        if (layout instanceof Section.Layout.VerticalStack) {
                            Section.Layout.VerticalStack verticalStack = (Section.Layout.VerticalStack) layout;
                            Dp dp = verticalStack.overrideHorizontalMargin;
                            Dp dp2 = verticalStack.interItemSpacing;
                            int i11 = 0;
                            for (Object obj5 : list2) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                Dp dp3 = dp2;
                                Dp dp4 = dp;
                                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new EducationalSheetKt$$ExternalSyntheticLambda18(dp4, (Item) obj5, dp3, i11, list2, 2), true, -2003934147), 3);
                                dp = dp4;
                                dp2 = dp3;
                                i11 = i12;
                            }
                        } else if (layout instanceof Section.Layout.GroupedVerticalStack) {
                            LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new EducationalSheetKt$$ExternalSyntheticLambda8(((Section.Layout.GroupedVerticalStack) layout).hasCard, cardNestedScrollExpander, list2, i4), true, -784739348), 3);
                        } else {
                            if (!(layout instanceof Section.Layout.CardStack)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            LazyListScope.stickyHeader$default(lazyListScope, null, new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(13, toolbarNestedScrollExpander, cardNestedScrollExpander, list2), true, 53579142), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                GenericTreeElementsView genericTreeElementsView = new GenericTreeElementsView(context, (RealImageLoader) obj4, (ComposableLambdaImpl) obj3);
                genericTreeElementsView.setOnEventListener(new UtilsKt$$ExternalSyntheticLambda0(9, (Function1) obj2));
                return genericTreeElementsView;
            case 2:
                Exception exc = (Exception) obj;
                exc.getClass();
                ((Exception[]) obj4)[0] = exc;
                ((MoneybotChatContentFactory) obj3).errorReporter.report(new GeneralMoneybotError("Failed to build Moneybot plugin card render type: " + ((ClientRenderable.PluginComponent) obj2).renderType, exc), defaultSamplingStrategy);
                return Unit.INSTANCE;
            case 3:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                String str = ((Widget) obj3).widgetId;
                ClientRenderType clientRenderType = ((ClientRenderable.PluginComponent) ((ClientRenderable) obj2)).renderType;
                ((MoneybotHomePresenter) obj4).errorReporter.report(new GeneralMoneybotError("Failed to build Moneybot Home widget " + str + " render type: " + clientRenderType, exc2), defaultSamplingStrategy);
                return Unit.INSTANCE;
            case 4:
                Function1 function1 = (Function1) obj4;
                Context context2 = (Context) obj3;
                MutableState mutableState = (MutableState) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Uri uri2 = (Uri) mutableState.getValue();
                    if (uri2 == null) {
                        return Unit.INSTANCE;
                    }
                    String uri3 = uri2.toString();
                    uri3.getClass();
                    String type2 = context2.getContentResolver().getType(uri2);
                    if (type2 == null) {
                        type2 = "image/jpeg";
                    }
                    function1.invoke(new MoneybotChatViewEvent.AttachData(CollectionsKt__CollectionsJVMKt.listOf(new MoneybotChatViewEvent.AttachData.Attachment(uri3, type2))));
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) obj2;
                if (((Boolean) obj).booleanValue() && ((Boolean) mutableState2.getValue()).booleanValue() && (uri = (Uri) mutableState3.getValue()) != null) {
                    managedActivityResultLauncher.launch(uri);
                }
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) obj4;
                Function1 function12 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list3 = chat.messages;
                lazyListScope2.items(list3.size(), new VerifyCheckDepositPresenter$models$3$2(i2, new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(19), list3), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list3, 29), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(list3, chat, (Map) obj3, function12, 4), true, 2039820996));
                LazyListScope.item$default(lazyListScope2, "thinking_indicator", null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda11(i7, (Object) chat, (Object) function12), true, -1377064899), 2);
                return Unit.INSTANCE;
            case 7:
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                ((Function1) obj4).invoke(new MoneybotHomeScaffoldContentScope(lazyListScope3, ((BoxWithConstraintsScopeImpl) obj3).m258getMaxHeightD9Ej5fM(), (PaddingValuesImpl) obj2));
                return Unit.INSTANCE;
            case 8:
                MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel = (MoneybotOverflowMenuViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Function1 function14 = (Function1) obj2;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                List list4 = moneybotOverflowMenuViewModel.menuItems;
                boolean z = moneybotOverflowMenuViewModel.showDebugMenuEntrypoint;
                if (!list4.isEmpty() || z) {
                    LazyListScope.item$default(lazyListScope4, null, null, ExpandableContentKt.lambda$180143265, 3);
                }
                List list5 = moneybotOverflowMenuViewModel.menuItems;
                lazyListScope4.items(list5.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list5, 2), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(i5, function14, list5), true, 802480018));
                if (z) {
                    LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new MusicViewKt$$ExternalSyntheticLambda7(i5, function14), true, 1322179914), 3);
                }
                LazyListScope.item$default(lazyListScope4, null, null, ExpandableContentKt.f497lambda$2051556004, 3);
                function13.invoke(lazyListScope4);
                return Unit.INSTANCE;
            case 9:
                ViewfinderKt viewfinderKt = (ViewfinderKt) obj4;
                Function1 function15 = (Function1) obj3;
                Function1 function16 = (Function1) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                LazyListScope.item$default(lazyListScope5, null, null, ExpandableContentKt.f494lambda$1141934776, 3);
                if (Intrinsics.areEqual(viewfinderKt, RecentChatHistoryViewModel$Empty.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope5, null, null, ExpandableContentKt.lambda$860245072, 3);
                } else if (Intrinsics.areEqual(viewfinderKt, RecentChatHistoryViewModel$Error.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new MusicViewKt$$ExternalSyntheticLambda7(16, function16), true, 856177415), 3);
                } else if (Intrinsics.areEqual(viewfinderKt, RecentChatHistoryViewModel$Loading.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope5, null, null, ExpandableContentKt.lambda$495717704, 3);
                } else {
                    if (!(viewfinderKt instanceof RecentChatHistoryViewModel$Loaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (function15 != null) {
                        function15.invoke(lazyListScope5);
                    }
                }
                return Unit.INSTANCE;
            case 10:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Function1 function17 = (Function1) obj2;
                TemplateCardViewEvent templateCardViewEvent = (TemplateCardViewEvent) obj;
                templateCardViewEvent.getClass();
                ((FocusOwnerImpl) obj4).clearFocus(false);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function17.invoke(templateCardViewEvent);
                return Unit.INSTANCE;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((Function1) obj2).invoke(new TemplateCardViewEvent.TokenTapped(str2));
                return Unit.INSTANCE;
            case 12:
                ColorKt colorKt = (ColorKt) obj3;
                AndroidPaint androidPaint = (AndroidPaint) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(((ShadowConfig) obj4).yOffset);
                ((Extras.Key) drawScope.getDrawContext().path).translate(RecyclerView.DECELERATION_RATE, mo236toPx0680j_4);
                try {
                    ColorKt.drawOutline(drawScope.getDrawContext().getCanvas(), colorKt, androidPaint);
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-0.0f, -mo236toPx0680j_4);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-0.0f, -mo236toPx0680j_4);
                    throw th;
                }
            case 13:
                RealNearbyManager realNearbyManager = (RealNearbyManager) obj4;
                NearbyIdentifier nearbyIdentifier = (NearbyIdentifier) obj3;
                ((DisposableEffectScope) obj).getClass();
                RealNearbyAdvertiser realNearbyAdvertiser = realNearbyManager.nearbyAdvertiser;
                RealNearbyManager$$ExternalSyntheticLambda3 realNearbyManager$$ExternalSyntheticLambda3 = new RealNearbyManager$$ExternalSyntheticLambda3((SnapshotStateMap) obj2);
                nearbyIdentifier.getClass();
                realNearbyAdvertiser.listeners.put(nearbyIdentifier, realNearbyManager$$ExternalSyntheticLambda3);
                if (!realNearbyAdvertiser.isScanning) {
                    Timber.Forest forest = Timber.Forest;
                    forest.i("NEARBY - starting scan for service id: 0000FC44-0000-1000-8000-00805F9B34FB", new Object[0]);
                    RealBleManager realBleManager = realNearbyAdvertiser.bleManager;
                    Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = new Overlay$$ExternalSyntheticLambda0(realNearbyAdvertiser, i5);
                    BluetoothLeScanner bluetoothLeScanner = realBleManager.btScanner;
                    if (bluetoothLeScanner == null) {
                        forest.e("NEARBY - BLE scanner is null", new Object[0]);
                    } else {
                        BeaconScanner$startScanning$callback$1 beaconScanner$startScanning$callback$1 = new BeaconScanner$startScanning$callback$1(overlay$$ExternalSyntheticLambda0, i9);
                        realBleManager.scanCallbacks.put("0000FC44-0000-1000-8000-00805F9B34FB", beaconScanner$startScanning$callback$1);
                        ScanFilter build = new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString("0000FC44-0000-1000-8000-00805F9B34FB")).build();
                        ScanSettings build2 = new ScanSettings.Builder().setLegacy(true).setScanMode(2).setPhy(255).setCallbackType(1).setMatchMode(1).setNumOfMatches(3).setReportDelay(0L).build();
                        forest.i("NEARBY - BLE scan started for service ID: 0000FC44-0000-1000-8000-00805F9B34FB", new Object[0]);
                        bluetoothLeScanner.startScan(CollectionsKt__CollectionsJVMKt.listOf(build), build2, beaconScanner$startScanning$callback$1);
                    }
                    realNearbyAdvertiser.isScanning = true;
                }
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i3, realNearbyManager, nearbyIdentifier);
            case 14:
                final Function1 function18 = (Function1) obj3;
                final Function0 function0 = (Function0) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                final int i13 = 0;
                for (Object obj6 : ((OffersSearchViewModel) obj4).filterGroupSectionViewModel.filterGroups) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    final OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel = (OffersSearchFilterGroupViewModel) obj6;
                    FilterBarScope.legacyChip$default(filterBarScope, new Function0() { // from class: com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    function18.invoke(new OffersSearchViewEvent.FilterGroupClicked(i13));
                                    function0.invoke();
                                    break;
                                default:
                                    function18.invoke(new OffersSearchViewEvent.FilterGroupClicked(i13));
                                    function0.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null, false, offersSearchFilterGroupViewModel.active, FilterBarChipType.Dropdown, offersSearchFilterGroupViewModel.name, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                            int i15 = i8;
                            OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel2 = offersSearchFilterGroupViewModel;
                            switch (i15) {
                                case 0:
                                    ((Integer) obj10).getClass();
                                    ((RowScope) obj7).getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersSearchFilterGroupViewModel2.name, (Map) null, (Function1) null, false);
                                    break;
                                default:
                                    ((Integer) obj10).getClass();
                                    ((RowScope) obj7).getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersSearchFilterGroupViewModel2.name, (Map) null, (Function1) null, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -396282601), 6);
                    i13 = i14;
                }
                return Unit.INSTANCE;
            case 15:
                List list6 = (List) obj4;
                Function1 function19 = (Function1) obj2;
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                LazyListScope.item$default(lazyListScope6, null, null, OffersCollectionListingKt.f515lambda$47021494, 3);
                OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0 = new OffersStyledTextKt$$ExternalSyntheticLambda0(i6);
                lazyListScope6.items(list6.size(), new LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1(0, offersStyledTextKt$$ExternalSyntheticLambda0, list6), new LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1(1, LazyScopeExtensionsKt$itemsWithImpressions$1.INSTANCE, list6), new ComposableLambdaImpl(new NavHostKt$NavHost$32(list6, (LazyListState) obj3, offersStyledTextKt$$ExternalSyntheticLambda0, function19, function19, 2), true, 802480018));
                return Unit.INSTANCE;
            case 16:
                OffersHomeListItemViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel = (OffersHomeListItemViewModel.CategoryTilesSectionViewModel) obj4;
                Function1 function110 = (Function1) obj2;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                AbstractPersistentList abstractPersistentList = categoryTilesSectionViewModel.tiles;
                Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda02 = new Overlay$$ExternalSyntheticLambda0(categoryTilesSectionViewModel, 28);
                LazyGridIntervalContent.items$default(lazyGridIntervalContent, abstractPersistentList.size(), overlay$$ExternalSyntheticLambda02, new OffersStyledTextKt$$ExternalSyntheticLambda0(i2), new ComposableLambdaImpl(new NavHostKt$NavHost$32(abstractPersistentList, (LazyGridState) obj3, overlay$$ExternalSyntheticLambda02, function110, function110, 3), true, -1947156835), 4);
                return Unit.INSTANCE;
            case 17:
                final Function1 function111 = (Function1) obj3;
                final Function0 function02 = (Function0) obj2;
                FilterBarScope filterBarScope2 = (FilterBarScope) obj;
                filterBarScope2.getClass();
                for (Object obj7 : ((FilterGroupsSectionViewModel) obj4).filterGroups) {
                    int i15 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    final OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel2 = (OffersSearchFilterGroupViewModel) obj7;
                    FilterBarScope.legacyChip$default(filterBarScope2, new Function0() { // from class: com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    function111.invoke(new OffersSearchViewEvent.FilterGroupClicked(i8));
                                    function02.invoke();
                                    break;
                                default:
                                    function111.invoke(new OffersSearchViewEvent.FilterGroupClicked(i8));
                                    function02.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null, false, offersSearchFilterGroupViewModel2.active, FilterBarChipType.Dropdown, offersSearchFilterGroupViewModel2.name, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj72, Object obj8, Object obj9, Object obj10) {
                            int i152 = i9;
                            OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel22 = offersSearchFilterGroupViewModel2;
                            switch (i152) {
                                case 0:
                                    ((Integer) obj10).getClass();
                                    ((RowScope) obj72).getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersSearchFilterGroupViewModel22.name, (Map) null, (Function1) null, false);
                                    break;
                                default:
                                    ((Integer) obj10).getClass();
                                    ((RowScope) obj72).getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersSearchFilterGroupViewModel22.name, (Map) null, (Function1) null, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1684374888), 6);
                    i8 = i15;
                }
                return Unit.INSTANCE;
            case 18:
                View view = (View) obj4;
                ((DisposableEffectScope) obj).getClass();
                RadioBinding$value$1 radioBinding$value$1 = new RadioBinding$value$1(view, (CompositionContext) obj3, (ComposableLambdaImpl) obj2, view.getContext());
                WindowManager windowManager = (WindowManager) view.getContext().getSystemService(WindowManager.class);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.width = view.getWidth() == 0 ? -1 : view.getWidth();
                layoutParams.height = view.getHeight() == 0 ? -2 : view.getHeight();
                windowManager.addView(radioBinding$value$1, layoutParams);
                Views$waitForMeasure$attachListener$1$listener$1 views$waitForMeasure$attachListener$1$listener$1 = new Views$waitForMeasure$attachListener$1$listener$1(i9, layoutParams, windowManager, radioBinding$value$1);
                if (view.isAttachedToWindow()) {
                    view.addOnLayoutChangeListener(views$waitForMeasure$attachListener$1$listener$1);
                }
                view.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(i3, view, views$waitForMeasure$attachListener$1$listener$1));
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i8, radioBinding$value$1, windowManager);
            case 19:
                AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj4;
                Function1 function112 = (Function1) obj3;
                TextFieldState textFieldState = (TextFieldState) obj2;
                LazyListScope lazyListScope7 = (LazyListScope) obj;
                lazyListScope7.getClass();
                AllowlistSelectionViewModel.HeaderStyle headerStyle = allowlistSelectionViewModel.headerStyle;
                ArrayList arrayList = allowlistSelectionViewModel.selectedContacts;
                SelectCustomerViewModel selectCustomerViewModel = allowlistSelectionViewModel.searchModel;
                if (headerStyle == AllowlistSelectionViewModel.HeaderStyle.EXPANDED) {
                    LazyListScope.item$default(lazyListScope7, null, null, new ComposableLambdaImpl(new AllowlistSelectionKt$$ExternalSyntheticLambda2(allowlistSelectionViewModel, function112, i9), true, 1709074509), 3);
                }
                LazyListScope.item$default(lazyListScope7, null, null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda11(25, allowlistSelectionViewModel, textFieldState), true, 36402760), 3);
                if (selectCustomerViewModel.searchText.getValue().length() == 0 && !arrayList.isEmpty()) {
                    LazyListScope.item$default(lazyListScope7, null, null, new ComposableLambdaImpl(new P2PListViewKt$$ExternalSyntheticLambda12(allowlistSelectionViewModel, 20), true, 1779745462), 3);
                    LazyListScope.item$default(lazyListScope7, null, null, P2PListRowKt.lambda$1858884831, 3);
                    LazyListScope.items$default(lazyListScope7, arrayList.size(), null, new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(i6, allowlistSelectionViewModel, function112), true, -1209401075), 6);
                }
                P2PListRowKt.selectCustomerItems(lazyListScope7, selectCustomerViewModel, new UtilKt$$ExternalSyntheticLambda0(i6, function112));
                return Unit.INSTANCE;
            case 20:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).setFloatValue(floatValue);
                ((Analytics) localCashBalancePresenter.analytics).track(new PaychecksManageDistributionSetAllocationAmountWithKeypad(((BlockersData) localCashBalancePresenter.store).flowToken, Integer.valueOf((int) UtilsKt.getBasisPoints(floatValue)), UtilsKt.toDestinationType(((EditDistributionConfiguration.DestinationUiConfiguration) obj3).destination)), null);
                return Unit.INSTANCE;
            case 21:
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj;
                activityItemViewEvent.getClass();
                JobKt.launch$default((CoroutineScope) obj4, null, null, new MainPaymentPresenter$models$4$4((PaychecksActivityItemPresenter) obj3, (ActivityItemViewModel) obj2, activityItemViewEvent, null, 4), 3);
                return Unit.INSTANCE;
            case 22:
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj4;
                Shaker shaker = (Shaker) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (!(amountEvent instanceof AmountEvent.AmountChanged)) {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                } else if (Intrinsics.areEqual(((AmountEvent.AmountChanged) amountEvent).source, AmountChangedSource.DigitInput.INSTANCE)) {
                    mutableState4.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 23:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new PaymentScreens.DuplicatePayment(new RedactedParcelable(MathUtils.toDbRecipient(com.squareup.cash.recipients.data.UtilsKt.toSendableUiCustomer(((RecipientViewModel) obj3).recipient))), ((PaymentConfigurationPresenter) obj4).args.orientation, (Money) obj2, askedQuestion);
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(new CustomAccessibilityAction((String) obj4, new RecipientListViewKt$$ExternalSyntheticLambda10((Function1) obj3, (RecipientViewModel) obj2, 4)));
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                return Unit.INSTANCE;
            case 25:
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                int ordinal = ((NavigationType) obj4).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    str3 = str4;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str3);
                return Unit.INSTANCE;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, (String) obj4);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver3, (String) obj3, new ActionMenuKt$$ExternalSyntheticLambda0(4, (Function1) obj2));
                return Unit.INSTANCE;
            case 27:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function113 = (Function1) obj3;
                Text text = (Text) obj2;
                ((KeyboardActionScope) obj).getClass();
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                function113.invoke(new PersonalizePaymentViewEvent.RequestFocus(text, false));
                return Unit.INSTANCE;
            case 28:
                Function1 function114 = (Function1) obj4;
                Text text2 = (Text) obj3;
                MutableState mutableState5 = (MutableState) obj2;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                if (annotatedString.text.length() <= 50) {
                    mutableState5.setValue(textFieldValue);
                }
                function114.invoke(new PersonalizePaymentViewEvent.TextChanged(text2, annotatedString.text));
                return Unit.INSTANCE;
            default:
                Function1 function115 = (Function1) obj4;
                Element element = (Element) obj3;
                MutableState mutableState6 = (MutableState) obj2;
                ItemCoordinates itemCoordinates = (ItemCoordinates) obj;
                itemCoordinates.getClass();
                long j = itemCoordinates.size;
                Size size2 = new Size((int) (j >> 32), (int) (BodyPartID.bodyIdMax & j));
                if (!Intrinsics.areEqual((Size) mutableState6.getValue(), size2)) {
                    function115.invoke(new PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged(element, size2, new Size(((Size) mutableState6.getValue()).width, ((Size) mutableState6.getValue()).height)));
                    mutableState6.setValue(size2);
                }
                return Unit.INSTANCE;
        }
    }
}
