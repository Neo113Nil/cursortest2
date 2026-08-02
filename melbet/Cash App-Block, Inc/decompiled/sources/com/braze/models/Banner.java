package com.braze.models;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.l;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\b\u0007\u0018\u0000 %2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001&BK\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\f\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006'"}, d2 = {"Lcom/braze/models/Banner;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "", "trackingId", "placementId", "html", "", "isControl", "", "expirationTimestampSeconds", "isTestSend", "stableKey", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJZLjava/lang/String;Lorg/json/JSONObject;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/Banner;", "deepcopy", "isExpired", "()Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTrackingId", "getPlacementId", "getHtml", "Z", "J", "getExpirationTimestampSeconds", "()J", "getStableKey", "Lorg/json/JSONObject;", "getProperties", "Companion", "bo/app/l", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Banner implements IPutIntoJson<JSONObject> {
    public static final l Companion = new l();
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final JSONObject properties;
    private final String stableKey;
    private final String trackingId;

    public Banner(String str, String str2, String str3, boolean z, long j, boolean z2, String str4, JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        jSONObject.getClass();
        this.trackingId = str;
        this.placementId = str2;
        this.html = str3;
        this.isControl = z;
        this.expirationTimestampSeconds = j;
        this.isTestSend = z2;
        this.stableKey = str4;
        this.properties = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend, this.stableKey, getProperties());
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put("placement_id", this.placementId);
            jSONObject2.put("html", this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put("expires_at", this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            String str = this.stableKey;
            if (str != null) {
                jSONObject2.put("stable_key", str);
            }
            jSONObject2.put("properties", getProperties());
            jSONObject.put("banner", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Banner$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return jSONObject;
        }
    }

    public final long getExpirationTimestampSeconds() {
        return this.expirationTimestampSeconds;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public JSONObject getProperties() {
        return this.properties;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final boolean isExpired() {
        long j = this.expirationTimestampSeconds;
        return j != -1 && j < DateTimeUtils.nowInSeconds();
    }

    /* renamed from: isTestSend, reason: from getter */
    public final boolean getIsTestSend() {
        return this.isTestSend;
    }

    public String toString() {
        String str = this.trackingId;
        String str2 = this.placementId;
        String str3 = this.html;
        boolean z = this.isControl;
        long j = this.expirationTimestampSeconds;
        boolean z2 = this.isTestSend;
        String str4 = this.stableKey;
        JSONObject properties = getProperties();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n            Banner{\n            trackingId='", str, "'\n            placementId='", str2, "'\n            html='");
        NavAction$$ExternalSyntheticOutline0.m(m, str3, "'\n            isControl=", z, "\n            expirationTimestampSeconds=");
        m.append(j);
        m.append("\n            isTestSend=");
        m.append(z2);
        m.append("\n            stableKey='");
        m.append(str4);
        m.append("'\n            properties=");
        m.append(properties);
        m.append("\n            }\n        ");
        return StringsKt__IndentKt.replaceIndent(m.toString());
    }
}
