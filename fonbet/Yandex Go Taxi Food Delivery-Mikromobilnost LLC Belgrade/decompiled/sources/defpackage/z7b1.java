package defpackage;

/* loaded from: classes11.dex */
public final class z7b1 extends wbb1 {
    public final int a;
    public final long b;

    public z7b1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.wbb1
    public final int a() {
        return this.a;
    }

    @Override // defpackage.wbb1
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wbb1)) {
            return false;
        }
        wbb1 wbb1Var = (wbb1) obj;
        return this.a == wbb1Var.a() && this.b == wbb1Var.b();
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ (i * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.a + ", eventTimestamp=" + this.b + "}";
    }
}
