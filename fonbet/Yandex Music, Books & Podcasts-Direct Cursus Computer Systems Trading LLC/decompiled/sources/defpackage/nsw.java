package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nsw {
    public final String a;
    public final Map b;

    public nsw(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsw)) {
            return false;
        }
        nsw nswVar = (nsw) obj;
        return Intrinsics.d(this.a, nswVar.a) && Intrinsics.d(this.b, nswVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YnisonTechEvent(eventName=" + this.a + ", params=" + this.b + ")";
    }
}
