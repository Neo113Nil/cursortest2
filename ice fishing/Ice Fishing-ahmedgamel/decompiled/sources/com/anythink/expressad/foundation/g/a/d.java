package com.anythink.expressad.foundation.g.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements e<String, JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private int f19905c;

    /* renamed from: b, reason: collision with root package name */
    private final int f19904b = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f19903a = new LinkedHashMap<>(0, 0.75f, true);

    private static int c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                if (this.f19903a.remove(str2) != null) {
                    this.f19905c--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f19904b));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                if (this.f19903a.remove(str) != null) {
                    this.f19905c--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f19903a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                try {
                    this.f19905c++;
                    if (this.f19903a.put(str, jSONObject) != null) {
                        this.f19905c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f19904b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        throw new java.lang.IllegalStateException(com.anythink.expressad.foundation.g.a.d.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f19905c < 0 || (this.f19903a.isEmpty() && this.f19905c != 0)) {
                        break;
                    }
                    if (this.f19905c <= i || this.f19903a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, JSONObject> next = this.f19903a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    next.getValue();
                    try {
                        this.f19903a.remove(key);
                        this.f19905c--;
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
            hashSet = new HashSet(this.f19903a.keySet());
        }
        return hashSet;
    }
}
