package com.squareup.cash.nearby.backend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.core.app.ActivityCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cropview.Edge;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealNearbyManager {
    public final Activity activity;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final KeyValue askedBluetoothPermission;
    public final KeyValue askedLocationPermission;
    public final AndroidClock clock;
    public final RealNearbyAdvertiser nearbyAdvertiser;
    public final AndroidPermissionManager permissionManager;
    public final RealNearbyPermissionStateProvider permissionStateProvider;

    public RealNearbyManager(FeatureFlagManager featureFlagManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealNearbyAdvertiser realNearbyAdvertiser, Edge.Companion companion, RealNearbyPermissionStateProvider realNearbyPermissionStateProvider, AndroidPermissionManager androidPermissionManager, Activity activity, AndroidClock androidClock, KeyValue keyValue, KeyValue keyValue2, AppForegroundStateProvider appForegroundStateProvider) {
        this.nearbyAdvertiser = realNearbyAdvertiser;
        this.permissionStateProvider = realNearbyPermissionStateProvider;
        this.permissionManager = androidPermissionManager;
        this.activity = activity;
        this.clock = androidClock;
        this.askedBluetoothPermission = keyValue;
        this.askedLocationPermission = keyValue2;
        this.appForegroundStateProvider = appForegroundStateProvider;
    }

    public final void advertiseNearby(NearbyAdvertisement nearbyAdvertisement, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-399013715);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(nearbyAdvertisement) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 32 : 16);
        boolean z = true;
        int i4 = 14;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (((AppForegroundState) Updater.collectAsState(((RealAppForegroundStateProvider) this.appForegroundStateProvider).appForegroundState, null, gapComposer, 1).getValue()) == AppForegroundState.FOREGROUND) {
            gapComposer.startReplaceGroup(1452087902);
            if ((i3 & 14) != 4 && !gapComposer.changedInstance(nearbyAdvertisement)) {
                z = false;
            }
            boolean changedInstance = gapComposer.changedInstance(this) | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda6(i2, nearbyAdvertisement, this);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(nearbyAdvertisement, (Function1) rememberedValue, gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1452417525);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(this, nearbyAdvertisement, i, i4);
        }
    }

    public final MutableState permissionState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2060541304);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.permissionStateProvider.permissionState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        gapComposer.end(false);
        return collectAsState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r7.set(r13, r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r13.set(r14, r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
    
        if (r15 == r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestNextPermission(NearbyPermissionState nearbyPermissionState, ContinuationImpl continuationImpl) {
        RealNearbyManager$requestNextPermission$1 realNearbyManager$requestNextPermission$1;
        Object obj;
        int i;
        NearbyPermissionState nearbyPermissionState2;
        Activity activity = this.permissionManager.activity;
        if (continuationImpl instanceof RealNearbyManager$requestNextPermission$1) {
            realNearbyManager$requestNextPermission$1 = (RealNearbyManager$requestNextPermission$1) continuationImpl;
            int i2 = realNearbyManager$requestNextPermission$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNearbyManager$requestNextPermission$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realNearbyManager$requestNextPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNearbyManager$requestNextPermission$1.label;
                Activity activity2 = this.activity;
                KeyValue keyValue = this.askedLocationPermission;
                KeyValue keyValue2 = this.askedBluetoothPermission;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (nearbyPermissionState.bluetoothState != BleDeviceState.UNAVAILABLE) {
                        if (!nearbyPermissionState.bluetoothPermission.granted) {
                            realNearbyManager$requestNextPermission$1.L$0 = nearbyPermissionState;
                            realNearbyManager$requestNextPermission$1.label = 1;
                            obj = keyValue2.get(realNearbyManager$requestNextPermission$1);
                        }
                        if (nearbyPermissionState.bluetoothPermission.granted) {
                            if (!nearbyPermissionState.locationPermission.granted) {
                                realNearbyManager$requestNextPermission$1.L$0 = nearbyPermissionState;
                                realNearbyManager$requestNextPermission$1.label = 3;
                                obj = keyValue.get(realNearbyManager$requestNextPermission$1);
                                if (obj != coroutineSingletons) {
                                    nearbyPermissionState2 = nearbyPermissionState;
                                    if (!((Boolean) obj).booleanValue()) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            if (nearbyPermissionState.locationPermission.granted) {
                            }
                        } else {
                            activity2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity2.getPackageName(), null)));
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    nearbyPermissionState = realNearbyManager$requestNextPermission$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        ActivityCompat.requestPermissions(activity, Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"} : new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"}, 2);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ActivityCompat.requestPermissions(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 2);
                        return Unit.INSTANCE;
                    }
                    nearbyPermissionState2 = realNearbyManager$requestNextPermission$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        nearbyPermissionState = nearbyPermissionState2;
                        if (nearbyPermissionState.locationPermission.granted) {
                            activity2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", activity2.getPackageName(), null)));
                        } else if (nearbyPermissionState.bluetoothState != BleDeviceState.ENABLED) {
                            activity2.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                        }
                        return Unit.INSTANCE;
                    }
                    Boolean bool = Boolean.TRUE;
                    realNearbyManager$requestNextPermission$1.L$0 = null;
                    realNearbyManager$requestNextPermission$1.label = 4;
                }
                if (!((Boolean) obj).booleanValue()) {
                    Boolean bool2 = Boolean.TRUE;
                    realNearbyManager$requestNextPermission$1.L$0 = null;
                    realNearbyManager$requestNextPermission$1.label = 2;
                }
                if (nearbyPermissionState.bluetoothPermission.granted) {
                }
            }
        }
        realNearbyManager$requestNextPermission$1 = new RealNearbyManager$requestNextPermission$1(this, continuationImpl);
        obj = realNearbyManager$requestNextPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNearbyManager$requestNextPermission$1.label;
        Activity activity22 = this.activity;
        KeyValue keyValue3 = this.askedLocationPermission;
        KeyValue keyValue22 = this.askedBluetoothPermission;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        if (nearbyPermissionState.bluetoothPermission.granted) {
        }
    }
}
