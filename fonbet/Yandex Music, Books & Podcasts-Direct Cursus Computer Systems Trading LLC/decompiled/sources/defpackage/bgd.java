package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bgd extends dgd {
    public final ced c;
    public final boolean d;

    public bgd(ced cedVar, boolean z) {
        super(true, cedVar.b.getDeviceId());
        this.c = cedVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgd)) {
            return false;
        }
        bgd bgdVar = (bgd) obj;
        return Intrinsics.d(this.c, bgdVar.c) && this.d == bgdVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Connected(connection=" + this.c + ", interactive=" + this.d + ")";
    }
}
