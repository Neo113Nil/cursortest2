package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class lvg extends ivg implements hq4 {

    @NotNull
    public static final kvg e = new kvg(null);

    public final boolean equals(Object obj) {
        if (!(obj instanceof lvg)) {
            return false;
        }
        if (isEmpty() && ((lvg) obj).isEmpty()) {
            return true;
        }
        lvg lvgVar = (lvg) obj;
        return this.a == lvgVar.a && this.b == lvgVar.b;
    }

    @Override // defpackage.hq4
    public final Comparable g() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.hq4
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.hq4
    public final Comparable m() {
        return Long.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
