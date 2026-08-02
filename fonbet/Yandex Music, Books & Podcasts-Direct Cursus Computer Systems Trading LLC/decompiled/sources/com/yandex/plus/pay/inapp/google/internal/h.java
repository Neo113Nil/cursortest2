package com.yandex.plus.pay.inapp.google.internal;

import defpackage.b6e;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.mtm;
import defpackage.ntm;
import defpackage.otm;
import defpackage.ptm;
import defpackage.t75;
import defpackage.v75;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class h {
    public final ptm a;

    public h(ptm ptmVar) {
        ptmVar.getClass();
        this.a = ptmVar;
    }

    public static com.yandex.plus.pay.inapp.api.d a(long j, String str) {
        try {
            BigDecimal divide = new BigDecimal(j).divide(new BigDecimal(1000000));
            divide.getClass();
            return new com.yandex.plus.pay.inapp.api.d(divide, str);
        } catch (NumberFormatException e) {
            b6e.o(dfi.e(j, "Cannot parse ", " to BigDecimal"), e);
            return null;
        }
    }

    public final String b() {
        String str = this.a.c;
        str.getClass();
        return str;
    }

    public final List c() {
        otm otmVar;
        ptm ptmVar = this.a;
        ArrayList arrayList = ptmVar.h;
        if (arrayList == null || (otmVar = (otm) CollectionsKt.firstOrNull(arrayList)) == null) {
            mtm a = ptmVar.a();
            if (a == null) {
                return c5b.a;
            }
            long j = a.a;
            String str = a.b;
            str.getClass();
            return t75.c(new com.yandex.plus.pay.inapp.api.c(a(j, str), null, 0));
        }
        ArrayList arrayList2 = otmVar.b.a;
        arrayList2.getClass();
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ntm ntmVar = (ntm) it.next();
            long j2 = ntmVar.a;
            String str2 = ntmVar.b;
            str2.getClass();
            arrayList3.add(new com.yandex.plus.pay.inapp.api.c(a(j2, str2), ntmVar.c, ntmVar.d));
        }
        return arrayList3;
    }
}
