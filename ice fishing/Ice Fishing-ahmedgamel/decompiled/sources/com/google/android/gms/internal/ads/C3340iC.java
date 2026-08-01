package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3340iC extends AB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient Map f31011w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f31012x;

    /* renamed from: y, reason: collision with root package name */
    public final transient C3445kB f31013y;

    public C3340iC(Map map, C3445kB c3445kB) {
        AbstractC2772Sd.i(map.isEmpty());
        this.f31011w = map;
        this.f31013y = c3445kB;
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final Collection a() {
        return new C4254zB(0, this);
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final Map c() {
        Map map = this.f31011w;
        return map instanceof NavigableMap ? new C3822rB(this, (NavigableMap) map) : map instanceof SortedMap ? new C3984uB(this, (SortedMap) map) : new C3715pB(this, map);
    }

    public final void f() {
        Map map = this.f31011w;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f31012x = 0;
    }
}
