package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k1w {
    public final ArrayList a;
    public final ArrayList b;
    public final g0w c;
    public final String d;
    public final axv e;

    public k1w(ArrayList arrayList, ArrayList arrayList2, g0w g0wVar, String str, axv axvVar) {
        str.getClass();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = g0wVar;
        this.d = str;
        this.e = axvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1w)) {
            return false;
        }
        k1w k1wVar = (k1w) obj;
        return this.a.equals(k1wVar.a) && this.b.equals(k1wVar.b) && Intrinsics.d(this.c, k1wVar.c) && Intrinsics.d(this.d, k1wVar.d) && this.e.equals(k1wVar.e);
    }

    public final int hashCode() {
        int b = dfi.b(this.b, this.a.hashCode() * 31, 31);
        g0w g0wVar = this.c;
        return this.e.hashCode() + k5r.c((b + (g0wVar == null ? 0 : g0wVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "WizardScreenState(artists=" + this.a + ", genres=" + this.b + ", progress=" + this.c + ", currentGenreId=" + this.d + ", recommendations=" + this.e + ")";
    }
}
