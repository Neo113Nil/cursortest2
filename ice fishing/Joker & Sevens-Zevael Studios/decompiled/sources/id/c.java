package id;

import bc.a0;
import bc.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.m;
import nd.n;
import pc.j;
import qd.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3260g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bd.f f3261h;

    public /* synthetic */ c(bd.f fVar, int i10) {
        this.f3260g = i10;
        this.f3261h = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        b bVar;
        int i10;
        d dVar2;
        int i11;
        e eVar;
        int i12;
        switch (this.f3260g) {
            case 0:
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i13 = bVar.f3258h;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bVar.f3258h = i13 - Integer.MIN_VALUE;
                        Object obj2 = bVar.f3257g;
                        i10 = bVar.f3258h;
                        if (i10 != 0) {
                            v6.a.W(obj2);
                            List<m> list = (List) obj;
                            ArrayList arrayList = new ArrayList(o.O(list));
                            for (m mVar : list) {
                                j.e(mVar, "<this>");
                                arrayList.add(new qd.i((int) mVar.f5101b, (int) mVar.f5102c, mVar.f5100a, mVar.f5103d));
                            }
                            bVar.f3258h = 1;
                            Object a6 = this.f3261h.a(arrayList, bVar);
                            gc.a aVar = gc.a.f2559g;
                            if (a6 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj2);
                        }
                        return ac.o.f277a;
                    }
                }
                bVar = new b(this, dVar);
                Object obj22 = bVar.f3257g;
                i10 = bVar.f3258h;
                if (i10 != 0) {
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (dVar instanceof d) {
                    dVar2 = (d) dVar;
                    int i14 = dVar2.f3263h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        dVar2.f3263h = i14 - Integer.MIN_VALUE;
                        Object obj3 = dVar2.f3262g;
                        i11 = dVar2.f3263h;
                        if (i11 != 0) {
                            v6.a.W(obj3);
                            n nVar = (n) obj;
                            qd.j jVar = nVar != null ? new qd.j((int) nVar.f5105b, (int) nVar.f5106c) : new qd.j(0, 0);
                            dVar2.f3263h = 1;
                            Object a8 = this.f3261h.a(jVar, dVar2);
                            gc.a aVar2 = gc.a.f2559g;
                            if (a8 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj3);
                        }
                        return ac.o.f277a;
                    }
                }
                dVar2 = new d(this, dVar);
                Object obj32 = dVar2.f3262g;
                i11 = dVar2.f3263h;
                if (i11 != 0) {
                }
                return ac.o.f277a;
            default:
                if (dVar instanceof e) {
                    eVar = (e) dVar;
                    int i15 = eVar.f3266h;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        eVar.f3266h = i15 - Integer.MIN_VALUE;
                        Object obj4 = eVar.f3265g;
                        i12 = eVar.f3266h;
                        if (i12 != 0) {
                            v6.a.W(obj4);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = ((List) obj).iterator();
                            while (it.hasNext()) {
                                k K = a0.K((nd.o) it.next());
                                if (K != null) {
                                    arrayList2.add(K);
                                }
                            }
                            eVar.f3266h = 1;
                            Object a10 = this.f3261h.a(arrayList2, eVar);
                            gc.a aVar3 = gc.a.f2559g;
                            if (a10 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj4);
                        }
                        return ac.o.f277a;
                    }
                }
                eVar = new e(this, dVar);
                Object obj42 = eVar.f3265g;
                i12 = eVar.f3266h;
                if (i12 != 0) {
                }
                return ac.o.f277a;
        }
    }
}
