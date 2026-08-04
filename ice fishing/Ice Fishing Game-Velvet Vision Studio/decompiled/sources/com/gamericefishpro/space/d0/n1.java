package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t0.r1;
import com.gamericefishpro.space.t0.u1;
import com.gamericefishpro.space.t0.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n1(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:267:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d3 A[Catch: all -> 0x01c6, LOOP:4: B:81:0x0197->B:98:0x01d3, LOOP_END, TryCatch #0 {all -> 0x01c6, blocks: (B:74:0x0174, B:76:0x0184, B:78:0x018a, B:81:0x0197, B:83:0x01a3, B:85:0x01ad, B:87:0x01b3, B:89:0x01bc, B:94:0x01c8, B:95:0x01cb, B:98:0x01d3, B:108:0x01f8, B:99:0x01d6, B:100:0x01dc, B:102:0x01e2, B:104:0x01ea, B:107:0x01f4), top: B:245:0x0174 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0084, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.e1.f fVar;
        Collection collectionF;
        Object objA;
        char c;
        int i = 6;
        char c2 = 7;
        Object objY = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.c3.i(((com.gamericefishpro.space.h1.e) this.e).a(0L, ((com.gamericefishpro.space.c3.k) obj).a, (com.gamericefishpro.space.c3.l) obj2));
            case 1:
                com.gamericefishpro.space.e1.b bVar = (com.gamericefishpro.space.e1.b) obj;
                List list = (List) ((Function2) this.e).invoke(bVar, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (fVar = bVar.e) != null && !fVar.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 2:
                com.gamericefishpro.space.f1.y yVar = (com.gamericefishpro.space.f1.y) this.e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = yVar.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionF = collection;
                    } else if (obj4 instanceof Set) {
                        collectionF = com.gamericefishpro.space.ph.x.f(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            com.gamericefishpro.space.t0.s.b("Unexpected notification");
                            throw new com.gamericefishpro.space.oh.e();
                        }
                        collectionF = CollectionsKt.F((Collection) obj4, com.gamericefishpro.space.ph.w.c(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, collectionF)) {
                            if (yVar.b()) {
                                yVar.a.invoke(new com.gamericefishpro.space.a3.b(i, yVar));
                            }
                            return Unit.a;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                y3.b((com.gamericefishpro.space.g5.p) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.h0.n.c((com.gamericefishpro.space.b1.h) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(7));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                d5.c((com.gamericefishpro.space.f5.d0) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.hj.c.b((com.gamericefishpro.space.d7.g) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.b9.a.a((com.gamericefishpro.space.h1.m) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(7));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.n7.q qVar = (com.gamericefishpro.space.n7.q) this.e;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) obj2;
                int iIntValue2 = num2.intValue();
                com.gamericefishpro.space.i7.c cVar = qVar.g;
                com.gamericefishpro.space.n7.g gVar = (com.gamericefishpro.space.n7.g) qVar.c.d.getValue();
                if (!gVar.h && !gVar.k && !gVar.l) {
                    com.gamericefishpro.space.i7.d dVar = gVar.q;
                    if (dVar != null) {
                        int iOrdinal = dVar.ordinal();
                        if (iOrdinal == 0) {
                            com.gamericefishpro.space.qh.m mVar = new com.gamericefishpro.space.qh.m();
                            int i3 = iIntValue - 1;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            int i4 = iIntValue + 1;
                            cVar.getClass();
                            if (i4 > 6) {
                                i4 = 6;
                            }
                            if (i3 <= i4) {
                                while (true) {
                                    int i5 = iIntValue2 - 1;
                                    if (i5 < 0) {
                                        i5 = 0;
                                    }
                                    int i6 = iIntValue2 + 1;
                                    if (i6 > 6) {
                                        i6 = 6;
                                    }
                                    if (i5 <= i6) {
                                        while (true) {
                                            mVar.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i5)));
                                            if (i5 != i6) {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (i3 != i4) {
                                        i3++;
                                    }
                                }
                            }
                            objA = com.gamericefishpro.space.ph.q0.a(mVar);
                        } else if (iOrdinal == 1) {
                            cVar.getClass();
                            IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, 7);
                            ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(intRangeF, 10));
                            Iterator it = intRangeF.iterator();
                            while (((com.gamericefishpro.space.ji.c) it).i) {
                                arrayList.add(new Pair(num, Integer.valueOf(((com.gamericefishpro.space.ph.j0) it).nextInt())));
                            }
                            objA = CollectionsKt.O(arrayList);
                        } else {
                            if (iOrdinal != 2) {
                                throw new com.gamericefishpro.space.oh.k();
                            }
                            cVar.getClass();
                            IntRange intRangeF2 = com.gamericefishpro.space.ji.f.f(0, 7);
                            ArrayList arrayList2 = new ArrayList(com.gamericefishpro.space.ph.y.j(intRangeF2, 10));
                            Iterator it2 = intRangeF2.iterator();
                            while (((com.gamericefishpro.space.ji.c) it2).i) {
                                arrayList2.add(new Pair(Integer.valueOf(((com.gamericefishpro.space.ph.j0) it2).nextInt()), num2));
                            }
                            objA = CollectionsKt.O(arrayList2);
                        }
                        qVar.e(new q0(19, dVar, objA));
                        com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar), com.gamericefishpro.space.pi.k0.a, new com.gamericefishpro.space.n7.o(qVar, dVar, iIntValue, iIntValue2, null), 2);
                    } else {
                        Pair pair = gVar.g;
                        if (pair == null) {
                            com.gamericefishpro.space.i7.a[] aVarArr = (com.gamericefishpro.space.i7.a[]) com.gamericefishpro.space.ph.v.t(iIntValue, (com.gamericefishpro.space.i7.a[][]) cVar.d);
                            if ((aVarArr != null ? (com.gamericefishpro.space.i7.a) com.gamericefishpro.space.ph.v.t(iIntValue2, aVarArr) : null) != null) {
                                qVar.e(new com.gamericefishpro.space.n7.h(iIntValue, iIntValue2, 0));
                            }
                        } else if (((Number) pair.d).intValue() == iIntValue && ((Number) pair.e).intValue() == iIntValue2) {
                            qVar.e(new com.gamericefishpro.space.j7.c(21));
                        } else {
                            qVar.e(new com.gamericefishpro.space.j7.c(22));
                            com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar), com.gamericefishpro.space.pi.k0.a, new com.gamericefishpro.space.n7.m(qVar, pair, iIntValue, iIntValue2, gVar, null), 2);
                        }
                    }
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                a4.a((com.gamericefishpro.space.d7.l) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 10:
                com.gamericefishpro.space.u6.q qVar2 = (com.gamericefishpro.space.u6.q) this.e;
                ((Integer) obj).getClass();
                if (obj2 instanceof com.gamericefishpro.space.t0.j) {
                    com.gamericefishpro.space.t0.j jVar = (com.gamericefishpro.space.t0.j) obj2;
                    com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) qVar2.h;
                    if (i0Var == null) {
                        com.gamericefishpro.space.t.i0 i0Var2 = com.gamericefishpro.space.t.q0.a;
                        i0Var = new com.gamericefishpro.space.t.i0();
                        qVar2.h = i0Var;
                    }
                    i0Var.k(jVar);
                    ((com.gamericefishpro.space.v0.e) qVar2.f).b(jVar);
                }
                if (obj2 instanceof y1) {
                    qVar2.e((y1) obj2);
                }
                if (obj2 instanceof com.gamericefishpro.space.t0.p1) {
                    ((com.gamericefishpro.space.t0.p1) obj2).d();
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                u1 u1Var = (u1) this.e;
                Set set = (Set) obj;
                synchronized (u1Var.c) {
                    try {
                        if (((r1) u1Var.u.getValue()).compareTo(r1.w) >= 0) {
                            com.gamericefishpro.space.t.i0 i0Var3 = u1Var.h;
                            if (set instanceof com.gamericefishpro.space.v0.g) {
                                com.gamericefishpro.space.t.i0 i0Var4 = ((com.gamericefishpro.space.v0.g) set).d;
                                Object[] objArr = i0Var4.b;
                                long[] jArr = i0Var4.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j = jArr[i7];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                            for (int i9 = 0; i9 < i8; i9++) {
                                                if ((j & 255) < 128) {
                                                    Object obj5 = objArr[(i7 << 3) + i9];
                                                    if (!(obj5 instanceof com.gamericefishpro.space.f1.d0) || ((com.gamericefishpro.space.f1.d0) obj5).e(1)) {
                                                        i0Var3.a(obj5);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i8 == 8) {
                                                if (i7 != length) {
                                                    i7++;
                                                }
                                            }
                                        } else if (i7 != length) {
                                            i7++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof com.gamericefishpro.space.f1.d0) || ((com.gamericefishpro.space.f1.d0) obj6).e(1)) {
                                        i0Var3.a(obj6);
                                    }
                                }
                            }
                            objY = u1Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objY != null) {
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    ((com.gamericefishpro.space.pi.h) objY).resumeWith(Unit.a);
                }
                return Unit.a;
            case 12:
                com.gamericefishpro.space.ri.e eVar = (com.gamericefishpro.space.ri.e) this.e;
                Set set2 = (Set) obj;
                if (set2 instanceof com.gamericefishpro.space.v0.g) {
                    com.gamericefishpro.space.t.i0 i0Var5 = ((com.gamericefishpro.space.v0.g) set2).d;
                    Object[] objArr2 = i0Var5.b;
                    long[] jArr2 = i0Var5.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << c2) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = 0;
                                while (true) {
                                    if (i12 < i11) {
                                        if ((j2 & 255) < 128) {
                                            Object obj7 = objArr2[(i10 << 3) + i12];
                                            if (!(obj7 instanceof com.gamericefishpro.space.f1.d0) || ((com.gamericefishpro.space.f1.d0) obj7).e(4)) {
                                            }
                                        }
                                        j2 >>= 8;
                                        i12++;
                                        c2 = c2;
                                    } else {
                                        c = c2;
                                        if (i11 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c = c2;
                            }
                            if (i10 != length2) {
                                i10++;
                                c2 = c;
                            }
                        }
                        eVar.k(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj8 : set3) {
                            if (!(obj8 instanceof com.gamericefishpro.space.f1.d0) || ((com.gamericefishpro.space.f1.d0) obj8).e(4)) {
                                eVar.k(set2);
                            }
                        }
                    }
                }
                return Unit.a;
            case 13:
                ((Function1) this.e).invoke(obj);
                return Unit.a;
            case 14:
                com.gamericefishpro.space.ti.t tVar = (com.gamericefishpro.space.ti.t) this.e;
                int iIntValue3 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                kotlin.coroutines.f key = element.getKey();
                CoroutineContext.Element elementJ = tVar.e.j(key);
                if (key == com.gamericefishpro.space.pi.u.e) {
                    com.gamericefishpro.space.pi.d1 d1Var = (com.gamericefishpro.space.pi.d1) elementJ;
                    com.gamericefishpro.space.pi.d1 parent = (com.gamericefishpro.space.pi.d1) element;
                    while (parent != null) {
                        if (parent != d1Var && (parent instanceof com.gamericefishpro.space.ui.p)) {
                            com.gamericefishpro.space.pi.k kVar = (com.gamericefishpro.space.pi.k) com.gamericefishpro.space.pi.l1.e.get((com.gamericefishpro.space.ui.p) parent);
                            parent = kVar != null ? kVar.getParent() : null;
                        } else {
                            objY = parent;
                            if (objY == d1Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objY + ", expected child of " + d1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (d1Var != null) {
                                iIntValue3++;
                            }
                        }
                    }
                    if (objY == d1Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objY + ", expected child of " + d1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (d1Var != null) {
                        iIntValue3++;
                    }
                } else if (element != elementJ) {
                    iIntValue3 = Integer.MIN_VALUE;
                } else {
                    iIntValue3++;
                }
                return Integer.valueOf(iIntValue3);
            case 15:
                ((Integer) obj2).getClass();
                ((com.gamericefishpro.space.w.b0) this.e).a((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            default:
                com.gamericefishpro.space.z.j1 j1Var = (com.gamericefishpro.space.z.j1) this.e;
                com.gamericefishpro.space.pi.a0.u(j1Var.o0(), null, new com.gamericefishpro.space.z.i1(j1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ n1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
