package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success;

import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g;
import defpackage.b6e;
import defpackage.u75;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a {
    public static final List e = u75.h(b.a, b.b, b.c, b.d, b.e);
    public final Set a;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a b;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c c;
    public final k d;

    public a(Set set, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c cVar, k kVar) {
        set.getClass();
        aVar.getClass();
        cVar.getClass();
        this.a = set;
        this.b = aVar;
        this.c = cVar;
        this.d = kVar;
    }

    public final void a() {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e) this.c;
        com.yandex.plus.log.api.b bVar = eVar.e;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PerformanceSessionImpl", "onEndFlow()");
        }
        eVar.a((l) eVar.i.getValue());
        this.b.a();
    }

    public final void b(b bVar) {
        Object obj;
        List list = e;
        Iterator it = list.subList(list.indexOf(bVar) + 1, list.size()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d((b) obj, this.a)) {
                    break;
                }
            }
        }
        b bVar2 = (b) obj;
        if (bVar2 != null) {
            c(bVar2);
        } else {
            a();
        }
    }

    public final void c(b bVar) {
        int ordinal = bVar.ordinal();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar = this.b;
        if (ordinal == 0) {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d(), "Upsale");
            return;
        }
        if (ordinal == 1) {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d(), "Topup");
            return;
        }
        if (ordinal == 2) {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e(), "Family");
        } else if (ordinal == 3) {
            aVar.getClass();
            aVar.c(new g(), "Contacts");
        } else if (ordinal != 4) {
            b6e.s();
        } else {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f(), "Success");
        }
    }

    public final boolean d(b bVar, Set set) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            b6e.s();
                            return false;
                        }
                        if (set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.e)) {
                            return false;
                        }
                    } else if (set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.d)) {
                        return false;
                    }
                } else if (set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.c)) {
                    return false;
                }
            } else if (set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.b) || !((Boolean) this.d.invoke()).booleanValue()) {
                return false;
            }
        } else if (set.contains(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.a)) {
            return false;
        }
        return true;
    }

    public final void e() {
        Object obj;
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d((b) obj, this.a)) {
                    break;
                }
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            c(bVar);
        } else {
            a();
        }
    }
}
