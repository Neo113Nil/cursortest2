package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c8l {
    public final String a;
    public final String b;

    public c8l(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8l)) {
            return false;
        }
        c8l c8lVar = (c8l) obj;
        return Intrinsics.d(this.a, c8lVar.a) && Intrinsics.d(this.b, c8lVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return hrg.s("PlayedItemUiData(coverUrl=", this.a, ", title=", this.b, ")");
    }
}
