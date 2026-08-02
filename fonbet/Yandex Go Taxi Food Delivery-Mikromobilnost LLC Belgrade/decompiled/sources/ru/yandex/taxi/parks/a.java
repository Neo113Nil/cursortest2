package ru.yandex.taxi.parks;

import defpackage.ad5;
import defpackage.af90;
import defpackage.he90;
import defpackage.o1z;
import defpackage.pzt0;
import defpackage.qe90;
import defpackage.tcc;
import defpackage.tje;
import defpackage.x770;
import defpackage.ze90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public final ArrayList A;
    public final Set B;
    public int C;
    public boolean D;
    public pzt0 E;
    public final ze90 x;
    public final x770 y;
    public final ArrayList z;

    public a(ze90 ze90Var, x770 x770Var) {
        super(af90.class);
        this.x = ze90Var;
        this.y = x770Var;
        this.z = new ArrayList();
        this.A = new ArrayList();
        ze90Var.c.getClass();
        this.B = kotlin.collections.a.M0(EmptyList.a);
        this.C = -1;
        this.D = true;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        if (this.C == -1) {
            Lg();
        }
        Mg();
    }

    public final ArrayList Kg() {
        Set set;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            set = this.B;
            if (!hasNext) {
                break;
            }
            he90 he90Var = (he90) it.next();
            String str = he90Var.a;
            arrayList2.add(new qe90(str, he90Var.b, he90Var.g, he90Var.f, set.contains(str)));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (!this.D) {
            ArrayList arrayList4 = this.A;
            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                he90 he90Var2 = (he90) it2.next();
                String str2 = he90Var2.a;
                arrayList5.add(new qe90(str2, he90Var2.b, he90Var2.g, he90Var2.f, set.contains(str2)));
            }
            arrayList3.addAll(arrayList5);
        }
        return new ArrayList(arrayList3);
    }

    public final void Lg() {
        pzt0 pzt0Var = this.E;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            ArrayList Kg = Kg();
            Kg.add(o1z.a);
            ((af90) Dg()).G9(Kg);
            this.E = tje.N(Jg(), null, null, new ParksListPresenter$loadNextPageImpl$1(this, null), 3);
        }
    }

    public final void Mg() {
        ((af90) Dg()).G9(Kg());
    }
}
