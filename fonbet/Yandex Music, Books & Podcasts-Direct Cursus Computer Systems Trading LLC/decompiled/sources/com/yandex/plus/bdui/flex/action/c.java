package com.yandex.plus.bdui.flex.action;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.bdui.plus.checkout.n;
import com.yandex.plus.bdui.plus.checkout.o;
import defpackage.btf;
import defpackage.df;
import defpackage.dn9;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.ke7;
import defpackage.ldi;
import defpackage.md;
import defpackage.ouj;
import defpackage.q5f;
import defpackage.v6f;
import defpackage.w4f;
import defpackage.x3f;
import defpackage.x71;
import defpackage.z2a;
import defpackage.z4f;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c implements df {
    public final com.yandex.plus.log.api.b a;
    public final jyr b;
    public final jyr c;

    public c(com.yandex.plus.bdui.flex.utils.b bVar, ArrayList arrayList, o oVar, com.yandex.plus.log.api.b bVar2) {
        bVar2.getClass();
        this.a = bVar2;
        this.b = btf.b(new x71(arrayList, 5));
        this.c = btf.b(new k0(13));
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        md eVar;
        String str;
        ke7 ke7Var = (ke7) mdVar;
        ke7Var.getClass();
        String str2 = ke7Var.a;
        String str3 = ke7Var.b;
        String str4 = ke7Var.c;
        if (str2 == null) {
            if (str4 != null) {
                x3f x3fVar = (x3f) this.c.getValue();
                x3fVar.getClass();
                w4f w4fVar = (w4f) x3fVar.b(z4f.a, str4);
                q5f q5fVar = w4fVar instanceof q5f ? (q5f) w4fVar : null;
                w4f w4fVar2 = q5fVar != null ? (w4f) q5fVar.get("type") : null;
                v6f v6fVar = w4fVar2 instanceof v6f ? (v6f) w4fVar2 : null;
                if (v6fVar != null) {
                    if (!v6fVar.g()) {
                        v6fVar = null;
                    }
                    if (v6fVar != null) {
                        str2 = v6fVar.a();
                    }
                }
            }
            str2 = null;
        }
        boolean contains = ((Set) this.b.getValue()).contains(str2);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            String m = k5r.m(str2 == null ? "Unknown action" : str2, " parsing failed with message \"", str3, "\"!");
            if (contains) {
                str = "";
            } else {
                str = hrg.q(StringUtil.LF, str2 != null ? "Action is required" : "Unknown action is required by default", " so init failure action.");
            }
            bVar.c(aVar, "DebugActionHandler", ouj.o(m, str, str4 != null ? "\njson = ".concat(str4) : ""));
        }
        if (contains) {
            return;
        }
        com.yandex.plus.bdui.action.a aVar2 = (com.yandex.plus.bdui.action.a) n.a.invoke(new com.yandex.plus.bdui.failure.a(str3, str2, str4));
        j jVar = aVar2 instanceof j ? (j) aVar2 : null;
        if (jVar == null || (eVar = jVar.a) == null) {
            eVar = new e(aVar2, null);
        }
        ((ldi) dn9Var.d).b(eVar, (z2a) dn9Var.c, (Map) dn9Var.e);
    }
}
