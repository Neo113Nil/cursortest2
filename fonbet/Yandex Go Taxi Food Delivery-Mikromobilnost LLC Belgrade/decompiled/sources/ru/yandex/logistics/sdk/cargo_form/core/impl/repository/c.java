package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.b6s;
import defpackage.b7s;
import defpackage.c7s;
import defpackage.cc7;
import defpackage.f4l0;
import defpackage.gci0;
import defpackage.gw00;
import defpackage.j0g;
import defpackage.j6s;
import defpackage.kei;
import defpackage.lei;
import defpackage.mth;
import defpackage.n1f;
import defpackage.p1f;
import defpackage.p6s;
import defpackage.r6s;
import defpackage.tpr;
import defpackage.v6s;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yqb0;
import defpackage.zqb0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c implements p6s {
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c a;
    public final r6s b;
    public final String c;
    public final zqb0 d;
    public final c7s e;
    public final gci0 f;

    public c(b6s b6sVar, ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c cVar, j0g j0gVar, r6s r6sVar, String str, f4l0 f4l0Var, com.yandex.go.logistics.cargo_flow.form.cost_centers.a aVar, p1f p1fVar, zqb0 zqb0Var, v6s v6sVar, ru.yandex.taxi.logistics.payment.a aVar2, c7s c7sVar) {
        this.a = cVar;
        this.b = r6sVar;
        this.c = str;
        this.d = zqb0Var;
        this.e = c7sVar;
        n1f n1fVar = new n1f(5, ((ru.yandex.taxi.logistics.sdk.dashboard.storage.c) j0gVar.a).b, j0gVar);
        tpr t = kotlinx.coroutines.flow.e.t(f4l0Var.d());
        tpr a = aVar.a();
        tpr a2 = p1fVar.a();
        lei leiVar = zqb0Var.a;
        gci0 d = kotlinx.coroutines.flow.e.d(leiVar.a);
        gci0 d2 = kotlinx.coroutines.flow.e.d(leiVar.b);
        r0 r0Var = zqb0Var.b;
        this.f = kotlinx.coroutines.flow.e.R(new n1f(10, new tpr[]{n1fVar, t, a, a2, kotlinx.coroutines.flow.e.t(new yqb0(kotlinx.coroutines.flow.e.n(d, d2, r0Var, new PickupPointsRepositoryImpl$routeFlow$1(4, null)), 0)), kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.d(leiVar.a), kotlinx.coroutines.flow.e.d(leiVar.b), r0Var, new PickupPointsRepositoryImpl$routeFlow$1(4, null))), aVar2.a, v6sVar.b, kotlinx.coroutines.flow.e.t(new cc7(c7sVar.a, str, 8))}, this), b6sVar, wsr0.a(xsr0.a, 3), null);
    }

    @Override // defpackage.p6s
    public final void a() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        LinkedHashMap linkedHashMap;
        zqb0 zqb0Var = this.d;
        r0 r0Var = zqb0Var.b;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.TRUE));
        lei leiVar = zqb0Var.a;
        r0 r0Var2 = leiVar.a;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, kei.e));
        r0 r0Var3 = leiVar.b;
        do {
            value3 = r0Var3.getValue();
        } while (!r0Var3.k(value3, Collections.singletonList(kei.f)));
        r0 r0Var4 = this.e.a;
        do {
            value4 = r0Var4.getValue();
            linkedHashMap = new LinkedHashMap((Map) value4);
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap.put((String) it.next(), new b7s(kotlin.collections.b.f(), true));
            }
        } while (!r0Var4.k(value4, linkedHashMap));
    }

    @Override // defpackage.p6s
    public final j6s b() {
        return (j6s) this.f.a.getValue();
    }

    @Override // defpackage.p6s
    public final void c(Object obj, String str) {
        this.e.a(this.c, gw00.e(new Pair(str, obj)));
    }

    @Override // defpackage.p6s
    public final void d(LinkedHashMap linkedHashMap) {
        this.e.a(this.c, linkedHashMap);
    }

    @Override // defpackage.p6s
    public final mth e() {
        return new mth(this.f, 6);
    }
}
