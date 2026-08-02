package defpackage;

import android.content.Context;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.core.locale.a;
import com.yandex.plus.home.analytics.c;
import com.yandex.plus.home.graphql.panel.g;
import com.yandex.plus.home.graphql.plusstate.f;
import com.yandex.plus.home.graphql.user.e;
import com.yandex.plus.home.h;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.adapter.api.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class z8f {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public z8f(Context context, mqs mqsVar, zus zusVar, brs brsVar, fnb fnbVar, oxa oxaVar, jtc jtcVar) {
        context.getClass();
        mqsVar.getClass();
        zusVar.getClass();
        brsVar.getClass();
        brsVar.getClass();
        this.a = mqsVar;
        this.b = zusVar;
        this.d = brsVar;
        this.c = c5b.a;
        this.g = new rjq(false);
        this.i = context;
        this.j = mqsVar;
        this.k = oxaVar;
        rjq rjqVar = new rjq(false);
        this.h = rjqVar;
        this.l = hld.s(rjqVar, dm6.b());
        bdt I = hag.I(k68.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = l18Var.b(hag.I(z66.class), true);
        pwl pwlVar = new pwl(fnbVar, 1);
        this.o = pwlVar;
        String G = fnbVar.G();
        String str = mqsVar.a;
        String str2 = mqsVar.c;
        k10 k10Var = mqsVar.d;
        tjb H = fgq.H(k10Var.d());
        String str3 = k10Var.a;
        String str4 = k10Var.d;
        nmb nmbVar = pwlVar.b;
        nmbVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str);
        linkedHashMap.put("track_name", str2);
        linkedHashMap.put("album_type", H.a);
        linkedHashMap.put("album_id", str3);
        linkedHashMap.put("album_name", str4);
        dfi.p(1, "hash", G, "_meta", linkedHashMap);
        nmbVar.C("TrackActions.Loaded", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(cg6 cg6Var) {
        y8f y8fVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        if (cg6Var instanceof y8f) {
            y8fVar = (y8f) cg6Var;
            int i5 = y8fVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                y8fVar.q = i5 - Integer.MIN_VALUE;
                Object obj = y8fVar.o;
                nm6 nm6Var = nm6.a;
                i = y8fVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(((mqs) this.j).h());
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = m.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = y8fVar.n;
                    i2 = y8fVar.m;
                    i4 = y8fVar.l;
                    it = y8fVar.k;
                    collection = y8fVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    if (a58Var != null) {
                        collection.add(a58Var);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = (k68) ((jyr) this.m).getValue();
                        y8fVar.j = collection;
                        y8fVar.k = it;
                        y8fVar.l = i4;
                        y8fVar.m = i2;
                        y8fVar.n = i3;
                        y8fVar.q = 1;
                        obj = k68Var.a(hs5Var, y8fVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        a58 a58Var2 = (a58) obj;
                        if (a58Var2 != null) {
                        }
                        if (it.hasNext()) {
                            List list = (List) collection;
                            if (list.isEmpty()) {
                                list = null;
                            }
                            if (list != null) {
                                return new n68(list);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        y8fVar = new y8f(this, cg6Var);
        Object obj2 = y8fVar.o;
        nm6 nm6Var2 = nm6.a;
        i = y8fVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(cg6 cg6Var) {
        t8f t8fVar;
        int i;
        p8f p8fVar;
        if (cg6Var instanceof t8f) {
            t8fVar = (t8f) cg6Var;
            int i2 = t8fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t8fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = t8fVar.k;
                Object obj2 = nm6.a;
                i = t8fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    p8f p8fVar2 = (p8f) this.e;
                    if (p8fVar2 != null) {
                        t8fVar.j = p8fVar2;
                        t8fVar.m = 1;
                        Object a = a(t8fVar);
                        if (a == obj2) {
                            return obj2;
                        }
                        p8fVar = p8fVar2;
                        obj = a;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p8fVar = t8fVar.j;
                qgg.h0(obj);
                p8fVar.h = (n68) obj;
                p8fVar.c();
                return Unit.a;
            }
        }
        t8fVar = new t8f(this, cg6Var);
        Object obj3 = t8fVar.k;
        Object obj22 = nm6.a;
        i = t8fVar.m;
        if (i != 0) {
        }
        p8fVar.h = (n68) obj3;
        p8fVar.c();
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(cg6 cg6Var) {
        u8f u8fVar;
        int i;
        Object obj;
        p8f p8fVar;
        if (cg6Var instanceof u8f) {
            u8fVar = (u8f) cg6Var;
            int i2 = u8fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u8fVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = u8fVar.k;
                nm6 nm6Var = nm6.a;
                i = u8fVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    p8f p8fVar2 = (p8f) this.e;
                    if (p8fVar2 != null) {
                        u8fVar.j = p8fVar2;
                        u8fVar.m = 1;
                        mqs mqsVar = (mqs) this.j;
                        if (u2x.K(mqsVar.d) || a4g.D(gys.AudioBookHolder, mqsVar) || mqsVar.C() || mqsVar.k != dg2.b || !((z66) ((jyr) this.n).getValue()).f()) {
                            obj = null;
                        } else {
                            obj = new yks((Context) this.i).e(new vtm(mqsVar), new lhd(14, this), u8fVar);
                            if (obj != nm6Var) {
                                obj = (n1u) obj;
                            }
                        }
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        Object obj3 = obj;
                        p8fVar = p8fVar2;
                        obj2 = obj3;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p8fVar = u8fVar.j;
                qgg.h0(obj2);
                p8fVar.g = (n1u) obj2;
                p8fVar.c();
                return Unit.a;
            }
        }
        u8fVar = new u8f(this, cg6Var);
        Object obj22 = u8fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = u8fVar.m;
        if (i != 0) {
        }
        p8fVar.g = (n1u) obj22;
        p8fVar.c();
        return Unit.a;
    }

    public z8f(b bVar, fkn fknVar, g gVar, e eVar, f fVar, j jVar, c cVar, com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar2, com.yandex.plus.core.theme.e eVar2, y yVar, a aVar, g0 g0Var, h hVar, com.yandex.plus.core.dispatcher.b bVar3, d dVar) {
        gVar.getClass();
        eVar.getClass();
        fVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        eVar2.getClass();
        g0Var.getClass();
        bVar3.getClass();
        this.a = bVar;
        this.b = fknVar;
        this.c = gVar;
        this.d = eVar;
        this.e = fVar;
        this.f = jVar;
        this.g = cVar;
        this.h = bVar2;
        this.i = eVar2;
        this.j = yVar;
        this.k = aVar;
        this.l = g0Var;
        this.m = hVar;
        this.n = bVar3;
        this.o = dVar;
    }
}
