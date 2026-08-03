package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6215g;

    /* renamed from: h, reason: collision with root package name */
    public int f6216h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f6217i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(d0 d0Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f6215g = i10;
        this.f6217i = d0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f6215g) {
            case 0:
                return new z(this.f6217i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new z(this.f6217i, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new z(this.f6217i, dVar, 2);
            case 3:
                return new z(this.f6217i, dVar, 3);
            case 4:
                return new z(this.f6217i, dVar, 4);
            default:
                return new z(this.f6217i, dVar, 5);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f6215g) {
        }
        return ((z) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x044c -> B:7:0x0450). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bd.e0 e0Var;
        qd.g gVar;
        qd.g gVar2;
        qd.l lVar;
        qd.l lVar2;
        long j3;
        long j6;
        ArrayList arrayList;
        qd.c cVar;
        ArrayList arrayList2;
        qd.l lVar3;
        Object obj2;
        int i10;
        int i11 = this.f6215g;
        Object obj3 = null;
        ac.o oVar = ac.o.f277a;
        gc.a aVar = gc.a.f2559g;
        d0 d0Var = this.f6217i;
        int i12 = 1;
        switch (i11) {
            case 0:
                int i13 = this.f6216h;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                id.i iVar = d0Var.f6129b;
                this.f6216h = 1;
                iVar.d();
                return oVar == aVar ? aVar : oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i14 = 0;
                int i15 = this.f6216h;
                if (i15 == 0) {
                    v6.a.W(obj);
                    f8.c e10 = d0Var.f6129b.e();
                    a0 a0Var = new a0(d0Var, i14);
                    this.f6216h = 1;
                    if (e10.c(a0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return oVar;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int i16 = this.f6216h;
                int i17 = 1;
                if (i16 == 0) {
                    v6.a.W(obj);
                    f8.c f10 = d0Var.f6129b.f();
                    a0 a0Var2 = new a0(d0Var, i17);
                    this.f6216h = 1;
                    if (f10.c(a0Var2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return oVar;
            case 3:
                int i18 = this.f6216h;
                if (i18 == 0) {
                    v6.a.W(obj);
                    pd.a aVar2 = d0Var.f6130c;
                    bd.q qVar = aVar2.f5688c;
                    bd.q qVar2 = aVar2.f5690e;
                    b0 b0Var = new b0(3, null);
                    a0 a0Var3 = new a0(d0Var, 2);
                    this.f6216h = 1;
                    cd.p pVar = new cd.p(new bd.e[]{qVar, qVar2}, new bd.j(b0Var, null, 1), a0Var3, null);
                    cd.r rVar = new cd.r(this, getContext());
                    Object J = bc.a0.J(rVar, rVar, pVar);
                    if (J != aVar) {
                        J = oVar;
                    }
                    if (J != aVar) {
                        J = oVar;
                    }
                    if (J == aVar) {
                        return aVar;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return oVar;
            case 4:
                int i19 = this.f6216h;
                if (i19 == 0) {
                    v6.a.W(obj);
                    this.f6216h = 1;
                    if (yc.a0.f(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                bd.e0 e0Var2 = d0Var.f6131d;
                y a6 = y.a((y) e0Var2.getValue(), null, null, null, null, false, false, false, null, null, 255);
                e0Var2.getClass();
                e0Var2.h(null, a6);
                return oVar;
            default:
                bd.e0 e0Var3 = d0Var.f6131d;
                int i20 = this.f6216h;
                if (i20 == 0) {
                    v6.a.W(obj);
                    if (((y) e0Var3.getValue()).f6209e) {
                    }
                    return oVar;
                }
                if (i20 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                bd.e0 e0Var4 = e0Var3;
                ac.o oVar2 = oVar;
                e0Var3 = e0Var4;
                oVar = oVar2;
                obj3 = null;
                i12 = 1;
                if (((y) e0Var3.getValue()).f6209e || ((y) e0Var3.getValue()).f6210f) {
                    return oVar;
                }
                pd.a aVar3 = d0Var.f6130c;
                long currentTimeMillis = System.currentTimeMillis();
                bd.e0 e0Var5 = aVar3.f5689d;
                bd.e0 e0Var6 = aVar3.f5687b;
                qd.h hVar = (qd.h) e0Var6.getValue();
                if (hVar.f5856l) {
                    oVar2 = oVar;
                } else {
                    Iterable iterable = (Iterable) e0Var5.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : iterable) {
                        ac.o oVar3 = oVar;
                        if (currentTimeMillis < ((qd.b) obj4).f5829g) {
                            arrayList3.add(obj4);
                        }
                        oVar = oVar3;
                    }
                    oVar2 = oVar;
                    e0Var5.h(obj3, arrayList3);
                    Iterable iterable2 = (Iterable) e0Var5.getValue();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = iterable2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        qd.f fVar = qd.f.f5843h;
                        qd.f fVar2 = qd.f.f5842g;
                        if (hasNext) {
                            Object next = it.next();
                            qd.b bVar = (qd.b) next;
                            int i21 = i12;
                            qd.f fVar3 = bVar.f5824b;
                            if ((fVar3 == fVar2 || fVar3 == fVar) && currentTimeMillis >= bVar.f5829g) {
                                arrayList4.add(next);
                            }
                            i12 = i21;
                        } else {
                            int i22 = i12;
                            if (!arrayList4.isEmpty()) {
                                int size = arrayList4.size();
                                int i23 = 0;
                                while (i23 < size) {
                                    Object obj5 = arrayList4.get(i23);
                                    i23++;
                                    qd.h hVar2 = (qd.h) e0Var6.getValue();
                                    if (hVar2.f5858n) {
                                        e0Var6.h(obj3, qd.h.a(hVar2, 0, 0, 0, 0, false, null, false, 127));
                                    } else {
                                        int i24 = hVar2.f5852h - 1;
                                        e0Var6.h(obj3, qd.h.a(hVar2, 0, i24, 0, 0, i24 <= 0 ? i22 : 0, null, false, 221));
                                    }
                                }
                            }
                            qd.a aVar4 = hVar.f5857m;
                            if (aVar4 != null && currentTimeMillis >= aVar4.f5821h + aVar4.f5822i) {
                                e0Var6.h(null, qd.h.a(hVar, 0, 0, 0, 0, false, null, false, 191));
                            }
                            int i25 = hVar.f5851g / 10;
                            int i26 = i25 + 1;
                            if (i26 <= i22) {
                                gVar2 = new qd.g(1, 2000L, 3000L, 1, 0.0f);
                            } else if (i26 == 2) {
                                gVar2 = new qd.g(2, 1800L, 2800L, 1, 0.1f);
                            } else if (i26 == 3) {
                                gVar2 = new qd.g(3, 1500L, 2500L, 2, 0.2f);
                            } else if (i26 == 4) {
                                gVar2 = new qd.g(4, 1300L, 2200L, 2, 0.3f);
                            } else if (i26 >= 5) {
                                int i27 = i25 - 3;
                                long j10 = i27 * 100;
                                e0Var = e0Var5;
                                gVar2 = new qd.g(i26, Math.max(800L, 1300 - j10), Math.max(1500L, 2200 - j10), Math.min(3, (i27 / 2) + 2), Math.min(0.5f, (i27 * 0.05f) + 0.3f));
                                gVar = gVar2;
                                lVar = aVar4 != null ? aVar4.f5820g : null;
                                lVar2 = qd.l.f5871i;
                                j3 = gVar.f5847b;
                                if (lVar == lVar2) {
                                    j3 = (long) (j3 * 1.5d);
                                }
                                if (currentTimeMillis - aVar3.f5691f >= j3) {
                                    a5.c cVar2 = aVar3.f5686a;
                                    List list = (List) e0Var.getValue();
                                    int size2 = list.size();
                                    int i28 = gVar.f5849d;
                                    if (size2 < i28) {
                                        int min = sc.e.f6475g.d() < gVar.f5850e ? Math.min(2, i28 - list.size()) : 1;
                                        ArrayList arrayList5 = new ArrayList();
                                        e0Var4 = e0Var3;
                                        ArrayList arrayList6 = new ArrayList(bc.o.O(list));
                                        for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                                            arrayList6.add(((qd.b) it2.next()).f5827e);
                                        }
                                        ArrayList f02 = bc.m.f0(arrayList6);
                                        int i29 = 0;
                                        while (i29 < min) {
                                            qd.f fVar4 = fVar;
                                            qd.a aVar5 = ((qd.h) e0Var6.getValue()).f5857m;
                                            int i30 = min;
                                            float f11 = (aVar5 != null ? aVar5.f5820g : null) == qd.l.f5873k ? 0.1f : 0.015f;
                                            float d10 = sc.e.f6475g.d();
                                            qd.f fVar5 = (0.0f > d10 || d10 > f11) ? (f11 > d10 || d10 > f11 + 0.15f) ? qd.f.f5844i : fVar2 : fVar4;
                                            float f12 = aVar3.f5692g;
                                            qd.f fVar6 = fVar5;
                                            float f13 = aVar3.f5693h;
                                            float f14 = aVar3.f5694i;
                                            cVar2.getClass();
                                            int i31 = 0;
                                            while (true) {
                                                if (i31 < 50) {
                                                    sc.d dVar = sc.e.f6475g;
                                                    i10 = i31;
                                                    arrayList = arrayList5;
                                                    cVar = new qd.c((f12 - f14) * dVar.d(), dVar.d() * (f13 - f14));
                                                    if (!f02.isEmpty()) {
                                                        int size3 = f02.size();
                                                        int i32 = 0;
                                                        while (i32 < size3) {
                                                            Object obj6 = f02.get(i32);
                                                            int i33 = i32 + 1;
                                                            int i34 = size3;
                                                            qd.c cVar3 = (qd.c) obj6;
                                                            float f15 = cVar3.f5830a - cVar.f5830a;
                                                            float f16 = cVar3.f5831b - cVar.f5831b;
                                                            qd.c cVar4 = cVar;
                                                            if (((float) Math.sqrt((f16 * f16) + (f15 * f15))) < 1.5f * f14) {
                                                                break;
                                                            }
                                                            i32 = i33;
                                                            size3 = i34;
                                                            cVar = cVar4;
                                                        }
                                                    }
                                                } else {
                                                    arrayList = arrayList5;
                                                    sc.d dVar2 = sc.e.f6475g;
                                                    cVar = new qd.c(dVar2.d() * (f12 - f14), dVar2.d() * (f13 - f14));
                                                }
                                                i31 = i10 + 1;
                                                arrayList5 = arrayList;
                                            }
                                            f02.add(cVar);
                                            qd.a aVar6 = ((qd.h) e0Var6.getValue()).f5857m;
                                            qd.l lVar4 = aVar6 != null ? aVar6.f5820g : null;
                                            qd.c cVar5 = cVar;
                                            bd.e0 e0Var7 = e0Var6;
                                            long j11 = gVar.f5848c;
                                            if (lVar4 == lVar2) {
                                                j11 = (long) (j11 * 1.5d);
                                            }
                                            int ordinal = fVar6.ordinal();
                                            if (ordinal != 0) {
                                                arrayList2 = f02;
                                                if (ordinal == 1) {
                                                    lVar3 = lVar2;
                                                    obj2 = cVar2.f263i;
                                                } else {
                                                    if (ordinal != 2) {
                                                        throw new ac.d();
                                                    }
                                                    List list2 = (List) cVar2.f262h;
                                                    sc.d dVar3 = sc.e.f6475g;
                                                    lVar3 = lVar2;
                                                    pc.j.e(list2, "<this>");
                                                    if (list2.isEmpty()) {
                                                        throw new NoSuchElementException("Collection is empty.");
                                                    }
                                                    int size4 = list2.size();
                                                    dVar3.getClass();
                                                    obj2 = list2.get(sc.e.f6476h.d().nextInt(size4));
                                                }
                                            } else {
                                                arrayList2 = f02;
                                                lVar3 = lVar2;
                                                obj2 = cVar2.f261g;
                                            }
                                            ac.i iVar2 = (ac.i) obj2;
                                            qd.g gVar3 = gVar;
                                            ArrayList arrayList7 = arrayList;
                                            arrayList7.add(new qd.b(fVar6.name() + "_" + System.currentTimeMillis() + "_" + sc.e.f6476h.a(), fVar6, (String) iVar2.f270g, ((Number) iVar2.f271h).intValue(), cVar5, currentTimeMillis, currentTimeMillis + j11));
                                            i29++;
                                            e0Var = e0Var;
                                            fVar2 = fVar2;
                                            min = i30;
                                            f02 = arrayList2;
                                            cVar2 = cVar2;
                                            gVar = gVar3;
                                            arrayList5 = arrayList7;
                                            e0Var6 = e0Var7;
                                            fVar = fVar4;
                                            lVar2 = lVar3;
                                        }
                                        ArrayList arrayList8 = arrayList5;
                                        j6 = currentTimeMillis;
                                        e0Var.h(null, bc.m.a0(list, arrayList8));
                                    } else {
                                        e0Var4 = e0Var3;
                                        j6 = currentTimeMillis;
                                    }
                                    aVar3.f5691f = j6;
                                    this.f6216h = 1;
                                    if (yc.a0.f(16L, this) == aVar) {
                                        return aVar;
                                    }
                                    e0Var3 = e0Var4;
                                    oVar = oVar2;
                                    obj3 = null;
                                    i12 = 1;
                                    if (((y) e0Var3.getValue()).f6209e) {
                                    }
                                    return oVar;
                                }
                            } else {
                                e0Var = e0Var5;
                                gVar = new qd.g(1, 2000L, 3000L, 1, 0.0f);
                                if (aVar4 != null) {
                                }
                                lVar2 = qd.l.f5871i;
                                j3 = gVar.f5847b;
                                if (lVar == lVar2) {
                                }
                                if (currentTimeMillis - aVar3.f5691f >= j3) {
                                }
                            }
                            e0Var = e0Var5;
                            gVar = gVar2;
                            if (aVar4 != null) {
                            }
                            lVar2 = qd.l.f5871i;
                            j3 = gVar.f5847b;
                            if (lVar == lVar2) {
                            }
                            if (currentTimeMillis - aVar3.f5691f >= j3) {
                            }
                        }
                    }
                }
                e0Var4 = e0Var3;
                this.f6216h = 1;
                if (yc.a0.f(16L, this) == aVar) {
                }
                e0Var3 = e0Var4;
                oVar = oVar2;
                obj3 = null;
                i12 = 1;
                if (((y) e0Var3.getValue()).f6209e) {
                }
                return oVar;
        }
    }
}
