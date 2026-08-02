package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lfg extends qu2 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfg(Throwable th) {
        super(false);
        th.getClass();
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lfg)) {
            return false;
        }
        lfg lfgVar = (lfg) obj;
        return this.a == lfgVar.a && Intrinsics.d(this.b, lfgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + Boolean.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(endOfPaginationReached=");
        sb.append(this.a);
        sb.append(", error=");
        return f1d.k(sb, this.b, ')');
    }
}
