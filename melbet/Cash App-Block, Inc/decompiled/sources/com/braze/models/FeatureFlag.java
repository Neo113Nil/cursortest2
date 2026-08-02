package com.braze.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.y7;
import bo.app.z7;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 62\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u000278B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010(\u0012\u0004\b0\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u0019R\u001b\u0010\f\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014¨\u00069"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "", "id", "", "enabled", "propertiesJson", "trackingString", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "properties", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/FeatureFlag;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getEnabled", "()Z", "getEnabled$annotations", "getPropertiesJson$annotations", "getTrackingString$android_sdk_base_release", "getTrackingString$android_sdk_base_release$annotations", "properties$delegate", "Lkotlin/Lazy;", "getProperties", "Companion", "bo/app/z7", "bo/app/y7", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject> {
    public static final z7 Companion = new z7();
    private final boolean enabled;
    private final String id;

    /* renamed from: properties$delegate, reason: from kotlin metadata */
    private final Lazy properties;
    private final String propertiesJson;
    private final String trackingString;

    public /* synthetic */ FeatureFlag(int i, String str, boolean z, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, y7.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.enabled = z;
        this.propertiesJson = str2;
        if ((i & 8) == 0) {
            this.trackingString = null;
        } else {
            this.trackingString = str3;
        }
        this.properties = LazyKt.lazy(new FeatureFlag$$ExternalSyntheticLambda0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$0(FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new FeatureFlag$$ExternalSyntheticLambda0(featureFlag, 1), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0$0(FeatureFlag featureFlag) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating FeatureFlag Json.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$0(FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new FeatureFlag$$ExternalSyntheticLambda0(featureFlag, 3), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$0$0(FeatureFlag featureFlag) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.enabled);
        output.encodeStringElement(serialDesc, 2, self.propertiesJson);
        if (!output.shouldEncodeElementDefault(serialDesc) && self.trackingString == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.trackingString);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(getProperties()), this.trackingString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.areEqual(this.id, featureFlag.id) && this.enabled == featureFlag.enabled && Intrinsics.areEqual(this.propertiesJson, featureFlag.propertiesJson) && Intrinsics.areEqual(this.trackingString, featureFlag.trackingString);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject getValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put("fts", this.trackingString);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Banner$$ExternalSyntheticLambda0(15), 4, (Object) null);
            return jSONObject;
        }
    }

    public final String getId() {
        return this.id;
    }

    public JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.enabled), 31, this.propertiesJson);
        String str = this.trackingString;
        return m + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        boolean z = this.enabled;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("FeatureFlag(id=", str, ", enabled=", ", propertiesJson=", z), this.propertiesJson, ", trackingString=", this.trackingString, ")");
    }

    public FeatureFlag(String str, boolean z, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.enabled = z;
        this.propertiesJson = str2;
        this.trackingString = str3;
        this.properties = LazyKt.lazy(new FeatureFlag$$ExternalSyntheticLambda0(this, 2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureFlag(String str, boolean z, JSONObject jSONObject, String str2) {
        this(str, z, r3, str2);
        str.getClass();
        jSONObject.getClass();
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
    }
}
