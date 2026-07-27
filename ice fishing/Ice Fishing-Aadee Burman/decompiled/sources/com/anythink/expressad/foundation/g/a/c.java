package com.anythink.expressad.foundation.g.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements e<String, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f19113a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19114b;

    /* renamed from: c, reason: collision with root package name */
    private int f19115c;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f19114b = i;
        this.f19113a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap remove = this.f19113a.remove(str2);
                if (remove != null) {
                    this.f19115c -= a(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f19114b));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap remove = this.f19113a.remove(str);
                if (remove != null) {
                    this.f19115c -= a(remove);
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap b(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f19113a.get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                return bitmap;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                try {
                    this.f19115c += a(bitmap);
                    Bitmap put = this.f19113a.put(str, bitmap);
                    if (put != null) {
                        this.f19115c -= a(put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.f19114b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        throw new java.lang.IllegalStateException(com.anythink.expressad.foundation.g.a.c.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f19115c < 0 || (this.f19113a.isEmpty() && this.f19115c != 0)) {
                        break;
                    }
                    if (this.f19115c <= i || this.f19113a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, Bitmap> next = this.f19113a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int a9 = a(next.getValue());
                        this.f19113a.remove(key).recycle();
                        this.f19115c -= a9;
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
            hashSet = new HashSet(this.f19113a.keySet());
        }
        return hashSet;
    }

    private static int a(Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
