package com.gamericefishpro.space.ah;

import com.gamericefishpro.space.yb.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final String APP_VERSION = "app_version";
    public static final a Companion = new a(null);
    private static final String DEVICE_MODEL = "device_model";
    private static final String DEVICE_OS = "device_os";
    private static final String DEVICE_TYPE = "device_type";
    private static final String SDK = "sdk";
    private static final String TYPE = "type";
    private final String appVersion;
    private final String deviceModel;
    private final String deviceOS;
    private final String deviceType;
    private final String sdk;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.deviceType = str;
        this.sdk = str2;
        this.appVersion = str3;
        this.type = str4;
        this.deviceModel = str5;
        this.deviceOS = str6;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getType() {
        return this.type;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        d.putSafe(jSONObject, SDK, this.sdk);
        d.putSafe(jSONObject, APP_VERSION, this.appVersion);
        d.putSafe(jSONObject, "type", this.type);
        d.putSafe(jSONObject, DEVICE_TYPE, this.deviceType);
        d.putSafe(jSONObject, DEVICE_MODEL, this.deviceModel);
        d.putSafe(jSONObject, DEVICE_OS, this.deviceOS);
        return jSONObject;
    }

    public String toString() {
        String string = toJSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
