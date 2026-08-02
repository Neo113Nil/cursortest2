package com.anythink.expressad.foundation.g.f.f;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f20106a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20107b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f20108c;

    /* renamed from: d, reason: collision with root package name */
    public final List<com.anythink.expressad.foundation.g.f.c.c> f20109d;

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
        this.f20106a = i;
        this.f20107b = bArr;
        this.f20108c = map;
        if (list == null) {
            this.f20109d = null;
        } else {
            this.f20109d = Collections.unmodifiableList(list);
        }
    }
}
