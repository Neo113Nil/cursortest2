package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.at0;
import defpackage.bj0;
import defpackage.boj0;
import defpackage.bt0;
import defpackage.cu0;
import defpackage.dv8;
import defpackage.f4l0;
import defpackage.g8l0;
import defpackage.gzh;
import defpackage.hwy0;
import defpackage.is0;
import defpackage.j5s;
import defpackage.js0;
import defpackage.m2v;
import defpackage.nt0;
import defpackage.o5s;
import defpackage.oy60;
import defpackage.p4;
import defpackage.p6s;
import defpackage.qg90;
import defpackage.qs0;
import defpackage.qt0;
import defpackage.rt0;
import defpackage.s5s;
import defpackage.sb0;
import defpackage.st0;
import defpackage.tt0;
import defpackage.vv0;
import defpackage.xe00;
import defpackage.xt0;
import defpackage.xvf0;
import defpackage.yj70;
import defpackage.z4s;
import defpackage.zqb0;
import java.util.List;

/* loaded from: classes5.dex */
public final class a {
    public final dv8 a;
    public final ru.yandex.taxi.logistics.sdk.address_details.api.b b;
    public final f4l0 c;
    public final qt0 d;
    public final cu0 e;
    public final p6s f;
    public final yj70 g;
    public final zqb0 h;
    public final m2v i;
    public final xt0 j;
    public final xe00 k;
    public final gzh l;
    public final oy60 m;
    public final boj0 n;
    public final c o;
    public final m2v p;
    public final ru.yandex.taxi.logistics.sdk.photocomments.domain.a q;

    public a(dv8 dv8Var, ru.yandex.taxi.logistics.sdk.address_details.api.b bVar, f4l0 f4l0Var, qt0 qt0Var, cu0 cu0Var, p6s p6sVar, yj70 yj70Var, zqb0 zqb0Var, m2v m2vVar, xt0 xt0Var, xe00 xe00Var, gzh gzhVar, oy60 oy60Var, boj0 boj0Var, c cVar, m2v m2vVar2, ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar) {
        this.a = dv8Var;
        this.b = bVar;
        this.c = f4l0Var;
        this.d = qt0Var;
        this.e = cu0Var;
        this.f = p6sVar;
        this.g = yj70Var;
        this.h = zqb0Var;
        this.i = m2vVar;
        this.j = xt0Var;
        this.k = xe00Var;
        this.l = gzhVar;
        this.m = oy60Var;
        this.n = boj0Var;
        this.o = cVar;
        this.p = m2vVar2;
        this.q = aVar;
    }

    public static void a(a aVar, Integer num, g8l0 g8l0Var, int i) {
        qg90 qg90Var;
        List list;
        Integer num2 = (i & 1) != 0 ? null : num;
        int i2 = 2;
        g8l0 g8l0Var2 = (i & 2) != 0 ? null : g8l0Var;
        m2v m2vVar = aVar.i;
        j5s j5sVar = (j5s) ((o5s) m2vVar.a).c.a.getValue();
        at0 at0Var = j5sVar != null ? j5sVar.d : null;
        if (j5sVar == null || (list = j5sVar.f) == null) {
            qg90Var = null;
        } else {
            ((yj70) m2vVar.b).getClass();
            qg90Var = yj70.j(num2, g8l0Var2, list);
        }
        if (qg90Var != null) {
            at0Var = qg90Var.a;
        }
        boolean z = (at0Var != null ? at0Var.k : null) != null;
        st0 st0Var = aVar.d.a;
        ru.yandex.taxi.logistics.sdk.address_details.api.b.a(aVar.b, null, new AddressDetailsInteractor$openDetails$1(3, aVar, a.class, "openAddressWithCommentCheck", "openAddressWithCommentCheck(ILcom/yandex/delivery/mapper/model/AddressFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new AddressDetailsInteractor$openDetails$2(aVar, null), new bj0(5, aVar), null, new sb0(i2, aVar, num2, g8l0Var2), null, aVar.q.e(aVar.l), new qs0(new rt0(num2, g8l0Var2, (f4l0) ((xvf0) st0Var.a).get(), (m2v) ((p4) st0Var.B).get(), (is0) ((js0) st0Var.C).get(), (p6s) ((xvf0) st0Var.b).get(), (z4s) ((xvf0) st0Var.c).get(), (ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c) ((nt0) st0Var.D).get(), (tt0) ((xvf0) st0Var.w).get(), (bt0) ((xvf0) st0Var.x).get(), (hwy0) ((xvf0) st0Var.y).get(), (vv0) ((xvf0) st0Var.z).get(), (s5s) ((xvf0) st0Var.A).get()), aVar.c, aVar.e, aVar.j, aVar.m), z, 161);
    }
}
