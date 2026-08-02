package com.squareup.cash.gps.backend.real;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.d;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.cdf.gps.GpsConsentRequest;
import com.squareup.cash.cdf.gps.GpsEventTrigger;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.backend.api.GpsAnalyticsParamParsingError;
import com.squareup.cash.gps.backend.api.GpsLocalCacheError;
import com.squareup.cash.gps.backend.api.GpsNetworkEnvironmentError;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.cash.compass.api.CellTowerContext;
import com.squareup.protos.cash.compass.api.CompassService;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.cash.compass.api.GpsDataContext;
import com.squareup.protos.cash.compass.api.LocationAttributes;
import com.squareup.protos.cash.compass.api.Platform;
import com.squareup.protos.cash.compass.api.SetGpsConsentStatusRequest;
import com.squareup.protos.cash.compass.api.WifiContext;
import com.squareup.protos.cash.compass.api.WriteGpsDataRequest;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealGpsLocationManager {
    public final Analytics analytics;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final AndroidClock clock;
    public final ForcedLazyKt$forcedLazy$1 deviceId;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final Instrument$Adapter gpsConfigStore;
    public final AndroidLocationProvider locationProvider;
    public final RealNetworkEnvironmentCollector networkEnvironmentCollector;
    public final PermissionChecker permissionChecker;
    public final CompassService service;
    public final SessionManager sessionManager;
    public final RealUuidGenerator uuidGenerator;

    public RealGpsLocationManager(Analytics analytics, ErrorReporter errorReporter, PermissionChecker permissionChecker, CompassService compassService, AndroidLocationProvider androidLocationProvider, RealNetworkEnvironmentCollector realNetworkEnvironmentCollector, AndroidClock androidClock, RealUuidGenerator realUuidGenerator, SessionManager sessionManager, AppForegroundStateProvider appForegroundStateProvider, ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1, Instrument$Adapter instrument$Adapter, FeatureFlagManager featureFlagManager) {
        analytics.getClass();
        errorReporter.getClass();
        permissionChecker.getClass();
        compassService.getClass();
        androidLocationProvider.getClass();
        realNetworkEnvironmentCollector.getClass();
        androidClock.getClass();
        realUuidGenerator.getClass();
        sessionManager.getClass();
        appForegroundStateProvider.getClass();
        forcedLazyKt$forcedLazy$1.getClass();
        featureFlagManager.getClass();
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.permissionChecker = permissionChecker;
        this.service = compassService;
        this.locationProvider = androidLocationProvider;
        this.networkEnvironmentCollector = realNetworkEnvironmentCollector;
        this.clock = androidClock;
        this.uuidGenerator = realUuidGenerator;
        this.sessionManager = sessionManager;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.deviceId = forcedLazyKt$forcedLazy$1;
        this.gpsConfigStore = instrument$Adapter;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectConsentStatus$real(String str, String str2, ContinuationImpl continuationImpl) {
        RealGpsLocationManager$collectConsentStatus$1 realGpsLocationManager$collectConsentStatus$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean checkPermission;
        GpsConsentStatus gpsConsentStatus;
        String str3;
        String str4;
        RealGpsLocationManager realGpsLocationManager;
        Object preciseEnabled;
        GpsConsentStatus gpsConsentStatus2;
        RealGpsLocationManager realGpsLocationManager2;
        String str5;
        String str6;
        GpsConsentStatus gpsConsentStatus3;
        boolean z;
        boolean z2;
        boolean z3;
        GpsConsentStatus gpsConsentStatus4;
        String str7;
        String str8;
        String str9;
        boolean booleanValue;
        GpsConsentStatus gpsConsentStatus5;
        boolean z4;
        ErrorReporter errorReporter;
        String str10;
        GpsEventTrigger gpsEventTrigger;
        Instrument$Adapter instrument$Adapter = this.gpsConfigStore;
        CoroutineContext coroutineContext = (CoroutineContext) instrument$Adapter.cash_instrument_typeAdapter;
        if (continuationImpl instanceof RealGpsLocationManager$collectConsentStatus$1) {
            realGpsLocationManager$collectConsentStatus$1 = (RealGpsLocationManager$collectConsentStatus$1) continuationImpl;
            int i2 = realGpsLocationManager$collectConsentStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsLocationManager$collectConsentStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealGpsLocationManager$collectConsentStatus$1 realGpsLocationManager$collectConsentStatus$12 = realGpsLocationManager$collectConsentStatus$1;
                Object obj = realGpsLocationManager$collectConsentStatus$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsLocationManager$collectConsentStatus$12.label;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                PermissionChecker permissionChecker = this.permissionChecker;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GpsConsentStatus gpsConsentStatus6 = permissionChecker.hasBackgroundLocation() ? GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS : permissionChecker.hasLocation() ? GpsConsentStatus.GPS_CONSENT_STATUS_ALLOW_ONCE_OR_WHILE_USING_APP : GpsConsentStatus.GPS_CONSENT_STATUS_DENIED;
                    checkPermission = permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION");
                    realGpsLocationManager$collectConsentStatus$12.L$0 = str;
                    realGpsLocationManager$collectConsentStatus$12.L$1 = str2;
                    realGpsLocationManager$collectConsentStatus$12.L$2 = gpsConsentStatus6;
                    realGpsLocationManager$collectConsentStatus$12.L$3 = this;
                    realGpsLocationManager$collectConsentStatus$12.Z$0 = checkPermission;
                    realGpsLocationManager$collectConsentStatus$12.label = 1;
                    Enum consentStatus = instrument$Adapter.getConsentStatus(realGpsLocationManager$collectConsentStatus$12);
                    if (consentStatus != coroutineSingletons) {
                        gpsConsentStatus = gpsConsentStatus6;
                        obj = consentStatus;
                        str3 = str2;
                        str4 = str;
                        realGpsLocationManager = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        checkPermission = realGpsLocationManager$collectConsentStatus$12.Z$0;
                        gpsConsentStatus2 = realGpsLocationManager$collectConsentStatus$12.L$4;
                        realGpsLocationManager2 = realGpsLocationManager$collectConsentStatus$12.L$3;
                        gpsConsentStatus3 = realGpsLocationManager$collectConsentStatus$12.L$2;
                        str6 = realGpsLocationManager$collectConsentStatus$12.L$1;
                        String str11 = realGpsLocationManager$collectConsentStatus$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str5 = str11;
                        Boolean bool = (Boolean) obj;
                        realGpsLocationManager2.getClass();
                        z = gpsConsentStatus2 == gpsConsentStatus3 || !Intrinsics.areEqual(bool, Boolean.valueOf(checkPermission));
                        if (z) {
                            SetGpsConsentStatusRequest setGpsConsentStatusRequest = new SetGpsConsentStatusRequest((String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), gpsConsentStatus3, Platform.PLATFORM_ANDROID, new Long(this.clock.millis()), Boolean.valueOf(checkPermission), str5, ByteString.EMPTY);
                            String str12 = str5;
                            realGpsLocationManager$collectConsentStatus$12.L$0 = str12;
                            realGpsLocationManager$collectConsentStatus$12.L$1 = str6;
                            realGpsLocationManager$collectConsentStatus$12.L$2 = gpsConsentStatus3;
                            realGpsLocationManager$collectConsentStatus$12.L$3 = null;
                            realGpsLocationManager$collectConsentStatus$12.L$4 = null;
                            realGpsLocationManager$collectConsentStatus$12.Z$0 = checkPermission;
                            realGpsLocationManager$collectConsentStatus$12.Z$1 = z;
                            realGpsLocationManager$collectConsentStatus$12.label = 3;
                            Object updateGpsConsentStatus = this.service.updateGpsConsentStatus(setGpsConsentStatusRequest, realGpsLocationManager$collectConsentStatus$12);
                            if (updateGpsConsentStatus != coroutineSingletons) {
                                GpsConsentStatus gpsConsentStatus7 = gpsConsentStatus3;
                                z2 = z;
                                obj = updateGpsConsentStatus;
                                z3 = checkPermission;
                                gpsConsentStatus4 = gpsConsentStatus7;
                                str7 = str6;
                                str8 = str12;
                                if (((ApiResult) obj) instanceof ApiResult.Success) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        boolean z5 = realGpsLocationManager$collectConsentStatus$12.Z$1;
                        boolean z6 = realGpsLocationManager$collectConsentStatus$12.Z$0;
                        GpsConsentStatus gpsConsentStatus8 = realGpsLocationManager$collectConsentStatus$12.L$2;
                        String str13 = realGpsLocationManager$collectConsentStatus$12.L$1;
                        String str14 = realGpsLocationManager$collectConsentStatus$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        z2 = z5;
                        gpsConsentStatus4 = gpsConsentStatus8;
                        str8 = str14;
                        z3 = z6;
                        str7 = str13;
                        if (((ApiResult) obj) instanceof ApiResult.Success) {
                            realGpsLocationManager$collectConsentStatus$12.L$0 = str8;
                            realGpsLocationManager$collectConsentStatus$12.L$1 = str7;
                            realGpsLocationManager$collectConsentStatus$12.L$2 = gpsConsentStatus4;
                            realGpsLocationManager$collectConsentStatus$12.L$3 = null;
                            realGpsLocationManager$collectConsentStatus$12.L$4 = null;
                            realGpsLocationManager$collectConsentStatus$12.Z$0 = z3;
                            realGpsLocationManager$collectConsentStatus$12.Z$1 = z2;
                            realGpsLocationManager$collectConsentStatus$12.label = 4;
                            String str15 = str7;
                            obj = JobKt.withContext(coroutineContext, new InteractiveCardState$animateLock$2(instrument$Adapter, gpsConsentStatus4, z3, (Continuation) null, 9), realGpsLocationManager$collectConsentStatus$12);
                            if (obj != coroutineSingletons) {
                                str9 = str15;
                                booleanValue = ((Boolean) obj).booleanValue();
                                ErrorReporter errorReporter2 = this.errorReporter;
                                if (!booleanValue) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = realGpsLocationManager$collectConsentStatus$12.Z$3;
                        gpsConsentStatus5 = realGpsLocationManager$collectConsentStatus$12.L$6;
                        errorReporter = realGpsLocationManager$collectConsentStatus$12.L$5;
                        str10 = realGpsLocationManager$collectConsentStatus$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        errorReporter.report(new GpsLocalCacheError("Failed to update consent status " + gpsConsentStatus5 + " and precise status " + z4 + " to local cache " + obj + " for eventToken " + str10), defaultSamplingStrategy);
                        return Unit.INSTANCE;
                    }
                    boolean z7 = realGpsLocationManager$collectConsentStatus$12.Z$1;
                    z3 = realGpsLocationManager$collectConsentStatus$12.Z$0;
                    GpsConsentStatus gpsConsentStatus9 = realGpsLocationManager$collectConsentStatus$12.L$2;
                    String str16 = realGpsLocationManager$collectConsentStatus$12.L$1;
                    str8 = realGpsLocationManager$collectConsentStatus$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str9 = str16;
                    z2 = z7;
                    gpsConsentStatus4 = gpsConsentStatus9;
                    booleanValue = ((Boolean) obj).booleanValue();
                    ErrorReporter errorReporter22 = this.errorReporter;
                    if (!booleanValue) {
                        if (str9 != null) {
                            int ordinal = gpsConsentStatus4.ordinal();
                            GpsConsentRequest.GpsConsentStatus gpsConsentStatus10 = ordinal != 1 ? ordinal != 3 ? GpsConsentRequest.GpsConsentStatus.DENIED : GpsConsentRequest.GpsConsentStatus.WHILE_USING_APP : GpsConsentRequest.GpsConsentStatus.ALWAYS;
                            try {
                                gpsEventTrigger = GpsEventTrigger.valueOf(str8);
                            } catch (IllegalArgumentException unused) {
                                errorReporter22.report(new GpsAnalyticsParamParsingError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse analytics enum: GpsConsentRequest.GpsEventTrigger. Invalid value: ", str8, ". Reason: enum value not matching.")), defaultSamplingStrategy);
                                gpsEventTrigger = null;
                            }
                            this.analytics.track(new GpsConsentRequest(gpsConsentStatus10, permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION"), gpsEventTrigger, str9), null);
                        }
                        return Unit.INSTANCE;
                    }
                    realGpsLocationManager$collectConsentStatus$12.L$0 = null;
                    realGpsLocationManager$collectConsentStatus$12.L$1 = str9;
                    realGpsLocationManager$collectConsentStatus$12.L$2 = null;
                    realGpsLocationManager$collectConsentStatus$12.L$3 = null;
                    realGpsLocationManager$collectConsentStatus$12.L$4 = null;
                    realGpsLocationManager$collectConsentStatus$12.L$5 = errorReporter22;
                    realGpsLocationManager$collectConsentStatus$12.L$6 = gpsConsentStatus4;
                    realGpsLocationManager$collectConsentStatus$12.Z$0 = z3;
                    realGpsLocationManager$collectConsentStatus$12.Z$1 = z2;
                    realGpsLocationManager$collectConsentStatus$12.Z$3 = z3;
                    realGpsLocationManager$collectConsentStatus$12.label = 5;
                    obj = JobKt.withContext(coroutineContext, new RealProfileManager$profileOrNull$2(instrument$Adapter, null, 18), realGpsLocationManager$collectConsentStatus$12);
                    if (obj != coroutineSingletons) {
                        gpsConsentStatus5 = gpsConsentStatus4;
                        z4 = z3;
                        errorReporter = errorReporter22;
                        str10 = str9;
                        errorReporter.report(new GpsLocalCacheError("Failed to update consent status " + gpsConsentStatus5 + " and precise status " + z4 + " to local cache " + obj + " for eventToken " + str10), defaultSamplingStrategy);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                checkPermission = realGpsLocationManager$collectConsentStatus$12.Z$0;
                realGpsLocationManager = realGpsLocationManager$collectConsentStatus$12.L$3;
                gpsConsentStatus = realGpsLocationManager$collectConsentStatus$12.L$2;
                str3 = realGpsLocationManager$collectConsentStatus$12.L$1;
                str4 = realGpsLocationManager$collectConsentStatus$12.L$0;
                SafeTrace.throwOnFailure(obj);
                GpsConsentStatus gpsConsentStatus11 = (GpsConsentStatus) obj;
                realGpsLocationManager$collectConsentStatus$12.L$0 = str4;
                realGpsLocationManager$collectConsentStatus$12.L$1 = str3;
                realGpsLocationManager$collectConsentStatus$12.L$2 = gpsConsentStatus;
                realGpsLocationManager$collectConsentStatus$12.L$3 = realGpsLocationManager;
                realGpsLocationManager$collectConsentStatus$12.L$4 = gpsConsentStatus11;
                realGpsLocationManager$collectConsentStatus$12.Z$0 = checkPermission;
                realGpsLocationManager$collectConsentStatus$12.label = 2;
                preciseEnabled = instrument$Adapter.getPreciseEnabled(realGpsLocationManager$collectConsentStatus$12);
                if (preciseEnabled != coroutineSingletons) {
                    RealGpsLocationManager realGpsLocationManager3 = realGpsLocationManager;
                    gpsConsentStatus2 = gpsConsentStatus11;
                    obj = preciseEnabled;
                    realGpsLocationManager2 = realGpsLocationManager3;
                    str5 = str4;
                    str6 = str3;
                    gpsConsentStatus3 = gpsConsentStatus;
                    Boolean bool2 = (Boolean) obj;
                    realGpsLocationManager2.getClass();
                    if (gpsConsentStatus2 == gpsConsentStatus3) {
                    }
                    if (z) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        realGpsLocationManager$collectConsentStatus$1 = new RealGpsLocationManager$collectConsentStatus$1(this, continuationImpl);
        RealGpsLocationManager$collectConsentStatus$1 realGpsLocationManager$collectConsentStatus$122 = realGpsLocationManager$collectConsentStatus$1;
        Object obj2 = realGpsLocationManager$collectConsentStatus$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsLocationManager$collectConsentStatus$122.label;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        PermissionChecker permissionChecker2 = this.permissionChecker;
        if (i != 0) {
        }
        GpsConsentStatus gpsConsentStatus112 = (GpsConsentStatus) obj2;
        realGpsLocationManager$collectConsentStatus$122.L$0 = str4;
        realGpsLocationManager$collectConsentStatus$122.L$1 = str3;
        realGpsLocationManager$collectConsentStatus$122.L$2 = gpsConsentStatus;
        realGpsLocationManager$collectConsentStatus$122.L$3 = realGpsLocationManager;
        realGpsLocationManager$collectConsentStatus$122.L$4 = gpsConsentStatus112;
        realGpsLocationManager$collectConsentStatus$122.Z$0 = checkPermission;
        realGpsLocationManager$collectConsentStatus$122.label = 2;
        preciseEnabled = instrument$Adapter.getPreciseEnabled(realGpsLocationManager$collectConsentStatus$122);
        if (preciseEnabled != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (collectConsentStatus$real(r7, r8, r11) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (collectLocation$real(r7, r8, r9, r10, r11) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectGpsLocation(String str, String str2, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        RealGpsLocationManager$collectGpsLocation$1 realGpsLocationManager$collectGpsLocation$1;
        int i;
        if (continuationImpl instanceof RealGpsLocationManager$collectGpsLocation$1) {
            realGpsLocationManager$collectGpsLocation$1 = (RealGpsLocationManager$collectGpsLocation$1) continuationImpl;
            int i2 = realGpsLocationManager$collectGpsLocation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsLocationManager$collectGpsLocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealGpsLocationManager$collectGpsLocation$1 realGpsLocationManager$collectGpsLocation$12 = realGpsLocationManager$collectGpsLocation$1;
                Object obj = realGpsLocationManager$collectGpsLocation$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsLocationManager$collectGpsLocation$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realGpsLocationManager$collectGpsLocation$12.L$0 = str;
                    realGpsLocationManager$collectGpsLocation$12.L$1 = str2;
                    realGpsLocationManager$collectGpsLocation$12.Z$0 = z;
                    realGpsLocationManager$collectGpsLocation$12.Z$1 = z2;
                    realGpsLocationManager$collectGpsLocation$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = realGpsLocationManager$collectGpsLocation$12.Z$1;
                    z = realGpsLocationManager$collectGpsLocation$12.Z$0;
                    str2 = realGpsLocationManager$collectGpsLocation$12.L$1;
                    str = realGpsLocationManager$collectGpsLocation$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                realGpsLocationManager$collectGpsLocation$12.L$0 = null;
                realGpsLocationManager$collectGpsLocation$12.L$1 = null;
                realGpsLocationManager$collectGpsLocation$12.Z$0 = z;
                realGpsLocationManager$collectGpsLocation$12.Z$1 = z2;
                realGpsLocationManager$collectGpsLocation$12.label = 2;
            }
        }
        realGpsLocationManager$collectGpsLocation$1 = new RealGpsLocationManager$collectGpsLocation$1(this, continuationImpl);
        RealGpsLocationManager$collectGpsLocation$1 realGpsLocationManager$collectGpsLocation$122 = realGpsLocationManager$collectGpsLocation$1;
        Object obj3 = realGpsLocationManager$collectGpsLocation$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsLocationManager$collectGpsLocation$122.label;
        if (i != 0) {
        }
        realGpsLocationManager$collectGpsLocation$122.L$0 = null;
        realGpsLocationManager$collectGpsLocation$122.L$1 = null;
        realGpsLocationManager$collectGpsLocation$122.Z$0 = z;
        realGpsLocationManager$collectGpsLocation$122.Z$1 = z2;
        realGpsLocationManager$collectGpsLocation$122.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015c, code lost:
    
        if (r0 != r3) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023e A[Catch: Exception -> 0x0285, TryCatch #2 {Exception -> 0x0285, blocks: (B:59:0x0215, B:62:0x0236, B:64:0x023e, B:66:0x0248, B:71:0x0263, B:73:0x0269, B:78:0x027a, B:80:0x028b, B:81:0x0298, B:90:0x021d, B:93:0x0224, B:96:0x022c, B:98:0x0234), top: B:58:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263 A[Catch: Exception -> 0x0285, TryCatch #2 {Exception -> 0x0285, blocks: (B:59:0x0215, B:62:0x0236, B:64:0x023e, B:66:0x0248, B:71:0x0263, B:73:0x0269, B:78:0x027a, B:80:0x028b, B:81:0x0298, B:90:0x021d, B:93:0x0224, B:96:0x022c, B:98:0x0234), top: B:58:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027a A[Catch: Exception -> 0x0285, TryCatch #2 {Exception -> 0x0285, blocks: (B:59:0x0215, B:62:0x0236, B:64:0x023e, B:66:0x0248, B:71:0x0263, B:73:0x0269, B:78:0x027a, B:80:0x028b, B:81:0x0298, B:90:0x021d, B:93:0x0224, B:96:0x022c, B:98:0x0234), top: B:58:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028b A[Catch: Exception -> 0x0285, TryCatch #2 {Exception -> 0x0285, blocks: (B:59:0x0215, B:62:0x0236, B:64:0x023e, B:66:0x0248, B:71:0x0263, B:73:0x0269, B:78:0x027a, B:80:0x028b, B:81:0x0298, B:90:0x021d, B:93:0x0224, B:96:0x022c, B:98:0x0234), top: B:58:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.squareup.protos.cash.compass.api.CellTowerContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectLocation$real(String str, String str2, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        RealGpsLocationManager$collectLocation$1 realGpsLocationManager$collectLocation$1;
        int i;
        Object obj;
        int i2;
        boolean z3;
        boolean z4;
        String str3;
        String str4;
        RealGpsLocationManager realGpsLocationManager;
        RealGpsLocationManager realGpsLocationManager2;
        String str5;
        boolean z5;
        String str6;
        GpsConsentStatus gpsConsentStatus;
        int i3;
        String str7;
        String str8;
        boolean z6;
        int i4;
        int i5;
        Location location;
        long millis;
        GpsDataContext.Environment environment;
        Instrument$Adapter instrument$Adapter;
        Object obj2;
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        WifiInfo wifiInfo;
        WifiInfo wifiInfo2;
        String str9;
        String str10;
        WifiContext wifiContext;
        String str11;
        CellTowerContext cellTowerContext;
        Object obj3;
        int i6;
        int i7;
        boolean z7;
        Object withContext;
        if (continuationImpl instanceof RealGpsLocationManager$collectLocation$1) {
            realGpsLocationManager$collectLocation$1 = (RealGpsLocationManager$collectLocation$1) continuationImpl;
            int i8 = realGpsLocationManager$collectLocation$1.label;
            if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                realGpsLocationManager$collectLocation$1.label = i8 - PKIFailureInfo.systemUnavail;
                Object obj4 = realGpsLocationManager$collectLocation$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGpsLocationManager$collectLocation$1.label;
                PermissionChecker permissionChecker = this.permissionChecker;
                Instrument$Adapter instrument$Adapter2 = this.gpsConfigStore;
                switch (i) {
                    case 0:
                        obj = null;
                        SafeTrace.throwOnFailure(obj4);
                        i2 = (permissionChecker.hasLocation() || permissionChecker.hasBackgroundLocation()) ? 1 : 0;
                        realGpsLocationManager$collectLocation$1.L$0 = str;
                        realGpsLocationManager$collectLocation$1.L$1 = str2;
                        realGpsLocationManager$collectLocation$1.L$2 = this;
                        z3 = z;
                        realGpsLocationManager$collectLocation$1.Z$0 = z3;
                        z4 = z2;
                        realGpsLocationManager$collectLocation$1.Z$1 = z4;
                        realGpsLocationManager$collectLocation$1.I$0 = i2;
                        realGpsLocationManager$collectLocation$1.label = 1;
                        Object locationUpdatedAt = instrument$Adapter2.getLocationUpdatedAt(realGpsLocationManager$collectLocation$1);
                        if (locationUpdatedAt != obj5) {
                            str3 = str;
                            obj4 = locationUpdatedAt;
                            str4 = str2;
                            realGpsLocationManager = this;
                            Long l = (Long) obj4;
                            long millis2 = realGpsLocationManager.clock.millis();
                            Duration.Companion companion = Duration.Companion;
                            long longValue = (l == null ? l.longValue() : 0L) + Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) realGpsLocationManager.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes.INSTANCE)).value, DurationUnit.MINUTES));
                            if ((z3 || millis2 >= longValue) && i2 != 0) {
                                if (z4) {
                                    realGpsLocationManager$collectLocation$1.L$0 = str3;
                                    realGpsLocationManager$collectLocation$1.L$1 = str4;
                                    realGpsLocationManager$collectLocation$1.L$2 = this;
                                    realGpsLocationManager$collectLocation$1.Z$0 = z3;
                                    realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                    realGpsLocationManager$collectLocation$1.I$0 = i2;
                                    realGpsLocationManager$collectLocation$1.label = 2;
                                    obj4 = instrument$Adapter2.getConsentStatus(realGpsLocationManager$collectLocation$1);
                                    if (obj4 != obj5) {
                                        realGpsLocationManager2 = this;
                                        str5 = str4;
                                        z5 = z3;
                                        str6 = str3;
                                        gpsConsentStatus = (GpsConsentStatus) obj4;
                                        realGpsLocationManager$collectLocation$1.L$0 = str6;
                                        realGpsLocationManager$collectLocation$1.L$1 = str5;
                                        realGpsLocationManager$collectLocation$1.L$2 = realGpsLocationManager2;
                                        realGpsLocationManager$collectLocation$1.L$3 = gpsConsentStatus;
                                        realGpsLocationManager$collectLocation$1.Z$0 = z5;
                                        realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                        realGpsLocationManager$collectLocation$1.I$0 = i2;
                                        realGpsLocationManager$collectLocation$1.label = 3;
                                        obj4 = instrument$Adapter2.getPreciseEnabled(realGpsLocationManager$collectLocation$1);
                                        break;
                                    }
                                }
                                i3 = 1;
                                String str12 = str3;
                                str7 = str4;
                                if (i3 != 0) {
                                    realGpsLocationManager$collectLocation$1.L$0 = str12;
                                    realGpsLocationManager$collectLocation$1.L$1 = str7;
                                    realGpsLocationManager$collectLocation$1.L$2 = null;
                                    realGpsLocationManager$collectLocation$1.L$3 = null;
                                    realGpsLocationManager$collectLocation$1.Z$0 = z3;
                                    realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                    realGpsLocationManager$collectLocation$1.I$0 = i2;
                                    realGpsLocationManager$collectLocation$1.I$1 = i3;
                                    realGpsLocationManager$collectLocation$1.label = 4;
                                    Object currentLocation = this.locationProvider.currentLocation(realGpsLocationManager$collectLocation$1);
                                    if (currentLocation != obj5) {
                                        str8 = str12;
                                        obj4 = currentLocation;
                                        z6 = z3;
                                        i4 = i2;
                                        i5 = i3;
                                        String str13 = str7;
                                        location = (Location) obj4;
                                        if (location != null) {
                                            AndroidClock androidClock = this.clock;
                                            millis = androidClock.millis();
                                            int ordinal = ((AppForegroundState) ((RealAppForegroundStateProvider) this.appForegroundStateProvider).appForegroundState.$$delegate_0.getValue()).ordinal();
                                            if (ordinal == 0) {
                                                environment = GpsDataContext.Environment.FOREGROUND;
                                            } else {
                                                if (ordinal != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return obj;
                                                }
                                                environment = GpsDataContext.Environment.BACKGROUND;
                                            }
                                            GpsDataContext.Environment environment2 = environment;
                                            RealNetworkEnvironmentCollector realNetworkEnvironmentCollector = this.networkEnvironmentCollector;
                                            PermissionChecker permissionChecker2 = realNetworkEnvironmentCollector.permissionChecker;
                                            ErrorReporter errorReporter = realNetworkEnvironmentCollector.errorReporter;
                                            Application application = realNetworkEnvironmentCollector.context;
                                            boolean checkPermission = permissionChecker2.checkPermission("android.permission.ACCESS_FINE_LOCATION");
                                            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                            if (checkPermission) {
                                                try {
                                                    Object systemService = application.getSystemService("connectivity");
                                                    systemService.getClass();
                                                    connectivityManager = (ConnectivityManager) systemService;
                                                    instrument$Adapter = instrument$Adapter2;
                                                } catch (Exception e) {
                                                    e = e;
                                                    instrument$Adapter = instrument$Adapter2;
                                                }
                                                try {
                                                    activeNetwork = connectivityManager.getActiveNetwork();
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    obj2 = obj5;
                                                    errorReporter.report(new GpsNetworkEnvironmentError("Failed to collect WiFi context", e), defaultSamplingStrategy);
                                                    wifiContext = null;
                                                    if (realNetworkEnvironmentCollector.permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                                                    }
                                                    cellTowerContext = null;
                                                    Float f = new Float((float) location.getLatitude());
                                                    Float f2 = new Float((float) location.getLongitude());
                                                    Long l2 = new Long(millis);
                                                    this.uuidGenerator.getClass();
                                                    WriteGpsDataRequest writeGpsDataRequest = new WriteGpsDataRequest(f, f2, new GpsDataContext(l2, RealUuidGenerator.generate().toString(), (String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), androidClock.timeZone().getID(), str8, str13, environment2), new LocationAttributes(new Float(location.getAccuracy()), location.getAltitude(), location.getAltitudeAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.isMock(), location.getGpsTime(), location.getGpsTimeSinceBoot(), new Long(androidClock.elapsedRealtime())), wifiContext, cellTowerContext, ByteString.EMPTY);
                                                    realGpsLocationManager$collectLocation$1.L$0 = null;
                                                    realGpsLocationManager$collectLocation$1.L$1 = null;
                                                    realGpsLocationManager$collectLocation$1.L$2 = null;
                                                    realGpsLocationManager$collectLocation$1.L$3 = null;
                                                    realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                                    realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                                    realGpsLocationManager$collectLocation$1.I$0 = i4;
                                                    realGpsLocationManager$collectLocation$1.I$1 = i5;
                                                    realGpsLocationManager$collectLocation$1.I$2 = 0;
                                                    realGpsLocationManager$collectLocation$1.J$0 = millis;
                                                    realGpsLocationManager$collectLocation$1.label = 5;
                                                    obj4 = this.service.updateGpsLocation(writeGpsDataRequest, realGpsLocationManager$collectLocation$1);
                                                    obj3 = obj2;
                                                    if (obj4 == obj3) {
                                                    }
                                                }
                                                if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasTransport(1)) {
                                                    TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                                                    if (transportInfo instanceof WifiInfo) {
                                                        wifiInfo = (WifiInfo) transportInfo;
                                                        List availableNetworks = realNetworkEnvironmentCollector.getAvailableNetworks();
                                                        if (wifiInfo == null) {
                                                            wifiInfo2 = wifiInfo;
                                                            String ssid = wifiInfo2.getSSID();
                                                            if (ssid != null) {
                                                                str11 = StringsKt.removeSuffix(StringsKt.removePrefix("\"", ssid), "\"");
                                                                str9 = str11.equals("<unknown ssid>") ? null : str11;
                                                            }
                                                            str11 = null;
                                                        } else {
                                                            wifiInfo2 = wifiInfo;
                                                        }
                                                        if (wifiInfo2 == null) {
                                                            String bssid = wifiInfo2.getBSSID();
                                                            if (bssid == null || bssid.equals("02:00:00:00:00:00")) {
                                                                bssid = null;
                                                            }
                                                            str10 = bssid;
                                                        } else {
                                                            str10 = null;
                                                        }
                                                        wifiContext = new WifiContext(str9, str10, wifiInfo2 == null ? Integer.valueOf(wifiInfo2.getRssi()) : null, wifiInfo2 == null ? Integer.valueOf(wifiInfo2.getFrequency()) : null, availableNetworks);
                                                        obj2 = obj5;
                                                        if (realNetworkEnvironmentCollector.permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                                                            try {
                                                                Object systemService2 = application.getSystemService("phone");
                                                                systemService2.getClass();
                                                                List<CellInfo> allCellInfo = ((TelephonyManager) systemService2).getAllCellInfo();
                                                                if (allCellInfo == null) {
                                                                    cellTowerContext = new CellTowerContext(EmptyList.INSTANCE);
                                                                    errorReporter = errorReporter;
                                                                } else {
                                                                    ?? access$toCellTowerContext = d.access$toCellTowerContext(allCellInfo);
                                                                    cellTowerContext = access$toCellTowerContext;
                                                                    errorReporter = access$toCellTowerContext;
                                                                }
                                                            } catch (Exception e3) {
                                                                errorReporter.report(new GpsNetworkEnvironmentError("Failed to collect cell tower context", e3), defaultSamplingStrategy);
                                                            }
                                                            Float f3 = new Float((float) location.getLatitude());
                                                            Float f22 = new Float((float) location.getLongitude());
                                                            Long l22 = new Long(millis);
                                                            this.uuidGenerator.getClass();
                                                            WriteGpsDataRequest writeGpsDataRequest2 = new WriteGpsDataRequest(f3, f22, new GpsDataContext(l22, RealUuidGenerator.generate().toString(), (String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), androidClock.timeZone().getID(), str8, str13, environment2), new LocationAttributes(new Float(location.getAccuracy()), location.getAltitude(), location.getAltitudeAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.isMock(), location.getGpsTime(), location.getGpsTimeSinceBoot(), new Long(androidClock.elapsedRealtime())), wifiContext, cellTowerContext, ByteString.EMPTY);
                                                            realGpsLocationManager$collectLocation$1.L$0 = null;
                                                            realGpsLocationManager$collectLocation$1.L$1 = null;
                                                            realGpsLocationManager$collectLocation$1.L$2 = null;
                                                            realGpsLocationManager$collectLocation$1.L$3 = null;
                                                            realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                                            realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                                            realGpsLocationManager$collectLocation$1.I$0 = i4;
                                                            realGpsLocationManager$collectLocation$1.I$1 = i5;
                                                            realGpsLocationManager$collectLocation$1.I$2 = 0;
                                                            realGpsLocationManager$collectLocation$1.J$0 = millis;
                                                            realGpsLocationManager$collectLocation$1.label = 5;
                                                            obj4 = this.service.updateGpsLocation(writeGpsDataRequest2, realGpsLocationManager$collectLocation$1);
                                                            obj3 = obj2;
                                                            if (obj4 == obj3) {
                                                                return obj3;
                                                            }
                                                            i6 = 0;
                                                            i7 = i4;
                                                            z7 = z4;
                                                            if ((((ApiResult) obj4) instanceof ApiResult.Success) && z6) {
                                                                realGpsLocationManager$collectLocation$1.L$0 = null;
                                                                realGpsLocationManager$collectLocation$1.L$1 = null;
                                                                realGpsLocationManager$collectLocation$1.L$2 = null;
                                                                realGpsLocationManager$collectLocation$1.L$3 = null;
                                                                realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                                                realGpsLocationManager$collectLocation$1.Z$1 = z7;
                                                                realGpsLocationManager$collectLocation$1.I$0 = i7;
                                                                realGpsLocationManager$collectLocation$1.I$1 = i5;
                                                                realGpsLocationManager$collectLocation$1.I$2 = i6;
                                                                realGpsLocationManager$collectLocation$1.J$0 = millis;
                                                                realGpsLocationManager$collectLocation$1.label = 6;
                                                                Instrument$Adapter instrument$Adapter3 = instrument$Adapter;
                                                                withContext = JobKt.withContext((CoroutineContext) instrument$Adapter3.cash_instrument_typeAdapter, new Hero3DCardViewKt$rotateDragFlow$2(instrument$Adapter3, millis, null, 5), realGpsLocationManager$collectLocation$1);
                                                                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                                    withContext = Unit.INSTANCE;
                                                                }
                                                                if (withContext == obj3) {
                                                                    return obj3;
                                                                }
                                                            }
                                                        }
                                                        cellTowerContext = null;
                                                        Float f32 = new Float((float) location.getLatitude());
                                                        Float f222 = new Float((float) location.getLongitude());
                                                        Long l222 = new Long(millis);
                                                        this.uuidGenerator.getClass();
                                                        WriteGpsDataRequest writeGpsDataRequest22 = new WriteGpsDataRequest(f32, f222, new GpsDataContext(l222, RealUuidGenerator.generate().toString(), (String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), androidClock.timeZone().getID(), str8, str13, environment2), new LocationAttributes(new Float(location.getAccuracy()), location.getAltitude(), location.getAltitudeAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.isMock(), location.getGpsTime(), location.getGpsTimeSinceBoot(), new Long(androidClock.elapsedRealtime())), wifiContext, cellTowerContext, ByteString.EMPTY);
                                                        realGpsLocationManager$collectLocation$1.L$0 = null;
                                                        realGpsLocationManager$collectLocation$1.L$1 = null;
                                                        realGpsLocationManager$collectLocation$1.L$2 = null;
                                                        realGpsLocationManager$collectLocation$1.L$3 = null;
                                                        realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                                        realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                                        realGpsLocationManager$collectLocation$1.I$0 = i4;
                                                        realGpsLocationManager$collectLocation$1.I$1 = i5;
                                                        realGpsLocationManager$collectLocation$1.I$2 = 0;
                                                        realGpsLocationManager$collectLocation$1.J$0 = millis;
                                                        realGpsLocationManager$collectLocation$1.label = 5;
                                                        obj4 = this.service.updateGpsLocation(writeGpsDataRequest22, realGpsLocationManager$collectLocation$1);
                                                        obj3 = obj2;
                                                        if (obj4 == obj3) {
                                                        }
                                                    }
                                                }
                                                wifiInfo = null;
                                                List availableNetworks2 = realNetworkEnvironmentCollector.getAvailableNetworks();
                                                if (wifiInfo == null) {
                                                }
                                                if (wifiInfo2 == null) {
                                                }
                                                wifiContext = new WifiContext(str9, str10, wifiInfo2 == null ? Integer.valueOf(wifiInfo2.getRssi()) : null, wifiInfo2 == null ? Integer.valueOf(wifiInfo2.getFrequency()) : null, availableNetworks2);
                                                obj2 = obj5;
                                                if (realNetworkEnvironmentCollector.permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                                                }
                                                cellTowerContext = null;
                                                Float f322 = new Float((float) location.getLatitude());
                                                Float f2222 = new Float((float) location.getLongitude());
                                                Long l2222 = new Long(millis);
                                                this.uuidGenerator.getClass();
                                                WriteGpsDataRequest writeGpsDataRequest222 = new WriteGpsDataRequest(f322, f2222, new GpsDataContext(l2222, RealUuidGenerator.generate().toString(), (String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), androidClock.timeZone().getID(), str8, str13, environment2), new LocationAttributes(new Float(location.getAccuracy()), location.getAltitude(), location.getAltitudeAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.isMock(), location.getGpsTime(), location.getGpsTimeSinceBoot(), new Long(androidClock.elapsedRealtime())), wifiContext, cellTowerContext, ByteString.EMPTY);
                                                realGpsLocationManager$collectLocation$1.L$0 = null;
                                                realGpsLocationManager$collectLocation$1.L$1 = null;
                                                realGpsLocationManager$collectLocation$1.L$2 = null;
                                                realGpsLocationManager$collectLocation$1.L$3 = null;
                                                realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                                realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                                realGpsLocationManager$collectLocation$1.I$0 = i4;
                                                realGpsLocationManager$collectLocation$1.I$1 = i5;
                                                realGpsLocationManager$collectLocation$1.I$2 = 0;
                                                realGpsLocationManager$collectLocation$1.J$0 = millis;
                                                realGpsLocationManager$collectLocation$1.label = 5;
                                                obj4 = this.service.updateGpsLocation(writeGpsDataRequest222, realGpsLocationManager$collectLocation$1);
                                                obj3 = obj2;
                                                if (obj4 == obj3) {
                                                }
                                            } else {
                                                obj2 = obj5;
                                                instrument$Adapter = instrument$Adapter2;
                                            }
                                            wifiContext = null;
                                            if (realNetworkEnvironmentCollector.permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                                            }
                                            cellTowerContext = null;
                                            Float f3222 = new Float((float) location.getLatitude());
                                            Float f22222 = new Float((float) location.getLongitude());
                                            Long l22222 = new Long(millis);
                                            this.uuidGenerator.getClass();
                                            WriteGpsDataRequest writeGpsDataRequest2222 = new WriteGpsDataRequest(f3222, f22222, new GpsDataContext(l22222, RealUuidGenerator.generate().toString(), (String) this.deviceId.$$delegate_0.getValue(), PlatformKt.appTokenOrNull(this.sessionManager), androidClock.timeZone().getID(), str8, str13, environment2), new LocationAttributes(new Float(location.getAccuracy()), location.getAltitude(), location.getAltitudeAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.isMock(), location.getGpsTime(), location.getGpsTimeSinceBoot(), new Long(androidClock.elapsedRealtime())), wifiContext, cellTowerContext, ByteString.EMPTY);
                                            realGpsLocationManager$collectLocation$1.L$0 = null;
                                            realGpsLocationManager$collectLocation$1.L$1 = null;
                                            realGpsLocationManager$collectLocation$1.L$2 = null;
                                            realGpsLocationManager$collectLocation$1.L$3 = null;
                                            realGpsLocationManager$collectLocation$1.Z$0 = z6;
                                            realGpsLocationManager$collectLocation$1.Z$1 = z4;
                                            realGpsLocationManager$collectLocation$1.I$0 = i4;
                                            realGpsLocationManager$collectLocation$1.I$1 = i5;
                                            realGpsLocationManager$collectLocation$1.I$2 = 0;
                                            realGpsLocationManager$collectLocation$1.J$0 = millis;
                                            realGpsLocationManager$collectLocation$1.label = 5;
                                            obj4 = this.service.updateGpsLocation(writeGpsDataRequest2222, realGpsLocationManager$collectLocation$1);
                                            obj3 = obj2;
                                            if (obj4 == obj3) {
                                            }
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            i3 = 0;
                            String str122 = str3;
                            str7 = str4;
                            if (i3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        return obj5;
                    case 1:
                        obj = null;
                        i2 = realGpsLocationManager$collectLocation$1.I$0;
                        boolean z8 = realGpsLocationManager$collectLocation$1.Z$1;
                        z3 = realGpsLocationManager$collectLocation$1.Z$0;
                        RealGpsLocationManager realGpsLocationManager3 = realGpsLocationManager$collectLocation$1.L$2;
                        str4 = realGpsLocationManager$collectLocation$1.L$1;
                        str3 = realGpsLocationManager$collectLocation$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        z4 = z8;
                        realGpsLocationManager = realGpsLocationManager3;
                        Long l3 = (Long) obj4;
                        long millis22 = realGpsLocationManager.clock.millis();
                        Duration.Companion companion2 = Duration.Companion;
                        long longValue2 = (l3 == null ? l3.longValue() : 0L) + Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) realGpsLocationManager.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes.INSTANCE)).value, DurationUnit.MINUTES));
                        if (z3) {
                            break;
                        }
                        if (z4) {
                        }
                        i3 = 1;
                        String str1222 = str3;
                        str7 = str4;
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        obj = null;
                        i2 = realGpsLocationManager$collectLocation$1.I$0;
                        boolean z9 = realGpsLocationManager$collectLocation$1.Z$1;
                        z3 = realGpsLocationManager$collectLocation$1.Z$0;
                        RealGpsLocationManager realGpsLocationManager4 = realGpsLocationManager$collectLocation$1.L$2;
                        str4 = realGpsLocationManager$collectLocation$1.L$1;
                        str3 = realGpsLocationManager$collectLocation$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        realGpsLocationManager2 = realGpsLocationManager4;
                        z4 = z9;
                        str5 = str4;
                        z5 = z3;
                        str6 = str3;
                        gpsConsentStatus = (GpsConsentStatus) obj4;
                        realGpsLocationManager$collectLocation$1.L$0 = str6;
                        realGpsLocationManager$collectLocation$1.L$1 = str5;
                        realGpsLocationManager$collectLocation$1.L$2 = realGpsLocationManager2;
                        realGpsLocationManager$collectLocation$1.L$3 = gpsConsentStatus;
                        realGpsLocationManager$collectLocation$1.Z$0 = z5;
                        realGpsLocationManager$collectLocation$1.Z$1 = z4;
                        realGpsLocationManager$collectLocation$1.I$0 = i2;
                        realGpsLocationManager$collectLocation$1.label = 3;
                        obj4 = instrument$Adapter2.getPreciseEnabled(realGpsLocationManager$collectLocation$1);
                        break;
                    case 3:
                        i2 = realGpsLocationManager$collectLocation$1.I$0;
                        z4 = realGpsLocationManager$collectLocation$1.Z$1;
                        z5 = realGpsLocationManager$collectLocation$1.Z$0;
                        gpsConsentStatus = realGpsLocationManager$collectLocation$1.L$3;
                        RealGpsLocationManager realGpsLocationManager5 = realGpsLocationManager$collectLocation$1.L$2;
                        obj = null;
                        str5 = realGpsLocationManager$collectLocation$1.L$1;
                        str6 = realGpsLocationManager$collectLocation$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        realGpsLocationManager2 = realGpsLocationManager5;
                        Boolean bool = (Boolean) obj4;
                        GpsConsentStatus gpsConsentStatus2 = permissionChecker.hasBackgroundLocation() ? GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS : permissionChecker.hasLocation() ? GpsConsentStatus.GPS_CONSENT_STATUS_ALLOW_ONCE_OR_WHILE_USING_APP : GpsConsentStatus.GPS_CONSENT_STATUS_DENIED;
                        boolean checkPermission2 = permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION");
                        realGpsLocationManager2.getClass();
                        if (gpsConsentStatus == gpsConsentStatus2 && Intrinsics.areEqual(bool, Boolean.valueOf(checkPermission2))) {
                            str3 = str6;
                            z3 = z5;
                            str4 = str5;
                            i3 = 0;
                            String str12222 = str3;
                            str7 = str4;
                            if (i3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        str3 = str6;
                        z3 = z5;
                        str4 = str5;
                        i3 = 1;
                        String str122222 = str3;
                        str7 = str4;
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        i5 = realGpsLocationManager$collectLocation$1.I$1;
                        i4 = realGpsLocationManager$collectLocation$1.I$0;
                        z4 = realGpsLocationManager$collectLocation$1.Z$1;
                        boolean z10 = realGpsLocationManager$collectLocation$1.Z$0;
                        str7 = realGpsLocationManager$collectLocation$1.L$1;
                        String str14 = realGpsLocationManager$collectLocation$1.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        obj = null;
                        z6 = z10;
                        str8 = str14;
                        String str132 = str7;
                        location = (Location) obj4;
                        if (location != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        long j = realGpsLocationManager$collectLocation$1.J$0;
                        i6 = realGpsLocationManager$collectLocation$1.I$2;
                        int i9 = realGpsLocationManager$collectLocation$1.I$1;
                        i7 = realGpsLocationManager$collectLocation$1.I$0;
                        z7 = realGpsLocationManager$collectLocation$1.Z$1;
                        z6 = realGpsLocationManager$collectLocation$1.Z$0;
                        SafeTrace.throwOnFailure(obj4);
                        millis = j;
                        instrument$Adapter = instrument$Adapter2;
                        i5 = i9;
                        obj3 = obj5;
                        if (((ApiResult) obj4) instanceof ApiResult.Success) {
                            realGpsLocationManager$collectLocation$1.L$0 = null;
                            realGpsLocationManager$collectLocation$1.L$1 = null;
                            realGpsLocationManager$collectLocation$1.L$2 = null;
                            realGpsLocationManager$collectLocation$1.L$3 = null;
                            realGpsLocationManager$collectLocation$1.Z$0 = z6;
                            realGpsLocationManager$collectLocation$1.Z$1 = z7;
                            realGpsLocationManager$collectLocation$1.I$0 = i7;
                            realGpsLocationManager$collectLocation$1.I$1 = i5;
                            realGpsLocationManager$collectLocation$1.I$2 = i6;
                            realGpsLocationManager$collectLocation$1.J$0 = millis;
                            realGpsLocationManager$collectLocation$1.label = 6;
                            Instrument$Adapter instrument$Adapter32 = instrument$Adapter;
                            withContext = JobKt.withContext((CoroutineContext) instrument$Adapter32.cash_instrument_typeAdapter, new Hero3DCardViewKt$rotateDragFlow$2(instrument$Adapter32, millis, null, 5), realGpsLocationManager$collectLocation$1);
                            if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                            if (withContext == obj3) {
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj4);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realGpsLocationManager$collectLocation$1 = new RealGpsLocationManager$collectLocation$1(this, continuationImpl);
        Object obj42 = realGpsLocationManager$collectLocation$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGpsLocationManager$collectLocation$1.label;
        PermissionChecker permissionChecker3 = this.permissionChecker;
        Instrument$Adapter instrument$Adapter22 = this.gpsConfigStore;
        switch (i) {
        }
    }
}
