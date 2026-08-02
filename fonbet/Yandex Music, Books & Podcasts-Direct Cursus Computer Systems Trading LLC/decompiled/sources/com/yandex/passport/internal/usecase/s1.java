package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Build;
import com.yandex.passport.internal.report.ff;
import defpackage.q5b;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wop;
import defpackage.z7o;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class s1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.config.a b;
    public final com.yandex.passport.internal.core.accounts.k c;
    public final com.yandex.passport.internal.report.reporters.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.config.a aVar2, com.yandex.passport.internal.core.accounts.k kVar, com.yandex.passport.internal.report.reporters.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        aVar2.getClass();
        kVar.getClass();
        bVar.getClass();
        this.b = aVar2;
        this.c = kVar;
        this.d = bVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Object t7oVar;
        com.yandex.passport.internal.report.reporters.b bVar;
        Object obj2;
        com.yandex.passport.internal.core.accounts.k kVar = this.c;
        try {
            r7o r7oVar = z7o.b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                Set<String> stringSet = ((SharedPreferences) this.b.b.getValue()).getStringSet("blacklisted_apps", null);
                if (stringSet == null) {
                    stringSet = q5b.a;
                }
                Iterator it = kVar.b().iterator();
                while (it.hasNext()) {
                    com.yandex.passport.internal.b bVar2 = (com.yandex.passport.internal.b) it.next();
                    Account d = bVar2.d();
                    String str = bVar2.c;
                    if (str != null) {
                        Set h = wop.h(kVar.f(d), stringSet);
                        Iterator it2 = h.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            bVar = this.d;
                            if (!hasNext) {
                                break;
                            }
                            String str2 = (String) it2.next();
                            boolean m = kVar.m(d, str2, true);
                            bVar.getClass();
                            bVar.n(com.yandex.passport.internal.report.k.d, new com.yandex.passport.internal.report.c(str, 3), new com.yandex.passport.internal.report.a(str2, 3), new ff(8, m));
                        }
                        boolean z = false;
                        for (String str3 : stringSet) {
                            boolean m2 = kVar.m(d, str3, z);
                            bVar.getClass();
                            z = false;
                            bVar.n(com.yandex.passport.internal.report.j.d, new com.yandex.passport.internal.report.c(str, 3), new com.yandex.passport.internal.report.a(str3, 3), new ff(8, m2));
                        }
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            obj2 = null;
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "applied visibility for account=" + d + " hidden=" + stringSet + " revealed=" + h, 8);
                        } else {
                            obj2 = null;
                        }
                    }
                }
            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "setAccountVisibility requires API 26+, current=" + i + ", skip", 8);
            }
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return new z7o(t7oVar);
    }
}
