package com.bugsnag.android;

import android.app.ApplicationExitInfo;
import com.bugsnag.android.JsonStream;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ExitInfoKey implements JsonStream.Streamable {
    public final int pid;
    public final long timestamp;

    public ExitInfoKey(ApplicationExitInfo applicationExitInfo) {
        this(applicationExitInfo.getPid(), applicationExitInfo.getTimestamp());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInfoKey)) {
            return false;
        }
        ExitInfoKey exitInfoKey = (ExitInfoKey) obj;
        return this.pid == exitInfoKey.pid && this.timestamp == exitInfoKey.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + (Integer.hashCode(this.pid) * 31);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("pid");
        jsonStream.value((Number) Integer.valueOf(this.pid));
        jsonStream.name("timestamp");
        jsonStream.value(String.valueOf(this.timestamp));
        jsonStream.endObject();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitInfoKey(pid=");
        sb.append(this.pid);
        sb.append(", timestamp=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.timestamp, ')');
    }

    public ExitInfoKey(int i, long j) {
        this.pid = i;
        this.timestamp = j;
    }
}
