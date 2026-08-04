package com.gamericefishpro.space.bb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final e f;
    public final Set g;

    public b(String str, Set set, Set set2, int i, int i2, e eVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = eVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static a a(v vVar) {
        return new a(vVar, new v[0]);
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v.a(cls));
        for (Class cls2 : clsArr) {
            com.gamericefishpro.space.hj.c.m(cls2, "Null interface");
            hashSet.add(v.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new com.gamericefishpro.space.a8.b(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
