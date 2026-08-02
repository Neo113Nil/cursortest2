package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.battery.BatteryInfo;
import com.datadog.android.rum.internal.domain.display.DisplayInfo;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.VitalAppLaunchEvent;
import com.fillr.m1;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class MemorySizeCalculator$Builder {
    public final Object activityManager;
    public final float bitmapPoolScreens;
    public final Object context;
    public final Object screenDimensions;

    public MemorySizeCalculator$Builder(Context context) {
        this.bitmapPoolScreens = 1.0f;
        this.context = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.activityManager = activityManager;
        this.screenDimensions = new m1(context.getResources().getDisplayMetrics(), 8);
        if (activityManager.isLowRamDevice()) {
            this.bitmapPoolScreens = RecyclerView.DECELERATION_RATE;
        }
    }

    public VitalAppLaunchEvent newVitalAppLaunchEvent(long j, DatadogContext datadogContext, EmptyMap emptyMap, Map map, RumContext rumContext, long j2, RumStartupScenario rumStartupScenario, int i, int i2) {
        int i3;
        int i4;
        int i5;
        List list;
        String str;
        int i6;
        String str2 = rumContext.syntheticsResultId;
        String str3 = rumContext.syntheticsTestId;
        datadogContext.getClass();
        emptyMap.getClass();
        rumStartupScenario.getClass();
        if (i == 0) {
            throw null;
        }
        VitalAppLaunchEvent.Synthetics synthetics = (str3 == null || StringsKt.isBlank(str3) || str2 == null || StringsKt.isBlank(str2)) ? null : new VitalAppLaunchEvent.Synthetics(str3, str2);
        int i7 = synthetics == null ? 1 : 2;
        BatteryInfo batteryInfo = (BatteryInfo) ((InfoProvider) this.context).getState();
        DisplayInfo displayInfo = (DisplayInfo) ((InfoProvider) this.activityManager).getState();
        UserInfo userInfo = datadogContext.userInfo;
        DeviceInfo deviceInfo = datadogContext.deviceInfo;
        LocaleInfo localeInfo = deviceInfo.localeInfo;
        String str4 = rumContext.viewId;
        String str5 = rumContext.viewUrl;
        VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView = (str4 == null || str5 == null) ? null : new VitalAppLaunchEvent.VitalAppLaunchEventView(str4, str5, rumContext.viewName);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(emptyMap);
        VitalAppLaunchEvent.Context context = new VitalAppLaunchEvent.Context(linkedHashMap);
        int i8 = rumContext.sessionStartReason;
        if (i8 == 0) {
            throw null;
        }
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i8)) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        VitalAppLaunchEvent.Dd dd = new VitalAppLaunchEvent.Dd(new VitalAppLaunchEvent.DdSession(i3), new VitalAppLaunchEvent.Configuration(Float.valueOf(this.bitmapPoolScreens)), new VitalAppLaunchEvent.Profiling(i2));
        VitalAppLaunchEvent.Application application = new VitalAppLaunchEvent.Application(rumContext.applicationId, localeInfo.currentLocale);
        VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession = new VitalAppLaunchEvent.VitalAppLaunchEventSession(rumContext.sessionId, i7);
        String str6 = datadogContext.source;
        InternalLogger internalLogger = (InternalLogger) this.screenDimensions;
        str6.getClass();
        internalLogger.getClass();
        try {
        } catch (NoSuchElementException e) {
            DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str6, 29), e, false, 48);
            i4 = 0;
        }
        for (int i9 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$12(i9).equals(str6)) {
                i4 = i9;
                VitalAppLaunchEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new VitalAppLaunchEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                DeviceType deviceType = deviceInfo.deviceType;
                deviceType.getClass();
                switch (deviceType.ordinal()) {
                    case 0:
                        i5 = 1;
                        break;
                    case 1:
                        i5 = 3;
                        break;
                    case 2:
                        i5 = 4;
                        break;
                    case 3:
                        i5 = 2;
                        break;
                    case 4:
                        i5 = 5;
                        break;
                    case 5:
                        i5 = 6;
                        break;
                    case 6:
                        i5 = 7;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                VitalAppLaunchEvent.Device device = new VitalAppLaunchEvent.Device(i5, deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, localeInfo.locales, localeInfo.timeZone, batteryInfo.batteryLevel, batteryInfo.lowPowerMode, displayInfo.screenBrightness);
                VitalAppLaunchEvent.Os os = new VitalAppLaunchEvent.Os(deviceInfo.osName, deviceInfo.osVersion, deviceInfo.osMajorVersion);
                NetworkInfo networkInfo = datadogContext.networkInfo;
                networkInfo.getClass();
                boolean isConnected = zzhy.isConnected(networkInfo);
                String str7 = networkInfo.carrierName;
                int i10 = isConnected ? 1 : 2;
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                    case 0:
                        list = EmptyList.INSTANCE;
                        break;
                    case 1:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.ETHERNET);
                        break;
                    case 2:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.WIFI);
                        break;
                    case 3:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.WIMAX);
                        break;
                    case 4:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.BLUETOOTH);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.CELLULAR);
                        break;
                    case 11:
                        list = CollectionsKt__CollectionsJVMKt.listOf(VitalAppLaunchEvent.Interface.OTHER);
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                String str8 = networkInfo.cellularTechnology;
                VitalAppLaunchEvent.Connectivity connectivity = new VitalAppLaunchEvent.Connectivity(i10, list, (str8 == null && str7 == null) ? null : new VitalAppLaunchEvent.Cellular(str8, str7));
                int i11 = 1;
                String str9 = datadogContext.version;
                String str10 = datadogContext.service;
                String buildDDTagsString = RumTagsUtilsKt.buildDDTagsString(datadogContext);
                String m = Boxes$$ExternalSyntheticOutline1.m();
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
                if (ordinal == 0) {
                    str = "time_to_initial_display";
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = "time_to_full_display";
                }
                Long valueOf = Long.valueOf(j2);
                if (!(rumStartupScenario instanceof RumStartupScenario.Cold)) {
                    if (!(rumStartupScenario instanceof RumStartupScenario.WarmAfterActivityDestroyed ? true : rumStartupScenario instanceof RumStartupScenario.WarmFirstActivity)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i11 = 2;
                }
                return new VitalAppLaunchEvent(j, application, str10, str9, null, null, buildDDTagsString, vitalAppLaunchEventSession, i4, vitalAppLaunchEventView, usr, null, connectivity, synthetics, os, device, dd, context, new VitalAppLaunchEvent.Vital(m, str, i, valueOf, i11, Boolean.valueOf(rumStartupScenario.getHasSavedInstanceStateBundle())));
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public MemorySizeCalculator$Builder(InfoProvider infoProvider, InfoProvider infoProvider2, float f, InternalLogger internalLogger) {
        infoProvider.getClass();
        infoProvider2.getClass();
        internalLogger.getClass();
        this.context = infoProvider;
        this.activityManager = infoProvider2;
        this.bitmapPoolScreens = f;
        this.screenDimensions = internalLogger;
    }
}
