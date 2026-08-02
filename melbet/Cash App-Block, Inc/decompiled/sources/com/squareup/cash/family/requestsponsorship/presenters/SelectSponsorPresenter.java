package com.squareup.cash.family.requestsponsorship.presenters;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzba;
import com.squareup.cash.R;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileFamiliesSponsorshipOnboardingOonPhoneInput;
import com.squareup.cash.featureflags.AmplitudeExperiments$ShowCashAppIconInSponsorSelection;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.SelectDependentsBlocker;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SelectSponsorPresenter implements MoleculePresenter {
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final ModifiablePermissions contactsPermission;
    public final FeatureFlagManager featureFlagManager;
    public final AppService franklinAppService;
    public final boolean isSponsorRowCashLogoEnabled;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;
    public final RealRecipientRepository recipientRepository;
    public final Lazy recommendedContactNames$delegate = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 23));
    public final SelectDependentScreen selectDependentScreen;
    public final SelectSponsorScreen selectSponsorScreen;
    public final AegisService service;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;

    public enum SponsorSuggestionSectionType {
        RECOMMENDED(R.string.select_sponsor_recommended_header),
        YOUR_NETWORK(R.string.select_sponsor_your_network_header),
        MORE_RESULTS(R.string.select_sponsor_more_results_header);

        public final int header;

        SponsorSuggestionSectionType(int i) {
            this.header = i;
        }
    }

    public SelectSponsorPresenter(AegisService aegisService, AppService appService, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersDataNavigator blockersDataNavigator, ModifiablePermissions modifiablePermissions, FeatureFlagManager featureFlagManager, RealRecipientRepository realRecipientRepository, Signal signal, AndroidStringManager androidStringManager, RealProfileManager realProfileManager, SelectSponsorScreen selectSponsorScreen, SelectDependentScreen selectDependentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        boolean enabled;
        this.service = aegisService;
        this.franklinAppService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.contactsPermission = modifiablePermissions;
        this.featureFlagManager = featureFlagManager;
        this.recipientRepository = realRecipientRepository;
        this.signOutSignal = signal;
        this.stringManager = androidStringManager;
        this.profileManager = realProfileManager;
        this.selectSponsorScreen = selectSponsorScreen;
        this.selectDependentScreen = selectDependentScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        if (selectSponsorScreen == null) {
            enabled = false;
        } else {
            enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ShowCashAppIconInSponsorSelection.INSTANCE)).enabled();
        }
        this.isSponsorRowCashLogoEnabled = enabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r7 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r7 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleEnableContact(SelectSponsorPresenter selectSponsorPresenter, ContinuationImpl continuationImpl) {
        SelectSponsorPresenter$handleEnableContact$1 selectSponsorPresenter$handleEnableContact$1;
        Object obj;
        int i;
        ModifiablePermissions modifiablePermissions = selectSponsorPresenter.contactsPermission;
        if (continuationImpl instanceof SelectSponsorPresenter$handleEnableContact$1) {
            selectSponsorPresenter$handleEnableContact$1 = (SelectSponsorPresenter$handleEnableContact$1) continuationImpl;
            int i2 = selectSponsorPresenter$handleEnableContact$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                selectSponsorPresenter$handleEnableContact$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = selectSponsorPresenter$handleEnableContact$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectSponsorPresenter$handleEnableContact$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    selectSponsorPresenter$handleEnableContact$1.label = 1;
                    obj = modifiablePermissions.shouldShowRequestPermissionRationale(selectSponsorPresenter$handleEnableContact$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            selectSponsorPresenter.navigator.goTo(new BlockersScreens.ReadContactsPermissionScreen());
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    modifiablePermissions.request();
                    return Unit.INSTANCE;
                }
                selectSponsorPresenter$handleEnableContact$1.label = 2;
                obj = modifiablePermissions.shouldShowOverridePrompt(selectSponsorPresenter$handleEnableContact$1);
            }
        }
        selectSponsorPresenter$handleEnableContact$1 = new SelectSponsorPresenter$handleEnableContact$1(selectSponsorPresenter, continuationImpl);
        obj = selectSponsorPresenter$handleEnableContact$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectSponsorPresenter$handleEnableContact$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static boolean getHasMultipleContactMethods(Recipient recipient) {
        return zzba.getSmsNumberList(recipient).size() + zzba.getEmailAddressList(recipient).size() > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object gLSceneScopeProvider$SceneScope$2$1$1;
        MutableState mutableState;
        MutableState mutableState2;
        ?? r9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        Object obj;
        BlockerAction blockerAction;
        String str7;
        String str8;
        SelectDependentsBlocker.AddContactsCard addContactsCard;
        SelectSponsorsBlocker.AddContactsCard addContactsCard2;
        String str9;
        SelectDependentsBlocker.AddContactsCard addContactsCard3;
        SelectSponsorsBlocker.AddContactsCard addContactsCard4;
        flow.getClass();
        ?? r5 = (GapComposer) composer;
        r5.startReplaceGroup(-486312354);
        Object rememberedValue = r5.rememberedValue();
        ModifiablePermissions modifiablePermissions = this.contactsPermission;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = modifiablePermissions.granted();
            r5.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, Boolean.valueOf(modifiablePermissions.check()), null, r5, 0, 2);
        Object rememberedValue2 = r5.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            r5.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = r5.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            r5.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        Object rememberedValue4 = r5.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = FlowKt.MutableStateFlow("");
            r5.updateRememberedValue(rememberedValue4);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue4;
        boolean changed = r5.changed(mutableStateFlow);
        Object rememberedValue5 = r5.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue5 == obj2) {
            rememberedValue5 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(FlowKt.debounce(mutableStateFlow, 150L), new AnchoredDraggableNode$drag$2(continuation, this, 18)), 3);
            r5.updateRememberedValue(rememberedValue5);
        }
        Flow flow2 = (Flow) rememberedValue5;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        MutableState collectAsState2 = Updater.collectAsState(flow2, emptyMap, null, r5, 48, 2);
        Object rememberedValue6 = r5.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = this.profileManager.profile();
            r5.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue6, null, null, r5, 48, 2);
        boolean changed2 = r5.changed(((Boolean) collectAsState.getValue()).booleanValue()) | r5.changed((Map) collectAsState2.getValue()) | r5.changed((Profile) collectAsState3.getValue());
        Object rememberedValue7 = r5.rememberedValue();
        if (changed2 || rememberedValue7 == obj2) {
            rememberedValue7 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(8, this, collectAsState2, collectAsState3));
            r5.updateRememberedValue(rememberedValue7);
        }
        State state = (State) rememberedValue7;
        Object value = collectAsState.getValue();
        boolean changedInstance = r5.changedInstance(this) | r5.changed(collectAsState);
        Object rememberedValue8 = r5.rememberedValue();
        if (changedInstance || rememberedValue8 == obj2) {
            mutableState = mutableState3;
            gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((Object) this, collectAsState, mutableState, continuation, 11);
            mutableState2 = collectAsState;
            r9 = 0;
            r5.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
        } else {
            mutableState2 = collectAsState;
            gLSceneScopeProvider$SceneScope$2$1$1 = rememberedValue8;
            mutableState = mutableState3;
            r9 = 0;
        }
        Updater.LaunchedEffect((Composer) r5, value, (Function2) gLSceneScopeProvider$SceneScope$2$1$1);
        MutableState mutableState5 = mutableState;
        Updater.LaunchedEffect((Composer) r5, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState5, (Object) mutableStateFlow, (State) mutableState4, 27));
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            r5.startReplaceGroup(-804114292);
            r5.end(false);
            obj = SelectSponsorViewModel.Submitting.INSTANCE;
        } else {
            r5.startReplaceGroup(-804040698);
            MutableState mutableState6 = !((Boolean) mutableState2.getValue()).booleanValue() ? mutableState2 : r9;
            SelectDependentScreen selectDependentScreen = this.selectDependentScreen;
            SelectSponsorScreen selectSponsorScreen = this.selectSponsorScreen;
            if (mutableState6 != null) {
                if (selectSponsorScreen == null || (addContactsCard4 = selectSponsorScreen.contactsCard) == null || (str9 = addContactsCard4.inline_text) == null) {
                    str9 = (selectDependentScreen == null || (addContactsCard3 = selectDependentScreen.contactsCard) == null) ? r9 : addContactsCard3.inline_text;
                }
                str = str9;
            } else {
                str = r9;
            }
            if ((!((Boolean) mutableState2.getValue()).booleanValue() ? mutableState2 : r9) != null) {
                if (selectSponsorScreen == null || (addContactsCard2 = selectSponsorScreen.contactsCard) == null || (str8 = addContactsCard2.add_contact_button_title) == null) {
                    str8 = (selectDependentScreen == null || (addContactsCard = selectDependentScreen.contactsCard) == null) ? r9 : addContactsCard.add_contact_button_title;
                }
                str2 = str8;
            } else {
                str2 = r9;
            }
            if (selectSponsorScreen == null || (str4 = selectSponsorScreen.title) == null) {
                if (selectDependentScreen != null) {
                    str4 = selectDependentScreen.title;
                } else {
                    str3 = r9;
                    str3.getClass();
                    if (selectSponsorScreen != null || (str6 = selectSponsorScreen.hint) == null) {
                        if (selectDependentScreen == null) {
                            str6 = selectDependentScreen.hint;
                        } else {
                            str5 = r9;
                            str5.getClass();
                            List list = (List) state.getValue();
                            boolean z2 = StringsKt.isBlank((CharSequence) Updater.collectAsState(mutableStateFlow, r9, r5, 1).getValue()) && ((Map) collectAsState2.getValue()).isEmpty();
                            boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                            boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                            if (StringsKt.isBlank((CharSequence) Updater.collectAsState(mutableStateFlow, r9, r5, 1).getValue()) && !booleanValue2) {
                                if ((selectSponsorScreen == null ? selectSponsorScreen.inviteContactAction : r9) != null) {
                                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MobileFamiliesSponsorshipOnboardingOonPhoneInput.INSTANCE)).enabled()) {
                                        z = true;
                                        SelectSponsorViewModel.SelectSponsor selectSponsor = new SelectSponsorViewModel.SelectSponsor(str3, str5, list, str, str2, z2, booleanValue, z, (selectSponsorScreen != null || (blockerAction = selectSponsorScreen.inviteContactAction) == null || (str7 = blockerAction.text) == null) ? "" : str7);
                                        r5.end(false);
                                        obj = selectSponsor;
                                    }
                                }
                            }
                            z = false;
                            SelectSponsorViewModel.SelectSponsor selectSponsor2 = new SelectSponsorViewModel.SelectSponsor(str3, str5, list, str, str2, z2, booleanValue, z, (selectSponsorScreen != null || (blockerAction = selectSponsorScreen.inviteContactAction) == null || (str7 = blockerAction.text) == null) ? "" : str7);
                            r5.end(false);
                            obj = selectSponsor2;
                        }
                    }
                    str5 = str6;
                    str5.getClass();
                    List list2 = (List) state.getValue();
                    if (StringsKt.isBlank((CharSequence) Updater.collectAsState(mutableStateFlow, r9, r5, 1).getValue())) {
                    }
                    boolean booleanValue3 = ((Boolean) mutableState5.getValue()).booleanValue();
                    boolean booleanValue22 = ((Boolean) mutableState2.getValue()).booleanValue();
                    if (StringsKt.isBlank((CharSequence) Updater.collectAsState(mutableStateFlow, r9, r5, 1).getValue())) {
                        if ((selectSponsorScreen == null ? selectSponsorScreen.inviteContactAction : r9) != null) {
                        }
                    }
                    z = false;
                    SelectSponsorViewModel.SelectSponsor selectSponsor22 = new SelectSponsorViewModel.SelectSponsor(str3, str5, list2, str, str2, z2, booleanValue3, z, (selectSponsorScreen != null || (blockerAction = selectSponsorScreen.inviteContactAction) == null || (str7 = blockerAction.text) == null) ? "" : str7);
                    r5.end(false);
                    obj = selectSponsor22;
                }
            }
            str3 = str4;
            str3.getClass();
            if (selectSponsorScreen != null) {
            }
            if (selectDependentScreen == null) {
            }
        }
        r5.end(false);
        return obj;
    }
}
