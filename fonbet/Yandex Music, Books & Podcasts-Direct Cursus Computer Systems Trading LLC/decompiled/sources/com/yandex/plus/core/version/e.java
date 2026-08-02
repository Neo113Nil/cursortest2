package com.yandex.plus.core.version;

import defpackage.jch;
import defpackage.l7;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class e {
    public static final Regex a = new Regex("(^[0-9]+)(?>.([0-9]+))?(?>.([0-9]+))?");

    public static a a(String str) {
        l7 l7Var;
        MatchGroup a2;
        String str2;
        Object t7oVar;
        jch b = a.b(str);
        if (b == null || (a2 = (l7Var = b.c).a(1)) == null || (str2 = a2.a) == null) {
            return null;
        }
        MatchGroup a3 = l7Var.a(2);
        String str3 = a3 != null ? a3.a : null;
        MatchGroup a4 = l7Var.a(3);
        String str4 = a4 != null ? a4.a : null;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new a(h.b(str2), str3 != null ? h.b(str3) : 0, str4 != null ? h.b(str4) : 0);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (a) (t7oVar instanceof t7o ? null : t7oVar);
    }
}
