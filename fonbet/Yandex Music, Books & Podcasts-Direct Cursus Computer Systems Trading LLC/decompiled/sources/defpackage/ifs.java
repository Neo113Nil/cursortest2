package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ifs {
    public final String a;
    public final String b;

    public ifs(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifs)) {
            return false;
        }
        ifs ifsVar = (ifs) obj;
        return Intrinsics.d(this.a, ifsVar.a) && Intrinsics.d(this.b, ifsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("ThemedUrl(darkThemeUrl=", this.a, ", lightThemeUrl=", this.b, ")");
    }
}
