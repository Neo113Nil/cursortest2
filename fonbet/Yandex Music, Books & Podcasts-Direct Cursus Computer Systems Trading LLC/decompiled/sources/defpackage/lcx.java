package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lcx extends wcx {
    public final long a;

    public lcx(long j) {
        this.a = j;
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d(this.a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wcx wcxVar = (wcx) obj;
        if (a() != wcxVar.a()) {
            return a() - wcxVar.a();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((lcx) wcxVar).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && lcx.class == obj.getClass() && this.a == ((lcx) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
