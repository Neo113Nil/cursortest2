package defpackage;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class q7z0 {
    public final ArrayList a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public q7z0(ArrayList arrayList, String str, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7z0)) {
            return false;
        }
        q7z0 q7z0Var = (q7z0) obj;
        return this.a.equals(q7z0Var.a) && jl40.l(this.b, q7z0Var.b) && this.c == q7z0Var.c && this.d == q7z0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
