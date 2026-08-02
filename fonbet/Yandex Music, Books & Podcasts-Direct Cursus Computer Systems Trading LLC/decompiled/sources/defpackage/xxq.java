package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xxq {
    public final String a;
    public final String b;

    public xxq(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean a() {
        return !Intrinsics.d(this.a, CommonUrlParts.Values.FALSE_INTEGER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxq)) {
            return false;
        }
        xxq xxqVar = (xxq) obj;
        return Intrinsics.d(this.a, xxqVar.a) && Intrinsics.d(this.b, xxqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("SmallUserImpl(id=", this.a, ", login=", this.b, ")");
    }
}
