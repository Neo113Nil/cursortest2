package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class sku implements tku {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final t2c a;
    public final azs b;
    public final bh3 c;
    public final int d;
    public final byte[] e;
    public final d7k f;
    public final int g;
    public final dsc h;
    public int i;
    public long j;
    public int k;
    public long l;

    public sku(t2c t2cVar, azs azsVar, bh3 bh3Var) {
        this.a = t2cVar;
        this.b = azsVar;
        this.c = bh3Var;
        int i = bh3Var.c;
        int max = Math.max(1, i / 10);
        this.g = max;
        d7k d7kVar = new d7k((byte[]) bh3Var.f);
        d7kVar.o();
        int o = d7kVar.o();
        this.d = o;
        int i2 = bh3Var.b;
        int i3 = bh3Var.d;
        int i4 = (((i3 - (i2 * 4)) * 8) / (bh3Var.e * i2)) + 1;
        if (o != i4) {
            throw r7k.a(null, "Expected frames per block: " + i4 + "; got: " + o);
        }
        int f = dvt.f(max, o);
        this.e = new byte[f * i3];
        this.f = new d7k(o * 2 * i2 * f);
        int i5 = ((i3 * i) * 8) / o;
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("audio/raw");
        bscVar.h = i5;
        bscVar.i = i5;
        bscVar.n = max * 2 * i2;
        bscVar.C = i2;
        bscVar.D = i;
        bscVar.E = 2;
        this.h = new dsc(bscVar);
    }

    @Override // defpackage.tku
    public final void a(int i, long j) {
        this.a.E(new wku(this.c, this.d, i, j));
        this.b.d(this.h);
    }

    @Override // defpackage.tku
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // defpackage.tku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(defpackage.s2c r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sku.c(s2c, long):boolean");
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        bh3 bh3Var = this.c;
        long j3 = bh3Var.c;
        int i2 = dvt.a;
        long g0 = j + dvt.g0(j2, 1000000L, j3, RoundingMode.DOWN);
        int i3 = i * 2 * bh3Var.b;
        this.b.a(g0, 1, i3, this.k - i3, null);
        this.l += i;
        this.k -= i3;
    }
}
