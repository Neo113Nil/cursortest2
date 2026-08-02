package com.squareup.cash.localization;

import androidx.lifecycle.Lifecycle;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenPreludeNavigator;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.localization.db.LocalizationConfigQueries$select$2;
import com.squareup.cash.localization.screens.LanguageDisclosureScreen;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.DisclosureAction;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceRequest;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class LanguageDisclosureSetupTeardown implements IoActivitySetupTeardown {
    public final CustomerProfileClientService appService;
    public final CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteGate;
    public final CashAccountDatabaseImpl database;
    public final RealInitialScreenPreludeNavigator initialScreenPreludeNavigator;
    public final KeyValue isLanguageDisclosureAcceptancePending;
    public final RealLocaleManager localeManager;
    public final Navigator navigator;
    public final SessionManager sessionManager;

    public final class MetroFactory {
        public final Provider appService;
        public final Provider cashAppLiteGate;
        public final Provider database;
        public final Provider initialScreenPreludeNavigator;
        public final Provider isLanguageDisclosureAcceptancePending;
        public final Provider localeManager;
        public final Provider sessionManager;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Object obj, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
            this.appService = provider;
            this.cashAppLiteGate = provider2;
            this.database = (Provider) obj;
            this.initialScreenPreludeNavigator = provider3;
            this.isLanguageDisclosureAcceptancePending = provider4;
            this.localeManager = provider5;
            this.sessionManager = provider6;
        }
    }

    public LanguageDisclosureSetupTeardown(CustomerProfileClientService customerProfileClientService, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator, KeyValue keyValue, RealLocaleManager realLocaleManager, SessionManager sessionManager, Navigator navigator) {
        navigator.getClass();
        this.appService = customerProfileClientService;
        this.cashAppLiteGate = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.database = cashAccountDatabaseImpl;
        this.initialScreenPreludeNavigator = realInitialScreenPreludeNavigator;
        this.isLanguageDisclosureAcceptancePending = keyValue;
        this.localeManager = realLocaleManager;
        this.sessionManager = sessionManager;
        this.navigator = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0106, code lost:
    
        if (r19.submitPendingAcceptance(r1, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r10, r2) != r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkDisclosure(LanguageDisclosureSetupTeardown languageDisclosureSetupTeardown, ContinuationImpl continuationImpl) {
        LanguageDisclosureSetupTeardown$checkDisclosure$1 languageDisclosureSetupTeardown$checkDisclosure$1;
        int i;
        Locale locale;
        LocalizationConfig localizationConfig;
        Locale locale2;
        LocalizationConfig.LanguageDisclosure languageDisclosure;
        if (continuationImpl instanceof LanguageDisclosureSetupTeardown$checkDisclosure$1) {
            languageDisclosureSetupTeardown$checkDisclosure$1 = (LanguageDisclosureSetupTeardown$checkDisclosure$1) continuationImpl;
            int i2 = languageDisclosureSetupTeardown$checkDisclosure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                languageDisclosureSetupTeardown$checkDisclosure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = languageDisclosureSetupTeardown$checkDisclosure$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = languageDisclosureSetupTeardown$checkDisclosure$1.label;
                boolean z = false;
                z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    locale = (Locale) languageDisclosureSetupTeardown.localeManager.resolvedLocale.$$delegate_0.getValue();
                    if (!languageDisclosureSetupTeardown.cashAppLiteGate.f$0) {
                        locale.getClass();
                        if (!Intrinsics.areEqual(locale.getLanguage(), "en")) {
                            RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator = languageDisclosureSetupTeardown.initialScreenPreludeNavigator;
                            languageDisclosureSetupTeardown$checkDisclosure$1.L$0 = locale;
                            languageDisclosureSetupTeardown$checkDisclosure$1.label = 1;
                            Object join = realInitialScreenPreludeNavigator.initialScreenLoaded.join(languageDisclosureSetupTeardown$checkDisclosure$1);
                            if (join != obj2) {
                                join = Unit.INSTANCE;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    locale = languageDisclosureSetupTeardown$checkDisclosure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        locale = languageDisclosureSetupTeardown$checkDisclosure$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        GpsConfigQueries gpsConfigQueries = languageDisclosureSetupTeardown.database.localizationConfigQueries;
                        gpsConfigQueries.getClass();
                        int i3 = LocalizationConfigQueries$select$2.$r8$clinit;
                        SqlDriver sqlDriver = gpsConfigQueries.driver;
                        TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2 = new TooltipBoxKt$$ExternalSyntheticLambda2(gpsConfigQueries, z ? (short) 1 : (short) 0);
                        sqlDriver.getClass();
                        LocalizationConfig config = ((com.squareup.cash.localization.db.LocalizationConfig) new SimpleQuery(2092935262, new String[]{"localizationConfig"}, sqlDriver, "LocalizationConfig.sq", "select", "SELECT config FROM localizationConfig", tooltipBoxKt$$ExternalSyntheticLambda2).executeAsOne()).getConfig();
                        KeyValue keyValue = languageDisclosureSetupTeardown.isLanguageDisclosureAcceptancePending;
                        languageDisclosureSetupTeardown$checkDisclosure$1.L$0 = locale;
                        languageDisclosureSetupTeardown$checkDisclosure$1.L$1 = config;
                        languageDisclosureSetupTeardown$checkDisclosure$1.label = 3;
                        Object obj3 = keyValue.get(languageDisclosureSetupTeardown$checkDisclosure$1);
                        if (obj3 != obj2) {
                            Locale locale3 = locale;
                            localizationConfig = config;
                            obj = obj3;
                            locale2 = locale3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    localizationConfig = languageDisclosureSetupTeardown$checkDisclosure$1.L$1;
                    locale2 = languageDisclosureSetupTeardown$checkDisclosure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        if (localizationConfig != null && (languageDisclosure = localizationConfig.language_disclosure) != null) {
                            z = Intrinsics.areEqual(languageDisclosure.accepted, Boolean.TRUE);
                        }
                        if (!z) {
                            languageDisclosureSetupTeardown.navigator.goTo(LanguageDisclosureScreen.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                    String languageTag = locale2.toLanguageTag();
                    languageTag.getClass();
                    languageDisclosureSetupTeardown$checkDisclosure$1.L$0 = null;
                    languageDisclosureSetupTeardown$checkDisclosure$1.L$1 = null;
                    languageDisclosureSetupTeardown$checkDisclosure$1.label = 4;
                }
                InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(languageDisclosureSetupTeardown.sessionManager.getOnboardedAccountStatus(), 28);
                languageDisclosureSetupTeardown$checkDisclosure$1.L$0 = locale;
                languageDisclosureSetupTeardown$checkDisclosure$1.label = 2;
            }
        }
        languageDisclosureSetupTeardown$checkDisclosure$1 = new LanguageDisclosureSetupTeardown$checkDisclosure$1(languageDisclosureSetupTeardown, continuationImpl);
        Object obj4 = languageDisclosureSetupTeardown$checkDisclosure$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = languageDisclosureSetupTeardown$checkDisclosure$1.label;
        boolean z2 = false;
        z2 = false;
        if (i != 0) {
        }
        InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$12 = new InviteContactsPresenter$filterContacts$$inlined$map$1(languageDisclosureSetupTeardown.sessionManager.getOnboardedAccountStatus(), 28);
        languageDisclosureSetupTeardown$checkDisclosure$1.L$0 = locale;
        languageDisclosureSetupTeardown$checkDisclosure$1.label = 2;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CoroutinesKt$until$2(3, lifecycle, this, (Continuation) null), 1);
        return StateFlowKt.noOpTeardown;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.isLanguageDisclosureAcceptancePending.set(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitPendingAcceptance(String str, ContinuationImpl continuationImpl) {
        LanguageDisclosureSetupTeardown$submitPendingAcceptance$1 languageDisclosureSetupTeardown$submitPendingAcceptance$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof LanguageDisclosureSetupTeardown$submitPendingAcceptance$1) {
            languageDisclosureSetupTeardown$submitPendingAcceptance$1 = (LanguageDisclosureSetupTeardown$submitPendingAcceptance$1) continuationImpl;
            int i2 = languageDisclosureSetupTeardown$submitPendingAcceptance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                languageDisclosureSetupTeardown$submitPendingAcceptance$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = languageDisclosureSetupTeardown$submitPendingAcceptance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = languageDisclosureSetupTeardown$submitPendingAcceptance$1.label;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Op.Companion companion = DisclosureAction.Companion;
                    UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = new UpdateDisclosureAcceptanceRequest(str, str2, 10);
                    languageDisclosureSetupTeardown$submitPendingAcceptance$1.label = 1;
                    obj = this.appService.updateDisclosureAcceptance(updateDisclosureAcceptanceRequest, languageDisclosureSetupTeardown$submitPendingAcceptance$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Boolean bool = Boolean.FALSE;
                languageDisclosureSetupTeardown$submitPendingAcceptance$1.label = 2;
            }
        }
        languageDisclosureSetupTeardown$submitPendingAcceptance$1 = new LanguageDisclosureSetupTeardown$submitPendingAcceptance$1(this, continuationImpl);
        Object obj2 = languageDisclosureSetupTeardown$submitPendingAcceptance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = languageDisclosureSetupTeardown$submitPendingAcceptance$1.label;
        String str22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
