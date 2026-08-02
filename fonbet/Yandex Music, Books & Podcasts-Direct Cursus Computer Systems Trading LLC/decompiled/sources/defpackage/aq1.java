package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class aq1 implements bq1 {
    public final String a;
    public final u51 b;
    public final ArrayList c;
    public final j4x d;

    public aq1(String str, u51 u51Var, ArrayList arrayList, j4x j4xVar) {
        this.a = str;
        this.b = u51Var;
        this.c = arrayList;
        this.d = j4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1Var = (aq1) obj;
        return Intrinsics.d(this.a, aq1Var.a) && this.b.equals(aq1Var.b) && this.c.equals(aq1Var.c) && Intrinsics.d(this.d, aq1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = dfi.b(this.c, (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
        j4x j4xVar = this.d;
        return b + (j4xVar != null ? j4xVar.hashCode() : 0);
    }

    public final String toString() {
        return "SingleArtist(headerTitle=" + this.a + ", artistDomainItem=" + this.b + ", concerts=" + this.c + ", analyticsPayload=" + this.d + ")";
    }
}
