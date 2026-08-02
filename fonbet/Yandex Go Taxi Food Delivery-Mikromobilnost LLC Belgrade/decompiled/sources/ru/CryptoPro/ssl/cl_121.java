package ru.CryptoPro.ssl;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class cl_121 extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
