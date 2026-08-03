package bd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1083i;

    public c(d dVar, pc.s sVar, f fVar) {
        this.f1081g = 0;
        this.f1082h = sVar;
        this.f1083i = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        b bVar;
        int i10;
        l lVar;
        Object obj2;
        int i11;
        c cVar;
        switch (this.f1081g) {
            case 0:
                pc.s sVar = (pc.s) this.f1082h;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i12 = bVar.f1080i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bVar.f1080i = i12 - Integer.MIN_VALUE;
                        Object obj3 = bVar.f1078g;
                        i10 = bVar.f1080i;
                        ac.o oVar = ac.o.f277a;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj3);
                            return oVar;
                        }
                        v6.a.W(obj3);
                        Object obj4 = sVar.f5683g;
                        if (obj4 != cd.c.f1342b && pc.j.a(obj4, obj)) {
                            return oVar;
                        }
                        sVar.f5683g = obj;
                        f fVar = (f) this.f1083i;
                        bVar.f1080i = 1;
                        Object a6 = fVar.a(obj, bVar);
                        gc.a aVar = gc.a.f2559g;
                        return a6 == aVar ? aVar : oVar;
                    }
                }
                bVar = new b(this, dVar);
                Object obj32 = bVar.f1078g;
                i10 = bVar.f1080i;
                ac.o oVar2 = ac.o.f277a;
                if (i10 == 0) {
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (dVar instanceof l) {
                    lVar = (l) dVar;
                    int i13 = lVar.f1119i;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        lVar.f1119i = i13 - Integer.MIN_VALUE;
                        obj2 = lVar.f1118h;
                        i11 = lVar.f1119i;
                        if (i11 != 0) {
                            v6.a.W(obj2);
                            oc.e eVar = (oc.e) this.f1083i;
                            lVar.f1117g = this;
                            lVar.f1121k = obj;
                            lVar.f1119i = 1;
                            obj2 = eVar.invoke(obj, lVar);
                            gc.a aVar2 = gc.a.f2559g;
                            if (obj2 == aVar2) {
                                return aVar2;
                            }
                            cVar = this;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f1121k;
                            cVar = lVar.f1117g;
                            v6.a.W(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return ac.o.f277a;
                        }
                        ((pc.s) cVar.f1082h).f5683g = obj;
                        throw new cd.a(cVar);
                    }
                }
                lVar = new l(this, dVar);
                obj2 = lVar.f1118h;
                i11 = lVar.f1119i;
                if (i11 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                y.h hVar = (y.h) obj;
                i0.a aVar3 = (i0.a) this.f1082h;
                if (hVar instanceof y.k) {
                    y.k kVar = (y.k) hVar;
                    i0.l lVar2 = aVar3.f2938n;
                    if (lVar2 == null) {
                        lVar2 = i0.t.a(aVar3.f2937m);
                        aVar3.f2938n = lVar2;
                    }
                    i0.n a8 = lVar2.a(aVar3);
                    a8.b(kVar, aVar3.f2933i, aVar3.f2941q, aVar3.f2942r, ((f1.q) aVar3.f2935k.getValue()).f2285a, ((i0.f) aVar3.f2936l.getValue()).f2951d, aVar3.f2943s);
                    aVar3.f2939o.setValue(a8);
                } else if (hVar instanceof y.l) {
                    i0.n nVar = (i0.n) aVar3.f2939o.getValue();
                    if (nVar != null) {
                        nVar.d();
                    }
                } else if (hVar instanceof y.j) {
                    i0.n nVar2 = (i0.n) aVar3.f2939o.getValue();
                    if (nVar2 != null) {
                        nVar2.d();
                    }
                } else {
                    aVar3.f2932h.f(hVar, (yc.y) this.f1083i);
                }
                return ac.o.f277a;
            default:
                y.h hVar2 = (y.h) obj;
                i0.p pVar = (i0.p) this.f1082h;
                if (!(hVar2 instanceof y.m)) {
                    yc.y yVar = (yc.y) this.f1083i;
                    a0.u uVar = pVar.f2992z;
                    if (uVar == null) {
                        uVar = new a0.u(pVar.f2988v, pVar.f2991y);
                        x1.f.m(pVar);
                        pVar.f2992z = uVar;
                    }
                    uVar.f(hVar2, yVar);
                } else if (pVar.C) {
                    pVar.t0((y.m) hVar2);
                } else {
                    pVar.D.a(hVar2);
                }
                return ac.o.f277a;
        }
    }

    public /* synthetic */ c(Object obj, yc.y yVar, int i10) {
        this.f1081g = i10;
        this.f1082h = obj;
        this.f1083i = yVar;
    }

    public c(oc.e eVar, pc.s sVar) {
        this.f1081g = 1;
        this.f1083i = eVar;
        this.f1082h = sVar;
    }
}
