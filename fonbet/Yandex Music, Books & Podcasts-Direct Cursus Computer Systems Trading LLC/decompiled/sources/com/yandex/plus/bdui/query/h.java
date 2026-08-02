package com.yandex.plus.bdui.query;

import defpackage.uah;
import defpackage.uop;
import defpackage.z75;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h {
    public static final Set a = uop.b("idempotencyKey");

    public static final boolean a(g gVar, g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        return gVar != null && gVar2 != null && Intrinsics.d(gVar.getPath(), gVar2.getPath()) && c(gVar).equals(c(gVar2)) && Intrinsics.d(gVar.getBody(), gVar2.getBody());
    }

    public static final int b(g gVar) {
        if (gVar == null) {
            return 0;
        }
        int hashCode = (c(gVar).hashCode() + (gVar.getPath().hashCode() * 31)) * 31;
        Map body = gVar.getBody();
        return hashCode + (body != null ? body.hashCode() : 0);
    }

    public static final Map c(g gVar) {
        Map params = gVar.getParams();
        Set set = a;
        params.getClass();
        set.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(params);
        z75.y(linkedHashMap.keySet(), set);
        return uah.h(linkedHashMap);
    }
}
