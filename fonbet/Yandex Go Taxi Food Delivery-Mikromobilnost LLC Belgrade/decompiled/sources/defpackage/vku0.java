package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes15.dex */
public final class vku0 {
    public boolean c;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashSet b = new LinkedHashSet();
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    public final Object e = new Object();
    public final Object f = new Object();

    public final ReentrantReadWriteLock a() {
        return this.d;
    }

    public final LinkedHashMap b() {
        return this.a;
    }

    public final Object c() {
        return this.e;
    }

    public final boolean d() {
        return this.c;
    }

    public final Object e() {
        return this.f;
    }

    public final LinkedHashSet f() {
        return this.b;
    }

    public final void g() {
        this.c = true;
    }
}
