package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import com.squareup.cash.R;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$AllowlistToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$ApprovedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$BlockedRowClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$P2PEvent$P2PLimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.P2PControlListViewModel;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ApprovedContactsControlPresenter extends BaseDependentControlPresenter {
    public final AegisService aegis;
    public final ParcelableSnapshotMutableState allowListLimitResponse$delegate;
    public final ParcelableSnapshotMutableState allowListResponse$delegate;
    public final ParcelableSnapshotMutableState blockListResponse$delegate;
    public final BlocklyService blocklyService;
    public final MoneyFormatter moneyFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApprovedContactsControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, BlocklyService blocklyService, AegisService aegisService, LocalizedMoneyFormatter.Factory factory, DependentControlScreen.ApprovedContactsControl approvedContactsControl, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        super(baseDependentControlDependencies, approvedContactsControl, screenNavigator, coroutineScope);
        approvedContactsControl.getClass();
        this.blocklyService = blocklyService;
        this.aegis = aegisService;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.blockListResponse$delegate = Updater.mutableStateOf$default(null);
        this.allowListResponse$delegate = Updater.mutableStateOf$default(null);
        this.allowListLimitResponse$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        String str2;
        P2PControlListViewModel p2PControlListViewModel;
        List list;
        List list2;
        str.getClass();
        dependentControlStatus.getClass();
        gapComposer.startReplaceGroup(787898253);
        AndroidStringManager androidStringManager = this.deps.stringManager;
        String str3 = androidStringManager.get(R.string.family_account_dependent_payments_toggle_title);
        String str4 = androidStringManager.get(R.string.allow_list_toggle_row_title);
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.allow_list_toggle_subtitle)).format(new Object[]{str});
        format2.getClass();
        String str5 = null;
        DependentControlsToggleViewModel dependentControlsToggleViewModel = new DependentControlsToggleViewModel(str4, format2, null, !zzki.enabled(dependentControlStatus));
        GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) this.allowListResponse$delegate.getValue();
        int size = (getAllowlistForCustomerResponse == null || (list2 = getAllowlistForCustomerResponse.allowed_customers) == null) ? 0 : list2.size();
        P2PControlListViewModel p2PControlListViewModel2 = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Add.INSTANCE, androidStringManager.get(R.string.allow_list_toggle_row_approved), null, size == 0 ? androidStringManager.get(R.string.allow_list_toggle_row_add) : String.valueOf(size), size == 0, !zzki.enabled(dependentControlStatus));
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) this.blockListResponse$delegate.getValue();
        P2PControlListViewModel p2PControlListViewModel3 = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Blocked.INSTANCE, androidStringManager.get(R.string.allow_list_toggle_row_blocked), null, String.valueOf((getBlockedCustomersResponse == null || (list = getBlockedCustomersResponse.blocked_customers) == null) ? 0 : list.size()), false, true);
        DependentControlStatus.Loaded.LoadedP2PControl loadedP2PControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedP2PControl ? (DependentControlStatus.Loaded.LoadedP2PControl) dependentControlStatus : null;
        if (loadedP2PControl == null) {
            p2PControlListViewModel = null;
        } else {
            Money money = loadedP2PControl.currentLimit;
            String str6 = androidStringManager.get(R.string.allow_list_toggle_row_send_limit_title);
            Money money2 = loadedP2PControl.remainingUsage;
            MoneyFormatter moneyFormatter = this.moneyFormatter;
            if (money2 != null) {
                String format3 = moneyFormatter.format(money2);
                format3.getClass();
                resources.getClass();
                str5 = new MessageFormat(resources.getString(R.string.family_account_dependent_limits_subtitle)).format(new Object[]{format3});
                str5.getClass();
            }
            String str7 = str5;
            if (money == null || (str2 = moneyFormatter.format(money)) == null) {
                str2 = androidStringManager.get(R.string.allow_list_toggle_row_send_limit_not_set);
            }
            p2PControlListViewModel = new P2PControlListViewModel(P2PControlListViewModel.AllowlistRowActionType.Limit.INSTANCE, str6, str7, str2, money == null, true);
        }
        DependentControlViewModel.ApprovedContacts approvedContacts = new DependentControlViewModel.ApprovedContacts(str3, dependentControlsToggleViewModel, p2PControlListViewModel2, p2PControlListViewModel3, p2PControlListViewModel);
        gapComposer.end(false);
        return approvedContacts;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        return ControlType.P2P;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleApprovedRowClicked(String str, ContinuationImpl continuationImpl) {
        ApprovedContactsControlPresenter$handleApprovedRowClicked$1 approvedContactsControlPresenter$handleApprovedRowClicked$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ApprovedContactsControlPresenter$handleApprovedRowClicked$1) {
            approvedContactsControlPresenter$handleApprovedRowClicked$1 = (ApprovedContactsControlPresenter$handleApprovedRowClicked$1) continuationImpl;
            int i2 = approvedContactsControlPresenter$handleApprovedRowClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                approvedContactsControlPresenter$handleApprovedRowClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = approvedContactsControlPresenter$handleApprovedRowClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = approvedContactsControlPresenter$handleApprovedRowClicked$1.label;
                DependentControlScreen dependentControlScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest(((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken);
                    approvedContactsControlPresenter$handleApprovedRowClicked$1.L$1 = str;
                    approvedContactsControlPresenter$handleApprovedRowClicked$1.label = 1;
                    obj = this.blocklyService.getAllowlistForCustomer(getAllowlistForCustomerRequest, approvedContactsControlPresenter$handleApprovedRowClicked$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = approvedContactsControlPresenter$handleApprovedRowClicked$1.L$1;
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
                        String str3 = ((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken;
                        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) parcelableSnapshotMutableState.getValue();
                        screenNavigator.goTo(new P2PAllowlistScreen(str3, str2, getAllowlistLimitForDependentResponse != null ? getAllowlistLimitForDependentResponse.allowlist_limit : null, EmptySet.INSTANCE, null));
                    } else {
                        String str4 = ((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken;
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
        approvedContactsControlPresenter$handleApprovedRowClicked$1 = new ApprovedContactsControlPresenter$handleApprovedRowClicked$1(this, continuationImpl);
        Object obj3 = approvedContactsControlPresenter$handleApprovedRowClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = approvedContactsControlPresenter$handleApprovedRowClicked$1.label;
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
    public final Object handleBlockedRowClicked(ContinuationImpl continuationImpl) {
        ApprovedContactsControlPresenter$handleBlockedRowClicked$1 approvedContactsControlPresenter$handleBlockedRowClicked$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ApprovedContactsControlPresenter$handleBlockedRowClicked$1) {
            approvedContactsControlPresenter$handleBlockedRowClicked$1 = (ApprovedContactsControlPresenter$handleBlockedRowClicked$1) continuationImpl;
            int i2 = approvedContactsControlPresenter$handleBlockedRowClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                approvedContactsControlPresenter$handleBlockedRowClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = approvedContactsControlPresenter$handleBlockedRowClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = approvedContactsControlPresenter$handleBlockedRowClicked$1.label;
                DependentControlScreen dependentControlScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest(((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken, BlockingContext.FAMILY_BLOCKLIST);
                    approvedContactsControlPresenter$handleBlockedRowClicked$1.label = 1;
                    obj = this.blocklyService.getBlockedCustomers(getBlockedCustomersRequest, approvedContactsControlPresenter$handleBlockedRowClicked$1);
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
                    String str = ((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken;
                    GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) ((ApiResult.Success) apiResult).response;
                    getBlockedCustomersResponse.getClass();
                    List list = getBlockedCustomersResponse.blocked_customers;
                    BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
                    this.navigator.goTo(new P2PListScreen(str, new P2PListData.BlockListData(list, blocklistDetails != null ? blocklistDetails.support_page_client_route_url : null), P2PScreenMode.BlockList.INSTANCE, BlockingContext.FAMILY_BLOCKLIST));
                }
                return Unit.INSTANCE;
            }
        }
        approvedContactsControlPresenter$handleBlockedRowClicked$1 = new ApprovedContactsControlPresenter$handleBlockedRowClicked$1(this, continuationImpl);
        Object obj2 = approvedContactsControlPresenter$handleBlockedRowClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = approvedContactsControlPresenter$handleBlockedRowClicked$1.label;
        DependentControlScreen dependentControlScreen2 = this.args;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        Object obj;
        boolean z = dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$AllowlistToggleChanged;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        DependentControlScreen dependentControlScreen = this.args;
        if (z) {
            boolean z2 = ((DependentControlViewEvent$P2PEvent$AllowlistToggleChanged) dependentControlViewEvent).enable;
            if (!z2) {
                this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.P2PTransactions, ToggleValue.Enabled, ((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken), null);
                obj = getControlStatusManager().setDependentControlStatus(true, realFidesmoClient$observeDeviceState$1);
                if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = Unit.INSTANCE;
                }
            } else {
                if (!z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.askQuestion(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE, new ProfileQueries$$ExternalSyntheticLambda13(24, this, str));
                obj = Unit.INSTANCE;
            }
            return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
        }
        if (dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$ApprovedRowClicked) {
            Object handleApprovedRowClicked = handleApprovedRowClicked(str, realFidesmoClient$observeDeviceState$1);
            return handleApprovedRowClicked == CoroutineSingletons.COROUTINE_SUSPENDED ? handleApprovedRowClicked : Unit.INSTANCE;
        }
        if (dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$BlockedRowClicked) {
            Object handleBlockedRowClicked = handleBlockedRowClicked(realFidesmoClient$observeDeviceState$1);
            return handleBlockedRowClicked == CoroutineSingletons.COROUTINE_SUSPENDED ? handleBlockedRowClicked : Unit.INSTANCE;
        }
        if (dependentControlViewEvent instanceof DependentControlViewEvent$P2PEvent$P2PLimitClicked) {
            DependentControlStatus.Loaded.LoadedP2PControl loadedP2PControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedP2PControl ? (DependentControlStatus.Loaded.LoadedP2PControl) dependentControlStatus : null;
            if (loadedP2PControl != null) {
                List list = loadedP2PControl.limitPresets;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Long l = ((Money) it.next()).amount;
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                String str2 = ((DependentControlScreen.ApprovedContactsControl) dependentControlScreen).dependentCustomerToken;
                Money money = loadedP2PControl.currentLimit;
                Long l2 = loadedP2PControl.maxLimit.amount;
                screenNavigator.goTo(new SetDependentCustomLimitScreen(str2, new SetDependentCustomLimitScreen.LimitCategory.P2PSend(money, arrayList, l2 != null ? l2.longValue() : 250000L, str), ControlType.P2P));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object onInitialize(Continuation continuation) {
        Continuation continuation2 = null;
        ApprovedContactsControlPresenter$onInitialize$2 approvedContactsControlPresenter$onInitialize$2 = new ApprovedContactsControlPresenter$onInitialize$2(this, continuation2, 0);
        CoroutineScope coroutineScope = this.sandboxedScope;
        JobKt.launch$default(coroutineScope, null, null, approvedContactsControlPresenter$onInitialize$2, 3);
        JobKt.launch$default(coroutineScope, null, null, new ApprovedContactsControlPresenter$onInitialize$2(this, continuation2, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new ApprovedContactsControlPresenter$onInitialize$2(this, continuation2, 2), 3);
        return Unit.INSTANCE;
    }
}
