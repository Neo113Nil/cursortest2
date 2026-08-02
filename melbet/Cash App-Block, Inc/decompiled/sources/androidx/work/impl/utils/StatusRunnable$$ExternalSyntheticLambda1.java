package androidx.work.impl.utils;

import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.compose.FullScreenNode;
import app.cash.broadway.ui.compose.OrientationNode;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.GiftCardAccountNumber;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.viewmodels.AppliedCoupon;
import app.cash.local.viewmodels.AppliedGiftCard;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.CurbsidePickupCarViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationHoursContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMarketingMessagesContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchCleared;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleTypeOption;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import java.time.Instant;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes3.dex */
public final /* synthetic */ class StatusRunnable$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ StatusRunnable$$ExternalSyntheticLambda1(OrientationNode orientationNode, EnterExitState enterExitState) {
        this.$r8$classId = 4;
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
        this.f$0 = orientationNode;
        this.f$1 = enterExitState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Function0 function0;
        Function0 function02;
        YearMonth yearMonth;
        LocalImage localImage;
        String str;
        String str2;
        ZonedDateTime atZone;
        int i = this.$r8$classId;
        Pair pair = null;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) obj2;
                WorkDatabase workDatabase = workManagerImpl.mWorkDatabase;
                workDatabase.getClass();
                workDatabase.runInTransaction(new q4$$ExternalSyntheticLambda0(11, workManagerImpl, (UUID) obj));
                Schedulers.schedule(workManagerImpl.mConfiguration, workManagerImpl.mWorkDatabase, workManagerImpl.mSchedulers);
                break;
            case 2:
                WorkManagerImpl workManagerImpl2 = (WorkManagerImpl) obj2;
                WorkDatabase workDatabase2 = workManagerImpl2.mWorkDatabase;
                workDatabase2.getClass();
                workDatabase2.runInTransaction(new AFd1wSDK$$ExternalSyntheticLambda2(workDatabase2, (String) obj, workManagerImpl2));
                Schedulers.schedule(workManagerImpl2.mConfiguration, workDatabase2, workManagerImpl2.mSchedulers);
                break;
            case 3:
                FullScreenNode fullScreenNode = (FullScreenNode) obj2;
                EnterExitState enterExitState = (EnterExitState) obj;
                fullScreenNode.getClass();
                enterExitState.getClass();
                boolean z = fullScreenNode.targetVisibilityState != enterExitState;
                fullScreenNode.targetVisibilityState = enterExitState;
                if (z && (function0 = fullScreenNode.enabledChangedCallback) != null) {
                    function0.invoke();
                }
                break;
            case 4:
                OrientationNode orientationNode = (OrientationNode) obj2;
                EnterExitState enterExitState2 = (EnterExitState) obj;
                UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                orientationNode.getClass();
                enterExitState2.getClass();
                boolean z2 = orientationNode.targetVisibilityState != enterExitState2;
                orientationNode.targetVisibilityState = enterExitState2;
                if (z2 && (function02 = orientationNode.orientationChangedCallback) != null) {
                    function02.invoke();
                }
                break;
            case 5:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) localEditorialPresenter.screen;
                LocalCashActivity localCashActivity = (LocalCashActivity) ((State) obj).getValue();
                AndroidClock androidClock = (AndroidClock) localEditorialPresenter.clock;
                Instant now = DimensionKt.now(androidClock);
                ZoneId zoneId = androidClock.timeZone().toZoneId();
                zoneId.getClass();
                AndroidStringManager androidStringManager = (AndroidStringManager) localEditorialPresenter.stringManager;
                YearMonth from = YearMonth.from(now.atZone(zoneId));
                List<LocalCashActivity.Row> list = localCashActivity != null ? localCashActivity.rows : null;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (LocalCashActivity.Row row : list) {
                    String str3 = row.label;
                    if (str3 != null) {
                        Long l = row.transacted_at;
                        Instant ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : pair;
                        Long l2 = row.expires_at;
                        Instant ofEpochMilli2 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : pair;
                        boolean isBefore = ofEpochMilli2 != 0 ? ofEpochMilli2.isBefore(now) : false;
                        if (ofEpochMilli == 0 || (atZone = ofEpochMilli.atZone(zoneId)) == null || (yearMonth = YearMonth.from(atZone)) == null) {
                            yearMonth = from;
                        }
                        LocalImage localImage2 = row.image;
                        LocalColor localColor = row.background_color;
                        boolean z3 = isBefore;
                        String str4 = row.description;
                        Instant instant = ofEpochMilli;
                        if (ofEpochMilli != 0) {
                            if (z3) {
                                instant = null;
                            }
                            if (instant != null) {
                                localImage = localImage2;
                                str = AssetPublicSuffixList.formatDate$default(assetPublicSuffixList, instant, 10);
                                if (ofEpochMilli2 == 0) {
                                    ZonedDateTime atZone2 = now.atZone(zoneId);
                                    atZone2.getClass();
                                    str2 = DateTimesKt.formatExpirationDate(ofEpochMilli2, androidStringManager, assetPublicSuffixList, zoneId, atZone2);
                                } else {
                                    str2 = null;
                                }
                                pair = new Pair(yearMonth, new LocalCashBalanceViewModel.Activity.Row(localImage, str3, str4, str, str2, row.value, localColor, row.client_route));
                            }
                        }
                        localImage = localImage2;
                        str = null;
                        if (ofEpochMilli2 == 0) {
                        }
                        pair = new Pair(yearMonth, new LocalCashBalanceViewModel.Activity.Row(localImage, str3, str4, str, str2, row.value, localColor, row.client_route));
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    pair = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    YearMonth yearMonth2 = (YearMonth) pair2.first;
                    Object obj3 = linkedHashMap.get(yearMonth2);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(yearMonth2, obj3);
                    }
                    ((List) obj3).add((LocalCashBalanceViewModel.Activity.Row) pair2.second);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    YearMonth yearMonth3 = (YearMonth) entry.getKey();
                    arrayList2.add(new LocalCashAllActivityViewModel.Section(Intrinsics.areEqual(yearMonth3, from) ? androidStringManager.get(R.string.local_presenters_this_month) : yearMonth3.format((DateTimeFormatter) localEditorialPresenter.responseContextHandler), (List) entry.getValue()));
                }
                break;
            case 6:
                MutableState mutableState = (MutableState) obj;
                if (((LocalCashBalanceScreen) ((LocalCashBalancePresenter) obj2).screen).openCardManagementSheet) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 7:
                RealBrandFollowPresenter realBrandFollowPresenter = (RealBrandFollowPresenter) obj2;
                State state = (State) obj;
                if (((List) state.getValue()) != null) {
                    List list2 = (List) state.getValue();
                    list2.getClass();
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                ((MutableState) obj).setValue(Boolean.TRUE);
                ((LocalBrandLocationMenuPresenter) obj2).navigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) obj2;
                break;
            case 13:
                break;
            case 14:
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) obj;
                DeliveryQuote deliveryQuote = (DeliveryQuote) ((MutableState) obj2).getValue();
                if (deliveryQuote != null) {
                    break;
                }
                break;
            case 15:
                Function1 function1 = (Function1) obj;
                if (((LocalBrandLocationMenuViewModel) obj2).isSearching) {
                    function1.invoke(LocalSearchViewEvent$SearchCleared.INSTANCE);
                } else {
                    function1.invoke(LocalBrandLocationMenuViewEvent.BackClicked.INSTANCE);
                }
                break;
            case 16:
                ((Function1) obj2).invoke(((AppliedCoupon) obj).code);
                break;
            case 17:
                ((Function1) obj2).invoke(new GiftCardAccountNumber(((AppliedGiftCard) obj).gan));
                break;
            case 18:
                ((Function1) obj2).invoke(new PaymentMethodToken(((LocalCheckoutPaymentMethodViewModel) obj).token));
                break;
            case 19:
                ((Function1) obj2).invoke(new CurbsidePickupCarViewEvent.ColorSelected((VehicleColorOption) obj));
                break;
            case 20:
                ((Function1) obj2).invoke(new CurbsidePickupCarViewEvent.TypeSelected((VehicleTypeOption) obj));
                break;
            case 21:
                ((Function1) obj2).invoke(new LocalOpenTabCheckoutViewEvent.PaymentTimingSelected(((LocalCheckoutPaymentTimingViewModel.OptionViewModel) obj).option));
                break;
            case 22:
                LocalMenuComboDetailsViewModel.ComboSlot comboSlot = (LocalMenuComboDetailsViewModel.ComboSlot) obj;
                ((Function1) obj2).invoke(new LocalMenuComboDetailsViewEvent.CustomizeSlot(comboSlot.sectionIndex, comboSlot.token));
                break;
            case 23:
                break;
            case 24:
                ((Function1) obj2).invoke(new LocalMenuItemDetailsViewEvent.SelectModifier(((LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option) obj).token));
                break;
            case 25:
                break;
            case 26:
                ((Function1) obj2).invoke(new LocalBrandProfileViewEvent.HoursDropdownOptionClicked(((LocalBrandLocationHoursContentModel.DropdownOption) obj).fulfillmentType));
                break;
            case 27:
                ((Function1) obj2).invoke(new LocalBrandProfileViewEvent.MarketingMessageClicked(((LocalBrandLocationMarketingMessagesContentModel.Entry) obj).token));
                break;
            case 28:
                Function1 function12 = (Function1) obj2;
                LocalBrandLocationMenuContentModel.Menu menu = ((LocalBrandLocationMenuContentModel) obj).selectedMenu;
                function12.invoke(new LocalBrandProfileViewEvent.MenuCategoryClicked(menu != null ? menu.token : null, null));
                break;
            default:
                ((Function1) obj2).invoke(new LocalBrandLocationCartViewEvent.CartErrorBannerDismissed(((CreateCartErrorViewModel) obj).id));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StatusRunnable$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
