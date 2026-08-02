package app.cash.cdp.persistence.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Event {
    public final String id;
    public final byte[] payload;
    public final long recordedAt;

    public Event(String str, long j, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.id = str;
        this.recordedAt = j;
        this.payload = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Event.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Event event = (Event) obj;
        return Intrinsics.areEqual(this.id, event.id) && this.recordedAt == event.recordedAt && Arrays.equals(this.payload, event.payload);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.payload) + Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.recordedAt);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("Event(id=", this.id, ", recordedAt=", this.recordedAt), ", payload=", Arrays.toString(this.payload), ")");
    }
}
