package com.anythink.expressad.b.b;

import com.anythink.expressad.foundation.g.a.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements e<String, b> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f18181a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18182b;

    /* renamed from: c, reason: collision with root package name */
    private int f18183c;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f18182b = i;
        this.f18181a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private static int c() {
        return 1;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f18182b));
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                if (this.f18181a.remove(str) != null) {
                    this.f18183c--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final b b(String str) {
        if (str != null) {
            synchronized (this) {
                b bVar = this.f18181a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f18183c++;
                    if (this.f18181a.put(str, bVar) != null) {
                        this.f18183c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f18182b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        throw new java.lang.IllegalStateException(com.anythink.expressad.b.b.c.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f18183c < 0 || (this.f18181a.isEmpty() && this.f18183c != 0)) {
                        break;
                    }
                    if (this.f18183c <= i || this.f18181a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, b> next = this.f18181a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    next.getValue();
                    try {
                        this.f18181a.remove(key);
                        this.f18183c--;
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f18181a.keySet());
        }
        return hashSet;
    }
}
