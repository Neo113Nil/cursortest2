package com.squareup.cash.p2pblocking.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersRequest;
import com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SelectAllowlistBlockerPresenter extends BaseAllowlistSelectionPresenter {
    public final AegisService aegisService;
    public final BlockersScreens.SelectAllowlistCustomerBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final boolean confirmsBack;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectAllowlistBlockerPresenter(AndroidStringManager androidStringManager, BlocklyService blocklyService, RealInputFieldTextSaver realInputFieldTextSaver, RealProfileManager realProfileManager, BlockersScreens.SelectAllowlistCustomerBlockerScreen selectAllowlistCustomerBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator, AegisService aegisService, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl) {
        super(androidStringManager, blocklyService, realInputFieldTextSaver, realProfileManager, screenNavigator, r9 == null ? AllowlistSelectionViewModel.HeaderStyle.COMPACT : AllowlistSelectionViewModel.HeaderStyle.EXPANDED, selectAllowlistCustomerBlockerScreen.forCustomerToken, selectAllowlistCustomerBlockerScreen.firstName, r9, true, !((r9 == null || r9.intValue() <= 0 || r14 == null) ? false : true), EmptySet.INSTANCE);
        selectAllowlistCustomerBlockerScreen.getClass();
        String str = selectAllowlistCustomerBlockerScreen.firstName;
        Integer num = selectAllowlistCustomerBlockerScreen.limit;
        boolean z = false;
        this.args = selectAllowlistCustomerBlockerScreen;
        this.aegisService = aegisService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        Integer num2 = selectAllowlistCustomerBlockerScreen.limit;
        if (num2 != null && num2.intValue() > 0 && str != null) {
            z = true;
        }
        this.confirmsBack = z;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final boolean getConfirmsBack() {
        return this.confirmsBack;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBack(Continuation continuation) {
        SelectAllowlistBlockerPresenter$handleBack$1 selectAllowlistBlockerPresenter$handleBack$1;
        int i;
        if (continuation instanceof SelectAllowlistBlockerPresenter$handleBack$1) {
            selectAllowlistBlockerPresenter$handleBack$1 = (SelectAllowlistBlockerPresenter$handleBack$1) continuation;
            int i2 = selectAllowlistBlockerPresenter$handleBack$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectAllowlistBlockerPresenter$handleBack$1.label = i2 - PKIFailureInfo.systemUnavail;
                SelectAllowlistBlockerPresenter$handleBack$1 selectAllowlistBlockerPresenter$handleBack$12 = selectAllowlistBlockerPresenter$handleBack$1;
                Object obj = selectAllowlistBlockerPresenter$handleBack$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectAllowlistBlockerPresenter$handleBack$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersScreens.SelectAllowlistCustomerBlockerScreen selectAllowlistCustomerBlockerScreen = this.args;
                    BlockerAction blockerAction = selectAllowlistCustomerBlockerScreen.backAction;
                    if (blockerAction != null) {
                        selectAllowlistBlockerPresenter$handleBack$12.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(this.blockersHelper, blockerAction, selectAllowlistCustomerBlockerScreen, null, null, false, null, null, selectAllowlistBlockerPresenter$handleBack$12, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        this.navigator.goTo(Back.INSTANCE);
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        selectAllowlistBlockerPresenter$handleBack$1 = new SelectAllowlistBlockerPresenter$handleBack$1(this, (ContinuationImpl) continuation);
        SelectAllowlistBlockerPresenter$handleBack$1 selectAllowlistBlockerPresenter$handleBack$122 = selectAllowlistBlockerPresenter$handleBack$1;
        Object obj2 = selectAllowlistBlockerPresenter$handleBack$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectAllowlistBlockerPresenter$handleBack$122.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Object handleConfirmBack(BaseAllowlistSelectionPresenter$models$3$1 baseAllowlistSelectionPresenter$models$3$1) {
        Object handleBack = handleBack(baseAllowlistSelectionPresenter$models$3$1);
        return handleBack == CoroutineSingletons.COROUTINE_SUSPENDED ? handleBack : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Object handleContinue$1(BaseAllowlistSelectionPresenter$models$3$1 baseAllowlistSelectionPresenter$models$3$1) {
        Object submitAllowlistCustomers = submitAllowlistCustomers(baseAllowlistSelectionPresenter$models$3$1);
        return submitAllowlistCustomers == CoroutineSingletons.COROUTINE_SUSPENDED ? submitAllowlistCustomers : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Object handleRowTap(P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation) {
        if (!(p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove)) {
            return BaseAllowlistSelectionPresenter.RowTapResult.NoChange.INSTANCE;
        }
        P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent;
        String str = tapAddOrRemove.customerToken;
        LinkedHashMap linkedHashMap = this.pendingChanges;
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.remove(str);
        } else {
            Integer num = this.args.limit;
            if (num != null) {
                if (num.intValue() <= linkedHashMap.size() + this.syncedCustomers.size()) {
                    throw new BaseAllowlistSelectionPresenter.ExceededAllowlistLimitException(num.intValue());
                }
            }
            linkedHashMap.put(str, tapAddOrRemove.allowlistCustomer);
        }
        return new BaseAllowlistSelectionPresenter.RowTapResult.Success(str, tapAddOrRemove.toAdd, false, EmptySet.INSTANCE);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter
    public final Unit handleSafetyResources() {
        this.navigator.goTo(SafetyHubScreens.SafetyHubScreen.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitAllowlistCustomers(ContinuationImpl continuationImpl) {
        SelectAllowlistBlockerPresenter$submitAllowlistCustomers$1 selectAllowlistBlockerPresenter$submitAllowlistCustomers$1;
        int i;
        boolean z;
        if (continuationImpl instanceof SelectAllowlistBlockerPresenter$submitAllowlistCustomers$1) {
            selectAllowlistBlockerPresenter$submitAllowlistCustomers$1 = (SelectAllowlistBlockerPresenter$submitAllowlistCustomers$1) continuationImpl;
            int i2 = selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.label;
                BlockersScreens.SelectAllowlistCustomerBlockerScreen selectAllowlistCustomerBlockerScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = CollectionsKt.toList(this.pendingChanges.keySet());
                    BlockersData blockersData = selectAllowlistCustomerBlockerScreen.blockersData;
                    BlockersData blockersData2 = selectAllowlistCustomerBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData2.flowToken;
                    SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = new SelectAllowlistCustomersRequest(blockersData2.requestContext, list, ByteString.EMPTY);
                    selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.label = 1;
                    obj = this.aegisService.selectAllowlistCustomers(clientScenario, str, selectAllowlistCustomersRequest, selectAllowlistBlockerPresenter$submitAllowlistCustomers$1);
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
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (!z) {
                    BlockersData blockersData3 = selectAllowlistCustomerBlockerScreen.blockersData;
                    ResponseContext responseContext = ((SelectAllowlistCustomersResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    Screen next = this.blockersDataNavigator.getNext(selectAllowlistCustomerBlockerScreen, blockersData3.updateFromResponseContext(responseContext, false));
                    if (BlockersScreens.SelectAllowlistCustomerBlockerScreen.class != next.getClass()) {
                        screenNavigator.goTo(next);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, selectAllowlistCustomerBlockerScreen, this.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        selectAllowlistBlockerPresenter$submitAllowlistCustomers$1 = new SelectAllowlistBlockerPresenter$submitAllowlistCustomers$1(this, continuationImpl);
        Object obj2 = selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectAllowlistBlockerPresenter$submitAllowlistCustomers$1.label;
        BlockersScreens.SelectAllowlistCustomerBlockerScreen selectAllowlistCustomerBlockerScreen2 = this.args;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (!z) {
        }
        return Unit.INSTANCE;
    }
}
