package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import com.yandex.go.delivery.rental_duration_selector.e;
import defpackage.bbu;
import defpackage.bvf0;
import defpackage.czi0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.gzi0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k5c;
import defpackage.kzi0;
import defpackage.lvi0;
import defpackage.lze;
import defpackage.lzi0;
import defpackage.m8h;
import defpackage.mth;
import defpackage.pt6;
import defpackage.qt6;
import defpackage.rt6;
import defpackage.s9n;
import defpackage.st6;
import defpackage.tcc;
import defpackage.wbu;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public final r0 A;
    public final wbu B;
    public final gci0 C;
    public final gci0 D;
    public final lzi0 E;
    public final qt6 F;
    public final String G;
    public final e b;
    public final gzi0 c;
    public final s9n w;
    public final czi0 x;
    public final m8h y;
    public final gci0 z;

    public d(e eVar, gzi0 gzi0Var, s9n s9nVar, czi0 czi0Var, m8h m8hVar) {
        wbu wbuVar;
        qt6 qt6Var;
        lvi0 lvi0Var;
        this.b = eVar;
        this.c = gzi0Var;
        this.w = s9nVar;
        this.x = czi0Var;
        this.y = m8hVar;
        int i = 3;
        this.z = kotlinx.coroutines.flow.e.R(gzi0Var.x, ds31.a(this), wsr0.a(xsr0.a, 3), null);
        Iterator it = W().iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (jl40.l((kzi0) it.next(), this.x.b.getValue())) {
                break;
            } else {
                i3++;
            }
        }
        r0 c = bvf0.c(Integer.valueOf(i3 < 0 ? 0 : i3));
        this.A = c;
        bbu bbuVar = this.c.a;
        if (bbuVar != null) {
            s9n s9nVar2 = this.w;
            String str = bbuVar.a;
            String str2 = bbuVar.b;
            String str3 = bbuVar.c;
            if (str3 != null) {
                lvi0Var = new lvi0(s9nVar2.a.a(str3), null, null, null, null, 62);
            } else {
                s9nVar2.getClass();
                lvi0Var = null;
            }
            wbuVar = new wbu(str, str2, lvi0Var, bbuVar.d);
        } else {
            wbuVar = null;
        }
        this.B = wbuVar;
        lzi0 lzi0Var = new lzi0(this.c.x, this, i2);
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        this.C = kotlinx.coroutines.flow.e.R(lzi0Var, a, wsr0.a(wsr0Var, 3), null);
        this.D = kotlinx.coroutines.flow.e.R(new m0(c, this.z, new RentalDurationViewModel$counterFlow$1(this, null)), ds31.a(this), wsr0.a(wsr0Var, 3), null);
        gzi0 gzi0Var2 = this.c;
        this.E = new lzi0(gzi0Var2.w, this, 1);
        pt6 pt6Var = gzi0Var2.b;
        if (pt6Var != null) {
            this.w.getClass();
            ArrayList<rt6> arrayList = pt6Var.a;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (rt6 rt6Var : arrayList) {
                    arrayList2.add(new st6(rt6Var.a, rt6Var.b));
                }
                qt6Var = new qt6(arrayList2);
                this.F = qt6Var;
                this.G = this.c.c;
                kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(kotlinx.coroutines.flow.e.t(new mth(this.A, 4)), new RentalDurationViewModel$launchAnalyticsUpdates$1(this, null), i));
                kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(this.z, new RentalDurationViewModel$launchIndexUpdating$1(this, null), i));
            }
        }
        qt6Var = null;
        this.F = qt6Var;
        this.G = this.c.c;
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(kotlinx.coroutines.flow.e.t(new mth(this.A, 4)), new RentalDurationViewModel$launchAnalyticsUpdates$1(this, null), i));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(this.z, new RentalDurationViewModel$launchIndexUpdating$1(this, null), i));
    }

    public final List W() {
        lze lzeVar = (lze) this.z.a.getValue();
        return lzeVar != null ? lzeVar.c : EmptyList.a;
    }

    public final void X(int i) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.A;
            value = r0Var.getValue();
            ((Number) value).intValue();
        } while (!r0Var.k(value, Integer.valueOf(i)));
        this.x.a.l((kzi0) W().get(i));
    }
}
