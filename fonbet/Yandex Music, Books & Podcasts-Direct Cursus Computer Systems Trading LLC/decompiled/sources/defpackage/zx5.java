package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zx5 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final ly5 e;

    public zx5(String str, String str2, String str3, ArrayList arrayList, ly5 ly5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = ly5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx5)) {
            return false;
        }
        zx5 zx5Var = (zx5) obj;
        return this.a.equals(zx5Var.a) && Intrinsics.d(this.b, zx5Var.b) && Intrinsics.d(this.c, zx5Var.c) && Intrinsics.d(this.d, zx5Var.d) && Intrinsics.d(this.e, zx5Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ly5 ly5Var = this.e;
        return hashCode4 + (ly5Var != null ? ly5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertPlace(place=", this.a, ", city=", this.b, ", address=");
        m.append(this.c);
        m.append(", metro=");
        m.append(this.d);
        m.append(", map=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
