package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0t {
    public final gxc a;

    public c0t(gxc gxcVar) {
        gxcVar.getClass();
        this.a = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0t) && Intrinsics.d(this.a, ((c0t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrackRadioAnalyticsOptions(fromData=" + this.a + ")";
    }
}
