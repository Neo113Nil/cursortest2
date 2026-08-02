package com.datadog.android.ndk.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.gms.internal.mlkit_vision_face.zznf;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.ecr.BuildConfig;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.workflow1.Snapshots;
import com.squareup.workflow1.WorkflowInterceptorKt;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.CompatibleKt;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import com.squareup.workflow1.ui.backstack.ViewStateCacheKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class NdkCrashLogDeserializer implements Deserializer {
    public final /* synthetic */ int $r8$classId;
    public final InternalLogger internalLogger;

    public NdkCrashLogDeserializer(InternalLogger internalLogger, int i) {
        this.$r8$classId = i;
        internalLogger.getClass();
        switch (i) {
            case 1:
                this.internalLogger = internalLogger;
                break;
            case 2:
                this.internalLogger = internalLogger;
                break;
            default:
                this.internalLogger = internalLogger;
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Object parseEvent(JsonObject jsonObject, String str) {
        ArrayList arrayList;
        JsonArray asJsonArray;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        ArrayList arrayList2;
        JsonArray asJsonArray2;
        JsonObject asJsonObject5;
        JsonObject asJsonObject6;
        JsonObject asJsonObject7;
        JsonObject asJsonObject8;
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return ActionEvent.Companion.fromJsonObject(jsonObject);
                    }
                    break;
                case -341064690:
                    if (str.equals("resource")) {
                        return ResourceEvent.Companion.fromJsonObject(jsonObject);
                    }
                    break;
                case 3619493:
                    if (str.equals("view")) {
                        return ViewEvent.Companion.fromJsonObject(jsonObject);
                    }
                    break;
                case 96784904:
                    if (str.equals(BreadcrumbHelper.Category.ERROR)) {
                        return ErrorEvent.Companion.fromJsonObject(jsonObject);
                    }
                    break;
                case 128111976:
                    if (str.equals("long_task")) {
                        return LongTaskEvent.Companion.fromJsonObject(jsonObject);
                    }
                    break;
                case 780346297:
                    if (str.equals("telemetry")) {
                        String asString = jsonObject.getAsJsonObject("telemetry").getAsJsonPrimitive("status").getAsString();
                        if (Intrinsics.areEqual(asString, BuildConfig.BUILD_TYPE)) {
                            try {
                                JsonObject asJsonObject9 = jsonObject.get("_dd").getAsJsonObject();
                                asJsonObject9.getClass();
                                zzb fromJsonObject = Snapshots.fromJsonObject(asJsonObject9);
                                String asString2 = jsonObject.get("type").getAsString();
                                long asLong = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                                String asString3 = jsonObject.get("service").getAsString();
                                String asString4 = jsonObject.get("source").getAsString();
                                asString4.getClass();
                                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                int length = values.length;
                                int i = 0;
                                while (i < length) {
                                    int i2 = values[i];
                                    int[] iArr = values;
                                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$20(i2).equals(asString4)) {
                                        String asString5 = jsonObject.get("version").getAsString();
                                        JsonElement jsonElement = jsonObject.get("application");
                                        TelemetryDebugEvent.Application fromJsonObject2 = (jsonElement == null || (asJsonObject8 = jsonElement.getAsJsonObject()) == null) ? null : ReflectionKt.fromJsonObject(asJsonObject8);
                                        JsonElement jsonElement2 = jsonObject.get("session");
                                        TelemetryDebugEvent.Session fromJsonObject3 = (jsonElement2 == null || (asJsonObject7 = jsonElement2.getAsJsonObject()) == null) ? null : WorkflowInterceptorKt.fromJsonObject(asJsonObject7);
                                        JsonElement jsonElement3 = jsonObject.get("view");
                                        TelemetryDebugEvent.View fromJsonObject4 = (jsonElement3 == null || (asJsonObject6 = jsonElement3.getAsJsonObject()) == null) ? null : BackPressHandlerKt.fromJsonObject(asJsonObject6);
                                        JsonElement jsonElement4 = jsonObject.get("action");
                                        TelemetryDebugEvent.Action fromJsonObject5 = (jsonElement4 == null || (asJsonObject5 = jsonElement4.getAsJsonObject()) == null) ? null : zzmn.fromJsonObject(asJsonObject5);
                                        JsonElement jsonElement5 = jsonObject.get("effective_sample_rate");
                                        Number asNumber = jsonElement5 != null ? jsonElement5.getAsNumber() : null;
                                        JsonElement jsonElement6 = jsonObject.get("experimental_features");
                                        if (jsonElement6 == null || (asJsonArray2 = jsonElement6.getAsJsonArray()) == null) {
                                            arrayList2 = null;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList(asJsonArray2.size());
                                            Iterator<JsonElement> it = asJsonArray2.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(it.next().getAsString());
                                            }
                                            arrayList2 = arrayList3;
                                        }
                                        JsonObject asJsonObject10 = jsonObject.get("telemetry").getAsJsonObject();
                                        asJsonObject10.getClass();
                                        TelemetryDebugEvent.Telemetry fromJsonObject6 = Workflows.fromJsonObject(asJsonObject10);
                                        if (!Intrinsics.areEqual(asString2, "telemetry")) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        asString3.getClass();
                                        asString5.getClass();
                                        return new TelemetryDebugEvent(fromJsonObject, asLong, asString3, i2, asString5, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, asNumber, arrayList2, fromJsonObject6);
                                    }
                                    i++;
                                    values = iArr;
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            } catch (IllegalStateException e) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryDebugEvent", e);
                                return null;
                            } catch (NullPointerException e2) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryDebugEvent", e2);
                                return null;
                            } catch (NumberFormatException e3) {
                                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryDebugEvent", e3);
                                return null;
                            }
                        }
                        if (!Intrinsics.areEqual(asString, BreadcrumbHelper.Category.ERROR)) {
                            throw new JsonParseException(Recorder$$ExternalSyntheticOutline2.m("We could not deserialize the telemetry event with status: ", asString));
                        }
                        try {
                            JsonObject asJsonObject11 = jsonObject.get("_dd").getAsJsonObject();
                            asJsonObject11.getClass();
                            zzc fromJsonObject7 = zzna.fromJsonObject(asJsonObject11);
                            String asString6 = jsonObject.get("type").getAsString();
                            long asLong2 = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                            String asString7 = jsonObject.get("service").getAsString();
                            String asString8 = jsonObject.get("source").getAsString();
                            asString8.getClass();
                            for (int i3 : CameraSelector$$ExternalSyntheticOutline0.values(7)) {
                                if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$21(i3).equals(asString8)) {
                                    String asString9 = jsonObject.get("version").getAsString();
                                    JsonElement jsonElement7 = jsonObject.get("application");
                                    TelemetryErrorEvent.Application fromJsonObject8 = (jsonElement7 == null || (asJsonObject4 = jsonElement7.getAsJsonObject()) == null) ? null : SnapshotParcelsKt.fromJsonObject(asJsonObject4);
                                    JsonElement jsonElement8 = jsonObject.get("session");
                                    TelemetryErrorEvent.Session fromJsonObject9 = (jsonElement8 == null || (asJsonObject3 = jsonElement8.getAsJsonObject()) == null) ? null : WorkflowViewStateKt.fromJsonObject(asJsonObject3);
                                    JsonElement jsonElement9 = jsonObject.get("view");
                                    TelemetryErrorEvent.View fromJsonObject10 = (jsonElement9 == null || (asJsonObject2 = jsonElement9.getAsJsonObject()) == null) ? null : ViewStateCacheKt.fromJsonObject(asJsonObject2);
                                    JsonElement jsonElement10 = jsonObject.get("action");
                                    TelemetryErrorEvent.Action fromJsonObject11 = (jsonElement10 == null || (asJsonObject = jsonElement10.getAsJsonObject()) == null) ? null : CompatibleKt.fromJsonObject(asJsonObject);
                                    JsonElement jsonElement11 = jsonObject.get("effective_sample_rate");
                                    Number asNumber2 = jsonElement11 != null ? jsonElement11.getAsNumber() : null;
                                    JsonElement jsonElement12 = jsonObject.get("experimental_features");
                                    if (jsonElement12 == null || (asJsonArray = jsonElement12.getAsJsonArray()) == null) {
                                        arrayList = null;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(asJsonArray.size());
                                        Iterator<JsonElement> it2 = asJsonArray.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(it2.next().getAsString());
                                        }
                                        arrayList = arrayList4;
                                    }
                                    JsonObject asJsonObject12 = jsonObject.get("telemetry").getAsJsonObject();
                                    asJsonObject12.getClass();
                                    TelemetryErrorEvent.Telemetry fromJsonObject12 = zznf.fromJsonObject(asJsonObject12);
                                    if (!Intrinsics.areEqual(asString6, "telemetry")) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    asString7.getClass();
                                    asString9.getClass();
                                    return new TelemetryErrorEvent(fromJsonObject7, asLong2, asString7, i3, asString9, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, asNumber2, arrayList, fromJsonObject12);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (IllegalStateException e4) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryErrorEvent", e4);
                            return null;
                        } catch (NullPointerException e5) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryErrorEvent", e5);
                            return null;
                        } catch (NumberFormatException e6) {
                            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type TelemetryErrorEvent", e6);
                            return null;
                        }
                    }
                    break;
            }
        }
        throw new JsonParseException(Recorder$$ExternalSyntheticOutline2.m("We could not deserialize the event with type: ", str));
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public Object deserialize(Object obj) {
        int i = this.$r8$classId;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        InternalLogger.Target target2 = InternalLogger.Target.TELEMETRY;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                try {
                    break;
                } catch (JsonParseException e) {
                    DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), new DatadogInterceptor$intercept$1(str, 18), e, 48);
                    return null;
                } catch (IllegalStateException e2) {
                    DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), new DatadogInterceptor$intercept$1(str, 19), e2, 48);
                    return null;
                }
            default:
                final JsonObject jsonObject = (JsonObject) obj;
                jsonObject.getClass();
                try {
                    JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("type");
                    break;
                } catch (JsonParseException e3) {
                    final int i2 = 0;
                    DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), new Function0() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i2;
                            JsonObject jsonObject2 = jsonObject;
                            switch (i3) {
                            }
                            return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{jsonObject2}, 1));
                        }
                    }, e3, 48);
                    return null;
                } catch (IllegalStateException e4) {
                    final int i3 = 1;
                    DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), new Function0() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i32 = i3;
                            JsonObject jsonObject2 = jsonObject;
                            switch (i32) {
                            }
                            return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{jsonObject2}, 1));
                        }
                    }, e4, 48);
                    return null;
                }
        }
        return null;
    }

    public File getDataStoreFile$dd_sdk_android_core_release(File file, String str, String str2) {
        file.getClass();
        str.getClass();
        str2.getClass();
        file.getClass();
        str.getClass();
        File file2 = new File(new File(file, String.format(Locale.US, "datastore_v%s", Arrays.copyOf(new Object[]{0}, 1))), str);
        InternalLogger internalLogger = this.internalLogger;
        if (!zzhk.existsSafe(file2, internalLogger)) {
            zzhk.mkdirsSafe(file2, internalLogger);
        }
        return new File(file2, str2);
    }
}
