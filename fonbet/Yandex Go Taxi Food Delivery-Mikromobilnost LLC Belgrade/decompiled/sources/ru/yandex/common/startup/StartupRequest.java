package ru.yandex.common.startup;

import android.os.Build;
import defpackage.b64;
import defpackage.dx21;
import defpackage.m7a1;
import defpackage.tf90;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Map;
import ru.yandex.common.location.LocationProvider;
import ru.yandex.common.network.GetRequest;
import ru.yandex.common.network.Request;

/* loaded from: classes4.dex */
public class StartupRequest extends GetRequest {
    public static final String METHOD = "all_info";
    public static final String PARAM_ANDROID_ID = "android_id";
    public static final String PARAM_APP_PLATFORM = "app_platform";
    public static final String PARAM_APP_VERSION = "app_version";
    public static final String PARAM_CELLID = "cellid";
    public static final String PARAM_CLID = "clid";
    public static final String PARAM_MANUFACTURER = "manufacturer";
    public static final String PARAM_MODEL = "model";
    public static final String PARAM_OS_VERSION = "os_version";
    public static final String PARAM_SCREEN_H = "screen_h";
    public static final String PARAM_SCREEN_W = "screen_w";
    public static final String PARAM_WIFI = "wifi";
    public static final String REQUEST_ID;
    private static final String URL_METHOD = "startup";
    private boolean fromUuidProvider;

    static {
        tf90.a.put(METHOD, a.class);
        REQUEST_ID = Request.register(StartupRequest.class);
    }

    private StartupRequest(String str) {
        this.fromUuidProvider = false;
        this.baseUrl = b64.j(str, URL_METHOD);
        setUuid((String) m7a1.a.a);
        this.values.put("app_platform", ConstantDeviceInfo.APP_PLATFORM);
        this.values.put("model", dx21.a(Build.MODEL));
        this.values.put("os_version", dx21.a(Build.VERSION.RELEASE));
    }

    private void fillLocationValues() {
        LocationProvider locationProvider = this.locationProvider;
        if (locationProvider == null) {
            return;
        }
        locationProvider.getLocationInfo();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ru.yandex.common.network.Request
    public String describeRequest() {
        return REQUEST_ID;
    }

    @Override // ru.yandex.common.network.Request
    public String getBaseUrl() {
        return this.baseUrl;
    }

    @Override // ru.yandex.common.network.Request
    public String getMethod() {
        return METHOD;
    }

    @Override // ru.yandex.common.network.Request
    public String getUrl() {
        fillLocationValues();
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseUrl());
        sb.append("?");
        for (Map.Entry<String, String> entry : this.values.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // ru.yandex.common.network.Request
    public boolean isUuidNecessary() {
        return !this.fromUuidProvider;
    }

    public void setFromUuidProvider(boolean z) {
        this.fromUuidProvider = z;
    }

    public StartupRequest() {
        this.fromUuidProvider = false;
    }
}
