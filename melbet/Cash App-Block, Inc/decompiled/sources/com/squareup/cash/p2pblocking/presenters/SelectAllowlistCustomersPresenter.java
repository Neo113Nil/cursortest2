package com.squareup.cash.p2pblocking.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.cdf.p2pallowlist.P2PAllowListEditStart;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter;
import com.squareup.cash.p2pblocking.screens.P2PAllowlistScreen;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentRequest;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.AllowlistAction;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SelectAllowlistCustomersPresenter extends BaseAllowlistSelectionPresenter {
    public final AegisService aegisService;
    public final Analytics analytics;
    public final P2PAllowlistScreen args;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAllowlistCustomersPresenter(Analytics analytics, AndroidStringManager androidStringManager, BlocklyService blocklyService, RealInputFieldTextSaver realInputFieldTextSaver, RealProfileManager realProfileManager, AegisService aegisService, P2PAllowlistScreen p2PAllowlistScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        super(androidStringManager, blocklyService, realInputFieldTextSaver, realProfileManager, screenNavigator, AllowlistSelectionViewModel.HeaderStyle.COMPACT, p2PAllowlistScreen.forCustomerToken, p2PAllowlistScreen.firstName, p2PAllowlistScreen.limit, false, true, p2PAllowlistScreen.initialAllowlistTokens);
        p2PAllowlistScreen.getClass();
        this.analytics = analytics;
        this.aegisService = aegisService;
        this.args = p2PAllowlistScreen;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Object handleBack(Continuation continuation) {
        Screen screen = this.args.destinationScreen;
        if (screen == null) {
            screen = Back.INSTANCE;
        }
        this.navigator.goTo(screen);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Object handleContinue$1(BaseAllowlistSelectionPresenter$models$3$1 baseAllowlistSelectionPresenter$models$3$1) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleRowTap(P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation) {
        SelectAllowlistCustomersPresenter$handleRowTap$1 selectAllowlistCustomersPresenter$handleRowTap$1;
        int i;
        Integer num;
        ApiResult apiResult;
        FormattedResource formattedResource;
        if (continuation instanceof SelectAllowlistCustomersPresenter$handleRowTap$1) {
            selectAllowlistCustomersPresenter$handleRowTap$1 = (SelectAllowlistCustomersPresenter$handleRowTap$1) continuation;
            int i2 = selectAllowlistCustomersPresenter$handleRowTap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectAllowlistCustomersPresenter$handleRowTap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = selectAllowlistCustomersPresenter$handleRowTap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectAllowlistCustomersPresenter$handleRowTap$1.label;
                LinkedHashSet linkedHashSet = this.syncedCustomers;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove)) {
                        return BaseAllowlistSelectionPresenter.RowTapResult.NoChange.INSTANCE;
                    }
                    P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
                    boolean z = tapAddOrRemove.toAdd;
                    AllowlistAction allowlistAction = z ? AllowlistAction.ADD : AllowlistAction.REMOVE;
                    P2PAllowlistScreen p2PAllowlistScreen = this.args;
                    if (z && (num = p2PAllowlistScreen.limit) != null && (tapAddOrRemove.isAtLimit || linkedHashSet.size() >= num.intValue())) {
                        throw new BaseAllowlistSelectionPresenter.ExceededAllowlistLimitException(num.intValue());
                    }
                    ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = new ModifyAllowlistForDependentRequest(p2PAllowlistScreen.forCustomerToken, tapAddOrRemove.customerToken, allowlistAction);
                    selectAllowlistCustomersPresenter$handleRowTap$1.L$0 = tapAddOrRemove;
                    selectAllowlistCustomersPresenter$handleRowTap$1.L$1 = mutableState;
                    selectAllowlistCustomersPresenter$handleRowTap$1.label = 1;
                    obj = this.aegisService.modifyAllowlistForDependent(modifyAllowlistForDependentRequest, selectAllowlistCustomersPresenter$handleRowTap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = selectAllowlistCustomersPresenter$handleRowTap$1.L$1;
                    p2PListRowTapButtonEvent = selectAllowlistCustomersPresenter$handleRowTap$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove2 = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
                String str = tapAddOrRemove2.customerToken;
                String str2 = tapAddOrRemove2.customerToken;
                boolean z2 = tapAddOrRemove2.toAdd;
                this.analytics.track(new P2PAllowListEditStart(this.forCustomerToken, str, !z2 ? P2PAllowListEditStart.AllowListAction.ADD : P2PAllowListEditStart.AllowListAction.REMOVE), null);
                if (!(apiResult instanceof ApiResult.Success)) {
                    LinkedHashSet mutableSet = CollectionsKt.toMutableSet(linkedHashSet);
                    if (z2) {
                        mutableSet.add(str2);
                    } else {
                        mutableSet.remove(str2);
                    }
                    return new BaseAllowlistSelectionPresenter.RowTapResult.Success(str2, z2, true, mutableSet);
                }
                String str3 = tapAddOrRemove2.customerName;
                if (z2) {
                    str3.getClass();
                    formattedResource = new FormattedResource(R.string.allow_list_failure_dialog_title_add, new Object[]{str3});
                } else {
                    str3.getClass();
                    formattedResource = new FormattedResource(R.string.allow_list_failure_dialog_title_remove, new Object[]{str3});
                }
                AndroidStringManager androidStringManager = this.stringManager;
                mutableState.setValue(new P2PFailureDialogModel(Countries.getString(androidStringManager.resources, formattedResource), androidStringManager.get(R.string.allow_list_failure_dialog_subtitle), androidStringManager.get(R.string.allow_list_failure_dialog_button)));
                return BaseAllowlistSelectionPresenter.RowTapResult.Failure.INSTANCE;
            }
        }
        selectAllowlistCustomersPresenter$handleRowTap$1 = new SelectAllowlistCustomersPresenter$handleRowTap$1(this, (ContinuationImpl) continuation);
        Object obj2 = selectAllowlistCustomersPresenter$handleRowTap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectAllowlistCustomersPresenter$handleRowTap$1.label;
        LinkedHashSet linkedHashSet2 = this.syncedCustomers;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove22 = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
        String str4 = tapAddOrRemove22.customerToken;
        String str22 = tapAddOrRemove22.customerToken;
        boolean z22 = tapAddOrRemove22.toAdd;
        this.analytics.track(new P2PAllowListEditStart(this.forCustomerToken, str4, !z22 ? P2PAllowListEditStart.AllowListAction.ADD : P2PAllowListEditStart.AllowListAction.REMOVE), null);
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Unit handleSafetyResources() {
        return Unit.INSTANCE;
    }
}
