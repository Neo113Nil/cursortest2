package com.anythink.core.common.n.a;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private int f15610a;

    public j() {
        this((byte) 0);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.f15610a;
    }

    private j(byte b9) {
        super(256, 1.0f, true);
        this.f15610a = 256;
    }
}
