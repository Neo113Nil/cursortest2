package com.yandex.plus.bdui.templating.render;

import defpackage.k5r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final g a;
    public final LinkedHashMap b;
    public final Map c;

    public c(g gVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = gVar;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && Intrinsics.d(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Templates(pathValueOrTemplate=");
        sb.append(this.a);
        sb.append(", paramsValuesOrTemplates=");
        sb.append(this.b);
        sb.append(", bodyValuesOrTemplates=");
        return k5r.p(sb, this.c, ')');
    }
}
