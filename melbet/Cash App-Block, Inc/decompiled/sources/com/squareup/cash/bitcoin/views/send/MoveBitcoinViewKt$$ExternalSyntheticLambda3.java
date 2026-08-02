package com.squareup.cash.bitcoin.views.send;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.Lifecycle;
import app.cash.api.ApiResult;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.presenters.InstrumentSelectionListSheetPresenter;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer$transform$1$2$WhenMappings;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.app.SetCashtagResponse;
import com.squareup.protos.franklin.app.SetFullNameResponse;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.util.Strings;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class MoveBitcoinViewKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl);
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 2:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                return Unit.INSTANCE;
            case 4:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl2);
            case 5:
                StablecoinDepositOptionsViewModel.NetworkRow networkRow = (StablecoinDepositOptionsViewModel.NetworkRow) obj;
                networkRow.getClass();
                return networkRow.network.chain;
            case 6:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl3);
            case 7:
                ((ApiResult.Success) obj).getClass();
                return null;
            case 8:
                ((ApiResult.Success) obj).getClass();
                return null;
            case 9:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("multiBlockerRequests");
                return Unit.INSTANCE;
            case 10:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("multiBlockerRequests");
                return Unit.INSTANCE;
            case 11:
                SetCashtagResponse setCashtagResponse = (SetCashtagResponse) ((ApiResult.Success) obj).response;
                SetCashtagResponse.Status status = setCashtagResponse.status;
                ResponseContext responseContext = setCashtagResponse.response_context;
                if (status == null) {
                    status = ProtoDefaults.SET_CASHTAG_STATUS;
                }
                if (status != SetCashtagResponse.Status.FAILURE && status != SetCashtagResponse.Status.CASHTAG_STATUS_FAILURE) {
                    if (status != SetCashtagResponse.Status.SUCCESS) {
                        return null;
                    }
                    String str = responseContext != null ? responseContext.dialog_message : null;
                    if (str == null || str.length() == 0) {
                        return null;
                    }
                }
                SetCashtagResponse.Status status2 = setCashtagResponse.status;
                return new BlockerResponse.Error(status2 != null ? status2.name() : null, responseContext != null ? responseContext.dialog_message : null, 4);
            case 12:
                ConfirmPaymentResponse.Status status3 = ((ConfirmPaymentResponse) ((ApiResult.Success) obj).response).status;
                if (status3 == null) {
                    status3 = ProtoDefaults.CONFIRM_PAYMENT_STATUS;
                }
                int ordinal = status3.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return null;
                    }
                    if (ordinal != 2 && ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return new BlockerResponse.Error(status3.name(), (String) null, 6);
            case 13:
                ApiResult.Success success = (ApiResult.Success) obj;
                success.getClass();
                String str2 = ((ResponseContext) success.response).failure_message;
                if (str2 != null) {
                    return new BlockerResponse.Error((String) null, str2, 5);
                }
                return null;
            case 14:
                InstrumentSelectionData.InstrumentOption instrumentOption = (InstrumentSelectionData.InstrumentOption) obj;
                instrumentOption.getClass();
                return InstrumentSelectionListSheetPresenter.toAnalyticsAction(instrumentOption).name();
            case 15:
                ConfirmPasscodeResponse.Status status4 = ((ConfirmPasscodeResponse) ((ApiResult.Success) obj).response).status;
                if (status4 == null) {
                    status4 = ProtoDefaults.CONFIRM_PASSCODE_STATUS;
                }
                if (PasscodeConfirmTypeTransformer$transform$1$2$WhenMappings.$EnumSwitchMapping$0[status4.ordinal()] == 1) {
                    return null;
                }
                return new BlockerResponse.Error(status4.name(), (String) null, 6);
            case 16:
                return Boolean.valueOf(((Lifecycle.State) obj) == Lifecycle.State.RESUMED);
            case 17:
                VerifyPasscodeResponse.Status status5 = ((VerifyPasscodeResponse) ((ApiResult.Success) obj).response).status;
                if ((status5 == null ? ProtoDefaults.VERIFY_PASSCODE_STATUS : status5) != VerifyPasscodeResponse.Status.INVALID_PASSCODE) {
                    if ((status5 == null ? ProtoDefaults.VERIFY_PASSCODE_STATUS : status5) != VerifyPasscodeResponse.Status.FAILURE) {
                        if ((status5 == null ? ProtoDefaults.VERIFY_PASSCODE_STATUS : status5) != VerifyPasscodeResponse.Status.TOO_MANY_ATTEMPTS) {
                            if ((status5 == null ? ProtoDefaults.VERIFY_PASSCODE_STATUS : status5) != VerifyPasscodeResponse.Status.CARD_BLOCKED) {
                                return null;
                            }
                        }
                    }
                }
                return new BlockerResponse.Error(status5 != null ? status5.name() : null, (String) null, 6);
            case 18:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                registerAliasViewModel.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel, null, null, null, false, true, false, null, false, false, 1047295);
            case 19:
                RegisterAliasViewModel registerAliasViewModel2 = (RegisterAliasViewModel) obj;
                registerAliasViewModel2.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel2, null, null, null, false, false, false, null, false, false, 1048319);
            case 20:
                RegisterAliasViewModel registerAliasViewModel3 = (RegisterAliasViewModel) obj;
                registerAliasViewModel3.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel3, null, null, null, false, true, false, null, false, false, 1047295);
            case 21:
                RegisterAliasViewModel registerAliasViewModel4 = (RegisterAliasViewModel) obj;
                registerAliasViewModel4.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel4, null, null, null, false, false, false, null, false, false, 1048319);
            case 22:
                RegisterAliasViewModel registerAliasViewModel5 = (RegisterAliasViewModel) obj;
                registerAliasViewModel5.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel5, null, null, null, false, true, false, null, false, false, 1047295);
            case 23:
                RegisterAliasViewModel registerAliasViewModel6 = (RegisterAliasViewModel) obj;
                registerAliasViewModel6.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel6, null, null, null, false, false, false, null, false, false, 1048319);
            case 24:
                RegisterAliasViewModel registerAliasViewModel7 = (RegisterAliasViewModel) obj;
                registerAliasViewModel7.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel7, null, null, null, false, false, false, null, false, false, 1048319);
            case 25:
                return RegisterAliasViewModel.copy$default((RegisterAliasViewModel) obj, null, null, null, false, true, false, null, false, false, 1047295);
            case 26:
                ApiResult.Success success2 = (ApiResult.Success) obj;
                SetFullNameResponse.Status status6 = ((SetFullNameResponse) success2.response).status;
                if (status6 == null) {
                    status6 = ProtoDefaults.SET_FULL_NAME_STATUS;
                }
                int ordinal2 = status6.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        return null;
                    }
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                String name = status6.name();
                ResponseContext responseContext2 = ((SetFullNameResponse) success2.response).response_context;
                return new BlockerResponse.Error(name, responseContext2 != null ? responseContext2.failure_message : null, 4);
            case 27:
                ApiResult.Success success3 = (ApiResult.Success) obj;
                InitiatePasscodeResetResponse.Status status7 = ((InitiatePasscodeResetResponse) success3.response).status;
                if (status7 == null) {
                    status7 = ProtoDefaults.INITIATE_PASSCODE_RESET_STATUS;
                }
                int ordinal3 = status7.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        return null;
                    }
                    if (ordinal3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                InitiatePasscodeResetResponse.Status status8 = ((InitiatePasscodeResetResponse) success3.response).status;
                return new BlockerResponse.Error(status8 != null ? status8.name() : null, (String) null, 6);
            case 28:
                ApiResult.Success success4 = (ApiResult.Success) obj;
                SetPasscodeResponse.Status status9 = ((SetPasscodeResponse) success4.response).status;
                if (status9 == null) {
                    status9 = ProtoDefaults.SET_PASSCODE_STATUS;
                }
                int ordinal4 = status9.ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 1) {
                        return null;
                    }
                    if (ordinal4 != 2 && ordinal4 != 3 && ordinal4 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                String name2 = status9.name();
                ResponseContext responseContext3 = ((SetPasscodeResponse) success4.response).response_context;
                responseContext3.getClass();
                return new BlockerResponse.Error(name2, responseContext3.dialog_message, 4);
            default:
                VerifyAliasPresenter.State state = (VerifyAliasPresenter.State) obj;
                state.getClass();
                return VerifyAliasPresenter.State.copy$default(state, null, true, false, null, false, 0, 57);
        }
    }

    public /* synthetic */ MoveBitcoinViewKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }
}
