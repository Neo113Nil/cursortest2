package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a<K, V> extends HashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f21178a = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<K, a<K, V>.C0135a<K, V>> f21179b = new HashMap<>();

    /* renamed from: com.anythink.expressad.video.dynview.d.a$a, reason: collision with other inner class name */
    public class C0135a<K, V> extends SoftReference<V> {

        /* renamed from: a, reason: collision with root package name */
        K f21180a;

        public C0135a(K k9, V v9, ReferenceQueue referenceQueue) {
            super(v9, referenceQueue);
            this.f21180a = k9;
        }
    }

    private void a() {
        while (true) {
            C0135a c0135a = (C0135a) this.f21178a.poll();
            if (c0135a == null) {
                return;
            } else {
                this.f21179b.remove(c0135a.f21180a);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.f21179b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0135a<K, V> c0135a = this.f21179b.get(obj);
        if (c0135a == null) {
            return null;
        }
        return c0135a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k9, V v9) {
        a();
        a<K, V>.C0135a<K, V> put = this.f21179b.put(k9, new C0135a<>(k9, v9, this.f21178a));
        if (put == null) {
            return null;
        }
        return put.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0135a<K, V> remove = this.f21179b.remove(obj);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.f21179b.size();
    }
}
