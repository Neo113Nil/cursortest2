package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes3.dex */
public final class rc {
    public final long a;

    public rc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc) && this.a == ((rc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.a, "PushMaxRequestSuccessEvent(lastUpdateTime=", ")");
    }
}
