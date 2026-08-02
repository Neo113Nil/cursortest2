package defpackage;

import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.s;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class qkw {
    public static final String d = f1d.g("YnisonShared:", "LoaderState2");
    public final ReentrantLock a = new ReentrantLock();
    public final nur b;
    public final bjt c;

    public qkw(rgw rgwVar, wfw wfwVar) {
        nur nurVar = new nur(10);
        nurVar.c = new HashMap();
        this.b = nurVar;
        this.c = new bjt(wfwVar);
    }

    public final okw a(xab xabVar) {
        List E;
        ejw ejwVar = (ejw) this.b.b;
        if (ejwVar != null) {
            if (ejwVar instanceof djw) {
                if (xabVar instanceof wab) {
                    bbq bbqVar = ((djw) ejwVar).a;
                    hbq id = bbqVar.getId();
                    wab wabVar = (wab) xabVar;
                    o4q o4qVar = wabVar.c;
                    s sVar = wabVar.a;
                    StationId stationId = wabVar.d;
                    z4q z4qVar = null;
                    if (qgg.Z(id, (stationId == null || (E = c9g.E(stationId)) == null) ? null : o8g.E(E), sVar != null ? u7g.U(sVar) : null, sVar == null)) {
                        Set set = (Set) wabVar.f.getValue();
                        Set entrySet = bbqVar.f().b.entrySet();
                        Set<Map.Entry> set2 = entrySet;
                        HashMap I = gdg.I(entrySet.size());
                        for (Map.Entry entry : set2) {
                            I.put(y7g.V((b6v) entry.getValue(), ((Number) entry.getKey()).intValue()), (b6v) entry.getValue());
                        }
                        if (I.keySet().containsAll(set)) {
                            if (bbqVar instanceof abq) {
                                bbqVar = abq.a((abq) bbqVar, o4qVar);
                            } else if (!(bbqVar instanceof xaq)) {
                                b6e.s();
                                return null;
                            }
                            return new mkw(new djw(bbqVar));
                        }
                        if (bbqVar instanceof abq) {
                            abq a = abq.a((abq) bbqVar, o4qVar);
                            gbq gbqVar = a.a;
                            zaq zaqVar = a.c;
                            String str = zaqVar.b;
                            String str2 = zaqVar.a;
                            yaq yaqVar = a.d;
                            gxc gxcVar = yaqVar.c;
                            String str3 = yaqVar.b;
                            pfn pfnVar = yaqVar.a;
                            if (gbqVar instanceof ebq) {
                                ebq ebqVar = (ebq) gbqVar;
                                z4qVar = new u4q(new tnu(ebqVar.a, ebqVar.b), new t4q(pfnVar, str3, gxcVar, false), new s4v(str2, str), a.b, a.e, null);
                            } else {
                                if (!(gbqVar instanceof fbq)) {
                                    b6e.s();
                                    return null;
                                }
                                fbq fbqVar = (fbq) gbqVar;
                                z4qVar = new w4q(new unu(fbqVar.a, fbqVar.b), new v4q(pfnVar, str3, gxcVar), new s4v(str2, str), a.b, a.e, null);
                            }
                        } else if (!(bbqVar instanceof xaq)) {
                            b6e.s();
                            return null;
                        }
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry2 : I.entrySet()) {
                            hashMap.put(((r) entry2.getKey()).j(), entry2.getValue());
                        }
                        return new nkw(z4qVar, hashMap);
                    }
                }
            } else if (ejwVar instanceof cjw) {
                if ((xabVar instanceof vab) && Intrinsics.d(((vab) xabVar).a, ((cjw) ejwVar).a.b.a)) {
                    return new mkw(ejwVar);
                }
            } else if (!(ejwVar instanceof ajw)) {
                if (!(ejwVar instanceof bjw)) {
                    b6e.s();
                    return null;
                }
                if (xabVar instanceof uab) {
                    return new mkw(ejwVar);
                }
            } else if ((xabVar instanceof tab) && Intrinsics.d(((tab) xabVar).a, ((ajw) ejwVar).a.c.a)) {
                return new mkw(ejwVar);
            }
        }
        return lkw.a;
    }

    public final void b(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        v3w.k("keep tracks ", list.size(), 2, d, null);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c.c(list);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ArrayList c(List list, ejw ejwVar, gow gowVar, c0 c0Var, gxc gxcVar) {
        ArrayList arrayList;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (ejwVar instanceof ajw) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    t9n t9nVar = (t9n) it.next();
                    wwk wwkVar = t9nVar.a;
                    f fVar = t9nVar.b;
                    kiw kiwVar = wwkVar.a;
                    daq daqVar = null;
                    jiw jiwVar = kiwVar instanceof jiw ? (jiw) kiwVar : null;
                    if (jiwVar == null) {
                        Assertions.throwOrSkip(d, new FailedAssertionException("Loader id should be generative"));
                    } else {
                        daqVar = new daq(jiwVar, qgg.i0(fVar, hzs.a, gxcVar, 6), ((ajw) ejwVar).a.b);
                    }
                    if (daqVar != null) {
                        arrayList.add(daqVar);
                    }
                }
            } else if (ejwVar instanceof djw) {
                List<t9n> list2 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                for (t9n t9nVar2 : list2) {
                    wwk wwkVar2 = t9nVar2.a;
                    f fVar2 = t9nVar2.b;
                    gxc gxcVar2 = gxcVar;
                    arrayList2.add(this.c.h(wwkVar2, fVar2, y7g.w(fVar2, ((djw) ejwVar).a.f()), c0Var.l(), gxcVar2));
                    gxcVar = gxcVar2;
                }
                arrayList = arrayList2;
            } else {
                if (!(ejwVar instanceof cjw) && !(ejwVar instanceof bjw)) {
                    throw new x7j();
                }
                List<t9n> list3 = list;
                ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                for (t9n t9nVar3 : list3) {
                    arrayList3.add(this.c.h(t9nVar3.a, t9nVar3.b, null, c0Var.l(), gxcVar));
                }
                arrayList = arrayList3;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((faq) it2.next()).b = gowVar;
            }
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
