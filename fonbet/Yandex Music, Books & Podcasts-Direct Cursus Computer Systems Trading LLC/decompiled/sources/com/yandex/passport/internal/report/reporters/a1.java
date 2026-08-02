package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.api.x1;
import com.yandex.passport.internal.report.cc;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.xb;
import defpackage.uah;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class a1 extends androidx.core.app.n0 {
    public static final Object d;
    public static final Object e;
    public final com.yandex.passport.internal.features.a b;
    public String c;

    static {
        x1 x1Var = x1.VKONTAKTE;
        d = uah.e(new Pair("fb", "fb"), new Pair("gg", "g"), new Pair("vk", "vk"), new Pair("ok", "ok"), new Pair("tw", "tw"), new Pair("mr", "mr"));
        e = uah.e(new Pair("ms", "ms"), new Pair("gg", "gmail"), new Pair("mr", "mail"), new Pair("yh", "yahoo"), new Pair("ra", "rambler"), new Pair("other", "other"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static String u(com.yandex.passport.internal.a0 a0Var) {
        String str = a0Var.d().a;
        ?? r2 = a0Var.b != com.yandex.passport.internal.z.a ? e : d;
        if (!r2.containsKey(str)) {
            return "other";
        }
        Object obj = r2.get(str);
        obj.getClass();
        return (String) obj;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.s.getValue(aVar, com.yandex.passport.internal.features.a.J[15])).booleanValue();
    }

    public final void v(com.yandex.passport.internal.a0 a0Var, boolean z, String str) {
        a0Var.getClass();
        boolean z2 = false;
        n(xb.d, new ff(u(a0Var), 7, z2), new com.yandex.passport.internal.report.f(20, z), new ve(str, 5, z2), new ve(this.c, 25));
    }

    public final void w(com.yandex.passport.internal.a0 a0Var, Throwable th) {
        a0Var.getClass();
        th.getClass();
        n(cc.d, new ff(u(a0Var), 7, false), new ff(th), new ve(this.c, 25));
    }
}
