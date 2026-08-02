package com.yandex.plus.pay.graphql.utils;

import com.yandex.plus.core.graphql.exception.d;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.z7o;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class b {
    public final List a = t75.c(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH));

    public final Date a(String str) {
        Date date;
        Object t7oVar;
        str.getClass();
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                date = null;
                break;
            }
            DateFormat dateFormat = (DateFormat) it.next();
            try {
                r7o r7oVar = z7o.b;
                t7oVar = dateFormat.parse(str);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            date = (Date) t7oVar;
            if (date != null) {
                break;
            }
        }
        if (date != null) {
            return date;
        }
        throw new d("Couldn't parse date: ".concat(str), null);
    }
}
