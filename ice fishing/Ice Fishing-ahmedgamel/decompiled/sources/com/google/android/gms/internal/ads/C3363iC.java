package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3363iC extends AB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient Map f31784w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f31785x;

    /* renamed from: y, reason: collision with root package name */
    public final transient C3468kB f31786y;

    public C3363iC(Map map, C3468kB c3468kB) {
        AbstractC2792Sd.i(map.isEmpty());
        this.f31784w = map;
        this.f31786y = c3468kB;
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final Collection a() {
        return new C4277zB(0, this);
    }

    @Override // com.google.android.gms.internal.ads.AB
    public final Map c() {
        Map map = this.f31784w;
        return map instanceof NavigableMap ? new C3845rB(this, (NavigableMap) map) : map instanceof SortedMap ? new C4007uB(this, (SortedMap) map) : new C3738pB(this, map);
    }

    public final void f() {
        Map map = this.f31784w;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f31785x = 0;
    }
}
