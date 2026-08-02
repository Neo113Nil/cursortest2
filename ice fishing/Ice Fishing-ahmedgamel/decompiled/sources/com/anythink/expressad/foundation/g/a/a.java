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
    protected static final String f19893a = "cache";

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, Reference<V>> f19894b = Collections.synchronizedMap(new HashMap());

    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(K k9, V v9) {
        this.f19894b.put(k9, c(v9));
        return true;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final V b(K k9) {
        Reference<V> reference = this.f19894b.get(k9);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public abstract Reference<V> c(V v9);

    @Override // com.anythink.expressad.foundation.g.a.e
    public void a(K k9) {
        this.f19894b.remove(k9);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<K> a() {
        HashSet hashSet;
        synchronized (this.f19894b) {
            hashSet = new HashSet(this.f19894b.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public void b() {
        this.f19894b.clear();
    }
}
