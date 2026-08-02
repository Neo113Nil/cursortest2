package ru.yandex.quasar.glagol.backend.model;

import com.google.gson.annotations.SerializedName;
import defpackage.su4;

/* loaded from: classes6.dex */
public class QuasarInfo {

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("platform")
    private String platform;

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QuasarInfo{deviceId='");
        sb.append(this.deviceId);
        sb.append("', platform='");
        return su4.o(sb, this.platform, "'}");
    }
}
