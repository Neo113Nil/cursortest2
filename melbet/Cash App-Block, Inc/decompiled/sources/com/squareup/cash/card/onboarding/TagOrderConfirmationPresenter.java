package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FormattedResources;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewModel;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.cdf.minttag.ConfirmationType;
import com.squareup.cash.cdf.minttag.MintTagOrderConfirmed;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class TagOrderConfirmationPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final TagOrderConfirmationScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagConfirmationBlocker.TagConfirmationBlockerStyle.values().length];
            try {
                iArr[TagConfirmationBlocker.TagConfirmationBlockerStyle.TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TagOrderConfirmationPresenter(TagOrderConfirmationScreen tagOrderConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator, AppService appService, Analytics analytics, AndroidStringManager androidStringManager, SyncValueReader syncValueReader) {
        tagOrderConfirmationScreen.getClass();
        this.args = tagOrderConfirmationScreen;
        this.navigator = screenNavigator;
        this.appService = appService;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleContinue(TagOrderConfirmationPresenter tagOrderConfirmationPresenter, ContinuationImpl continuationImpl) {
        TagOrderConfirmationPresenter$handleContinue$1 tagOrderConfirmationPresenter$handleContinue$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = tagOrderConfirmationPresenter.stringManager;
        Analytics analytics = tagOrderConfirmationPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = tagOrderConfirmationPresenter.navigator;
        TagOrderConfirmationScreen tagOrderConfirmationScreen = tagOrderConfirmationPresenter.args;
        if (continuationImpl instanceof TagOrderConfirmationPresenter$handleContinue$1) {
            tagOrderConfirmationPresenter$handleContinue$1 = (TagOrderConfirmationPresenter$handleContinue$1) continuationImpl;
            int i2 = tagOrderConfirmationPresenter$handleContinue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                tagOrderConfirmationPresenter$handleContinue$1.label = i2 - PKIFailureInfo.systemUnavail;
                TagOrderConfirmationPresenter$handleContinue$1 tagOrderConfirmationPresenter$handleContinue$12 = tagOrderConfirmationPresenter$handleContinue$1;
                Object obj = tagOrderConfirmationPresenter$handleContinue$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tagOrderConfirmationPresenter$handleContinue$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TagConfirmationBlocker tagConfirmationBlocker = tagOrderConfirmationScreen.blocker;
                    String str = tagConfirmationBlocker.tag_theme_token;
                    if (str == null) {
                        str = "";
                    }
                    TagConfirmationBlocker.TagConfirmationBlockerStyle tagConfirmationBlockerStyle = tagConfirmationBlocker.style;
                    analytics.track(new MintTagOrderConfirmed(str, (tagConfirmationBlockerStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tagConfirmationBlockerStyle.ordinal()]) == 1 ? ConfirmationType.FAILURE : ConfirmationType.SUCCESS, tagOrderConfirmationScreen.blockersData.flowToken), null);
                    BlockersData blockersData = tagOrderConfirmationScreen.blockersData;
                    Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(tagOrderConfirmationPresenter, continuation, 14);
                    tagOrderConfirmationPresenter$handleContinue$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, tagOrderConfirmationPresenter$handleContinue$12, null, anonymousClass1);
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
                    screenNavigator.goTo(tagOrderConfirmationScreen.blockersData.exitScreen);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to submit tag order confirmation blocker.", new Object[0]);
                    screenNavigator.goTo(CanvasKt.toFailureScreen((ApiResult.Failure) apiResult, tagOrderConfirmationScreen.blockersData, androidStringManager));
                }
                return Unit.INSTANCE;
            }
        }
        tagOrderConfirmationPresenter$handleContinue$1 = new TagOrderConfirmationPresenter$handleContinue$1(tagOrderConfirmationPresenter, continuationImpl);
        TagOrderConfirmationPresenter$handleContinue$1 tagOrderConfirmationPresenter$handleContinue$122 = tagOrderConfirmationPresenter$handleContinue$1;
        Object obj2 = tagOrderConfirmationPresenter$handleContinue$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tagOrderConfirmationPresenter$handleContinue$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.squareup.cash.wallet.data.TagFormFactor] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.squareup.cash.wallet.data.TagFormFactor] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1322222812);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = StateFlowKt.mapState(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.TagThemeDefinitions), new CalendarRowKt$$ExternalSyntheticLambda10(24));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue2, gapComposer);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 29));
        TagConfirmationBlocker tagConfirmationBlocker = this.args.blocker;
        String str = tagConfirmationBlocker.tag_theme_token;
        if (str != null) {
            TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) ((Map) receiveValueAsState.getValue()).get(str);
            continuation = FormattedResources.toAppTagFormFactor(tagThemeDefinition != null ? tagThemeDefinition.form_factor : null);
        }
        ?? r9 = continuation;
        String str2 = tagConfirmationBlocker.highlighted_title;
        String str3 = str2 == null ? "" : str2;
        String str4 = tagConfirmationBlocker.standard_title;
        String str5 = str4 == null ? "" : str4;
        String str6 = tagConfirmationBlocker.button_title;
        if (str6 == null) {
            str6 = this.stringManager.get(R.string.blockers_done);
        }
        String str7 = str6;
        TagConfirmationBlocker.TagConfirmationBlockerStyle tagConfirmationBlockerStyle = tagConfirmationBlocker.style;
        TagOrderConfirmationViewModel tagOrderConfirmationViewModel = new TagOrderConfirmationViewModel(str3, str5, str7, (tagConfirmationBlockerStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tagConfirmationBlockerStyle.ordinal()]) == 1 ? TagOrderConfirmationViewModel.Style.FAILURE : TagOrderConfirmationViewModel.Style.SUCCESS, r9);
        gapComposer.end(false);
        return tagOrderConfirmationViewModel;
    }
}
