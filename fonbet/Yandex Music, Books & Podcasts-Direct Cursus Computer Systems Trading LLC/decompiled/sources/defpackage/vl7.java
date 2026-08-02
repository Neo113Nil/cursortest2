package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class vl7 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final byt c = new byt();
    public cib d;
    public int e;
    public int f;
    public long g;

    public final long a(s2c s2cVar, int i) {
        s2cVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
