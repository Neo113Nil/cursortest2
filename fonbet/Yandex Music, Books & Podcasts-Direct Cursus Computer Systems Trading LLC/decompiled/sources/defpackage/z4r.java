package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z4r {
    public final String a;
    public final String b;

    public z4r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4r)) {
            return false;
        }
        z4r z4rVar = (z4r) obj;
        return Intrinsics.d(this.a, z4rVar.a) && Intrinsics.d(this.b, z4rVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("ThemedUrl(darkThemeUrl=", this.a, ", lightThemeUrl=", this.b, ")");
    }
}
