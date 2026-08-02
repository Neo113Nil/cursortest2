package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xft {
    public final String a;
    public final String b;
    public final boolean c;

    public xft(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xft)) {
            return false;
        }
        xft xftVar = (xft) obj;
        return Intrinsics.d(this.a, xftVar.a) && Intrinsics.d(this.b, xftVar.b) && this.c == xftVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("UiSmartDevice(deviceId=", this.a, ", name=", this.b, ", isAutoConnectEnabled="), this.c, ")");
    }
}
