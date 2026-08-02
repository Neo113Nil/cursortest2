package com.yandex.passport.sloth;

import android.net.Uri;
import defpackage.c5b;
import defpackage.v75;
import defpackage.x97;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class l {
    public final a1 a;
    public final v b;
    public final i c;

    public l(a1 a1Var, v vVar, i iVar) {
        a1Var.getClass();
        vVar.getClass();
        iVar.getClass();
        this.a = a1Var;
        this.b = vVar;
        this.c = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public final com.yandex.passport.sloth.url.y a(String str) {
        String str2;
        Iterable iterable;
        List split$default;
        str.getClass();
        Continuation continuation = null;
        try {
            str2 = Uri.parse(str).getQueryParameter("errors");
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = com.yandex.passport.common.url.b.f(str, "error");
        }
        this.a.a(new n0(str2 == null ? "N/A" : str2, 3));
        if (str2 != null) {
            Set set = k.b;
            split$default = StringsKt__StringsKt.split$default(str2, new String[]{StringUtils.COMMA}, false, 0, 6, null);
            List list = split$default;
            iterable = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iterable.add(new k(StringsKt.t0((String) it.next()).toString()));
            }
        } else {
            iterable = 0;
        }
        if (iterable == 0) {
            iterable = c5b.a;
        }
        Iterable<k> iterable2 = iterable;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            for (k kVar : iterable2) {
                Set set2 = k.b;
                String lowerCase = kVar.a.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (set2.contains(lowerCase)) {
                    x97.y(this.c, null, null, new com.yandex.passport.internal.ui.sloth.q(this, iterable, continuation, 19), 3);
                    return com.yandex.passport.sloth.url.c0.e;
                }
            }
        }
        return !Uri.parse(str).getBooleanQueryParameter("errorShownToUser", false) ? new com.yandex.passport.sloth.url.g0(str2) : com.yandex.passport.sloth.url.c0.c;
    }
}
