package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3908sK extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34736n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4070vK f34737u;

    public /* synthetic */ C3908sK(C4070vK c4070vK, int i) {
        this.f34736n = i;
        this.f34737u = c4070vK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f34736n) {
            case 0:
                this.f34737u.clear();
                break;
            default:
                this.f34737u.clear();
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
        C4016uK a9;
        switch (this.f34736n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C4070vK c4070vK = this.f34737u;
                c4070vK.getClass();
                Object key = entry.getKey();
                C4016uK c4016uK = null;
                if (key != null) {
                    try {
                        a9 = c4070vK.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a9 != null && Objects.equals(a9.f35298z, entry.getValue())) {
                        c4016uK = a9;
                    }
                    return c4016uK == null;
                }
                a9 = null;
                if (a9 != null) {
                    c4016uK = a9;
                }
                if (c4016uK == null) {
                }
            default:
                return this.f34737u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f34736n) {
            case 0:
                return new C3854rK(this.f34737u, 0);
            default:
                return new C3854rK(this.f34737u, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        C4016uK a9;
        switch (this.f34736n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C4070vK c4070vK = this.f34737u;
                    c4070vK.getClass();
                    Object key = entry.getKey();
                    C4016uK c4016uK = null;
                    if (key != null) {
                        try {
                            a9 = c4070vK.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a9 != null && Objects.equals(a9.f35298z, entry.getValue())) {
                            c4016uK = a9;
                        }
                        if (c4016uK == null) {
                            c4070vK.b(c4016uK, true);
                            break;
                        }
                    }
                    a9 = null;
                    if (a9 != null) {
                        c4016uK = a9;
                    }
                    if (c4016uK == null) {
                    }
                }
                break;
            default:
                C4070vK c4070vK2 = this.f34737u;
                c4070vK2.getClass();
                C4016uK c4016uK2 = null;
                if (obj != null) {
                    try {
                        c4016uK2 = c4070vK2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c4016uK2 != null) {
                    c4070vK2.b(c4016uK2, true);
                }
                if (c4016uK2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f34736n) {
        }
        return this.f34737u.f35453v;
    }
}
