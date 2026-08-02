package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class AB {

    /* renamed from: n, reason: collision with root package name */
    public transient Set f24427n;

    /* renamed from: u, reason: collision with root package name */
    public transient Collection f24428u;

    /* renamed from: v, reason: collision with root package name */
    public transient Map f24429v;

    public abstract Collection a();

    public abstract Map c();

    public boolean d(Object obj) {
        Iterator it = e().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map e() {
        Map map = this.f24429v;
        if (map != null) {
            return map;
        }
        Map c9 = c();
        this.f24429v = c9;
        return c9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AB) {
            return e().equals(((AB) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        return e().toString();
    }
}
