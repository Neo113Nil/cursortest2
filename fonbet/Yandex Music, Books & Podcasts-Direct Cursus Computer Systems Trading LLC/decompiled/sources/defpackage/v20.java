package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v20 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public v20(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return Intrinsics.d(this.a, v20Var.a) && Intrinsics.d(this.b, v20Var.b) && Intrinsics.d(this.c, v20Var.c) && this.d.equals(v20Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AlbumsChart(title=", this.a, ", description=", this.b, ", typeForFrom=");
        m.append(this.c);
        m.append(", albums=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
