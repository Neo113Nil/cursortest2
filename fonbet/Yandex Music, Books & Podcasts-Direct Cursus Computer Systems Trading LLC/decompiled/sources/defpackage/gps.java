package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gps {
    public final String a;
    public final List b;

    public gps(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gps)) {
            return false;
        }
        gps gpsVar = (gps) obj;
        return Intrinsics.d(this.a, gpsVar.a) && Intrinsics.d(this.b, gpsVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dfi.h("CollageData(background=", this.a, ", items=", ")", this.b);
    }
}
