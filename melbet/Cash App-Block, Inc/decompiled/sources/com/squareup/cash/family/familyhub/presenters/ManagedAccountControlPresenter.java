package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$ApprovedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$BlockedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.P2PControlListViewModel;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.p2pblocking.screens.P2PAllowlistScreen;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ManagedAccountControlPresenter extends BaseDependentControlPresenter {
    public final AegisService aegis;
    public final ParcelableSnapshotMutableState allowListLimitResponse$delegate;
    public final ParcelableSnapshotMutableState allowListResponse$delegate;
    public final ParcelableSnapshotMutableState blockListResponse$delegate;
    public final BlocklyService blocklyService;
    public final RealFamilyProfileManager familyProfileManager;
    public final MoneyFormatter moneyFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedAccountControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, BlocklyService blocklyService, AegisService aegisService, RealFamilyProfileManager realFamilyProfileManager, LocalizedMoneyFormatter.Factory factory, DependentControlScreen.ManagedAccount managedAccount, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        super(baseDependentControlDependencies, managedAccount, screenNavigator, coroutineScope);
        managedAccount.getClass();
        this.blocklyService = blocklyService;
        this.aegis = aegisService;
        this.familyProfileManager = realFamilyProfileManager;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.blockListResponse$delegate = Updater.mutableStateOf$default(null);
        this.allowListResponse$delegate = Updater.mutableStateOf$default(null);
        this.allowListLimitResponse$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl;
        String str2;
        String str3;
        String str4;
        P2PControlListViewModel p2PControlListViewModel;
        List list;
        Integer num;
        List list2;
        str.getClass();
        dependentControlStatus.getClass();
        gapComposer.startReplaceGroup(338153321);
        if (dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedCardControl) {
            loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) dependentControlStatus;
        } else if (dependentControlStatus instanceof DependentControlStatus.Updating) {
            DependentControlStatus.Loaded loaded = ((DependentControlStatus.Updating) dependentControlStatus).previousLoaded;
            if (loaded instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded;
            }
            loadedCardControl = null;
        } else {
            if (dependentControlStatus instanceof DependentControlStatus.Error) {
                DependentControlStatus.Loaded loaded2 = ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
                if (loaded2 instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                    loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded2;
                }
            }
            loadedCardControl = null;
        }
        boolean z = loadedCardControl != null ? loadedCardControl.isActivated : false;
        AndroidStringManager androidStringManager = this.deps.stringManager;
        Resources resources = androidStringManager.resources;
        String str5 = androidStringManager.get(R.string.family_account_dependent_controls_and_limits_screen_toolbar_title_managed_account);
        String str6 = androidStringManager.get(R.string.family_account_managed_account_receive_money_section_title);
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.family_account_managed_account_receive_money_body)).format(new Object[]{str});
        format2.getClass();
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) this.allowListResponse$delegate.getValue();
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) this.allowListLimitResponse$delegate.getValue();
        int size = (getAllowlistForCustomerResponse == null || (list2 = getAllowlistForCustomerResponse.allowed_customers) == null) ? 0 : list2.size();
        if (getAllowlistLimitForDependentResponse == null || (num = getAllowlistLimitForDependentResponse.allowlist_limit) == null) {
            str2 = null;
        } else {
            int intValue = num.intValue();
            Object[] objArr = {str, Integer.valueOf(intValue)};
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.allow_list_toggle_row_approved_limit_subtitle)).format(objArr);
            format3.getClass();
            if (intValue > size) {
                format3 = null;
            }
            str2 = format3;
        }
        P2PControlListViewModel p2PControlListViewModel2 = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Add.INSTANCE, androidStringManager.get(R.string.allow_list_toggle_row_approved), str2, String.valueOf(size), false, true);
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) this.blockListResponse$delegate.getValue();
        P2PControlListViewModel p2PControlListViewModel3 = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Blocked.INSTANCE, androidStringManager.get(R.string.allow_list_toggle_row_blocked), null, String.valueOf((getBlockedCustomersResponse == null || (list = getBlockedCustomersResponse.blocked_customers) == null) ? 0 : list.size()), false, true);
        String str7 = z ? androidStringManager.get(R.string.family_account_managed_account_cash_card_section_title) : null;
        boolean z2 = z;
        DependentControlsToggleViewModel dependentControlsToggleViewModel = new DependentControlsToggleViewModel(androidStringManager.get(R.string.family_account_managed_account_cash_card_toggle_title), androidStringManager.get(R.string.family_account_managed_account_cash_card_toggle_subtitle), Integer.valueOf(R.drawable.icon_card_basic_16), loadedCardControl != null ? loadedCardControl.controlEnabled : false);
        if (!z2) {
            dependentControlsToggleViewModel = null;
        }
        if (loadedCardControl == null) {
            p2PControlListViewModel = null;
        } else {
            Money money = loadedCardControl.currentLimit;
            String str8 = androidStringManager.get(R.string.family_account_dependent_limits_title);
            Money money2 = loadedCardControl.remainingUsage;
            MoneyFormatter moneyFormatter = this.moneyFormatter;
            if (money2 != null) {
                String format4 = moneyFormatter.format(money2);
                format4.getClass();
                resources.getClass();
                String format5 = new MessageFormat(resources.getString(R.string.family_account_dependent_limits_subtitle)).format(new Object[]{format4});
                format5.getClass();
                str3 = format5;
            } else {
                str3 = null;
            }
            if (money == null || (str4 = moneyFormatter.format(money)) == null) {
                str4 = androidStringManager.get(R.string.allow_list_toggle_row_send_limit_not_set);
            }
            p2PControlListViewModel = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Limit.INSTANCE, str8, str3, str4, money == null, true);
        }
        P2PControlListViewModel p2PControlListViewModel4 = (p2PControlListViewModel == null || !z2) ? null : p2PControlListViewModel;
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("link", "https://internal.cash.app/dl/view/support/FAMILIES_LIMITS");
        resources.getClass();
        String format6 = new MessageFormat(resources.getString(R.string.family_account_managed_account_controls_footer)).format(arrayMap);
        format6.getClass();
        DependentControlViewModel.ManagedAccount managedAccount = new DependentControlViewModel.ManagedAccount(str5, str6, format2, p2PControlListViewModel2, p2PControlListViewModel3, str7, dependentControlsToggleViewModel, p2PControlListViewModel4, format6);
        gapComposer.end(false);
        return managedAccount;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Flow dependentFirstName() {
        return FlowKt.transformLatest(this.familyProfileManager.familyProfile, new AnchoredDraggableNode$drag$2(null, this, 17));
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        return ControlType.CASH_CARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleApprovedRowClicked$1(String str, ContinuationImpl continuationImpl) {
        ManagedAccountControlPresenter$handleApprovedRowClicked$1 managedAccountControlPresenter$handleApprovedRowClicked$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ManagedAccountControlPresenter$handleApprovedRowClicked$1) {
            managedAccountControlPresenter$handleApprovedRowClicked$1 = (ManagedAccountControlPresenter$handleApprovedRowClicked$1) continuationImpl;
            int i2 = managedAccountControlPresenter$handleApprovedRowClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                managedAccountControlPresenter$handleApprovedRowClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = managedAccountControlPresenter$handleApprovedRowClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managedAccountControlPresenter$handleApprovedRowClicked$1.label;
                DependentControlScreen dependentControlScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest(((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken);
                    managedAccountControlPresenter$handleApprovedRowClicked$1.L$0 = str;
                    managedAccountControlPresenter$handleApprovedRowClicked$1.label = 1;
                    obj = this.blocklyService.getAllowlistForCustomer(getAllowlistForCustomerRequest, managedAccountControlPresenter$handleApprovedRowClicked$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = managedAccountControlPresenter$handleApprovedRowClicked$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = str;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) ((ApiResult.Success) apiResult).response;
                    boolean isEmpty = getAllowlistForCustomerResponse.allowed_customers.isEmpty();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.allowListLimitResponse$delegate;
                    BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                    if (isEmpty) {
                        String str3 = ((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken;
                        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) parcelableSnapshotMutableState.getValue();
                        screenNavigator.goTo(new P2PAllowlistScreen(str3, str2, getAllowlistLimitForDependentResponse != null ? getAllowlistLimitForDependentResponse.allowlist_limit : null, EmptySet.INSTANCE, null));
                    } else {
                        String str4 = ((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken;
                        List list = getAllowlistForCustomerResponse.allowed_customers;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (Intrinsics.areEqual(((AllowlistCustomer) obj2).is_in_allowlist, Boolean.TRUE)) {
                                arrayList.add(obj2);
                            }
                        }
                        P2PListData.AllowListData allowListData = new P2PListData.AllowListData(arrayList);
                        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse2 = (GetAllowlistLimitForDependentResponse) parcelableSnapshotMutableState.getValue();
                        screenNavigator.goTo(new P2PListScreen(str4, allowListData, new P2PScreenMode.AllowList(getAllowlistLimitForDependentResponse2 != null ? getAllowlistLimitForDependentResponse2.allowlist_limit : null), null));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        managedAccountControlPresenter$handleApprovedRowClicked$1 = new ManagedAccountControlPresenter$handleApprovedRowClicked$1(this, continuationImpl);
        Object obj3 = managedAccountControlPresenter$handleApprovedRowClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managedAccountControlPresenter$handleApprovedRowClicked$1.label;
        DependentControlScreen dependentControlScreen2 = this.args;
        if (i != 0) {
        }
        String str22 = str;
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBlockedRowClicked$1(ContinuationImpl continuationImpl) {
        ManagedAccountControlPresenter$handleBlockedRowClicked$1 managedAccountControlPresenter$handleBlockedRowClicked$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ManagedAccountControlPresenter$handleBlockedRowClicked$1) {
            managedAccountControlPresenter$handleBlockedRowClicked$1 = (ManagedAccountControlPresenter$handleBlockedRowClicked$1) continuationImpl;
            int i2 = managedAccountControlPresenter$handleBlockedRowClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                managedAccountControlPresenter$handleBlockedRowClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = managedAccountControlPresenter$handleBlockedRowClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managedAccountControlPresenter$handleBlockedRowClicked$1.label;
                DependentControlScreen dependentControlScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest(((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken, BlockingContext.FAMILY_BLOCKLIST);
                    managedAccountControlPresenter$handleBlockedRowClicked$1.label = 1;
                    obj = this.blocklyService.getBlockedCustomers(getBlockedCustomersRequest, managedAccountControlPresenter$handleBlockedRowClicked$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    String str = ((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken;
                    GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) ((ApiResult.Success) apiResult).response;
                    getBlockedCustomersResponse.getClass();
                    List list = getBlockedCustomersResponse.blocked_customers;
                    BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
                    this.navigator.goTo(new P2PListScreen(str, new P2PListData.BlockListData(list, blocklistDetails != null ? blocklistDetails.support_page_client_route_url : null), P2PScreenMode.BlockList.INSTANCE, BlockingContext.FAMILY_BLOCKLIST));
                }
                return Unit.INSTANCE;
            }
        }
        managedAccountControlPresenter$handleBlockedRowClicked$1 = new ManagedAccountControlPresenter$handleBlockedRowClicked$1(this, continuationImpl);
        Object obj2 = managedAccountControlPresenter$handleBlockedRowClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managedAccountControlPresenter$handleBlockedRowClicked$1.label;
        DependentControlScreen dependentControlScreen2 = this.args;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleConfirmDisabling(BaseDependentControlPresenter$models$3$1 baseDependentControlPresenter$models$3$1) {
        this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.CashCard, ToggleValue.Disabled, ((DependentControlScreen.ManagedAccount) this.args).dependentCustomerToken), null);
        Object dependentControlStatus = getControlStatusManager().setDependentControlStatus(false, baseDependentControlPresenter$models$3$1);
        return dependentControlStatus == CoroutineSingletons.COROUTINE_SUSPENDED ? dependentControlStatus : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        Long l;
        Object obj;
        if (dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$ApprovedRowClicked) {
            Object handleApprovedRowClicked$1 = handleApprovedRowClicked$1(str, realFidesmoClient$observeDeviceState$1);
            return handleApprovedRowClicked$1 == CoroutineSingletons.COROUTINE_SUSPENDED ? handleApprovedRowClicked$1 : Unit.INSTANCE;
        }
        if (dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$BlockedRowClicked) {
            Object handleBlockedRowClicked$1 = handleBlockedRowClicked$1(realFidesmoClient$observeDeviceState$1);
            return handleBlockedRowClicked$1 == CoroutineSingletons.COROUTINE_SUSPENDED ? handleBlockedRowClicked$1 : Unit.INSTANCE;
        }
        boolean z = dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        DependentControlScreen dependentControlScreen = this.args;
        DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = null;
        if (z) {
            DependentControlViewEvent$ToggleEvent$ToggleChanged dependentControlViewEvent$ToggleEvent$ToggleChanged = (DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent;
            if (dependentControlViewEvent$ToggleEvent$ToggleChanged.controlType == ControlType.CASH_CARD) {
                boolean z2 = dependentControlViewEvent$ToggleEvent$ToggleChanged.enabled;
                if (z2) {
                    this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.CashCard, ToggleValue.Enabled, ((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken), null);
                    obj = getControlStatusManager().setDependentControlStatus(true, realFidesmoClient$observeDeviceState$1);
                    if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    if (z2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.askQuestion(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE, new ProfileQueries$$ExternalSyntheticLambda13(27, this, str));
                    obj = Unit.INSTANCE;
                }
                return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
            }
        } else if ((dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) && ((DependentControlViewEvent$ToggleEvent$LimitClicked) dependentControlViewEvent).controlType == ControlType.CASH_CARD) {
            if (dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) dependentControlStatus;
            } else if (dependentControlStatus instanceof DependentControlStatus.Updating) {
                DependentControlStatus.Loaded loaded = ((DependentControlStatus.Updating) dependentControlStatus).previousLoaded;
                if (loaded instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                    loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded;
                }
            } else if (dependentControlStatus instanceof DependentControlStatus.Error) {
                DependentControlStatus.Loaded loaded2 = ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
                if (loaded2 instanceof DependentControlStatus.Loaded.LoadedCardControl) {
                    loadedCardControl = (DependentControlStatus.Loaded.LoadedCardControl) loaded2;
                }
            }
            if (loadedCardControl != null) {
                String str2 = ((DependentControlScreen.ManagedAccount) dependentControlScreen).dependentCustomerToken;
                Money money = loadedCardControl.currentLimit;
                List list = loadedCardControl.limitPresets;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Long l2 = ((Money) it.next()).amount;
                    if (l2 != null) {
                        arrayList.add(l2);
                    }
                }
                Money money2 = loadedCardControl.maxLimit;
                screenNavigator.goTo(new SetDependentCustomLimitScreen(str2, new SetDependentCustomLimitScreen.LimitCategory.CashCardSpend(money, arrayList, (money2 == null || (l = money2.amount) == null) ? 250000L : l.longValue(), str), ControlType.CASH_CARD));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onInitialize(Continuation continuation) {
        ManagedAccountControlPresenter$onInitialize$1 managedAccountControlPresenter$onInitialize$1;
        int i;
        if (continuation instanceof ManagedAccountControlPresenter$onInitialize$1) {
            managedAccountControlPresenter$onInitialize$1 = (ManagedAccountControlPresenter$onInitialize$1) continuation;
            int i2 = managedAccountControlPresenter$onInitialize$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                managedAccountControlPresenter$onInitialize$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = managedAccountControlPresenter$onInitialize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managedAccountControlPresenter$onInitialize$1.label;
                Continuation continuation2 = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager controlStatusManager = getControlStatusManager();
                    managedAccountControlPresenter$onInitialize$1.label = 1;
                    if (controlStatusManager.getDependentControlStatus(true, managedAccountControlPresenter$onInitialize$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ManagedAccountControlPresenter$onInitialize$2 managedAccountControlPresenter$onInitialize$2 = new ManagedAccountControlPresenter$onInitialize$2(this, continuation2, 0);
                CoroutineScope coroutineScope = this.sandboxedScope;
                JobKt.launch$default(coroutineScope, null, null, managedAccountControlPresenter$onInitialize$2, 3);
                JobKt.launch$default(coroutineScope, null, null, new ManagedAccountControlPresenter$onInitialize$2(this, continuation2, i3), 3);
                JobKt.launch$default(coroutineScope, null, null, new ManagedAccountControlPresenter$onInitialize$2(this, continuation2, 2), 3);
                return Unit.INSTANCE;
            }
        }
        managedAccountControlPresenter$onInitialize$1 = new ManagedAccountControlPresenter$onInitialize$1(this, (ContinuationImpl) continuation);
        Object obj2 = managedAccountControlPresenter$onInitialize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managedAccountControlPresenter$onInitialize$1.label;
        Continuation continuation22 = null;
        int i32 = 1;
        if (i != 0) {
        }
        ManagedAccountControlPresenter$onInitialize$2 managedAccountControlPresenter$onInitialize$22 = new ManagedAccountControlPresenter$onInitialize$2(this, continuation22, 0);
        CoroutineScope coroutineScope2 = this.sandboxedScope;
        JobKt.launch$default(coroutineScope2, null, null, managedAccountControlPresenter$onInitialize$22, 3);
        JobKt.launch$default(coroutineScope2, null, null, new ManagedAccountControlPresenter$onInitialize$2(this, continuation22, i32), 3);
        JobKt.launch$default(coroutineScope2, null, null, new ManagedAccountControlPresenter$onInitialize$2(this, continuation22, 2), 3);
        return Unit.INSTANCE;
    }
}
