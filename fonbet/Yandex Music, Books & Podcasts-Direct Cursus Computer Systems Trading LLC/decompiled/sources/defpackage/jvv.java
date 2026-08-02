package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jvv implements kvv {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final jyr d;

    public jvv(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = btf.b(new jvu(26, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvv)) {
            return false;
        }
        jvv jvvVar = (jvv) obj;
        return Intrinsics.d(this.a, jvvVar.a) && Intrinsics.d(this.b, jvvVar.b) && this.c.equals(jvvVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return vz1.t(f1d.m("Success(title=", this.a, ", description=", this.b, ", covers="), this.c, ")");
    }
}
