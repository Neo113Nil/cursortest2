package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3885sK extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33968n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4047vK f33969u;

    public /* synthetic */ C3885sK(C4047vK c4047vK, int i) {
        this.f33968n = i;
        this.f33969u = c4047vK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f33968n) {
            case 0:
                this.f33969u.clear();
                break;
            default:
                this.f33969u.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        C3993uK a9;
        switch (this.f33968n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C4047vK c4047vK = this.f33969u;
                c4047vK.getClass();
                Object key = entry.getKey();
                C3993uK c3993uK = null;
                if (key != null) {
                    try {
                        a9 = c4047vK.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a9 != null && Objects.equals(a9.f34524z, entry.getValue())) {
                        c3993uK = a9;
                    }
                    return c3993uK == null;
                }
                a9 = null;
                if (a9 != null) {
                    c3993uK = a9;
                }
                if (c3993uK == null) {
                }
            default:
                return this.f33969u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f33968n) {
            case 0:
                return new C3831rK(this.f33969u, 0);
            default:
                return new C3831rK(this.f33969u, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        C3993uK a9;
        switch (this.f33968n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C4047vK c4047vK = this.f33969u;
                    c4047vK.getClass();
                    Object key = entry.getKey();
                    C3993uK c3993uK = null;
                    if (key != null) {
                        try {
                            a9 = c4047vK.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a9 != null && Objects.equals(a9.f34524z, entry.getValue())) {
                            c3993uK = a9;
                        }
                        if (c3993uK == null) {
                            c4047vK.b(c3993uK, true);
                            break;
                        }
                    }
                    a9 = null;
                    if (a9 != null) {
                        c3993uK = a9;
                    }
                    if (c3993uK == null) {
                    }
                }
                break;
            default:
                C4047vK c4047vK2 = this.f33969u;
                c4047vK2.getClass();
                C3993uK c3993uK2 = null;
                if (obj != null) {
                    try {
                        c3993uK2 = c4047vK2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c3993uK2 != null) {
                    c4047vK2.b(c3993uK2, true);
                }
                if (c3993uK2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f33968n) {
        }
        return this.f33969u.f34690v;
    }
}
