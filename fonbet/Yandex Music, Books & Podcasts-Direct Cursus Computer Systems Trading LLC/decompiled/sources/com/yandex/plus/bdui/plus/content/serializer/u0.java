package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.btf;
import defpackage.e5b;
import defpackage.eg7;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.l6b;
import defpackage.su4;
import defpackage.tah;
import defpackage.w4f;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class u0 extends com.yandex.plus.bdui.plus.utils.a {
    public final com.yandex.plus.bdui.plus.content.controller.f e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Function0 function0, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.log.api.b bVar) {
        super(function0, j0.Companion.serializer(), bVar, "PlusDivContentSerializer");
        function0.getClass();
        bVar.getClass();
        this.e = fVar;
        this.f = btf.b(new com.yandex.plus.bdui.plus.checkout.h(4, this));
        this.g = btf.b(new b(4));
        this.h = btf.b(new com.yandex.plus.bdui.content.b(7, this, bVar));
    }

    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object b(l6b l6bVar, Object obj) {
        ((com.yandex.plus.bdui.plus.content.i) obj).getClass();
        l6bVar.getClass();
        a();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object c(Object obj, eg7 eg7Var) {
        Map map;
        j0 j0Var = (j0) obj;
        j0Var.getClass();
        eg7Var.getClass();
        com.yandex.plus.core.templating.render.n nVar = (com.yandex.plus.core.templating.render.n) this.f.getValue();
        com.yandex.plus.core.templating.render.f fVar = (com.yandex.plus.core.templating.render.f) this.g.getValue();
        s0 s0Var = j0Var.a;
        com.yandex.plus.core.templating.render.c cVar = new com.yandex.plus.core.templating.render.c(nVar, fVar, s0Var.a, this.b, "PlusDivContentSerializer", "DivLayoutJson");
        Map map2 = s0Var.b;
        if (map2 != null) {
            map = new LinkedHashMap(tah.a(map2.size()));
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                m0 m0Var = (m0) entry.getValue();
                q qVar = (q) this.h.getValue();
                String str2 = m0Var.a;
                w4f w4fVar = m0Var.b;
                qVar.getClass();
                str2.getClass();
                ?? r6 = qVar.c;
                String lowerCase = StringsKt.t0(str2).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Function2 function2 = (Function2) r6.get(lowerCase);
                if (function2 == null) {
                    throw new com.yandex.plus.bdui.plus.utils.b(hrg.s("Unknown type \"", str2, "\" of layout param \"", str, "\"!"), null, null, 2);
                }
                com.yandex.plus.bdui.plus.content.g gVar = (com.yandex.plus.bdui.plus.content.g) function2.invoke(str, w4fVar);
                if (gVar == null) {
                    StringBuilder sb = new StringBuilder("Invalid value \"");
                    sb.append(w4fVar);
                    sb.append("\" of ");
                    sb.append(str2);
                    sb.append(" layout param \"");
                    throw new com.yandex.plus.bdui.plus.utils.b(su4.o(sb, str, "\"!"), null, null, 2);
                }
                map.put(key, gVar);
            }
        } else {
            map = e5b.a;
            map.getClass();
        }
        Map map3 = s0Var.c;
        if (map3 == null) {
            map3 = e5b.a;
            map3.getClass();
        }
        Map map4 = map3;
        p0 p0Var = s0Var.d;
        com.yandex.plus.bdui.plus.content.h hVar = new com.yandex.plus.bdui.plus.content.h(p0Var != null ? p0Var.a : null, p0Var != null ? p0Var.b : null, p0Var != null ? p0Var.c : null, p0Var != null ? p0Var.d : null, p0Var != null ? p0Var.e : null);
        g0 g0Var = s0Var.e;
        return new t0(cVar, map, map4, hVar, g0Var != null ? g0Var.a : null);
    }
}
