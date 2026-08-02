package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nnw {
    public final Object a;
    public final String b;
    public final qqw c;
    public final long d;

    public nnw(Object obj, String str, qqw qqwVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = obj;
        this.b = str;
        this.c = qqwVar;
        this.d = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnw)) {
            return false;
        }
        nnw nnwVar = (nnw) obj;
        return Intrinsics.d(this.a, nnwVar.a) && Intrinsics.d(this.b, nnwVar.b) && this.c == nnwVar.c && this.d == nnwVar.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.d) + ((this.c.hashCode() + k5r.c((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "Emission(trigger=" + this.b + ", mode=" + this.c + ")";
    }
}
