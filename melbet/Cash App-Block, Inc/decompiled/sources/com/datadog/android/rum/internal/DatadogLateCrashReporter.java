package com.datadog.android.rum.internal;

import android.app.ApplicationExitInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.anr.AndroidTraceParser;
import com.datadog.android.rum.internal.anr.AndroidTraceParser$parse$2;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.LinesIterator;
import kotlin.text.MatcherMatchResult;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import papa.AppUpdateData;

/* loaded from: classes4.dex */
public final class DatadogLateCrashReporter implements LateCrashReporter {
    public final AndroidTraceParser androidTraceParser;
    public final Deserializer rumEventDeserializer;
    public final InternalSdkCore sdkCore;

    public DatadogLateCrashReporter(InternalSdkCore internalSdkCore) {
        NdkCrashLogDeserializer ndkCrashLogDeserializer = new NdkCrashLogDeserializer(internalSdkCore.getInternalLogger(), 2);
        AndroidTraceParser androidTraceParser = new AndroidTraceParser(internalSdkCore.getInternalLogger());
        internalSdkCore.getClass();
        this.sdkCore = internalSdkCore;
        this.rumEventDeserializer = ndkCrashLogDeserializer;
        this.androidTraceParser = androidTraceParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ErrorEvent access$resolveErrorEventFromViewEvent(DatadogLateCrashReporter datadogLateCrashReporter, DatadogContext datadogContext, int i, int i2, String str, long j, Long l, String str2, String str3, List list, ViewEvent viewEvent) {
        ErrorEvent.Connectivity connectivity;
        boolean z;
        int i3;
        int i4;
        ViewEvent.Account account;
        String str4;
        DeviceInfo deviceInfo;
        String str5;
        String str6;
        String str7;
        long j2;
        ErrorEvent.Application application;
        String str8;
        ErrorEvent.Usr usr;
        ArrayList arrayList;
        Number number;
        String asString;
        int i5;
        int[] values;
        int length;
        int i6;
        String str9;
        ArrayList arrayList2;
        ViewEvent.Connectivity connectivity2 = viewEvent.connectivity;
        ViewEvent.Usr usr2 = viewEvent.usr;
        if (connectivity2 != null) {
            int i7 = connectivity2.status;
            int i8 = 2;
            if (i7 == 1) {
                str9 = "CONNECTED";
            } else if (i7 == 2) {
                str9 = "NOT_CONNECTED";
            } else {
                if (i7 != 3) {
                    throw null;
                }
                str9 = "MAYBE";
            }
            if (str9.equals("CONNECTED")) {
                i8 = 1;
            } else if (!str9.equals("NOT_CONNECTED")) {
                if (str9.equals("MAYBE")) {
                    i8 = 3;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.datadog.android.rum.model.ErrorEvent.Status.".concat(str9));
                    i8 = 0;
                }
            }
            List list2 = connectivity2.interfaces;
            if (list2 != null) {
                List list3 = list2;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ErrorEvent.Interface.valueOf(((ViewEvent.Interface) it.next()).name()));
                }
            } else {
                arrayList2 = null;
            }
            ViewEvent.Cellular cellular = connectivity2.cellular;
            connectivity = new ErrorEvent.Connectivity(i8, arrayList2, 0, new ErrorEvent.Cellular(cellular != null ? cellular.technology : null, cellular != null ? cellular.carrierName : null));
        } else {
            connectivity = null;
        }
        ViewEvent.Context context = viewEvent.context;
        LinkedHashMap linkedHashMap = context != null ? context.additionalProperties : new LinkedHashMap();
        Map linkedHashMap2 = usr2 != null ? usr2.additionalProperties : new LinkedHashMap();
        if ((usr2 != null ? usr2.id : null) == null) {
            if ((usr2 != null ? usr2.anonymousId : null) == null) {
                if ((usr2 != null ? usr2.name : null) == null) {
                    if ((usr2 != null ? usr2.email : null) == null && linkedHashMap2.isEmpty()) {
                        z = false;
                        ViewEvent.Account account2 = viewEvent.account;
                        DeviceInfo deviceInfo2 = datadogContext.deviceInfo;
                        long j3 = j + datadogContext.time.serverTimeOffsetMs;
                        String str10 = datadogContext.appBuildId;
                        ErrorEvent.Application application2 = new ErrorEvent.Application(viewEvent.application.id, null);
                        String str11 = viewEvent.service;
                        ErrorEvent.ErrorEventSession errorEventSession = new ErrorEvent.ErrorEventSession(1, null, viewEvent.session.id);
                        i3 = viewEvent.source;
                        if (i3 != 0 || (asString = new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i3)).getAsString()) == null) {
                            i4 = 0;
                        } else {
                            InternalLogger internalLogger = datadogLateCrashReporter.sdkCore.getInternalLogger();
                            internalLogger.getClass();
                            try {
                                values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                length = values.length;
                                i6 = 0;
                            } catch (NoSuchElementException e) {
                                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(asString, 26), e, false, 48);
                                i5 = 0;
                            }
                            while (i6 < length) {
                                i5 = values[i6];
                                int[] iArr = values;
                                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i5).equals(asString)) {
                                    i4 = i5;
                                } else {
                                    i6++;
                                    values = iArr;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        ViewEvent.ViewEventView viewEventView = viewEvent.view;
                        ErrorEvent.ErrorEventView errorEventView = new ErrorEvent.ErrorEventView(viewEventView.id, 16, viewEventView.referrer, viewEventView.url, viewEventView.name);
                        if (z) {
                            account = account2;
                            deviceInfo = deviceInfo2;
                            str6 = str10;
                            j2 = j3;
                            usr = null;
                            application = application2;
                        } else {
                            if (usr2 != null) {
                                account = account2;
                                str4 = usr2.id;
                            } else {
                                account = account2;
                                str4 = null;
                            }
                            if (usr2 != null) {
                                deviceInfo = deviceInfo2;
                                str5 = usr2.name;
                            } else {
                                deviceInfo = deviceInfo2;
                                str5 = null;
                            }
                            if (usr2 != null) {
                                str6 = str10;
                                str7 = usr2.email;
                            } else {
                                str6 = str10;
                                str7 = null;
                            }
                            if (usr2 != null) {
                                j2 = j3;
                                application = application2;
                                str8 = usr2.anonymousId;
                            } else {
                                j2 = j3;
                                application = application2;
                                str8 = null;
                            }
                            usr = new ErrorEvent.Usr(str4, str5, str7, str8, linkedHashMap2);
                        }
                        ErrorEvent.Account account3 = account == null ? new ErrorEvent.Account(account.id, account.name, account.additionalProperties) : null;
                        ErrorEvent.Os os = new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                        ErrorEvent.Device device = new ErrorEvent.Device(zzhy.toErrorSchemaType(deviceInfo.deviceType), deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, (List) null, (String) null, (Number) null, (Boolean) null, (Number) null, 2016);
                        ErrorEvent.DdSession ddSession = new ErrorEvent.DdSession(0, 3);
                        ViewEvent.Configuration configuration = viewEvent.dd.configuration;
                        ErrorEvent.Dd dd = new ErrorEvent.Dd(ddSession, new ErrorEvent.Configuration(Float.valueOf((configuration != null || (number = configuration.sessionSampleRate) == null) ? RecyclerView.DECELERATION_RATE : number.floatValue()), null, null), null, null);
                        ErrorEvent.Context context2 = new ErrorEvent.Context(linkedHashMap);
                        String uuid = UUID.randomUUID().toString();
                        if (list == null) {
                            List<ThreadDump> list4 = list;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            for (ThreadDump threadDump : list4) {
                                arrayList3.add(new ErrorEvent.Thread(threadDump.name, threadDump.crashed, threadDump.stack, threadDump.state));
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        return new ErrorEvent(j2, application, str11, viewEvent.version, null, str6, RumTagsUtilsKt.buildDDTagsString(datadogContext), errorEventSession, i4, errorEventView, usr, account3, connectivity, null, os, device, dd, context2, null, new ErrorEvent.Error(uuid, str, 2, str2, Boolean.TRUE, null, str3, i2, i, null, arrayList, l, 251472), null, 28368912);
                    }
                }
            }
        }
        z = true;
        ViewEvent.Account account22 = viewEvent.account;
        DeviceInfo deviceInfo22 = datadogContext.deviceInfo;
        long j32 = j + datadogContext.time.serverTimeOffsetMs;
        String str102 = datadogContext.appBuildId;
        ErrorEvent.Application application22 = new ErrorEvent.Application(viewEvent.application.id, null);
        String str112 = viewEvent.service;
        ErrorEvent.ErrorEventSession errorEventSession2 = new ErrorEvent.ErrorEventSession(1, null, viewEvent.session.id);
        i3 = viewEvent.source;
        if (i3 != 0) {
        }
        i4 = 0;
        ViewEvent.ViewEventView viewEventView2 = viewEvent.view;
        ErrorEvent.ErrorEventView errorEventView2 = new ErrorEvent.ErrorEventView(viewEventView2.id, 16, viewEventView2.referrer, viewEventView2.url, viewEventView2.name);
        if (z) {
        }
        if (account == null) {
        }
        ErrorEvent.Os os2 = new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
        ErrorEvent.Device device2 = new ErrorEvent.Device(zzhy.toErrorSchemaType(deviceInfo.deviceType), deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, (List) null, (String) null, (Number) null, (Boolean) null, (Number) null, 2016);
        ErrorEvent.DdSession ddSession2 = new ErrorEvent.DdSession(0, 3);
        ViewEvent.Configuration configuration2 = viewEvent.dd.configuration;
        ErrorEvent.Dd dd2 = new ErrorEvent.Dd(ddSession2, new ErrorEvent.Configuration(Float.valueOf((configuration2 != null || (number = configuration2.sessionSampleRate) == null) ? RecyclerView.DECELERATION_RATE : number.floatValue()), null, null), null, null);
        ErrorEvent.Context context22 = new ErrorEvent.Context(linkedHashMap);
        String uuid2 = UUID.randomUUID().toString();
        if (list == null) {
        }
        return new ErrorEvent(j2, application, str112, viewEvent.version, null, str6, RumTagsUtilsKt.buildDDTagsString(datadogContext), errorEventSession2, i4, errorEventView2, usr, account3, connectivity, null, os2, device2, dd2, context22, null, new ErrorEvent.Error(uuid2, str, 2, str2, Boolean.TRUE, null, str3, i2, i, null, arrayList, l, 251472), null, 28368912);
    }

    public static final ViewEvent access$updateViewEvent(DatadogLateCrashReporter datadogLateCrashReporter, ViewEvent viewEvent) {
        ViewEvent.ViewEventView viewEventView = viewEvent.view;
        ViewEvent.Crash crash = viewEventView.crash;
        ViewEvent.ViewEventView copy$default = ViewEvent.ViewEventView.copy$default(viewEventView, null, crash != null ? new ViewEvent.Crash(crash.count + 1) : new ViewEvent.Crash(1L), 2013265919);
        ViewEvent.Dd dd = viewEvent.dd;
        return ViewEvent.copy$default(viewEvent, copy$default, null, null, new ViewEvent.Dd(dd.session, dd.configuration, dd.browserSdkVersion, dd.sdkName, dd.documentVersion + 1, dd.pageStates, dd.replayStats, dd.cls, dd.profiling), null, 8125951);
    }

    public final void handleAnrCrash(final ApplicationExitInfo applicationExitInfo, JsonObject jsonObject, final DataWriter dataWriter) {
        dataWriter.getClass();
        Object deserialize = this.rumEventDeserializer.deserialize(jsonObject);
        final ViewEvent viewEvent = deserialize instanceof ViewEvent ? (ViewEvent) deserialize : null;
        if (viewEvent == null) {
            return;
        }
        if (applicationExitInfo.getTimestamp() > viewEvent.date) {
            InternalSdkCore internalSdkCore = this.sdkCore;
            SdkFeature feature = internalSdkCore.getFeature("rum");
            if (feature == null) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, InternalLogger.Target.USER, RumFeature$onInitialize$1.INSTANCE$1, null, false, 56);
            } else {
                feature.withWriteContext(SetsKt__SetsJVMKt.setOf("rum"), new Function2() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0200  */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2) {
                        DatadogContext datadogContext;
                        EmptyList emptyList;
                        EmptyList emptyList2;
                        Object obj3;
                        InputStream traceInputStream;
                        String str;
                        List list;
                        Iterator it;
                        DatadogContext datadogContext2;
                        List split$default;
                        DatadogContext datadogContext3 = (DatadogContext) obj;
                        Function1 function1 = (Function1) obj2;
                        datadogContext3.getClass();
                        function1.getClass();
                        final ViewEvent viewEvent2 = ViewEvent.this;
                        String str2 = viewEvent2.session.id;
                        final DatadogLateCrashReporter datadogLateCrashReporter = this;
                        InternalSdkCore internalSdkCore2 = datadogLateCrashReporter.sdkCore;
                        Map map = (Map) datadogContext3.featuresContext.get("rum");
                        if (map == null) {
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        }
                        Object obj4 = map.get("session_id");
                        if (!Intrinsics.areEqual(str2, obj4 instanceof String ? (String) obj4 : null)) {
                            Long lastFatalAnrSent = internalSdkCore2.getLastFatalAnrSent();
                            long timestamp = applicationExitInfo.getTimestamp();
                            if (lastFatalAnrSent == null || timestamp != lastFatalAnrSent.longValue()) {
                                ApplicationExitInfo applicationExitInfo2 = applicationExitInfo;
                                InternalLogger.Target target = InternalLogger.Target.USER;
                                try {
                                    traceInputStream = applicationExitInfo2.getTraceInputStream();
                                } catch (IOException e) {
                                    datadogContext = datadogContext3;
                                    DBUtil.log$default(internalSdkCore2.getInternalLogger(), 5, target, RumFeature$onInitialize$1.INSTANCE$5, e, false, 48);
                                    emptyList = EmptyList.INSTANCE;
                                }
                                if (traceInputStream == null) {
                                    DBUtil.log$default(internalSdkCore2.getInternalLogger(), 4, target, RumFeature$onInitialize$1.INSTANCE$4, null, false, 56);
                                    emptyList = EmptyList.INSTANCE;
                                } else {
                                    AndroidTraceParser androidTraceParser = datadogLateCrashReporter.androidTraceParser;
                                    androidTraceParser.getClass();
                                    try {
                                        try {
                                            str = AppUpdateData.readText(new InputStreamReader(traceInputStream, Charsets.UTF_8));
                                            traceInputStream.close();
                                        } catch (IOException e2) {
                                            DBUtil.log$default(androidTraceParser.internalLogger, 5, target, AndroidTraceParser$parse$2.INSTANCE$2, e2, false, 48);
                                            str = "";
                                        }
                                        if (StringsKt.isBlank(str)) {
                                            emptyList = EmptyList.INSTANCE;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            StringBuilder sb = new StringBuilder();
                                            LinesIterator linesIterator = new LinesIterator(str);
                                            if (linesIterator.hasNext()) {
                                                Object next = linesIterator.next();
                                                if (linesIterator.hasNext()) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(next);
                                                    while (linesIterator.hasNext()) {
                                                        arrayList2.add(linesIterator.next());
                                                    }
                                                    list = arrayList2;
                                                } else {
                                                    list = CollectionsKt__CollectionsJVMKt.listOf(next);
                                                }
                                            } else {
                                                list = EmptyList.INSTANCE;
                                            }
                                            Iterator it2 = list.iterator();
                                            boolean z = false;
                                            String str3 = null;
                                            String str4 = null;
                                            while (it2.hasNext()) {
                                                String str5 = (String) it2.next();
                                                if (StringsKt.isBlank(str5) && z) {
                                                    if (sb.length() <= 0 || str3 == null) {
                                                        it = it2;
                                                    } else {
                                                        String str6 = str4 == null ? "" : str4;
                                                        if (str6.equals("TimedWaiting")) {
                                                            str6 = "Timed_Waiting";
                                                        }
                                                        Locale locale = Locale.US;
                                                        it = it2;
                                                        arrayList.add(new ThreadDump(str3, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str6, locale), sb.toString(), str3.equals("main")));
                                                    }
                                                    sb.setLength(0);
                                                    z = false;
                                                } else {
                                                    it = it2;
                                                    if (StringsKt.contains((CharSequence) str5, (CharSequence) " prio=", false) && StringsKt.contains((CharSequence) str5, (CharSequence) " tid=", false)) {
                                                        split$default = StringsKt__StringsKt.split$default(str5, new String[]{" "}, false, 0, 6, null);
                                                        str4 = (String) CollectionsKt.lastOrNull(split$default);
                                                        MatcherMatchResult matchEntire = AndroidTraceParser.THREAD_NAME_REGEX.matchEntire(str5);
                                                        z = true;
                                                        str3 = matchEntire != null ? (String) CollectionsKt.getOrNull(1, matchEntire.getGroupValues()) : null;
                                                    } else {
                                                        if (z) {
                                                            String obj5 = StringsKt.trimStart(str5).toString();
                                                            datadogContext2 = datadogContext3;
                                                            if (StringsKt__StringsJVMKt.startsWith(obj5, "at ", false) || StringsKt__StringsJVMKt.startsWith(obj5, "native: ", false)) {
                                                                if (sb.length() > 0) {
                                                                    sb.append('\n');
                                                                }
                                                                sb.append(str5);
                                                            }
                                                        } else {
                                                            datadogContext2 = datadogContext3;
                                                        }
                                                        it2 = it;
                                                        datadogContext3 = datadogContext2;
                                                    }
                                                }
                                                it2 = it;
                                            }
                                            datadogContext = datadogContext3;
                                            if (arrayList.isEmpty()) {
                                                DBUtil.log$default(androidTraceParser.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), AndroidTraceParser$parse$2.INSTANCE, null, 56);
                                            }
                                            emptyList = arrayList;
                                            emptyList2 = emptyList;
                                            if (!emptyList2.isEmpty()) {
                                                long timestamp2 = applicationExitInfo.getTimestamp();
                                                Iterator<E> it3 = emptyList2.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = it3.next();
                                                    if (Intrinsics.areEqual(((ThreadDump) obj3).name, "main")) {
                                                        break;
                                                    }
                                                }
                                                ThreadDump threadDump = (ThreadDump) obj3;
                                                String str7 = threadDump != null ? threadDump.stack : null;
                                                String str8 = str7 == null ? "" : str7;
                                                String canonicalName = ANRException.class.getCanonicalName();
                                                final ErrorEvent access$resolveErrorEventFromViewEvent = DatadogLateCrashReporter.access$resolveErrorEventFromViewEvent(datadogLateCrashReporter, datadogContext, 1, 1, "Application Not Responding", timestamp2, null, str8, canonicalName == null ? "" : canonicalName, emptyList2, viewEvent2);
                                                final ApplicationExitInfo applicationExitInfo3 = applicationExitInfo;
                                                final DataWriter dataWriter2 = dataWriter;
                                                function1.invoke(new Function1() { // from class: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj6) {
                                                        EventBatchWriter eventBatchWriter = (EventBatchWriter) obj6;
                                                        eventBatchWriter.getClass();
                                                        DatadogLateCrashReporter datadogLateCrashReporter2 = DatadogLateCrashReporter.this;
                                                        InternalSdkCore internalSdkCore3 = datadogLateCrashReporter2.sdkCore;
                                                        internalSdkCore3.writeLastFatalAnrSent(applicationExitInfo3.getTimestamp());
                                                        DataWriter dataWriter3 = dataWriter2;
                                                        dataWriter3.write(eventBatchWriter, access$resolveErrorEventFromViewEvent, 2);
                                                        internalSdkCore3.getTimeProvider().getClass();
                                                        long currentTimeMillis = System.currentTimeMillis();
                                                        ViewEvent viewEvent3 = viewEvent2;
                                                        if (currentTimeMillis - viewEvent3.date < 14400000) {
                                                            dataWriter3.write(eventBatchWriter, DatadogLateCrashReporter.access$updateViewEvent(datadogLateCrashReporter2, viewEvent3), 2);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                datadogContext = datadogContext3;
                                emptyList2 = emptyList;
                                if (!emptyList2.isEmpty()) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
        }
    }
}
