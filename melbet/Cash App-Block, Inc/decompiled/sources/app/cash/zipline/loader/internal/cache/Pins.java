package app.cash.zipline.loader.internal.cache;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Pins {
    public final String application_name;
    public final long file_id;

    public Pins(long j, String str) {
        str.getClass();
        this.file_id = j;
        this.application_name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pins)) {
            return false;
        }
        Pins pins = (Pins) obj;
        return this.file_id == pins.file_id && Intrinsics.areEqual(this.application_name, pins.application_name);
    }

    public final int hashCode() {
        return this.application_name.hashCode() + (Long.hashCode(this.file_id) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Pins(file_id=", this.file_id, ", application_name=", this.application_name);
        m.append(")");
        return m.toString();
    }
}
