package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ohw {
    public final String a;
    public final String b;
    public final zsw c;

    public ohw(String str, String str2, zsw zswVar) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = zswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohw)) {
            return false;
        }
        ohw ohwVar = (ohw) obj;
        return this.a.equals(ohwVar.a) && Intrinsics.d(this.b, ohwVar.b) && this.c.equals(ohwVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TransitionIdentity(reason=", this.a, ", deviceId=", this.b, ", params=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
