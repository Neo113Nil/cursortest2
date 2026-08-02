package com.anythink.core.common.res;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f16994a;

    /* renamed from: b, reason: collision with root package name */
    private int f16995b;

    /* renamed from: c, reason: collision with root package name */
    private int f16996c;

    /* renamed from: d, reason: collision with root package name */
    private int f16997d;

    /* renamed from: e, reason: collision with root package name */
    private int f16998e;

    /* renamed from: f, reason: collision with root package name */
    private int f16999f;

    /* renamed from: g, reason: collision with root package name */
    private int f17000g;

    /* renamed from: h, reason: collision with root package name */
    private int f17001h;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f16996c = i;
        this.f16994a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private static V b() {
        return null;
    }

    private int c(K k9, V v9) {
        int a9 = a(k9, v9);
        if (a9 >= 0) {
            return a9;
        }
        throw new IllegalStateException("Negative size: " + k9 + "=" + v9);
    }

    private synchronized int d() {
        return this.f16996c;
    }

    private synchronized int e() {
        return this.f17000g;
    }

    private synchronized int f() {
        return this.f17001h;
    }

    private synchronized int g() {
        return this.f16998e;
    }

    private synchronized int h() {
        return this.f16997d;
    }

    private synchronized int i() {
        return this.f16999f;
    }

    private synchronized Map<K, V> j() {
        return new LinkedHashMap(this.f16994a);
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
        synchronized (this.f16994a) {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16995b < 0 || (this.f16994a.isEmpty() && this.f16995b != 0)) {
                            break;
                        }
                        if (this.f16995b != 0) {
                            Map.Entry<K, V> next = this.f16994a.entrySet().size() > 0 ? this.f16994a.entrySet().iterator().next() : null;
                            if (next != null) {
                                key = next.getKey();
                                value = next.getValue();
                                this.f16994a.remove(key);
                                this.f16995b -= c(key, value);
                                this.f16999f++;
                            }
                        }
                    } finally {
                    }
                }
                a(true, key, value, null);
            }
            this.f16994a.clear();
        }
    }

    public int a(K k9, V v9) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i4;
        try {
            i = this.f17000g;
            i4 = this.f17001h + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f16996c), Integer.valueOf(this.f17000g), Integer.valueOf(this.f17001h), Integer.valueOf(i4 != 0 ? (i * 100) / i4 : 0));
    }

    public void a(boolean z6, K k9, V v9, V v10) {
    }

    public final V b(K k9, V v9) {
        V put;
        if (k9 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f16997d++;
                this.f16995b += c(k9, v9);
                put = this.f16994a.put(k9, v9);
                if (put != null) {
                    this.f16995b -= c(k9, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            a(false, k9, put, v9);
        }
        b(this.f16996c);
        return put;
    }

    private void a(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f16996c = i;
            }
            b(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private synchronized int c() {
        return this.f16995b;
    }

    public final V a(K k9) {
        if (k9 != null) {
            synchronized (this) {
                try {
                    V v9 = this.f16994a.get(k9);
                    if (v9 != null) {
                        this.f17000g++;
                        return v9;
                    }
                    this.f17001h++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r5.f16995b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + r5.f16995b + ", map.isEmpty(): " + r5.f16994a.isEmpty());
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
                    if (this.f16995b < 0 || (this.f16994a.isEmpty() && this.f16995b != 0)) {
                        break;
                    }
                    if (this.f16995b <= i) {
                        return;
                    }
                    Map.Entry<K, V> next = this.f16994a.entrySet().size() > 0 ? this.f16994a.entrySet().iterator().next() : null;
                    if (next == null) {
                        return;
                    }
                    key = next.getKey();
                    value = next.getValue();
                    this.f16994a.remove(key);
                    this.f16995b -= c(key, value);
                    this.f16999f++;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            a(true, key, value, null);
        }
    }

    public final void a() {
        b(-1);
    }

    private V b(K k9) {
        V remove;
        if (k9 != null) {
            synchronized (this) {
                try {
                    remove = this.f16994a.remove(k9);
                    if (remove != null) {
                        this.f16995b -= c(k9, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                a(false, k9, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }
}
