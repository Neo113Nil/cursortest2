package v;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f6810a = new j(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final k f6811b = new k(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final l f6812c = new l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final m f6813d = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final j f6814e = new j(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final k f6815f = new k(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final l f6816g = new l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final m f6817h = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static c a(float f10) {
        return new c(Float.valueOf(f10), i1.f6863a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0117 A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003b, blocks: (B:16:0x0036, B:18:0x0102, B:20:0x0117, B:25:0x013a, B:27:0x014a, B:29:0x0154, B:36:0x0161, B:37:0x0166, B:39:0x0167), top: B:15:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, e eVar, long j3, oc.c cVar, fc.d dVar) {
        r0 r0Var;
        int i10;
        gc.a aVar;
        pc.s sVar;
        i iVar2;
        i iVar3;
        pc.s sVar2;
        Object l10;
        oc.c cVar2;
        g gVar;
        g gVar2;
        Object obj;
        Object l11;
        e eVar2 = eVar;
        y1.g1 g1Var = y1.g1.f8550g;
        if (dVar instanceof r0) {
            r0Var = (r0) dVar;
            int i11 = r0Var.f6958l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f6958l = i11 - Integer.MIN_VALUE;
                r0 r0Var2 = r0Var;
                Object obj2 = r0Var2.f6957k;
                i10 = r0Var2.f6958l;
                aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj2);
                    Object b2 = eVar2.b(0L);
                    n f10 = eVar2.f(0L);
                    sVar = new pc.s();
                    if (j3 == Long.MIN_VALUE) {
                        try {
                            iVar2 = iVar;
                            try {
                                t0 t0Var = new t0(sVar, b2, eVar2, f10, iVar2, g(r0Var2.getContext()), cVar);
                                sVar2 = sVar;
                                try {
                                    r0Var2.f6953g = iVar2;
                                    r0Var2.f6954h = eVar2;
                                    r0Var2.f6955i = cVar;
                                    r0Var2.f6956j = sVar2;
                                    r0Var2.f6958l = 1;
                                    if (!eVar2.a()) {
                                        l10 = m0.z.p(r0Var2.getContext()).l(new g5.h(1, t0Var), r0Var2);
                                    } else {
                                        if (r0Var2.getContext().v(g1Var) != null) {
                                            throw new ClassCastException();
                                        }
                                        l10 = m0.z.p(r0Var2.getContext()).l(t0Var, r0Var2);
                                    }
                                    if (l10 != aVar) {
                                        iVar3 = iVar2;
                                        cVar2 = cVar;
                                    }
                                    return aVar;
                                } catch (CancellationException e10) {
                                    e = e10;
                                    iVar3 = iVar2;
                                    sVar = sVar2;
                                    gVar = (g) sVar.f5683g;
                                    if (gVar != null) {
                                        gVar.f6848i.setValue(Boolean.FALSE);
                                    }
                                    gVar2 = (g) sVar.f5683g;
                                    if (gVar2 != null && gVar2.f6846g == iVar3.f6859j) {
                                        iVar3.f6861l = false;
                                    }
                                    throw e;
                                }
                            } catch (CancellationException e11) {
                                e = e11;
                                iVar3 = iVar2;
                                gVar = (g) sVar.f5683g;
                                if (gVar != null) {
                                }
                                gVar2 = (g) sVar.f5683g;
                                if (gVar2 != null) {
                                    iVar3.f6861l = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e12) {
                            e = e12;
                            iVar2 = iVar;
                        }
                    } else {
                        sVar2 = sVar;
                        try {
                            g gVar3 = new g(b2, eVar2.d(), f10, j3, eVar2.e(), j3, new s0(iVar, 1));
                            f(gVar3, j3, g(r0Var2.getContext()), eVar2, iVar, cVar);
                            sVar2.f5683g = gVar3;
                            iVar3 = iVar;
                            eVar2 = eVar;
                            cVar2 = cVar;
                        } catch (CancellationException e13) {
                            e = e13;
                            iVar3 = iVar;
                            sVar = sVar2;
                            gVar = (g) sVar.f5683g;
                            if (gVar != null) {
                            }
                            gVar2 = (g) sVar.f5683g;
                            if (gVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    sVar = sVar2;
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = r0Var2.f6956j;
                    cVar2 = r0Var2.f6955i;
                    eVar2 = r0Var2.f6954h;
                    iVar3 = r0Var2.f6953g;
                    try {
                        v6.a.W(obj2);
                    } catch (CancellationException e14) {
                        e = e14;
                        gVar = (g) sVar.f5683g;
                        if (gVar != null) {
                        }
                        gVar2 = (g) sVar.f5683g;
                        if (gVar2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = sVar.f5683g;
                    pc.j.b(obj);
                    if (((Boolean) ((g) obj).f6848i.getValue()).booleanValue()) {
                        return ac.o.f277a;
                    }
                    pc.s sVar3 = sVar;
                    oc.c cVar3 = cVar2;
                    e eVar3 = eVar2;
                    i iVar4 = iVar3;
                    try {
                        u0 u0Var = new u0(sVar3, g(r0Var2.getContext()), eVar3, iVar4, cVar3);
                        sVar = sVar3;
                        eVar2 = eVar3;
                        iVar3 = iVar4;
                        cVar2 = cVar3;
                        r0Var2.f6953g = iVar3;
                        r0Var2.f6954h = eVar2;
                        r0Var2.f6955i = cVar2;
                        r0Var2.f6956j = sVar;
                        r0Var2.f6958l = 2;
                        if (!eVar2.a()) {
                            l11 = m0.z.p(r0Var2.getContext()).l(new g5.h(1, u0Var), r0Var2);
                        } else {
                            if (r0Var2.getContext().v(g1Var) != null) {
                                throw new ClassCastException();
                            }
                            l11 = m0.z.p(r0Var2.getContext()).l(u0Var, r0Var2);
                        }
                    } catch (CancellationException e15) {
                        e = e15;
                        sVar = sVar3;
                        iVar3 = iVar4;
                        gVar = (g) sVar.f5683g;
                        if (gVar != null) {
                        }
                        gVar2 = (g) sVar.f5683g;
                        if (gVar2 != null) {
                        }
                        throw e;
                    }
                } while (l11 != aVar);
                return aVar;
            }
        }
        r0Var = new r0(dVar);
        r0 r0Var22 = r0Var;
        Object obj22 = r0Var22.f6957k;
        i10 = r0Var22.f6958l;
        aVar = gc.a.f2559g;
        if (i10 != 0) {
        }
        do {
            obj = sVar.f5683g;
            pc.j.b(obj);
            if (((Boolean) ((g) obj).f6848i.getValue()).booleanValue()) {
            }
        } while (l11 != aVar);
        return aVar;
    }

    public static final c0 c(e0 e0Var, b0 b0Var, m0.r rVar) {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        x4.s sVar = i1.f6863a;
        Object M = rVar.M();
        m0.z0 z0Var = m0.l.f4646a;
        if (M == z0Var) {
            M = new c0(e0Var, valueOf, valueOf2, b0Var);
            rVar.i0(M);
        }
        c0 c0Var = (c0) M;
        boolean h10 = rVar.h(b0Var);
        Object M2 = rVar.M();
        if (h10 || M2 == z0Var) {
            M2 = new f0(valueOf, c0Var, valueOf2, b0Var);
            rVar.i0(M2);
        }
        m0.z.g((oc.a) M2, rVar);
        boolean h11 = rVar.h(e0Var);
        Object M3 = rVar.M();
        if (h11 || M3 == z0Var) {
            M3 = new b0.l0(8, e0Var, c0Var);
            rVar.i0(M3);
        }
        m0.z.d(c0Var, (oc.c) M3, rVar);
        return c0Var;
    }

    public static Object d(i iVar, Float f10, o0 o0Var, hc.j jVar) {
        Object b2 = b(iVar, new w0(o0Var, iVar.f6856g, iVar.f6857h.getValue(), f10, iVar.f6858i), iVar.f6859j, v0.f6982h, jVar);
        return b2 == gc.a.f2559g ? b2 : ac.o.f277a;
    }

    public static final n e(n nVar) {
        n c3 = nVar.c();
        int b2 = c3.b();
        for (int i10 = 0; i10 < b2; i10++) {
            c3.e(i10, nVar.a(i10));
        }
        return c3;
    }

    public static final void f(g gVar, long j3, float f10, e eVar, i iVar, oc.c cVar) {
        long c3 = f10 == 0.0f ? eVar.c() : (long) ((j3 - gVar.f6842c) / f10);
        gVar.f6846g = j3;
        gVar.f6844e.setValue(eVar.b(c3));
        gVar.f6845f = eVar.f(c3);
        if (eVar.g(c3)) {
            gVar.f6847h = gVar.f6846g;
            gVar.f6848i.setValue(Boolean.FALSE);
        }
        k(gVar, iVar);
        cVar.invoke(gVar);
    }

    public static final float g(fc.i iVar) {
        y0.o oVar = (y0.o) iVar.v(y0.c.f8432t);
        float u10 = oVar != null ? oVar.u() : 1.0f;
        if (u10 >= 0.0f) {
            return u10;
        }
        m0.b("negative scale factor");
        return u10;
    }

    public static b0 h(u uVar, int i10) {
        return new b0(uVar, (i10 & 2) != 0 ? 1 : 2, 0);
    }

    public static o0 i(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new o0(f10, f11, obj);
    }

    public static h1 j(int i10, int i11, v vVar) {
        int i12 = (i11 & 2) != 0 ? 0 : 90;
        if ((i11 & 4) != 0) {
            vVar = w.f7002a;
        }
        return new h1(i10, i12, vVar);
    }

    public static final void k(g gVar, i iVar) {
        iVar.f6857h.setValue(gVar.f6844e.getValue());
        n nVar = iVar.f6858i;
        n nVar2 = gVar.f6845f;
        int b2 = nVar.b();
        for (int i10 = 0; i10 < b2; i10++) {
            nVar.e(i10, nVar2.a(i10));
        }
        iVar.f6860k = gVar.f6847h;
        iVar.f6859j = gVar.f6846g;
        iVar.f6861l = ((Boolean) gVar.f6848i.getValue()).booleanValue();
    }
}
