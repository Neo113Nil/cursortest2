package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ny5 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public ny5(String str, String str2, String str3, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny5)) {
            return false;
        }
        ny5 ny5Var = (ny5) obj;
        return Intrinsics.d(this.a, ny5Var.a) && Intrinsics.d(this.b, ny5Var.b) && Intrinsics.d(this.c, ny5Var.c) && Intrinsics.d(this.d, ny5Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertPlaceState(mapImageUrl=", this.a, ", place=", this.b, ", address=");
        m.append(this.c);
        m.append(", metroStations=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
