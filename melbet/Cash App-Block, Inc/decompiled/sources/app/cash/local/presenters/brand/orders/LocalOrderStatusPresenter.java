package app.cash.local.presenters.brand.orders;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$ModifierInformation;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$TextModifierInformation;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.LoyaltyKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderStatusKt;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.RealImageLoader$execute$result$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableLocalCurbsidePickupOption;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalPhone;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.RecipientIdentifier;
import com.squareup.protos.cash.local.client.v1.RecipientIdentifierType;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public final class LocalOrderStatusPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealClipboardManager clipboardManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealLocalLauncher launcher;
    public final RealLocalOrderRepository localOrderRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LocalOrderStatusScreen screen;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;
    public final String title;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalOrderStatusPresenter(AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager, RealLocalLauncher realLocalLauncher, RealLocalOrderRepository realLocalOrderRepository, SessionManager sessionManager, Analytics analytics, FeatureFlagManager featureFlagManager, LocalOrderStatusScreen localOrderStatusScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localOrderStatusScreen.getClass();
        this.stringManager = androidStringManager;
        this.clipboardManager = realClipboardManager;
        this.launcher = realLocalLauncher;
        this.localOrderRepository = realLocalOrderRepository;
        this.sessionManager = sessionManager;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.screen = localOrderStatusScreen;
        this.navigator = screenNavigator;
        this.title = localOrderStatusScreen.fromBlockers ? androidStringManager.get(R.string.local_presenters_confirmation) : androidStringManager.get(R.string.local_presenters_order_status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a21  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        LocalPhone localPhone;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        String str;
        LocalOrderStatusViewModel.Loaded.DisplayMode displayMode;
        LocalOrderStatusScreen localOrderStatusScreen;
        MutableState mutableState5;
        State state;
        State state2;
        LocalAddress localAddress;
        State state3;
        MutableState mutableState6;
        LocalPhone localPhone2;
        String str2;
        MapDecisionSheetModel mapDecisionSheetModel;
        Resources resources;
        ListBuilder listBuilder;
        List list;
        String str3;
        String str4;
        LocalFulfillmentType localFulfillmentType;
        boolean z;
        GpsCoordinates gpsCoordinates;
        OrderStatus orderStatus;
        LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver;
        GpsCoordinates gpsCoordinates2;
        GpsCoordinates gpsCoordinates3;
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails delivery;
        String str5;
        String str6;
        String str7;
        Integer num;
        String str8;
        LocalLoyaltyProgram localLoyaltyProgram;
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction curbsideArrivalAction;
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction curbsideArrivalAction2;
        LocalFulfillment.DeliveryDetails deliveryDetails;
        Boolean bool;
        String str9;
        String str10;
        Object obj;
        String str11;
        String str12;
        Object obj2;
        String str13;
        Object obj3;
        CurbsidePickupSettings curbsidePickupSettings;
        String str14;
        Long l;
        MutableState mutableState7;
        String str15;
        State state4;
        State state5;
        LocalAddress localAddress2;
        String renderSelectionInformation;
        Unit unit;
        Integer num2;
        final LocalOrderStatusPresenter localOrderStatusPresenter = this;
        AndroidStringManager androidStringManager = localOrderStatusPresenter.stringManager;
        Resources resources2 = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1500266751);
        Object rememberedValue = gapComposer.rememberedValue();
        LocalOrderStatusScreen localOrderStatusScreen2 = localOrderStatusPresenter.screen;
        Object obj4 = Composer.Companion.Empty;
        if (rememberedValue == obj4) {
            rememberedValue = Recorder$$ExternalSyntheticOutline1.m(!(localOrderStatusScreen2.f913type instanceof LocalOrderStatusScreen.Type.Preloaded), gapComposer);
        }
        MutableState mutableState8 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj4) {
            LocalOrderStatusScreen.Type type2 = localOrderStatusScreen2.f913type;
            LocalOrderStatusScreen.Type.Preloaded preloaded = type2 instanceof LocalOrderStatusScreen.Type.Preloaded ? (LocalOrderStatusScreen.Type.Preloaded) type2 : null;
            rememberedValue2 = Updater.mutableStateOf$default(preloaded != null ? preloaded.order : null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState9 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj4) {
            rememberedValue3 = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState10 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj4) {
            rememberedValue4 = StateFlowKt.mapState(Trace.valuesState(localOrderStatusPresenter.featureFlagManager, LaunchDarklyFeatureFlags$EnableLocalCurbsidePickupOption.INSTANCE), new Data$$ExternalSyntheticLambda0(23));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, localOrderStatusPresenter, mutableState8, mutableState9, mutableState10, 9));
        Object obj5 = localOrderStatusScreen2.f913type;
        if (obj5 instanceof LocalOrderStatusScreen.Type.Standalone) {
            gapComposer.startReplaceGroup(-1015792569);
            Integer valueOf = Integer.valueOf(((Number) mutableState10.getValue()).intValue());
            boolean changedInstance = gapComposer.changedInstance(localOrderStatusPresenter) | gapComposer.changedInstance(obj5);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == obj4) {
                num2 = valueOf;
                Object realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(this, obj5, mutableState9, mutableState8, (Continuation) null, 12);
                mutableState9 = mutableState9;
                localOrderStatusPresenter = this;
                gapComposer.updateRememberedValue(realImageLoader$execute$result$1);
                rememberedValue5 = realImageLoader$execute$result$1;
            } else {
                num2 = valueOf;
            }
            Updater.LaunchedEffect(gapComposer, num2, (Function2) rememberedValue5);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1015644575);
            gapComposer.end(false);
        }
        if (((Boolean) mutableState8.getValue()).booleanValue()) {
            gapComposer.end(false);
            return LocalOrderStatusViewModel.Loading.INSTANCE;
        }
        if (((LocalOrder) mutableState9.getValue()) == null) {
            gapComposer.end(false);
            return LocalOrderStatusViewModel.Error.INSTANCE;
        }
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj4) {
            LocalOrder localOrder = (LocalOrder) mutableState9.getValue();
            localOrder.getClass();
            rememberedValue6 = Updater.mutableStateOf$default(localOrder);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) rememberedValue6;
        LocalLocationSummary localLocationSummary = ((LocalOrder) mutableState11.getValue()).location_summary;
        localLocationSummary.getClass();
        Location.LocationSummary location = LocationKt.toLocation(localLocationSummary);
        LocalPhone localPhone3 = location.phone;
        List<LocalOrder.OrderSummaryLine> list2 = ((LocalOrder) mutableState11.getValue()).order_summary;
        String str16 = location.name;
        LocalAddress localAddress3 = location.address;
        localAddress3.getClass();
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj4) {
            rememberedValue7 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(16, mutableState11));
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        State state6 = (State) rememberedValue7;
        LocalOrder localOrder2 = (LocalOrder) mutableState11.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(localOrderStatusPresenter);
        Object rememberedValue8 = gapComposer.rememberedValue();
        int i2 = 13;
        if (changedInstance2 || rememberedValue8 == obj4) {
            localPhone = localPhone3;
            rememberedValue8 = new AnimatedImageDecoder$wrapDrawable$2(localOrderStatusPresenter, mutableState11, (Continuation) null, i2);
            gapComposer.updateRememberedValue(rememberedValue8);
        } else {
            localPhone = localPhone3;
        }
        Updater.LaunchedEffect(gapComposer, localOrder2, (Function2) rememberedValue8);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj4) {
            rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState12 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj4) {
            rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState13 = (MutableState) rememberedValue10;
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj4) {
            rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState14 = (MutableState) rememberedValue11;
        LocalPhone localPhone4 = localPhone;
        Continuation continuation = null;
        RealBugReportSender$submitBugReport$2 realBugReportSender$submitBugReport$2 = new RealBugReportSender$submitBugReport$2(flow, null, localOrderStatusPresenter, location, localAddress3, str16, mutableState12, mutableState11, state6, mutableState13, mutableState14, 1);
        MutableState mutableState15 = mutableState12;
        State state7 = state6;
        LocalAddress localAddress4 = localAddress3;
        Updater.LaunchedEffect(gapComposer, flow, realBugReportSender$submitBugReport$2);
        if (((Boolean) mutableState13.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1011640429);
            Unit unit2 = Unit.INSTANCE;
            boolean changedInstance3 = gapComposer.changedInstance(localOrderStatusPresenter);
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue12 == obj4) {
                mutableState3 = mutableState11;
                unit = unit2;
                Object zzmoVar = new zzmo(this, mutableState3, mutableState14, mutableState13, null, 1);
                mutableState = mutableState14;
                mutableState2 = mutableState13;
                localOrderStatusPresenter = this;
                gapComposer.updateRememberedValue(zzmoVar);
                rememberedValue12 = zzmoVar;
            } else {
                mutableState = mutableState14;
                mutableState2 = mutableState13;
                mutableState3 = mutableState11;
                unit = unit2;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue12);
            gapComposer.end(false);
        } else {
            mutableState = mutableState14;
            mutableState2 = mutableState13;
            mutableState3 = mutableState11;
            gapComposer.startReplaceGroup(-1011350207);
            gapComposer.end(false);
        }
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj4) {
            rememberedValue13 = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(13, location, localOrderStatusPresenter, state7));
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        State state8 = (State) rememberedValue13;
        boolean changed = gapComposer.changed((LocalOrder) mutableState3.getValue());
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changed || rememberedValue14 == obj4) {
            rememberedValue14 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(17, mutableState3));
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        State state9 = (State) rememberedValue14;
        LocalOrderStatusViewModel.Loaded.DisplayMode displayMode2 = (localOrderStatusScreen2.closeOpenTabConfirmation || OpenTabStateKt.isClosedInStoreOpenTab((LocalOrder) mutableState3.getValue())) ? LocalOrderStatusViewModel.Loaded.DisplayMode.InStoreOpenTabClosed : LocalOrderStatusViewModel.Loaded.DisplayMode.Standard;
        OrderStatus orderStatus2 = (OrderStatus) state9.getValue();
        if (orderStatus2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            MutableState mutableState16 = mutableState3;
            mutableState4 = mutableState2;
            str = str16;
            localOrderStatusScreen = localOrderStatusScreen2;
            displayMode = displayMode2;
            mutableState3 = mutableState16;
            Updater.LaunchedEffect(gapComposer, orderStatus2, new zzmh(orderStatus2, continuation, localOrderStatusPresenter, mutableState16, 5));
            gapComposer.end(false);
        } else {
            mutableState4 = mutableState2;
            str = str16;
            displayMode = displayMode2;
            localOrderStatusScreen = localOrderStatusScreen2;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == obj4) {
            List<LocalOrder.OrderSummaryLine> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                LocalOrder.OrderSummaryLine orderSummaryLine = (LocalOrder.OrderSummaryLine) it.next();
                String str17 = orderSummaryLine.item_name;
                str17.getClass();
                Iterator it2 = it;
                if (orderSummaryLine.combo_slots.isEmpty()) {
                    String str18 = orderSummaryLine.variation_name;
                    mutableState7 = mutableState3;
                    List<LocalOrder.OrderSummaryLine.OrderSummaryLineModifier> list4 = orderSummaryLine.modifiers;
                    str15 = str17;
                    state4 = state8;
                    state5 = state9;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        LocalOrder.OrderSummaryLine.OrderSummaryLineModifier orderSummaryLineModifier = (LocalOrder.OrderSummaryLine.OrderSummaryLineModifier) it3.next();
                        orderSummaryLineModifier.getClass();
                        Iterator it4 = it3;
                        String str19 = orderSummaryLineModifier.modifier_name;
                        str19.getClass();
                        LocalAddress localAddress5 = localAddress4;
                        Integer num3 = orderSummaryLineModifier.quantity;
                        LocalMoney localMoney = orderSummaryLineModifier.total_price;
                        arrayList2.add(new LineSelectionInformationRenderer$ModifierInformation(str19, num3, localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null));
                        it3 = it4;
                        localAddress4 = localAddress5;
                    }
                    localAddress2 = localAddress4;
                    List<LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier> list5 = orderSummaryLine.text_modifiers;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier orderSummaryLineTextModifier = (LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier) it5.next();
                        orderSummaryLineTextModifier.getClass();
                        Iterator it6 = it5;
                        String str20 = orderSummaryLineTextModifier.modifier_name;
                        str20.getClass();
                        String str21 = orderSummaryLineTextModifier.inputted_text;
                        if (str21 == null) {
                            str21 = "";
                        }
                        arrayList3.add(new LineSelectionInformationRenderer$TextModifierInformation(str20, str21));
                        it5 = it6;
                    }
                    renderSelectionInformation = WorkYouViewKt.renderSelectionInformation(str18, arrayList2, arrayList3);
                } else {
                    mutableState7 = mutableState3;
                    str15 = str17;
                    state4 = state8;
                    state5 = state9;
                    localAddress2 = localAddress4;
                    renderSelectionInformation = null;
                }
                LocalMoney localMoney2 = orderSummaryLine.price;
                localMoney2.getClass();
                String prettyPrint$default = LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney2), false, null, 7);
                Integer num4 = orderSummaryLine.quantity;
                num4.getClass();
                int intValue = num4.intValue();
                List<LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot> list6 = orderSummaryLine.combo_slots;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it7 = list6.iterator();
                while (it7.hasNext()) {
                    LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot orderSummaryLineComboSlot = (LocalOrder.OrderSummaryLine.OrderSummaryLineComboSlot) it7.next();
                    orderSummaryLineComboSlot.getClass();
                    String str22 = orderSummaryLineComboSlot.item_name;
                    str22.getClass();
                    String str23 = orderSummaryLineComboSlot.variation_name;
                    List<LocalOrder.OrderSummaryLine.OrderSummaryLineModifier> list7 = orderSummaryLineComboSlot.modifiers;
                    Iterator it8 = it7;
                    State state10 = state7;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                    Iterator it9 = list7.iterator();
                    while (it9.hasNext()) {
                        LocalOrder.OrderSummaryLine.OrderSummaryLineModifier orderSummaryLineModifier2 = (LocalOrder.OrderSummaryLine.OrderSummaryLineModifier) it9.next();
                        orderSummaryLineModifier2.getClass();
                        Iterator it10 = it9;
                        String str24 = orderSummaryLineModifier2.modifier_name;
                        str24.getClass();
                        MutableState mutableState17 = mutableState15;
                        Integer num5 = orderSummaryLineModifier2.quantity;
                        LocalMoney localMoney3 = orderSummaryLineModifier2.total_price;
                        arrayList5.add(new LineSelectionInformationRenderer$ModifierInformation(str24, num5, localMoney3 != null ? LocalMoneyKt.toMoney(localMoney3) : null));
                        it9 = it10;
                        mutableState15 = mutableState17;
                    }
                    MutableState mutableState18 = mutableState15;
                    List<LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier> list8 = orderSummaryLineComboSlot.text_modifiers;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                    for (LocalOrder.OrderSummaryLine.OrderSummaryLineTextModifier orderSummaryLineTextModifier2 : list8) {
                        orderSummaryLineTextModifier2.getClass();
                        String str25 = orderSummaryLineTextModifier2.modifier_name;
                        str25.getClass();
                        String str26 = orderSummaryLineTextModifier2.inputted_text;
                        if (str26 == null) {
                            str26 = "";
                        }
                        arrayList6.add(new LineSelectionInformationRenderer$TextModifierInformation(str25, str26));
                    }
                    arrayList4.add(new ComboSlotViewModel(str22, WorkYouViewKt.renderSelectionInformation(str23, arrayList5, arrayList6), null, EmptyList.INSTANCE));
                    it7 = it8;
                    state7 = state10;
                    mutableState15 = mutableState18;
                }
                arrayList.add(new LocalOrderStatusViewModel.Loaded.Selection(str15, renderSelectionInformation, prettyPrint$default, intValue, arrayList4));
                it = it2;
                mutableState3 = mutableState7;
                state8 = state4;
                state9 = state5;
                localAddress4 = localAddress2;
            }
            mutableState5 = mutableState3;
            state = state8;
            state2 = state9;
            localAddress = localAddress4;
            state3 = state7;
            mutableState6 = mutableState15;
            gapComposer.updateRememberedValue(arrayList);
            rememberedValue15 = arrayList;
        } else {
            mutableState5 = mutableState3;
            state = state8;
            state2 = state9;
            localAddress = localAddress4;
            state3 = state7;
            mutableState6 = mutableState15;
        }
        List list9 = (List) rememberedValue15;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        LocalMoney localMoney4 = ((LocalOrder) mutableState5.getValue()).subtotal_amount;
        if (localMoney4 != null) {
            createListBuilder.add(new KeyValue(androidStringManager.get(R.string.local_presenters_subtotal), LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney4), false, null, 3), 12, false));
        }
        for (LocalOrder.AdjustmentLine adjustmentLine : ((LocalOrder) mutableState5.getValue()).adjustment_lines) {
            LocalMoney localMoney5 = adjustmentLine.amount;
            localMoney5.getClass();
            app.cash.local.primitives.LocalMoney money = LocalMoneyKt.toMoney(localMoney5);
            String str27 = adjustmentLine.description;
            str27.getClass();
            createListBuilder.add(new KeyValue(str27, LocalsKt.prettyPrint$default(money, false, null, 3), 8, money.amount < 0));
        }
        LocalMoney localMoney6 = ((LocalOrder) mutableState5.getValue()).total_amount;
        if (localMoney6 != null) {
            createListBuilder.add(new KeyValue(androidStringManager.get(R.string.local_presenters_total), LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney6), false, null, 3), 4, false));
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        if (((Boolean) mutableState6.getValue()).booleanValue()) {
            localPhone2 = localPhone4;
            str2 = null;
            mapDecisionSheetModel = new MapDecisionSheetModel(null, null, localPhone2 != null);
        } else {
            localPhone2 = localPhone4;
            str2 = null;
            mapDecisionSheetModel = null;
        }
        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        LocalOrderStatusViewModel.Loaded.DisplayMode displayMode3 = LocalOrderStatusViewModel.Loaded.DisplayMode.InStoreOpenTabClosed;
        if (displayMode == displayMode3 || (l = ((LocalOrder) mutableState5.getValue()).paid_at) == null) {
            resources = resources2;
        } else {
            long longValue = l.longValue();
            DateTimeFormatter dateTimeFormatter = DateTimesKt.hourOnlyPatternNoAmPm;
            if (longValue < 1000000000000L) {
                longValue *= 1000;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
            ofEpochMilli.getClass();
            LocalLocationSummary localLocationSummary2 = ((LocalOrder) mutableState5.getValue()).location_summary;
            localLocationSummary2.getClass();
            String str28 = localLocationSummary2.time_zone;
            str28.getClass();
            ZoneId of = ZoneId.of(str28);
            of.getClass();
            String format2 = DateTimesKt.instantToLocalDateTime(ofEpochMilli, of).format(DateTimesKt.monthDayTimePattern);
            format2.getClass();
            resources2.getClass();
            resources = resources2;
            String format3 = new MessageFormat(resources.getString(R.string.local_presenters_order_status_paid_at)).format(new Object[]{format2});
            format3.getClass();
            createListBuilder2.add(format3);
        }
        String str29 = ((LocalOrder) mutableState5.getValue()).buyer_name;
        if (str29 != null) {
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(R.string.local_presenters_order_status_for)).format(new Object[]{str29});
            format4.getClass();
            createListBuilder2.add(format4);
        }
        if (displayMode == displayMode3 && (str14 = ((LocalOrder) mutableState5.getValue()).order_ticket_number) != null) {
            if (StringsKt.isBlank(str14)) {
                str14 = str2;
            }
            if (str14 != null) {
                resources.getClass();
                String format5 = new MessageFormat(resources.getString(R.string.local_presenters_order_status_check_number)).format(new Object[]{str14});
                format5.getClass();
                createListBuilder2.add(format5);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder2), "\n", null, null, 0, null, null, 62);
        List<LocalOrder.PaymentSummary> list10 = ((LocalOrder) mutableState5.getValue()).payment_summary;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : list10) {
            if (((LocalOrder.PaymentSummary) obj6).card_brand != null) {
                arrayList7.add(obj6);
            }
        }
        boolean changedInstance4 = gapComposer.changedInstance(localOrderStatusPresenter);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue16 == obj4) {
            final int i3 = 0;
            rememberedValue16 = new Function1(localOrderStatusPresenter) { // from class: app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter$$ExternalSyntheticLambda5
                public final /* synthetic */ LocalOrderStatusPresenter f$0;

                {
                    this.f$0 = localOrderStatusPresenter;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj7) {
                    int i4 = i3;
                    LocalOrderStatusPresenter localOrderStatusPresenter2 = this.f$0;
                    switch (i4) {
                        case 0:
                            LocalOrder.PaymentSummary paymentSummary = (LocalOrder.PaymentSummary) obj7;
                            paymentSummary.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append(paymentSummary.card_brand);
                            if (paymentSummary.last_4 != null) {
                                sb.append(' ');
                                AndroidStringManager androidStringManager2 = localOrderStatusPresenter2.stringManager;
                                String str30 = paymentSummary.last_4;
                                str30.getClass();
                                Resources resources3 = androidStringManager2.resources;
                                resources3.getClass();
                                String format6 = new MessageFormat(resources3.getString(R.string.local_presenters_payment_label_card_ending_with)).format(new Object[]{str30});
                                format6.getClass();
                                String lowerCase = format6.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                sb.append(lowerCase);
                            }
                            return sb.toString();
                        case 1:
                            String str31 = (String) obj7;
                            str31.getClass();
                            Resources resources4 = localOrderStatusPresenter2.stringManager.resources;
                            resources4.getClass();
                            String format7 = new MessageFormat(resources4.getString(R.string.local_presenters_delivered_by)).format(new Object[]{str31});
                            format7.getClass();
                            return format7;
                        default:
                            String str32 = (String) obj7;
                            str32.getClass();
                            Resources resources5 = localOrderStatusPresenter2.stringManager.resources;
                            resources5.getClass();
                            String format8 = new MessageFormat(resources5.getString(R.string.local_presenters_ready_by)).format(new Object[]{str32});
                            format8.getClass();
                            return format8;
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        String joinToString$default2 = CollectionsKt.joinToString$default(arrayList7, "\n", null, null, 0, null, (Function1) rememberedValue16, 30);
        if (StringsKt.isBlank(joinToString$default2)) {
            joinToString$default2 = str2;
        }
        LocalFulfillment localFulfillment = ((LocalOrder) mutableState5.getValue()).fulfillment;
        LocalFulfillment.PickupDetails pickupDetails = localFulfillment != null ? localFulfillment.pickup_details : str2;
        boolean areEqual = pickupDetails != 0 ? Intrinsics.areEqual(pickupDetails.is_curbside_pickup, Boolean.TRUE) : false;
        boolean z2 = (pickupDetails != 0 ? pickupDetails.buyer_arrived_at : str2) != null;
        LocalLocationSummary localLocationSummary3 = ((LocalOrder) mutableState5.getValue()).location_summary;
        boolean areEqual2 = (localLocationSummary3 == null || (curbsidePickupSettings = localLocationSummary3.curbside_pickup_settings) == null) ? false : Intrinsics.areEqual(curbsidePickupSettings.pos_alerts_enabled, Boolean.TRUE);
        if (pickupDetails != 0) {
            Iterator<T> it11 = pickupDetails.recipient_identifiers.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    listBuilder = build;
                    list = list9;
                    obj = null;
                    break;
                }
                obj = it11.next();
                listBuilder = build;
                list = list9;
                if (((RecipientIdentifier) obj).type == RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_VEHICLE_COLOR) {
                    break;
                }
                build = listBuilder;
                list9 = list;
            }
            RecipientIdentifier recipientIdentifier = (RecipientIdentifier) obj;
            if (recipientIdentifier == null || (str12 = recipientIdentifier.display_value) == null) {
                str3 = joinToString$default;
            } else {
                Iterator it12 = pickupDetails.recipient_identifiers.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        str3 = joinToString$default;
                        obj2 = null;
                        break;
                    }
                    obj2 = it12.next();
                    Iterator it13 = it12;
                    str3 = joinToString$default;
                    if (((RecipientIdentifier) obj2).type == RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_VEHICLE_TYPE) {
                        break;
                    }
                    it12 = it13;
                    joinToString$default = str3;
                }
                RecipientIdentifier recipientIdentifier2 = (RecipientIdentifier) obj2;
                if (recipientIdentifier2 != null && (str13 = recipientIdentifier2.display_value) != null) {
                    Iterator it14 = pickupDetails.recipient_identifiers.iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it14.next();
                        Iterator it15 = it14;
                        if (((RecipientIdentifier) obj3).type == RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_NOTE) {
                            break;
                        }
                        it14 = it15;
                    }
                    RecipientIdentifier recipientIdentifier3 = (RecipientIdentifier) obj3;
                    String str30 = recipientIdentifier3 != null ? recipientIdentifier3.display_value : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str12 + " " + str13);
                    if (str30 != null && !StringsKt.isBlank(str30)) {
                        sb.append("\n");
                        sb.append(str30);
                    }
                    str11 = sb.toString();
                    str4 = str11;
                }
            }
            str11 = null;
            str4 = str11;
        } else {
            listBuilder = build;
            list = list9;
            str3 = joinToString$default;
            str4 = null;
        }
        Fulfillment fulfillment = (Fulfillment) state3.getValue();
        if (fulfillment == null || (localFulfillmentType = fulfillment.f911type) == null) {
            localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()]) {
            case 1:
                gapComposer.startReplaceGroup(-1006461197);
                OrderStatus orderStatus3 = (OrderStatus) state2.getValue();
                LocalOrder.LocalOrderBrand localOrderBrand = ((LocalOrder) mutableState5.getValue()).local_order_brand;
                String str31 = (localOrderBrand == null || (str6 = localOrderBrand.name) == null) ? str : str6;
                LocalOrder.LocalOrderBrand localOrderBrand2 = ((LocalOrder) mutableState5.getValue()).local_order_brand;
                LocalImage localImage = localOrderBrand2 != null ? localOrderBrand2.artwork_image : null;
                Fulfillment fulfillment2 = (Fulfillment) state3.getValue();
                fulfillment2.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails2 = fulfillment2.deliveryDetails;
                deliveryDetails2.getClass();
                LocalAddress localAddress6 = deliveryDetails2.delivery_address;
                localAddress6.getClass();
                String formattedFull = LocalsKt.formattedFull(localAddress6);
                Iterator<T> it16 = ((LocalOrder) mutableState5.getValue()).order_summary.iterator();
                int i4 = 0;
                while (it16.hasNext()) {
                    Integer num6 = ((LocalOrder.OrderSummaryLine) it16.next()).quantity;
                    i4 += num6 != null ? num6.intValue() : 0;
                }
                Integer valueOf2 = Integer.valueOf(i4);
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("count", valueOf2);
                resources.getClass();
                String format6 = new MessageFormat(resources.getString(R.string.local_presenters_items_count)).format(arrayMap);
                format6.getClass();
                LocalText localText = (LocalText) state.getValue();
                OrderStatus orderStatus4 = (OrderStatus) state2.getValue();
                Fulfillment fulfillment3 = (Fulfillment) state3.getValue();
                boolean changedInstance5 = gapComposer.changedInstance(localOrderStatusPresenter);
                Object rememberedValue17 = gapComposer.rememberedValue();
                if (changedInstance5 || rememberedValue17 == obj4) {
                    final int i5 = 1;
                    rememberedValue17 = new Function1(localOrderStatusPresenter) { // from class: app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter$$ExternalSyntheticLambda5
                        public final /* synthetic */ LocalOrderStatusPresenter f$0;

                        {
                            this.f$0 = localOrderStatusPresenter;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i42 = i5;
                            LocalOrderStatusPresenter localOrderStatusPresenter2 = this.f$0;
                            switch (i42) {
                                case 0:
                                    LocalOrder.PaymentSummary paymentSummary = (LocalOrder.PaymentSummary) obj7;
                                    paymentSummary.getClass();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(paymentSummary.card_brand);
                                    if (paymentSummary.last_4 != null) {
                                        sb2.append(' ');
                                        AndroidStringManager androidStringManager2 = localOrderStatusPresenter2.stringManager;
                                        String str302 = paymentSummary.last_4;
                                        str302.getClass();
                                        Resources resources3 = androidStringManager2.resources;
                                        resources3.getClass();
                                        String format62 = new MessageFormat(resources3.getString(R.string.local_presenters_payment_label_card_ending_with)).format(new Object[]{str302});
                                        format62.getClass();
                                        String lowerCase = format62.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        sb2.append(lowerCase);
                                    }
                                    return sb2.toString();
                                case 1:
                                    String str312 = (String) obj7;
                                    str312.getClass();
                                    Resources resources4 = localOrderStatusPresenter2.stringManager.resources;
                                    resources4.getClass();
                                    String format7 = new MessageFormat(resources4.getString(R.string.local_presenters_delivered_by)).format(new Object[]{str312});
                                    format7.getClass();
                                    return format7;
                                default:
                                    String str32 = (String) obj7;
                                    str32.getClass();
                                    Resources resources5 = localOrderStatusPresenter2.stringManager.resources;
                                    resources5.getClass();
                                    String format8 = new MessageFormat(resources5.getString(R.string.local_presenters_ready_by)).format(new Object[]{str32});
                                    format8.getClass();
                                    return format8;
                            }
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue17);
                }
                LocalText access$withPrefixIfNeeded = MerchantKt.access$withPrefixIfNeeded(localText, orderStatus4, fulfillment3, (Function1) rememberedValue17);
                Fulfillment fulfillment4 = (Fulfillment) state3.getValue();
                fulfillment4.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails3 = fulfillment4.deliveryDetails;
                deliveryDetails3.getClass();
                LocalAddress localAddress7 = deliveryDetails3.delivery_address;
                GpsCoordinates gpsCoordinates4 = localAddress7 != null ? LocalsKt.toGpsCoordinates(localAddress7) : null;
                OrderStatus orderStatus5 = (OrderStatus) state2.getValue();
                if (orderStatus5 != null) {
                    z = true;
                    if (OrderStatusKt.getCompleted(orderStatus5)) {
                        gpsCoordinates = null;
                        orderStatus = (OrderStatus) state2.getValue();
                        if (orderStatus != null || OrderStatusKt.getCompleted(orderStatus) != z) {
                            Fulfillment fulfillment5 = (Fulfillment) state3.getValue();
                            fulfillment5.getClass();
                            LocalFulfillment.DeliveryDetails deliveryDetails4 = fulfillment5.deliveryDetails;
                            deliveryDetails4.getClass();
                            deliveryCourierDriver = deliveryDetails4.courier_driver;
                            if (deliveryCourierDriver != null) {
                                Double d = deliveryCourierDriver.geo_latitude;
                                if (d != null) {
                                    double doubleValue = d.doubleValue();
                                    Double d2 = deliveryCourierDriver.geo_longitude;
                                    if (d2 != null) {
                                        gpsCoordinates2 = new GpsCoordinates(doubleValue, d2.doubleValue());
                                        gpsCoordinates3 = gpsCoordinates2;
                                        boolean z3 = (localPhone2 != null || (str5 = localPhone2.formatted) == null) ? false : !StringsKt.isBlank(str5);
                                        String str32 = ((LocalOrder) mutableState5.getValue()).instructions;
                                        Fulfillment fulfillment6 = (Fulfillment) state3.getValue();
                                        fulfillment6.getClass();
                                        LocalFulfillment.DeliveryDetails deliveryDetails5 = fulfillment6.deliveryDetails;
                                        deliveryDetails5.getClass();
                                        String str33 = deliveryDetails5.dropoff_proof_image_url;
                                        Fulfillment fulfillment7 = (Fulfillment) state3.getValue();
                                        fulfillment7.getClass();
                                        LocalFulfillment.DeliveryDetails deliveryDetails6 = fulfillment7.deliveryDetails;
                                        deliveryDetails6.getClass();
                                        LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver2 = deliveryDetails6.courier_driver;
                                        Fulfillment fulfillment8 = (Fulfillment) state3.getValue();
                                        fulfillment8.getClass();
                                        LocalFulfillment.DeliveryDetails deliveryDetails7 = fulfillment8.deliveryDetails;
                                        deliveryDetails7.getClass();
                                        Boolean bool2 = deliveryDetails7.requires_id_verification;
                                        delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery(orderStatus3, str31, format6, localImage, formattedFull, gpsCoordinates4, gpsCoordinates, gpsCoordinates3, str33, z3, str32, deliveryCourierDriver2, bool2 == null ? bool2.booleanValue() : false, access$withPrefixIfNeeded);
                                        gapComposer.end(false);
                                        break;
                                    }
                                }
                                gpsCoordinates2 = null;
                                gpsCoordinates3 = gpsCoordinates2;
                                if (localPhone2 != null) {
                                }
                                String str322 = ((LocalOrder) mutableState5.getValue()).instructions;
                                Fulfillment fulfillment62 = (Fulfillment) state3.getValue();
                                fulfillment62.getClass();
                                LocalFulfillment.DeliveryDetails deliveryDetails52 = fulfillment62.deliveryDetails;
                                deliveryDetails52.getClass();
                                String str332 = deliveryDetails52.dropoff_proof_image_url;
                                Fulfillment fulfillment72 = (Fulfillment) state3.getValue();
                                fulfillment72.getClass();
                                LocalFulfillment.DeliveryDetails deliveryDetails62 = fulfillment72.deliveryDetails;
                                deliveryDetails62.getClass();
                                LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver22 = deliveryDetails62.courier_driver;
                                Fulfillment fulfillment82 = (Fulfillment) state3.getValue();
                                fulfillment82.getClass();
                                LocalFulfillment.DeliveryDetails deliveryDetails72 = fulfillment82.deliveryDetails;
                                deliveryDetails72.getClass();
                                Boolean bool22 = deliveryDetails72.requires_id_verification;
                                delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery(orderStatus3, str31, format6, localImage, formattedFull, gpsCoordinates4, gpsCoordinates, gpsCoordinates3, str332, z3, str322, deliveryCourierDriver22, bool22 == null ? bool22.booleanValue() : false, access$withPrefixIfNeeded);
                                gapComposer.end(false);
                            }
                        }
                        gpsCoordinates3 = null;
                        if (localPhone2 != null) {
                        }
                        String str3222 = ((LocalOrder) mutableState5.getValue()).instructions;
                        Fulfillment fulfillment622 = (Fulfillment) state3.getValue();
                        fulfillment622.getClass();
                        LocalFulfillment.DeliveryDetails deliveryDetails522 = fulfillment622.deliveryDetails;
                        deliveryDetails522.getClass();
                        String str3322 = deliveryDetails522.dropoff_proof_image_url;
                        Fulfillment fulfillment722 = (Fulfillment) state3.getValue();
                        fulfillment722.getClass();
                        LocalFulfillment.DeliveryDetails deliveryDetails622 = fulfillment722.deliveryDetails;
                        deliveryDetails622.getClass();
                        LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver222 = deliveryDetails622.courier_driver;
                        Fulfillment fulfillment822 = (Fulfillment) state3.getValue();
                        fulfillment822.getClass();
                        LocalFulfillment.DeliveryDetails deliveryDetails722 = fulfillment822.deliveryDetails;
                        deliveryDetails722.getClass();
                        Boolean bool222 = deliveryDetails722.requires_id_verification;
                        delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery(orderStatus3, str31, format6, localImage, formattedFull, gpsCoordinates4, gpsCoordinates, gpsCoordinates3, str3322, z3, str3222, deliveryCourierDriver222, bool222 == null ? bool222.booleanValue() : false, access$withPrefixIfNeeded);
                        gapComposer.end(false);
                    }
                } else {
                    z = true;
                }
                gpsCoordinates = LocalsKt.toGpsCoordinates(localAddress);
                orderStatus = (OrderStatus) state2.getValue();
                if (orderStatus != null) {
                }
                Fulfillment fulfillment52 = (Fulfillment) state3.getValue();
                fulfillment52.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails42 = fulfillment52.deliveryDetails;
                deliveryDetails42.getClass();
                deliveryCourierDriver = deliveryDetails42.courier_driver;
                if (deliveryCourierDriver != null) {
                }
                gpsCoordinates3 = null;
                if (localPhone2 != null) {
                }
                String str32222 = ((LocalOrder) mutableState5.getValue()).instructions;
                Fulfillment fulfillment6222 = (Fulfillment) state3.getValue();
                fulfillment6222.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails5222 = fulfillment6222.deliveryDetails;
                deliveryDetails5222.getClass();
                String str33222 = deliveryDetails5222.dropoff_proof_image_url;
                Fulfillment fulfillment7222 = (Fulfillment) state3.getValue();
                fulfillment7222.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails6222 = fulfillment7222.deliveryDetails;
                deliveryDetails6222.getClass();
                LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver2222 = deliveryDetails6222.courier_driver;
                Fulfillment fulfillment8222 = (Fulfillment) state3.getValue();
                fulfillment8222.getClass();
                LocalFulfillment.DeliveryDetails deliveryDetails7222 = fulfillment8222.deliveryDetails;
                deliveryDetails7222.getClass();
                Boolean bool2222 = deliveryDetails7222.requires_id_verification;
                delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery(orderStatus3, str31, format6, localImage, formattedFull, gpsCoordinates4, gpsCoordinates, gpsCoordinates3, str33222, z3, str32222, deliveryCourierDriver2222, bool2222 == null ? bool2222.booleanValue() : false, access$withPrefixIfNeeded);
                gapComposer.end(false);
                break;
            case 2:
            case 3:
            case 4:
                gapComposer.startReplaceGroup(-1004580644);
                OrderStatus orderStatus6 = (OrderStatus) state2.getValue();
                LocalOrder.LocalOrderBrand localOrderBrand3 = ((LocalOrder) mutableState5.getValue()).local_order_brand;
                String str34 = (localOrderBrand3 == null || (str10 = localOrderBrand3.name) == null) ? str : str10;
                LocalOrder.LocalOrderBrand localOrderBrand4 = ((LocalOrder) mutableState5.getValue()).local_order_brand;
                LocalImage localImage2 = localOrderBrand4 != null ? localOrderBrand4.artwork_image : null;
                Iterator<T> it17 = ((LocalOrder) mutableState5.getValue()).order_summary.iterator();
                int i6 = 0;
                while (it17.hasNext()) {
                    Integer num7 = ((LocalOrder.OrderSummaryLine) it17.next()).quantity;
                    i6 += num7 != null ? num7.intValue() : 0;
                }
                Integer valueOf3 = Integer.valueOf(i6);
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("count", valueOf3);
                resources.getClass();
                String format7 = new MessageFormat(resources.getString(R.string.local_presenters_items_count)).format(arrayMap2);
                format7.getClass();
                LocalText localText2 = (LocalText) state.getValue();
                OrderStatus orderStatus7 = (OrderStatus) state2.getValue();
                Fulfillment fulfillment9 = (Fulfillment) state3.getValue();
                boolean changedInstance6 = gapComposer.changedInstance(localOrderStatusPresenter);
                Object rememberedValue18 = gapComposer.rememberedValue();
                if (changedInstance6 || rememberedValue18 == obj4) {
                    final int i7 = 2;
                    rememberedValue18 = new Function1(localOrderStatusPresenter) { // from class: app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter$$ExternalSyntheticLambda5
                        public final /* synthetic */ LocalOrderStatusPresenter f$0;

                        {
                            this.f$0 = localOrderStatusPresenter;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i42 = i7;
                            LocalOrderStatusPresenter localOrderStatusPresenter2 = this.f$0;
                            switch (i42) {
                                case 0:
                                    LocalOrder.PaymentSummary paymentSummary = (LocalOrder.PaymentSummary) obj7;
                                    paymentSummary.getClass();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(paymentSummary.card_brand);
                                    if (paymentSummary.last_4 != null) {
                                        sb2.append(' ');
                                        AndroidStringManager androidStringManager2 = localOrderStatusPresenter2.stringManager;
                                        String str302 = paymentSummary.last_4;
                                        str302.getClass();
                                        Resources resources3 = androidStringManager2.resources;
                                        resources3.getClass();
                                        String format62 = new MessageFormat(resources3.getString(R.string.local_presenters_payment_label_card_ending_with)).format(new Object[]{str302});
                                        format62.getClass();
                                        String lowerCase = format62.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        sb2.append(lowerCase);
                                    }
                                    return sb2.toString();
                                case 1:
                                    String str312 = (String) obj7;
                                    str312.getClass();
                                    Resources resources4 = localOrderStatusPresenter2.stringManager.resources;
                                    resources4.getClass();
                                    String format72 = new MessageFormat(resources4.getString(R.string.local_presenters_delivered_by)).format(new Object[]{str312});
                                    format72.getClass();
                                    return format72;
                                default:
                                    String str323 = (String) obj7;
                                    str323.getClass();
                                    Resources resources5 = localOrderStatusPresenter2.stringManager.resources;
                                    resources5.getClass();
                                    String format8 = new MessageFormat(resources5.getString(R.string.local_presenters_ready_by)).format(new Object[]{str323});
                                    format8.getClass();
                                    return format8;
                            }
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue18);
                }
                LocalText access$withPrefixIfNeeded2 = MerchantKt.access$withPrefixIfNeeded(localText2, orderStatus7, fulfillment9, (Function1) rememberedValue18);
                String formattedFull2 = LocalsKt.formattedFull(localAddress);
                GpsCoordinates gpsCoordinates5 = LocalsKt.toGpsCoordinates(localAddress);
                boolean z4 = (localPhone2 == null || (str9 = localPhone2.formatted) == null) ? false : !StringsKt.isBlank(str9);
                Fulfillment fulfillment10 = (Fulfillment) state3.getValue();
                boolean booleanValue = (fulfillment10 == null || (deliveryDetails = fulfillment10.deliveryDetails) == null || (bool = deliveryDetails.requires_id_verification) == null) ? false : bool.booleanValue();
                String str35 = ((LocalOrder) mutableState5.getValue()).instructions;
                if (((Boolean) collectAsState.getValue()).booleanValue() && areEqual) {
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        curbsideArrivalAction2 = LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.Loading.INSTANCE;
                    } else if (z2) {
                        curbsideArrivalAction2 = LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.ArrivalConfirmed.INSTANCE;
                    } else if (areEqual2) {
                        curbsideArrivalAction2 = LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.ImHere.INSTANCE;
                    } else if ((localPhone2 != null ? localPhone2.e164 : null) != null) {
                        curbsideArrivalAction2 = LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.Call.INSTANCE;
                    }
                    curbsideArrivalAction = curbsideArrivalAction2;
                    delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup(orderStatus6, str34, format7, localImage2, formattedFull2, gpsCoordinates5, z4, str35, booleanValue, access$withPrefixIfNeeded2, curbsideArrivalAction, str4);
                    gapComposer.end(false);
                    break;
                }
                curbsideArrivalAction = null;
                delivery = new LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup(orderStatus6, str34, format7, localImage2, formattedFull2, gpsCoordinates5, z4, str35, booleanValue, access$withPrefixIfNeeded2, curbsideArrivalAction, str4);
                gapComposer.end(false);
                break;
            case 5:
            case 6:
                throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, 1353120293, false, "Unexpected fulfillment type");
            default:
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1353004640, false);
        }
        LocalOrder.LoyaltySummary loyaltySummary = ((LocalOrder) mutableState5.getValue()).loyalty_summary;
        if (loyaltySummary == null || (num = loyaltySummary.accumulated_loyalty_points) == null) {
            str7 = null;
        } else {
            int intValue2 = num.intValue();
            LocalOrder.LoyaltySummary loyaltySummary2 = ((LocalOrder) mutableState5.getValue()).loyalty_summary;
            if (loyaltySummary2 == null || (localLoyaltyProgram = loyaltySummary2.loyalty_program) == null || intValue2 <= 0) {
                str8 = null;
            } else {
                Object[] objArr = {LoyaltyKt.pointsText(localLoyaltyProgram, intValue2)};
                resources.getClass();
                str8 = new MessageFormat(resources.getString(R.string.local_presenters_loyalty_points_earned)).format(objArr);
                str8.getClass();
            }
            str7 = str8;
        }
        boolean z5 = !localOrderStatusScreen.fromBlockers;
        String str36 = ((LocalOrder) mutableState5.getValue()).local_cash_earnings_label;
        String str37 = ((LocalOrder) mutableState5.getValue()).receipt_client_route;
        if (str37 == null) {
            str37 = ((LocalOrder) mutableState5.getValue()).receipt_url;
        }
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails = delivery;
        LocalOrderStatusViewModel.Loaded loaded = new LocalOrderStatusViewModel.Loaded(localOrderStatusPresenter.title, str36, str7, str37, z5, fulfillmentDetails, list, listBuilder, str3, joinToString$default2, mapDecisionSheetModel, ((Boolean) mutableState.getValue()).booleanValue(), displayMode);
        gapComposer.end(false);
        return loaded;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final LambdaProvider clipboardManager;
        public final DoubleCheck featureFlagManager;
        public final Provider launcher;
        public final DoubleCheck localOrderRepository;
        public final LambdaProvider sessionManager;
        public final LambdaProvider stringManager;

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.stringManager = lambdaProvider;
            this.clipboardManager = lambdaProvider2;
            this.launcher = metroFactory;
            this.localOrderRepository = doubleCheck;
            this.sessionManager = lambdaProvider3;
            this.analytics = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, ScoreUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
            this.localOrderRepository = doubleCheck;
            this.analytics = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.stringManager = lambdaProvider;
            this.launcher = metroFactory;
            this.clipboardManager = lambdaProvider2;
            this.sessionManager = lambdaProvider3;
        }
    }
}
