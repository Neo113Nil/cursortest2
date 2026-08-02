package com.yandex.plus.bdui.plus.templating.render;

import defpackage.tah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class d implements g {
    public final ArrayList a;

    @Override // com.yandex.plus.bdui.plus.templating.render.g
    public final Object a(Map map) {
        map.getClass();
        ArrayList<Pair> arrayList = this.a;
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Pair pair : arrayList) {
            linkedHashMap.put((String) pair.a, ((g) pair.b).a(map));
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Map(templates=" + this.a + ')';
    }
}
