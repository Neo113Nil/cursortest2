package ru.yandex.taxi.settings.main;

import com.yandex.go.payments.api.shared.model.BusinessAccountMenuItemPosition;
import com.yandex.go.payments.api.shared.model.EntryPoints;
import com.yandex.go.payments.api.shared.model.MenuEntryPoints;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.cw6;
import defpackage.jl40;
import defpackage.p500;
import defpackage.q500;
import defpackage.qw6;
import defpackage.rcc;
import defpackage.snr0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tmr0;
import defpackage.z500;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class NativeMenuPresenter$startSubscriptions$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List list;
        boolean z;
        MenuEntryPoints menuEntryPoints;
        Pair pair = (Pair) obj;
        f fVar = (f) this.receiver;
        q500 q500Var = (q500) fVar.C.get();
        List list2 = (List) pair.getSecond();
        List list3 = (List) pair.getFirst();
        ru.yandex.taxi.settings.support.g gVar = q500Var.b;
        boolean a = gVar.a();
        boolean l = gVar.c.a.l();
        ListBuilder a2 = rcc.a();
        Iterator it = list3.iterator();
        boolean z2 = a;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            tmr0 tmr0Var = (tmr0) it.next();
            qw6 qw6Var = q500Var.c;
            qw6Var.getClass();
            SharedAccountType a3 = tmr0Var.a();
            String str = tmr0Var.a;
            if (a3 != SharedAccountType.BUSINESS) {
                z = false;
            } else {
                EntryPoints entryPoints = tmr0Var.n;
                if (entryPoints == null || (menuEntryPoints = entryPoints.c) == null || (list = menuEntryPoints.b) == null) {
                    list = EmptyList.a;
                }
                z = qw6Var.a.a(list) ? true : !tmr0Var.m;
            }
            if (!z) {
                List list4 = list2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((snr0) it2.next()).c.getTypeId(), str)) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list4) {
                                if (jl40.l(((snr0) obj2).c.getTypeId(), str)) {
                                    arrayList.add(obj2);
                                }
                            }
                            ListBuilder a4 = rcc.a();
                            Iterator it3 = arrayList.iterator();
                            boolean z3 = l;
                            while (it3.hasNext()) {
                                snr0 snr0Var = (snr0) it3.next();
                                a4.add(q500Var.a(tmr0Var.p, tmr0Var.q ? snr0Var.h.a : tmr0Var.b, tmr0Var.o, snr0Var, fVar, z3));
                                z3 = false;
                            }
                            a2.addAll(a4.j());
                            l = false;
                        }
                    }
                }
                com.yandex.go.payments.shared.a aVar = q500Var.d;
                cw6 cw6Var = aVar.c;
                if (!cw6Var.a.get() && tmr0Var.a() == SharedAccountType.BUSINESS) {
                    cw6Var.a.set(true);
                    aVar.a.d(SharedPaymentsOpenReason.MENU, false);
                }
                a2.add(new SharedAccountMenuViewModel(tmr0Var.b, "", false, z2 ? SharedAccountMenuViewModel.BadgeType.CREATE : SharedAccountMenuViewModel.BadgeType.NONE, new p500(i, fVar, tmr0Var), tmr0Var.o, tmr0Var.p));
                z2 = false;
            }
        }
        List list5 = list3;
        ArrayList arrayList2 = new ArrayList(tcc.n(list5, 10));
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((tmr0) it4.next()).a);
        }
        Set N0 = kotlin.collections.a.N0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (!kotlin.collections.a.G(N0, ((snr0) obj3).c.getTypeId())) {
                arrayList3.add(obj3);
            }
        }
        Iterator it5 = arrayList3.iterator();
        boolean z4 = l;
        while (it5.hasNext()) {
            snr0 snr0Var2 = (snr0) it5.next();
            a2.add(q500Var.a("", snr0Var2.h.a, BusinessAccountMenuItemPosition.ORIGINAL, snr0Var2, fVar, z4));
            z4 = false;
        }
        ((z500) fVar.Dg()).T7(a2.j());
        return zy11.a;
    }
}
