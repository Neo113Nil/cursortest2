package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d1t {
    public final CharSequence a;
    public final CharSequence b;

    public d1t(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1t)) {
            return false;
        }
        d1t d1tVar = (d1t) obj;
        return Intrinsics.d(this.a, d1tVar.a) && Intrinsics.d(this.b, d1tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackShareInfo(title=" + ((Object) this.a) + ", subtitle=" + ((Object) this.b) + ")";
    }
}
