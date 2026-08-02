package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzchx extends LinkedHashMap {
    private zzchx() {
        throw null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
