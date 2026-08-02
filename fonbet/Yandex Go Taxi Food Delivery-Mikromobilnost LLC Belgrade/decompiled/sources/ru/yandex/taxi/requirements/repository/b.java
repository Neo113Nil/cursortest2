package ru.yandex.taxi.requirements.repository;

import defpackage.b580;
import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.h6z;
import defpackage.ike;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.taxi.requirements.storage.a a;
    public final ike b;
    public final kotlinx.coroutines.sync.a c;
    public final ConcurrentHashMap d;

    public b(ru.yandex.taxi.requirements.storage.a aVar, tt2 tt2Var) {
        this.a = aVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(mdh.b);
        this.b = a;
        this.c = gtq0.a();
        this.d = new ConcurrentHashMap();
        tje.N(a, null, null, new LocallyPersistantRequirementsRepository$1(this, null), 3);
    }

    public static final void a(b bVar, List list) {
        b580 b580Var;
        bVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h6z h6zVar = (h6z) it.next();
            String str = h6zVar.a;
            if (str != null && str.length() != 0 && (b580Var = h6zVar.b) != null) {
                bVar.d.put(h6zVar.a, b580Var);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        tje.N(this.b, null, null, new LocallyPersistantRequirementsRepository$removeRequirements$1(this, arrayList, null), 3);
    }

    public final void c(ArrayList arrayList) {
        tje.N(this.b, null, null, new LocallyPersistantRequirementsRepository$saveRequirements$1(this, arrayList, null), 3);
    }
}
