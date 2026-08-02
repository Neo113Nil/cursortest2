package ru.yandex.taxi.costcenters.selection;

import defpackage.b1;
import defpackage.e3n;
import defpackage.ewe;
import defpackage.ffx;
import defpackage.fwe;
import defpackage.hwe;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.lxe;
import defpackage.mxe;
import defpackage.nxe;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.rxe;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.uwe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final class b extends fwe {
    public final lxe A;
    public rxe B;
    public final n0 C;
    public pzt0 D;
    public pzt0 E;
    public final tt2 z;

    public b(uwe uweVar, tt2 tt2Var, lxe lxeVar, hwe hweVar) {
        super(nxe.class, uweVar, hweVar);
        this.z = tt2Var;
        this.A = lxeVar;
        this.B = new rxe(EmptyList.a, null, null);
        this.C = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public static final boolean Og(b bVar, List list, mxe mxeVar) {
        if (mxeVar == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((mxe) it.next()).a, mxeVar.a)) {
                return true;
            }
        }
        return false;
    }

    public static final void Pg(b bVar, ArrayList arrayList, boolean z) {
        boolean z2;
        rxe rxeVar = bVar.B;
        if (!rxeVar.e) {
            ((nxe) bVar.Dg()).displayListResult(arrayList);
            return;
        }
        mxe mxeVar = rxeVar.b;
        mxe mxeVar2 = rxeVar.d;
        String str = mxeVar2.a;
        if (bVar.x.c.e != CostCenterField.InputFormat.MIXED || str.length() <= 0) {
            z2 = false;
        } else {
            arrayList.add(0, mxeVar2);
            if (jl40.l(mxeVar, mxeVar2)) {
                z = true;
                z2 = true;
            } else {
                z2 = true;
            }
        }
        if (mxeVar != null) {
            String str2 = mxeVar.a;
            if (str2.length() > 0) {
                if (!(mxeVar2 != mxeVar ? jl40.l(str, str2) : true) && !z) {
                    arrayList.add(0, mxeVar);
                }
            }
        }
        ((nxe) bVar.Dg()).displayListResult(arrayList);
        if (z2) {
            ((nxe) bVar.Dg()).notifyItemChanged(0);
        }
    }

    public static final void Qg(b bVar, rxe rxeVar) {
        bVar.B = rxeVar;
        ((nxe) bVar.Dg()).hideProgress();
        rxe rxeVar2 = bVar.B;
        if (jl40.l(rxeVar2.b, rxeVar2.d)) {
            nxe nxeVar = (nxe) bVar.Dg();
            mxe mxeVar = bVar.B.b;
            nxeVar.setFilterValue(mxeVar != null ? mxeVar.a : null);
        }
        ((ewe) bVar.Dg()).enableDoneButton(bVar.Mg());
        String str = bVar.B.c;
        pzt0 pzt0Var = bVar.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.D = tje.N(bVar.Jg(), null, null, new CostCenterSelectionPresenter$loadFilteredItems$1(bVar, str, null), 3);
        ((nxe) bVar.Dg()).updateSelection(bVar.B.b);
        ((ewe) bVar.Dg()).enableDoneButton(bVar.Mg());
        jqr jqrVar = new jqr(e.t(bVar.C), new CostCenterSelectionPresenter$subscribeToFilterUpdates$1(bVar, null), 3);
        o430 o430Var = e3n.b;
        tje.N(bVar.Jg(), null, null, new CostCenterSelectionPresenter$subscribeToFilterUpdates$$inlined$safeCollectIn$1(e.q(jqrVar, kp50.U(300, DurationUnit.MILLISECONDS)), null, bVar), 3);
    }

    @Override // defpackage.fwe
    public final boolean Mg() {
        rxe rxeVar = this.B;
        uwe uweVar = this.x;
        uweVar.getClass();
        mxe mxeVar = rxeVar.b;
        return mxeVar == null ? uweVar.a(null) : uweVar.a(mxeVar.a);
    }

    @Override // defpackage.fwe
    public final void Ng() {
        lxe lxeVar = this.A;
        b1 b1Var = lxeVar.a;
        int i = lxeVar.b;
        boolean z = lxeVar.e;
        String str = lxeVar.c;
        int i2 = lxeVar.f;
        String str2 = lxeVar.d;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        hashMap.put("title", str);
        hashMap.put("total_elements", Integer.valueOf(i2));
        b1Var.a.a("CostCenterCard.FieldList.Confirm.Tapped", hashMap, 1, tse0.r("type", hashMap, str2));
        mxe mxeVar = this.B.b;
        String str3 = mxeVar != null ? mxeVar.a : null;
        uwe uweVar = this.x;
        uweVar.b.d(uweVar.c.a, str3);
        rxe rxeVar = this.B;
        mxe mxeVar2 = rxeVar.b;
        if (mxeVar2 != null) {
            mxe mxeVar3 = rxeVar.d;
            boolean l = mxeVar3 == mxeVar2 ? true : jl40.l(mxeVar3.a, mxeVar2.a);
            b1 b1Var2 = lxeVar.a;
            if (l) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("index", Integer.valueOf(i));
                hashMap2.put("is_required", Boolean.valueOf(z));
                hashMap2.put("title", str);
                hashMap2.put("total_elements", Integer.valueOf(i2));
                b1Var2.a.a("CostCenterCard.FieldList.Confirm.NewValueAdded", hashMap2, 1, tse0.r("type", hashMap2, str2));
                return;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("index", Integer.valueOf(i));
            hashMap3.put("is_required", Boolean.valueOf(z));
            hashMap3.put("title", str);
            hashMap3.put("total_elements", Integer.valueOf(i2));
            b1Var2.a.a("CostCenterCard.FieldList.Confirm.ValueSelected", hashMap3, 1, tse0.r("type", hashMap3, str2));
        }
    }
}
