package com.anythink.expressad.foundation.g.a;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a<K, V> implements e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f19264a = "cache";

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, Reference<V>> f19265b = Collections.synchronizedMap(new HashMap());

    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(K k6, V v6) {
        this.f19265b.put(k6, c(v6));
        return true;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final V b(K k6) {
        Reference<V> reference = this.f19265b.get(k6);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public abstract Reference<V> c(V v6);

    @Override // com.anythink.expressad.foundation.g.a.e
    public void a(K k6) {
        this.f19265b.remove(k6);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<K> a() {
        HashSet hashSet;
        synchronized (this.f19265b) {
            hashSet = new HashSet(this.f19265b.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public void b() {
        this.f19265b.clear();
    }
}
