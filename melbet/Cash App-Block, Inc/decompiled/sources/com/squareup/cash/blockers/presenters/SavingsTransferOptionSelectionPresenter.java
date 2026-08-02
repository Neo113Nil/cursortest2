package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest$Action$SelectOption;
import com.squareup.protos.franklin.app.SelectTransferOptionResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes4.dex */
public final class SavingsTransferOptionSelectionPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.SavingsTransferOptionSelectionScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public SavingsTransferOptionSelectionPresenter(AppService appService, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AndroidStringManager androidStringManager, BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.appService = appService;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = savingsTransferOptionSelectionScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSelectTransferOption(SavingsTransferOptionSelectionPresenter savingsTransferOptionSelectionPresenter, SavingsTransferOptionSelectionViewEvent.SelectTransferOption selectTransferOption, ContinuationImpl continuationImpl) {
        SavingsTransferOptionSelectionPresenter$handleSelectTransferOption$1 savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = savingsTransferOptionSelectionPresenter.navigator;
        BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen = savingsTransferOptionSelectionPresenter.args;
        if (continuationImpl instanceof SavingsTransferOptionSelectionPresenter$handleSelectTransferOption$1) {
            savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1 = (SavingsTransferOptionSelectionPresenter$handleSelectTransferOption$1) continuationImpl;
            int i2 = savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = savingsTransferOptionSelectionPresenter.appService;
                    ClientScenario clientScenario = savingsTransferOptionSelectionScreen.getBlockersData().clientScenario;
                    clientScenario.getClass();
                    String str2 = savingsTransferOptionSelectionScreen.getBlockersData().flowToken;
                    RequestContext requestContext = savingsTransferOptionSelectionScreen.getBlockersData().requestContext;
                    String str3 = selectTransferOption.id;
                    ByteString byteString = ByteString.EMPTY;
                    SelectTransferOptionRequest selectTransferOptionRequest = new SelectTransferOptionRequest(requestContext, new SelectTransferOptionRequest$Action$SelectOption(new SelectTransferOptionRequest.SelectOptionAction(str3, byteString)), byteString);
                    savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.label = 1;
                    obj = appService.selectTransferOption(clientScenario, str2, selectTransferOptionRequest, savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1);
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
                if (!(apiResult instanceof ApiResult.Success)) {
                    BlockersDataNavigator blockersDataNavigator = savingsTransferOptionSelectionPresenter.blockersDataNavigator;
                    BlockersData blockersData = savingsTransferOptionSelectionScreen.getBlockersData();
                    ResponseContext responseContext = ((SelectTransferOptionResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(blockersDataNavigator.getNext(savingsTransferOptionSelectionScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(savingsTransferOptionSelectionPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, str, 14));
                }
                return Unit.INSTANCE;
            }
        }
        savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1 = new SavingsTransferOptionSelectionPresenter$handleSelectTransferOption$1(savingsTransferOptionSelectionPresenter, continuationImpl);
        Object obj2 = savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsTransferOptionSelectionPresenter$handleSelectTransferOption$1.label;
        String str4 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153 A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object content;
        TransferOptionSelectionBlocker.SavingsGoalIcon savingsGoalIcon;
        UiAvatar uiAvatar;
        UiAvatar uiAvatar2;
        SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon avatarIcon;
        TransferOptionSelectionBlocker.SavingsGoalIcon savingsGoalIcon2;
        AnimationDirection animationDirection;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1273030023);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(26, mutableState, this, flow, (Continuation) null));
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        Object obj = null;
        BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen = this.args;
        if (booleanValue) {
            TransferOptionSelectionBlocker.AnimationDirection animationDirection2 = savingsTransferOptionSelectionScreen.getBlocker().submit_animation_direction;
            int i2 = animationDirection2 == null ? -1 : SavingsTransferOptionSelectionPresenterKt$WhenMappings.$EnumSwitchMapping$0[animationDirection2.ordinal()];
            if (i2 == -1 || i2 == 1) {
                animationDirection = AnimationDirection.FORWARD;
            } else {
                if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                animationDirection = AnimationDirection.BACKWARD;
            }
            content = new SavingsTransferOptionSelectionViewModel.Loading(animationDirection);
        } else {
            boolean z = savingsTransferOptionSelectionScreen.getRetreatAction() != null;
            String str = savingsTransferOptionSelectionScreen.getBlocker().title;
            str.getClass();
            String str2 = savingsTransferOptionSelectionScreen.getBlocker().subtitle;
            List<TransferOptionSelectionBlocker.TransferOption> list = savingsTransferOptionSelectionScreen.getBlocker().transfer_options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (TransferOptionSelectionBlocker.TransferOption transferOption : list) {
                TransferOptionSelectionBlocker.TransferOptionCell transferOptionCell = transferOption.cell;
                transferOptionCell.getClass();
                CellDefault cellDefault = transferOptionCell.cell_default;
                cellDefault.getClass();
                String str3 = transferOption.option_id;
                str3.getClass();
                TransferOptionSelectionBlocker.TransferOptionCell.Icon icon = transferOptionCell.icon;
                if (icon != null) {
                    TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon goalIcon = icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon ? (TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) icon : null;
                    if (goalIcon != null) {
                        savingsGoalIcon = goalIcon.getValue();
                        TransferOptionSelectionBlocker.TransferOptionCell.Icon icon2 = transferOptionCell.icon;
                        if (savingsGoalIcon == null) {
                            if (icon2 != null) {
                                TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon goalIcon2 = icon2 instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon ? (TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) icon2 : null;
                                if (goalIcon2 != null) {
                                    savingsGoalIcon2 = goalIcon2.getValue();
                                    savingsGoalIcon2.getClass();
                                    String str4 = savingsGoalIcon2.icon_id;
                                    str4.getClass();
                                    avatarIcon = new SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon(savingsGoalIcon2.progress, str4);
                                }
                            }
                            savingsGoalIcon2 = null;
                            savingsGoalIcon2.getClass();
                            String str42 = savingsGoalIcon2.icon_id;
                            str42.getClass();
                            avatarIcon = new SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon(savingsGoalIcon2.progress, str42);
                        } else {
                            if (icon2 != null) {
                                TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar uiAvatar3 = icon2 instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar ? (TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) icon2 : null;
                                if (uiAvatar3 != null) {
                                    uiAvatar = uiAvatar3.getValue();
                                    if (uiAvatar != null) {
                                        Object obj2 = obj;
                                        a$$ExternalSyntheticBUOutline0.m$1("Unsupported transfer option icon");
                                        return obj2;
                                    }
                                    TransferOptionSelectionBlocker.TransferOptionCell.Icon icon3 = transferOptionCell.icon;
                                    if (icon3 != null) {
                                        TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar uiAvatar4 = icon3 instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar ? (TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) icon3 : null;
                                        if (uiAvatar4 != null) {
                                            uiAvatar2 = uiAvatar4.getValue();
                                            uiAvatar2.getClass();
                                            avatarIcon = new SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon(uiAvatar2);
                                        }
                                    }
                                    uiAvatar2 = null;
                                    uiAvatar2.getClass();
                                    avatarIcon = new SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon(uiAvatar2);
                                }
                            }
                            uiAvatar = null;
                            if (uiAvatar != null) {
                            }
                        }
                        SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon icon4 = avatarIcon;
                        LocalizedString localizedString = cellDefault.label_text;
                        localizedString.getClass();
                        String str5 = localizedString.translated_value;
                        str5.getClass();
                        LocalizedString localizedString2 = cellDefault.body_text;
                        localizedString2.getClass();
                        String str6 = localizedString2.translated_value;
                        str6.getClass();
                        arrayList.add(new SavingsTransferOptionSelectionViewModel.Content.TransferOption(str3, icon4, str5, str6, !Intrinsics.areEqual(cellDefault.disabled, Boolean.TRUE)));
                        obj = obj;
                    }
                }
                savingsGoalIcon = null;
                TransferOptionSelectionBlocker.TransferOptionCell.Icon icon22 = transferOptionCell.icon;
                if (savingsGoalIcon == null) {
                }
                SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon icon42 = avatarIcon;
                LocalizedString localizedString3 = cellDefault.label_text;
                localizedString3.getClass();
                String str52 = localizedString3.translated_value;
                str52.getClass();
                LocalizedString localizedString22 = cellDefault.body_text;
                localizedString22.getClass();
                String str62 = localizedString22.translated_value;
                str62.getClass();
                arrayList.add(new SavingsTransferOptionSelectionViewModel.Content.TransferOption(str3, icon42, str52, str62, !Intrinsics.areEqual(cellDefault.disabled, Boolean.TRUE)));
                obj = obj;
            }
            content = new SavingsTransferOptionSelectionViewModel.Content(str, str2, arrayList, z);
        }
        gapComposer.end(false);
        return content;
    }
}
