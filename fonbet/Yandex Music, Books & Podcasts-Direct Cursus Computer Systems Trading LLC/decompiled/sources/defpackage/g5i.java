package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g5i {
    public final String a;
    public final List b;

    public g5i(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i)) {
            return false;
        }
        g5i g5iVar = (g5i) obj;
        return Intrinsics.d(this.a, g5iVar.a) && Intrinsics.d(this.b, g5iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("MetroStationUiData(title=", this.a, ", colors=", ")", this.b);
    }
}
