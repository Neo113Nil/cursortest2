package ru.yandex.taxi.preorder.suggested;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.suggest.AdditionalSuggest;
import com.yandex.go.suggest.DestinationSuggest;
import defpackage.cgf;
import defpackage.dgf;
import defpackage.evu0;
import defpackage.g92;
import defpackage.gu11;
import defpackage.ic61;
import defpackage.igf;
import defpackage.k7x0;
import defpackage.kc61;
import defpackage.ktj0;
import defpackage.m7x0;
import defpackage.mtj0;
import defpackage.ntj0;
import defpackage.pdc;
import defpackage.q5z;
import defpackage.rol0;
import defpackage.rwp0;
import defpackage.scc;
import defpackage.sw41;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.w9v0;
import defpackage.x9v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes6.dex */
public final class i {
    public final k7x0 a;
    public final rwp0 b;
    public final ru.yandex.taxi.search.address.model.a c;
    public final com.yandex.go.route.interactor.c d;
    public final gu11 e;
    public final igf f;
    public final cgf g;
    public final dgf h;
    public final pdc i;
    public final com.yandex.go.address.search.perf.c j;
    public ic61 k;

    public i(k7x0 k7x0Var, rwp0 rwp0Var, ru.yandex.taxi.search.address.model.a aVar, com.yandex.go.route.interactor.c cVar, gu11 gu11Var, igf igfVar, cgf cgfVar, dgf dgfVar, pdc pdcVar, com.yandex.go.address.search.perf.c cVar2) {
        this.a = k7x0Var;
        this.b = rwp0Var;
        this.c = aVar;
        this.d = cVar;
        this.e = gu11Var;
        this.f = igfVar;
        this.g = cgfVar;
        this.h = dgfVar;
        this.i = pdcVar;
        this.j = cVar2;
        ic61 ic61Var = ic61.c;
        this.k = ic61.c;
    }

    public final ic61 a(List list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            x9v0 x9v0Var = null;
            r4 = null;
            String str = null;
            if (!it.hasNext()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                int i2 = kc61.a[this.b.a.ordinal()];
                if (i2 == 1) {
                    x9v0Var = this.f.b();
                } else if (i2 == 2) {
                    x9v0Var = this.g.b();
                } else if (i2 == 3) {
                    x9v0Var = this.h.b();
                }
                if (x9v0Var != null) {
                    arrayList3.add(x9v0Var);
                    arrayList.add(PlainAddress.a);
                }
                ic61 ic61Var = new ic61(arrayList, arrayList3);
                this.k = ic61Var;
                return ic61Var;
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            DestinationSuggest destinationSuggest = (DestinationSuggest) next;
            int i4 = x9v0.P;
            w9v0 w9v0Var = new w9v0(i);
            boolean z = destinationSuggest instanceof Address;
            k7x0 k7x0Var = this.a;
            if (z) {
                Address address = (Address) destinationSuggest;
                String K = q5z.K(address);
                String D = q5z.D(address);
                w9v0Var.b = K;
                w9v0Var.f = D;
                w9v0Var.g = address.getAttributedSubtitle();
                String str2 = address.getAddress().n;
                w9v0Var.i = (str2 == null || evu0.J(str2)) ? null : ((m7x0) k7x0Var).a(str2);
                w9v0Var.o = address.d();
                w9v0Var.v = address;
                w9v0Var.y = address.getGroupId();
                String largeImageTag = address.getLargeImageTag();
                if (largeImageTag != null && !evu0.J(largeImageTag)) {
                    str = ((m7x0) k7x0Var).a(largeImageTag);
                }
                w9v0Var.u = str;
                w9v0Var.F = address.c2();
                w9v0Var.G = address.getSuggestAction();
                this.e.getClass();
            } else if (destinationSuggest instanceof AdditionalSuggest) {
                w9v0Var.a((AdditionalSuggest) destinationSuggest, this.i, k7x0Var);
            }
            arrayList2.add(new x9v0(w9v0Var));
            i = i3;
        }
    }

    public final tpr b(List list, boolean z) {
        int i = 2;
        if (this.k.a()) {
            return new o(new n(new b(this.c.b(z, this.b, list), this), new ZeroSuggestInteractorImpl$loadSuggestsFlow$2(2, null)), new ZeroSuggestInteractorImpl$loadSuggestsFlow$3(3, null));
        }
        mtj0 mtj0Var = ntj0.a;
        return new g92(i, new ktj0(this.k));
    }

    public final rol0 c(boolean z) {
        return new rol0(new ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1(this, kotlinx.coroutines.flow.e.s(new d(this.d.f()), new sw41(5)), z, null));
    }
}
