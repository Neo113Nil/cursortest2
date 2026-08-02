package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.GapComposer;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import com.squareup.cash.R;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PromotionsControlPresenter extends BaseDependentControlPresenter {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, DependentControlScreen.Toggle toggle, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope, int i) {
        super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
        this.$r8$classId = i;
        toggle.getClass();
        switch (i) {
            case 1:
                super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
                break;
            default:
                break;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        int i = this.$r8$classId;
        BaseDependentControlDependencies baseDependentControlDependencies = this.deps;
        switch (i) {
            case 0:
                str.getClass();
                dependentControlStatus.getClass();
                gapComposer.startReplaceGroup(-236759573);
                AndroidStringManager androidStringManager = baseDependentControlDependencies.stringManager;
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_p2p_controls_screen_title)).format(new Object[]{str});
                format2.getClass();
                ControlType controlType = ControlType.PROMOTIONS;
                String str2 = androidStringManager.get(R.string.family_account_dependent_promotions_enrollment);
                Resources resources2 = androidStringManager.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_promotions_description)).format(new Object[]{str});
                format3.getClass();
                DependentControlViewModel.Toggle toggle = new DependentControlViewModel.Toggle(format2, controlType, new DependentControlsToggleViewModel(str2, format3, null, zzki.enabled(dependentControlStatus)), null, zzki.isLoading(dependentControlStatus), null, null);
                gapComposer.end(false);
                return toggle;
            default:
                str.getClass();
                dependentControlStatus.getClass();
                gapComposer.startReplaceGroup(1473344421);
                ControlType controlType2 = ControlType.NOTIFICATIONS;
                AndroidStringManager androidStringManager2 = baseDependentControlDependencies.stringManager;
                Resources resources3 = androidStringManager2.resources;
                resources3.getClass();
                String format4 = new MessageFormat(resources3.getString(R.string.family_account_dependent_notification_controls_screen_title)).format(new Object[]{str});
                format4.getClass();
                Resources resources4 = androidStringManager2.resources;
                resources4.getClass();
                String format5 = new MessageFormat(resources4.getString(R.string.family_account_dependent_notification_controls_screen_subtitle)).format(new Object[]{str});
                format5.getClass();
                DependentControlViewModel.Toggle toggle2 = new DependentControlViewModel.Toggle("", controlType2, new DependentControlsToggleViewModel(format4, format5, Integer.valueOf(R.drawable.icon_notifications_24), zzki.enabled(dependentControlStatus)), null, zzki.isLoading(dependentControlStatus), androidStringManager2.get(R.string.family_account_dependent_notifications_footer), null);
                gapComposer.end(false);
                return toggle2;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        switch (this.$r8$classId) {
            case 0:
                return ControlType.PROMOTIONS;
            default:
                return ControlType.NOTIFICATIONS;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        int i = this.$r8$classId;
        ControlDisablingConfirmationScreen.DisablingConfirmationQuestion disablingConfirmationQuestion = ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        switch (i) {
            case 0:
                if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged) {
                    if (((DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent).enabled) {
                        Object handleEnablePromotions = handleEnablePromotions(realFidesmoClient$observeDeviceState$1);
                        if (handleEnablePromotions != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    } else {
                        screenNavigator.askQuestion(disablingConfirmationQuestion, new ProfileQueries$$ExternalSyntheticLambda13(29, this, str));
                    }
                }
                break;
            default:
                if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged) {
                    if (((DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent).enabled) {
                        this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.RealTimeNotifications, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
                        Object dependentControlStatus2 = getControlStatusManager().setDependentControlStatus(true, realFidesmoClient$observeDeviceState$1);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (dependentControlStatus2 != coroutineSingletons) {
                            dependentControlStatus2 = Unit.INSTANCE;
                        }
                        if (dependentControlStatus2 != coroutineSingletons) {
                            break;
                        }
                    } else {
                        screenNavigator.askQuestion(disablingConfirmationQuestion, new RecipientQueries$$ExternalSyntheticLambda0(this, 25));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r14.setDependentControlStatus(true, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleEnablePromotions(ContinuationImpl continuationImpl) {
        PromotionsControlPresenter$handleEnablePromotions$1 promotionsControlPresenter$handleEnablePromotions$1;
        int i;
        DependentControlStatus.Loaded.LoadedPromotionControl loadedPromotionControl;
        String str;
        if (continuationImpl instanceof PromotionsControlPresenter$handleEnablePromotions$1) {
            promotionsControlPresenter$handleEnablePromotions$1 = (PromotionsControlPresenter$handleEnablePromotions$1) continuationImpl;
            int i2 = promotionsControlPresenter$handleEnablePromotions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                promotionsControlPresenter$handleEnablePromotions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = promotionsControlPresenter$handleEnablePromotions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsControlPresenter$handleEnablePromotions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = getControlStatusManager().dependentControlStatus;
                    promotionsControlPresenter$handleEnablePromotions$1.label = 1;
                    obj = FlowKt.first(sharedFlowImpl, promotionsControlPresenter$handleEnablePromotions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                loadedPromotionControl = !(obj instanceof DependentControlStatus.Loaded.LoadedPromotionControl) ? (DependentControlStatus.Loaded.LoadedPromotionControl) obj : null;
                if (loadedPromotionControl != null || (str = loadedPromotionControl.onboardingUrl) == null) {
                    this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.Promotions, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
                    RealDependentControlStatusManager controlStatusManager = getControlStatusManager();
                    promotionsControlPresenter$handleEnablePromotions$1.label = 2;
                } else {
                    DependentControlScreen dependentControlScreen = this.args;
                    this.router.route(new RoutingParams(dependentControlScreen, null, dependentControlScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                    getControlStatusManager().dependentControlsCache.cache.clear();
                }
                return Unit.INSTANCE;
            }
        }
        promotionsControlPresenter$handleEnablePromotions$1 = new PromotionsControlPresenter$handleEnablePromotions$1(this, continuationImpl);
        Object obj2 = promotionsControlPresenter$handleEnablePromotions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsControlPresenter$handleEnablePromotions$1.label;
        if (i != 0) {
        }
        if (!(obj2 instanceof DependentControlStatus.Loaded.LoadedPromotionControl)) {
        }
        if (loadedPromotionControl != null) {
        }
        this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.Promotions, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
        RealDependentControlStatusManager controlStatusManager2 = getControlStatusManager();
        promotionsControlPresenter$handleEnablePromotions$1.label = 2;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public void handleFooterLinkClicked(String str) {
        switch (this.$r8$classId) {
            case 1:
                str.getClass();
                this.navigator.goTo(new ProfileScreens.ChannelListScreen(NotificationCategory.NOTIFICATION_CATEGORY_FAMILY, PlatformKt.activeAccountToken(this.deps.sessionManager)));
                break;
            default:
                super.handleFooterLinkClicked(str);
                break;
        }
    }
}
