package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class uah {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final w231 c = new w231();
    public reu d;
    public int e;
    public int f;
    public long g;

    public final long a(c5p c5pVar, int i) {
        c5pVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
