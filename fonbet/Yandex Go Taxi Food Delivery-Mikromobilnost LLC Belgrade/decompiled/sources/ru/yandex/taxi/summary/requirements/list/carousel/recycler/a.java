package ru.yandex.taxi.summary.requirements.list.carousel.recycler;

import defpackage.fz8;
import defpackage.g0c;
import defpackage.gz8;
import defpackage.jt6;
import defpackage.n;
import defpackage.ox8;
import defpackage.pav;
import defpackage.pw8;
import defpackage.qoi0;
import defpackage.qw8;
import defpackage.rw8;
import defpackage.rx8;
import defpackage.s5o;
import defpackage.scc;
import defpackage.sx8;
import defpackage.tls;
import defpackage.tx8;
import defpackage.zxs;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class a {
    public final rw8 a;

    public a(rw8 rw8Var) {
        this.a = rw8Var;
    }

    public final qw8 a(tls tlsVar) {
        pav pavVar = (pav) this.a.a.get();
        pw8 pw8Var = new pw8(0, tlsVar);
        int i = fz8.V;
        g0c a = qoi0.a(ox8.class);
        zxs zxsVar = new zxs(a.a(), 0, null, EmptyList.a, null, new jt6(pavVar, 1));
        int i2 = gz8.V;
        List singletonList = Collections.singletonList(new s5o(CarouselSelectableItemViewHolder$Companion$itemType$1.b));
        g0c a2 = qoi0.a(rx8.class);
        zxs zxsVar2 = new zxs(a2.a(), 0, null, singletonList, null, new jt6(pavVar, 2));
        int i3 = fz8.V;
        List v = n.v(null);
        g0c a3 = qoi0.a(sx8.class);
        zxs zxsVar3 = new zxs(a3.a(), 0, null, v, null, new jt6(pavVar, 3));
        int i4 = fz8.V;
        List v2 = n.v(null);
        g0c a4 = qoi0.a(tx8.class);
        return new qw8(pw8Var, scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a4.a(), 0, null, v2, null, new jt6(pavVar, 4))), 0);
    }
}
