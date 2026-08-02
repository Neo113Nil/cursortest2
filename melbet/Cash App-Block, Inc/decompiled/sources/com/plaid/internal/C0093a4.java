package com.plaid.internal;

import android.util.LruCache;

/* renamed from: com.plaid.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0093a4<K, V> implements InterfaceC0331y<K, V> {
    public final LruCache<K, V> a = new LruCache<>(10);

    @Override // com.plaid.internal.InterfaceC0331y
    public final Object a(String str) {
        return this.a.get(str);
    }

    @Override // com.plaid.internal.InterfaceC0331y
    public final void clear() {
        this.a.evictAll();
    }

    @Override // com.plaid.internal.InterfaceC0331y
    public final void a(String str, Object obj) {
        this.a.put(str, obj);
    }
}
