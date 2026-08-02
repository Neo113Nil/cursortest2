package defpackage;

import com.yandex.music.shared.bdui.trigger.network.TriggerApi;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerPollingRequestDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oi5 {
    public final mm6 a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final xdr e;
    public final by7 f;

    public oi5(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, frt frtVar) {
        tf6 e = gld.e(e.c(a4g.n(), dm6.b));
        this.a = e;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar3;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        xdr a = ydr.a(e5bVar);
        this.e = a;
        ox6.B(zsd.d0(zsd.b0(new d64(frtVar.g(), 18)), 1), e, new i64(15, this));
        this.f = asq.K(a, new z35(11, this));
    }

    public static xh5 a(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xh5 xh5Var = (xh5) obj;
            if (str == null || Intrinsics.d(xh5Var.b(), str)) {
                break;
            }
        }
        return (xh5) obj;
    }

    public static Object e(oi5 oi5Var, String str, String str2, cg6 cg6Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return oi5Var.d(str, str2, e5bVar, cg6Var);
    }

    public static void f(oi5 oi5Var, ArrayList arrayList) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        oi5Var.getClass();
        x97.y(oi5Var.a, null, null, new v3(oi5Var, arrayList, e5bVar, null, 20), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, String str, Map map, cg6 cg6Var) {
        ii5 ii5Var;
        int i;
        Pair pair;
        List list2;
        oi5 oi5Var;
        xyo xyoVar;
        Pair pair2;
        Object wyoVar;
        xh5 a;
        if (cg6Var instanceof ii5) {
            ii5Var = (ii5) cg6Var;
            int i2 = ii5Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ii5Var.o = i2 - Integer.MIN_VALUE;
                Object obj = ii5Var.m;
                nm6 nm6Var = nm6.a;
                i = ii5Var.o;
                if (i == 0) {
                    if (i == 1) {
                    } else if (i == 2) {
                        oi5Var = ii5Var.l;
                        str = ii5Var.k;
                        list2 = ii5Var.j;
                        qgg.h0(obj);
                    } else if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = ii5Var.j;
                    qgg.h0(obj);
                    return obj;
                }
                qgg.h0(obj);
                Map map2 = (Map) this.e.getValue();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pair = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    List list4 = (List) map2.get(str2);
                    xh5 a2 = list4 != null ? a(str, list4) : null;
                    pair = a2 != null ? new Pair(a2, str2) : null;
                    if (pair != null) {
                        break;
                    }
                }
                if (pair != null) {
                    xh5 xh5Var = (xh5) pair.a;
                    String str3 = (String) pair.b;
                    ii5Var.j = null;
                    ii5Var.k = null;
                    ii5Var.l = null;
                    ii5Var.o = 1;
                    Object j = j(xh5Var, str3, ii5Var);
                    if (j != nm6Var) {
                        return j;
                    }
                } else {
                    ik5 c = c();
                    ii5Var.j = list;
                    ii5Var.k = str;
                    ii5Var.l = this;
                    ii5Var.o = 2;
                    obj = c.a(((TriggerApi) c.a.getValue()).a(new TriggerPollingRequestDto(list, map)), ii5Var);
                    if (obj != nm6Var) {
                        list2 = list;
                        oi5Var = this;
                    }
                }
                xyoVar = (xyo) obj;
                ii5Var.j = null;
                ii5Var.k = null;
                ii5Var.l = null;
                ii5Var.o = 3;
                oi5Var.getClass();
                if (!(xyoVar instanceof vyo)) {
                    wyoVar = ivf.K((vyo) xyoVar);
                } else {
                    if (!(xyoVar instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    LinkedHashMap a3 = ((qk5) oi5Var.d.getValue()).a(uah.i((Map) oi5Var.e.getValue(), (Map) ((wyo) xyoVar).a));
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            pair2 = null;
                            break;
                        }
                        String str4 = (String) it2.next();
                        List list5 = (List) a3.get(str4);
                        pair2 = (list5 == null || (a = a(str, list5)) == null) ? null : new Pair(a, str4);
                        if (pair2 != null) {
                            break;
                        }
                    }
                    wyoVar = pair2 == null ? new wyo(null) : oi5Var.j((xh5) pair2.a, (String) pair2.b, ii5Var);
                }
                return wyoVar != nm6Var ? nm6Var : wyoVar;
            }
        }
        ii5Var = new ii5(this, cg6Var);
        Object obj2 = ii5Var.m;
        nm6 nm6Var2 = nm6.a;
        i = ii5Var.o;
        if (i == 0) {
        }
        xyoVar = (xyo) obj2;
        ii5Var.j = null;
        ii5Var.k = null;
        ii5Var.l = null;
        ii5Var.o = 3;
        oi5Var.getClass();
        if (!(xyoVar instanceof vyo)) {
        }
        if (wyoVar != nm6Var2) {
        }
    }

    public final ik5 c() {
        return (ik5) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, Map map, cg6 cg6Var) {
        ji5 ji5Var;
        int i;
        String str3;
        oi5 oi5Var;
        if (cg6Var instanceof ji5) {
            ji5Var = (ji5) cg6Var;
            int i2 = ji5Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ji5Var.o = i2 - Integer.MIN_VALUE;
                Object obj = ji5Var.m;
                nm6 nm6Var = nm6.a;
                i = ji5Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = (List) ((Map) this.e.getValue()).get(str);
                    xh5 a = list != null ? a(str2, list) : null;
                    if (a != null) {
                        ji5Var.j = null;
                        ji5Var.k = null;
                        ji5Var.l = null;
                        ji5Var.o = 1;
                        Object j = j(a, str, ji5Var);
                        if (j != nm6Var) {
                            return j;
                        }
                    } else {
                        ik5 c = c();
                        ji5Var.j = str;
                        ji5Var.k = str2;
                        ji5Var.l = this;
                        ji5Var.o = 2;
                        obj = c.b(str, map, ji5Var);
                        if (obj != nm6Var) {
                            str3 = str;
                            oi5Var = this;
                        }
                    }
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi5Var = ji5Var.l;
                str2 = ji5Var.k;
                str3 = ji5Var.j;
                qgg.h0(obj);
                ji5Var.j = null;
                ji5Var.k = null;
                ji5Var.l = null;
                ji5Var.o = 3;
                Object k = oi5Var.k((xyo) obj, str3, str2, ji5Var);
                return k != nm6Var ? nm6Var : k;
            }
        }
        ji5Var = new ji5(this, cg6Var);
        Object obj2 = ji5Var.m;
        nm6 nm6Var2 = nm6.a;
        i = ji5Var.o;
        if (i != 0) {
        }
        ji5Var.j = null;
        ji5Var.k = null;
        ji5Var.l = null;
        ji5Var.o = 3;
        Object k2 = oi5Var.k((xyo) obj2, str3, str2, ji5Var);
        if (k2 != nm6Var2) {
        }
    }

    public final void g(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        x97.y(this.a, null, null, new v3(21, this, str2, str, str3, (Continuation) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, e5b e5bVar, cg6 cg6Var) {
        li5 li5Var;
        int i;
        xdr xdrVar;
        Object value;
        Map map;
        String str3;
        oi5 oi5Var;
        if (cg6Var instanceof li5) {
            li5Var = (li5) cg6Var;
            int i2 = li5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                li5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = li5Var.l;
                nm6 nm6Var = nm6.a;
                i = li5Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    do {
                        xdrVar = this.e;
                        value = xdrVar.getValue();
                        map = (Map) value;
                        List list = (List) map.get(str);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (!Intrinsics.d(((xh5) obj2).c(), str2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            map = uah.j(map, new Pair(str, arrayList));
                        }
                    } while (!xdrVar.k(value, map));
                    ik5 c = c();
                    li5Var.j = str;
                    li5Var.k = this;
                    li5Var.n = 1;
                    obj = c.d(str, str2, e5bVar, li5Var);
                    if (obj != nm6Var) {
                        str3 = str;
                        oi5Var = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi5Var = li5Var.k;
                str3 = li5Var.j;
                qgg.h0(obj);
                li5Var.j = null;
                li5Var.k = null;
                li5Var.n = 2;
                Object k = oi5Var.k((xyo) obj, str3, null, li5Var);
                return k != nm6Var ? nm6Var : k;
            }
        }
        li5Var = new li5(this, cg6Var);
        Object obj3 = li5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = li5Var.n;
        if (i != 0) {
        }
        li5Var.j = null;
        li5Var.k = null;
        li5Var.n = 2;
        Object k2 = oi5Var.k((xyo) obj3, str3, null, li5Var);
        if (k2 != nm6Var2) {
        }
    }

    public final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        x97.y(this.a, null, null, new rc4(this, str, str2, null, 16), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(xh5 xh5Var, String str, cg6 cg6Var) {
        mi5 mi5Var;
        int i;
        xyo xyoVar;
        if (cg6Var instanceof mi5) {
            mi5Var = (mi5) cg6Var;
            int i2 = mi5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = mi5Var.k;
                nm6 nm6Var = nm6.a;
                i = mi5Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (xh5Var instanceof mh5) {
                        cj5 cj5Var = (cj5) this.c.getValue();
                        mh5 mh5Var = (mh5) xh5Var;
                        String str2 = mh5Var.a;
                        rv8 rv8Var = mh5Var.d;
                        mi5Var.j = mh5Var;
                        mi5Var.m = 1;
                        obj = cj5Var.b(str, str2, rv8Var, mi5Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return new wyo(xh5Var);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xh5Var = mi5Var.j;
                qgg.h0(obj);
                xyoVar = (xyo) obj;
                if (xyoVar instanceof vyo) {
                    return ivf.K((vyo) xyoVar);
                }
                return new wyo(xh5Var);
            }
        }
        mi5Var = new mi5(this, cg6Var);
        Object obj2 = mi5Var.k;
        nm6 nm6Var2 = nm6.a;
        i = mi5Var.m;
        if (i != 0) {
        }
        xyoVar = (xyo) obj2;
        if (xyoVar instanceof vyo) {
        }
        return new wyo(xh5Var);
    }

    public final Object k(xyo xyoVar, String str, String str2, cg6 cg6Var) {
        if (xyoVar instanceof vyo) {
            return ivf.K((vyo) xyoVar);
        }
        if (!(xyoVar instanceof wyo)) {
            b6e.s();
            return null;
        }
        List list = (List) ((qk5) this.d.getValue()).a(uah.j((Map) this.e.getValue(), new Pair(str, ((wyo) xyoVar).a))).get(str);
        if (list == null) {
            list = c5b.a;
        }
        xh5 a = a(str2, list);
        return a == null ? new wyo(null) : j(a, str, cg6Var);
    }
}
