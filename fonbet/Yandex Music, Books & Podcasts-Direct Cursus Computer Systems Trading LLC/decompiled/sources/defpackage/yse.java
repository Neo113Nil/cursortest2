package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class yse {

    @NotNull
    public static final xse Companion = new xse();
    public static final t9f[] d = {new qy0(cqe.a, 0), null, null};
    public static final yse e = new yse();
    public final List a;
    public final bte b;
    public final String c;

    public yse(int i, List list, bte bteVar, String str) {
        this.a = (i & 1) == 0 ? c5b.a : list;
        if ((i & 2) == 0) {
            this.b = new bte();
        } else {
            this.b = bteVar;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yse)) {
            return false;
        }
        yse yseVar = (yse) obj;
        return Intrinsics.d(this.a, yseVar.a) && Intrinsics.d(this.b, yseVar.b) && Intrinsics.d(this.c, yseVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAbConfig(testIds=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", slots=");
        return dfi.i(sb, this.c, ')');
    }

    public yse() {
        c5b c5bVar = c5b.a;
        bte bteVar = new bte();
        c5bVar.getClass();
        this.a = c5bVar;
        this.b = bteVar;
        this.c = "";
    }
}
