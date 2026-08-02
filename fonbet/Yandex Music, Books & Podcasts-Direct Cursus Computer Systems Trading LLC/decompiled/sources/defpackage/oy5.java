package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oy5 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public oy5(String str, String str2, List list, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy5)) {
            return false;
        }
        oy5 oy5Var = (oy5) obj;
        return this.a.equals(oy5Var.a) && Intrinsics.d(this.b, oy5Var.b) && Intrinsics.d(this.c, oy5Var.c) && Intrinsics.d(this.d, oy5Var.d) && Intrinsics.d(this.e, oy5Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertPlaceUiData(place=", this.a, ", cityAddress=", this.b, ", metro=");
        m.append(this.c);
        m.append(", mapImage=");
        m.append(this.d);
        m.append(", mapUrl=");
        return su4.o(m, this.e, ")");
    }
}
