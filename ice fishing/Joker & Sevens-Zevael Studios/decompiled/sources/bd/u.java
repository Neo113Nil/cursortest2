package bd;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import yc.i0;
import yc.l1;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final dd.w f1154a = new dd.w("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final dd.w f1155b = new dd.w("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final dd.w f1156c = new dd.w("PENDING", 0);

    public static final e0 a(Object obj) {
        if (obj == null) {
            obj = cd.c.f1342b;
        }
        return new e0(obj);
    }

    public static final void b(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static final e c(e eVar) {
        return eVar instanceof c0 ? eVar : eVar instanceof d ? eVar : new d(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r1.a(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x0059, B:20:0x006d, B:22:0x0075, B:32:0x0048, B:34:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [ad.t] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ad.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(f fVar, ad.q qVar, boolean z10, hc.c cVar) {
        g gVar;
        int i10;
        ad.b bVar;
        ad.q qVar2;
        ad.b bVar2;
        f fVar2;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i11 = gVar.f1101l;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    gVar.f1101l = i11 - Integer.MIN_VALUE;
                    Object obj = gVar.f1100k;
                    i10 = gVar.f1101l;
                    CancellationException cancellationException = null;
                    gc.a aVar = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        ad.e eVar = qVar.f333j;
                        eVar.getClass();
                        bVar = new ad.b(eVar);
                        qVar = qVar;
                        gVar.f1096g = fVar;
                        gVar.f1097h = qVar;
                        gVar.f1098i = bVar;
                        gVar.f1099j = z10;
                        gVar.f1101l = 1;
                        obj = bVar.b(gVar);
                        if (obj != aVar) {
                        }
                    } else if (i10 == 1) {
                        z10 = gVar.f1099j;
                        bVar2 = gVar.f1098i;
                        ?? r82 = gVar.f1097h;
                        fVar2 = gVar.f1096g;
                        v6.a.W(obj);
                        qVar2 = r82;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = gVar.f1099j;
                        bVar2 = gVar.f1098i;
                        ?? r83 = gVar.f1097h;
                        fVar2 = gVar.f1096g;
                        v6.a.W(obj);
                        ad.q qVar3 = r83;
                        f fVar3 = fVar2;
                        bVar = bVar2;
                        fVar = fVar3;
                        qVar = qVar3;
                        gVar.f1096g = fVar;
                        gVar.f1097h = qVar;
                        gVar.f1098i = bVar;
                        gVar.f1099j = z10;
                        gVar.f1101l = 1;
                        obj = bVar.b(gVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        ad.b bVar3 = bVar;
                        fVar2 = fVar;
                        bVar2 = bVar3;
                        qVar2 = qVar;
                        if (((Boolean) obj).booleanValue()) {
                            if (z10) {
                                qVar2.a(null);
                            }
                            return ac.o.f277a;
                        }
                        Object c3 = bVar2.c();
                        gVar.f1096g = fVar2;
                        gVar.f1097h = qVar2;
                        gVar.f1098i = bVar2;
                        gVar.f1099j = z10;
                        gVar.f1101l = 2;
                        qVar3 = qVar2;
                    }
                }
            }
            if (i10 != 0) {
            }
        } finally {
        }
        gVar = new g(cVar);
        Object obj2 = gVar.f1100k;
        i10 = gVar.f1101l;
        CancellationException cancellationException2 = null;
        gc.a aVar2 = gc.a.f2559g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, oc.e eVar2, hc.c cVar) {
        m mVar;
        int i10;
        oc.e eVar3;
        pc.s sVar;
        cd.a e10;
        c cVar2;
        Object obj;
        dd.w wVar = cd.c.f1342b;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i11 = mVar.f1126k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f1126k = i11 - Integer.MIN_VALUE;
                Object obj2 = mVar.f1125j;
                i10 = mVar.f1126k;
                if (i10 != 0) {
                    v6.a.W(obj2);
                    pc.s sVar2 = new pc.s();
                    sVar2.f5683g = wVar;
                    c cVar3 = new c(eVar2, sVar2);
                    try {
                        mVar.f1122g = (hc.j) eVar2;
                        mVar.f1123h = sVar2;
                        mVar.f1124i = cVar3;
                        mVar.f1126k = 1;
                        Object c3 = eVar.c(cVar3, mVar);
                        Object obj3 = gc.a.f2559g;
                        if (c3 == obj3) {
                            return obj3;
                        }
                        eVar3 = eVar2;
                        sVar = sVar2;
                    } catch (cd.a e11) {
                        eVar3 = eVar2;
                        sVar = sVar2;
                        e10 = e11;
                        cVar2 = cVar3;
                        if (e10.f1334g != cVar2) {
                            throw e10;
                        }
                        obj = sVar.f5683g;
                        if (obj == wVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = mVar.f1124i;
                    sVar = mVar.f1123h;
                    eVar3 = (oc.e) mVar.f1122g;
                    try {
                        v6.a.W(obj2);
                    } catch (cd.a e12) {
                        e10 = e12;
                        if (e10.f1334g != cVar2) {
                        }
                        obj = sVar.f5683g;
                        if (obj == wVar) {
                        }
                    }
                }
                obj = sVar.f5683g;
                if (obj == wVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar3);
            }
        }
        mVar = new m(cVar);
        Object obj22 = mVar.f1125j;
        i10 = mVar.f1126k;
        if (i10 != 0) {
        }
        obj = sVar.f5683g;
        if (obj == wVar) {
        }
    }

    public static final q f(f8.c cVar, dd.e eVar, b0 b0Var, Float f10) {
        ad.i.f325a.getClass();
        ad.h hVar = ad.h.f323a;
        x4.c cVar2 = new x4.c(cVar, fc.j.f2348g);
        e0 a6 = a(f10);
        fc.i iVar = (fc.i) cVar2.f8291h;
        e eVar2 = (e) cVar2.f8290g;
        yc.z zVar = b0Var.equals(x.f1163a) ? yc.z.f8921g : yc.z.f8924j;
        o oVar = new o(b0Var, eVar2, a6, f10, null, 1);
        fc.i h10 = yc.a0.h(eVar.f(), iVar, true);
        fd.e eVar3 = i0.f8859a;
        if (h10 != eVar3 && h10.v(fc.e.f2347g) == null) {
            h10 = h10.d(eVar3);
        }
        yc.a l1Var = zVar == yc.z.f8922h ? new l1(h10, oVar) : new r1(h10, true);
        l1Var.f0(zVar, l1Var, oVar);
        return new q(a6);
    }
}
