package com.datadog.android.rum.internal.domain.scope;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class RumActionScope implements RumScope {
    public final LinkedHashMap actionAttributes;
    public final String actionId;
    public long crashCount;
    public long errorCount;
    public final long eventTimestamp;
    public final long inactivityThresholdNs;
    public final HurlStack insightsCollector;
    public long lastInteractionNanos;
    public long longTaskCount;
    public final long maxDurationNs;
    public String name;
    public final NetworkInfo networkInfo;
    public final ArrayList ongoingResourceKeys;
    public final RumViewScope parentScope;
    public long resourceCount;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public boolean sent;
    public final long startedNanos;
    public boolean stopped;
    public long stoppedNanos;
    public final boolean trackFrustrations;

    /* renamed from: type, reason: collision with root package name */
    public RumActionType f948type;
    public final boolean waitForStop;

    public RumActionScope(RumViewScope rumViewScope, InternalSdkCore internalSdkCore, boolean z, Time time, RumActionType rumActionType, String str, Map map, long j, CueEncoder cueEncoder, boolean z2, float f, HurlStack hurlStack) {
        internalSdkCore.getClass();
        str.getClass();
        map.getClass();
        cueEncoder.getClass();
        hurlStack.getClass();
        this.parentScope = rumViewScope;
        this.sdkCore = internalSdkCore;
        this.waitForStop = z;
        this.trackFrustrations = z2;
        this.sampleRate = f;
        this.insightsCollector = hurlStack;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.inactivityThresholdNs = timeUnit.toNanos(100L);
        this.maxDurationNs = timeUnit.toNanos(5000L);
        this.eventTimestamp = time.timestamp + j;
        this.actionId = Boxes$$ExternalSyntheticOutline1.m();
        this.f948type = rumActionType;
        this.name = str;
        long j2 = time.nanoTime;
        this.startedNanos = j2;
        this.stoppedNanos = j2;
        this.lastInteractionNanos = j2;
        this.networkInfo = internalSdkCore.getNetworkInfo();
        this.actionAttributes = new LinkedHashMap(map);
        this.ongoingResourceKeys = new ArrayList();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final Map getCustomAttributes() {
        return MapsKt__MapsKt.plus(this.parentScope.getCustomAttributes(), this.actionAttributes);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope getParentScope() {
        return this.parentScope;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumContext getRumContext() {
        return this.parentScope.getRumContext();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope handleEvent(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        Object obj;
        Object obj2;
        rumRawEvent.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        long j = rumRawEvent.getEventTime().nanoTime;
        boolean z = false;
        boolean z2 = j - this.lastInteractionNanos > this.inactivityThresholdNs;
        boolean z3 = j - this.startedNanos > this.maxDurationNs;
        RumActionScope$handleEvent$1 rumActionScope$handleEvent$1 = RumActionScope$handleEvent$1.INSTANCE;
        ArrayList arrayList = this.ongoingResourceKeys;
        CollectionsKt__MutableCollectionsKt.removeAll(arrayList, rumActionScope$handleEvent$1);
        if (this.waitForStop && !this.stopped) {
            z = true;
        }
        if (z2 && arrayList.isEmpty() && !z) {
            sendAction(this.lastInteractionNanos, datadogContext, function1, dataWriter);
        } else if (z3) {
            sendAction(j, datadogContext, function1, dataWriter);
        } else if (rumRawEvent instanceof RumRawEvent.SendCustomActionNow) {
            sendAction(this.lastInteractionNanos, datadogContext, function1, dataWriter);
        } else if (rumRawEvent instanceof RumRawEvent.StartView) {
            arrayList.clear();
            sendAction(j, datadogContext, function1, dataWriter);
        } else if (rumRawEvent instanceof RumRawEvent.StopView) {
            arrayList.clear();
            sendAction(j, datadogContext, function1, dataWriter);
        } else if (rumRawEvent instanceof RumRawEvent.StopAction) {
            RumRawEvent.StopAction stopAction = (RumRawEvent.StopAction) rumRawEvent;
            RumActionType rumActionType = stopAction.f952type;
            if (rumActionType != null) {
                this.f948type = rumActionType;
            }
            this.name = "";
            this.actionAttributes.putAll(stopAction.attributes);
            this.stopped = true;
            this.stoppedNanos = j;
            this.lastInteractionNanos = j;
        } else if (rumRawEvent instanceof RumRawEvent.StartResource) {
            this.lastInteractionNanos = j;
            this.resourceCount++;
            arrayList.add(new WeakReference(((RumRawEvent.StartResource) rumRawEvent).key));
        } else if (rumRawEvent instanceof RumRawEvent.StopResource) {
            RumRawEvent.StopResource stopResource = (RumRawEvent.StopResource) rumRawEvent;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((WeakReference) obj2).get(), stopResource.key)) {
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj2;
            if (weakReference != null) {
                arrayList.remove(weakReference);
                this.lastInteractionNanos = j;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddError) {
            this.lastInteractionNanos = j;
            this.errorCount++;
            if (((RumRawEvent.AddError) rumRawEvent).isFatal) {
                this.crashCount++;
                sendAction(j, datadogContext, function1, dataWriter);
            }
        } else if (rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
            Object obj3 = ((RumRawEvent.StopResourceWithError) rumRawEvent).key;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((WeakReference) obj).get(), obj3)) {
                    break;
                }
            }
            WeakReference weakReference2 = (WeakReference) obj;
            if (weakReference2 != null) {
                arrayList.remove(weakReference2);
                this.lastInteractionNanos = j;
                this.resourceCount--;
                this.errorCount++;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddLongTask) {
            this.lastInteractionNanos = j;
            this.longTaskCount++;
        }
        if (this.sent) {
            return null;
        }
        return this;
    }

    public final void sendAction(long j, final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        if (this.sent) {
            return;
        }
        final RumActionType rumActionType = this.f948type;
        final RumContext rumContext = this.parentScope.getRumContext();
        String str = rumContext.syntheticsTestId;
        final String str2 = this.name;
        final long j2 = this.errorCount;
        final long j3 = this.crashCount;
        final long j4 = this.longTaskCount;
        final long j5 = this.resourceCount;
        final long max = Math.max(j - this.startedNanos, 1L);
        String str3 = rumContext.syntheticsResultId;
        final ActionEvent.Synthetics synthetics = (str == null || StringsKt.isBlank(str) || str3 == null || StringsKt.isBlank(str3)) ? null : new ActionEvent.Synthetics(str, str3, null);
        int i = synthetics == null ? 1 : 2;
        final ArrayList arrayList = new ArrayList();
        if (this.trackFrustrations && j2 > 0 && rumActionType == RumActionType.TAP) {
            arrayList.add(ActionEvent.Type.ERROR_TAP);
        }
        final int i2 = i;
        WriteOperation newRumEventWriteOperation = SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r10v10, types: [com.datadog.android.rum.model.ActionEvent$Plan, java.lang.Number] */
            /* JADX WARN: Type inference failed for: r10v15 */
            /* JADX WARN: Type inference failed for: r10v4 */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r10v6 */
            /* JADX WARN: Type inference failed for: r10v7 */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r10v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3;
                int i4;
                ?? r10;
                int i5;
                List list;
                int i6;
                DatadogContext datadogContext2 = DatadogContext.this;
                UserInfo userInfo = datadogContext2.userInfo;
                DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                RumContext rumContext2 = rumContext;
                String str4 = rumContext2.viewId;
                boolean resolveViewHasReplay = CueEncoder.resolveViewHasReplay(datadogContext2, str4 == null ? "" : str4);
                RumActionScope rumActionScope = this;
                rumActionScope.insightsCollector.getClass();
                long j6 = rumActionScope.eventTimestamp;
                ActionEvent.ActionEventActionType schemaType = zzhy.toSchemaType(rumActionType);
                String str5 = rumActionScope.actionId;
                String str6 = str2;
                str6.getClass();
                ActionEvent.ActionEventActionTarget actionEventActionTarget = new ActionEvent.ActionEventActionTarget();
                actionEventActionTarget.name = str6;
                ActionEvent.Error error = new ActionEvent.Error(j2);
                ActionEvent.Crash crash = new ActionEvent.Crash(j3);
                ActionEvent.LongTask longTask = new ActionEvent.LongTask(j4);
                ActionEvent.Resource resource = new ActionEvent.Resource(j5);
                ArrayList arrayList2 = arrayList;
                ActionEvent.ActionEventAction actionEventAction = new ActionEvent.ActionEventAction(schemaType, str5, Long.valueOf(max), actionEventActionTarget, !arrayList2.isEmpty() ? new ActionEvent.Frustration(arrayList2) : null, error, crash, longTask, resource);
                String str7 = str4 == null ? "" : str4;
                String str8 = rumContext2.viewName;
                String str9 = rumContext2.viewUrl;
                ActionEvent.ActionEventView actionEventView = new ActionEvent.ActionEventView(null, str7, null, str9 == null ? "" : str9, str8);
                ActionEvent.Application application = new ActionEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                ActionEvent.ActionEventSession actionEventSession = new ActionEvent.ActionEventSession(i2, Boolean.valueOf(resolveViewHasReplay), rumContext2.sessionId);
                String str10 = datadogContext2.source;
                InternalLogger internalLogger = rumActionScope.sdkCore.getInternalLogger();
                str10.getClass();
                internalLogger.getClass();
                try {
                } catch (NoSuchElementException e) {
                    DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str10, 27), e, false, 48);
                    i3 = 0;
                }
                for (int i7 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                    if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$1(i7).equals(str10)) {
                        i3 = i7;
                        ActionEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ActionEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                        ActionEvent.Os os = new ActionEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                        DeviceType deviceType = deviceInfo.deviceType;
                        deviceType.getClass();
                        switch (deviceType.ordinal()) {
                            case 0:
                                i4 = 1;
                                break;
                            case 1:
                                i4 = 3;
                                break;
                            case 2:
                                i4 = 4;
                                break;
                            case 3:
                                i4 = 2;
                                break;
                            case 4:
                                i4 = 5;
                                break;
                            case 5:
                                i4 = 6;
                                break;
                            case 6:
                                i4 = 7;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        String str11 = deviceInfo.deviceName;
                        String str12 = deviceInfo.deviceModel;
                        String str13 = deviceInfo.deviceBrand;
                        String str14 = deviceInfo.architecture;
                        LocaleInfo localeInfo = deviceInfo.localeInfo;
                        ActionEvent.Device device = new ActionEvent.Device(i4, str11, str12, str13, str14, null, localeInfo.locales, localeInfo.timeZone, null, null, null);
                        ActionEvent.Context context = new ActionEvent.Context(new LinkedHashMap(rumActionScope.getCustomAttributes()));
                        int i8 = rumContext2.sessionStartReason;
                        if (i8 == 0) {
                            throw null;
                        }
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i8)) {
                            case 0:
                                r10 = 0;
                                i5 = 1;
                                break;
                            case 1:
                                r10 = 0;
                                i5 = 2;
                                break;
                            case 2:
                                r10 = 0;
                                i5 = 3;
                                break;
                            case 3:
                                r10 = 0;
                                i5 = 4;
                                break;
                            case 4:
                                r10 = 0;
                                i5 = 5;
                                break;
                            case 5:
                                r10 = 0;
                                i5 = 6;
                                break;
                            case 6:
                                r10 = 0;
                                i5 = 7;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        ActionEvent.Dd dd = new ActionEvent.Dd(new ActionEvent.DdSession(r10, i5), new ActionEvent.Configuration(Float.valueOf(rumActionScope.sampleRate), r10, r10), null, null, null);
                        NetworkInfo networkInfo = rumActionScope.networkInfo;
                        networkInfo.getClass();
                        boolean isConnected = zzhy.isConnected(networkInfo);
                        String str15 = networkInfo.carrierName;
                        int i9 = isConnected ? 1 : 2;
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                            case 0:
                                list = EmptyList.INSTANCE;
                                break;
                            case 1:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.ETHERNET);
                                break;
                            case 2:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.WIFI);
                                break;
                            case 3:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.WIMAX);
                                break;
                            case 4:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.BLUETOOTH);
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.CELLULAR);
                                break;
                            case 11:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ActionEvent.Interface.OTHER);
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        String str16 = networkInfo.cellularTechnology;
                        return new ActionEvent(j6, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), actionEventSession, i3, actionEventView, usr, null, new ActionEvent.Connectivity(i9, list, 0, (str16 == null && str15 == null) ? null : new ActionEvent.Cellular(str16, str15)), null, synthetics, null, os, device, dd, context, null, actionEventAction);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        });
        final StorageEvent.Action action = new StorageEvent.Action(arrayList.size(), zzhy.toSchemaType(rumActionType), this.stoppedNanos);
        final int i3 = 0;
        newRumEventWriteOperation.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                StorageEvent.Action action2 = action;
                RumContext rumContext2 = rumContext;
                switch (i4) {
                    case 0:
                        AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj;
                        advancedRumMonitor.getClass();
                        String str4 = rumContext2.viewId;
                        advancedRumMonitor.eventDropped(str4 != null ? str4 : "", action2);
                        break;
                    default:
                        AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj;
                        advancedRumMonitor2.getClass();
                        String str5 = rumContext2.viewId;
                        advancedRumMonitor2.eventSent(str5 != null ? str5 : "", action2);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i4 = 1;
        newRumEventWriteOperation.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumActionScope$sendAction$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                StorageEvent.Action action2 = action;
                RumContext rumContext2 = rumContext;
                switch (i42) {
                    case 0:
                        AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj;
                        advancedRumMonitor.getClass();
                        String str4 = rumContext2.viewId;
                        advancedRumMonitor.eventDropped(str4 != null ? str4 : "", action2);
                        break;
                    default:
                        AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj;
                        advancedRumMonitor2.getClass();
                        String str5 = rumContext2.viewId;
                        advancedRumMonitor2.eventSent(str5 != null ? str5 : "", action2);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        newRumEventWriteOperation.submit();
        this.sent = true;
    }
}
