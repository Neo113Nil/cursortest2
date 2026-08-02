package com.squareup.cash.borrow.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewModel;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.FinishCreditMultiStepLoadRequest;
import com.squareup.protos.franklin.app.FinishCreditMultiStepLoadResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CreditMultiStepLoadingBlockerPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.CreditMultiStepLoadingBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public CreditMultiStepLoadingBlockerPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BlockersScreens.CreditMultiStepLoadingBlockerScreen creditMultiStepLoadingBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        creditMultiStepLoadingBlockerScreen.getClass();
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = creditMultiStepLoadingBlockerScreen;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$finish(CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter, ContinuationImpl continuationImpl) {
        CreditMultiStepLoadingBlockerPresenter$finish$1 creditMultiStepLoadingBlockerPresenter$finish$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = creditMultiStepLoadingBlockerPresenter.navigator;
        BlockersScreens.CreditMultiStepLoadingBlockerScreen creditMultiStepLoadingBlockerScreen = creditMultiStepLoadingBlockerPresenter.args;
        if (continuationImpl instanceof CreditMultiStepLoadingBlockerPresenter$finish$1) {
            creditMultiStepLoadingBlockerPresenter$finish$1 = (CreditMultiStepLoadingBlockerPresenter$finish$1) continuationImpl;
            int i2 = creditMultiStepLoadingBlockerPresenter$finish$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                creditMultiStepLoadingBlockerPresenter$finish$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = creditMultiStepLoadingBlockerPresenter$finish$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditMultiStepLoadingBlockerPresenter$finish$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = creditMultiStepLoadingBlockerPresenter.appService;
                    BlockersData blockersData = creditMultiStepLoadingBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData.flowToken;
                    FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = new FinishCreditMultiStepLoadRequest(blockersData.requestContext, Boolean.FALSE, ByteString.EMPTY);
                    creditMultiStepLoadingBlockerPresenter$finish$1.label = 1;
                    obj = appService.finishCreditMultiStepLoad(clientScenario, str, finishCreditMultiStepLoadRequest, creditMultiStepLoadingBlockerPresenter$finish$1);
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
                    BlockersData blockersData2 = creditMultiStepLoadingBlockerScreen.blockersData;
                    ResponseContext responseContext = ((FinishCreditMultiStepLoadResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(creditMultiStepLoadingBlockerPresenter.blockersDataNavigator.getNext(creditMultiStepLoadingBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(creditMultiStepLoadingBlockerPresenter.stringManager, (ApiResult.Failure) apiResult, null);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(creditMultiStepLoadingBlockerScreen.blockersData, errorMessaging.message, errorMessaging.title));
                }
                return Unit.INSTANCE;
            }
        }
        creditMultiStepLoadingBlockerPresenter$finish$1 = new CreditMultiStepLoadingBlockerPresenter$finish$1(creditMultiStepLoadingBlockerPresenter, continuationImpl);
        Object obj2 = creditMultiStepLoadingBlockerPresenter$finish$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditMultiStepLoadingBlockerPresenter$finish$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static StackedAvatarViewModel.Avatar toStackedAvatar(FormBlocker.Element.AvatarElement.Avatar avatar) {
        Color color = avatar.background_color;
        ColorModel.Accented accented = color != null ? new ColorModel.Accented(color) : null;
        String str = avatar.monogram_text;
        Character firstOrNull = str != null ? StringsKt___StringsKt.firstOrNull(str) : null;
        String str2 = avatar.accessibility_value;
        Image image = avatar.image;
        Boolean bool = avatar.is_template_avatar;
        Boolean bool2 = Boolean.TRUE;
        return new StackedAvatarViewModel.Avatar(accented, firstOrNull, str2, image, null, null, Intrinsics.areEqual(bool, bool2) ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null, Intrinsics.areEqual(avatar.is_template_avatar, bool2) ? accented : null, false, false, null, false, null, null, 129520);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(415537024);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new FileBlockerView$6$2$2(flow, continuation, this, 27));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CreditMultiStepLoadingBlockerPresenter$models$2$1(this, mutableState, null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new RingtoneView$playRingtone$1(this, continuation, 8);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        CreditMultiStepLoadingBlocker creditMultiStepLoadingBlocker = this.args.data;
        FormBlocker.Element.AvatarElement avatarElement = creditMultiStepLoadingBlocker.avatar_element;
        avatarElement.getClass();
        int size = avatarElement.avatars.size();
        List<FormBlocker.Element.AvatarElement.Avatar> list = avatarElement.avatars;
        StackedAvatarViewModel trio = size != 1 ? size != 2 ? new StackedAvatarViewModel.Trio(toStackedAvatar(list.get(0)), toStackedAvatar(avatarElement.avatars.get(1)), toStackedAvatar(avatarElement.avatars.get(2)), false, 0) : new StackedAvatarViewModel.Duo(toStackedAvatar((FormBlocker.Element.AvatarElement.Avatar) CollectionsKt.first((List) list)), toStackedAvatar((FormBlocker.Element.AvatarElement.Avatar) CollectionsKt.last((List) avatarElement.avatars))) : new StackedAvatarViewModel.Single(toStackedAvatar((FormBlocker.Element.AvatarElement.Avatar) CollectionsKt.first((List) list)));
        String str = creditMultiStepLoadingBlocker.header;
        str.getClass();
        String str2 = creditMultiStepLoadingBlocker.subheader;
        str2.getClass();
        List<CreditMultiStepLoadingBlocker.LoadingStep> list2 = creditMultiStepLoadingBlocker.loading_steps;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String str3 = ((CreditMultiStepLoadingBlocker.LoadingStep) it.next()).text;
            str3.getClass();
            arrayList.add(str3);
        }
        BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel = new BorrowMultiStepLoadingViewModel(trio, str, str2, arrayList, ((Number) mutableState.getValue()).intValue(), true);
        gapComposer.end(false);
        return borrowMultiStepLoadingViewModel;
    }
}
