package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n01 {
    public final u51 a;
    public final List b;
    public final fk1 c;
    public final String d;
    public final List e;
    public final List f;

    public n01(u51 u51Var, ArrayList arrayList, fk1 fk1Var, String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = u51Var;
        this.b = arrayList;
        this.c = fk1Var;
        this.d = str;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.a.equals(n01Var.a) && Intrinsics.d(this.b, n01Var.b) && Intrinsics.d(this.c, n01Var.c) && Intrinsics.d(this.d, n01Var.d) && Intrinsics.d(this.e, n01Var.e) && Intrinsics.d(this.f, n01Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        fk1 fk1Var = this.c;
        int hashCode3 = (hashCode2 + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31;
        String str = this.d;
        return this.f.hashCode() + k5r.d((hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ArtistAboutDialogData(artist=" + this.a + ", donations=" + this.b + ", stats=" + this.c + ", description=" + this.d + ", links=" + this.e + ", covers=" + this.f + ")";
    }
}
