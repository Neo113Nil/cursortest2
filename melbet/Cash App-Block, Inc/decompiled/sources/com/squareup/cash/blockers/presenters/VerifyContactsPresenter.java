package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.LoadingAnimationDirection;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.Signal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class VerifyContactsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.ContactVerificationScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final RealContactBook contactBook;
    public final Result contactVerifier;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidPermissionManager$create$1 readContactsPermissions;
    public final Signal signOut;
    public final AndroidStringManager stringManager;

    public VerifyContactsPresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockersDataNavigator blockersDataNavigator, Result result, Signal signal, RealContactBook realContactBook, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, CoroutineContext coroutineContext, BlockersScreens.ContactVerificationScreen contactVerificationScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidPermissionManager$create$1 androidPermissionManager$create$1, AppService appService) {
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.contactVerifier = result;
        this.signOut = signal;
        this.contactBook = realContactBook;
        this.ioDispatcher = coroutineContext;
        this.args = contactVerificationScreen;
        this.navigator = screenNavigator;
        this.readContactsPermissions = androidPermissionManager$create$1;
        this.appService = appService;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitBlockerAction(VerifyContactsPresenter verifyContactsPresenter, BlockerAction.SubmitAction submitAction, ContinuationImpl continuationImpl) {
        VerifyContactsPresenter$submitBlockerAction$1 verifyContactsPresenter$submitBlockerAction$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = verifyContactsPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = verifyContactsPresenter.navigator;
        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
        BlockersData blockersData = contactVerificationScreen.blockersData;
        if (continuationImpl instanceof VerifyContactsPresenter$submitBlockerAction$1) {
            verifyContactsPresenter$submitBlockerAction$1 = (VerifyContactsPresenter$submitBlockerAction$1) continuationImpl;
            int i2 = verifyContactsPresenter$submitBlockerAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                verifyContactsPresenter$submitBlockerAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                VerifyContactsPresenter$submitBlockerAction$1 verifyContactsPresenter$submitBlockerAction$12 = verifyContactsPresenter$submitBlockerAction$1;
                Object obj = verifyContactsPresenter$submitBlockerAction$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyContactsPresenter$submitBlockerAction$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = verifyContactsPresenter.analytics;
                    BlockersData blockersData2 = contactVerificationScreen.blockersData;
                    VerifyContactsPresenter$submitBlockerAction$result$1 verifyContactsPresenter$submitBlockerAction$result$1 = new VerifyContactsPresenter$submitBlockerAction$result$1(verifyContactsPresenter, submitAction, null);
                    verifyContactsPresenter$submitBlockerAction$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, verifyContactsPresenter$submitBlockerAction$12, null, verifyContactsPresenter$submitBlockerAction$result$1);
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
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, androidStringManager.get(R.string.generic_network_error), null, 4));
                } else {
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    String str = responseContext.dialog_message;
                    if (str != null) {
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str, responseContext.dialog_title, 2));
                    } else {
                        screenNavigator.goTo(verifyContactsPresenter.blockersNavigator.getNext(contactVerificationScreen, updateFromResponseContext));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        verifyContactsPresenter$submitBlockerAction$1 = new VerifyContactsPresenter$submitBlockerAction$1(verifyContactsPresenter, continuationImpl);
        VerifyContactsPresenter$submitBlockerAction$1 verifyContactsPresenter$submitBlockerAction$122 = verifyContactsPresenter$submitBlockerAction$1;
        Object obj2 = verifyContactsPresenter$submitBlockerAction$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyContactsPresenter$submitBlockerAction$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-463085120);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            BlockersScreens.ContactVerificationScreen contactVerificationScreen = this.args;
            boolean z = contactVerificationScreen.helpItems != null ? !r2.isEmpty() : false;
            String str2 = contactVerificationScreen.titleOverride;
            AndroidStringManager androidStringManager = this.stringManager;
            if (str2 == null) {
                str2 = androidStringManager.get(R.string.blockers_verify_contacts_title);
            }
            String str3 = str2;
            String str4 = contactVerificationScreen.subtitle;
            if (z) {
                str = androidStringManager.get(R.string.blockers_verify_contacts_next_short);
            } else {
                str = contactVerificationScreen.primaryButtonText;
                if (str == null) {
                    str = androidStringManager.get(R.string.blockers_verify_contacts_next_long);
                }
            }
            rememberedValue = Updater.mutableStateOf$default(new VerifyContactsViewModel(str3, str4, false, LoadingAnimationDirection.FORWARD, z, str, contactVerificationScreen.dismissAction != null, contactVerificationScreen.retreatAction != null));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = this.readContactsPermissions.$readonly.granted();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, Boolean.FALSE, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new FileBlockerView$6$2$2(this, mutableState2, (Continuation) null, 8);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, (Object) this, (Object) collectAsState, mutableState, mutableState2, 7));
        VerifyContactsViewModel verifyContactsViewModel = (VerifyContactsViewModel) mutableState.getValue();
        gapComposer.end(false);
        return verifyContactsViewModel;
    }
}
