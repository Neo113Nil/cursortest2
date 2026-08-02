package com.yandex.passport.internal;

import android.text.TextUtils;
import defpackage.ouj;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class h {
    public static final Pattern e = Pattern.compile(";");
    public static final Pattern f = Pattern.compile(StringUtils.COMMA);
    public static final Pattern g = Pattern.compile(StringUtils.COMMA);
    public static final Pattern h = Pattern.compile(StringUtils.COMMA);
    public int a;
    public ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public h(int i, ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = hashSet;
    }

    public final String a() {
        String str = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start Linkage serialize state: ".concat(com.appsflyer.internal.k.A(this.a)), 8);
        }
        int D = ouj.D(this.a);
        String str2 = D != 1 ? D != 2 ? D != 3 ? "" : "linked" : "allowed" : "denied";
        String join = !this.b.isEmpty() ? TextUtils.join(StringUtils.COMMA, this.b) : "";
        ArrayList arrayList = this.c;
        String join2 = arrayList.isEmpty() ? "" : TextUtils.join(StringUtils.COMMA, arrayList);
        HashSet hashSet = this.d;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) it.next();
                fVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(fVar.a.a);
                sb.append(':');
                sb.append(fVar.b);
                arrayList2.add(sb.toString());
            }
            str = TextUtils.join(StringUtils.COMMA, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        if (str != null) {
            ouj.A(str2, join, join2, str, arrayList3);
        } else {
            join2.getClass();
            if (join2.length() > 0) {
                arrayList3.add(str2);
                arrayList3.add(join);
                arrayList3.add(join2);
            } else if (str2.length() > 0) {
                arrayList3.add(str2);
                join.getClass();
                if (join.length() > 0) {
                    arrayList3.add(join);
                }
            }
        }
        return com.yandex.plus.core.network.api.utils.a.z(TextUtils.join(";", arrayList3));
    }

    public final String toString() {
        return "Linkage(state = " + com.appsflyer.internal.k.A(this.a) + ", delays = " + this.b + ", refusals = " + this.c + ", candidates = " + this.d + ')';
    }
}
