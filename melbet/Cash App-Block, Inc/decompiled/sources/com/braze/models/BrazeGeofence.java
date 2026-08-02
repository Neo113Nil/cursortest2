package com.braze.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.s1;
import bo.app.t1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.TuplesKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0007\u0018\u0000 U2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0002VWBk\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u0012\u0004\b2\u00103R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u00103\u001a\u0004\b8\u00109R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b<\u00103\u001a\u0004\b;\u00109R \u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00103\u001a\u0004\b>\u0010'R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\bA\u00103\u001a\u0004\b@\u0010'R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\bC\u00103\u001a\u0004\bB\u0010'R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bI\u00103\u001a\u0004\bH\u0010FR \u0010\u0011\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010D\u0012\u0004\bK\u00103\u001a\u0004\bJ\u0010FR \u0010\u0012\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010D\u0012\u0004\bM\u00103\u001a\u0004\bL\u0010FR \u0010\u0013\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010=\u0012\u0004\bO\u00103\u001a\u0004\bN\u0010'R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\bP\u00109\"\u0004\bQ\u0010RR\u0011\u0010T\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bS\u00109¨\u0006X"}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "jsonObject", "", "id", "", "latitude", "longitude", "", "radiusMeter", "cooldownEnterSeconds", "cooldownExitSeconds", "", "analyticsEnabledEnter", "analyticsEnabledExit", "enterEvents", "exitEvents", "notificationResponsivenessMs", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "seen0", "distanceFromGeofenceRefresh", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DDIIIZZZZIDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "toString", "()Ljava/lang/String;", "forJsonPut", "()Lorg/json/JSONObject;", "other", "compareTo", "(Lcom/braze/models/BrazeGeofence;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BrazeGeofence;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lorg/json/JSONObject;", "getJsonObject$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "D", "getLatitude", "()D", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "I", "getRadiusMeter", "getRadiusMeter$annotations", "getCooldownEnterSeconds", "getCooldownEnterSeconds$annotations", "getCooldownExitSeconds", "getCooldownExitSeconds$annotations", "Z", "getAnalyticsEnabledEnter", "()Z", "getAnalyticsEnabledEnter$annotations", "getAnalyticsEnabledExit", "getAnalyticsEnabledExit$annotations", "getEnterEvents", "getEnterEvents$annotations", "getExitEvents", "getExitEvents$annotations", "getNotificationResponsivenessMs", "getNotificationResponsivenessMs$annotations", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getRadiusMeters", "radiusMeters", "Companion", "bo/app/t1", "bo/app/s1", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final t1 Companion = new t1();
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrazeGeofence(JSONObject jSONObject) {
        this(jSONObject, r2, jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), jSONObject.getInt("radius"), jSONObject.getInt("cooldown_enter"), jSONObject.getInt("cooldown_exit"), jSONObject.getBoolean("analytics_enabled_enter"), jSONObject.getBoolean("analytics_enabled_exit"), jSONObject.optBoolean("enter_events", true), jSONObject.optBoolean("exit_events", true), jSONObject.optInt("notification_responsiveness", 30000));
        jSONObject.getClass();
        String string2 = jSONObject.getString("id");
        string2.getClass();
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BrazeGeofence self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeDoubleElement(serialDesc, 1, self.latitude);
        output.encodeDoubleElement(serialDesc, 2, self.longitude);
        output.encodeIntElement(3, self.radiusMeter, serialDesc);
        output.encodeIntElement(4, self.cooldownEnterSeconds, serialDesc);
        output.encodeIntElement(5, self.cooldownExitSeconds, serialDesc);
        output.encodeBooleanElement(serialDesc, 6, self.analyticsEnabledEnter);
        output.encodeBooleanElement(serialDesc, 7, self.analyticsEnabledExit);
        output.encodeBooleanElement(serialDesc, 8, self.enterEvents);
        output.encodeBooleanElement(serialDesc, 9, self.exitEvents);
        output.encodeIntElement(10, self.notificationResponsivenessMs, serialDesc);
        if (!output.shouldEncodeElementDefault(serialDesc) && Double.compare(self.distanceFromGeofenceRefresh, -1.0d) == 0) {
            return;
        }
        output.encodeDoubleElement(serialDesc, 11, self.distanceFromGeofenceRefresh);
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        other.getClass();
        double d = this.distanceFromGeofenceRefresh;
        return (d != -1.0d && d < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!BrazeGeofence.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        BrazeGeofence brazeGeofence = (BrazeGeofence) other;
        return Intrinsics.areEqual(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final String getId() {
        return this.id;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((((((Fragment$5$$ExternalSyntheticOutline0.m(this.longitude, Fragment$5$$ExternalSyntheticOutline0.m(this.latitude, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.jsonObject.hashCode() * 31, 31, this.id), 31), 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31, 31, this.analyticsEnabledEnter), 31, this.analyticsEnabledExit), 31, this.enterEvents), 31, this.exitEvents) + this.notificationResponsivenessMs) * 31);
    }

    public String toString() {
        String str = this.id;
        double d = this.latitude;
        double d2 = this.longitude;
        int i = this.radiusMeter;
        int i2 = this.cooldownEnterSeconds;
        int i3 = this.cooldownExitSeconds;
        boolean z = this.analyticsEnabledEnter;
        boolean z2 = this.analyticsEnabledExit;
        boolean z3 = this.enterEvents;
        boolean z4 = this.exitEvents;
        int i4 = this.notificationResponsivenessMs;
        double d3 = this.distanceFromGeofenceRefresh;
        StringBuilder sb = new StringBuilder("BrazeGeofence{id=");
        sb.append(str);
        sb.append(", \n            |latitude, longitude=(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append("),\n            |radiusMeters=");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", \n            |cooldownEnterSeconds=", ", \n            |cooldownExitSeconds=", sb);
        sb.append(i3);
        sb.append(", \n            |analyticsEnabledEnter=");
        sb.append(z);
        sb.append(", \n            |analyticsEnabledExit=");
        re$$ExternalSyntheticOutline0.m(sb, z2, ", \n            |enterEvents=", z3, ", \n            |exitEvents=");
        sb.append(z4);
        sb.append(", \n            |notificationResponsivenessMs=");
        sb.append(i4);
        sb.append(", \n            |distanceFromGeofenceRefresh=");
        sb.append(d3);
        sb.append(" }\n            |\n        ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public BrazeGeofence(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        jSONObject.getClass();
        str.getClass();
        this.jsonObject = jSONObject;
        this.id = str;
        this.latitude = d;
        this.longitude = d2;
        this.radiusMeter = i;
        this.cooldownEnterSeconds = i2;
        this.cooldownExitSeconds = i3;
        this.analyticsEnabledEnter = z;
        this.analyticsEnabledExit = z2;
        this.enterEvents = z3;
        this.exitEvents = z4;
        this.notificationResponsivenessMs = i4;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public /* synthetic */ BrazeGeofence(int i, String str, double d, double d2, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 == (i & 2047)) {
            this.jsonObject = new JSONObject();
            this.id = str;
            this.latitude = d;
            this.longitude = d2;
            this.radiusMeter = i2;
            this.cooldownEnterSeconds = i3;
            this.cooldownExitSeconds = i4;
            this.analyticsEnabledEnter = z;
            this.analyticsEnabledExit = z2;
            this.enterEvents = z3;
            this.exitEvents = z4;
            this.notificationResponsivenessMs = i5;
            this.distanceFromGeofenceRefresh = (i & 2048) == 0 ? -1.0d : d3;
            return;
        }
        TuplesKt.throwMissingFieldException(i, 2047, s1.a.getDescriptor());
        throw null;
    }
}
