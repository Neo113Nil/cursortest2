package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jh5 {
    public final ArrayList a;
    public final fh5 b;
    public final hh5 c;
    public final String d;
    public final eh5 e;

    public jh5(ArrayList arrayList, fh5 fh5Var, hh5 hh5Var, String str, eh5 eh5Var) {
        this.a = arrayList;
        this.b = fh5Var;
        this.c = hh5Var;
        this.d = str;
        this.e = eh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5)) {
            return false;
        }
        jh5 jh5Var = (jh5) obj;
        return this.a.equals(jh5Var.a) && Intrinsics.d(this.b, jh5Var.b) && Intrinsics.d(this.c, jh5Var.c) && Intrinsics.d(this.d, jh5Var.d) && Intrinsics.d(this.e, jh5Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fh5 fh5Var = this.b;
        int hashCode2 = (hashCode + (fh5Var == null ? 0 : fh5Var.hashCode())) * 31;
        hh5 hh5Var = this.c;
        int hashCode3 = (hashCode2 + (hh5Var == null ? 0 : hh5Var.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        eh5 eh5Var = this.e;
        return hashCode4 + (eh5Var != null ? eh5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(title=" + this.a + ", button=" + this.b + ", image=" + this.c + ", bgColor=" + this.d + ", action=" + this.e + ")";
    }
}
