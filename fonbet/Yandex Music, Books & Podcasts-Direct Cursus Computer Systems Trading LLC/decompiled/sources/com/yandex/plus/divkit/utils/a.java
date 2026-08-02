package com.yandex.plus.divkit.utils;

import com.yandex.plus.core.version.d;
import com.yandex.plus.divkit.api.e;
import defpackage.hrg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uop;
import defpackage.z7o;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {
    public static final Set d = uop.b(e.a);
    public static final Set e = uop.b(e.b);
    public final d a;
    public final List b;
    public final List c;

    public a(d dVar, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = dVar;
        this.b = list;
        this.c = list2;
    }

    public static Class a(com.yandex.plus.log.api.b bVar, String str) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Class.forName(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) != null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DivKitChecker", hrg.q("Class \"", str, "\" not found!"));
            }
            t7oVar = null;
        }
        return (Class) t7oVar;
    }
}
