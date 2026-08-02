package com.bugsnag.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class EventFilenameInfo {
    public final String apiKey;
    public final Set errorTypes;
    public final String suffix;
    public final long timestamp;
    public final String uuid;

    public EventFilenameInfo(String str, String str2, long j, String str3, Set set) {
        this.apiKey = str;
        this.uuid = str2;
        this.timestamp = j;
        this.suffix = str3;
        this.errorTypes = set;
    }

    public final String component1() {
        return this.apiKey;
    }

    public final String encode() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.timestamp);
        sb.append('_');
        sb.append(this.apiKey);
        sb.append('_');
        sb.append(Bugsnag.serializeErrorTypeHeader(this.errorTypes));
        sb.append('_');
        sb.append(this.uuid);
        sb.append('_');
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.suffix, ".json");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventFilenameInfo)) {
            return false;
        }
        EventFilenameInfo eventFilenameInfo = (EventFilenameInfo) obj;
        return Intrinsics.areEqual(this.apiKey, eventFilenameInfo.apiKey) && Intrinsics.areEqual(this.uuid, eventFilenameInfo.uuid) && this.timestamp == eventFilenameInfo.timestamp && this.suffix.equals(eventFilenameInfo.suffix) && Intrinsics.areEqual(this.errorTypes, eventFilenameInfo.errorTypes);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set getErrorTypes() {
        return this.errorTypes;
    }

    public final int hashCode() {
        return this.errorTypes.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.apiKey.hashCode() * 31, 31, this.uuid), 31, this.timestamp), 31, this.suffix);
    }

    public final boolean isLaunchCrashReport() {
        return this.suffix.equals("startupcrash");
    }

    public final String toString() {
        return "EventFilenameInfo(apiKey=" + this.apiKey + ", uuid=" + this.uuid + ", timestamp=" + this.timestamp + ", suffix=" + this.suffix + ", errorTypes=" + this.errorTypes + ')';
    }
}
