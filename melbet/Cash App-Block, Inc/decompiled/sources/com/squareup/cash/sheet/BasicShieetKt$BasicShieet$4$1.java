package com.squareup.cash.sheet;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.platform.DerivedSize;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.savingsgoal.SavingsGoalRemoveRemove;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PersonalSettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.presenters.SavingsUpsellCardPresenter;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.security.presenters.PasswordResponseAdapter;
import com.squareup.cash.securityhub.presenters.ProtectionsSectionPresenter;
import com.squareup.cash.sensors.LifecycleSensorEvent;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.backend.real.RealShippingAddressRepository;
import com.squareup.cash.shopping.presenters.CashAppPayIncentiveSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingInfoSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsAutofillPresenter;
import com.squareup.cash.stablecoin.presenters.StablecoinHomePresenter;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BasicShieetKt$BasicShieet$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $onDismissRequest;
    public final /* synthetic */ int $r8$classId;
    public Object $state;
    public /* synthetic */ Object $visibilityScope;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicShieetKt$BasicShieet$4$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = obj;
        this.$visibilityScope = obj2;
        this.$onDismissRequest = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onDismissRequest;
        switch (i) {
            case 0:
                return new BasicShieetKt$BasicShieet$4$1((RealSheetState) this.$state, (AnimatedVisibilityScope) this.$visibilityScope, (Function0) obj2, continuation, 0);
            case 1:
                return new BasicShieetKt$BasicShieet$4$1((SavingsScreenPresenter) this.$state, (SavingsScreenViewEvent) this.$visibilityScope, (ShiftNotePresenter$models$1$1) obj2, continuation, 1);
            case 2:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$1 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (SavingsUpsellCardPresenter) obj2, 2);
                basicShieetKt$BasicShieet$4$1.$state = obj;
                return basicShieetKt$BasicShieet$4$1;
            case 3:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$12 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (LocalEditorialPresenter) obj2, 3);
                basicShieetKt$BasicShieet$4$12.$state = obj;
                return basicShieetKt$BasicShieet$4$12;
            case 4:
                return new BasicShieetKt$BasicShieet$4$1((ApiResult.Success) this.$state, (Function2) this.$visibilityScope, (BasePasswordPresenter) obj2, continuation, 4);
            case 5:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$13 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ErrorPresenter) obj2, 5);
                basicShieetKt$BasicShieet$4$13.$state = obj;
                return basicShieetKt$BasicShieet$4$13;
            case 6:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$14 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (LocalEditorialPresenter) obj2, 6);
                basicShieetKt$BasicShieet$4$14.$state = obj;
                return basicShieetKt$BasicShieet$4$14;
            case 7:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$15 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ProtectionsSectionPresenter) obj2, 7);
                basicShieetKt$BasicShieet$4$15.$state = obj;
                return basicShieetKt$BasicShieet$4$15;
            case 8:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$16 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (LocalEditorialPresenter) obj2, 8);
                basicShieetKt$BasicShieet$4$16.$state = obj;
                return basicShieetKt$BasicShieet$4$16;
            case 9:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$17 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (TaxReturnsPresenter) obj2, 9);
                basicShieetKt$BasicShieet$4$17.$state = obj;
                return basicShieetKt$BasicShieet$4$17;
            case 10:
                return new BasicShieetKt$BasicShieet$4$1((Sensor) this.$state, (MutableSharedFlow) this.$visibilityScope, (Function1) obj2, continuation, 10);
            case 11:
                return new BasicShieetKt$BasicShieet$4$1((MutableSharedFlow) this.$state, (Function1) this.$visibilityScope, (SensorEvent) obj2, continuation, 11);
            case 12:
                return new BasicShieetKt$BasicShieet$4$1((Flow) this.$state, (TimeToLiveSyncState) this.$visibilityScope, (JobImpl) obj2, continuation, 12);
            case 13:
                return new BasicShieetKt$BasicShieet$4$1((ShareSheetPresenter) this.$state, (ShareSheetViewEvent) this.$visibilityScope, (MutableState) obj2, continuation, 13);
            case 14:
                return new BasicShieetKt$BasicShieet$4$1((LocalEditorialPresenter) this.$state, (MutableState) this.$visibilityScope, (MutableState) obj2, continuation, 14);
            case 15:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$18 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (CashAppPayIncentiveSheetPresenter) obj2, 15);
                basicShieetKt$BasicShieet$4$18.$state = obj;
                return basicShieetKt$BasicShieet$4$18;
            case 16:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$19 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (InviteErrorPresenter) obj2, 16);
                basicShieetKt$BasicShieet$4$19.$state = obj;
                return basicShieetKt$BasicShieet$4$19;
            case 17:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$110 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (InviteErrorPresenter) obj2, 17);
                basicShieetKt$BasicShieet$4$110.$state = obj;
                return basicShieetKt$BasicShieet$4$110;
            case 18:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$111 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ShoppingInfoSheetPresenter) obj2, 18);
                basicShieetKt$BasicShieet$4$111.$state = obj;
                return basicShieetKt$BasicShieet$4$111;
            case 19:
                return new BasicShieetKt$BasicShieet$4$1((ShoppingWebPresenter) this.$state, (String) this.$visibilityScope, (ShoppingWebScreen) obj2, continuation, 19);
            case 20:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$112 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ShoppingWebPresenter) obj2, 20);
                basicShieetKt$BasicShieet$4$112.$state = obj;
                return basicShieetKt$BasicShieet$4$112;
            case 21:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$113 = new BasicShieetKt$BasicShieet$4$1((FinishSetupTileBadgeCounter) this.$visibilityScope, continuation, (MutableState) obj2, 21);
                basicShieetKt$BasicShieet$4$113.$state = obj;
                return basicShieetKt$BasicShieet$4$113;
            case 22:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$114 = new BasicShieetKt$BasicShieet$4$1((ShoppingWebPresenter) obj2, continuation, 22);
                basicShieetKt$BasicShieet$4$114.$visibilityScope = obj;
                return basicShieetKt$BasicShieet$4$114;
            case 23:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$115 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ErrorPresenter) obj2, 23);
                basicShieetKt$BasicShieet$4$115.$state = obj;
                return basicShieetKt$BasicShieet$4$115;
            case 24:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$116 = new BasicShieetKt$BasicShieet$4$1((ShoppingSettingsAutofillPresenter) obj2, continuation, 24);
                basicShieetKt$BasicShieet$4$116.$visibilityScope = obj;
                return basicShieetKt$BasicShieet$4$116;
            case 25:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$117 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (CardStudioUndoDialogPresenter) obj2, 25);
                basicShieetKt$BasicShieet$4$117.$state = obj;
                return basicShieetKt$BasicShieet$4$117;
            case 26:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$118 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (CardStudioUndoDialogPresenter) obj2, 26);
                basicShieetKt$BasicShieet$4$118.$state = obj;
                return basicShieetKt$BasicShieet$4$118;
            case 27:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$119 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (ErrorPresenter) obj2, 27);
                basicShieetKt$BasicShieet$4$119.$state = obj;
                return basicShieetKt$BasicShieet$4$119;
            case 28:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$120 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (InviteErrorPresenter) obj2, 28);
                basicShieetKt$BasicShieet$4$120.$state = obj;
                return basicShieetKt$BasicShieet$4$120;
            default:
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$121 = new BasicShieetKt$BasicShieet$4$1((Flow) this.$visibilityScope, continuation, (StablecoinHomePresenter) obj2, 29);
                basicShieetKt$BasicShieet$4$121.$state = obj;
                return basicShieetKt$BasicShieet$4$121;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((BasicShieetKt$BasicShieet$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object first;
        Object value;
        Object firstOrNull;
        Slots slots;
        String str;
        Object obj2;
        AccountSettingType$PersonalSettings accountSettingType$PersonalSettings;
        Object shippingAddress;
        int i = this.$r8$classId;
        int i2 = 16;
        int i3 = 4;
        int i4 = 6;
        int i5 = 27;
        boolean z = false;
        z = false;
        z = false;
        Object obj3 = this.$onDismissRequest;
        int i6 = 1;
        Continuation continuation = null;
        continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSheetState realSheetState = (RealSheetState) this.$state;
                    BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 = new BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0((AnimatedVisibilityScope) this.$visibilityScope, (Function0) obj3, z ? 1 : 0);
                    this.label = 1;
                    if (realSheetState.awaitDismissal(basicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) this.$state;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    savingsScreenPresenter.analytics.track(new SavingsGoalRemoveRemove(((SavingsScreenViewEvent.RemoveActiveGoal) ((SavingsScreenViewEvent) this.$visibilityScope)).goalToken), null);
                    this.label = 1;
                    if (SavingsScreenPresenter.access$removeActiveGoal(savingsScreenPresenter, (ShiftNotePresenter$models$1$1) obj3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651(coroutineScope, (SavingsUpsellCardPresenter) obj3, 12);
                    this.$state = null;
                    this.label = 1;
                    if (flow.collect(c00651, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006512 = new RingtoneView.AnonymousClass1.C00651(coroutineScope2, (LocalEditorialPresenter) obj3, 13);
                    this.$state = null;
                    this.label = 1;
                    if (flow2.collect(c006512, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                Object obj4 = ((ApiResult.Success) this.$state).response;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Long l = ((PasswordResponseAdapter) obj4).passwordVersion;
                    if (l != null) {
                        ((BasePasswordPresenter) obj3).passwordManager.updatePasswordVersion(l.longValue());
                    }
                    Function2 function2 = (Function2) this.$visibilityScope;
                    if (function2 == null) {
                        return null;
                    }
                    this.label = 1;
                    if (function2.invoke(obj4, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006513 = new RingtoneView.AnonymousClass1.C00651(coroutineScope3, (ErrorPresenter) obj3, 14);
                    this.$state = null;
                    this.label = 1;
                    if (flow3.collect(c006513, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006514 = new RingtoneView.AnonymousClass1.C00651(coroutineScope4, (LocalEditorialPresenter) obj3, 15);
                    this.$state = null;
                    this.label = 1;
                    if (flow4.collect(c006514, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006515 = new RingtoneView.AnonymousClass1.C00651(coroutineScope5, (ProtectionsSectionPresenter) obj3, i2);
                    this.$state = null;
                    this.label = 1;
                    if (flow5.collect(c006515, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$visibilityScope;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(i5, coroutineScope6, (LocalEditorialPresenter) obj3);
                    this.$state = null;
                    this.label = 1;
                    if (flow6.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006516 = new RingtoneView.AnonymousClass1.C00651(coroutineScope7, (TaxReturnsPresenter) obj3, 17);
                    this.$state = null;
                    this.label = 1;
                    if (flow7.collect(c006516, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Sensor) this.$state) == null) {
                        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$visibilityScope;
                        Object invoke = ((Function1) obj3).invoke(LifecycleSensorEvent.MissingSensor.INSTANCE);
                        this.label = 1;
                        if (mutableSharedFlow.emit(invoke, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) this.$state;
                    Object invoke2 = ((Function1) this.$visibilityScope).invoke(new LifecycleSensorEvent.Data((SensorEvent) obj3));
                    this.label = 1;
                    if (mutableSharedFlow2.emit(invoke2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) this.$visibilityScope;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new ChatInputView$Content$1$1$1(timeToLiveSyncState, continuation, i4), (Flow) this.$state);
                    this.label = 1;
                    first = FlowKt.first(flowKt__MergeKt$flatMapConcat$$inlined$map$1, this);
                    if (first == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                boolean booleanValue = ((Boolean) first).booleanValue();
                timeToLiveSyncState.lastAttemptedRefresh = timeToLiveSyncState.clock.millis();
                StateFlowImpl stateFlowImpl = timeToLiveSyncState.progress;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.compareAndSet(value, booleanValue ? SyncState$Progress.SUCCESS : SyncState$Progress.FAILURE));
                ((JobImpl) obj3).complete$1();
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) ((ShareSheetPresenter) this.$state).shareTargetsManager;
                    ShareTarget shareTarget = (ShareTarget) ((ShareSheetViewEvent.Share) ((ShareSheetViewEvent) this.$visibilityScope)).sharingOption.target;
                    Collection collection = (LinkedHashSet) ((LinkedHashMap) stuckPlayerDetector.stuckSuppressedDetector).get(shareTarget.getTitle());
                    if (collection == null) {
                        collection = EmptySet.INSTANCE;
                    }
                    ArrayDeque arrayDeque = new ArrayDeque(collection);
                    while (!arrayDeque.isEmpty()) {
                        String str2 = (String) arrayDeque.removeFirst();
                        HCaptcha hCaptcha = (HCaptcha) stuckPlayerDetector.player;
                        str2.getClass();
                        MutableSharedFlow mutableSharedFlow3 = (MutableSharedFlow) ((LinkedHashMap) hCaptcha.captchaVerifier).get(str2);
                        if (mutableSharedFlow3 != null) {
                            StateFlowKt.emitOrThrow(mutableSharedFlow3, Unit.INSTANCE);
                        }
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) stuckPlayerDetector.stuckPlayingNotEndingDetector;
                    if (linkedHashMap == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("targetPreparationStates");
                        throw null;
                    }
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1((Flow) MapsKt__MapsKt.getValue(linkedHashMap, shareTarget.getId()), new ProfileCropView.AnonymousClass3(stuckPlayerDetector, continuation, i2), 3), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, shareTarget, stuckPlayerDetector, z ? 1 : 0));
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(i3, (MutableState) obj3);
                    this.label = 1;
                    Object collect = transformLatest.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(shareSheetPresenter$models$1$1$5, i6), this);
                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$state;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) ((MutableState) this.$visibilityScope).getValue();
                    EditAutofillScreen editAutofillScreen = (EditAutofillScreen) localEditorialPresenter.clock;
                    String str3 = editAutofillScreen.shippingAddressId;
                    String str4 = editAutofillScreen.customerId;
                    MutableState mutableState = (MutableState) obj3;
                    OverridingUtil.AnonymousClass7 anonymousClass7 = new OverridingUtil.AnonymousClass7(i3, localEditorialPresenter, mutableState);
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(8, mutableState);
                    this.label = 1;
                    if (LocalEditorialPresenter.access$submitUpdatedInfo(localEditorialPresenter, autofillCombinedInfo, str3, str4, anonymousClass7, quickPayViewKt$QuickPay$1$1$1$2$1$3$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006517 = new RingtoneView.AnonymousClass1.C00651(coroutineScope8, (CashAppPayIncentiveSheetPresenter) obj3, 19);
                    this.$state = null;
                    this.label = 1;
                    if (flow8.collect(c006517, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006518 = new RingtoneView.AnonymousClass1.C00651(coroutineScope9, (InviteErrorPresenter) obj3, 20);
                    this.$state = null;
                    this.label = 1;
                    if (flow9.collect(c006518, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c006519 = new RingtoneView.AnonymousClass1.C00651(coroutineScope10, (InviteErrorPresenter) obj3, 21);
                    this.$state = null;
                    this.label = 1;
                    if (flow10.collect(c006519, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065110 = new RingtoneView.AnonymousClass1.C00651(coroutineScope11, (ShoppingInfoSheetPresenter) obj3, 22);
                    this.$state = null;
                    this.label = 1;
                    if (flow11.collect(c0065110, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.$state;
                RealBoostRepository realBoostRepository = shoppingWebPresenter.boostRepository;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow boostSlots = realBoostRepository.boostProvider.getBoostSlots(false);
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(boostSlots, this);
                    if (firstOrNull == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                List list = (List) firstOrNull;
                if (list != null && (slots = (Slots) CollectionsKt.firstOrNull(list)) != null && (str = slots.token) != null) {
                    ShoppingWebScreen shoppingWebScreen = (ShoppingWebScreen) obj3;
                    if (!str.equals((String) this.$visibilityScope)) {
                        return Unit.INSTANCE;
                    }
                    String flowToken = shoppingWebPresenter.boostAnalyticsHelper.getFlowToken();
                    Finish finish = new Finish(null);
                    String str5 = shoppingWebPresenter.initialActiveBoostToken;
                    ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
                    DerivedSize.Companion boostAppLocation = screenContext != null ? ShoppingWebPresenter.toBoostAppLocation(screenContext) : null;
                    ShoppingScreenContext screenContext2 = shoppingWebScreen.getScreenContext();
                    if (screenContext2 != null && ((screenContext2 instanceof ShoppingScreenContext.OffersTab) || (screenContext2 instanceof ShoppingScreenContext.OffersTimelineSheet))) {
                        continuation = shoppingWebPresenter.offersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA);
                    }
                    RealBoostRepository.selectBoost$default(realBoostRepository, finish, str5, boostAppLocation, flowToken, continuation, null, null, null, AppPresentation.AffiliateSite, null, null, 7904);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$visibilityScope;
                    ShoppingWebPresenter.AnonymousClass1.C00661 c00661 = new ShoppingWebPresenter.AnonymousClass1.C00661(coroutineScope12, (ShoppingWebPresenter) obj3);
                    this.$state = null;
                    this.label = 1;
                    if (flow12.collect(c00661, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = (FinishSetupTileBadgeCounter) this.$visibilityScope;
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$52 = new ShareSheetPresenter$models$1$1$5(coroutineScope13, (MutableState) obj3, i4);
                    this.$state = null;
                    this.label = 1;
                    if (finishSetupTileBadgeCounter.collect(shareSheetPresenter$models$1$1$52, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$visibilityScope;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager = ((ShoppingWebPresenter) obj3).settingsManager;
                    this.$visibilityScope = null;
                    this.$state = produceStateScope;
                    this.label = 1;
                    obj2 = realSettingsEligibilityManager.settings(this);
                    if (obj2 == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.$state;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded settingsLoaded = obj2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded ? (SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) obj2 : null;
                if (settingsLoaded != null && (accountSettingType$PersonalSettings = settingsLoaded.cache.personal) != null && (!accountSettingType$PersonalSettings.cache.isEmpty())) {
                    z = true;
                }
                produceStateScope.setValue(Boolean.valueOf(z));
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065111 = new RingtoneView.AnonymousClass1.C00651(coroutineScope14, (ErrorPresenter) obj3, 23);
                    this.$state = null;
                    this.label = 1;
                    if (flow13.collect(c0065111, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$visibilityScope;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShippingAddressRepository realShippingAddressRepository = ((ShoppingSettingsAutofillPresenter) obj3).shippingAddressRepository;
                    this.$visibilityScope = null;
                    this.$state = produceStateScope2;
                    this.label = 1;
                    shippingAddress = realShippingAddressRepository.getShippingAddress(this);
                    if (shippingAddress == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope2 = (ProduceStateScope) this.$state;
                    SafeTrace.throwOnFailure(obj);
                    shippingAddress = obj;
                }
                produceStateScope2.setValue(shippingAddress);
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065112 = new RingtoneView.AnonymousClass1.C00651(coroutineScope15, (CardStudioUndoDialogPresenter) obj3, 24);
                    this.$state = null;
                    this.label = 1;
                    if (flow14.collect(c0065112, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065113 = new RingtoneView.AnonymousClass1.C00651(coroutineScope16, (CardStudioUndoDialogPresenter) obj3, 25);
                    this.$state = null;
                    this.label = 1;
                    if (flow15.collect(c0065113, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065114 = new RingtoneView.AnonymousClass1.C00651(coroutineScope17, (ErrorPresenter) obj3, 26);
                    this.$state = null;
                    this.label = 1;
                    if (flow16.collect(c0065114, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065115 = new RingtoneView.AnonymousClass1.C00651(coroutineScope18, (InviteErrorPresenter) obj3, i5);
                    this.$state = null;
                    this.label = 1;
                    if (flow17.collect(c0065115, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$visibilityScope;
                    RingtoneView.AnonymousClass1.C00651 c0065116 = new RingtoneView.AnonymousClass1.C00651(coroutineScope19, (StablecoinHomePresenter) obj3, 28);
                    this.$state = null;
                    this.label = 1;
                    if (flow18.collect(c0065116, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicShieetKt$BasicShieet$4$1(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onDismissRequest = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicShieetKt$BasicShieet$4$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visibilityScope = flow;
        this.$onDismissRequest = obj;
    }
}
