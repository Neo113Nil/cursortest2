package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3064d5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29707a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f29708b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29709c;

    /* renamed from: d, reason: collision with root package name */
    public final List f29710d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29711e;

    public C3064d5(int i, byte[] bArr, Map map, List list, boolean z3) {
        this.f29707a = i;
        this.f29708b = bArr;
        this.f29709c = map;
        this.f29710d = list == null ? null : Collections.unmodifiableList(list);
        this.f29711e = z3;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Z4((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3064d5(int i, byte[] bArr, boolean z3, List list) {
        this(i, bArr, r0, list, z3);
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z4 z42 = (Z4) it.next();
                treeMap.put(z42.f28837a, z42.f28838b);
            }
        }
    }
}
