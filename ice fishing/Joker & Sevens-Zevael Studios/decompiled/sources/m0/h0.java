package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 extends w0.x {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4598h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f4599c;

    /* renamed from: d, reason: collision with root package name */
    public int f4600d;

    /* renamed from: e, reason: collision with root package name */
    public s.z f4601e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4602f;

    /* renamed from: g, reason: collision with root package name */
    public int f4603g;

    public h0(long j3) {
        super(j3);
        s.z zVar = s.k0.f6300a;
        pc.j.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f4601e = zVar;
        this.f4602f = f4598h;
    }

    @Override // w0.x
    public final void a(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        h0 h0Var = (h0) xVar;
        this.f4601e = h0Var.f4601e;
        this.f4602f = h0Var.f4602f;
        this.f4603g = h0Var.f4603g;
    }

    @Override // w0.x
    public final w0.x b(long j3) {
        return new h0(j3);
    }

    public final boolean c(i0 i0Var, w0.g gVar) {
        boolean z10;
        boolean z11;
        Object obj = w0.m.f7580c;
        synchronized (obj) {
            z10 = true;
            if (this.f4599c == gVar.g()) {
                if (this.f4600d == gVar.h()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (this.f4602f == f4598h || (z11 && this.f4603g != d(i0Var, gVar))) {
            z10 = false;
        }
        if (!z10 || !z11) {
            return z10;
        }
        synchronized (obj) {
            this.f4599c = gVar.g();
            this.f4600d = gVar.h();
        }
        return z10;
    }

    public final int d(i0 i0Var, w0.g gVar) {
        s.z zVar;
        int i10;
        long[] jArr;
        int i11;
        long[] jArr2;
        int i12;
        int i13;
        w0.x g8;
        synchronized (w0.m.f7580c) {
            zVar = this.f4601e;
        }
        int i14 = 7;
        if (zVar.f6366e == 0) {
            return 7;
        }
        o0.e m10 = z.m();
        Object[] objArr = m10.f5134g;
        int i15 = m10.f5136i;
        for (int i16 = 0; i16 < i15; i16++) {
            ((q) objArr[i16]).b();
        }
        try {
            Object[] objArr2 = zVar.f6363b;
            int[] iArr = zVar.f6364c;
            long[] jArr3 = zVar.f6362a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i10 = 7;
                int i17 = 0;
                while (true) {
                    long j3 = jArr3[i17];
                    if ((((~j3) << i14) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j3 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                Object obj = objArr2[i21];
                                i12 = i14;
                                int i22 = iArr[i21];
                                i13 = i18;
                                w0.v vVar = (w0.v) obj;
                                if (i22 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (vVar instanceof i0) {
                                        try {
                                            i0 i0Var2 = (i0) vVar;
                                            g8 = i0Var2.g((h0) w0.m.j(i0Var2.f4612j, gVar), gVar, false, i0Var2.f4610h);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = m10.f5134g;
                                            int i23 = m10.f5136i;
                                            for (int i24 = 0; i24 < i23; i24++) {
                                                ((q) objArr3[i24]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g8 = w0.m.j(vVar.a(), gVar);
                                    }
                                    jArr2 = jArr3;
                                    i10 = (((i10 * 31) + System.identityHashCode(g8)) * 31) + Long.hashCode(g8.f7620a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i12 = i14;
                                i13 = i18;
                            }
                            j3 >>= i13;
                            i20++;
                            i14 = i12;
                            jArr3 = jArr2;
                            i18 = i13;
                        }
                        jArr = jArr3;
                        i11 = i14;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i11 = i14;
                    }
                    if (i17 == length) {
                        i14 = i10;
                        break;
                    }
                    i17++;
                    i14 = i11;
                    jArr3 = jArr;
                }
            }
            i10 = i14;
            Object[] objArr4 = m10.f5134g;
            int i25 = m10.f5136i;
            for (int i26 = 0; i26 < i25; i26++) {
                ((q) objArr4[i26]).a();
            }
            return i10;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
