package com.yandex.passport.internal.push;

import android.content.Context;
import android.os.Build;
import defpackage.c5b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class d0 {
    public final androidx.core.app.u0 a;

    public d0(Context context) {
        context.getClass();
        this.a = new androidx.core.app.u0(context);
    }

    public final List a() {
        List list;
        if (Build.VERSION.SDK_INT < 26) {
            return c5b.a;
        }
        androidx.core.app.y a = q.a(this.a);
        if (a == null || (list = a.d) == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((androidx.core.app.w) obj).b == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((androidx.core.app.w) it.next()).a);
        }
        return arrayList2;
    }
}
