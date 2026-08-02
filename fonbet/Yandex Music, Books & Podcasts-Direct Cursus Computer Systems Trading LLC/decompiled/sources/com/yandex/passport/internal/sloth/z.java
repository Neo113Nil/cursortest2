package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.report.ze;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.xq0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class z {
    public final com.yandex.passport.common.analytics.k a;
    public final com.yandex.passport.common.common.a b;
    public final com.yandex.passport.internal.report.d c;
    public final com.yandex.passport.internal.properties.x d;

    public z(com.yandex.passport.common.analytics.k kVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.internal.report.d dVar, com.yandex.passport.internal.properties.x xVar) {
        kVar.getClass();
        aVar.getClass();
        dVar.getClass();
        xVar.getClass();
        this.a = kVar;
        this.b = aVar;
        this.c = dVar;
        this.d = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[LOOP:0: B:14:0x006b->B:16:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        x xVar;
        int i;
        int a;
        Iterator it;
        LinkedHashMap i2;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i3 = xVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xVar.l = i3 - Integer.MIN_VALUE;
                Object obj = xVar.j;
                nm6 nm6Var = nm6.a;
                i = xVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.b;
                    String a2 = dVar.a();
                    String b = dVar.b();
                    xVar.l = 1;
                    com.yandex.passport.common.analytics.k kVar = this.a;
                    kVar.getClass();
                    obj = com.yandex.passport.common.analytics.k.a(kVar, a2, b, xVar);
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
                Map map = (Map) obj;
                ArrayList a3 = this.c.a();
                a = tah.a(v75.o(a3, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                it = a3.iterator();
                while (it.hasNext()) {
                    ze zeVar = (ze) it.next();
                    linkedHashMap.put(zeVar.getName(), zeVar.getValue());
                }
                i2 = uah.i(map, linkedHashMap);
                com.yandex.passport.internal.properties.x xVar2 = this.d;
                String str = xVar2.u;
                return (str == null || StringsKt.U(str)) ? i2 : uah.i(i2, tah.b(new Pair("origin", xVar2.u)));
            }
        }
        xVar = new x(this, cg6Var);
        Object obj2 = xVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xVar.l;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        ArrayList a32 = this.c.a();
        a = tah.a(v75.o(a32, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
        it = a32.iterator();
        while (it.hasNext()) {
        }
        i2 = uah.i(map2, linkedHashMap2);
        com.yandex.passport.internal.properties.x xVar22 = this.d;
        String str2 = xVar22.u;
        if (str2 == null) {
            return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        y yVar;
        int i;
        Object f;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yVar.j;
                Object obj2 = nm6.a;
                i = yVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yVar.l = 1;
                    com.yandex.passport.common.analytics.k kVar = this.a;
                    kVar.getClass();
                    f = com.yandex.passport.common.analytics.k.f(kVar, yVar);
                    if (f == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                    f = bVar != null ? bVar.a : null;
                }
                return (String) f;
            }
        }
        yVar = new y(this, cg6Var);
        Object obj3 = yVar.j;
        Object obj22 = nm6.a;
        i = yVar.l;
        if (i != 0) {
        }
        return (String) f;
    }
}
