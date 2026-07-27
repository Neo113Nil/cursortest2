package com.anythink.core.d;

import D.y;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.v;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17241a = "c";

    public static void b(Context context, v vVar, com.anythink.core.common.m.q qVar) {
        if (context == null) {
            return;
        }
        new com.anythink.core.common.m.j(context, vVar).a(0, qVar);
    }

    public final void a(final Context context, final v vVar, com.anythink.core.common.m.q qVar) {
        if (context == null) {
            return;
        }
        com.anythink.core.common.d.t.b().T();
        if (vVar.e()) {
            com.anythink.core.common.g.c.a();
            if (com.anythink.core.common.g.c.c()) {
                final com.anythink.core.common.m.n nVar = new com.anythink.core.common.m.n(qVar);
                com.anythink.core.common.i.a();
                String b9 = com.anythink.core.common.i.b();
                final String f3 = com.anythink.core.common.v.q.f(b9);
                new com.anythink.core.common.m.f(context, vVar).a(b9).a(0, (com.anythink.core.common.m.q) nVar);
                com.anythink.core.common.g.c.a().a(new com.anythink.core.common.g.d() { // from class: com.anythink.core.d.c.1
                    @Override // com.anythink.core.common.g.d
                    public final void a(String str) {
                        String unused = c.f17241a;
                        if (TextUtils.isEmpty(str) || str.equals(f3)) {
                            nVar.onLoadError(0, y.p("The cdnDomain(", str, ") is not equal to curAppDomain(", f3, ")."), ErrorCode.getErrorCode(ErrorCode.appIdError, "", ""));
                            return;
                        }
                        boolean a9 = nVar.a();
                        String unused2 = c.f17241a;
                        vVar.a();
                        if (a9) {
                            return;
                        }
                        com.anythink.core.common.g.c.a();
                        com.anythink.core.common.i.a();
                        new com.anythink.core.common.m.f(context, vVar).a(com.anythink.core.common.g.c.b(com.anythink.core.common.i.b(), str)).a(0, (com.anythink.core.common.m.q) nVar);
                    }
                });
                return;
            }
        }
        new com.anythink.core.common.m.f(context, vVar).a(0, qVar);
    }
}
