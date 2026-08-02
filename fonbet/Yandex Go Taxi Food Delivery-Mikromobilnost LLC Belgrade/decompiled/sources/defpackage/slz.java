package defpackage;

/* loaded from: classes10.dex */
public final class slz {
    public int a;
    public int b;
    public final long[] c;
    public final int d;

    public slz() {
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.a = 0;
        this.b = 0;
        this.c = new long[highestOneBit];
        this.d = highestOneBit - 1;
    }

    public final long a() {
        int i = this.b;
        if (i == 0) {
            ny61.p();
            return 0L;
        }
        int i2 = this.a;
        long j = this.c[i2];
        this.a = (i2 + 1) & this.d;
        this.b = i - 1;
        return j;
    }
}
