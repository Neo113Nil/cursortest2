package com.squareup.cash.payments.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$DialogModel;
import com.squareup.cash.account.settings.viewmodels.ViewMode;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.businessprofile.BusinessProfileManageDowngradeToPersonal;
import com.squareup.cash.cdf.personalprofile.PersonalProfileEditOpen;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageAddPhoto;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageUpgradeToBusiness;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.cashidv.flows.DisplayNameFlowParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.ui.FullCashtag;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DissolveWipeContentKt$DissolveWipeContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentStyle$delegate;
    public final /* synthetic */ MutableState $displayedState$delegate;
    public final /* synthetic */ MutableState $incomingState$delegate;
    public final /* synthetic */ MutableState $isAnimating$delegate;
    public final /* synthetic */ MutableState $isReverse$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean $reverse;
    public /* synthetic */ Object $targetState;
    public final /* synthetic */ Object $transitionStyle;
    public final /* synthetic */ Object $waveProgress;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DissolveWipeContentKt$DissolveWipeContent$1$1(Triple triple, DissolveTransitionStyle dissolveTransitionStyle, boolean z, Animatable animatable, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.$targetState = triple;
        this.$transitionStyle = dissolveTransitionStyle;
        this.$reverse = z;
        this.$waveProgress = animatable;
        this.$displayedState$delegate = mutableState;
        this.$currentStyle$delegate = mutableState2;
        this.$isReverse$delegate = mutableState3;
        this.$incomingState$delegate = mutableState4;
        this.$isAnimating$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$waveProgress;
        Object obj3 = this.$transitionStyle;
        switch (i) {
            case 0:
                MutableState mutableState = this.$incomingState$delegate;
                MutableState mutableState2 = this.$isAnimating$delegate;
                return new DissolveWipeContentKt$DissolveWipeContent$1$1((Triple) this.$targetState, (DissolveTransitionStyle) obj3, this.$reverse, (Animatable) obj2, this.$displayedState$delegate, this.$currentStyle$delegate, this.$isReverse$delegate, mutableState, mutableState2, continuation);
            default:
                DissolveWipeContentKt$DissolveWipeContent$1$1 dissolveWipeContentKt$DissolveWipeContent$1$1 = new DissolveWipeContentKt$DissolveWipeContent$1$1((Flow) obj3, continuation, (TapToPayPresenter) obj2, this.$reverse, this.$displayedState$delegate, this.$currentStyle$delegate, this.$isReverse$delegate, this.$incomingState$delegate, this.$isAnimating$delegate);
                dissolveWipeContentKt$DissolveWipeContent$1$1.$targetState = obj;
                return dissolveWipeContentKt$DissolveWipeContent$1$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DissolveWipeContentKt$DissolveWipeContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r6, r1, r2, null, null, r16, 12) == r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r0.snapTo(r1, r16) == r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r6, r1, r2, null, null, r16, 12) == r8) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$transitionStyle;
        Object obj3 = this.$waveProgress;
        switch (i) {
            case 0:
                Animatable animatable = (Animatable) obj3;
                DissolveTransitionStyle dissolveTransitionStyle = (DissolveTransitionStyle) obj2;
                Triple triple = (Triple) this.$targetState;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                MutableState mutableState = this.$displayedState$delegate;
                MutableState mutableState2 = this.$isReverse$delegate;
                MutableState mutableState3 = this.$isAnimating$delegate;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!triple.equals(mutableState.getValue())) {
                        this.$currentStyle$delegate.setValue(dissolveTransitionStyle);
                        mutableState2.setValue(Boolean.valueOf(dissolveTransitionStyle == DissolveTransitionStyle.WIPE && this.$reverse));
                        this.$incomingState$delegate.setValue(triple);
                        mutableState3.setValue(Boolean.TRUE);
                        Float f = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        break;
                    } else if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        int floatValue = (int) (((Number) animatable.getValue()).floatValue() * 1400.0f);
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        TweenSpec tween$default = AnimatableKt.tween$default(floatValue, 0, EasingKt.LinearEasing, 2);
                        this.label = 3;
                        break;
                    }
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Float f3 = new Float(1.0f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(1400, 0, EasingKt.LinearEasing, 2);
                    this.label = 2;
                    break;
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(triple);
                    Boolean bool = Boolean.FALSE;
                    mutableState3.setValue(bool);
                    mutableState2.setValue(bool);
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool2 = Boolean.FALSE;
                    mutableState3.setValue(bool2);
                    mutableState2.setValue(bool2);
                }
                break;
            default:
                final CoroutineScope coroutineScope = (CoroutineScope) this.$targetState;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj3;
                    final MutableState mutableState4 = this.$incomingState$delegate;
                    final MutableState mutableState5 = this.$isAnimating$delegate;
                    final boolean z = this.$reverse;
                    final MutableState mutableState6 = this.$displayedState$delegate;
                    final MutableState mutableState7 = this.$currentStyle$delegate;
                    final MutableState mutableState8 = this.$isReverse$delegate;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.account.presenters.EditProfilePresenter$models$$inlined$CollectEffect$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj4, Continuation continuation) {
                            PersonalProfileEditOpen.PersonalProfileEditScreen personalProfileEditScreen;
                            int intValue;
                            FullCashtag fullCashtag;
                            TapToPayPresenter tapToPayPresenter2 = tapToPayPresenter;
                            Analytics analytics = (Analytics) tapToPayPresenter2.keyProvider;
                            EditProfile editProfile = (EditProfile) tapToPayPresenter2.tapToPayRepository;
                            AndroidStringManager androidStringManager = (AndroidStringManager) tapToPayPresenter2.deviceIntegrityAttester;
                            RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) tapToPayPresenter2.mriFactory;
                            EditProfileViewEvent editProfileViewEvent = (EditProfileViewEvent) obj4;
                            if (Intrinsics.areEqual(editProfileViewEvent, EditProfileViewEvent.BackClicked.INSTANCE)) {
                                realAccountOutboundNavigator.navigator.goTo(Back.INSTANCE);
                            } else {
                                boolean areEqual = Intrinsics.areEqual(editProfileViewEvent, EditProfileViewEvent.BioClicked.INSTANCE);
                                r6 = null;
                                String str = null;
                                CoroutineScope coroutineScope2 = coroutineScope;
                                if (areEqual) {
                                    JobKt.launch$default(coroutineScope2, null, null, new BlockRunner$cancel$1(tapToPayPresenter2, (Continuation) null, 24), 3);
                                } else if (!(editProfileViewEvent instanceof EditProfileViewEvent.BusinessProfileClicked)) {
                                    boolean areEqual2 = Intrinsics.areEqual(editProfileViewEvent, EditProfileViewEvent.CashtagClicked.INSTANCE);
                                    MutableState mutableState9 = mutableState6;
                                    if (areEqual2) {
                                        PublicProfile publicProfile = (PublicProfile) mutableState9.getValue();
                                        if (publicProfile != null && (fullCashtag = publicProfile.fullCashtag) != null) {
                                            str = fullCashtag.cashtag_display_name;
                                        }
                                        realAccountOutboundNavigator.getClass();
                                        editProfile.getClass();
                                        realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startCashtagFlow(editProfile, new RedactedString(str)));
                                    } else {
                                        boolean z2 = editProfileViewEvent instanceof EditProfileViewEvent.FullNameClicked;
                                        MutableState mutableState10 = mutableState4;
                                        if (z2) {
                                            MutableState mutableState11 = mutableState7;
                                            Integer num = (Integer) mutableState11.getValue();
                                            if (num == null || num.intValue() > 0) {
                                                ((TimeToLiveSyncState) tapToPayPresenter2.ttpEligibilityProvider).lastAttemptedRefresh = 0L;
                                                Boolean bool3 = (Boolean) mutableState8.getValue();
                                                bool3.getClass();
                                                Integer num2 = (Integer) mutableState11.getValue();
                                                int intValue2 = num2 != null ? num2.intValue() : 3;
                                                boolean z3 = ((EditProfileViewEvent.FullNameClicked) editProfileViewEvent).showBusinessName;
                                                AndroidStringManager androidStringManager2 = z3 ? androidStringManager : null;
                                                if (androidStringManager2 != null) {
                                                    androidStringManager2.get(R.string.edit_profile_business_name_title_override);
                                                }
                                                AndroidStringManager androidStringManager3 = z3 ? androidStringManager : null;
                                                if (androidStringManager3 != null) {
                                                    androidStringManager3.get(R.string.edit_profile_business_name_title_override);
                                                }
                                                AndroidStringManager androidStringManager4 = z3 ? androidStringManager : null;
                                                if (androidStringManager4 == null || androidStringManager4.get(R.string.edit_profile_business_name_instruction_label) == null) {
                                                    androidStringManager.get(R.string.set_name_instruction_label);
                                                }
                                                Integer num3 = (Integer) mutableState11.getValue();
                                                if (num3 != null && (intValue = num3.intValue()) <= 2) {
                                                    Integer valueOf = Integer.valueOf(intValue);
                                                    Integer valueOf2 = Integer.valueOf(intValue);
                                                    ArrayMap arrayMap = new ArrayMap(2);
                                                    arrayMap.put("count", valueOf);
                                                    arrayMap.put("limit", valueOf2);
                                                    Resources resources = androidStringManager.resources;
                                                    resources.getClass();
                                                    new MessageFormat(resources.getString(R.string.set_name_change_limit_footer)).format(arrayMap).getClass();
                                                }
                                                BlockersData.AnalyticsData.Source.PROFILE.getClass();
                                                realAccountOutboundNavigator.getClass();
                                                editProfile.getClass();
                                                realAccountOutboundNavigator.navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) realAccountOutboundNavigator.flowStarter, Flow$Type.DISPLAY_NAME, new DisplayNameFlowParameters(bool3, Integer.valueOf(intValue2), ByteString.EMPTY), editProfile, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
                                            } else {
                                                mutableState10.setValue(new EditProfileViewModel$DialogModel(androidStringManager.get(R.string.set_name_error_modal_title), androidStringManager.get(R.string.set_name_error_modal_message), androidStringManager.get(R.string.set_name_error_modal_positive_button_text)));
                                            }
                                        } else if (Intrinsics.areEqual(editProfileViewEvent, EditProfileViewEvent.AddPhotoClick.INSTANCE)) {
                                            if (z) {
                                                PublicProfile publicProfile2 = (PublicProfile) mutableState9.getValue();
                                                String str2 = publicProfile2 != null ? publicProfile2.photoUrl : null;
                                                boolean z4 = str2 == null || str2.length() == 0;
                                                analytics.track(new PersonalProfileManageAddPhoto(), null);
                                                realAccountOutboundNavigator.navigator.goTo(new ProfileScreens.HeaderMenuScreen(!z4));
                                            }
                                        } else if (editProfileViewEvent instanceof EditProfileViewEvent.OnDialogResult) {
                                            JobKt.launch$default(coroutineScope2, null, null, new NetworkFetcher$doFetch$2(tapToPayPresenter2, editProfileViewEvent, null, 13), 3);
                                        } else if (editProfileViewEvent instanceof EditProfileViewEvent.ViewModeToggled) {
                                            ViewMode viewMode = ((EditProfileViewEvent.ViewModeToggled) editProfileViewEvent).mode;
                                            int ordinal = viewMode.ordinal();
                                            if (ordinal == 0) {
                                                personalProfileEditScreen = PersonalProfileEditOpen.PersonalProfileEditScreen.EDIT;
                                            } else {
                                                if (ordinal != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                personalProfileEditScreen = PersonalProfileEditOpen.PersonalProfileEditScreen.PREVIEW;
                                            }
                                            analytics.track(new PersonalProfileEditOpen(personalProfileEditScreen), null);
                                            mutableState5.setValue(viewMode);
                                        } else {
                                            if (!(editProfileViewEvent instanceof EditProfileViewEvent.OnCloseUpdateNameDialog)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            mutableState10.setValue(null);
                                        }
                                    }
                                } else if (((EditProfileViewEvent.BusinessProfileClicked) editProfileViewEvent).isBusiness) {
                                    BlockersData.Flow.INSTANCE.getClass();
                                    analytics.track(new BusinessProfileManageDowngradeToPersonal(BusinessProfileManageDowngradeToPersonal.DowngradeToPersonalEntrypoint.EDIT_PROFILE, BlockersData.Flow.Companion.generateToken()), null);
                                    ((BetterNavigator.ScreenNavigator) tapToPayPresenter2.navigator).goTo(((RealFlowStarter) ((FlowStarter) tapToPayPresenter2.flowStarter)).startBusinessAccountDowngradeFlow(DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_EDIT_PROFILE_SECTION, editProfile));
                                } else {
                                    realAccountOutboundNavigator.getClass();
                                    editProfile.getClass();
                                    BlockersData.Flow.INSTANCE.getClass();
                                    String generateToken = BlockersData.Flow.Companion.generateToken();
                                    realAccountOutboundNavigator.analytics.track(new PersonalProfileManageUpgradeToBusiness(PersonalProfileManageUpgradeToBusiness.UpgradeToBusinessEntrypoint.PROFILE, generateToken), null);
                                    realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startBusinessAccountOnboardingFlow(editProfile, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_PROFILE, generateToken));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.$targetState = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(flowCollector, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DissolveWipeContentKt$DissolveWipeContent$1$1(Flow flow, Continuation continuation, TapToPayPresenter tapToPayPresenter, boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        super(2, continuation);
        this.$transitionStyle = flow;
        this.$waveProgress = tapToPayPresenter;
        this.$reverse = z;
        this.$displayedState$delegate = mutableState;
        this.$currentStyle$delegate = mutableState2;
        this.$isReverse$delegate = mutableState3;
        this.$incomingState$delegate = mutableState4;
        this.$isAnimating$delegate = mutableState5;
    }
}
