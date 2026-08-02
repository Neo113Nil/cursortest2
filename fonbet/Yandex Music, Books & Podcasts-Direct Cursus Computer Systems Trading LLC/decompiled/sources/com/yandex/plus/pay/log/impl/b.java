package com.yandex.plus.pay.log.impl;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.pay.reporter.api.f;
import defpackage.u75;
import defpackage.vz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class b implements com.yandex.plus.log.api.b {
    public final UUID a;
    public final a b;
    public final ArrayList c;

    public b(f fVar, List list, UUID uuid) {
        fVar.getClass();
        list.getClass();
        uuid.getClass();
        this.a = uuid;
        a aVar = new a();
        this.b = aVar;
        this.c = CollectionsKt.g0(u75.h(new c(), new d(fVar, uuid), aVar), list);
    }

    public static void d(b bVar, com.yandex.plus.pay.api.log.c cVar, String str) {
        bVar.getClass();
        bVar.a(com.yandex.plus.log.api.a.b, u.b(cVar), str, null);
    }

    public static /* synthetic */ void f(b bVar, com.yandex.plus.pay.api.log.c cVar, String str, Throwable th, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        bVar.e(cVar, str, th, null);
    }

    @Override // com.yandex.plus.log.api.b
    public final void a(com.yandex.plus.log.api.a aVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) it.next();
            if (bVar.b(aVar)) {
                bVar.a(aVar, str, str2, th);
            }
        }
    }

    @Override // com.yandex.plus.log.api.b
    public final boolean b(com.yandex.plus.log.api.a aVar) {
        return true;
    }

    @Override // com.yandex.plus.log.api.b
    public final void c(com.yandex.plus.log.api.a aVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) it.next();
            if (bVar.b(aVar)) {
                bVar.c(aVar, str, str2);
            }
        }
    }

    public void e(com.yandex.plus.pay.api.log.c cVar, String str, Throwable th, String str2) {
        cVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        String b = u.b(cVar);
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        a(aVar, b, vz1.s(sb, str, ";requestId=", str2), th);
    }

    public void g(com.yandex.plus.pay.api.log.c cVar, String str, Throwable th) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        String b = u.b(cVar);
        if (str == null) {
            str = "";
        }
        a(aVar, b, str, th);
    }
}
