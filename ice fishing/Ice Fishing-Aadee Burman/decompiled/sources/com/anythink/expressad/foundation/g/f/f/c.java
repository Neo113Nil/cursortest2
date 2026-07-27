package com.anythink.expressad.foundation.g.f.f;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f19319a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19320b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f19321c;

    /* renamed from: d, reason: collision with root package name */
    public final List<com.anythink.expressad.foundation.g.f.c.c> f19322d;

    public c(int i, byte[] bArr, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this(i, bArr, a(list), list);
    }

    private static Map<String, String> a(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.anythink.expressad.foundation.g.f.c.c cVar : list) {
            treeMap.put(cVar.a(), cVar.b());
        }
        return treeMap;
    }

    private c(int i, byte[] bArr, Map<String, String> map, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this.f19319a = i;
        this.f19320b = bArr;
        this.f19321c = map;
        if (list == null) {
            this.f19322d = null;
        } else {
            this.f19322d = Collections.unmodifiableList(list);
        }
    }
}
