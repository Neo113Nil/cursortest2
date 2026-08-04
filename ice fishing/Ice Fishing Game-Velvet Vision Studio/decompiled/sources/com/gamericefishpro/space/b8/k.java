package com.gamericefishpro.space.b8;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.e8.b {
    public Object d;
    public Object e;
    public Object i;
    public Object v;
    public Object w;
    public Object y;
    public Object z;

    public k() {
        this.d = new AtomicBoolean();
        this.e = null;
        this.i = new HashMap(16, 1.0f);
        this.v = new HashMap(16, 1.0f);
        this.w = new HashMap(16, 1.0f);
        this.y = new HashMap(16, 1.0f);
        this.z = null;
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        int i = 8;
        return new com.gamericefishpro.space.i8.h((Context) ((com.gamericefishpro.space.nh.a) this.d).get(), (com.gamericefishpro.space.d8.d) ((com.gamericefishpro.space.nh.a) this.e).get(), (com.gamericefishpro.space.j8.d) ((com.gamericefishpro.space.nh.a) this.i).get(), (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.a8.c) this.v).get(), (Executor) ((com.gamericefishpro.space.nh.a) this.w).get(), (com.gamericefishpro.space.k8.c) ((com.gamericefishpro.space.nh.a) this.y).get(), new com.gamericefishpro.space.v8.l(i), new com.gamericefishpro.space.lb.e(i), (com.gamericefishpro.space.j8.c) ((com.gamericefishpro.space.nh.a) this.z).get());
    }

    public k(Set set, com.gamericefishpro.space.t.e eVar, String str, String str2, com.gamericefishpro.space.o9.a aVar) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.d = setUnmodifiableSet;
        Map map = eVar == null ? Collections.EMPTY_MAP : eVar;
        this.i = map;
        this.y = str;
        this.w = str2;
        this.z = aVar == null ? com.gamericefishpro.space.o9.a.a : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.e = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw com.gamericefishpro.space.m5.a.f(it);
    }
}
