package com.squareup.cash.family.familyhub.presenters;

import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageSendCash;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.api.Dependent;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DependentDetailPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ SavingsScreenPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DependentDetailPresenter$models$3$1(SavingsScreenPresenter savingsScreenPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = savingsScreenPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        switch (i) {
            case 0:
                return new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 0);
            case 1:
                return new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 1);
            case 2:
                return new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 2);
            default:
                return new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DependentDetailPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 0;
        final SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        final int i3 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) savingsScreenPresenter.syncValueReader;
                    String str = ((DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy).dependentCustomerToken;
                    str.getClass();
                    StateFlow allValues = realFamilyAccountsManager.syncValueReader.getAllValues(AndroidSyncValueSpecs.FamilyAccount, new RecipientQueries$$ExternalSyntheticLambda0(realFamilyAccountsManager, 24));
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$3$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            Screen profileFor;
                            int i5 = i2;
                            SavingsScreenPresenter savingsScreenPresenter2 = savingsScreenPresenter;
                            switch (i5) {
                                case 0:
                                    Dependent dependent = (Dependent) obj2;
                                    DependentDetailScreen dependentDetailScreen = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                    if (dependent == null) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("family account with customer token: ", dependentDetailScreen.dependentCustomerToken, " is not found in FamilyAccountManager"));
                                        break;
                                    } else {
                                        savingsScreenPresenter2.analytics.track(new SponsoredAccountManageSendCash(PlatformKt.activeAccountToken(savingsScreenPresenter2.sessionManager), dependentDetailScreen.dependentCustomerToken), null);
                                        RealRouter realRouter = savingsScreenPresenter2.router;
                                        String str2 = dependent.sendCashCtaUrl;
                                        DependentDetailScreen dependentDetailScreen2 = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                        realRouter.route(new RoutingParams(dependentDetailScreen2, null, dependentDetailScreen2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                                        break;
                                    }
                                default:
                                    Recipient recipient = (Recipient) obj2;
                                    DependentDetailScreen dependentDetailScreen3 = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                    String str3 = recipient != null ? recipient.customerId : null;
                                    if (str3 == null) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("family account with customer token: ", dependentDetailScreen3.dependentCustomerToken, " is not found in CustomerStore"));
                                        break;
                                    } else {
                                        BetterNavigator.ScreenNavigator screenNavigator = savingsScreenPresenter2.navigator;
                                        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                                        profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(str3, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.ACTIVITY_OTHER, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, new DependentDetailScreen(dependentDetailScreen3.dependentCustomerToken), (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                                        screenNavigator.goTo(profileFor);
                                        break;
                                    }
                            }
                            return null;
                        }
                    };
                    this.label = 1;
                    Object collect = allValues.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(9, new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, str, 5), realFamilyAccountsManager), this);
                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager = (RealDependentControlStatusManager) savingsScreenPresenter.ioDispatcher;
                    this.label = 1;
                    if (realDependentControlStatusManager.getDependentControlStatus(false, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDependentControlStatusManager realDependentControlStatusManager2 = (RealDependentControlStatusManager) savingsScreenPresenter.screenType;
                    this.label = 1;
                    if (realDependentControlStatusManager2.getDependentControlStatus(false, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) savingsScreenPresenter.lastSeenBalance;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$3$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            Screen profileFor;
                            int i52 = i3;
                            SavingsScreenPresenter savingsScreenPresenter2 = savingsScreenPresenter;
                            switch (i52) {
                                case 0:
                                    Dependent dependent = (Dependent) obj2;
                                    DependentDetailScreen dependentDetailScreen = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                    if (dependent == null) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("family account with customer token: ", dependentDetailScreen.dependentCustomerToken, " is not found in FamilyAccountManager"));
                                        break;
                                    } else {
                                        savingsScreenPresenter2.analytics.track(new SponsoredAccountManageSendCash(PlatformKt.activeAccountToken(savingsScreenPresenter2.sessionManager), dependentDetailScreen.dependentCustomerToken), null);
                                        RealRouter realRouter = savingsScreenPresenter2.router;
                                        String str2 = dependent.sendCashCtaUrl;
                                        DependentDetailScreen dependentDetailScreen2 = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                        realRouter.route(new RoutingParams(dependentDetailScreen2, null, dependentDetailScreen2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                                        break;
                                    }
                                default:
                                    Recipient recipient = (Recipient) obj2;
                                    DependentDetailScreen dependentDetailScreen3 = (DependentDetailScreen) savingsScreenPresenter2.oneErrorPerAppSessionStrategy;
                                    String str3 = recipient != null ? recipient.customerId : null;
                                    if (str3 == null) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("family account with customer token: ", dependentDetailScreen3.dependentCustomerToken, " is not found in CustomerStore"));
                                        break;
                                    } else {
                                        BetterNavigator.ScreenNavigator screenNavigator = savingsScreenPresenter2.navigator;
                                        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                                        profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(str3, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.ACTIVITY_OTHER, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, new DependentDetailScreen(dependentDetailScreen3.dependentCustomerToken), (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                                        screenNavigator.goTo(profileFor);
                                        break;
                                    }
                            }
                            return null;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector2, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
