package com.datadog.android.api.context;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.DatadogSite;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DatadogContext {
    public final String appBuildId;
    public final String clientToken;
    public final DeviceInfo deviceInfo;
    public final String env;
    public final Map featuresContext;
    public final NetworkInfo networkInfo;
    public final ProcessInfo processInfo;
    public final String sdkVersion;
    public final String service;
    public final DatadogSite site;
    public final String source;
    public final TimeInfo time;
    public final TrackingConsent trackingConsent;
    public final UserInfo userInfo;
    public final String variant;
    public final String version;
    public final int versionCode;

    public DatadogContext(DatadogSite datadogSite, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, TimeInfo timeInfo, ProcessInfo processInfo, NetworkInfo networkInfo, DeviceInfo deviceInfo, UserInfo userInfo, TrackingConsent trackingConsent, String str8, Map map) {
        datadogSite.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        networkInfo.getClass();
        userInfo.getClass();
        trackingConsent.getClass();
        map.getClass();
        this.site = datadogSite;
        this.clientToken = str;
        this.service = str2;
        this.env = str3;
        this.version = str4;
        this.versionCode = i;
        this.variant = str5;
        this.source = str6;
        this.sdkVersion = str7;
        this.time = timeInfo;
        this.processInfo = processInfo;
        this.networkInfo = networkInfo;
        this.deviceInfo = deviceInfo;
        this.userInfo = userInfo;
        this.trackingConsent = trackingConsent;
        this.appBuildId = str8;
        this.featuresContext = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatadogContext)) {
            return false;
        }
        DatadogContext datadogContext = (DatadogContext) obj;
        return this.site == datadogContext.site && Intrinsics.areEqual(this.clientToken, datadogContext.clientToken) && Intrinsics.areEqual(this.service, datadogContext.service) && Intrinsics.areEqual(this.env, datadogContext.env) && Intrinsics.areEqual(this.version, datadogContext.version) && this.versionCode == datadogContext.versionCode && Intrinsics.areEqual(this.variant, datadogContext.variant) && Intrinsics.areEqual(this.source, datadogContext.source) && Intrinsics.areEqual(this.sdkVersion, datadogContext.sdkVersion) && this.time.equals(datadogContext.time) && this.processInfo.equals(datadogContext.processInfo) && Intrinsics.areEqual(this.networkInfo, datadogContext.networkInfo) && this.deviceInfo.equals(datadogContext.deviceInfo) && Intrinsics.areEqual(this.userInfo, datadogContext.userInfo) && this.trackingConsent == datadogContext.trackingConsent && Intrinsics.areEqual(this.appBuildId, datadogContext.appBuildId) && Intrinsics.areEqual(this.featuresContext, datadogContext.featuresContext);
    }

    public final int hashCode() {
        int hashCode = (this.trackingConsent.hashCode() + ((this.userInfo.hashCode() + ((this.deviceInfo.hashCode() + ((this.networkInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.time.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.versionCode, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.site.hashCode() * 31, 31, this.clientToken), 31, this.service), 31, this.env), 31, this.version), 31), 31, this.variant), 31, this.source), 31, this.sdkVersion)) * 31, 31, this.processInfo.isMainProcess)) * 31)) * 31)) * 961)) * 31;
        String str = this.appBuildId;
        return this.featuresContext.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatadogContext(site=");
        sb.append(this.site);
        sb.append(", clientToken=");
        sb.append(this.clientToken);
        sb.append(", service=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.service, ", env=", this.env, ", version=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.version, ", versionCode=", this.versionCode, ", variant=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.variant, ", source=", this.source, ", sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", processInfo=");
        sb.append(this.processInfo);
        sb.append(", networkInfo=");
        sb.append(this.networkInfo);
        sb.append(", deviceInfo=");
        sb.append(this.deviceInfo);
        sb.append(", userInfo=");
        sb.append(this.userInfo);
        sb.append(", accountInfo=null, trackingConsent=");
        sb.append(this.trackingConsent);
        sb.append(", appBuildId=");
        sb.append(this.appBuildId);
        sb.append(", featuresContext=");
        return re$$ExternalSyntheticOutline0.m(")", sb, this.featuresContext);
    }
}
