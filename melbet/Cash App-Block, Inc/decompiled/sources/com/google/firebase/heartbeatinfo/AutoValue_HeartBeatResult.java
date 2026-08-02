package com.google.firebase.heartbeatinfo;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class AutoValue_HeartBeatResult {
    public final ArrayList usedDates;
    public final String userAgent;

    public AutoValue_HeartBeatResult(String str, ArrayList arrayList) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null userAgent");
            throw null;
        }
        this.userAgent = str;
        this.usedDates = arrayList;
    }

    public static AutoValue_HeartBeatResult create(String str, ArrayList arrayList) {
        return new AutoValue_HeartBeatResult(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_HeartBeatResult)) {
            return false;
        }
        AutoValue_HeartBeatResult autoValue_HeartBeatResult = (AutoValue_HeartBeatResult) obj;
        return this.userAgent.equals(autoValue_HeartBeatResult.userAgent) && this.usedDates.equals(autoValue_HeartBeatResult.usedDates);
    }

    public final int hashCode() {
        return this.usedDates.hashCode() ^ ((this.userAgent.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.userAgent);
        sb.append(", usedDates=");
        return Recorder$$ExternalSyntheticOutline1.m("}", sb, this.usedDates);
    }
}
