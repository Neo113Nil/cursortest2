package com.yandex.plus.pay.reporter.impl;

import com.yandex.plus.core.analytics.e;
import com.yandex.plus.core.analytics.o;
import com.yandex.plus.pay.reporter.api.f;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.uah;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class b implements f {
    public static final Pair e = new Pair("transport", "metrica");
    public final com.yandex.plus.core.analytics.f a;
    public final com.yandex.plus.core.analytics.c b;
    public final e c;
    public final o d;

    public b(com.yandex.plus.core.analytics.f fVar, com.yandex.plus.core.analytics.c cVar, e eVar, o oVar) {
        this.a = fVar;
        this.b = cVar;
        this.c = eVar;
        this.d = oVar;
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void a() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void b(com.yandex.plus.pay.reporter.api.e eVar) {
        Map map;
        com.yandex.plus.pay.reporter.api.d dVar = eVar.a;
        String str = eVar.b;
        com.yandex.plus.pay.reporter.api.c cVar = eVar.c;
        int ordinal = dVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            boolean z = cVar instanceof com.yandex.plus.pay.reporter.api.a;
            com.yandex.plus.core.analytics.f fVar = this.a;
            if (z) {
                if (fVar != null) {
                    fVar.reportEvent(str, ((com.yandex.plus.pay.reporter.api.a) cVar).a);
                    return;
                }
                return;
            } else if (!(cVar instanceof com.yandex.plus.pay.reporter.api.b)) {
                b6e.s();
                return;
            } else {
                if (fVar != null) {
                    fVar.reportEvent(str, ((com.yandex.plus.pay.reporter.api.b) cVar).a);
                    return;
                }
                return;
            }
        }
        if (ordinal == 2) {
            com.yandex.plus.core.analytics.c cVar2 = this.b;
            if (cVar2 == null) {
                return;
            }
            if (cVar instanceof com.yandex.plus.pay.reporter.api.a) {
                map = ((com.yandex.plus.pay.reporter.api.a) cVar).a;
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
            } else {
                if (!(cVar instanceof com.yandex.plus.pay.reporter.api.b)) {
                    b6e.s();
                    return;
                }
                String str2 = ((com.yandex.plus.pay.reporter.api.b) cVar).a;
                Map n = str2 != null ? dfi.n(Constants.KEY_VALUE, str2) : null;
                if (n == null) {
                    map = e5b.a;
                    map.getClass();
                } else {
                    map = n;
                }
            }
            cVar2.reportDiagnosticEvent(str, uah.j(map, e));
            return;
        }
        if (ordinal == 3) {
            Throwable th = eVar.d;
            boolean z2 = cVar instanceof com.yandex.plus.pay.reporter.api.a;
            e eVar2 = this.c;
            if (z2) {
                if (eVar2 != null) {
                    eVar2.reportError(str, null, th);
                    return;
                }
                return;
            } else if (!(cVar instanceof com.yandex.plus.pay.reporter.api.b)) {
                b6e.s();
                return;
            } else {
                if (eVar2 != null) {
                    eVar2.reportError(str, ((com.yandex.plus.pay.reporter.api.b) cVar).a, th);
                    return;
                }
                return;
            }
        }
        if (ordinal != 4) {
            b6e.s();
            return;
        }
        boolean z3 = cVar instanceof com.yandex.plus.pay.reporter.api.a;
        o oVar = this.d;
        if (z3) {
            if (oVar != null) {
                oVar.reportStatboxEvent(str, ((com.yandex.plus.pay.reporter.api.a) cVar).a);
            }
        } else if (!(cVar instanceof com.yandex.plus.pay.reporter.api.b)) {
            b6e.s();
        } else if (oVar != null) {
            oVar.reportStatboxEvent(str, ((com.yandex.plus.pay.reporter.api.b) cVar).a);
        }
    }
}
