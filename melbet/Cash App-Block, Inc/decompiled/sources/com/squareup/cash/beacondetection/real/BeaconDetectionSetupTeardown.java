package com.squareup.cash.beacondetection.real;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.MetadataRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.memory.RealStrongMemoryCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadl;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.beacondetection.api.BeaconProximity;
import com.squareup.cash.beacondetection.api.DetectionContext;
import com.squareup.cash.beacondetection.api.IBeaconDevice;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import com.squareup.cash.cdf.beacondetection.BeaconDetectionDetectBeaconFound;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class BeaconDetectionSetupTeardown implements IoSetupTeardown {
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final ConversionListener beaconDetectionAnalytics;
    public final Context context;
    public final FeatureFlagManager featureFlagManager;
    public final AndroidLocationProvider locationProvider;
    public final PermissionChecker permissionChecker;

    public BeaconDetectionSetupTeardown(Context context, FeatureFlagManager featureFlagManager, PermissionChecker permissionChecker, AppForegroundStateProvider appForegroundStateProvider, AndroidLocationProvider androidLocationProvider, ConversionListener conversionListener) {
        this.context = context;
        this.featureFlagManager = featureFlagManager;
        this.permissionChecker = permissionChecker;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.locationProvider = androidLocationProvider;
        this.beaconDetectionAnalytics = conversionListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if (r27.logRegionEvent(r1, r10, r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r8 = r8;
        r4 = r11;
        r7 = 1;
        r9 = r5;
        r11 = r9;
        r5 = r10;
        r10 = r12;
        r6 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.concurrent.CancellationException, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.squareup.cash.beacondetection.api.BeaconProximity, com.squareup.cash.beacondetection.api.IBeaconDevice, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01a0 -> B:12:0x01a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processDetectedBeacons(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, CoroutineScope coroutineScope, BufferedChannel bufferedChannel, RealStrongMemoryCache realStrongMemoryCache, BeaconRegionTracker beaconRegionTracker, LocationPermissionLevel locationPermissionLevel, ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$processDetectedBeacons$1 beaconDetectionSetupTeardown$processDetectedBeacons$1;
        int i;
        BeaconRegionTracker beaconRegionTracker2;
        LocationPermissionLevel locationPermissionLevel2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        BeaconDetectionSetupTeardown$processDetectedBeacons$1 beaconDetectionSetupTeardown$processDetectedBeacons$12;
        Job job;
        CoroutineScope coroutineScope2;
        RealStrongMemoryCache realStrongMemoryCache2;
        CoroutineScope coroutineScope3;
        RealStrongMemoryCache realStrongMemoryCache3;
        BeaconRegionTracker beaconRegionTracker3;
        LocationPermissionLevel locationPermissionLevel3;
        Job job2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        IBeaconDevice iBeaconDevice;
        BeaconDetectionSetupTeardown$processDetectedBeacons$1 beaconDetectionSetupTeardown$processDetectedBeacons$13;
        StandaloneCoroutine launch$default;
        BeaconProximity beaconProximity;
        StandaloneCoroutine standaloneCoroutine;
        Double d;
        Job job3;
        Object hasNext;
        if (continuationImpl instanceof BeaconDetectionSetupTeardown$processDetectedBeacons$1) {
            beaconDetectionSetupTeardown$processDetectedBeacons$1 = (BeaconDetectionSetupTeardown$processDetectedBeacons$1) continuationImpl;
            int i2 = beaconDetectionSetupTeardown$processDetectedBeacons$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                beaconDetectionSetupTeardown$processDetectedBeacons$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = beaconDetectionSetupTeardown$processDetectedBeacons$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beaconDetectionSetupTeardown$processDetectedBeacons$1.label;
                int i3 = 2;
                int i4 = 1;
                ?? r8 = 0;
                Object obj2 = 0;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    bufferedChannel.getClass();
                    beaconRegionTracker2 = beaconRegionTracker;
                    locationPermissionLevel2 = locationPermissionLevel;
                    bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                    beaconDetectionSetupTeardown$processDetectedBeacons$12 = beaconDetectionSetupTeardown$processDetectedBeacons$1;
                    job = null;
                    coroutineScope2 = coroutineScope;
                    realStrongMemoryCache2 = realStrongMemoryCache;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$0 = coroutineScope2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$2 = realStrongMemoryCache2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$3 = beaconRegionTracker2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$4 = locationPermissionLevel2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$5 = job;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$6 = bufferedChannelIterator;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$7 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$9 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$10 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.label = i4;
                    hasNext = bufferedChannelIterator.hasNext(beaconDetectionSetupTeardown$processDetectedBeacons$12);
                    if (hasNext != serializable) {
                    }
                    return serializable;
                }
                if (i != 1) {
                    if (i == 2) {
                        iBeaconDevice = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$7;
                        bufferedChannelIterator2 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$6;
                        Job job4 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$5;
                        locationPermissionLevel3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$4;
                        beaconRegionTracker3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$3;
                        realStrongMemoryCache3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$2;
                        coroutineScope3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        job2 = job4;
                        RealStrongMemoryCache realStrongMemoryCache4 = realStrongMemoryCache3;
                        beaconDetectionSetupTeardown$processDetectedBeacons$13 = beaconDetectionSetupTeardown$processDetectedBeacons$1;
                        realStrongMemoryCache2 = realStrongMemoryCache4;
                        coroutineScope2 = coroutineScope3;
                        if (job2 != 0) {
                        }
                        launch$default = JobKt.launch$default(coroutineScope2, obj2, obj2, new ToastKt$Toast$9$1(beaconRegionTracker3, beaconDetectionSetupTeardown, locationPermissionLevel3, obj2, 18), 3);
                        if (((RealAppForegroundStateProvider) beaconDetectionSetupTeardown.appForegroundStateProvider).appForegroundState.$$delegate_0.getValue() == AppForegroundState.FOREGROUND) {
                        }
                        r8 = obj2;
                        beaconRegionTracker2 = beaconRegionTracker3;
                        i4 = 1;
                        bufferedChannelIterator = bufferedChannelIterator2;
                        job = launch$default;
                        locationPermissionLevel2 = locationPermissionLevel3;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12 = beaconDetectionSetupTeardown$processDetectedBeacons$13;
                        i3 = 2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$0 = coroutineScope2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$2 = realStrongMemoryCache2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$3 = beaconRegionTracker2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$4 = locationPermissionLevel2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$5 = job;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$6 = bufferedChannelIterator;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$7 = r8;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$9 = r8;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.L$10 = r8;
                        beaconDetectionSetupTeardown$processDetectedBeacons$12.label = i4;
                        hasNext = bufferedChannelIterator.hasNext(beaconDetectionSetupTeardown$processDetectedBeacons$12);
                        if (hasNext != serializable) {
                        }
                        return serializable;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Double d2 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$10;
                    BeaconProximity beaconProximity2 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$9;
                    IBeaconDevice iBeaconDevice2 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$7;
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$6;
                    Job job5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$5;
                    LocationPermissionLevel locationPermissionLevel4 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$4;
                    BeaconRegionTracker beaconRegionTracker4 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$3;
                    RealStrongMemoryCache realStrongMemoryCache5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$2;
                    CoroutineScope coroutineScope4 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Double d3 = d2;
                    IBeaconDevice iBeaconDevice3 = iBeaconDevice2;
                    Job job6 = job5;
                    locationPermissionLevel3 = locationPermissionLevel4;
                    beaconRegionTracker2 = beaconRegionTracker4;
                    beaconDetectionSetupTeardown$processDetectedBeacons$13 = beaconDetectionSetupTeardown$processDetectedBeacons$1;
                    realStrongMemoryCache2 = realStrongMemoryCache5;
                    Pair pair = (Pair) obj;
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    ConversionListener conversionListener = beaconDetectionSetupTeardown.beaconDetectionAnalytics;
                    DetectionContext detectionContext = DetectionContext.FOREGROUND_RANGING;
                    iBeaconDevice3.getClass();
                    beaconProximity2.getClass();
                    locationPermissionLevel3.getClass();
                    Analytics analytics = conversionListener.analytics;
                    String uuid = iBeaconDevice3.getUuid();
                    String valueOf = String.valueOf(iBeaconDevice3.getMajor());
                    String valueOf2 = String.valueOf(iBeaconDevice3.getMinor());
                    Integer valueOf3 = Integer.valueOf(iBeaconDevice3.getRssi());
                    BeaconDetectionDetectBeaconFound.Proximity access$toCdf = zzadl.access$toCdf(beaconProximity2);
                    Double doubleOrNull = str == null ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str) : null;
                    Double doubleOrNull2 = str2 == null ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str2) : null;
                    BeaconDetectionDetectBeaconFound.DetectionContext access$toCdf2 = zzadl.access$toCdf(detectionContext);
                    BeaconDetectionDetectBeaconFound.LocationPermissionLevel access$toCdf3 = zzadl.access$toCdf(locationPermissionLevel3);
                    BeaconDetectionDetectBeaconFound.Platform platform = BeaconDetectionDetectBeaconFound.Platform.ANDROID;
                    analytics.track(new BeaconDetectionDetectBeaconFound(uuid, valueOf, valueOf2, valueOf3, access$toCdf, d3, doubleOrNull, doubleOrNull2, access$toCdf2, access$toCdf3), null);
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator4 = bufferedChannelIterator3;
                    job = job6;
                    r8 = 0;
                    bufferedChannelIterator = bufferedChannelIterator4;
                    coroutineScope2 = coroutineScope4;
                    locationPermissionLevel2 = locationPermissionLevel3;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12 = beaconDetectionSetupTeardown$processDetectedBeacons$13;
                    i3 = 2;
                    i4 = 1;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$0 = coroutineScope2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$2 = realStrongMemoryCache2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$3 = beaconRegionTracker2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$4 = locationPermissionLevel2;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$5 = job;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$6 = bufferedChannelIterator;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$7 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$9 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.L$10 = r8;
                    beaconDetectionSetupTeardown$processDetectedBeacons$12.label = i4;
                    hasNext = bufferedChannelIterator.hasNext(beaconDetectionSetupTeardown$processDetectedBeacons$12);
                    if (hasNext != serializable) {
                        coroutineScope3 = coroutineScope2;
                        obj = hasNext;
                        realStrongMemoryCache3 = realStrongMemoryCache2;
                        beaconDetectionSetupTeardown$processDetectedBeacons$1 = beaconDetectionSetupTeardown$processDetectedBeacons$12;
                        locationPermissionLevel3 = locationPermissionLevel2;
                        bufferedChannelIterator2 = bufferedChannelIterator;
                        job3 = job;
                        beaconRegionTracker3 = beaconRegionTracker2;
                        z = r8;
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        iBeaconDevice = (IBeaconDevice) bufferedChannelIterator2.next();
                        obj2 = z;
                        job2 = job3;
                        if (beaconRegionTracker3.onBeaconDetected() != null) {
                            DetectionContext detectionContext2 = DetectionContext.BACKGROUND_REGION_ENTRY;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$0 = coroutineScope3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$2 = realStrongMemoryCache3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$3 = beaconRegionTracker3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$4 = locationPermissionLevel3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$5 = job3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$6 = bufferedChannelIterator2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.L$7 = iBeaconDevice;
                            beaconDetectionSetupTeardown$processDetectedBeacons$1.label = i3;
                            obj2 = z;
                            job2 = job3;
                        }
                        RealStrongMemoryCache realStrongMemoryCache42 = realStrongMemoryCache3;
                        beaconDetectionSetupTeardown$processDetectedBeacons$13 = beaconDetectionSetupTeardown$processDetectedBeacons$1;
                        realStrongMemoryCache2 = realStrongMemoryCache42;
                        coroutineScope2 = coroutineScope3;
                        if (job2 != 0) {
                            job2.cancel(obj2);
                        }
                        launch$default = JobKt.launch$default(coroutineScope2, obj2, obj2, new ToastKt$Toast$9$1(beaconRegionTracker3, beaconDetectionSetupTeardown, locationPermissionLevel3, obj2, 18), 3);
                        if (((RealAppForegroundStateProvider) beaconDetectionSetupTeardown.appForegroundStateProvider).appForegroundState.$$delegate_0.getValue() == AppForegroundState.FOREGROUND || !realStrongMemoryCache2.shouldLog(iBeaconDevice.getMajor(), iBeaconDevice.getMinor())) {
                            r8 = obj2;
                            beaconRegionTracker2 = beaconRegionTracker3;
                            i4 = 1;
                            bufferedChannelIterator = bufferedChannelIterator2;
                            job = launch$default;
                            locationPermissionLevel2 = locationPermissionLevel3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12 = beaconDetectionSetupTeardown$processDetectedBeacons$13;
                            i3 = 2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$0 = coroutineScope2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$2 = realStrongMemoryCache2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$3 = beaconRegionTracker2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$4 = locationPermissionLevel2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$5 = job;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$6 = bufferedChannelIterator;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$7 = r8;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$9 = r8;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.L$10 = r8;
                            beaconDetectionSetupTeardown$processDetectedBeacons$12.label = i4;
                            hasNext = bufferedChannelIterator.hasNext(beaconDetectionSetupTeardown$processDetectedBeacons$12);
                            if (hasNext != serializable) {
                            }
                        } else {
                            int rssi = iBeaconDevice.getRssi();
                            int txPower = iBeaconDevice.getTxPower();
                            if (rssi != 0) {
                                Double valueOf4 = rssi == 0 ? obj2 : Double.valueOf(Math.pow(10.0d, (txPower - rssi) / 20.0d));
                                if (valueOf4 != null) {
                                    double doubleValue = valueOf4.doubleValue();
                                    beaconProximity = doubleValue >= 1.0d ? doubleValue < 3.0d ? BeaconProximity.NEAR : BeaconProximity.FAR : BeaconProximity.IMMEDIATE;
                                } else {
                                    beaconProximity = BeaconProximity.UNKNOWN;
                                }
                            } else {
                                beaconProximity = BeaconProximity.UNKNOWN;
                            }
                            int rssi2 = iBeaconDevice.getRssi();
                            int txPower2 = iBeaconDevice.getTxPower();
                            if (rssi2 == 0) {
                                standaloneCoroutine = launch$default;
                                d = obj2;
                            } else {
                                standaloneCoroutine = launch$default;
                                d = Double.valueOf(Math.pow(10.0d, (txPower2 - rssi2) / 20.0d));
                            }
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$0 = coroutineScope2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$2 = realStrongMemoryCache2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$3 = beaconRegionTracker3;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$4 = locationPermissionLevel3;
                            StandaloneCoroutine standaloneCoroutine2 = standaloneCoroutine;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$5 = standaloneCoroutine2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$6 = bufferedChannelIterator2;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$7 = iBeaconDevice;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$9 = beaconProximity;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.L$10 = d;
                            beaconDetectionSetupTeardown$processDetectedBeacons$13.label = 3;
                            Serializable coarseLocation = beaconDetectionSetupTeardown.getCoarseLocation(beaconDetectionSetupTeardown$processDetectedBeacons$13);
                            if (coarseLocation != serializable) {
                                d3 = d;
                                job6 = standaloneCoroutine2;
                                iBeaconDevice3 = iBeaconDevice;
                                beaconRegionTracker2 = beaconRegionTracker3;
                                bufferedChannelIterator3 = bufferedChannelIterator2;
                                coroutineScope4 = coroutineScope2;
                                obj = coarseLocation;
                                beaconProximity2 = beaconProximity;
                                Pair pair2 = (Pair) obj;
                                String str3 = (String) pair2.first;
                                String str22 = (String) pair2.second;
                                ConversionListener conversionListener2 = beaconDetectionSetupTeardown.beaconDetectionAnalytics;
                                DetectionContext detectionContext3 = DetectionContext.FOREGROUND_RANGING;
                                iBeaconDevice3.getClass();
                                beaconProximity2.getClass();
                                locationPermissionLevel3.getClass();
                                Analytics analytics2 = conversionListener2.analytics;
                                String uuid2 = iBeaconDevice3.getUuid();
                                String valueOf5 = String.valueOf(iBeaconDevice3.getMajor());
                                String valueOf22 = String.valueOf(iBeaconDevice3.getMinor());
                                Integer valueOf32 = Integer.valueOf(iBeaconDevice3.getRssi());
                                BeaconDetectionDetectBeaconFound.Proximity access$toCdf4 = zzadl.access$toCdf(beaconProximity2);
                                if (str3 == null) {
                                }
                                if (str22 == null) {
                                }
                                BeaconDetectionDetectBeaconFound.DetectionContext access$toCdf22 = zzadl.access$toCdf(detectionContext3);
                                BeaconDetectionDetectBeaconFound.LocationPermissionLevel access$toCdf32 = zzadl.access$toCdf(locationPermissionLevel3);
                                BeaconDetectionDetectBeaconFound.Platform platform2 = BeaconDetectionDetectBeaconFound.Platform.ANDROID;
                                analytics2.track(new BeaconDetectionDetectBeaconFound(uuid2, valueOf5, valueOf22, valueOf32, access$toCdf4, d3, doubleOrNull, doubleOrNull2, access$toCdf22, access$toCdf32), null);
                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator42 = bufferedChannelIterator3;
                                job = job6;
                                r8 = 0;
                                bufferedChannelIterator = bufferedChannelIterator42;
                                coroutineScope2 = coroutineScope4;
                                locationPermissionLevel2 = locationPermissionLevel3;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12 = beaconDetectionSetupTeardown$processDetectedBeacons$13;
                                i3 = 2;
                                i4 = 1;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$0 = coroutineScope2;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$2 = realStrongMemoryCache2;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$3 = beaconRegionTracker2;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$4 = locationPermissionLevel2;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$5 = job;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$6 = bufferedChannelIterator;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$7 = r8;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$9 = r8;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.L$10 = r8;
                                beaconDetectionSetupTeardown$processDetectedBeacons$12.label = i4;
                                hasNext = bufferedChannelIterator.hasNext(beaconDetectionSetupTeardown$processDetectedBeacons$12);
                                if (hasNext != serializable) {
                                }
                            }
                        }
                    }
                    return serializable;
                }
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$6;
                Job job7 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$5;
                LocationPermissionLevel locationPermissionLevel5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$4;
                BeaconRegionTracker beaconRegionTracker5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$3;
                RealStrongMemoryCache realStrongMemoryCache6 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$2;
                CoroutineScope coroutineScope5 = beaconDetectionSetupTeardown$processDetectedBeacons$1.L$0;
                SafeTrace.throwOnFailure(obj);
                coroutineScope3 = coroutineScope5;
                realStrongMemoryCache3 = realStrongMemoryCache6;
                beaconRegionTracker3 = beaconRegionTracker5;
                locationPermissionLevel3 = locationPermissionLevel5;
                job3 = job7;
                bufferedChannelIterator2 = bufferedChannelIterator5;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        beaconDetectionSetupTeardown$processDetectedBeacons$1 = new BeaconDetectionSetupTeardown$processDetectedBeacons$1(beaconDetectionSetupTeardown, continuationImpl);
        Object obj3 = beaconDetectionSetupTeardown$processDetectedBeacons$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$processDetectedBeacons$1.label;
        int i32 = 2;
        int i42 = 1;
        ?? r82 = 0;
        Object obj22 = 0;
        boolean z2 = false;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runDetection(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$runDetection$1 beaconDetectionSetupTeardown$runDetection$1;
        int i;
        BufferedChannel bufferedChannel;
        BeaconRegionTracker beaconRegionTracker;
        MetadataRepo metadataRepo;
        RealStrongMemoryCache realStrongMemoryCache;
        PermissionChecker permissionChecker = beaconDetectionSetupTeardown.permissionChecker;
        if (continuationImpl instanceof BeaconDetectionSetupTeardown$runDetection$1) {
            beaconDetectionSetupTeardown$runDetection$1 = (BeaconDetectionSetupTeardown$runDetection$1) continuationImpl;
            int i2 = beaconDetectionSetupTeardown$runDetection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                beaconDetectionSetupTeardown$runDetection$1.label = i2 - PKIFailureInfo.systemUnavail;
                BeaconDetectionSetupTeardown$runDetection$1 beaconDetectionSetupTeardown$runDetection$12 = beaconDetectionSetupTeardown$runDetection$1;
                Object obj = beaconDetectionSetupTeardown$runDetection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beaconDetectionSetupTeardown$runDetection$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!permissionChecker.hasLocation()) {
                        Timber.Forest.i("BeaconDetection: no location permission, skipping", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    if (!(Build.VERSION.SDK_INT >= 31 ? permissionChecker.checkPermission("android.permission.BLUETOOTH_SCAN") : true)) {
                        Timber.Forest.i("BeaconDetection: no Bluetooth scan permission, skipping", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    LocationPermissionLevel locationPermissionLevel = permissionChecker.hasBackgroundLocation() ? LocationPermissionLevel.ALWAYS : LocationPermissionLevel.WHEN_IN_USE;
                    Timber.Forest.i("BeaconDetection: starting with permission level %s", locationPermissionLevel.getWireValue());
                    MetadataRepo metadataRepo2 = new MetadataRepo(beaconDetectionSetupTeardown.context);
                    RealStrongMemoryCache realStrongMemoryCache2 = new RealStrongMemoryCache(7);
                    BeaconRegionTracker beaconRegionTracker2 = new BeaconRegionTracker();
                    BufferedChannel Channel$default = PapaEvent.Channel$default(-2, null, null, 6);
                    try {
                        EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(locationPermissionLevel, beaconDetectionSetupTeardown, metadataRepo2, Channel$default, realStrongMemoryCache2, beaconRegionTracker2, (Continuation) null);
                        beaconDetectionSetupTeardown$runDetection$12.L$1 = metadataRepo2;
                        beaconDetectionSetupTeardown$runDetection$12.L$2 = realStrongMemoryCache2;
                        beaconDetectionSetupTeardown$runDetection$12.L$3 = beaconRegionTracker2;
                        beaconDetectionSetupTeardown$runDetection$12.L$4 = Channel$default;
                        beaconDetectionSetupTeardown$runDetection$12.label = 1;
                        if (JobKt.coroutineScope(engineInterceptor$intercept$2, beaconDetectionSetupTeardown$runDetection$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bufferedChannel = Channel$default;
                        beaconRegionTracker = beaconRegionTracker2;
                        metadataRepo = metadataRepo2;
                        realStrongMemoryCache = realStrongMemoryCache2;
                    } catch (CancellationException e) {
                        bufferedChannel = Channel$default;
                        beaconRegionTracker = beaconRegionTracker2;
                        metadataRepo = metadataRepo2;
                        realStrongMemoryCache = realStrongMemoryCache2;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        bufferedChannel = Channel$default;
                        beaconRegionTracker = beaconRegionTracker2;
                        metadataRepo = metadataRepo2;
                        realStrongMemoryCache = realStrongMemoryCache2;
                        metadataRepo.stopScanning();
                        bufferedChannel.close(null);
                        realStrongMemoryCache.clear();
                        beaconRegionTracker.reset();
                        Timber.Forest.i("BeaconDetection: stopped", new Object[0]);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bufferedChannel = beaconDetectionSetupTeardown$runDetection$12.L$4;
                    beaconRegionTracker = beaconDetectionSetupTeardown$runDetection$12.L$3;
                    realStrongMemoryCache = beaconDetectionSetupTeardown$runDetection$12.L$2;
                    metadataRepo = beaconDetectionSetupTeardown$runDetection$12.L$1;
                    try {
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        metadataRepo.stopScanning();
                        bufferedChannel.close(null);
                        realStrongMemoryCache.clear();
                        beaconRegionTracker.reset();
                        Timber.Forest.i("BeaconDetection: stopped", new Object[0]);
                        throw th;
                    }
                }
                metadataRepo.stopScanning();
                bufferedChannel.close(null);
                realStrongMemoryCache.clear();
                beaconRegionTracker.reset();
                Timber.Forest.i("BeaconDetection: stopped", new Object[0]);
                return Unit.INSTANCE;
            }
        }
        beaconDetectionSetupTeardown$runDetection$1 = new BeaconDetectionSetupTeardown$runDetection$1(beaconDetectionSetupTeardown, continuationImpl);
        BeaconDetectionSetupTeardown$runDetection$1 beaconDetectionSetupTeardown$runDetection$122 = beaconDetectionSetupTeardown$runDetection$1;
        Object obj2 = beaconDetectionSetupTeardown$runDetection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$runDetection$122.label;
        if (i != 0) {
        }
        metadataRepo.stopScanning();
        bufferedChannel.close(null);
        realStrongMemoryCache.clear();
        beaconRegionTracker.reset();
        Timber.Forest.i("BeaconDetection: stopped", new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$startBackgroundAwareScanning(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, MetadataRepo metadataRepo, BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$startBackgroundAwareScanning$1 beaconDetectionSetupTeardown$startBackgroundAwareScanning$1;
        int i;
        if (continuationImpl instanceof BeaconDetectionSetupTeardown$startBackgroundAwareScanning$1) {
            beaconDetectionSetupTeardown$startBackgroundAwareScanning$1 = (BeaconDetectionSetupTeardown$startBackgroundAwareScanning$1) continuationImpl;
            int i2 = beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    metadataRepo.startScanning(false, new BeaconDetectionSetupTeardown$$ExternalSyntheticLambda1(bufferedChannel, 0));
                    ReadonlyStateFlow readonlyStateFlow = ((RealAppForegroundStateProvider) beaconDetectionSetupTeardown.appForegroundStateProvider).appForegroundState;
                    BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2 beaconDetectionSetupTeardown$startForegroundOnlyScanning$2 = new BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2(metadataRepo, bufferedChannel, i3);
                    beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(beaconDetectionSetupTeardown$startForegroundOnlyScanning$2, beaconDetectionSetupTeardown$startBackgroundAwareScanning$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        beaconDetectionSetupTeardown$startBackgroundAwareScanning$1 = new BeaconDetectionSetupTeardown$startBackgroundAwareScanning$1(beaconDetectionSetupTeardown, continuationImpl);
        Object obj2 = beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$startBackgroundAwareScanning$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$startForegroundOnlyScanning(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, MetadataRepo metadataRepo, BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1 beaconDetectionSetupTeardown$startForegroundOnlyScanning$1;
        int i;
        if (continuationImpl instanceof BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1) {
            beaconDetectionSetupTeardown$startForegroundOnlyScanning$1 = (BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1) continuationImpl;
            int i2 = beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow readonlyStateFlow = ((RealAppForegroundStateProvider) beaconDetectionSetupTeardown.appForegroundStateProvider).appForegroundState;
                    BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2 beaconDetectionSetupTeardown$startForegroundOnlyScanning$2 = new BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2(metadataRepo, bufferedChannel, 0);
                    beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(beaconDetectionSetupTeardown$startForegroundOnlyScanning$2, beaconDetectionSetupTeardown$startForegroundOnlyScanning$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        beaconDetectionSetupTeardown$startForegroundOnlyScanning$1 = new BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1(beaconDetectionSetupTeardown, continuationImpl);
        Object obj2 = beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$startForegroundOnlyScanning$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: SecurityException -> 0x002a, TryCatch #0 {SecurityException -> 0x002a, blocks: (B:10:0x0026, B:11:0x0040, B:13:0x0044, B:16:0x004a, B:21:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: SecurityException -> 0x002a, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x002a, blocks: (B:10:0x0026, B:11:0x0040, B:13:0x0044, B:16:0x004a, B:21:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getCoarseLocation(ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$getCoarseLocation$1 beaconDetectionSetupTeardown$getCoarseLocation$1;
        Object obj;
        int i;
        try {
            if (continuationImpl instanceof BeaconDetectionSetupTeardown$getCoarseLocation$1) {
                beaconDetectionSetupTeardown$getCoarseLocation$1 = (BeaconDetectionSetupTeardown$getCoarseLocation$1) continuationImpl;
                int i2 = beaconDetectionSetupTeardown$getCoarseLocation$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    beaconDetectionSetupTeardown$getCoarseLocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                    obj = beaconDetectionSetupTeardown$getCoarseLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = beaconDetectionSetupTeardown$getCoarseLocation$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        AndroidLocationProvider androidLocationProvider = this.locationProvider;
                        beaconDetectionSetupTeardown$getCoarseLocation$1.label = 1;
                        obj = androidLocationProvider.currentLocation(beaconDetectionSetupTeardown$getCoarseLocation$1);
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
                    if (((Location) obj) != null) {
                        return new Pair(null, null);
                    }
                    double latitude = ((long) (r9.getLatitude() * 1000.0d)) / 1000.0d;
                    Locale locale = Locale.ROOT;
                    return new Pair(String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(latitude)}, 1)), String.format(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(((long) (r9.getLongitude() * 1000.0d)) / 1000.0d)}, 1)));
                }
            }
            if (i != 0) {
            }
            if (((Location) obj) != null) {
            }
        } catch (SecurityException e) {
            Timber.Forest.w("BeaconDetection: unable to get location", new Object[0], e);
            return new Pair(null, null);
        }
        beaconDetectionSetupTeardown$getCoarseLocation$1 = new BeaconDetectionSetupTeardown$getCoarseLocation$1(this, continuationImpl);
        obj = beaconDetectionSetupTeardown$getCoarseLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$getCoarseLocation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logRegionEvent(DetectionContext detectionContext, LocationPermissionLevel locationPermissionLevel, ContinuationImpl continuationImpl) {
        BeaconDetectionSetupTeardown$logRegionEvent$1 beaconDetectionSetupTeardown$logRegionEvent$1;
        int i;
        if (continuationImpl instanceof BeaconDetectionSetupTeardown$logRegionEvent$1) {
            beaconDetectionSetupTeardown$logRegionEvent$1 = (BeaconDetectionSetupTeardown$logRegionEvent$1) continuationImpl;
            int i2 = beaconDetectionSetupTeardown$logRegionEvent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                beaconDetectionSetupTeardown$logRegionEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = beaconDetectionSetupTeardown$logRegionEvent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beaconDetectionSetupTeardown$logRegionEvent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    beaconDetectionSetupTeardown$logRegionEvent$1.L$0 = detectionContext;
                    beaconDetectionSetupTeardown$logRegionEvent$1.L$1 = locationPermissionLevel;
                    beaconDetectionSetupTeardown$logRegionEvent$1.label = 1;
                    obj = getCoarseLocation(beaconDetectionSetupTeardown$logRegionEvent$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    locationPermissionLevel = beaconDetectionSetupTeardown$logRegionEvent$1.L$1;
                    detectionContext = beaconDetectionSetupTeardown$logRegionEvent$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                detectionContext.getClass();
                locationPermissionLevel.getClass();
                Analytics analytics = this.beaconDetectionAnalytics.analytics;
                BeaconDetectionDetectBeaconFound.DetectionContext access$toCdf = zzadl.access$toCdf(detectionContext);
                BeaconDetectionDetectBeaconFound.LocationPermissionLevel access$toCdf2 = zzadl.access$toCdf(locationPermissionLevel);
                Double doubleOrNull = str == null ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str) : null;
                Double doubleOrNull2 = str2 == null ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str2) : null;
                BeaconDetectionDetectBeaconFound.Platform platform = BeaconDetectionDetectBeaconFound.Platform.ANDROID;
                analytics.track(new BeaconDetectionDetectBeaconFound(doubleOrNull, doubleOrNull2, access$toCdf, access$toCdf2), null);
                return Unit.INSTANCE;
            }
        }
        beaconDetectionSetupTeardown$logRegionEvent$1 = new BeaconDetectionSetupTeardown$logRegionEvent$1(this, continuationImpl);
        Object obj3 = beaconDetectionSetupTeardown$logRegionEvent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beaconDetectionSetupTeardown$logRegionEvent$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj3;
        String str3 = (String) pair2.first;
        String str22 = (String) pair2.second;
        detectionContext.getClass();
        locationPermissionLevel.getClass();
        Analytics analytics2 = this.beaconDetectionAnalytics.analytics;
        BeaconDetectionDetectBeaconFound.DetectionContext access$toCdf3 = zzadl.access$toCdf(detectionContext);
        BeaconDetectionDetectBeaconFound.LocationPermissionLevel access$toCdf22 = zzadl.access$toCdf(locationPermissionLevel);
        if (str3 == null) {
        }
        if (str22 == null) {
        }
        BeaconDetectionDetectBeaconFound.Platform platform2 = BeaconDetectionDetectBeaconFound.Platform.ANDROID;
        analytics2.track(new BeaconDetectionDetectBeaconFound(doubleOrNull, doubleOrNull2, access$toCdf3, access$toCdf22), null);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 14), 3);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new Moneys$$ExternalSyntheticLambda0(4));
    }
}
