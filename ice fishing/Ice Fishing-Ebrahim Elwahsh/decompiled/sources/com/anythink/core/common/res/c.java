package com.anythink.core.common.res;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f16365a;

    /* renamed from: b, reason: collision with root package name */
    private int f16366b;

    /* renamed from: c, reason: collision with root package name */
    private int f16367c;

    /* renamed from: d, reason: collision with root package name */
    private int f16368d;

    /* renamed from: e, reason: collision with root package name */
    private int f16369e;

    /* renamed from: f, reason: collision with root package name */
    private int f16370f;

    /* renamed from: g, reason: collision with root package name */
    private int f16371g;

    /* renamed from: h, reason: collision with root package name */
    private int f16372h;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f16367c = i;
        this.f16365a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private static V b() {
        return null;
    }

    private int c(K k6, V v6) {
        int a9 = a(k6, v6);
        if (a9 >= 0) {
            return a9;
        }
        throw new IllegalStateException("Negative size: " + k6 + "=" + v6);
    }

    private synchronized int d() {
        return this.f16367c;
    }

    private synchronized int e() {
        return this.f16371g;
    }

    private synchronized int f() {
        return this.f16372h;
    }

    private synchronized int g() {
        return this.f16369e;
    }

    private synchronized int h() {
        return this.f16368d;
    }

    private synchronized int i() {
        return this.f16370f;
    }

    private synchronized Map<K, V> j() {
        return new LinkedHashMap(this.f16365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k() {
        K key;
        V value;
        synchronized (this.f16365a) {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16366b < 0 || (this.f16365a.isEmpty() && this.f16366b != 0)) {
                            break;
                        }
                        if (this.f16366b != 0) {
                            Map.Entry<K, V> next = this.f16365a.entrySet().size() > 0 ? this.f16365a.entrySet().iterator().next() : null;
                            if (next != null) {
                                key = next.getKey();
                                value = next.getValue();
                                this.f16365a.remove(key);
                                this.f16366b -= c(key, value);
                                this.f16370f++;
                            }
                        }
                    } finally {
                    }
                }
                a(true, key, value, null);
            }
            this.f16365a.clear();
        }
    }

    public int a(K k6, V v6) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i4;
        try {
            i = this.f16371g;
            i4 = this.f16372h + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f16367c), Integer.valueOf(this.f16371g), Integer.valueOf(this.f16372h), Integer.valueOf(i4 != 0 ? (i * 100) / i4 : 0));
    }

    public void a(boolean z8, K k6, V v6, V v9) {
    }

    public final V b(K k6, V v6) {
        V put;
        if (k6 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f16368d++;
                this.f16366b += c(k6, v6);
                put = this.f16365a.put(k6, v6);
                if (put != null) {
                    this.f16366b -= c(k6, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            a(false, k6, put, v6);
        }
        b(this.f16367c);
        return put;
    }

    private void a(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f16367c = i;
            }
            b(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private synchronized int c() {
        return this.f16366b;
    }

    public final V a(K k6) {
        if (k6 != null) {
            synchronized (this) {
                try {
                    V v6 = this.f16365a.get(k6);
                    if (v6 != null) {
                        this.f16371g++;
                        return v6;
                    }
                    this.f16372h++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r5.f16366b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + r5.f16366b + ", map.isEmpty(): " + r5.f16365a.isEmpty());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f16366b < 0 || (this.f16365a.isEmpty() && this.f16366b != 0)) {
                        break;
                    }
                    if (this.f16366b <= i) {
                        return;
                    }
                    Map.Entry<K, V> next = this.f16365a.entrySet().size() > 0 ? this.f16365a.entrySet().iterator().next() : null;
                    if (next == null) {
                        return;
                    }
                    key = next.getKey();
                    value = next.getValue();
                    this.f16365a.remove(key);
                    this.f16366b -= c(key, value);
                    this.f16370f++;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            a(true, key, value, null);
        }
    }

    public final void a() {
        b(-1);
    }

    private V b(K k6) {
        V remove;
        if (k6 != null) {
            synchronized (this) {
                try {
                    remove = this.f16365a.remove(k6);
                    if (remove != null) {
                        this.f16366b -= c(k6, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                a(false, k6, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }
}
