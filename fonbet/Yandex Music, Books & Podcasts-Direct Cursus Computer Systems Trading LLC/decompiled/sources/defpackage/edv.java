package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class edv implements gdv {
    public final String a;
    public final Map b;

    public edv(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edv)) {
            return false;
        }
        edv edvVar = (edv) obj;
        return Intrinsics.d(this.a, edvVar.a) && Intrinsics.d(this.b, edvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadUrl(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
