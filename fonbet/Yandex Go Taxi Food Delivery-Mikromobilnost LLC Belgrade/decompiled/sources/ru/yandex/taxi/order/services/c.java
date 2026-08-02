package ru.yandex.taxi.order.services;

import android.app.Application;
import defpackage.chx;
import defpackage.j63;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.scc;
import defpackage.t041;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class c {
    public final Application a;
    public final Set b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public c(Application application, t041 t041Var) {
        this.a = application;
        List g = scc.g(KeepAliveService0.class, KeepAliveService1.class, KeepAliveService2.class, KeepAliveService3.class, KeepAliveService4.class, KeepAliveService5.class, KeepAliveService6.class);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(new chx(this, (Class) it.next(), new e(t041Var)));
        }
        j63 j63Var = new j63(0);
        kotlin.collections.a.F0(arrayList, j63Var);
        this.c.addAll(j63Var);
        this.b = Collections.unmodifiableSet(j63Var);
    }

    public final chx a(String str) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((chx) obj).b.c(str)) {
                break;
            }
        }
        return (chx) obj;
    }

    public final chx b(final Class cls) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((chx) obj).a, cls)) {
                break;
            }
        }
        chx chxVar = (chx) obj;
        if (chxVar != null) {
            return chxVar;
        }
        throw new IllegalArgumentException(cls) { // from class: ru.yandex.taxi.order.services.KeepAliveServicePoolFactory$UnknownServiceException
            {
                super(qv10.l(cls, "Unsupported service class: "));
            }
        };
    }
}
