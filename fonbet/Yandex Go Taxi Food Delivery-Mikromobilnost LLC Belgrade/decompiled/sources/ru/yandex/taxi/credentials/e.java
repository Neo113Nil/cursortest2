package ru.yandex.taxi.credentials;

import defpackage.c1p;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.la1;
import defpackage.ta1;
import defpackage.tt2;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.superapp.adjust.SupportedAdjustEvents;

/* loaded from: classes9.dex */
public final class e {
    public final j a;
    public final hbp0 b;
    public final AtomicReference c = new AtomicReference(kotlin.collections.b.f());
    public final AtomicReference d = new AtomicReference(kotlin.collections.b.f());

    /* JADX WARN: Multi-variable type inference failed */
    public e(j jVar, tt2 tt2Var) {
        this.a = jVar;
        this.b = new hbp0(new ExternalServiceAdjustRepositoryImpl$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final String a(SupportedAdjustEvents supportedAdjustEvents, String str) {
        String str2;
        ta1 ta1Var;
        List list;
        Object obj;
        int i = c1p.a[supportedAdjustEvents.ordinal()];
        if (i == 1) {
            str2 = "shortcut_button_clicked";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str2 = "showcase_appeared";
        }
        la1 la1Var = (la1) ((Map) this.c.get()).get(str);
        if (la1Var == null || (list = la1Var.a) == null) {
            ta1Var = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ta1) obj).getA(), str2)) {
                    break;
                }
            }
            ta1Var = (ta1) obj;
        }
        if (ta1Var != null) {
            return ta1Var.getC();
        }
        return null;
    }

    public final void b() {
        hbp0 hbp0Var = this.b;
        hbp0Var.a();
        int i = 3;
        com.yandex.go.coroutines.b.h(hbp0Var.c(), new jqr(new d(new jqr(new b(this.a.b(), this), new ExternalServiceAdjustRepositoryImpl$onResume$2(this, null), i), this), new ExternalServiceAdjustRepositoryImpl$onResume$4(this, null), i));
    }
}
