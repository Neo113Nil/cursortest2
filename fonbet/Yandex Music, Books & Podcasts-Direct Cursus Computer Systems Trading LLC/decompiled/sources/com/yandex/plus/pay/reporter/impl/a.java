package com.yandex.plus.pay.reporter.impl;

import com.yandex.plus.core.analytics.metrica.g;
import com.yandex.plus.pay.internal.common.e;
import com.yandex.plus.pay.reporter.api.f;
import defpackage.b6e;
import defpackage.u75;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class a implements f {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(com.yandex.plus.analytics.dwh.a aVar, e eVar, com.yandex.plus.pay.internal.di.a aVar2) {
        aVar.getClass();
        this.b = u75.h(new b(new com.yandex.plus.pay.internal.common.b(eVar), new com.yandex.plus.core.analytics.metrica.a(eVar), new com.yandex.plus.pay.internal.common.a(eVar), new g(eVar)), new d(new com.yandex.plus.pay.internal.common.d(eVar), new com.yandex.plus.pay.internal.common.c(eVar), aVar2), new a(aVar));
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
                break;
        }
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void b(com.yandex.plus.pay.reporter.api.e eVar) {
        switch (this.a) {
            case 0:
                com.yandex.plus.analytics.dwh.a aVar = (com.yandex.plus.analytics.dwh.a) this.b;
                com.yandex.plus.pay.reporter.api.d dVar = eVar.a;
                String str = eVar.b;
                int ordinal = dVar.ordinal();
                if (ordinal == 0) {
                    com.yandex.plus.pay.reporter.api.c cVar = eVar.c;
                    if (!(cVar instanceof com.yandex.plus.pay.reporter.api.a)) {
                        if (!(cVar instanceof com.yandex.plus.pay.reporter.api.b)) {
                            b6e.s();
                            break;
                        } else {
                            aVar.a(str, null);
                            break;
                        }
                    } else {
                        aVar.a(str, ((com.yandex.plus.pay.reporter.api.a) cVar).a);
                        break;
                    }
                } else if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    b6e.s();
                    break;
                }
                break;
            default:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).b(eVar);
                }
                break;
        }
    }

    private final void c() {
    }

    public a(com.yandex.plus.analytics.dwh.a aVar) {
        aVar.getClass();
        this.b = aVar;
    }
}
