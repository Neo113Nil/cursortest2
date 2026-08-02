package com.squareup.cash.initialscreenloader.backend;

import android.content.SharedPreferences;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.Lifecycle;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.RealSessionManager$updateSessionState$newOnboarded$1;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.MoshiPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CheckVersionResponse;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppVersionCheckerActivityWorker implements IoActivitySetupTeardown {
    public final AppService appService;
    public final RealInitialScreenPreludeNavigator initialScreenPreludeNavigator;
    public final Navigator navigator;
    public final MainActivity$navigatorSwitcher$1 navigatorSwitcher;
    public final OpenTheAppUserJourney openTheAppUserJourney;
    public final Signal signOutSignal;
    public final CoroutineContext uiContext;
    public final MoshiPreference updateRequiredPreference;

    public AppVersionCheckerActivityWorker(MoshiPreference moshiPreference, AppService appService, RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator, MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1, Signal signal, CoroutineContext coroutineContext, Navigator navigator, OpenTheAppUserJourney openTheAppUserJourney) {
        navigator.getClass();
        this.updateRequiredPreference = moshiPreference;
        this.appService = appService;
        this.initialScreenPreludeNavigator = realInitialScreenPreludeNavigator;
        this.navigatorSwitcher = mainActivity$navigatorSwitcher$1;
        this.signOutSignal = signal;
        this.uiContext = coroutineContext;
        this.navigator = navigator;
        this.openTheAppUserJourney = openTheAppUserJourney;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkVersion(AppVersionCheckerActivityWorker appVersionCheckerActivityWorker, ContinuationImpl continuationImpl) {
        AppVersionCheckerActivityWorker$checkVersion$1 appVersionCheckerActivityWorker$checkVersion$1;
        Object obj;
        Object obj2;
        int i;
        Object fromJson;
        int i2;
        CheckVersionResponse checkVersionResponse;
        MoshiPreference moshiPreference = appVersionCheckerActivityWorker.updateRequiredPreference;
        Moshi moshi = moshiPreference.moshi;
        SharedPreferences sharedPreferences = moshiPreference.preferences;
        if (continuationImpl instanceof AppVersionCheckerActivityWorker$checkVersion$1) {
            appVersionCheckerActivityWorker$checkVersion$1 = (AppVersionCheckerActivityWorker$checkVersion$1) continuationImpl;
            int i3 = appVersionCheckerActivityWorker$checkVersion$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                appVersionCheckerActivityWorker$checkVersion$1.label = i3 - PKIFailureInfo.systemUnavail;
                obj = appVersionCheckerActivityWorker$checkVersion$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appVersionCheckerActivityWorker$checkVersion$1.label;
                int i4 = 3;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String string2 = sharedPreferences.getString("update-required", null);
                    if (string2 != null) {
                        try {
                            fromJson = moshi.adapter(UpdateRequiredData.class, Util.NO_ANNOTATIONS, null).fromJson(string2);
                        } catch (IOException unused) {
                            MoshiPreference.SyntaxExceptionBehavior[] syntaxExceptionBehaviorArr = MoshiPreference.SyntaxExceptionBehavior.$VALUES;
                            moshiPreference.delete();
                        }
                        UpdateRequiredData updateRequiredData = (UpdateRequiredData) fromJson;
                        i2 = updateRequiredData == null ? 1 : 0;
                        if (i2 != 0) {
                            updateRequiredData.getClass();
                            String str = updateRequiredData.title;
                            String str2 = updateRequiredData.message;
                            appVersionCheckerActivityWorker$checkVersion$1.I$0 = i2;
                            appVersionCheckerActivityWorker$checkVersion$1.label = 1;
                            if (appVersionCheckerActivityWorker.showUpgradePrompt(str, str2, true, appVersionCheckerActivityWorker$checkVersion$1) == obj2) {
                                return obj2;
                            }
                        }
                    }
                    fromJson = null;
                    UpdateRequiredData updateRequiredData2 = (UpdateRequiredData) fromJson;
                    if (updateRequiredData2 == null) {
                    }
                    if (i2 != 0) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 || i == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = appVersionCheckerActivityWorker$checkVersion$1.I$0;
                        SafeTrace.throwOnFailure(obj);
                        checkVersionResponse = (CheckVersionResponse) obj;
                        if (checkVersionResponse == null) {
                            return Unit.INSTANCE;
                        }
                        String str3 = checkVersionResponse.message;
                        String str4 = checkVersionResponse.title;
                        CheckVersionResponse.Status status = checkVersionResponse.status;
                        if (status == null) {
                            status = ProtoDefaults.CHECK_VERSION_STATUS;
                        }
                        int ordinal = status.ordinal();
                        if (ordinal == 1) {
                            moshiPreference.delete();
                        } else if (ordinal == 2) {
                            moshiPreference.delete();
                            if (i2 == 0) {
                                appVersionCheckerActivityWorker$checkVersion$1.I$0 = i2;
                                appVersionCheckerActivityWorker$checkVersion$1.label = 3;
                                if (appVersionCheckerActivityWorker.showUpgradePrompt(str4, str3, false, appVersionCheckerActivityWorker$checkVersion$1) == obj2) {
                                    return obj2;
                                }
                            }
                        } else {
                            if (ordinal != 3) {
                                OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                                return null;
                            }
                            sharedPreferences.edit().putString("update-required", moshi.adapter(UpdateRequiredData.class, Util.NO_ANNOTATIONS, null).toJson(new UpdateRequiredData(str4, str3))).apply();
                            if (i2 == 0) {
                                appVersionCheckerActivityWorker$checkVersion$1.I$0 = i2;
                                appVersionCheckerActivityWorker$checkVersion$1.label = 4;
                                if (appVersionCheckerActivityWorker.showUpgradePrompt(str4, str3, true, appVersionCheckerActivityWorker$checkVersion$1) == obj2) {
                                    return obj2;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = appVersionCheckerActivityWorker$checkVersion$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Signal signal = appVersionCheckerActivityWorker.signOutSignal;
                RealSessionManager$updateSessionState$newOnboarded$1 realSessionManager$updateSessionState$newOnboarded$1 = new RealSessionManager$updateSessionState$newOnboarded$1(appVersionCheckerActivityWorker, continuation, i4);
                appVersionCheckerActivityWorker$checkVersion$1.I$0 = i2;
                appVersionCheckerActivityWorker$checkVersion$1.label = 2;
                obj = StateFlowKt.until(signal, realSessionManager$updateSessionState$newOnboarded$1, appVersionCheckerActivityWorker$checkVersion$1);
                if (obj == obj2) {
                    return obj2;
                }
                checkVersionResponse = (CheckVersionResponse) obj;
                if (checkVersionResponse == null) {
                }
            }
        }
        appVersionCheckerActivityWorker$checkVersion$1 = new AppVersionCheckerActivityWorker$checkVersion$1(appVersionCheckerActivityWorker, continuationImpl);
        obj = appVersionCheckerActivityWorker$checkVersion$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appVersionCheckerActivityWorker$checkVersion$1.label;
        int i42 = 3;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Signal signal2 = appVersionCheckerActivityWorker.signOutSignal;
        RealSessionManager$updateSessionState$newOnboarded$1 realSessionManager$updateSessionState$newOnboarded$12 = new RealSessionManager$updateSessionState$newOnboarded$1(appVersionCheckerActivityWorker, continuation2, i42);
        appVersionCheckerActivityWorker$checkVersion$1.I$0 = i2;
        appVersionCheckerActivityWorker$checkVersion$1.label = 2;
        obj = StateFlowKt.until(signal2, realSessionManager$updateSessionState$newOnboarded$12, appVersionCheckerActivityWorker$checkVersion$1);
        if (obj == obj2) {
        }
        checkVersionResponse = (CheckVersionResponse) obj;
        if (checkVersionResponse == null) {
        }
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new DataStoreImpl$data$1((Continuation) null, lifecycle, this, 27), 1);
        return StateFlowKt.noOpTeardown;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r11.uiContext, r0, r7) == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showUpgradePrompt(String str, String str2, boolean z, ContinuationImpl continuationImpl) {
        AppVersionCheckerActivityWorker$showUpgradePrompt$1 appVersionCheckerActivityWorker$showUpgradePrompt$1;
        int i;
        String str3;
        String str4;
        boolean z2;
        String str5;
        String str6;
        boolean z3;
        if (continuationImpl instanceof AppVersionCheckerActivityWorker$showUpgradePrompt$1) {
            appVersionCheckerActivityWorker$showUpgradePrompt$1 = (AppVersionCheckerActivityWorker$showUpgradePrompt$1) continuationImpl;
            int i2 = appVersionCheckerActivityWorker$showUpgradePrompt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appVersionCheckerActivityWorker$showUpgradePrompt$1.label = i2 - PKIFailureInfo.systemUnavail;
                AppVersionCheckerActivityWorker$showUpgradePrompt$1 appVersionCheckerActivityWorker$showUpgradePrompt$12 = appVersionCheckerActivityWorker$showUpgradePrompt$1;
                Object obj = appVersionCheckerActivityWorker$showUpgradePrompt$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appVersionCheckerActivityWorker$showUpgradePrompt$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        appVersionCheckerActivityWorker$showUpgradePrompt$12.L$0 = str;
                        appVersionCheckerActivityWorker$showUpgradePrompt$12.L$1 = str2;
                        appVersionCheckerActivityWorker$showUpgradePrompt$12.Z$0 = z;
                        appVersionCheckerActivityWorker$showUpgradePrompt$12.label = 1;
                        Object join = this.initialScreenPreludeNavigator.initialScreenLoaded.join(appVersionCheckerActivityWorker$showUpgradePrompt$12);
                        if (join != coroutineSingletons) {
                            join = Unit.INSTANCE;
                        }
                        if (join != coroutineSingletons) {
                            str5 = str;
                            str6 = str2;
                            z3 = z;
                        }
                        return coroutineSingletons;
                    }
                    str3 = str;
                    str4 = str2;
                    z2 = z;
                    CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$1 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z2, this, str3, str4, (Continuation) null, 3);
                    appVersionCheckerActivityWorker$showUpgradePrompt$12.L$0 = null;
                    appVersionCheckerActivityWorker$showUpgradePrompt$12.L$1 = null;
                    appVersionCheckerActivityWorker$showUpgradePrompt$12.Z$0 = z2;
                    appVersionCheckerActivityWorker$showUpgradePrompt$12.label = 2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = appVersionCheckerActivityWorker$showUpgradePrompt$12.Z$0;
                    str6 = appVersionCheckerActivityWorker$showUpgradePrompt$12.L$1;
                    String str7 = appVersionCheckerActivityWorker$showUpgradePrompt$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str5 = str7;
                }
                str4 = str6;
                str3 = str5;
                z2 = z3;
                CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$12 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z2, this, str3, str4, (Continuation) null, 3);
                appVersionCheckerActivityWorker$showUpgradePrompt$12.L$0 = null;
                appVersionCheckerActivityWorker$showUpgradePrompt$12.L$1 = null;
                appVersionCheckerActivityWorker$showUpgradePrompt$12.Z$0 = z2;
                appVersionCheckerActivityWorker$showUpgradePrompt$12.label = 2;
            }
        }
        appVersionCheckerActivityWorker$showUpgradePrompt$1 = new AppVersionCheckerActivityWorker$showUpgradePrompt$1(this, continuationImpl);
        AppVersionCheckerActivityWorker$showUpgradePrompt$1 appVersionCheckerActivityWorker$showUpgradePrompt$122 = appVersionCheckerActivityWorker$showUpgradePrompt$1;
        Object obj2 = appVersionCheckerActivityWorker$showUpgradePrompt$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appVersionCheckerActivityWorker$showUpgradePrompt$122.label;
        if (i != 0) {
        }
        str4 = str6;
        str3 = str5;
        z2 = z3;
        CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$122 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z2, this, str3, str4, (Continuation) null, 3);
        appVersionCheckerActivityWorker$showUpgradePrompt$122.L$0 = null;
        appVersionCheckerActivityWorker$showUpgradePrompt$122.L$1 = null;
        appVersionCheckerActivityWorker$showUpgradePrompt$122.Z$0 = z2;
        appVersionCheckerActivityWorker$showUpgradePrompt$122.label = 2;
    }
}
