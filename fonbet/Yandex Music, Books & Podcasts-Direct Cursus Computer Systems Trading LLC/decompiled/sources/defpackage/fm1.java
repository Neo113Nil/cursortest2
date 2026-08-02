package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fm1 implements ybb {
    public final String a;
    public final u51 b;
    public final ArrayList c;

    public fm1(String str, u51 u51Var, ArrayList arrayList) {
        this.a = str;
        this.b = u51Var;
        this.c = arrayList;
    }

    @Override // defpackage.ybb
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return Intrinsics.d(this.a, fm1Var.a) && this.b.equals(fm1Var.b) && this.c.equals(fm1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistTrailer(title=");
        sb.append(this.a);
        sb.append(", artistDomainItem=");
        sb.append(this.b);
        sb.append(", smartPreviews=");
        return vz1.t(sb, this.c, ")");
    }
}
