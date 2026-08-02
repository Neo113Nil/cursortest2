package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yys {
    public final String a;
    public final String b;

    public yys(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yys)) {
            return false;
        }
        yys yysVar = (yys) obj;
        return Intrinsics.d(this.a, yysVar.a) && Intrinsics.d(this.b, yysVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("TrackOrderUiData(title=", this.a, ", subtitle=", this.b, ")");
    }
}
