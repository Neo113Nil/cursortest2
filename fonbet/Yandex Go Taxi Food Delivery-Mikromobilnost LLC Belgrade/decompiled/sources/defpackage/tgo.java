package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class tgo implements xyl0 {
    public final a a;
    public long[] c;
    public boolean w;
    public bho x;
    public boolean y;
    public int z;
    public final ogo b = new ogo();
    public long A = -9223372036854775807L;

    public tgo(bho bhoVar, a aVar, boolean z) {
        this.a = aVar;
        this.x = bhoVar;
        this.c = bhoVar.b;
        a(bhoVar, z);
    }

    public final void a(bho bhoVar, boolean z) {
        int i = this.z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.w = z;
        this.x = bhoVar;
        long[] jArr = bhoVar.b;
        this.c = jArr;
        long j3 = this.A;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.z = tw21.a(jArr, j2, false);
            }
        } else {
            int a = tw21.a(jArr, j3, true);
            this.z = a;
            if (this.w && a == this.c.length) {
                j = j3;
            }
            this.A = j;
        }
    }

    @Override // defpackage.xyl0
    public final void b() {
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        return true;
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        int i2 = this.z;
        boolean z = i2 == this.c.length;
        if (z && !this.w) {
            nygVar.a = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.y) {
            o7sVar.b = this.a;
            this.y = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.z = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.b.a(this.x.a[i2]);
            nygVar.f(a.length);
            nygVar.w.put(a);
        }
        nygVar.y = this.c[i2];
        nygVar.a = 1;
        return -4;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        int max = Math.max(this.z, tw21.a(this.c, j, true));
        int i = max - this.z;
        this.z = max;
        return i;
    }
}
