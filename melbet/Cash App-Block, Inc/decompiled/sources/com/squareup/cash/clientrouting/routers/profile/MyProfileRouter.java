package com.squareup.cash.clientrouting.routers.profile;

import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator$Factory$Impl;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.family.familyhub.screens.DependentDetailIntroductionDialog;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorResponse;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsEntryDialog;
import com.squareup.protos.cash.aegis.client_routes.DependentDetailsParams;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MyProfileRouter {
    public final RealAccountInboundNavigator accountInboundNavigator;
    public final CoroutineContext computationContext;
    public final RealFamilyProfileManager familyProfileManager;
    public final CoroutineContext ioContext;
    public final IntentLauncher launcher;
    public final Navigator navigator;
    public final AegisService service;
    public final AndroidStringManager stringManager;

    public MyProfileRouter(Navigator navigator, RealAccountInboundNavigator$Factory$Impl realAccountInboundNavigator$Factory$Impl, RealFamilyProfileManager realFamilyProfileManager, AndroidStringManager androidStringManager, AegisService aegisService, IntentLauncher intentLauncher, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        navigator.getClass();
        this.navigator = navigator;
        this.familyProfileManager = realFamilyProfileManager;
        this.stringManager = androidStringManager;
        this.service = aegisService;
        this.launcher = intentLauncher;
        this.ioContext = coroutineContext;
        this.computationContext = coroutineContext2;
        this.accountInboundNavigator = new RealAccountInboundNavigator(navigator, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToSponsorDetailScreen(ClientRoute.ViewFamilyAccountSponsor viewFamilyAccountSponsor, ContinuationImpl continuationImpl) {
        MyProfileRouter$navigateToSponsorDetailScreen$1 myProfileRouter$navigateToSponsorDetailScreen$1;
        int i;
        if (continuationImpl instanceof MyProfileRouter$navigateToSponsorDetailScreen$1) {
            myProfileRouter$navigateToSponsorDetailScreen$1 = (MyProfileRouter$navigateToSponsorDetailScreen$1) continuationImpl;
            int i2 = myProfileRouter$navigateToSponsorDetailScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                myProfileRouter$navigateToSponsorDetailScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = myProfileRouter$navigateToSponsorDetailScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myProfileRouter$navigateToSponsorDetailScreen$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewFamilyAccountSponsor, continuation, 23);
                    myProfileRouter$navigateToSponsorDetailScreen$1.label = 1;
                    obj = JobKt.withContext(this.ioContext, temporaryStorage$getDir$2, myProfileRouter$navigateToSponsorDetailScreen$1);
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
                this.navigator.goTo(new SponsorDetailScreen((Sponsor) obj));
                return Unit.INSTANCE;
            }
        }
        myProfileRouter$navigateToSponsorDetailScreen$1 = new MyProfileRouter$navigateToSponsorDetailScreen$1(this, continuationImpl);
        Object obj2 = myProfileRouter$navigateToSponsorDetailScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myProfileRouter$navigateToSponsorDetailScreen$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        this.navigator.goTo(new SponsorDetailScreen((Sponsor) obj2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (navigateToSponsorDetailScreen(r7, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewFamilyAccountSponsor viewFamilyAccountSponsor, ContinuationImpl continuationImpl) {
        MyProfileRouter$route$2 myProfileRouter$route$2;
        int i;
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse;
        if (continuationImpl instanceof MyProfileRouter$route$2) {
            myProfileRouter$route$2 = (MyProfileRouter$route$2) continuationImpl;
            int i2 = myProfileRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                myProfileRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = myProfileRouter$route$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myProfileRouter$route$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetFamilyAccountSponsorRequest getFamilyAccountSponsorRequest = new GetFamilyAccountSponsorRequest();
                    myProfileRouter$route$2.L$0 = viewFamilyAccountSponsor;
                    myProfileRouter$route$2.label = 1;
                    obj = this.service.getFamilyAccountSponsor(getFamilyAccountSponsorRequest, myProfileRouter$route$2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    viewFamilyAccountSponsor = myProfileRouter$route$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (getFamilyAccountSponsorResponse == null ? Intrinsics.areEqual(getFamilyAccountSponsorResponse.is_sponsor_led, Boolean.TRUE) : false) {
                    Sponsor sponsor = getFamilyAccountSponsorResponse.sponsor;
                    if ((sponsor != null ? sponsor.status : null) == SponsorshipState.PENDING) {
                        sponsor.getClass();
                        this.navigator.goTo(new SponsorLedInviteScreen(sponsor));
                        return Unit.INSTANCE;
                    }
                }
                myProfileRouter$route$2.L$0 = null;
                myProfileRouter$route$2.label = 2;
            }
        }
        myProfileRouter$route$2 = new MyProfileRouter$route$2(this, continuationImpl);
        Object obj3 = myProfileRouter$route$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myProfileRouter$route$2.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj3;
        getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (getFamilyAccountSponsorResponse == null ? Intrinsics.areEqual(getFamilyAccountSponsorResponse.is_sponsor_led, Boolean.TRUE) : false) {
        }
        myProfileRouter$route$2.L$0 = null;
        myProfileRouter$route$2.label = 2;
    }

    public final void showAccountIfNeeded() {
        if (this.familyProfileManager.familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount) {
            return;
        }
        this.accountInboundNavigator.showAccount();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewDependentWithParams viewDependentWithParams, ContinuationImpl continuationImpl) {
        MyProfileRouter$route$3 myProfileRouter$route$3;
        int i;
        DependentDetailsEntryDialog dependentDetailsEntryDialog;
        if (continuationImpl instanceof MyProfileRouter$route$3) {
            myProfileRouter$route$3 = (MyProfileRouter$route$3) continuationImpl;
            int i2 = myProfileRouter$route$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                myProfileRouter$route$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = myProfileRouter$route$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myProfileRouter$route$3.label;
                Continuation continuation = null;
                Navigator navigator = this.navigator;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator.goTo(new DependentDetailScreen(viewDependentWithParams.customerToken));
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewDependentWithParams, continuation, 24);
                    myProfileRouter$route$3.label = 1;
                    obj = JobKt.withContext(this.ioContext, temporaryStorage$getDir$2, myProfileRouter$route$3);
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
                dependentDetailsEntryDialog = ((DependentDetailsParams) obj).entryDialog;
                if (dependentDetailsEntryDialog != null) {
                    String str = dependentDetailsEntryDialog.title;
                    str.getClass();
                    String str2 = dependentDetailsEntryDialog.subtitle;
                    str2.getClass();
                    navigator.goTo(new DependentDetailIntroductionDialog(new Image(dependentDetailsEntryDialog.light_img_url, dependentDetailsEntryDialog.dark_img_url, 4), str, str2, this.stringManager.get(R.string.dependentdetail_introductiondialog_dismissbutton)));
                }
                return Unit.INSTANCE;
            }
        }
        myProfileRouter$route$3 = new MyProfileRouter$route$3(this, continuationImpl);
        Object obj2 = myProfileRouter$route$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myProfileRouter$route$3.label;
        Continuation continuation2 = null;
        Navigator navigator2 = this.navigator;
        if (i != 0) {
        }
        dependentDetailsEntryDialog = ((DependentDetailsParams) obj2).entryDialog;
        if (dependentDetailsEntryDialog != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewProfileWithParams viewProfileWithParams, ContinuationImpl continuationImpl) {
        MyProfileRouter$route$1 myProfileRouter$route$1;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof MyProfileRouter$route$1) {
            myProfileRouter$route$1 = (MyProfileRouter$route$1) continuationImpl;
            int i2 = myProfileRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                myProfileRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = myProfileRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = myProfileRouter$route$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.accountInboundNavigator.showAccount();
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewProfileWithParams, continuation, 25);
                    myProfileRouter$route$1.label = 1;
                    obj = JobKt.withContext(this.computationContext, temporaryStorage$getDir$2, myProfileRouter$route$1);
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
                AccountParams.EntryDialog entryDialog = ((AccountParams) obj).entryDialog;
                str = entryDialog == null ? entryDialog.subtitle : null;
                str2 = entryDialog == null ? entryDialog.confirm_button_text : null;
                if (str != null && str2 != null) {
                    this.navigator.goTo(new ProfileScreens.AccountSwitchInfoDialogScreen(null, str, str2));
                }
                return Unit.INSTANCE;
            }
        }
        myProfileRouter$route$1 = new MyProfileRouter$route$1(this, continuationImpl);
        Object obj2 = myProfileRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myProfileRouter$route$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AccountParams.EntryDialog entryDialog2 = ((AccountParams) obj2).entryDialog;
        if (entryDialog2 == null) {
        }
        if (entryDialog2 == null) {
        }
        if (str != null) {
            this.navigator.goTo(new ProfileScreens.AccountSwitchInfoDialogScreen(null, str, str2));
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewProfile viewProfile) {
        viewProfile.getClass();
        this.accountInboundNavigator.showAccount();
    }

    public final void route(ClientRoute.ViewProfileWithAccountSwitchOnboarding viewProfileWithAccountSwitchOnboarding) {
        viewProfileWithAccountSwitchOnboarding.getClass();
        RealAccountInboundNavigator realAccountInboundNavigator = this.accountInboundNavigator;
        realAccountInboundNavigator.showAccount();
        realAccountInboundNavigator.navigator.goTo(new AccountSwitcherScreen(AccountSwitchAccountViewSwitcher.Entrypoint.CLIENT_ROUTE, null, null));
    }

    public final void route(ClientRoute.ViewProfilePersonal viewProfilePersonal) {
        viewProfilePersonal.getClass();
        this.accountInboundNavigator.showAccount();
        this.navigator.goTo(ProfileScreens.AccountInfoScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewSecurityAndPrivacy viewSecurityAndPrivacy) {
        viewSecurityAndPrivacy.getClass();
        showAccountIfNeeded();
        this.navigator.goTo(new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.SECURITY));
    }

    public final void route(ClientRoute.ViewSecurity viewSecurity) {
        viewSecurity.getClass();
        showAccountIfNeeded();
        this.navigator.goTo(new ProfileScreens.SecurityScreen(null));
    }

    public final void route(ClientRoute.ViewSecurityLockSettings viewSecurityLockSettings) {
        viewSecurityLockSettings.getClass();
        showAccountIfNeeded();
        ProfileScreens.SecurityScreen securityScreen = new ProfileScreens.SecurityScreen(null);
        Navigator navigator = this.navigator;
        navigator.goTo(securityScreen);
        navigator.goTo(ProfileScreens.SecurityLockScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewPrivacy viewPrivacy) {
        viewPrivacy.getClass();
        showAccountIfNeeded();
        this.navigator.goTo(ProfileScreens.PrivacyScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewPin viewPin) {
        viewPin.getClass();
        showAccountIfNeeded();
        this.navigator.goTo(new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.SECURITY));
    }

    public final void route(ClientRoute.ViewNotificationPreferences viewNotificationPreferences) {
        viewNotificationPreferences.getClass();
        this.accountInboundNavigator.showAccount();
        this.navigator.goTo(ProfileScreens.NotificationsScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewSystemNotificationsSettings viewSystemNotificationsSettings) {
        viewSystemNotificationsSettings.getClass();
        this.accountInboundNavigator.showAccount();
        this.navigator.goTo(ProfileScreens.NotificationsScreen.INSTANCE);
        this.launcher.launchNotificationSettings();
    }

    public final void route(ClientRoute.ViewFamilyAccounts viewFamilyAccounts) {
        viewFamilyAccounts.getClass();
        ProtoAdapter protoAdapter = FamilyAccountsParameters.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewFamilyAccounts.familyAccountsParameters);
        decodeBase64.getClass();
        this.navigator.goTo(new FamilyHome((FamilyAccountsParameters) protoAdapter.decode(decodeBase64.toByteArray()), null, null, 6));
    }

    public final void route(ClientRoute.ViewDependent viewDependent) {
        viewDependent.getClass();
        this.navigator.goTo(new DependentDetailScreen(viewDependent.customerToken));
    }

    public final void route(ClientRoute.ViewEditProfile viewEditProfile) {
        viewEditProfile.getClass();
        this.accountInboundNavigator.navigator.goTo(EditProfile.INSTANCE);
    }

    public final void route(ClientRoute.ViewThemeSwitcher viewThemeSwitcher) {
        viewThemeSwitcher.getClass();
        this.navigator.goTo(new ThemeSwitcherScreen(ThemeSwitcherScreen.Source.DEEPLINK));
    }
}
