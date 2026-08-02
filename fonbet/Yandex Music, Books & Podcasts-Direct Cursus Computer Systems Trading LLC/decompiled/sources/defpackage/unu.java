package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class unu implements xnu {
    public final s9p a;
    public final String b;

    public unu(s9p s9pVar, String str) {
        s9pVar.getClass();
        str.getClass();
        this.a = s9pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unu)) {
            return false;
        }
        unu unuVar = (unu) obj;
        return Intrinsics.d(this.a, unuVar.a) && Intrinsics.d(this.b, unuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithPassiveSessionId(expectedSeeds=" + this.a + ", rotorSessionId=" + this.b + ")";
    }
}
