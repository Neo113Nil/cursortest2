package com.yandex.plus.core.reflect;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.btf;
import defpackage.ern;
import defpackage.f9f;
import defpackage.jyr;
import defpackage.lm4;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class c {
    public final Map a;
    public final jyr b;

    public c(Map map) {
        map.getClass();
        this.a = map;
        this.b = btf.b(new s(8));
    }

    public final Pair a(Object obj) {
        Object obj2;
        Object obj3;
        obj.getClass();
        lm4 a = ern.a(obj.getClass());
        Map map = this.a;
        Object obj4 = map.get(a);
        Pair pair = obj4 != null ? new Pair(a, obj4) : null;
        if (pair != null) {
            return pair;
        }
        jyr jyrVar = this.b;
        f9f f9fVar = (f9f) ((Map) jyrVar.getValue()).get(a);
        Pair pair2 = (f9fVar == null || (obj3 = map.get(f9fVar)) == null) ? null : new Pair(f9fVar, obj3);
        if (pair2 != null) {
            return pair2;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((lm4) ((f9f) ((Map.Entry) obj2).getKey())).i(obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        Pair pair3 = entry != null ? new Pair((f9f) entry.getKey(), entry.getValue()) : null;
        if (pair3 == null) {
            return null;
        }
        ((Map) jyrVar.getValue()).put(a, pair3.a);
        return pair3;
    }
}
