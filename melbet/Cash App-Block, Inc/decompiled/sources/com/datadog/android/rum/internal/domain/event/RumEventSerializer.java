package com.datadog.android.rum.internal.domain.event;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.datadog.android.core.constraints.DatadogDataConstraints$validateTimings$1$1;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.VitalAppLaunchEvent;
import com.datadog.android.rum.model.VitalOperationStepEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent$Usage$AddViewLoadingTime;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.ecr.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class RumEventSerializer implements Serializer {
    public final DatadogDataConstraints dataConstraints;
    public final InternalLogger internalLogger;
    public static final Set knownAttributes = ArraysKt___ArraysKt.toSet(new String[]{"action.gesture.direction", "action.gesture.from_state", "action.gesture.to_state", "action.target.parent.resource_id", "action.target.parent.classname", "action.target.parent.index", "action.target.classname", "action.target.resource_id", "action.target.title", "action.target.selected", "action.target.role", "error.resource.method", "error.resource.status_code", "error.resource.url"});
    public static final Set ignoredAttributes = ArraysKt___ArraysKt.toSet(new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});
    public static final Set crossPlatformTransitAttributes = ArraysKt___ArraysKt.toSet(new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});

    public RumEventSerializer(InternalLogger internalLogger) {
        DatadogDataConstraints datadogDataConstraints = new DatadogDataConstraints(internalLogger);
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.dataConstraints = datadogDataConstraints;
    }

    public static void extractKnownAttributes(JsonObject jsonObject) {
        if (jsonObject.has("context")) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("context");
            Set<Map.Entry<String, JsonElement>> entrySet = asJsonObject.entrySet();
            entrySet.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entrySet) {
                if (knownAttributes.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                asJsonObject.remove((String) entry.getKey());
                jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
        }
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public final String serialize(Object obj) {
        String str;
        String str2;
        ErrorEvent.Usr usr;
        ErrorEvent.Usr usr2;
        String str3;
        ErrorEvent.Account account;
        String str4;
        ViewEvent.Account account2;
        ViewEvent.CustomTimings customTimings;
        obj.getClass();
        boolean z = obj instanceof ViewEvent;
        InternalLogger internalLogger = this.internalLogger;
        if (z) {
            ViewEvent viewEvent = (ViewEvent) obj;
            ViewEvent.Usr usr3 = viewEvent.usr;
            ViewEvent.Usr usr4 = usr3 != null ? new ViewEvent.Usr(usr3.id, usr3.name, usr3.email, usr3.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr3.additionalProperties), internalLogger))) : null;
            ViewEvent.Account account3 = viewEvent.account;
            if (account3 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateAccountAttributes(account3.additionalProperties), internalLogger));
                String str5 = account3.id;
                String str6 = account3.name;
                str5.getClass();
                account2 = new ViewEvent.Account(str5, str6, linkedHashMap);
            } else {
                account2 = null;
            }
            ViewEvent.Context context = viewEvent.context;
            ViewEvent.Context context2 = context != null ? new ViewEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context.additionalProperties), internalLogger))) : null;
            ViewEvent.ViewEventView viewEventView = viewEvent.view;
            ViewEvent.CustomTimings customTimings2 = viewEventView.customTimings;
            if (customTimings2 != null) {
                LinkedHashMap linkedHashMap2 = customTimings2.additionalProperties;
                DatadogDataConstraints datadogDataConstraints = this.dataConstraints;
                datadogDataConstraints.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String replace = new Regex("[^a-zA-Z0-9\\-_.@$]").replace((CharSequence) entry.getKey(), "_");
                    if (!Intrinsics.areEqual(replace, entry.getKey())) {
                        DBUtil.log$default(datadogDataConstraints.internalLogger, 4, InternalLogger.Target.USER, new DatadogDataConstraints$validateTimings$1$1(entry, replace, 0), null, false, 56);
                    }
                    linkedHashMap3.put(replace, entry.getValue());
                }
                customTimings = new ViewEvent.CustomTimings(new LinkedHashMap(linkedHashMap3));
            } else {
                customTimings = null;
            }
            JsonObject asJsonObject = ViewEvent.copy$default(viewEvent, ViewEvent.ViewEventView.copy$default(viewEventView, customTimings, null, -67108865), usr4, account2, null, context2, 7860735).toJson().getAsJsonObject();
            asJsonObject.getClass();
            extractKnownAttributes(asJsonObject);
            String jsonElement = asJsonObject.toString();
            jsonElement.getClass();
            return jsonElement;
        }
        if (!(obj instanceof ErrorEvent)) {
            if (obj instanceof ActionEvent) {
                return serializeActionEvent((ActionEvent) obj);
            }
            if (obj instanceof ResourceEvent) {
                return serializeResourceEvent((ResourceEvent) obj);
            }
            if (obj instanceof LongTaskEvent) {
                return serializeLongTaskEvent((LongTaskEvent) obj);
            }
            if (obj instanceof VitalOperationStepEvent) {
                ((VitalOperationStepEvent) obj).getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(InquiryField.DateField.TYPE, (Number) 0L);
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("id", (String) null);
                jsonObject.add("application", jsonObject2);
                new JsonObject().addProperty("id", (String) null);
                throw null;
            }
            if (obj instanceof VitalAppLaunchEvent) {
                return serializeVitalAppLaunchEvent((VitalAppLaunchEvent) obj);
            }
            if (obj instanceof TelemetryDebugEvent) {
                TelemetryDebugEvent telemetryDebugEvent = (TelemetryDebugEvent) obj;
                JsonObject jsonObject3 = new JsonObject();
                JsonObject jsonObject4 = new JsonObject();
                jsonObject4.addProperty("format_version", (Number) 2L);
                jsonObject3.add("_dd", jsonObject4);
                jsonObject3.addProperty("type", "telemetry");
                jsonObject3.addProperty(InquiryField.DateField.TYPE, Long.valueOf(telemetryDebugEvent.date));
                jsonObject3.addProperty("service", telemetryDebugEvent.service);
                jsonObject3.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$20(telemetryDebugEvent.source)));
                jsonObject3.addProperty("version", telemetryDebugEvent.version);
                TelemetryDebugEvent.Application application = telemetryDebugEvent.application;
                if (application != null) {
                    JsonObject jsonObject5 = new JsonObject();
                    jsonObject5.addProperty("id", application.id);
                    jsonObject3.add("application", jsonObject5);
                }
                TelemetryDebugEvent.Session session = telemetryDebugEvent.session;
                if (session != null) {
                    JsonObject jsonObject6 = new JsonObject();
                    jsonObject6.addProperty("id", session.id);
                    jsonObject3.add("session", jsonObject6);
                }
                TelemetryDebugEvent.View view = telemetryDebugEvent.view;
                if (view != null) {
                    JsonObject jsonObject7 = new JsonObject();
                    jsonObject7.addProperty("id", view.id);
                    jsonObject3.add("view", jsonObject7);
                }
                TelemetryDebugEvent.Action action = telemetryDebugEvent.action;
                if (action != null) {
                    JsonObject jsonObject8 = new JsonObject();
                    jsonObject8.addProperty("id", action.id);
                    jsonObject3.add("action", jsonObject8);
                }
                Number number = telemetryDebugEvent.effectiveSampleRate;
                if (number != null) {
                    jsonObject3.addProperty("effective_sample_rate", number);
                }
                List list = telemetryDebugEvent.experimentalFeatures;
                if (list != null) {
                    JsonArray jsonArray = new JsonArray(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jsonArray.add((String) it.next());
                    }
                    jsonObject3.add("experimental_features", jsonArray);
                }
                TelemetryDebugEvent.Telemetry telemetry = telemetryDebugEvent.telemetry;
                JsonObject jsonObject9 = new JsonObject();
                TelemetryDebugEvent.Device device = telemetry.device;
                if (device != null) {
                    JsonObject jsonObject10 = new JsonObject();
                    String str7 = device.architecture;
                    if (str7 != null) {
                        jsonObject10.addProperty("architecture", str7);
                    }
                    String str8 = device.brand;
                    if (str8 != null) {
                        jsonObject10.addProperty("brand", str8);
                    }
                    String str9 = device.model;
                    if (str9 != null) {
                        jsonObject10.addProperty("model", str9);
                    }
                    jsonObject9.add("device", jsonObject10);
                }
                TelemetryDebugEvent.Os os = telemetry.os;
                if (os != null) {
                    JsonObject jsonObject11 = new JsonObject();
                    String str10 = os.build;
                    if (str10 != null) {
                        jsonObject11.addProperty("build", str10);
                    }
                    String str11 = os.name;
                    if (str11 != null) {
                        jsonObject11.addProperty("name", str11);
                    }
                    String str12 = os.version;
                    if (str12 != null) {
                        jsonObject11.addProperty("version", str12);
                    }
                    jsonObject9.add("os", jsonObject11);
                }
                jsonObject9.addProperty("type", "log");
                jsonObject9.addProperty("status", BuildConfig.BUILD_TYPE);
                jsonObject9.addProperty("message", telemetry.message);
                for (Map.Entry entry2 : telemetry.additionalProperties.entrySet()) {
                    String str13 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (!ArraysKt___ArraysKt.contains(TelemetryDebugEvent.Telemetry.RESERVED_PROPERTIES, str13)) {
                        jsonObject9.add(str13, JsonSerializer.toJsonElement(value));
                    }
                }
                jsonObject3.add("telemetry", jsonObject9);
                String jsonElement2 = jsonObject3.toString();
                jsonElement2.getClass();
                return jsonElement2;
            }
            if (obj instanceof TelemetryErrorEvent) {
                String jsonElement3 = ((TelemetryErrorEvent) obj).toJson().toString();
                jsonElement3.getClass();
                return jsonElement3;
            }
            if (obj instanceof TelemetryConfigurationEvent) {
                String jsonElement4 = ((TelemetryConfigurationEvent) obj).toJson().toString();
                jsonElement4.getClass();
                return jsonElement4;
            }
            if (!(obj instanceof TelemetryUsageEvent)) {
                if (obj instanceof JsonObject) {
                    return obj.toString();
                }
                String jsonElement5 = new JsonObject().toString();
                jsonElement5.getClass();
                return jsonElement5;
            }
            TelemetryUsageEvent telemetryUsageEvent = (TelemetryUsageEvent) obj;
            JsonObject jsonObject12 = new JsonObject();
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("format_version", (Number) 2L);
            jsonObject12.add("_dd", jsonObject13);
            jsonObject12.addProperty("type", "telemetry");
            jsonObject12.addProperty(InquiryField.DateField.TYPE, Long.valueOf(telemetryUsageEvent.date));
            jsonObject12.addProperty("service", "dd-sdk-android");
            jsonObject12.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$22(telemetryUsageEvent.source)));
            jsonObject12.addProperty("version", telemetryUsageEvent.version);
            TelemetryUsageEvent.Application application2 = telemetryUsageEvent.application;
            JsonObject jsonObject14 = new JsonObject();
            jsonObject14.addProperty("id", application2.id);
            jsonObject12.add("application", jsonObject14);
            TelemetryUsageEvent.Session session2 = telemetryUsageEvent.session;
            JsonObject jsonObject15 = new JsonObject();
            jsonObject15.addProperty("id", session2.id);
            jsonObject12.add("session", jsonObject15);
            TelemetryUsageEvent.View view2 = telemetryUsageEvent.view;
            if (view2 != null) {
                JsonObject jsonObject16 = new JsonObject();
                jsonObject16.addProperty("id", view2.id);
                jsonObject12.add("view", jsonObject16);
            }
            TelemetryUsageEvent.Action action2 = telemetryUsageEvent.action;
            if (action2 != null) {
                JsonObject jsonObject17 = new JsonObject();
                jsonObject17.addProperty("id", action2.id);
                jsonObject12.add("action", jsonObject17);
            }
            jsonObject12.addProperty("effective_sample_rate", telemetryUsageEvent.effectiveSampleRate);
            TelemetryUsageEvent.Telemetry telemetry2 = telemetryUsageEvent.telemetry;
            JsonObject jsonObject18 = new JsonObject();
            TelemetryUsageEvent.Device device2 = telemetry2.device;
            JsonObject jsonObject19 = new JsonObject();
            String str14 = device2.architecture;
            if (str14 != null) {
                jsonObject19.addProperty("architecture", str14);
            }
            String str15 = device2.brand;
            if (str15 != null) {
                jsonObject19.addProperty("brand", str15);
            }
            String str16 = device2.model;
            if (str16 != null) {
                jsonObject19.addProperty("model", str16);
            }
            jsonObject18.add("device", jsonObject19);
            TelemetryUsageEvent.Os os2 = telemetry2.os;
            JsonObject jsonObject20 = new JsonObject();
            String str17 = os2.build;
            if (str17 != null) {
                jsonObject20.addProperty("build", str17);
            }
            String str18 = os2.name;
            if (str18 != null) {
                jsonObject20.addProperty("name", str18);
            }
            String str19 = os2.version;
            if (str19 != null) {
                jsonObject20.addProperty("version", str19);
            }
            jsonObject18.add("os", jsonObject20);
            jsonObject18.addProperty("type", "usage");
            TelemetryUsageEvent$Usage$AddViewLoadingTime telemetryUsageEvent$Usage$AddViewLoadingTime = telemetry2.usage;
            JsonObject jsonObject21 = new JsonObject();
            jsonObject21.addProperty("feature", "addViewLoadingTime");
            jsonObject21.addProperty("no_view", Boolean.valueOf(telemetryUsageEvent$Usage$AddViewLoadingTime.noView));
            jsonObject21.addProperty("no_active_view", Boolean.valueOf(telemetryUsageEvent$Usage$AddViewLoadingTime.noActiveView));
            jsonObject21.addProperty("overwritten", Boolean.valueOf(telemetryUsageEvent$Usage$AddViewLoadingTime.overwritten));
            jsonObject18.add("usage", jsonObject21);
            for (Map.Entry entry3 : telemetry2.additionalProperties.entrySet()) {
                String str20 = (String) entry3.getKey();
                Object value2 = entry3.getValue();
                if (!ArraysKt___ArraysKt.contains(TelemetryUsageEvent.Telemetry.RESERVED_PROPERTIES, str20)) {
                    jsonObject18.add(str20, JsonSerializer.toJsonElement(value2));
                }
            }
            jsonObject12.add("telemetry", jsonObject18);
            String jsonElement6 = jsonObject12.toString();
            jsonElement6.getClass();
            return jsonElement6;
        }
        ErrorEvent errorEvent = (ErrorEvent) obj;
        ErrorEvent.Usr usr5 = errorEvent.usr;
        if (usr5 != null) {
            str2 = "build";
            str = "status";
            usr = new ErrorEvent.Usr(usr5.id, usr5.name, usr5.email, usr5.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr5.additionalProperties), internalLogger)));
        } else {
            str = "status";
            str2 = "build";
            usr = null;
        }
        ErrorEvent.Account account4 = errorEvent.account;
        if (account4 != null) {
            usr2 = usr;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateAccountAttributes(account4.additionalProperties), internalLogger));
            String str21 = account4.id;
            String str22 = account4.name;
            str21.getClass();
            str3 = "view";
            account = new ErrorEvent.Account(str21, str22, linkedHashMap4);
        } else {
            usr2 = usr;
            str3 = "view";
            account = null;
        }
        ErrorEvent.Context context3 = errorEvent.context;
        ErrorEvent.Context context4 = context3 != null ? new ErrorEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context3.additionalProperties), internalLogger))) : null;
        long j = errorEvent.date;
        ErrorEvent.Application application3 = errorEvent.application;
        String str23 = errorEvent.service;
        ErrorEvent.Context context5 = context4;
        String str24 = errorEvent.version;
        String str25 = errorEvent.buildVersion;
        String str26 = errorEvent.buildId;
        ErrorEvent.Account account5 = account;
        String str27 = errorEvent.ddtags;
        ErrorEvent.ErrorEventSession errorEventSession = errorEvent.session;
        int i = errorEvent.source;
        ErrorEvent.ErrorEventView errorEventView = errorEvent.view;
        ErrorEvent.Connectivity connectivity = errorEvent.connectivity;
        ErrorEvent.Display display = errorEvent.display;
        ErrorEvent.Synthetics synthetics = errorEvent.synthetics;
        ErrorEvent.CiTest ciTest = errorEvent.ciTest;
        ErrorEvent.Os os3 = errorEvent.os;
        ErrorEvent.Device device3 = errorEvent.device;
        ErrorEvent.Dd dd = errorEvent.dd;
        ErrorEvent.Action action3 = errorEvent.action;
        ErrorEvent.Container container = errorEvent.container;
        ErrorEvent.Error error = errorEvent.error;
        ErrorEvent.Freeze freeze = errorEvent.freeze;
        ErrorEvent.Context context6 = errorEvent.featureFlags;
        application3.getClass();
        errorEventSession.getClass();
        errorEventView.getClass();
        dd.getClass();
        error.getClass();
        JsonObject jsonObject22 = new JsonObject();
        jsonObject22.addProperty(InquiryField.DateField.TYPE, Long.valueOf(j));
        JsonObject jsonObject23 = new JsonObject();
        jsonObject23.addProperty("id", application3.id);
        String str28 = application3.currentLocale;
        if (str28 != null) {
            jsonObject23.addProperty("current_locale", str28);
        }
        jsonObject22.add("application", jsonObject23);
        if (str23 != null) {
            jsonObject22.addProperty("service", str23);
        }
        if (str24 != null) {
            jsonObject22.addProperty("version", str24);
        }
        if (str25 != null) {
            jsonObject22.addProperty("build_version", str25);
        }
        if (str26 != null) {
            jsonObject22.addProperty("build_id", str26);
        }
        if (str27 != null) {
            jsonObject22.addProperty("ddtags", str27);
        }
        JsonObject jsonObject24 = new JsonObject();
        jsonObject24.addProperty("id", errorEventSession.id);
        jsonObject24.add("type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$11(errorEventSession.f962type)));
        Boolean bool = errorEventSession.hasReplay;
        if (bool != null) {
            jsonObject24.addProperty("has_replay", bool);
        }
        jsonObject22.add("session", jsonObject24);
        if (i != 0) {
            str4 = "source";
            jsonObject22.add(str4, new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i)));
        } else {
            str4 = "source";
        }
        JsonObject jsonObject25 = new JsonObject();
        jsonObject25.addProperty("id", errorEventView.id);
        String str29 = errorEventView.referrer;
        if (str29 != null) {
            jsonObject25.addProperty("referrer", str29);
        }
        jsonObject25.addProperty("url", errorEventView.url);
        String str30 = errorEventView.name;
        if (str30 != null) {
            jsonObject25.addProperty("name", str30);
        }
        Boolean bool2 = errorEventView.inForeground;
        if (bool2 != null) {
            jsonObject25.addProperty("in_foreground", bool2);
        }
        String str31 = str3;
        jsonObject22.add(str31, jsonObject25);
        if (usr2 != null) {
            JsonObject jsonObject26 = new JsonObject();
            ErrorEvent.Usr usr6 = usr2;
            String str32 = usr6.id;
            if (str32 != null) {
                jsonObject26.addProperty("id", str32);
            }
            String str33 = usr6.name;
            if (str33 != null) {
                jsonObject26.addProperty("name", str33);
            }
            String str34 = usr6.email;
            if (str34 != null) {
                jsonObject26.addProperty("email", str34);
            }
            String str35 = usr6.anonymousId;
            if (str35 != null) {
                jsonObject26.addProperty("anonymous_id", str35);
            }
            for (Map.Entry entry4 : usr6.additionalProperties.entrySet()) {
                String str36 = (String) entry4.getKey();
                Object value3 = entry4.getValue();
                if (!ArraysKt___ArraysKt.contains(ErrorEvent.Usr.RESERVED_PROPERTIES, str36)) {
                    jsonObject26.add(str36, JsonSerializer.toJsonElement(value3));
                }
            }
            jsonObject22.add("usr", jsonObject26);
        }
        if (account5 != null) {
            JsonObject jsonObject27 = new JsonObject();
            jsonObject27.addProperty("id", account5.id);
            String str37 = account5.name;
            if (str37 != null) {
                jsonObject27.addProperty("name", str37);
            }
            for (Map.Entry entry5 : account5.additionalProperties.entrySet()) {
                String str38 = (String) entry5.getKey();
                Object value4 = entry5.getValue();
                if (!ArraysKt___ArraysKt.contains(ErrorEvent.Account.RESERVED_PROPERTIES, str38)) {
                    jsonObject27.add(str38, JsonSerializer.toJsonElement(value4));
                }
            }
            jsonObject22.add("account", jsonObject27);
        }
        if (connectivity != null) {
            JsonObject jsonObject28 = new JsonObject();
            jsonObject28.add(str, new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$1(connectivity.status)));
            List list2 = connectivity.interfaces;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(new JsonPrimitive(((ErrorEvent.Interface) it2.next()).jsonValue));
                }
                jsonObject28.add("interfaces", jsonArray2);
            }
            int i2 = connectivity.effectiveType;
            if (i2 != 0) {
                jsonObject28.add("effective_type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$10(i2)));
            }
            ErrorEvent.Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject29 = new JsonObject();
                String str39 = cellular.technology;
                if (str39 != null) {
                    jsonObject29.addProperty("technology", str39);
                }
                String str40 = cellular.carrierName;
                if (str40 != null) {
                    jsonObject29.addProperty("carrier_name", str40);
                }
                jsonObject28.add("cellular", jsonObject29);
            }
            jsonObject22.add("connectivity", jsonObject28);
        }
        if (display != null) {
            JsonObject jsonObject30 = new JsonObject();
            ErrorEvent.Viewport viewport = display.viewport;
            if (viewport != null) {
                JsonObject jsonObject31 = new JsonObject();
                jsonObject31.addProperty("width", viewport.width);
                jsonObject31.addProperty("height", viewport.height);
                jsonObject30.add("viewport", jsonObject31);
            }
            jsonObject22.add("display", jsonObject30);
        }
        if (synthetics != null) {
            JsonObject jsonObject32 = new JsonObject();
            jsonObject32.addProperty("test_id", synthetics.testId);
            jsonObject32.addProperty("result_id", synthetics.resultId);
            Boolean bool3 = synthetics.injected;
            if (bool3 != null) {
                jsonObject32.addProperty("injected", bool3);
            }
            jsonObject22.add("synthetics", jsonObject32);
        }
        if (ciTest != null) {
            JsonObject jsonObject33 = new JsonObject();
            jsonObject33.addProperty("test_execution_id", ciTest.testExecutionId);
            jsonObject22.add("ci_test", jsonObject33);
        }
        if (os3 != null) {
            JsonObject jsonObject34 = new JsonObject();
            jsonObject34.addProperty("name", os3.name);
            jsonObject34.addProperty("version", os3.version);
            String str41 = os3.build;
            if (str41 != null) {
                jsonObject34.addProperty(str2, str41);
            }
            jsonObject34.addProperty("version_major", os3.versionMajor);
            jsonObject22.add("os", jsonObject34);
        }
        if (device3 != null) {
            JsonObject jsonObject35 = new JsonObject();
            int i3 = device3.f960type;
            if (i3 != 0) {
                jsonObject35.add("type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$8(i3)));
            }
            String str42 = device3.name;
            if (str42 != null) {
                jsonObject35.addProperty("name", str42);
            }
            String str43 = device3.model;
            if (str43 != null) {
                jsonObject35.addProperty("model", str43);
            }
            String str44 = device3.brand;
            if (str44 != null) {
                jsonObject35.addProperty("brand", str44);
            }
            String str45 = device3.architecture;
            if (str45 != null) {
                jsonObject35.addProperty("architecture", str45);
            }
            String str46 = device3.locale;
            if (str46 != null) {
                jsonObject35.addProperty("locale", str46);
            }
            List list3 = device3.locales;
            if (list3 != null) {
                JsonArray jsonArray3 = new JsonArray(list3.size());
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    jsonArray3.add((String) it3.next());
                }
                jsonObject35.add("locales", jsonArray3);
            }
            String str47 = device3.timeZone;
            if (str47 != null) {
                jsonObject35.addProperty("time_zone", str47);
            }
            Number number2 = device3.batteryLevel;
            if (number2 != null) {
                jsonObject35.addProperty("battery_level", number2);
            }
            Boolean bool4 = device3.powerSavingMode;
            if (bool4 != null) {
                jsonObject35.addProperty("power_saving_mode", bool4);
            }
            Number number3 = device3.brightnessLevel;
            if (number3 != null) {
                jsonObject35.addProperty("brightness_level", number3);
            }
            jsonObject22.add("device", jsonObject35);
        }
        JsonObject jsonObject36 = new JsonObject();
        jsonObject36.addProperty("format_version", (Number) 2L);
        ErrorEvent.DdSession ddSession = dd.session;
        if (ddSession != null) {
            JsonObject jsonObject37 = new JsonObject();
            ErrorEvent.Plan plan = ddSession.plan;
            if (plan != null) {
                jsonObject37.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            int i4 = ddSession.sessionPrecondition;
            if (i4 != 0) {
                jsonObject37.add("session_precondition", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$17(i4)));
            }
            jsonObject36.add("session", jsonObject37);
        }
        ErrorEvent.Configuration configuration = dd.configuration;
        if (configuration != null) {
            JsonObject jsonObject38 = new JsonObject();
            jsonObject38.addProperty("session_sample_rate", configuration.sessionSampleRate);
            Number number4 = configuration.sessionReplaySampleRate;
            if (number4 != null) {
                jsonObject38.addProperty("session_replay_sample_rate", number4);
            }
            Number number5 = configuration.profilingSampleRate;
            if (number5 != null) {
                jsonObject38.addProperty("profiling_sample_rate", number5);
            }
            jsonObject36.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject38);
        }
        String str48 = dd.browserSdkVersion;
        if (str48 != null) {
            jsonObject36.addProperty("browser_sdk_version", str48);
        }
        String str49 = dd.sdkName;
        if (str49 != null) {
            jsonObject36.addProperty("sdk_name", str49);
        }
        jsonObject22.add("_dd", jsonObject36);
        if (context5 != null) {
            jsonObject22.add("context", context5.toJson());
        }
        if (action3 != null) {
            JsonObject jsonObject39 = new JsonObject();
            List list4 = action3.id;
            JsonArray jsonArray4 = new JsonArray(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                jsonArray4.add((String) it4.next());
            }
            jsonObject39.add("id", jsonArray4);
            jsonObject22.add("action", jsonObject39);
        }
        if (container != null) {
            JsonObject jsonObject40 = new JsonObject();
            ErrorEvent.ContainerView containerView = container.view;
            JsonObject jsonObject41 = new JsonObject();
            jsonObject41.addProperty("id", containerView.id);
            jsonObject40.add(str31, jsonObject41);
            jsonObject40.add(str4, new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(container.source)));
            jsonObject22.add("container", jsonObject40);
        }
        jsonObject22.addProperty("type", BreadcrumbHelper.Category.ERROR);
        JsonObject jsonObject42 = new JsonObject();
        String str50 = error.id;
        if (str50 != null) {
            jsonObject42.addProperty("id", str50);
        }
        jsonObject42.addProperty("message", error.message);
        jsonObject42.add(str4, new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$13(error.source)));
        String str51 = error.stack;
        if (str51 != null) {
            jsonObject42.addProperty("stack", str51);
        }
        List<ErrorEvent.Cause> list5 = error.causes;
        if (list5 != null) {
            JsonArray jsonArray5 = new JsonArray(list5.size());
            for (ErrorEvent.Cause cause : list5) {
                cause.getClass();
                JsonObject jsonObject43 = new JsonObject();
                jsonObject43.addProperty("message", cause.message);
                String str52 = cause.f959type;
                if (str52 != null) {
                    jsonObject43.addProperty("type", str52);
                }
                String str53 = cause.stack;
                if (str53 != null) {
                    jsonObject43.addProperty("stack", str53);
                }
                jsonObject43.add(str4, new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$13(cause.source)));
                jsonArray5.add(jsonObject43);
            }
            jsonObject42.add("causes", jsonArray5);
        }
        Boolean bool5 = error.isCrash;
        if (bool5 != null) {
            jsonObject42.addProperty("is_crash", bool5);
        }
        String str54 = error.fingerprint;
        if (str54 != null) {
            jsonObject42.addProperty("fingerprint", str54);
        }
        String str55 = error.f961type;
        if (str55 != null) {
            jsonObject42.addProperty("type", str55);
        }
        int i5 = error.category;
        if (i5 != 0) {
            jsonObject42.add("category", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$7(i5)));
        }
        int i6 = error.handling;
        if (i6 != 0) {
            jsonObject42.add("handling", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$14(i6)));
        }
        String str56 = error.handlingStack;
        if (str56 != null) {
            jsonObject42.addProperty("handling_stack", str56);
        }
        int i7 = error.sourceType;
        if (i7 != 0) {
            jsonObject42.add("source_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue(i7)));
        }
        ErrorEvent.Resource resource = error.resource;
        if (resource != null) {
            JsonObject jsonObject44 = new JsonObject();
            jsonObject44.add("method", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$15(resource.method)));
            jsonObject44.addProperty("status_code", Long.valueOf(resource.statusCode));
            jsonObject44.addProperty("url", resource.url);
            ErrorEvent.Provider provider = resource.provider;
            if (provider != null) {
                JsonObject jsonObject45 = new JsonObject();
                String str57 = provider.domain;
                if (str57 != null) {
                    jsonObject45.addProperty("domain", str57);
                }
                String str58 = provider.name;
                if (str58 != null) {
                    jsonObject45.addProperty("name", str58);
                }
                int i8 = provider.f963type;
                if (i8 != 0) {
                    jsonObject45.add("type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$16(i8)));
                }
                jsonObject44.add("provider", jsonObject45);
            }
            jsonObject42.add("resource", jsonObject44);
        }
        List<ErrorEvent.Thread> list6 = error.threads;
        if (list6 != null) {
            JsonArray jsonArray6 = new JsonArray(list6.size());
            for (ErrorEvent.Thread thread : list6) {
                thread.getClass();
                JsonObject jsonObject46 = new JsonObject();
                jsonObject46.addProperty("name", thread.name);
                jsonObject46.addProperty("crashed", Boolean.valueOf(thread.crashed));
                jsonObject46.addProperty("stack", thread.stack);
                String str59 = thread.state;
                if (str59 != null) {
                    jsonObject46.addProperty("state", str59);
                }
                jsonArray6.add(jsonObject46);
            }
            jsonObject42.add("threads", jsonArray6);
        }
        List<ErrorEvent.BinaryImage> list7 = error.binaryImages;
        if (list7 != null) {
            JsonArray jsonArray7 = new JsonArray(list7.size());
            for (ErrorEvent.BinaryImage binaryImage : list7) {
                binaryImage.getClass();
                JsonObject jsonObject47 = new JsonObject();
                jsonObject47.addProperty("uuid", binaryImage.uuid);
                jsonObject47.addProperty("name", binaryImage.name);
                jsonObject47.addProperty("is_system", Boolean.valueOf(binaryImage.isSystem));
                String str60 = binaryImage.loadAddress;
                if (str60 != null) {
                    jsonObject47.addProperty("load_address", str60);
                }
                String str61 = binaryImage.maxAddress;
                if (str61 != null) {
                    jsonObject47.addProperty("max_address", str61);
                }
                String str62 = binaryImage.arch;
                if (str62 != null) {
                    jsonObject47.addProperty("arch", str62);
                }
                jsonArray7.add(jsonObject47);
            }
            jsonObject42.add("binary_images", jsonArray7);
        }
        Boolean bool6 = error.wasTruncated;
        if (bool6 != null) {
            jsonObject42.addProperty("was_truncated", bool6);
        }
        ErrorEvent.Meta meta = error.meta;
        if (meta != null) {
            JsonObject jsonObject48 = new JsonObject();
            String str63 = meta.codeType;
            if (str63 != null) {
                jsonObject48.addProperty("code_type", str63);
            }
            String str64 = meta.parentProcess;
            if (str64 != null) {
                jsonObject48.addProperty("parent_process", str64);
            }
            String str65 = meta.incidentIdentifier;
            if (str65 != null) {
                jsonObject48.addProperty("incident_identifier", str65);
            }
            String str66 = meta.process;
            if (str66 != null) {
                jsonObject48.addProperty("process", str66);
            }
            String str67 = meta.exceptionType;
            if (str67 != null) {
                jsonObject48.addProperty("exception_type", str67);
            }
            String str68 = meta.exceptionCodes;
            if (str68 != null) {
                jsonObject48.addProperty("exception_codes", str68);
            }
            String str69 = meta.path;
            if (str69 != null) {
                jsonObject48.addProperty("path", str69);
            }
            jsonObject42.add("meta", jsonObject48);
        }
        ErrorEvent.Csp csp = error.csp;
        if (csp != null) {
            JsonObject jsonObject49 = new JsonObject();
            int i9 = csp.disposition;
            if (i9 != 0) {
                jsonObject49.add("disposition", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$9(i9)));
            }
            jsonObject42.add("csp", jsonObject49);
        }
        Long l = error.timeSinceAppStart;
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject42, "time_since_app_start");
        }
        jsonObject22.add(BreadcrumbHelper.Category.ERROR, jsonObject42);
        if (freeze != null) {
            JsonObject jsonObject50 = new JsonObject();
            jsonObject50.addProperty("duration", Long.valueOf(freeze.duration));
            jsonObject22.add("freeze", jsonObject50);
        }
        if (context6 != null) {
            jsonObject22.add("feature_flags", context6.toJson());
        }
        JsonObject asJsonObject2 = jsonObject22.getAsJsonObject();
        asJsonObject2.getClass();
        extractKnownAttributes(asJsonObject2);
        String jsonElement7 = asJsonObject2.toString();
        jsonElement7.getClass();
        return jsonElement7;
    }

    public final String serializeActionEvent(ActionEvent actionEvent) {
        ActionEvent.Account account;
        String str;
        String str2;
        ActionEvent.Usr usr = actionEvent.usr;
        InternalLogger internalLogger = this.internalLogger;
        ActionEvent.Usr usr2 = usr != null ? new ActionEvent.Usr(usr.id, usr.name, usr.email, usr.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr.additionalProperties), internalLogger))) : null;
        ActionEvent.Account account2 = actionEvent.account;
        if (account2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateAccountAttributes(account2.additionalProperties), internalLogger));
            String str3 = account2.id;
            String str4 = account2.name;
            str3.getClass();
            account = new ActionEvent.Account(str3, str4, linkedHashMap);
        } else {
            account = null;
        }
        ActionEvent.Context context = actionEvent.context;
        ActionEvent.Context context2 = context != null ? new ActionEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context.additionalProperties), internalLogger))) : null;
        long j = actionEvent.date;
        ActionEvent.Application application = actionEvent.application;
        String str5 = actionEvent.service;
        String str6 = actionEvent.version;
        String str7 = actionEvent.buildVersion;
        String str8 = actionEvent.buildId;
        String str9 = actionEvent.ddtags;
        ActionEvent.ActionEventSession actionEventSession = actionEvent.session;
        int i = actionEvent.source;
        ActionEvent.ActionEventView actionEventView = actionEvent.view;
        ActionEvent.Connectivity connectivity = actionEvent.connectivity;
        ActionEvent.Display display = actionEvent.display;
        ActionEvent.Synthetics synthetics = actionEvent.synthetics;
        ActionEvent.CiTest ciTest = actionEvent.ciTest;
        ActionEvent.Context context3 = context2;
        ActionEvent.Os os = actionEvent.os;
        ActionEvent.Device device = actionEvent.device;
        ActionEvent.Dd dd = actionEvent.dd;
        ActionEvent.Container container = actionEvent.container;
        ActionEvent.ActionEventAction actionEventAction = actionEvent.action;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(j));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", application.id);
        String str10 = application.currentLocale;
        if (str10 != null) {
            jsonObject2.addProperty("current_locale", str10);
        }
        jsonObject.add("application", jsonObject2);
        if (str5 != null) {
            jsonObject.addProperty("service", str5);
        }
        if (str6 != null) {
            jsonObject.addProperty("version", str6);
        }
        if (str7 != null) {
            jsonObject.addProperty("build_version", str7);
        }
        if (str8 != null) {
            jsonObject.addProperty("build_id", str8);
        }
        if (str9 != null) {
            jsonObject.addProperty("ddtags", str9);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", actionEventSession.id);
        jsonObject3.add("type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue(actionEventSession.f956type)));
        Boolean bool = actionEventSession.hasReplay;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", bool);
        }
        jsonObject.add("session", jsonObject3);
        if (i != 0) {
            jsonObject.add("source", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$1(i)));
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", actionEventView.id);
        String str11 = actionEventView.referrer;
        if (str11 != null) {
            jsonObject4.addProperty("referrer", str11);
        }
        jsonObject4.addProperty("url", actionEventView.url);
        String str12 = actionEventView.name;
        if (str12 != null) {
            jsonObject4.addProperty("name", str12);
        }
        Boolean bool2 = actionEventView.inForeground;
        if (bool2 != null) {
            jsonObject4.addProperty("in_foreground", bool2);
        }
        jsonObject.add("view", jsonObject4);
        if (usr2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str13 = usr2.id;
            if (str13 != null) {
                jsonObject5.addProperty("id", str13);
            }
            String str14 = usr2.name;
            if (str14 != null) {
                jsonObject5.addProperty("name", str14);
            }
            String str15 = usr2.email;
            if (str15 != null) {
                jsonObject5.addProperty("email", str15);
            }
            String str16 = usr2.anonymousId;
            if (str16 != null) {
                jsonObject5.addProperty("anonymous_id", str16);
            }
            for (Map.Entry entry : usr2.additionalProperties.entrySet()) {
                String str17 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt___ArraysKt.contains(ActionEvent.Usr.RESERVED_PROPERTIES, str17)) {
                    jsonObject5.add(str17, JsonSerializer.toJsonElement(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        if (account != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", account.id);
            String str18 = account.name;
            if (str18 != null) {
                jsonObject6.addProperty("name", str18);
            }
            for (Map.Entry entry2 : account.additionalProperties.entrySet()) {
                String str19 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (!ArraysKt___ArraysKt.contains(ActionEvent.Account.RESERVED_PROPERTIES, str19)) {
                    jsonObject6.add(str19, JsonSerializer.toJsonElement(value2));
                }
            }
            jsonObject.add("account", jsonObject6);
        }
        if (connectivity != null) {
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.add("status", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$6(connectivity.status)));
            List list = connectivity.interfaces;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((ActionEvent.Interface) it.next()).jsonValue));
                }
                jsonObject7.add("interfaces", jsonArray);
            }
            int i2 = connectivity.effectiveType;
            if (i2 != 0) {
                jsonObject7.add("effective_type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$3(i2)));
            }
            ActionEvent.Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject8 = new JsonObject();
                String str20 = cellular.technology;
                if (str20 != null) {
                    jsonObject8.addProperty("technology", str20);
                }
                String str21 = cellular.carrierName;
                if (str21 != null) {
                    jsonObject8.addProperty("carrier_name", str21);
                }
                jsonObject7.add("cellular", jsonObject8);
            }
            jsonObject.add("connectivity", jsonObject7);
        }
        if (display != null) {
            JsonObject jsonObject9 = new JsonObject();
            ActionEvent.Viewport viewport = display.viewport;
            if (viewport != null) {
                JsonObject jsonObject10 = new JsonObject();
                jsonObject10.addProperty("width", viewport.width);
                jsonObject10.addProperty("height", viewport.height);
                jsonObject9.add("viewport", jsonObject10);
            }
            jsonObject.add("display", jsonObject9);
        }
        if (synthetics != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("test_id", synthetics.testId);
            jsonObject11.addProperty("result_id", synthetics.resultId);
            Boolean bool3 = synthetics.injected;
            if (bool3 != null) {
                jsonObject11.addProperty("injected", bool3);
            }
            jsonObject.add("synthetics", jsonObject11);
        }
        if (ciTest != null) {
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("test_execution_id", ciTest.testExecutionId);
            jsonObject.add("ci_test", jsonObject12);
        }
        if (os != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("name", os.name);
            jsonObject13.addProperty("version", os.version);
            String str22 = os.build;
            if (str22 != null) {
                jsonObject13.addProperty("build", str22);
            }
            jsonObject13.addProperty("version_major", os.versionMajor);
            jsonObject.add("os", jsonObject13);
        }
        if (device != null) {
            JsonObject jsonObject14 = new JsonObject();
            int i3 = device.f957type;
            if (i3 != 0) {
                jsonObject14.add("type", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$2(i3)));
            }
            String str23 = device.name;
            if (str23 != null) {
                jsonObject14.addProperty("name", str23);
            }
            String str24 = device.model;
            if (str24 != null) {
                jsonObject14.addProperty("model", str24);
            }
            String str25 = device.brand;
            if (str25 != null) {
                jsonObject14.addProperty("brand", str25);
            }
            String str26 = device.architecture;
            if (str26 != null) {
                jsonObject14.addProperty("architecture", str26);
            }
            String str27 = device.locale;
            if (str27 != null) {
                jsonObject14.addProperty("locale", str27);
            }
            List list2 = device.locales;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add((String) it2.next());
                }
                jsonObject14.add("locales", jsonArray2);
            }
            String str28 = device.timeZone;
            if (str28 != null) {
                jsonObject14.addProperty("time_zone", str28);
            }
            Number number = device.batteryLevel;
            if (number != null) {
                jsonObject14.addProperty("battery_level", number);
            }
            Boolean bool4 = device.powerSavingMode;
            if (bool4 != null) {
                jsonObject14.addProperty("power_saving_mode", bool4);
            }
            Number number2 = device.brightnessLevel;
            if (number2 != null) {
                jsonObject14.addProperty("brightness_level", number2);
            }
            jsonObject.add("device", jsonObject14);
        }
        JsonObject jsonObject15 = new JsonObject();
        jsonObject15.addProperty("format_version", (Number) 2L);
        ActionEvent.DdSession ddSession = dd.session;
        if (ddSession != null) {
            JsonObject jsonObject16 = new JsonObject();
            ActionEvent.Plan plan = ddSession.plan;
            if (plan != null) {
                jsonObject16.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            int i4 = ddSession.sessionPrecondition;
            if (i4 != 0) {
                jsonObject16.add("session_precondition", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$5(i4)));
            }
            jsonObject15.add("session", jsonObject16);
        }
        ActionEvent.Configuration configuration = dd.configuration;
        if (configuration != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty("session_sample_rate", configuration.sessionSampleRate);
            Number number3 = configuration.sessionReplaySampleRate;
            if (number3 != null) {
                jsonObject17.addProperty("session_replay_sample_rate", number3);
            }
            Number number4 = configuration.profilingSampleRate;
            if (number4 != null) {
                jsonObject17.addProperty("profiling_sample_rate", number4);
            }
            jsonObject15.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject17);
        }
        String str29 = dd.browserSdkVersion;
        if (str29 != null) {
            jsonObject15.addProperty("browser_sdk_version", str29);
        }
        String str30 = dd.sdkName;
        if (str30 != null) {
            jsonObject15.addProperty("sdk_name", str30);
        }
        ActionEvent.DdAction ddAction = dd.action;
        if (ddAction != null) {
            JsonObject jsonObject18 = new JsonObject();
            ActionEvent.Position position = ddAction.position;
            if (position != null) {
                JsonObject jsonObject19 = new JsonObject();
                str = "source";
                str2 = "type";
                jsonObject19.addProperty("x", Long.valueOf(position.x));
                jsonObject19.addProperty("y", Long.valueOf(position.y));
                jsonObject18.add("position", jsonObject19);
            } else {
                str = "source";
                str2 = "type";
            }
            ActionEvent.DdActionTarget ddActionTarget = ddAction.target;
            if (ddActionTarget != null) {
                JsonObject jsonObject20 = new JsonObject();
                String str31 = ddActionTarget.selector;
                if (str31 != null) {
                    jsonObject20.addProperty("selector", str31);
                }
                Long l = ddActionTarget.width;
                if (l != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject20, "width");
                }
                Long l2 = ddActionTarget.height;
                if (l2 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l2, jsonObject20, "height");
                }
                jsonObject18.add("target", jsonObject20);
            }
            int i5 = ddAction.nameSource;
            if (i5 != 0) {
                jsonObject18.add("name_source", new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$4(i5)));
            }
            jsonObject15.add("action", jsonObject18);
        } else {
            str = "source";
            str2 = "type";
        }
        jsonObject.add("_dd", jsonObject15);
        if (context3 != null) {
            JsonObject jsonObject21 = new JsonObject();
            for (Map.Entry entry3 : context3.additionalProperties.entrySet()) {
                jsonObject21.add((String) entry3.getKey(), JsonSerializer.toJsonElement(entry3.getValue()));
            }
            jsonObject.add("context", jsonObject21);
        }
        if (container != null) {
            JsonObject jsonObject22 = new JsonObject();
            ActionEvent.ContainerView containerView = container.view;
            JsonObject jsonObject23 = new JsonObject();
            jsonObject23.addProperty("id", containerView.id);
            jsonObject22.add("view", jsonObject23);
            jsonObject22.add(str, new JsonPrimitive(RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$1(container.source)));
            jsonObject.add("container", jsonObject22);
        }
        String str32 = str2;
        jsonObject.addProperty(str32, "action");
        JsonObject jsonObject24 = new JsonObject();
        jsonObject24.add(str32, new JsonPrimitive(actionEventAction.f955type.jsonValue));
        String str33 = actionEventAction.id;
        if (str33 != null) {
            jsonObject24.addProperty("id", str33);
        }
        Long l3 = actionEventAction.loadingTime;
        if (l3 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l3, jsonObject24, "loading_time");
        }
        ActionEvent.ActionEventActionTarget actionEventActionTarget = actionEventAction.target;
        if (actionEventActionTarget != null) {
            JsonObject jsonObject25 = new JsonObject();
            jsonObject25.addProperty("name", actionEventActionTarget.name);
            jsonObject24.add("target", jsonObject25);
        }
        ActionEvent.Frustration frustration = actionEventAction.frustration;
        if (frustration != null) {
            JsonObject jsonObject26 = new JsonObject();
            ArrayList arrayList = frustration.f958type;
            JsonArray jsonArray3 = new JsonArray(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                jsonArray3.add(new JsonPrimitive(((ActionEvent.Type) it3.next()).jsonValue));
            }
            jsonObject26.add(str32, jsonArray3);
            jsonObject24.add("frustration", jsonObject26);
        }
        ActionEvent.Error error = actionEventAction.error;
        if (error != null) {
            JsonObject jsonObject27 = new JsonObject();
            jsonObject27.addProperty("count", Long.valueOf(error.count));
            jsonObject24.add(BreadcrumbHelper.Category.ERROR, jsonObject27);
        }
        ActionEvent.Crash crash = actionEventAction.crash;
        if (crash != null) {
            JsonObject jsonObject28 = new JsonObject();
            jsonObject28.addProperty("count", Long.valueOf(crash.count));
            jsonObject24.add("crash", jsonObject28);
        }
        ActionEvent.LongTask longTask = actionEventAction.longTask;
        if (longTask != null) {
            JsonObject jsonObject29 = new JsonObject();
            jsonObject29.addProperty("count", Long.valueOf(longTask.count));
            jsonObject24.add("long_task", jsonObject29);
        }
        ActionEvent.Resource resource = actionEventAction.resource;
        if (resource != null) {
            JsonObject jsonObject30 = new JsonObject();
            jsonObject30.addProperty("count", Long.valueOf(resource.count));
            jsonObject24.add("resource", jsonObject30);
        }
        jsonObject.add("action", jsonObject24);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        asJsonObject.getClass();
        extractKnownAttributes(asJsonObject);
        String jsonElement = asJsonObject.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public final String serializeLongTaskEvent(LongTaskEvent longTaskEvent) {
        LongTaskEvent.Account account;
        LongTaskEvent.Usr usr = longTaskEvent.usr;
        InternalLogger internalLogger = this.internalLogger;
        LongTaskEvent.Usr usr2 = usr != null ? new LongTaskEvent.Usr(usr.id, usr.name, usr.email, usr.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr.additionalProperties), internalLogger))) : null;
        LongTaskEvent.Account account2 = longTaskEvent.account;
        if (account2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateAccountAttributes(account2.additionalProperties), internalLogger));
            String str = account2.id;
            String str2 = account2.name;
            str.getClass();
            account = new LongTaskEvent.Account(str, str2, linkedHashMap);
        } else {
            account = null;
        }
        LongTaskEvent.Context context = longTaskEvent.context;
        LongTaskEvent.Context context2 = context != null ? new LongTaskEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context.additionalProperties), internalLogger))) : null;
        long j = longTaskEvent.date;
        LongTaskEvent.Application application = longTaskEvent.application;
        String str3 = longTaskEvent.service;
        String str4 = longTaskEvent.version;
        String str5 = longTaskEvent.buildVersion;
        String str6 = longTaskEvent.buildId;
        String str7 = longTaskEvent.ddtags;
        LongTaskEvent.LongTaskEventSession longTaskEventSession = longTaskEvent.session;
        int i = longTaskEvent.source;
        LongTaskEvent.LongTaskEventView longTaskEventView = longTaskEvent.view;
        LongTaskEvent.Connectivity connectivity = longTaskEvent.connectivity;
        LongTaskEvent.Display display = longTaskEvent.display;
        LongTaskEvent.Synthetics synthetics = longTaskEvent.synthetics;
        LongTaskEvent.CiTest ciTest = longTaskEvent.ciTest;
        LongTaskEvent.Context context3 = context2;
        LongTaskEvent.Os os = longTaskEvent.os;
        LongTaskEvent.Device device = longTaskEvent.device;
        LongTaskEvent.Dd dd = longTaskEvent.dd;
        LongTaskEvent.Action action = longTaskEvent.action;
        LongTaskEvent.Container container = longTaskEvent.container;
        LongTaskEvent.LongTask longTask = longTaskEvent.longTask;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(j));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", application.id);
        String str8 = application.currentLocale;
        if (str8 != null) {
            jsonObject2.addProperty("current_locale", str8);
        }
        jsonObject.add("application", jsonObject2);
        if (str3 != null) {
            jsonObject.addProperty("service", str3);
        }
        if (str4 != null) {
            jsonObject.addProperty("version", str4);
        }
        if (str5 != null) {
            jsonObject.addProperty("build_version", str5);
        }
        if (str6 != null) {
            jsonObject.addProperty("build_id", str6);
        }
        if (str7 != null) {
            jsonObject.addProperty("ddtags", str7);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", longTaskEventSession.id);
        jsonObject3.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$8(longTaskEventSession.f965type)));
        Boolean bool = longTaskEventSession.hasReplay;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", bool);
        }
        jsonObject.add("session", jsonObject3);
        if (i != 0) {
            jsonObject.add("source", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$9(i)));
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", longTaskEventView.id);
        String str9 = longTaskEventView.referrer;
        if (str9 != null) {
            jsonObject4.addProperty("referrer", str9);
        }
        jsonObject4.addProperty("url", longTaskEventView.url);
        String str10 = longTaskEventView.name;
        if (str10 != null) {
            jsonObject4.addProperty("name", str10);
        }
        jsonObject.add("view", jsonObject4);
        if (usr2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str11 = usr2.id;
            if (str11 != null) {
                jsonObject5.addProperty("id", str11);
            }
            String str12 = usr2.name;
            if (str12 != null) {
                jsonObject5.addProperty("name", str12);
            }
            String str13 = usr2.email;
            if (str13 != null) {
                jsonObject5.addProperty("email", str13);
            }
            String str14 = usr2.anonymousId;
            if (str14 != null) {
                jsonObject5.addProperty("anonymous_id", str14);
            }
            for (Map.Entry entry : usr2.additionalProperties.entrySet()) {
                String str15 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt___ArraysKt.contains(LongTaskEvent.Usr.RESERVED_PROPERTIES, str15)) {
                    jsonObject5.add(str15, JsonSerializer.toJsonElement(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        if (account != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", account.id);
            String str16 = account.name;
            if (str16 != null) {
                jsonObject6.addProperty("name", str16);
            }
            for (Map.Entry entry2 : account.additionalProperties.entrySet()) {
                String str17 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (!ArraysKt___ArraysKt.contains(LongTaskEvent.Account.RESERVED_PROPERTIES, str17)) {
                    jsonObject6.add(str17, JsonSerializer.toJsonElement(value2));
                }
            }
            jsonObject.add("account", jsonObject6);
        }
        if (connectivity != null) {
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.add("status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$2(connectivity.status)));
            List list = connectivity.interfaces;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((LongTaskEvent.Interface) it.next()).jsonValue));
                }
                jsonObject7.add("interfaces", jsonArray);
            }
            int i2 = connectivity.effectiveType;
            if (i2 != 0) {
                jsonObject7.add("effective_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$4(i2)));
            }
            LongTaskEvent.Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject8 = new JsonObject();
                String str18 = cellular.technology;
                if (str18 != null) {
                    jsonObject8.addProperty("technology", str18);
                }
                String str19 = cellular.carrierName;
                if (str19 != null) {
                    jsonObject8.addProperty("carrier_name", str19);
                }
                jsonObject7.add("cellular", jsonObject8);
            }
            jsonObject.add("connectivity", jsonObject7);
        }
        if (display != null) {
            JsonObject jsonObject9 = new JsonObject();
            LongTaskEvent.Viewport viewport = display.viewport;
            if (viewport != null) {
                JsonObject jsonObject10 = new JsonObject();
                jsonObject10.addProperty("width", viewport.width);
                jsonObject10.addProperty("height", viewport.height);
                jsonObject9.add("viewport", jsonObject10);
            }
            jsonObject.add("display", jsonObject9);
        }
        if (synthetics != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("test_id", synthetics.testId);
            jsonObject11.addProperty("result_id", synthetics.resultId);
            Boolean bool2 = synthetics.injected;
            if (bool2 != null) {
                jsonObject11.addProperty("injected", bool2);
            }
            jsonObject.add("synthetics", jsonObject11);
        }
        if (ciTest != null) {
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("test_execution_id", ciTest.testExecutionId);
            jsonObject.add("ci_test", jsonObject12);
        }
        if (os != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("name", os.name);
            jsonObject13.addProperty("version", os.version);
            String str20 = os.build;
            if (str20 != null) {
                jsonObject13.addProperty("build", str20);
            }
            jsonObject13.addProperty("version_major", os.versionMajor);
            jsonObject.add("os", jsonObject13);
        }
        if (device != null) {
            JsonObject jsonObject14 = new JsonObject();
            int i3 = device.f964type;
            if (i3 != 0) {
                jsonObject14.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$3(i3)));
            }
            String str21 = device.name;
            if (str21 != null) {
                jsonObject14.addProperty("name", str21);
            }
            String str22 = device.model;
            if (str22 != null) {
                jsonObject14.addProperty("model", str22);
            }
            String str23 = device.brand;
            if (str23 != null) {
                jsonObject14.addProperty("brand", str23);
            }
            String str24 = device.architecture;
            if (str24 != null) {
                jsonObject14.addProperty("architecture", str24);
            }
            String str25 = device.locale;
            if (str25 != null) {
                jsonObject14.addProperty("locale", str25);
            }
            List list2 = device.locales;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add((String) it2.next());
                }
                jsonObject14.add("locales", jsonArray2);
            }
            String str26 = device.timeZone;
            if (str26 != null) {
                jsonObject14.addProperty("time_zone", str26);
            }
            Number number = device.batteryLevel;
            if (number != null) {
                jsonObject14.addProperty("battery_level", number);
            }
            Boolean bool3 = device.powerSavingMode;
            if (bool3 != null) {
                jsonObject14.addProperty("power_saving_mode", bool3);
            }
            Number number2 = device.brightnessLevel;
            if (number2 != null) {
                jsonObject14.addProperty("brightness_level", number2);
            }
            jsonObject.add("device", jsonObject14);
        }
        JsonObject jsonObject15 = new JsonObject();
        jsonObject15.addProperty("format_version", (Number) 2L);
        LongTaskEvent.DdSession ddSession = dd.session;
        if (ddSession != null) {
            JsonObject jsonObject16 = new JsonObject();
            LongTaskEvent.Plan plan = ddSession.plan;
            if (plan != null) {
                jsonObject16.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            int i4 = ddSession.sessionPrecondition;
            if (i4 != 0) {
                jsonObject16.add("session_precondition", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$11(i4)));
            }
            jsonObject15.add("session", jsonObject16);
        }
        LongTaskEvent.Configuration configuration = dd.configuration;
        if (configuration != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty("session_sample_rate", configuration.sessionSampleRate);
            Number number3 = configuration.sessionReplaySampleRate;
            if (number3 != null) {
                jsonObject17.addProperty("session_replay_sample_rate", number3);
            }
            Number number4 = configuration.profilingSampleRate;
            if (number4 != null) {
                jsonObject17.addProperty("profiling_sample_rate", number4);
            }
            jsonObject15.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject17);
        }
        String str27 = dd.browserSdkVersion;
        if (str27 != null) {
            jsonObject15.addProperty("browser_sdk_version", str27);
        }
        String str28 = dd.sdkName;
        if (str28 != null) {
            jsonObject15.addProperty("sdk_name", str28);
        }
        Boolean bool4 = dd.discarded;
        if (bool4 != null) {
            jsonObject15.addProperty("discarded", bool4);
        }
        LongTaskEvent.Profiling profiling = dd.profiling;
        if (profiling != null) {
            JsonObject jsonObject18 = new JsonObject();
            int i5 = profiling.status;
            if (i5 != 0) {
                jsonObject18.add("status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$10(i5)));
            }
            int i6 = profiling.errorReason;
            if (i6 != 0) {
                jsonObject18.add("error_reason", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$6(i6)));
            }
            jsonObject15.add("profiling", jsonObject18);
        }
        jsonObject.add("_dd", jsonObject15);
        if (context3 != null) {
            JsonObject jsonObject19 = new JsonObject();
            for (Map.Entry entry3 : context3.additionalProperties.entrySet()) {
                jsonObject19.add((String) entry3.getKey(), JsonSerializer.toJsonElement(entry3.getValue()));
            }
            jsonObject.add("context", jsonObject19);
        }
        if (action != null) {
            JsonObject jsonObject20 = new JsonObject();
            List list3 = action.id;
            JsonArray jsonArray3 = new JsonArray(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                jsonArray3.add((String) it3.next());
            }
            jsonObject20.add("id", jsonArray3);
            jsonObject.add("action", jsonObject20);
        }
        if (container != null) {
            JsonObject jsonObject21 = new JsonObject();
            LongTaskEvent.ContainerView containerView = container.view;
            JsonObject jsonObject22 = new JsonObject();
            jsonObject22.addProperty("id", containerView.id);
            jsonObject21.add("view", jsonObject22);
            jsonObject21.add("source", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$9(container.source)));
            jsonObject.add("container", jsonObject21);
        }
        jsonObject.addProperty("type", "long_task");
        JsonObject jsonObject23 = new JsonObject();
        String str29 = longTask.id;
        if (str29 != null) {
            jsonObject23.addProperty("id", str29);
        }
        Number number5 = longTask.startTime;
        if (number5 != null) {
            jsonObject23.addProperty("start_time", number5);
        }
        int i7 = longTask.entryType;
        if (i7 != 0) {
            jsonObject23.add("entry_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$5(i7)));
        }
        jsonObject23.addProperty("duration", Long.valueOf(longTask.duration));
        Long l = longTask.blockingDuration;
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject23, "blocking_duration");
        }
        Number number6 = longTask.renderStart;
        if (number6 != null) {
            jsonObject23.addProperty("render_start", number6);
        }
        Number number7 = longTask.styleAndLayoutStart;
        if (number7 != null) {
            jsonObject23.addProperty("style_and_layout_start", number7);
        }
        Number number8 = longTask.firstUiEventTimestamp;
        if (number8 != null) {
            jsonObject23.addProperty("first_ui_event_timestamp", number8);
        }
        Boolean bool5 = longTask.isFrozenFrame;
        if (bool5 != null) {
            jsonObject23.addProperty("is_frozen_frame", bool5);
        }
        List<LongTaskEvent.Script> list4 = longTask.scripts;
        if (list4 != null) {
            JsonArray jsonArray4 = new JsonArray(list4.size());
            for (LongTaskEvent.Script script : list4) {
                script.getClass();
                JsonObject jsonObject24 = new JsonObject();
                Long l2 = script.duration;
                if (l2 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l2, jsonObject24, "duration");
                }
                Long l3 = script.pauseDuration;
                if (l3 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l3, jsonObject24, "pause_duration");
                }
                Long l4 = script.forcedStyleAndLayoutDuration;
                if (l4 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l4, jsonObject24, "forced_style_and_layout_duration");
                }
                Number number9 = script.startTime;
                if (number9 != null) {
                    jsonObject24.addProperty("start_time", number9);
                }
                Number number10 = script.executionStart;
                if (number10 != null) {
                    jsonObject24.addProperty("execution_start", number10);
                }
                String str30 = script.sourceUrl;
                if (str30 != null) {
                    jsonObject24.addProperty("source_url", str30);
                }
                String str31 = script.sourceFunctionName;
                if (str31 != null) {
                    jsonObject24.addProperty("source_function_name", str31);
                }
                Long l5 = script.sourceCharPosition;
                if (l5 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l5, jsonObject24, "source_char_position");
                }
                String str32 = script.invoker;
                if (str32 != null) {
                    jsonObject24.addProperty("invoker", str32);
                }
                int i8 = script.invokerType;
                if (i8 != 0) {
                    jsonObject24.add("invoker_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$7(i8)));
                }
                String str33 = script.windowAttribution;
                if (str33 != null) {
                    jsonObject24.addProperty("window_attribution", str33);
                }
                jsonArray4.add(jsonObject24);
            }
            jsonObject23.add("scripts", jsonArray4);
        }
        jsonObject.add("long_task", jsonObject23);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        asJsonObject.getClass();
        extractKnownAttributes(asJsonObject);
        String jsonElement = asJsonObject.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public final String serializeResourceEvent(ResourceEvent resourceEvent) {
        ResourceEvent.Account account;
        ResourceEvent.Usr usr = resourceEvent.usr;
        InternalLogger internalLogger = this.internalLogger;
        ResourceEvent.Usr usr2 = usr != null ? new ResourceEvent.Usr(usr.id, usr.name, usr.email, usr.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr.additionalProperties), internalLogger))) : null;
        ResourceEvent.Account account2 = resourceEvent.account;
        if (account2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateAccountAttributes(account2.additionalProperties), internalLogger));
            String str = account2.id;
            String str2 = account2.name;
            str.getClass();
            account = new ResourceEvent.Account(str, str2, linkedHashMap);
        } else {
            account = null;
        }
        ResourceEvent.Context context = resourceEvent.context;
        ResourceEvent.Context context2 = context != null ? new ResourceEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context.additionalProperties), internalLogger))) : null;
        long j = resourceEvent.date;
        ResourceEvent.Application application = resourceEvent.application;
        String str3 = resourceEvent.service;
        String str4 = resourceEvent.version;
        String str5 = resourceEvent.buildVersion;
        String str6 = resourceEvent.buildId;
        String str7 = resourceEvent.ddtags;
        ResourceEvent.ResourceEventSession resourceEventSession = resourceEvent.session;
        int i = resourceEvent.source;
        ResourceEvent.ResourceEventView resourceEventView = resourceEvent.view;
        ResourceEvent.Connectivity connectivity = resourceEvent.connectivity;
        ResourceEvent.Display display = resourceEvent.display;
        ResourceEvent.Synthetics synthetics = resourceEvent.synthetics;
        ResourceEvent.CiTest ciTest = resourceEvent.ciTest;
        ResourceEvent.Context context3 = context2;
        ResourceEvent.Os os = resourceEvent.os;
        ResourceEvent.Device device = resourceEvent.device;
        ResourceEvent.Dd dd = resourceEvent.dd;
        ResourceEvent.Action action = resourceEvent.action;
        ResourceEvent.Container container = resourceEvent.container;
        ResourceEvent.Resource resource = resourceEvent.resource;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(j));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", application.id);
        String str8 = application.currentLocale;
        if (str8 != null) {
            jsonObject2.addProperty("current_locale", str8);
        }
        jsonObject.add("application", jsonObject2);
        if (str3 != null) {
            jsonObject.addProperty("service", str3);
        }
        if (str4 != null) {
            jsonObject.addProperty("version", str4);
        }
        if (str5 != null) {
            jsonObject.addProperty("build_version", str5);
        }
        if (str6 != null) {
            jsonObject.addProperty("build_id", str6);
        }
        if (str7 != null) {
            jsonObject.addProperty("ddtags", str7);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", resourceEventSession.id);
        jsonObject3.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$19(resourceEventSession.f969type)));
        Boolean bool = resourceEventSession.hasReplay;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", bool);
        }
        jsonObject.add("session", jsonObject3);
        if (i != 0) {
            jsonObject.add("source", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i)));
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("id", resourceEventView.id);
        String str9 = resourceEventView.referrer;
        if (str9 != null) {
            jsonObject4.addProperty("referrer", str9);
        }
        jsonObject4.addProperty("url", resourceEventView.url);
        String str10 = resourceEventView.name;
        if (str10 != null) {
            jsonObject4.addProperty("name", str10);
        }
        jsonObject.add("view", jsonObject4);
        if (usr2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str11 = usr2.id;
            if (str11 != null) {
                jsonObject5.addProperty("id", str11);
            }
            String str12 = usr2.name;
            if (str12 != null) {
                jsonObject5.addProperty("name", str12);
            }
            String str13 = usr2.email;
            if (str13 != null) {
                jsonObject5.addProperty("email", str13);
            }
            String str14 = usr2.anonymousId;
            if (str14 != null) {
                jsonObject5.addProperty("anonymous_id", str14);
            }
            Iterator it = usr2.additionalProperties.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str15 = (String) entry.getKey();
                Object value = entry.getValue();
                Iterator it2 = it;
                if (!ArraysKt___ArraysKt.contains(ResourceEvent.Usr.RESERVED_PROPERTIES, str15)) {
                    jsonObject5.add(str15, JsonSerializer.toJsonElement(value));
                }
                it = it2;
            }
            jsonObject.add("usr", jsonObject5);
        }
        if (account != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", account.id);
            String str16 = account.name;
            if (str16 != null) {
                jsonObject6.addProperty("name", str16);
            }
            for (Map.Entry entry2 : account.additionalProperties.entrySet()) {
                String str17 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (!ArraysKt___ArraysKt.contains(ResourceEvent.Account.RESERVED_PROPERTIES, str17)) {
                    jsonObject6.add(str17, JsonSerializer.toJsonElement(value2));
                }
            }
            jsonObject.add("account", jsonObject6);
        }
        if (connectivity != null) {
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.add("status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$23(connectivity.status)));
            List list = connectivity.interfaces;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((ResourceEvent.Interface) it3.next()).jsonValue));
                }
                jsonObject7.add("interfaces", jsonArray);
            }
            int i2 = connectivity.effectiveType;
            if (i2 != 0) {
                jsonObject7.add("effective_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$14(i2)));
            }
            ResourceEvent.Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject8 = new JsonObject();
                String str18 = cellular.technology;
                if (str18 != null) {
                    jsonObject8.addProperty("technology", str18);
                }
                String str19 = cellular.carrierName;
                if (str19 != null) {
                    jsonObject8.addProperty("carrier_name", str19);
                }
                jsonObject7.add("cellular", jsonObject8);
            }
            jsonObject.add("connectivity", jsonObject7);
        }
        if (display != null) {
            JsonObject jsonObject9 = new JsonObject();
            ResourceEvent.Viewport viewport = display.viewport;
            if (viewport != null) {
                JsonObject jsonObject10 = new JsonObject();
                jsonObject10.addProperty("width", viewport.width);
                jsonObject10.addProperty("height", viewport.height);
                jsonObject9.add("viewport", jsonObject10);
            }
            jsonObject.add("display", jsonObject9);
        }
        if (synthetics != null) {
            JsonObject jsonObject11 = new JsonObject();
            jsonObject11.addProperty("test_id", synthetics.testId);
            jsonObject11.addProperty("result_id", synthetics.resultId);
            Boolean bool2 = synthetics.injected;
            if (bool2 != null) {
                jsonObject11.addProperty("injected", bool2);
            }
            jsonObject.add("synthetics", jsonObject11);
        }
        if (ciTest != null) {
            JsonObject jsonObject12 = new JsonObject();
            jsonObject12.addProperty("test_execution_id", ciTest.testExecutionId);
            jsonObject.add("ci_test", jsonObject12);
        }
        if (os != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("name", os.name);
            jsonObject13.addProperty("version", os.version);
            String str20 = os.build;
            if (str20 != null) {
                jsonObject13.addProperty("build", str20);
            }
            jsonObject13.addProperty("version_major", os.versionMajor);
            jsonObject.add("os", jsonObject13);
        }
        if (device != null) {
            JsonObject jsonObject14 = new JsonObject();
            int i3 = device.f966type;
            if (i3 != 0) {
                jsonObject14.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$13(i3)));
            }
            String str21 = device.name;
            if (str21 != null) {
                jsonObject14.addProperty("name", str21);
            }
            String str22 = device.model;
            if (str22 != null) {
                jsonObject14.addProperty("model", str22);
            }
            String str23 = device.brand;
            if (str23 != null) {
                jsonObject14.addProperty("brand", str23);
            }
            String str24 = device.architecture;
            if (str24 != null) {
                jsonObject14.addProperty("architecture", str24);
            }
            String str25 = device.locale;
            if (str25 != null) {
                jsonObject14.addProperty("locale", str25);
            }
            List list2 = device.locales;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    jsonArray2.add((String) it4.next());
                }
                jsonObject14.add("locales", jsonArray2);
            }
            String str26 = device.timeZone;
            if (str26 != null) {
                jsonObject14.addProperty("time_zone", str26);
            }
            Number number = device.batteryLevel;
            if (number != null) {
                jsonObject14.addProperty("battery_level", number);
            }
            Boolean bool3 = device.powerSavingMode;
            if (bool3 != null) {
                jsonObject14.addProperty("power_saving_mode", bool3);
            }
            Number number2 = device.brightnessLevel;
            if (number2 != null) {
                jsonObject14.addProperty("brightness_level", number2);
            }
            jsonObject.add("device", jsonObject14);
        }
        JsonObject jsonObject15 = new JsonObject();
        jsonObject15.addProperty("format_version", (Number) 2L);
        ResourceEvent.DdSession ddSession = dd.session;
        if (ddSession != null) {
            JsonObject jsonObject16 = new JsonObject();
            ResourceEvent.Plan plan = ddSession.plan;
            if (plan != null) {
                jsonObject16.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            int i4 = ddSession.sessionPrecondition;
            if (i4 != 0) {
                jsonObject16.add("session_precondition", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$22(i4)));
            }
            jsonObject15.add("session", jsonObject16);
        }
        ResourceEvent.Configuration configuration = dd.configuration;
        if (configuration != null) {
            JsonObject jsonObject17 = new JsonObject();
            jsonObject17.addProperty("session_sample_rate", configuration.sessionSampleRate);
            Number number3 = configuration.sessionReplaySampleRate;
            if (number3 != null) {
                jsonObject17.addProperty("session_replay_sample_rate", number3);
            }
            Number number4 = configuration.profilingSampleRate;
            if (number4 != null) {
                jsonObject17.addProperty("profiling_sample_rate", number4);
            }
            jsonObject15.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject17);
        }
        String str27 = dd.browserSdkVersion;
        if (str27 != null) {
            jsonObject15.addProperty("browser_sdk_version", str27);
        }
        String str28 = dd.sdkName;
        if (str28 != null) {
            jsonObject15.addProperty("sdk_name", str28);
        }
        String str29 = dd.spanId;
        if (str29 != null) {
            jsonObject15.addProperty("span_id", str29);
        }
        String str30 = dd.parentSpanId;
        if (str30 != null) {
            jsonObject15.addProperty("parent_span_id", str30);
        }
        String str31 = dd.traceId;
        if (str31 != null) {
            jsonObject15.addProperty("trace_id", str31);
        }
        Number number5 = dd.rulePsr;
        if (number5 != null) {
            jsonObject15.addProperty("rule_psr", number5);
        }
        Boolean bool4 = dd.discarded;
        if (bool4 != null) {
            jsonObject15.addProperty("discarded", bool4);
        }
        jsonObject.add("_dd", jsonObject15);
        if (context3 != null) {
            JsonObject jsonObject18 = new JsonObject();
            for (Map.Entry entry3 : context3.additionalProperties.entrySet()) {
                jsonObject18.add((String) entry3.getKey(), JsonSerializer.toJsonElement(entry3.getValue()));
            }
            jsonObject.add("context", jsonObject18);
        }
        if (action != null) {
            JsonObject jsonObject19 = new JsonObject();
            List list3 = action.id;
            JsonArray jsonArray3 = new JsonArray(list3.size());
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                jsonArray3.add((String) it5.next());
            }
            jsonObject19.add("id", jsonArray3);
            jsonObject.add("action", jsonObject19);
        }
        if (container != null) {
            JsonObject jsonObject20 = new JsonObject();
            ResourceEvent.ContainerView containerView = container.view;
            JsonObject jsonObject21 = new JsonObject();
            jsonObject21.addProperty("id", containerView.id);
            jsonObject20.add("view", jsonObject21);
            jsonObject20.add("source", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(container.source)));
            jsonObject.add("container", jsonObject20);
        }
        jsonObject.addProperty("type", "resource");
        JsonObject jsonObject22 = new JsonObject();
        String str32 = resource.id;
        if (str32 != null) {
            jsonObject22.addProperty("id", str32);
        }
        jsonObject22.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$21(resource.f968type)));
        int i5 = resource.method;
        if (i5 != 0) {
            jsonObject22.add("method", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$15(i5)));
        }
        jsonObject22.addProperty("url", resource.url);
        Long l = resource.statusCode;
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject22, "status_code");
        }
        Long l2 = resource.duration;
        if (l2 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l2, jsonObject22, "duration");
        }
        Long l3 = resource.size;
        if (l3 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l3, jsonObject22, "size");
        }
        Long l4 = resource.encodedBodySize;
        if (l4 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l4, jsonObject22, "encoded_body_size");
        }
        Long l5 = resource.decodedBodySize;
        if (l5 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l5, jsonObject22, "decoded_body_size");
        }
        Long l6 = resource.transferSize;
        if (l6 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l6, jsonObject22, "transfer_size");
        }
        int i6 = resource.renderBlockingStatus;
        if (i6 != 0) {
            jsonObject22.add("render_blocking_status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$18(i6)));
        }
        ResourceEvent.Worker worker = resource.worker;
        if (worker != null) {
            JsonObject jsonObject23 = new JsonObject();
            jsonObject23.addProperty("duration", Long.valueOf(worker.duration));
            jsonObject23.addProperty("start", Long.valueOf(worker.start));
            jsonObject22.add("worker", jsonObject23);
        }
        ResourceEvent.Redirect redirect = resource.redirect;
        if (redirect != null) {
            JsonObject jsonObject24 = new JsonObject();
            jsonObject24.addProperty("duration", Long.valueOf(redirect.duration));
            jsonObject24.addProperty("start", Long.valueOf(redirect.start));
            jsonObject22.add("redirect", jsonObject24);
        }
        ResourceEvent.Dns dns = resource.dns;
        if (dns != null) {
            JsonObject jsonObject25 = new JsonObject();
            jsonObject25.addProperty("duration", Long.valueOf(dns.duration));
            jsonObject25.addProperty("start", Long.valueOf(dns.start));
            jsonObject22.add("dns", jsonObject25);
        }
        ResourceEvent.Connect connect = resource.connect;
        if (connect != null) {
            JsonObject jsonObject26 = new JsonObject();
            jsonObject26.addProperty("duration", Long.valueOf(connect.duration));
            jsonObject26.addProperty("start", Long.valueOf(connect.start));
            jsonObject22.add("connect", jsonObject26);
        }
        ResourceEvent.Ssl ssl = resource.ssl;
        if (ssl != null) {
            JsonObject jsonObject27 = new JsonObject();
            jsonObject27.addProperty("duration", Long.valueOf(ssl.duration));
            jsonObject27.addProperty("start", Long.valueOf(ssl.start));
            jsonObject22.add("ssl", jsonObject27);
        }
        ResourceEvent.FirstByte firstByte = resource.firstByte;
        if (firstByte != null) {
            JsonObject jsonObject28 = new JsonObject();
            jsonObject28.addProperty("duration", Long.valueOf(firstByte.duration));
            jsonObject28.addProperty("start", Long.valueOf(firstByte.start));
            jsonObject22.add("first_byte", jsonObject28);
        }
        ResourceEvent.Download download = resource.download;
        if (download != null) {
            JsonObject jsonObject29 = new JsonObject();
            jsonObject29.addProperty("duration", Long.valueOf(download.duration));
            jsonObject29.addProperty("start", Long.valueOf(download.start));
            jsonObject22.add("download", jsonObject29);
        }
        String str33 = resource.protocol;
        if (str33 != null) {
            jsonObject22.addProperty("protocol", str33);
        }
        int i7 = resource.deliveryType;
        if (i7 != 0) {
            jsonObject22.add("delivery_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$12(i7)));
        }
        ResourceEvent.Provider provider = resource.provider;
        if (provider != null) {
            JsonObject jsonObject30 = new JsonObject();
            String str34 = provider.domain;
            if (str34 != null) {
                jsonObject30.addProperty("domain", str34);
            }
            String str35 = provider.name;
            if (str35 != null) {
                jsonObject30.addProperty("name", str35);
            }
            int i8 = provider.f967type;
            if (i8 != 0) {
                jsonObject30.add("type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$17(i8)));
            }
            jsonObject22.add("provider", jsonObject30);
        }
        ResourceEvent.Graphql graphql = resource.graphql;
        if (graphql != null) {
            JsonObject jsonObject31 = new JsonObject();
            jsonObject31.add("operationType", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$16(graphql.operationType)));
            String str36 = graphql.operationName;
            if (str36 != null) {
                jsonObject31.addProperty("operationName", str36);
            }
            String str37 = graphql.payload;
            if (str37 != null) {
                jsonObject31.addProperty("payload", str37);
            }
            String str38 = graphql.variables;
            if (str38 != null) {
                jsonObject31.addProperty("variables", str38);
            }
            Long l7 = graphql.errorCount;
            if (l7 != null) {
                RumErrorSource$EnumUnboxingLocalUtility.m(l7, jsonObject31, "error_count");
            }
            List<ResourceEvent.Error> list4 = graphql.errors;
            if (list4 != null) {
                JsonArray jsonArray4 = new JsonArray(list4.size());
                for (ResourceEvent.Error error : list4) {
                    error.getClass();
                    JsonObject jsonObject32 = new JsonObject();
                    jsonObject32.addProperty("message", error.message);
                    String str39 = error.code;
                    if (str39 != null) {
                        jsonObject32.addProperty("code", str39);
                    }
                    List<ResourceEvent.Location> list5 = error.locations;
                    if (list5 != null) {
                        JsonArray jsonArray5 = new JsonArray(list5.size());
                        for (ResourceEvent.Location location : list5) {
                            location.getClass();
                            JsonObject jsonObject33 = new JsonObject();
                            jsonObject33.addProperty("line", Long.valueOf(location.line));
                            jsonObject33.addProperty("column", Long.valueOf(location.column));
                            jsonArray5.add(jsonObject33);
                        }
                        jsonObject32.add("locations", jsonArray5);
                    }
                    List list6 = error.path;
                    if (list6 != null) {
                        JsonArray jsonArray6 = new JsonArray(list6.size());
                        Iterator it6 = list6.iterator();
                        while (it6.hasNext()) {
                            jsonArray6.add(((ResourceEvent.Path) it6.next()).toJson());
                        }
                        jsonObject32.add("path", jsonArray6);
                    }
                    jsonArray4.add(jsonObject32);
                }
                jsonObject31.add("errors", jsonArray4);
            }
            jsonObject22.add("graphql", jsonObject31);
        }
        jsonObject.add("resource", jsonObject22);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        asJsonObject.getClass();
        extractKnownAttributes(asJsonObject);
        String jsonElement = asJsonObject.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public final String serializeVitalAppLaunchEvent(VitalAppLaunchEvent vitalAppLaunchEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        VitalAppLaunchEvent.Usr usr = vitalAppLaunchEvent.usr;
        InternalLogger internalLogger = this.internalLogger;
        VitalAppLaunchEvent.Usr usr2 = usr != null ? new VitalAppLaunchEvent.Usr(usr.id, usr.name, usr.email, usr.anonymousId, new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateUserAttributes(usr.additionalProperties), internalLogger))) : null;
        VitalAppLaunchEvent.Context context = vitalAppLaunchEvent.context;
        VitalAppLaunchEvent.Context context2 = context != null ? new VitalAppLaunchEvent.Context(new LinkedHashMap(JsonSerializer.safeMapValuesToJson(validateContextAttributes(context.additionalProperties), internalLogger))) : null;
        long j = vitalAppLaunchEvent.date;
        VitalAppLaunchEvent.Application application = vitalAppLaunchEvent.application;
        String str8 = vitalAppLaunchEvent.service;
        String str9 = vitalAppLaunchEvent.version;
        String str10 = vitalAppLaunchEvent.buildVersion;
        String str11 = vitalAppLaunchEvent.buildId;
        String str12 = vitalAppLaunchEvent.ddtags;
        VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession = vitalAppLaunchEvent.session;
        int i = vitalAppLaunchEvent.source;
        VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView = vitalAppLaunchEvent.view;
        VitalAppLaunchEvent.Connectivity connectivity = vitalAppLaunchEvent.connectivity;
        VitalAppLaunchEvent.Synthetics synthetics = vitalAppLaunchEvent.synthetics;
        VitalAppLaunchEvent.Os os = vitalAppLaunchEvent.os;
        VitalAppLaunchEvent.Device device = vitalAppLaunchEvent.device;
        VitalAppLaunchEvent.Dd dd = vitalAppLaunchEvent.dd;
        VitalAppLaunchEvent.Vital vital = vitalAppLaunchEvent.vital;
        JsonObject jsonObject = new JsonObject();
        VitalAppLaunchEvent.Context context3 = context2;
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(j));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", application.id);
        String str13 = application.currentLocale;
        if (str13 != null) {
            jsonObject2.addProperty("current_locale", str13);
        }
        jsonObject.add("application", jsonObject2);
        if (str8 != null) {
            jsonObject.addProperty("service", str8);
        }
        if (str9 != null) {
            jsonObject.addProperty("version", str9);
        }
        if (str10 != null) {
            jsonObject.addProperty("build_version", str10);
        }
        if (str11 != null) {
            jsonObject.addProperty("build_id", str11);
        }
        if (str12 != null) {
            jsonObject.addProperty("ddtags", str12);
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("id", vitalAppLaunchEventSession.id);
        int i2 = vitalAppLaunchEventSession.f973type;
        if (i2 == 1) {
            str = "user";
        } else if (i2 == 2) {
            str = "synthetics";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ci_test";
        }
        jsonObject3.add("type", new JsonPrimitive(str));
        jsonObject.add("session", jsonObject3);
        if (i != 0) {
            jsonObject.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$12(i)));
        }
        if (vitalAppLaunchEventView != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", vitalAppLaunchEventView.id);
            jsonObject4.addProperty("url", vitalAppLaunchEventView.url);
            String str14 = vitalAppLaunchEventView.name;
            if (str14 != null) {
                jsonObject4.addProperty("name", str14);
            }
            jsonObject.add("view", jsonObject4);
        }
        if (usr2 != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str15 = usr2.id;
            if (str15 != null) {
                jsonObject5.addProperty("id", str15);
            }
            String str16 = usr2.name;
            if (str16 != null) {
                jsonObject5.addProperty("name", str16);
            }
            String str17 = usr2.email;
            if (str17 != null) {
                jsonObject5.addProperty("email", str17);
            }
            String str18 = usr2.anonymousId;
            if (str18 != null) {
                jsonObject5.addProperty("anonymous_id", str18);
            }
            for (Map.Entry entry : usr2.additionalProperties.entrySet()) {
                String str19 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!ArraysKt___ArraysKt.contains(VitalAppLaunchEvent.Usr.RESERVED_PROPERTIES, str19)) {
                    jsonObject5.add(str19, JsonSerializer.toJsonElement(value));
                }
            }
            jsonObject.add("usr", jsonObject5);
        }
        if (connectivity != null) {
            JsonObject jsonObject6 = new JsonObject();
            int i3 = connectivity.status;
            if (i3 == 1) {
                str7 = "connected";
            } else if (i3 == 2) {
                str7 = "not_connected";
            } else {
                if (i3 != 3) {
                    throw null;
                }
                str7 = "maybe";
            }
            jsonObject6.add("status", new JsonPrimitive(str7));
            List list = connectivity.interfaces;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(new JsonPrimitive(((VitalAppLaunchEvent.Interface) it.next()).jsonValue));
                }
                jsonObject6.add("interfaces", jsonArray);
            }
            VitalAppLaunchEvent.Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject7 = new JsonObject();
                String str20 = cellular.technology;
                if (str20 != null) {
                    jsonObject7.addProperty("technology", str20);
                }
                String str21 = cellular.carrierName;
                if (str21 != null) {
                    jsonObject7.addProperty("carrier_name", str21);
                }
                jsonObject6.add("cellular", jsonObject7);
            }
            jsonObject.add("connectivity", jsonObject6);
        }
        if (synthetics != null) {
            JsonObject jsonObject8 = new JsonObject();
            jsonObject8.addProperty("test_id", synthetics.testId);
            jsonObject8.addProperty("result_id", synthetics.resultId);
            jsonObject.add("synthetics", jsonObject8);
        }
        if (os != null) {
            JsonObject jsonObject9 = new JsonObject();
            jsonObject9.addProperty("name", os.name);
            jsonObject9.addProperty("version", os.version);
            jsonObject9.addProperty("version_major", os.versionMajor);
            jsonObject.add("os", jsonObject9);
        }
        if (device != null) {
            JsonObject jsonObject10 = new JsonObject();
            int i4 = device.f972type;
            if (i4 != 0) {
                switch (i4) {
                    case 1:
                        str6 = "mobile";
                        break;
                    case 2:
                        str6 = "desktop";
                        break;
                    case 3:
                        str6 = "tablet";
                        break;
                    case 4:
                        str6 = "tv";
                        break;
                    case 5:
                        str6 = "gaming_console";
                        break;
                    case 6:
                        str6 = "bot";
                        break;
                    case 7:
                        str6 = "other";
                        break;
                    default:
                        throw null;
                }
                jsonObject10.add("type", new JsonPrimitive(str6));
            }
            String str22 = device.name;
            if (str22 != null) {
                jsonObject10.addProperty("name", str22);
            }
            String str23 = device.model;
            if (str23 != null) {
                jsonObject10.addProperty("model", str23);
            }
            String str24 = device.brand;
            if (str24 != null) {
                jsonObject10.addProperty("brand", str24);
            }
            String str25 = device.architecture;
            if (str25 != null) {
                jsonObject10.addProperty("architecture", str25);
            }
            List list2 = device.locales;
            if (list2 != null) {
                JsonArray jsonArray2 = new JsonArray(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add((String) it2.next());
                }
                jsonObject10.add("locales", jsonArray2);
            }
            String str26 = device.timeZone;
            if (str26 != null) {
                jsonObject10.addProperty("time_zone", str26);
            }
            Float f = device.batteryLevel;
            if (f != null) {
                jsonObject10.addProperty("battery_level", f);
            }
            Boolean bool = device.powerSavingMode;
            if (bool != null) {
                jsonObject10.addProperty("power_saving_mode", bool);
            }
            Number number = device.brightnessLevel;
            if (number != null) {
                jsonObject10.addProperty("brightness_level", number);
            }
            jsonObject.add("device", jsonObject10);
        }
        JsonObject jsonObject11 = new JsonObject();
        jsonObject11.addProperty("format_version", (Number) 2L);
        VitalAppLaunchEvent.DdSession ddSession = dd.session;
        JsonObject jsonObject12 = new JsonObject();
        int i5 = ddSession.sessionPrecondition;
        if (i5 != 0) {
            switch (i5) {
                case 1:
                    str5 = "user_app_launch";
                    break;
                case 2:
                    str5 = "inactivity_timeout";
                    break;
                case 3:
                    str5 = "max_duration";
                    break;
                case 4:
                    str5 = "background_launch";
                    break;
                case 5:
                    str5 = "prewarm";
                    break;
                case 6:
                    str5 = "from_non_interactive_session";
                    break;
                case 7:
                    str5 = "explicit_stop";
                    break;
                default:
                    throw null;
            }
            jsonObject12.add("session_precondition", new JsonPrimitive(str5));
        }
        jsonObject11.add("session", jsonObject12);
        VitalAppLaunchEvent.Configuration configuration = dd.configuration;
        JsonObject jsonObject13 = new JsonObject();
        jsonObject13.addProperty("session_sample_rate", configuration.sessionSampleRate);
        jsonObject11.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject13);
        VitalAppLaunchEvent.Profiling profiling = dd.profiling;
        JsonObject jsonObject14 = new JsonObject();
        int i6 = profiling.status;
        if (i6 != 0) {
            if (i6 == 1) {
                str4 = "starting";
            } else if (i6 == 2) {
                str4 = "running";
            } else if (i6 == 3) {
                str4 = "stopped";
            } else {
                if (i6 != 4) {
                    throw null;
                }
                str4 = BreadcrumbHelper.Category.ERROR;
            }
            jsonObject14.add("status", new JsonPrimitive(str4));
        }
        jsonObject11.add("profiling", jsonObject14);
        jsonObject.add("_dd", jsonObject11);
        if (context3 != null) {
            JsonObject jsonObject15 = new JsonObject();
            for (Map.Entry entry2 : context3.additionalProperties.entrySet()) {
                jsonObject15.add((String) entry2.getKey(), JsonSerializer.toJsonElement(entry2.getValue()));
            }
            jsonObject.add("context", jsonObject15);
        }
        jsonObject.addProperty("type", "vital");
        JsonObject jsonObject16 = new JsonObject();
        jsonObject16.addProperty("id", vital.id);
        jsonObject16.addProperty("name", vital.name);
        jsonObject16.addProperty("type", "app_launch");
        int i7 = vital.appLaunchMetric;
        if (i7 == 1) {
            str2 = "ttid";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str2 = "ttfd";
        }
        jsonObject16.add("app_launch_metric", new JsonPrimitive(str2));
        jsonObject16.addProperty("duration", vital.duration);
        int i8 = vital.startupType;
        if (i8 != 0) {
            if (i8 == 1) {
                str3 = "cold_start";
            } else {
                if (i8 != 2) {
                    throw null;
                }
                str3 = "warm_start";
            }
            jsonObject16.add("startup_type", new JsonPrimitive(str3));
        }
        jsonObject16.addProperty("has_saved_instance_state_bundle", vital.hasSavedInstanceStateBundle);
        jsonObject.add("vital", jsonObject16);
        JsonObject asJsonObject = jsonObject.getAsJsonObject();
        asJsonObject.getClass();
        extractKnownAttributes(asJsonObject);
        String jsonElement = asJsonObject.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public final LinkedHashMap validateAccountAttributes(Map map) {
        return this.dataConstraints.validateAttributes(map, "account", "account extra information", ignoredAttributes);
    }

    public final LinkedHashMap validateContextAttributes(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!crossPlatformTransitAttributes.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return zzhi.validateAttributes$default(this.dataConstraints, linkedHashMap, "context", ignoredAttributes, 4);
    }

    public final LinkedHashMap validateUserAttributes(Map map) {
        return this.dataConstraints.validateAttributes(map, "usr", "user extra information", ignoredAttributes);
    }
}
