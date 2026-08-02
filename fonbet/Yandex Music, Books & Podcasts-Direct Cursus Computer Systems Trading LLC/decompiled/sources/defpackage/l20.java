package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l20 implements ybb {
    public final String a;
    public final lt b;
    public final ArrayList c;

    public l20(lt ltVar, String str, ArrayList arrayList) {
        this.a = str;
        this.b = ltVar;
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
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return Intrinsics.d(this.a, l20Var.a) && this.b.equals(l20Var.b) && this.c.equals(l20Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumTrailer(title=");
        sb.append(this.a);
        sb.append(", albumDomainItem=");
        sb.append(this.b);
        sb.append(", smartPreviews=");
        return vz1.t(sb, this.c, ")");
    }
}
