package com.squareup.cash.clientrouting.routers.physicalDeposits;

import androidx.core.app.ActivityCompat;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GpsRouter {
    public final AndroidPermissionManager$create$1 backgroundLocationPermissions;
    public final IntentLauncher launcher;
    public final AndroidLocationSettingsChecker locationSettingsChecker;
    public final AndroidPermissionManager permissionManager;
    public final int sdkVersion;

    public GpsRouter(AndroidLocationSettingsChecker androidLocationSettingsChecker, AndroidPermissionManager androidPermissionManager, IntentLauncher intentLauncher, int i, Navigator navigator) {
        navigator.getClass();
        this.locationSettingsChecker = androidLocationSettingsChecker;
        this.permissionManager = androidPermissionManager;
        this.launcher = intentLauncher;
        this.sdkVersion = i;
        this.backgroundLocationPermissions = androidPermissionManager.create("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ContinuationImpl continuationImpl) {
        GpsRouter$route$1 gpsRouter$route$1;
        Object obj;
        int i;
        if (continuationImpl instanceof GpsRouter$route$1) {
            gpsRouter$route$1 = (GpsRouter$route$1) continuationImpl;
            int i2 = gpsRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                gpsRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = gpsRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gpsRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    gpsRouter$route$1.label = 1;
                    obj = this.locationSettingsChecker.check(gpsRouter$route$1);
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
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                AndroidPermissionManager androidPermissionManager = this.permissionManager;
                if (!androidPermissionManager.permissionChecker.hasLocation()) {
                    ActivityCompat.requestPermissions(androidPermissionManager.activity, AndroidPermissionManager.REQUEST_LOCATION, 2);
                }
                return Unit.INSTANCE;
            }
        }
        gpsRouter$route$1 = new GpsRouter$route$1(this, continuationImpl);
        obj = gpsRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gpsRouter$route$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route$1(ContinuationImpl continuationImpl) {
        GpsRouter$route$2 gpsRouter$route$2;
        Object obj;
        int i;
        if (continuationImpl instanceof GpsRouter$route$2) {
            gpsRouter$route$2 = (GpsRouter$route$2) continuationImpl;
            int i2 = gpsRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                gpsRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                obj = gpsRouter$route$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gpsRouter$route$2.label;
                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = this.backgroundLocationPermissions;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.sdkVersion > 29 && this.permissionManager.permissionChecker.hasLocation()) {
                        gpsRouter$route$2.label = 1;
                        obj = androidPermissionManager$create$1.shouldShowRequestPermissionRationale(gpsRouter$route$2);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    this.launcher.launchSettings();
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    androidPermissionManager$create$1.request();
                    return Unit.INSTANCE;
                }
                this.launcher.launchSettings();
                return Unit.INSTANCE;
            }
        }
        gpsRouter$route$2 = new GpsRouter$route$2(this, continuationImpl);
        obj = gpsRouter$route$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gpsRouter$route$2.label;
        AndroidPermissionManager$create$1 androidPermissionManager$create$12 = this.backgroundLocationPermissions;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        this.launcher.launchSettings();
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewSystemSettings viewSystemSettings) {
        viewSystemSettings.getClass();
        this.launcher.launchSettings();
    }
}
