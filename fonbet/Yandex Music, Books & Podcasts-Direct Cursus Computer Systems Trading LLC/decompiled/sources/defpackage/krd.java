package defpackage;

import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class krd {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Object d;

    public static int b(int i, int i2) {
        int min;
        int i3 = i - i2;
        return (Math.abs(i3) <= 1000 || (min = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) ? i3 : i < i2 ? min : -min;
    }

    public synchronized void a(lio lioVar) {
        this.a = lioVar.a.c;
        ((TreeSet) this.d).add(lioVar);
    }

    public void c(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.d, this.a, i3);
            this.a += i3;
        }
    }

    public synchronized kio d(long j) {
        if (((TreeSet) this.d).isEmpty()) {
            return null;
        }
        lio lioVar = (lio) ((TreeSet) this.d).first();
        int i = lioVar.a.c;
        if (i != kio.a(this.b) && j < lioVar.b) {
            return null;
        }
        ((TreeSet) this.d).pollFirst();
        this.b = i;
        return lioVar.a;
    }

    public synchronized void e() {
        ((TreeSet) this.d).clear();
        this.c = false;
        this.b = -1;
        this.a = -1;
    }
}
