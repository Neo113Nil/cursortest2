package com.bugsnag.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.bugsnag.android.JsonStream;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExitInfoPluginStore$PersistentState implements JsonStream.Streamable {
    public final int pid;
    public final Set processedExitInfoKeys;
    public final long timestamp;

    public ExitInfoPluginStore$PersistentState(int i, long j, Set set) {
        this.pid = i;
        this.timestamp = j;
        this.processedExitInfoKeys = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInfoPluginStore$PersistentState)) {
            return false;
        }
        ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState = (ExitInfoPluginStore$PersistentState) obj;
        return this.pid == exitInfoPluginStore$PersistentState.pid && this.timestamp == exitInfoPluginStore$PersistentState.timestamp && Intrinsics.areEqual(this.processedExitInfoKeys, exitInfoPluginStore$PersistentState.processedExitInfoKeys);
    }

    public final long getNewestTimestamp() {
        Long l;
        Iterator it = this.processedExitInfoKeys.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ExitInfoKey) it.next()).timestamp);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ExitInfoKey) it.next()).timestamp);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        return l != null ? l.longValue() : this.timestamp;
    }

    public final int hashCode() {
        return this.processedExitInfoKeys.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.pid) * 31, 31, this.timestamp);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("pid");
        jsonStream.value((Number) Integer.valueOf(this.pid));
        jsonStream.name("timestamp");
        jsonStream.value(String.valueOf(this.timestamp));
        jsonStream.name("exitInfoKeys");
        jsonStream.value(this.processedExitInfoKeys);
        jsonStream.endObject();
    }

    public final String toString() {
        return "PersistentState(pid=" + this.pid + ", timestamp=" + this.timestamp + ", processedExitInfoKeys=" + this.processedExitInfoKeys + ')';
    }
}
