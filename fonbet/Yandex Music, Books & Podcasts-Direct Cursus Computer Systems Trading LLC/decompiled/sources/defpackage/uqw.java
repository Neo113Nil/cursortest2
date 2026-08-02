package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uqw {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final jyr e;

    static {
        new uqw(0L, 0L, CommonUrlParts.Values.FALSE_INTEGER, "-1");
    }

    public uqw(long j, long j2, String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = btf.b(new dxv(25, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqw)) {
            return false;
        }
        uqw uqwVar = (uqw) obj;
        return this.a.equals(uqwVar.a) && Intrinsics.d(this.b, uqwVar.b) && this.c == uqwVar.c && this.d == uqwVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + tlm.c(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("YnisonRemoteUpdateSignature(selfDeviceId=", this.a, ", deviceId=", this.b, ", timestampMs=");
        m.append(this.c);
        m.append(", randomVersionLong=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
