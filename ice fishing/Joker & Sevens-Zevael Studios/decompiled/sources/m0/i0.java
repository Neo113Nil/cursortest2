package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 extends w0.w implements w2 {

    /* renamed from: h, reason: collision with root package name */
    public final oc.a f4610h;

    /* renamed from: i, reason: collision with root package name */
    public final r2 f4611i;

    /* renamed from: j, reason: collision with root package name */
    public h0 f4612j = new h0(w0.m.k().g());

    public i0(oc.a aVar, z0 z0Var) {
        this.f4610h = aVar;
        this.f4611i = z0Var;
    }

    @Override // w0.v
    public final w0.x a() {
        return this.f4612j;
    }

    @Override // w0.v
    public final void c(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4612j = (h0) xVar;
    }

    public final h0 g(h0 h0Var, w0.g gVar, boolean z10, oc.a aVar) {
        o0.e m10;
        r2 r2Var;
        int i10;
        h0 h0Var2 = h0Var;
        if (h0Var2.c(this, gVar)) {
            if (z10) {
                m10 = z.m();
                Object[] objArr = m10.f5134g;
                int i11 = m10.f5136i;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((q) objArr[i12]).b();
                }
                try {
                    s.z zVar = h0Var2.f4601e;
                    a5.c cVar = s2.f4755a;
                    u0.f fVar = (u0.f) cVar.s();
                    if (fVar == null) {
                        fVar = new u0.f();
                        cVar.K(fVar);
                    }
                    int i13 = fVar.f6671a;
                    Object[] objArr2 = zVar.f6363b;
                    int[] iArr = zVar.f6364c;
                    long[] jArr = zVar.f6362a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j3 = jArr[i14];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j3 & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        i10 = i15;
                                        w0.v vVar = (w0.v) objArr2[i18];
                                        fVar.f6671a = i13 + iArr[i18];
                                        oc.c e10 = gVar.e();
                                        if (e10 != null) {
                                            e10.invoke(vVar);
                                        }
                                    } else {
                                        i10 = i15;
                                    }
                                    j3 >>= i10;
                                    i17++;
                                    i15 = i10;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                        }
                    }
                    fVar.f6671a = i13;
                    Object[] objArr3 = m10.f5134g;
                    int i19 = m10.f5136i;
                    for (int i20 = 0; i20 < i19; i20++) {
                        ((q) objArr3[i20]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return h0Var2;
        }
        final s.z zVar2 = new s.z();
        a5.c cVar2 = s2.f4755a;
        final u0.f fVar2 = (u0.f) cVar2.s();
        if (fVar2 == null) {
            fVar2 = new u0.f();
            cVar2.K(fVar2);
        }
        final int i21 = fVar2.f6671a;
        m10 = z.m();
        Object[] objArr4 = m10.f5134g;
        int i22 = m10.f5136i;
        for (int i23 = 0; i23 < i22; i23++) {
            ((q) objArr4[i23]).b();
        }
        try {
            fVar2.f6671a = i21 + 1;
            Object i24 = w0.r.i(new oc.c() { // from class: m0.g0
                @Override // oc.c
                public final Object invoke(Object obj) {
                    if (obj == i0.this) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof w0.v) {
                        int i25 = fVar2.f6671a - i21;
                        s.z zVar3 = zVar2;
                        int d10 = zVar3.d(obj);
                        zVar3.h(Math.min(i25, d10 >= 0 ? zVar3.f6364c[d10] : Integer.MAX_VALUE), obj);
                    }
                    return ac.o.f277a;
                }
            }, aVar);
            fVar2.f6671a = i21;
            Object[] objArr5 = m10.f5134g;
            int i25 = m10.f5136i;
            for (int i26 = 0; i26 < i25; i26++) {
                ((q) objArr5[i26]).a();
            }
            Object obj = w0.m.f7580c;
            synchronized (obj) {
                try {
                    w0.g k3 = w0.m.k();
                    Object obj2 = h0Var2.f4602f;
                    if (obj2 == h0.f4598h || (r2Var = this.f4611i) == null || !r2Var.a(i24, obj2)) {
                        h0 h0Var3 = this.f4612j;
                        synchronized (obj) {
                            w0.x m11 = w0.m.m(h0Var3, this);
                            m11.a(h0Var3);
                            m11.f7620a = k3.g();
                            h0Var2 = (h0) m11;
                            h0Var2.f4601e = zVar2;
                            h0Var2.f4603g = h0Var2.d(this, k3);
                            h0Var2.f4602f = i24;
                        }
                        return h0Var2;
                    }
                    h0Var2.f4601e = zVar2;
                    h0Var2.f4603g = h0Var2.d(this, k3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u0.f fVar3 = (u0.f) s2.f4755a.s();
            if (fVar3 == null || fVar3.f6671a != 0) {
                return h0Var2;
            }
            w0.m.k().m();
            synchronized (obj) {
                w0.g k10 = w0.m.k();
                h0Var2.f4599c = k10.g();
                h0Var2.f4600d = k10.h();
                return h0Var2;
            }
        } finally {
            Object[] objArr6 = m10.f5134g;
            int i27 = m10.f5136i;
            for (int i28 = 0; i28 < i27; i28++) {
                ((q) objArr6[i28]).a();
            }
        }
    }

    @Override // m0.w2
    public final Object getValue() {
        oc.c e10 = w0.m.k().e();
        if (e10 != null) {
            e10.invoke(this);
        }
        w0.g k3 = w0.m.k();
        return g((h0) w0.m.j(this.f4612j, k3), k3, true, this.f4610h).f4602f;
    }

    public final h0 h() {
        w0.g k3 = w0.m.k();
        return g((h0) w0.m.j(this.f4612j, k3), k3, false, this.f4610h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        h0 h0Var = (h0) w0.m.i(this.f4612j);
        sb.append(h0Var.c(this, w0.m.k()) ? String.valueOf(h0Var.f4602f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
