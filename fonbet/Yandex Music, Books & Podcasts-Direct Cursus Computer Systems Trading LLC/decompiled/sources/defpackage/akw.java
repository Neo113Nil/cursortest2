package defpackage;

import com.yandex.media.ynison.service.n;
import com.yandex.media.ynison.service.o;
import com.yandex.media.ynison.service.p;
import com.yandex.media.ynison.service.q;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.s;
import com.yandex.media.ynison.service.t;
import com.yandex.music.shared.ynison.api.deps.bridge.YnisonNetworkStateProvider$UnsupportedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class akw {
    public static final String j = f1d.g("YnisonShared:", "Loader");
    public final agw a;
    public final rgw b;
    public final sfw c;
    public final ndw d;
    public final zzp e = zzp.b;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final jyr g;
    public final qkw h;
    public List i;

    public akw(agw agwVar, wfw wfwVar, rgw rgwVar, cew cewVar, sfw sfwVar, ndw ndwVar) {
        this.a = agwVar;
        this.b = rgwVar;
        this.c = sfwVar;
        this.d = ndwVar;
        this.g = btf.b(new dxv(20, cewVar));
        this.h = new qkw(rgwVar, wfwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r5v1, types: [r9q] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(akw akwVar, r rVar, Map map, List list, cg6 cg6Var) {
        rjw rjwVar;
        int i;
        ?? r9qVar;
        r rVar2;
        iow iowVar;
        String str;
        String str2;
        bd5 A;
        iow iowVar2;
        s9q s9qVar;
        if (cg6Var instanceof rjw) {
            rjwVar = (rjw) cg6Var;
            int i2 = rjwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rjwVar.m = i2 - Integer.MIN_VALUE;
                rjw rjwVar2 = rjwVar;
                Object obj = rjwVar2.k;
                Object obj2 = nm6.a;
                i = rjwVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    p j2 = rVar.j();
                    j2.getClass();
                    b6v b6vVar = (b6v) map.get(j2);
                    if (b6vVar != null) {
                        return new jd5(b6vVar, rVar.i());
                    }
                    int n = j2.n();
                    int i3 = n == 0 ? -1 : kjw.b[ouj.D(n)];
                    if (i3 != -1) {
                        r9qVar = 0;
                        r9qVar = 0;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                q o = j2.r() ? j2.o() : null;
                                if (o == null || (str = o.j()) == null) {
                                    str = "";
                                }
                                q o2 = j2.r() ? j2.o() : null;
                                if (o2 != null) {
                                    dlr i4 = o2.k() ? o2.i() : null;
                                    if (i4 != null) {
                                        str2 = i4.g();
                                        A = i9w.A(str, str2);
                                        if (A != null) {
                                            throw new YnisonNetworkStateProvider$UnsupportedException(k5r.l("Illegal playlist id ", rVar.i(), str, ", "));
                                        }
                                        int m = j2.m();
                                        if (m == 0) {
                                            throw null;
                                        }
                                        int D = ouj.D(m);
                                        iow iowVar3 = D != 0 ? D != 4 ? iow.a : iow.e : iow.a;
                                        Function2 ocuVar = new ocu(A, akwVar, iowVar3, (Continuation) r9qVar, 13);
                                        Function2 wzvVar = new wzv(A, iowVar3, r9qVar, 11);
                                        rjwVar2.j = rVar;
                                        rjwVar2.m = 2;
                                        obj = akwVar.f(false, ocuVar, wzvVar, rjwVar2);
                                        if (obj != obj2) {
                                            rVar2 = rVar;
                                            s9qVar = (s9q) obj;
                                        }
                                    }
                                }
                                str2 = null;
                                A = i9w.A(str, str2);
                                if (A != null) {
                                }
                            } else if (i3 == 3) {
                                n j3 = j2.p() ? j2.j() : null;
                                String h = j3 != null ? j3.h() : null;
                                if (h != null) {
                                    int m2 = j2.m();
                                    if (m2 == 0) {
                                        throw null;
                                    }
                                    switch (ouj.D(m2)) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            iowVar2 = iow.a;
                                            break;
                                        case 4:
                                            iowVar2 = iow.e;
                                            break;
                                        default:
                                            b6e.s();
                                            return null;
                                    }
                                    Function2 sjwVar = new sjw(h, iowVar2, r9qVar, 2);
                                    Function2 sjwVar2 = new sjw(h, iowVar2, r9qVar, 3);
                                    rjwVar2.j = rVar;
                                    rjwVar2.m = 3;
                                    obj = akwVar.f(false, sjwVar, sjwVar2, rjwVar2);
                                    if (obj != obj2) {
                                        rVar2 = rVar;
                                        s9qVar = (o9q) obj;
                                    }
                                }
                                rVar2 = rVar;
                                s9qVar = r9qVar;
                            } else if (i3 != 4) {
                                b6e.s();
                                return null;
                            }
                            return obj2;
                        }
                        o k = j2.q() ? j2.k() : null;
                        String h2 = k != null ? k.h() : null;
                        if (h2 != null) {
                            int m3 = j2.m();
                            if (m3 == 0) {
                                throw null;
                            }
                            switch (ouj.D(m3)) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 8:
                                    iowVar = iow.a;
                                    break;
                                case 4:
                                    iowVar = iow.e;
                                    break;
                                case 6:
                                    iowVar = iow.g;
                                    break;
                                case 7:
                                    iowVar = iow.h;
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                            Function2 sjwVar3 = new sjw(h2, iowVar, r9qVar, 0);
                            Function2 sjwVar4 = new sjw(h2, iowVar, r9qVar, 1);
                            rjwVar2.j = rVar;
                            rjwVar2.m = 1;
                            obj = akwVar.f(false, sjwVar3, sjwVar4, rjwVar2);
                            if (obj != obj2) {
                                rVar2 = rVar;
                                s9qVar = (p9q) obj;
                            }
                            return obj2;
                        }
                        rVar2 = rVar;
                        s9qVar = r9qVar;
                    }
                    r9qVar = new r9q(bfg.M(j2.m()), list);
                    rVar2 = rVar;
                    s9qVar = r9qVar;
                } else if (i == 1) {
                    rVar2 = rjwVar2.j;
                    qgg.h0(obj);
                    s9qVar = (p9q) obj;
                } else if (i == 2) {
                    rVar2 = rjwVar2.j;
                    qgg.h0(obj);
                    s9qVar = (s9q) obj;
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar2 = rjwVar2.j;
                    qgg.h0(obj);
                    s9qVar = (o9q) obj;
                }
                if (s9qVar == null) {
                    return new jd5(s9qVar, rVar2.i());
                }
                throw new YnisonNetworkStateProvider$UnsupportedException(String.valueOf(rVar2.i()));
            }
        }
        rjwVar = new rjw(akwVar, cg6Var);
        rjw rjwVar22 = rjwVar;
        Object obj3 = rjwVar22.k;
        Object obj22 = nm6.a;
        i = rjwVar22.m;
        if (i != 0) {
        }
        if (s9qVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(akw akwVar, r rVar, z4q z4qVar, wab wabVar, boolean z, cg6 cg6Var) {
        wjw wjwVar;
        int i;
        c6v c6vVar;
        r rVar2;
        c6v c6vVar2;
        r rVar3;
        c6v c6vVar3;
        q4q q4qVar;
        w4q w4qVar;
        wab wabVar2 = wabVar;
        akwVar.getClass();
        if (cg6Var instanceof wjw) {
            wjwVar = (wjw) cg6Var;
            int i2 = wjwVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wjwVar.o = i2 - Integer.MIN_VALUE;
                wjw wjwVar2 = wjwVar;
                Object obj = wjwVar2.m;
                Object obj2 = nm6.a;
                i = wjwVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    rVar.getClass();
                    Continuation continuation = null;
                    t l = rVar.m() ? rVar.l() : null;
                    int h = l != null ? l.h() : 0;
                    int i3 = h == 0 ? -1 : kjw.a[ouj.D(h)];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            c6vVar = c6v.a;
                        } else if (i3 == 2) {
                            c6vVar = c6v.b;
                        } else if (i3 != 3) {
                            b6e.s();
                            return null;
                        }
                        c6v c6vVar4 = c6vVar;
                        if (z4qVar == null) {
                            return new iou(new d6v(z4qVar, c6vVar4), rVar.i());
                        }
                        s sVar = wabVar2.a;
                        String U = sVar != null ? u7g.U(sVar) : null;
                        if (U == null) {
                            StationId stationId = wabVar2.d;
                            if (stationId != null) {
                                s9p E = o8g.E(c9g.E(stationId));
                                Function2 xjwVar = new xjw(E, wabVar, continuation, 0);
                                Function2 xjwVar2 = new xjw(E, wabVar, continuation, 1);
                                wjwVar2.j = rVar;
                                wjwVar2.k = wabVar2;
                                wjwVar2.l = c6vVar4;
                                wjwVar2.o = 1;
                                obj = akwVar.f(z, xjwVar, xjwVar2, wjwVar2);
                                if (obj != obj2) {
                                    rVar3 = rVar;
                                    c6vVar3 = c6vVar4;
                                    q4qVar = (q4q) obj;
                                    if (q4qVar != null) {
                                    }
                                }
                            }
                        } else {
                            Function2 ocuVar = new ocu(U, wabVar2, akwVar, continuation, 14);
                            Function2 wzvVar = new wzv(U, wabVar, continuation, 12);
                            wjwVar2.j = rVar;
                            wjwVar2.k = wabVar2;
                            wjwVar2.l = c6vVar4;
                            wjwVar2.o = 2;
                            obj = akwVar.f(z, ocuVar, wzvVar, wjwVar2);
                            if (obj != obj2) {
                                rVar2 = rVar;
                                c6vVar2 = c6vVar4;
                                w4qVar = (w4q) obj;
                                if (w4qVar == null) {
                                }
                            }
                        }
                        return obj2;
                    }
                    c6vVar = c6v.a;
                    c6v c6vVar42 = c6vVar;
                    if (z4qVar == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6vVar2 = wjwVar2.l;
                        wabVar2 = wjwVar2.k;
                        rVar2 = wjwVar2.j;
                        qgg.h0(obj);
                        w4qVar = (w4q) obj;
                        if (w4qVar == null) {
                            return new iou(new d6v(w4qVar, c6vVar2), rVar2.i());
                        }
                        throw new YnisonNetworkStateProvider$UnsupportedException(String.valueOf(wabVar2));
                    }
                    c6vVar3 = wjwVar2.l;
                    wabVar2 = wjwVar2.k;
                    rVar3 = wjwVar2.j;
                    qgg.h0(obj);
                    q4qVar = (q4q) obj;
                    if (q4qVar != null) {
                        return new iou(new d6v(q4qVar, c6vVar3), rVar3.i());
                    }
                }
                throw new YnisonNetworkStateProvider$UnsupportedException(String.valueOf(wabVar2));
            }
        }
        wjwVar = new wjw(akwVar, cg6Var);
        wjw wjwVar22 = wjwVar;
        Object obj3 = wjwVar22.m;
        Object obj22 = nm6.a;
        i = wjwVar22.o;
        if (i != 0) {
        }
        throw new YnisonNetworkStateProvider$UnsupportedException(String.valueOf(wabVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(akw akwVar, u9n u9nVar, z4q z4qVar, Map map, cg6 cg6Var) {
        zjw zjwVar;
        int i;
        ziw ziwVar;
        qkw qkwVar = akwVar.h;
        if (cg6Var instanceof zjw) {
            zjwVar = (zjw) cg6Var;
            int i2 = zjwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zjwVar.l = i2 - Integer.MIN_VALUE;
                zjw zjwVar2 = zjwVar;
                Object obj = zjwVar2.j;
                Object obj2 = nm6.a;
                i = zjwVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zjwVar2.l = 1;
                    obj = akwVar.i(u9nVar, z4qVar, map, 3, zjwVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ziwVar = (ziw) obj;
                if (ziwVar instanceof xiw) {
                    if ((ziwVar instanceof wiw) || (ziwVar instanceof yiw)) {
                        return null;
                    }
                    b6e.s();
                    return null;
                }
                ejw ejwVar = ((xiw) ziwVar).a;
                qkwVar.getClass();
                ejwVar.getClass();
                ssg.a(2, qkw.d, "keep entity ".concat(ejwVar.getClass().getSimpleName()), null);
                ReentrantLock reentrantLock = qkwVar.a;
                reentrantLock.lock();
                try {
                    qkwVar.b.i(ejwVar);
                    reentrantLock.unlock();
                    qkwVar.b(ejwVar.getEntity().c());
                    return ejwVar;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        zjwVar = new zjw(akwVar, cg6Var);
        zjw zjwVar22 = zjwVar;
        Object obj3 = zjwVar22.j;
        Object obj22 = nm6.a;
        i = zjwVar22.l;
        if (i != 0) {
        }
        ziwVar = (ziw) obj3;
        if (ziwVar instanceof xiw) {
        }
    }

    public static Object k(rj6 rj6Var) {
        if (rj6Var instanceof qj6) {
            return ((qj6) rj6Var).a;
        }
        if (rj6Var instanceof nj6) {
            return null;
        }
        if (rj6Var instanceof pj6) {
            throw ((pj6) rj6Var).a();
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        if (d(r12, r10, false, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, boolean z, boolean z2, cg6 cg6Var) {
        ljw ljwVar;
        int i;
        List list2;
        if (cg6Var instanceof ljw) {
            ljwVar = (ljw) cg6Var;
            int i2 = ljwVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ljwVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ljwVar.m;
                Object obj2 = nm6.a;
                i = ljwVar.o;
                qkw qkwVar = this.h;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    sfw sfwVar = this.c;
                    if (!z2) {
                        if (!list.isEmpty()) {
                            jkw jkwVar = sfwVar.b;
                            ljwVar.j = null;
                            ljwVar.k = z;
                            ljwVar.l = z2;
                            ljwVar.o = 4;
                            obj = jkwVar.e(list, z, ljwVar);
                        }
                        return Unit.a;
                    }
                    b9n b9nVar = sfwVar.a;
                    ljwVar.j = list;
                    ljwVar.k = z;
                    ljwVar.l = z2;
                    ljwVar.o = 1;
                    b9nVar.getClass();
                    obj = x97.V(dm6.c, new c5l(list, b9nVar, continuation, 20), ljwVar);
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        List list3 = ljwVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 3) {
                        List list4 = ljwVar.j;
                        qgg.h0(obj);
                        list2 = (List) obj;
                        qkwVar.b(list2);
                        return Unit.a;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list5 = ljwVar.j;
                    qgg.h0(obj);
                    list2 = (List) obj;
                    qkwVar.b(list2);
                    return Unit.a;
                }
                z2 = ljwVar.l;
                z = ljwVar.k;
                list = ljwVar.j;
                qgg.h0(obj);
                List list6 = (List) obj;
                qkwVar.b(list6);
                if (list6.size() < list.size()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((mqs) it.next()).a);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!hashSet.contains(((iiw) obj3).c)) {
                            arrayList.add(obj3);
                        }
                    }
                    ljwVar.j = null;
                    ljwVar.k = z;
                    ljwVar.l = z2;
                    ljwVar.o = 2;
                }
                return Unit.a;
            }
        }
        ljwVar = new ljw(this, cg6Var);
        Object obj4 = ljwVar.m;
        Object obj22 = nm6.a;
        i = ljwVar.o;
        qkw qkwVar2 = this.h;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, cg6 cg6Var) {
        mjw mjwVar;
        Object obj;
        int i;
        List list2;
        if (cg6Var instanceof mjw) {
            mjwVar = (mjw) cg6Var;
            int i2 = mjwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mjwVar.m = i2 - Integer.MIN_VALUE;
                obj = mjwVar.k;
                Object obj2 = nm6.a;
                i = mjwVar.m;
                sfw sfwVar = this.c;
                Continuation continuation = null;
                if (i == 0) {
                    if (i == 1) {
                        List list3 = mjwVar.j;
                        qgg.h0(obj);
                        list2 = (List) obj;
                    } else if (i == 2) {
                        list = mjwVar.j;
                        qgg.h0(obj);
                    } else if (i == 3) {
                        List list4 = mjwVar.j;
                        qgg.h0(obj);
                        list2 = (List) obj;
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list5 = mjwVar.j;
                        qgg.h0(obj);
                        list2 = (List) obj;
                    }
                    qkw qkwVar = this.h;
                    qkwVar.getClass();
                    list2.getClass();
                    if (!list2.isEmpty()) {
                        v3w.k("keep video clips ", list2.size(), 2, qkw.d, null);
                        ReentrantLock reentrantLock = qkwVar.a;
                        reentrantLock.lock();
                        try {
                            qkwVar.c.d(list2);
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                jkw jkwVar = sfwVar.b;
                mjwVar.j = list;
                mjwVar.m = 2;
                obj = jkwVar.f(list, mjwVar);
                if (((List) obj).isEmpty()) {
                    obj = null;
                }
                list2 = (List) obj;
                if (list2 == null) {
                    b9n b9nVar = sfwVar.a;
                    mjwVar.j = null;
                    mjwVar.m = 3;
                    b9nVar.getClass();
                    obj = x97.V(dm6.c, new ta2(list, continuation, 2), mjwVar);
                }
                qkw qkwVar2 = this.h;
                qkwVar2.getClass();
                list2.getClass();
                if (!list2.isEmpty()) {
                }
                return Unit.a;
            }
        }
        mjwVar = new mjw(this, cg6Var);
        obj = mjwVar.k;
        Object obj22 = nm6.a;
        i = mjwVar.m;
        sfw sfwVar2 = this.c;
        Continuation continuation2 = null;
        if (i == 0) {
        }
        if (((List) obj).isEmpty()) {
        }
        list2 = (List) obj;
        if (list2 == null) {
        }
        qkw qkwVar22 = this.h;
        qkwVar22.getClass();
        list2.getClass();
        if (!list2.isEmpty()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r10 == r3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, Function2 function2, Function2 function22, cg6 cg6Var) {
        njw njwVar;
        Function2 function23;
        akw akwVar;
        Function2 function24;
        akw akwVar2;
        Object g;
        sfw sfwVar = this.c;
        jkw jkwVar = sfwVar.b;
        b9n b9nVar = sfwVar.a;
        if (cg6Var instanceof njw) {
            njwVar = (njw) cg6Var;
            int i = njwVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                njwVar.p = i - Integer.MIN_VALUE;
                Object obj = njwVar.n;
                nm6 nm6Var = nm6.a;
                Continuation continuation = null;
                switch (njwVar.p) {
                    case 0:
                        qgg.h0(obj);
                        if (z) {
                            njwVar.k = null;
                            njwVar.l = null;
                            njwVar.j = z;
                            njwVar.p = 1;
                            Object invoke = function2.invoke(b9nVar, njwVar);
                            if (invoke != nm6Var) {
                                return invoke;
                            }
                        } else if (rgw.a()) {
                            njwVar.k = null;
                            njwVar.l = (aur) function22;
                            njwVar.j = z;
                            njwVar.p = 2;
                            obj = function2.invoke(b9nVar, njwVar);
                            function24 = function22;
                            break;
                        } else {
                            njwVar.k = (aur) function2;
                            njwVar.l = null;
                            njwVar.m = this;
                            njwVar.j = z;
                            njwVar.p = 4;
                            obj = function22.invoke(jkwVar, njwVar);
                            if (obj != nm6Var) {
                                function23 = function2;
                                akwVar = this;
                                w90 w90Var = new w90(function23, this, continuation, 20);
                                njwVar.k = null;
                                njwVar.l = null;
                                njwVar.m = null;
                                njwVar.j = z;
                                njwVar.p = 5;
                                g = akwVar.g((rj6) obj, w90Var, njwVar);
                                if (g != nm6Var) {
                                    return g;
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        qgg.h0(obj);
                        return obj;
                    case 2:
                        z = njwVar.j;
                        Function2 function25 = (Function2) njwVar.l;
                        qgg.h0(obj);
                        function24 = function25;
                        if (obj != null) {
                            return obj;
                        }
                        njwVar.k = null;
                        njwVar.l = null;
                        njwVar.m = this;
                        njwVar.j = z;
                        njwVar.p = 3;
                        obj = function24.invoke(jkwVar, njwVar);
                        if (obj != nm6Var) {
                            akwVar2 = this;
                            akwVar2.getClass();
                            return k((rj6) obj);
                        }
                        return nm6Var;
                    case 3:
                        akwVar2 = njwVar.m;
                        qgg.h0(obj);
                        akwVar2.getClass();
                        return k((rj6) obj);
                    case 4:
                        z = njwVar.j;
                        akwVar = njwVar.m;
                        function23 = (Function2) njwVar.k;
                        qgg.h0(obj);
                        w90 w90Var2 = new w90(function23, this, continuation, 20);
                        njwVar.k = null;
                        njwVar.l = null;
                        njwVar.m = null;
                        njwVar.j = z;
                        njwVar.p = 5;
                        g = akwVar.g((rj6) obj, w90Var2, njwVar);
                        if (g != nm6Var) {
                            return nm6Var;
                        }
                        break;
                    case 5:
                        qgg.h0(obj);
                        return obj;
                    case 6:
                        akw akwVar3 = njwVar.m;
                        qgg.h0(obj);
                        akwVar3.getClass();
                        return k((rj6) obj);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        njwVar = new njw(this, cg6Var);
        Object obj2 = njwVar.n;
        nm6 nm6Var2 = nm6.a;
        Continuation continuation2 = null;
        switch (njwVar.p) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(rj6 rj6Var, w90 w90Var, cg6 cg6Var) {
        ojw ojwVar;
        Object obj;
        int i;
        if (cg6Var instanceof ojw) {
            ojwVar = (ojw) cg6Var;
            int i2 = ojwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ojwVar.m = i2 - Integer.MIN_VALUE;
                obj = ojwVar.k;
                Object obj2 = nm6.a;
                i = ojwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (rj6Var instanceof qj6) {
                        return ((qj6) rj6Var).a;
                    }
                    if (rj6Var instanceof nj6) {
                        ojwVar.j = null;
                        ojwVar.m = 1;
                        Object invoke = w90Var.invoke(ojwVar);
                        if (invoke != obj2) {
                            return invoke;
                        }
                    } else {
                        if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        ojwVar.j = (pj6) rj6Var;
                        ojwVar.m = 2;
                        obj = w90Var.invoke(ojwVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rj6Var = ojwVar.j;
                qgg.h0(obj);
                if (obj == null) {
                    return obj;
                }
                throw ((pj6) rj6Var).a();
            }
        }
        ojwVar = new ojw(this, cg6Var);
        obj = ojwVar.k;
        Object obj22 = nm6.a;
        i = ojwVar.m;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(u9n u9nVar, z4q z4qVar, Map map, cg6 cg6Var) {
        tjw tjwVar;
        int i;
        ilw ilwVar;
        if (cg6Var instanceof tjw) {
            tjwVar = (tjw) cg6Var;
            int i2 = tjwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tjwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tjwVar.j;
                nm6 nm6Var = nm6.a;
                i = tjwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    tjwVar.l = 1;
                    obj = ((bew) this.g.getValue()).a(new vx4(u9nVar, this, z4qVar, map, (Continuation) null), tjwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ilwVar = (ilw) obj;
                if (!(ilwVar instanceof glw)) {
                    return new xiw((ejw) ((glw) ilwVar).a);
                }
                if (ilwVar instanceof flw) {
                    return new wiw(((flw) ilwVar).a);
                }
                if (ilwVar instanceof hlw) {
                    return new yiw(((hlw) ilwVar).a);
                }
                b6e.s();
                return null;
            }
        }
        tjwVar = new tjw(this, cg6Var);
        Object obj2 = tjwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tjwVar.l;
        if (i != 0) {
        }
        ilwVar = (ilw) obj2;
        if (!(ilwVar instanceof glw)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (defpackage.y2x.o(500, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(u9n u9nVar, z4q z4qVar, Map map, int i, cg6 cg6Var) {
        vjw vjwVar;
        int i2;
        int i3;
        z4q z4qVar2;
        int i4;
        int i5;
        u9n u9nVar2;
        ziw ziwVar;
        int i6;
        if (cg6Var instanceof vjw) {
            vjwVar = (vjw) cg6Var;
            int i7 = vjwVar.q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                vjwVar.q = i7 - Integer.MIN_VALUE;
                Object obj = vjwVar.o;
                Object obj2 = nm6.a;
                i2 = vjwVar.q;
                if (i2 != 0) {
                    qgg.h0(obj);
                    i3 = 0;
                    i6 = i3 + 1;
                    if (i6 <= i) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = vjwVar.n;
                        i4 = vjwVar.m;
                        map = vjwVar.l;
                        z4qVar2 = vjwVar.k;
                        u9nVar2 = vjwVar.j;
                        qgg.h0(obj);
                        z4q z4qVar3 = z4qVar2;
                        i = i4;
                        z4qVar = z4qVar3;
                        i3 = i5;
                        u9nVar = u9nVar2;
                        i6 = i3 + 1;
                        if (i6 <= i) {
                            return new yiw(String.valueOf(u9nVar.a));
                        }
                        vjwVar.j = u9nVar;
                        vjwVar.k = z4qVar;
                        vjwVar.l = map;
                        vjwVar.m = i;
                        vjwVar.n = i6;
                        vjwVar.q = 1;
                        Object h = h(u9nVar, z4qVar, map, vjwVar);
                        if (h != obj2) {
                            u9nVar2 = u9nVar;
                            i5 = i6;
                            obj = h;
                            int i8 = i;
                            z4qVar2 = z4qVar;
                            i4 = i8;
                            ziwVar = (ziw) obj;
                            if (ziwVar instanceof xiw) {
                                return ziwVar;
                            }
                            if (ziwVar instanceof yiw) {
                                return ziwVar;
                            }
                            if (!(ziwVar instanceof wiw)) {
                                b6e.s();
                                return null;
                            }
                            vjwVar.j = u9nVar2;
                            vjwVar.k = z4qVar2;
                            vjwVar.l = map;
                            vjwVar.m = i4;
                            vjwVar.n = i5;
                            vjwVar.q = 2;
                        }
                        return obj2;
                    }
                    i5 = vjwVar.n;
                    i4 = vjwVar.m;
                    map = vjwVar.l;
                    z4qVar2 = vjwVar.k;
                    u9nVar2 = vjwVar.j;
                    qgg.h0(obj);
                    ziwVar = (ziw) obj;
                    if (ziwVar instanceof xiw) {
                    }
                }
            }
        }
        vjwVar = new vjw(this, cg6Var);
        Object obj3 = vjwVar.o;
        Object obj22 = nm6.a;
        i2 = vjwVar.q;
        if (i2 != 0) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 pqw, still in use, count: 4, list:
          (r9v2 pqw) from 0x05a9: MOVE (r37v1 pqw) = (r9v2 pqw) (LINE:1450)
          (r9v2 pqw) from 0x051b: MOVE (r37v2 pqw) = (r9v2 pqw) (LINE:1308)
          (r9v2 pqw) from 0x04e3: MOVE (r37v7 pqw) = (r9v2 pqw) (LINE:1252)
          (r9v2 pqw) from 0x0328: MOVE (r37v14 pqw) = (r9v2 pqw) (LINE:809)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Iterable, java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.util.List] */
    public final java.lang.Object j(defpackage.orw r37, defpackage.cg6 r38) {
        /*
            Method dump skipped, instructions count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akw.j(orw, cg6):java.lang.Object");
    }
}
