package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n6u {
    public final List a;
    public final int b;

    public n6u(List list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6u)) {
            return false;
        }
        n6u n6uVar = (n6u) obj;
        return Intrinsics.d(this.a, n6uVar.a) && this.b == n6uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipQueueData(clips=" + this.a + ", focusedTrack=" + this.b + ")";
    }
}
