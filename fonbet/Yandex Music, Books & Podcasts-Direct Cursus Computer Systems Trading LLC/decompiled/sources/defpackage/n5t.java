package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n5t implements o5t {
    public final String a;
    public final zsq b;

    public n5t(String str, zsq zsqVar) {
        str.getClass();
        zsqVar.getClass();
        this.a = str;
        this.b = zsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5t)) {
            return false;
        }
        n5t n5tVar = (n5t) obj;
        return Intrinsics.d(this.a, n5tVar.a) && Intrinsics.d(this.b, n5tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Stop(slideId=" + this.a + ", analyticsInfo=" + this.b + ")";
    }
}
