package com.yandex.passport.legacy.analytics;

import com.yandex.passport.internal.analytics.i;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.b;
import com.yandex.passport.internal.core.accounts.k;
import defpackage.xy0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class a {
    public String a = "";
    public final o0 b;
    public final k c;

    public a(k kVar, o0 o0Var) {
        this.c = kVar;
        this.b = o0Var;
    }

    public final void a() {
        ArrayList b = this.c.b();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            sb.append(bVar.c);
            arrayList.add(bVar.c);
        }
        String sb2 = sb.toString();
        synchronized (this) {
            if (!sb2.equals(this.a)) {
                o0 o0Var = this.b;
                o0Var.getClass();
                xy0 xy0Var = new xy0(0);
                xy0Var.put("uid", CollectionsKt.X(arrayList, null, null, null, null, 63));
                o0Var.a.b(i.d, xy0Var);
                this.a = sb2;
            }
        }
    }
}
