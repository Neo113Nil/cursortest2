package com.google.android.datatransport.cct.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_AndroidClientInfo extends AndroidClientInfo {
    public final String applicationBuild;
    public final String country;
    public final String device;
    public final String fingerprint;
    public final String hardware;
    public final String locale;
    public final String manufacturer;
    public final String mccMnc;
    public final String model;
    public final String osBuild;
    public final String product;
    public final Integer sdkVersion;

    public AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        if (!this.sdkVersion.equals(((AutoValue_AndroidClientInfo) androidClientInfo).sdkVersion)) {
            return false;
        }
        if (!this.model.equals(((AutoValue_AndroidClientInfo) androidClientInfo).model)) {
            return false;
        }
        if (!this.hardware.equals(((AutoValue_AndroidClientInfo) androidClientInfo).hardware)) {
            return false;
        }
        if (!this.device.equals(((AutoValue_AndroidClientInfo) androidClientInfo).device)) {
            return false;
        }
        if (!this.product.equals(((AutoValue_AndroidClientInfo) androidClientInfo).product)) {
            return false;
        }
        if (!this.osBuild.equals(((AutoValue_AndroidClientInfo) androidClientInfo).osBuild)) {
            return false;
        }
        if (!this.manufacturer.equals(((AutoValue_AndroidClientInfo) androidClientInfo).manufacturer)) {
            return false;
        }
        if (!this.fingerprint.equals(((AutoValue_AndroidClientInfo) androidClientInfo).fingerprint)) {
            return false;
        }
        if (!this.locale.equals(((AutoValue_AndroidClientInfo) androidClientInfo).locale)) {
            return false;
        }
        if (!this.country.equals(((AutoValue_AndroidClientInfo) androidClientInfo).country)) {
            return false;
        }
        if (this.mccMnc.equals(((AutoValue_AndroidClientInfo) androidClientInfo).mccMnc)) {
            return this.applicationBuild.equals(((AutoValue_AndroidClientInfo) androidClientInfo).applicationBuild);
        }
        return false;
    }

    public final int hashCode() {
        return this.applicationBuild.hashCode() ^ ((((((((((((((((((((((this.sdkVersion.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.hardware.hashCode()) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.product.hashCode()) * 1000003) ^ this.osBuild.hashCode()) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.fingerprint.hashCode()) * 1000003) ^ this.locale.hashCode()) * 1000003) ^ this.country.hashCode()) * 1000003) ^ this.mccMnc.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", hardware=");
        sb.append(this.hardware);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", osBuild=");
        sb.append(this.osBuild);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", fingerprint=");
        sb.append(this.fingerprint);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", mccMnc=");
        sb.append(this.mccMnc);
        sb.append(", applicationBuild=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.applicationBuild, "}");
    }
}
