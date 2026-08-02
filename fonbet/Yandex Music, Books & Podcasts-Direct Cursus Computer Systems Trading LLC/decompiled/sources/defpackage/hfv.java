package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hfv implements kfv {
    public final String a;
    public final String b;

    public hfv(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfv)) {
            return false;
        }
        hfv hfvVar = (hfv) obj;
        return Intrinsics.d(this.a, hfvVar.a) && Intrinsics.d(this.b, hfvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("Loaded(targetUrl=", this.a, ", authorizedUrl=", this.b, ")");
    }
}
