package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a4f {
    public final String a;
    public final String b;

    public a4f(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4f)) {
            return false;
        }
        a4f a4fVar = (a4f) obj;
        return Intrinsics.d(this.a, a4fVar.a) && Intrinsics.d(this.b, a4fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("JsonAnalyticsEvent(name=", this.a, ", jsonString=", this.b, ")");
    }
}
