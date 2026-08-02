package com.datadog.android.ndk.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class NdkCrashLog {
    public final String message;
    public final int signal;
    public final String signalName;
    public final String stacktrace;
    public final Long timeSinceAppStartMs;
    public final long timestamp;

    public abstract class Companion {
        public static NdkCrashLog fromJson$dd_sdk_android_core_release(String str) {
            str.getClass();
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            int asInt = asJsonObject.get("signal").getAsInt();
            long asLong = asJsonObject.get("timestamp").getAsLong();
            JsonElement jsonElement = asJsonObject.get("time_since_app_start_ms");
            Long l = null;
            if (jsonElement != null && !(jsonElement instanceof JsonNull)) {
                l = Long.valueOf(jsonElement.getAsLong());
            }
            String asString = asJsonObject.get("signal_name").getAsString();
            asString.getClass();
            String asString2 = asJsonObject.get("message").getAsString();
            asString2.getClass();
            String asString3 = asJsonObject.get("stacktrace").getAsString();
            asString3.getClass();
            return new NdkCrashLog(asInt, asLong, l, asString, asString2, asString3);
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewLocalMenuShortlink.deepLinkSpecs;
        }
    }

    public NdkCrashLog(int i, long j, Long l, String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.signal = i;
        this.timestamp = j;
        this.timeSinceAppStartMs = l;
        this.signalName = str;
        this.message = str2;
        this.stacktrace = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NdkCrashLog)) {
            return false;
        }
        NdkCrashLog ndkCrashLog = (NdkCrashLog) obj;
        return this.signal == ndkCrashLog.signal && this.timestamp == ndkCrashLog.timestamp && Intrinsics.areEqual(this.timeSinceAppStartMs, ndkCrashLog.timeSinceAppStartMs) && Intrinsics.areEqual(this.signalName, ndkCrashLog.signalName) && Intrinsics.areEqual(this.message, ndkCrashLog.message) && Intrinsics.areEqual(this.stacktrace, ndkCrashLog.stacktrace);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.signal) * 31, 31, this.timestamp);
        Long l = this.timeSinceAppStartMs;
        return this.stacktrace.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.signalName), 31, this.message);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NdkCrashLog(signal=");
        sb.append(this.signal);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", timeSinceAppStartMs=");
        sb.append(this.timeSinceAppStartMs);
        sb.append(", signalName=");
        sb.append(this.signalName);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", message=", this.message, ", stacktrace=", this.stacktrace);
        sb.append(")");
        return sb.toString();
    }
}
