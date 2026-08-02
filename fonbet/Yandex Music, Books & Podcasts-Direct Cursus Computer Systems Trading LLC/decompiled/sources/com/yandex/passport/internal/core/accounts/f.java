package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.analytics.o0;
import defpackage.e5b;
import defpackage.n7w;
import defpackage.wop;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final i a;
    public final p b;
    public final o0 c;
    public final com.yandex.passport.internal.flags.i d;
    public final com.yandex.passport.internal.network.mappers.d e;

    public f(i iVar, p pVar, o0 o0Var, com.yandex.passport.internal.flags.i iVar2, com.yandex.passport.internal.network.mappers.d dVar) {
        iVar.getClass();
        pVar.getClass();
        o0Var.getClass();
        iVar2.getClass();
        dVar.getClass();
        this.a = iVar;
        this.b = pVar;
        this.c = o0Var;
        this.d = iVar2;
        this.e = dVar;
    }

    public static com.yandex.passport.internal.stash.a a(com.yandex.passport.internal.stash.a aVar, com.yandex.passport.internal.stash.a aVar2) {
        com.yandex.passport.internal.stash.b bVar;
        if (aVar2 == null) {
            return aVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = aVar.a;
        Set keySet = map.keySet();
        Map map2 = aVar2.a;
        for (String str : wop.i(keySet, map2.keySet())) {
            int i = 0;
            if (!kotlin.text.c.v(str, "timestamp.v2_", false) && !kotlin.text.c.v(str, "timestamp_", false)) {
                String concat = "timestamp.v2_".concat(str);
                com.yandex.passport.internal.stash.b[] values = com.yandex.passport.internal.stash.b.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i];
                    if (Intrinsics.d(bVar.a, str)) {
                        break;
                    }
                    i++;
                }
                String str2 = bVar != null ? "timestamp_" + bVar : concat;
                String str3 = (String) map.get(str2);
                if (str3 == null) {
                    str3 = (String) map.get(concat);
                }
                Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
                String str4 = (String) map2.get(str2);
                if (str4 == null) {
                    str4 = (String) map2.get(concat);
                }
                Long valueOf2 = str4 != null ? Long.valueOf(Long.parseLong(str4)) : null;
                String str5 = (String) map.get(str);
                String str6 = (String) map2.get(str);
                if (valueOf == null || valueOf2 == null) {
                    if (valueOf != null) {
                        linkedHashMap.put(str, str5);
                        linkedHashMap.put(concat, valueOf.toString());
                    } else if (valueOf2 != null) {
                        linkedHashMap.put(str, str6);
                        linkedHashMap.put(concat, valueOf2.toString());
                    } else if (str6 != null) {
                        linkedHashMap.put(str, str6);
                    } else if (str5 != null) {
                        linkedHashMap.put(str, str5);
                    }
                } else if (valueOf.longValue() > valueOf2.longValue()) {
                    linkedHashMap.put(str, str5);
                    linkedHashMap.put(concat, valueOf.toString());
                } else {
                    linkedHashMap.put(str, str6);
                    linkedHashMap.put(concat, valueOf2.toString());
                }
            }
        }
        return new com.yandex.passport.internal.stash.a(n7w.G(linkedHashMap));
    }

    public final com.yandex.passport.internal.l b(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.analytics.n nVar, boolean z) {
        String str;
        com.yandex.passport.internal.stash.a aVar;
        com.yandex.passport.internal.l lVar2 = lVar;
        lVar2.getClass();
        nVar.getClass();
        String str2 = nVar.b;
        p pVar = this.b;
        com.yandex.passport.internal.d b = pVar.b(true);
        com.yandex.passport.common.core.f fVar = lVar2.b;
        String str3 = lVar2.j;
        fVar.getClass();
        str3.getClass();
        com.yandex.passport.internal.b b2 = com.yandex.passport.internal.m.b(b.a, null, fVar, str3, b.b);
        com.yandex.passport.internal.network.mappers.d dVar = this.e;
        o0 o0Var = this.c;
        i iVar = this.a;
        try {
            try {
                if (b2 != null) {
                    com.yandex.passport.internal.l b3 = dVar.b(b2);
                    if (b3 != null) {
                        aVar = b3.f;
                        if (aVar == null) {
                        }
                        com.yandex.passport.internal.l e = com.yandex.passport.internal.l.e(lVar2, b2.a, null, null, a(aVar, lVar2.f), 30);
                        iVar.h(e, nVar, z);
                        str = "update";
                        iVar.b(e.b);
                        lVar2 = e;
                    }
                    com.yandex.passport.internal.g j = com.yandex.passport.internal.m.j(b2.i);
                    if (j != null) {
                        String str4 = j.g;
                        String str5 = j.h;
                        HashMap hashMap = new HashMap();
                        if (str4 != null) {
                            com.yandex.passport.api.j[] jVarArr = com.yandex.passport.api.j.a;
                            hashMap.put("disk_pin_code", str4);
                        }
                        if (str5 != null) {
                            com.yandex.passport.api.j[] jVarArr2 = com.yandex.passport.api.j.a;
                            hashMap.put("mail_pin_code", str5);
                        }
                        aVar = new com.yandex.passport.internal.stash.a(hashMap);
                    } else {
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        aVar = new com.yandex.passport.internal.stash.a(e5bVar);
                    }
                    com.yandex.passport.internal.l e2 = com.yandex.passport.internal.l.e(lVar2, b2.a, null, null, a(aVar, lVar2.f), 30);
                    iVar.h(e2, nVar, z);
                    str = "update";
                    iVar.b(e2.b);
                    lVar2 = e2;
                } else {
                    if (!iVar.a(lVar2, nVar, z).b) {
                        com.yandex.passport.internal.d b4 = pVar.b(true);
                        fVar.getClass();
                        if (com.yandex.passport.internal.m.b(b4.a, null, fVar, str3, b4.b) == null) {
                            throw new o();
                        }
                    }
                    str = "add_success";
                    iVar.b(fVar);
                }
                o0Var.h(fVar.b, str2, str);
                return lVar2;
            } catch (o unused) {
                if (!((Boolean) this.d.b(com.yandex.passport.internal.flags.o.A)).booleanValue()) {
                    throw new o();
                }
                iVar.g(fVar, dVar.a(lVar2));
                o0Var.h(fVar.b, str2, "add_local_success");
                return lVar2;
            }
        } catch (Throwable th) {
            o0Var.h(fVar.b, str2, "add_fail");
            throw th;
        }
    }
}
