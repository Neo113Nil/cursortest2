package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yve {
    public final String a;
    public final String b;
    public final xve c;
    public final long d;
    public final boolean e;

    public yve(String str, String str2, xve xveVar, long j, boolean z) {
        str.getClass();
        str2.getClass();
        xveVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = xveVar;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yve)) {
            return false;
        }
        yve yveVar = (yve) obj;
        return Intrinsics.d(this.a, yveVar.a) && Intrinsics.d(this.b, yveVar.b) && Intrinsics.d(this.c, yveVar.c) && this.d == yveVar.d && this.e == yveVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + tlm.c(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("InternalSplashScreen(screenId=", this.a, ", data=", this.b, ", rule=");
        m.append(this.c);
        m.append(", duration=");
        m.append(this.d);
        m.append(", isVibrationEnabled=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
