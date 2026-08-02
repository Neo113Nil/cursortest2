package com.yandex.plus.core.benchmark;

import defpackage.btf;
import defpackage.jyr;
import defpackage.l1p;
import defpackage.mm6;
import defpackage.v75;
import defpackage.x97;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class c implements x {
    public final androidx.core.app.q a;
    public volatile Function0 b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public c(Function0 function0, List list, androidx.core.app.q qVar, com.yandex.plus.core.dispatcher.b bVar) {
        list.getClass();
        bVar.getClass();
        this.a = qVar;
        this.b = new com.yandex.plus.bdui.plus.shared.serializer.d(6);
        this.c = btf.b(function0);
        this.d = btf.b(new b(this, list));
        this.e = btf.b(new b(list, this));
        this.f = btf.b(new com.yandex.plus.bdui.plus.checkout.h(9, bVar));
    }

    @Override // com.yandex.plus.core.utils.a
    public final void a(com.yandex.plus.bdui.plus.checkout.h hVar) {
        this.b = hVar;
    }

    @Override // com.yandex.plus.core.benchmark.u
    public final l b(String str) {
        str.getClass();
        return new l(str, d(str), this.a);
    }

    @Override // com.yandex.plus.core.benchmark.v
    public final void c(l lVar, Map map) {
        lVar.getClass();
        if (((Boolean) this.c.getValue()).booleanValue()) {
            x97.y((mm6) this.f.getValue(), null, null, new l1p(this, lVar, map, null, 29), 3);
        }
    }

    public final ArrayList d(String str) {
        List list = (List) this.d.getValue();
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((n) it.next()).a(str));
        }
        return arrayList;
    }
}
