package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import defpackage.bvf0;
import defpackage.cd0;
import defpackage.d37;
import defpackage.ds0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.ja9;
import defpackage.k5c;
import defpackage.la9;
import defpackage.na9;
import defpackage.pez0;
import defpackage.qrg;
import defpackage.r57;
import defpackage.tcc;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ybu;
import defpackage.yr31;
import defpackage.yxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public final r0 A;
    public final r0 B;
    public final gci0 C;
    public final gci0 D;
    public final r0 E;
    public final r0 F;
    public final gci0 G;
    public final la9 b;
    public final na9 c;
    public final ds0 w;
    public final ru.yandex.taxi.logistics.sdk.delivery.edit.b x;
    public final ybu y;
    public final yxi z;

    public d(la9 la9Var, na9 na9Var, ds0 ds0Var, ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar) {
        this.b = la9Var;
        this.c = na9Var;
        this.w = ds0Var;
        this.x = bVar;
        this.y = new ybu(la9Var.b);
        String str = la9Var.c;
        this.z = str != null ? new yxi(str) : null;
        r0 c = bvf0.c(0);
        this.A = c;
        r0 c2 = bvf0.c(0);
        this.B = c2;
        m0 m0Var = new m0(c, c2, new ChangeDateTimeViewModel$selectedTimeslotFlow$1(this, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        gci0 R = e.R(m0Var, a, wsr0.a(wsr0Var, 3), null);
        this.C = R;
        this.D = e.R(new cd0(20, c, this), ds31.a(this), wsr0.a(wsr0Var, 3), W(0));
        Boolean bool = Boolean.TRUE;
        r0 c3 = bvf0.c(new Pair(bool, bool));
        this.E = c3;
        Boolean bool2 = Boolean.FALSE;
        r0 c4 = bvf0.c(new Pair(bool2, bool2));
        this.F = c4;
        this.G = e.R(e.n(c3, c4, R, new ChangeDateTimeViewModel$buttonsFlow$1(this, null)), ds31.a(this), wsr0.a(wsr0Var, 3), new r57(new d37(la9Var.w, 14, false, false), new d37(la9Var.x, 14, false, false)));
    }

    public final qrg W(int i) {
        la9 la9Var = this.b;
        List list = la9Var.y;
        List list2 = la9Var.y;
        if (i >= list.size() || ((ja9) list2.get(i)).b.isEmpty()) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((ja9) it.next()).a);
        }
        ArrayList arrayList2 = ((ja9) list2.get(i)).b;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((pez0) it2.next()).a);
        }
        return new qrg(arrayList, arrayList3);
    }
}
