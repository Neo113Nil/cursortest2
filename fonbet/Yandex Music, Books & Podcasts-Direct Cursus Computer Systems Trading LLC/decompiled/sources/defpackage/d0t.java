package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0t implements a0q, e0t {
    public final s9p a;
    public final boolean b;

    public d0t(s9p s9pVar, boolean z) {
        s9pVar.getClass();
        this.a = s9pVar;
        this.b = z;
        if (s9pVar.a.isEmpty()) {
            su4.s(2, null, "Developer error the list of seeds should not be empty", null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0t)) {
            return false;
        }
        d0t d0tVar = (d0t) obj;
        return Intrinsics.d(this.a, d0tVar.a) && this.b == d0tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackRadioContentId(seeds=" + this.a + ", interactive=" + this.b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0t(List list, boolean z) {
        this(o8g.E(list), z);
        list.getClass();
    }
}
