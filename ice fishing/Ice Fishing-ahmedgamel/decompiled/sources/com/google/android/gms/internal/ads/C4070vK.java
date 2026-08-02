package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4070vK extends AbstractMap implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final C3027c f35450A = new C3027c(19);

    /* renamed from: n, reason: collision with root package name */
    public final C3027c f35451n;

    /* renamed from: u, reason: collision with root package name */
    public C4016uK f35452u;

    /* renamed from: v, reason: collision with root package name */
    public int f35453v;

    /* renamed from: w, reason: collision with root package name */
    public int f35454w;

    /* renamed from: x, reason: collision with root package name */
    public final C4016uK f35455x;

    /* renamed from: y, reason: collision with root package name */
    public C3908sK f35456y;

    /* renamed from: z, reason: collision with root package name */
    public C3908sK f35457z;

    public C4070vK() {
        C3027c c3027c = f35450A;
        this.f35453v = 0;
        this.f35454w = 0;
        this.f35451n = c3027c;
        this.f35455x = new C4016uK();
    }

    public final C4016uK a(Object obj, boolean z6) {
        int i;
        C4016uK c4016uK;
        C4016uK c4016uK2 = this.f35452u;
        C3027c c3027c = f35450A;
        C3027c c3027c2 = this.f35451n;
        if (c4016uK2 != null) {
            Comparable comparable = c3027c2 == c3027c ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c4016uK2.f35297y;
                i = comparable != null ? comparable.compareTo(obj2) : c3027c2.compare(obj, obj2);
                if (i == 0) {
                    return c4016uK2;
                }
                C4016uK c4016uK3 = i < 0 ? c4016uK2.f35293u : c4016uK2.f35294v;
                if (c4016uK3 == null) {
                    break;
                }
                c4016uK2 = c4016uK3;
            }
        } else {
            i = 0;
        }
        if (!z6) {
            return null;
        }
        C4016uK c4016uK4 = this.f35455x;
        if (c4016uK2 != null) {
            C4016uK c4016uK5 = new C4016uK(c4016uK2, obj, c4016uK4, c4016uK4.f35296x);
            if (i < 0) {
                c4016uK2.f35293u = c4016uK5;
            } else {
                c4016uK2.f35294v = c4016uK5;
            }
            d(c4016uK2, true);
            c4016uK = c4016uK5;
        } else {
            if (c3027c2 == c3027c && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c4016uK = new C4016uK(null, obj, c4016uK4, c4016uK4.f35296x);
            this.f35452u = c4016uK;
        }
        this.f35453v++;
        this.f35454w++;
        return c4016uK;
    }

    public final void b(C4016uK c4016uK, boolean z6) {
        C4016uK c4016uK2;
        C4016uK c4016uK3;
        int i;
        if (z6) {
            C4016uK c4016uK4 = c4016uK.f35296x;
            c4016uK4.f35295w = c4016uK.f35295w;
            c4016uK.f35295w.f35296x = c4016uK4;
        }
        C4016uK c4016uK5 = c4016uK.f35293u;
        C4016uK c4016uK6 = c4016uK.f35294v;
        C4016uK c4016uK7 = c4016uK.f35292n;
        int i4 = 0;
        if (c4016uK5 == null || c4016uK6 == null) {
            if (c4016uK5 != null) {
                c(c4016uK, c4016uK5);
                c4016uK.f35293u = null;
            } else if (c4016uK6 != null) {
                c(c4016uK, c4016uK6);
                c4016uK.f35294v = null;
            } else {
                c(c4016uK, null);
            }
            d(c4016uK7, false);
            this.f35453v--;
            this.f35454w++;
            return;
        }
        if (c4016uK5.f35291A > c4016uK6.f35291A) {
            do {
                c4016uK3 = c4016uK5;
                c4016uK5 = c4016uK5.f35294v;
            } while (c4016uK5 != null);
        } else {
            do {
                c4016uK2 = c4016uK6;
                c4016uK6 = c4016uK6.f35293u;
            } while (c4016uK6 != null);
            c4016uK3 = c4016uK2;
        }
        b(c4016uK3, false);
        C4016uK c4016uK8 = c4016uK.f35293u;
        if (c4016uK8 != null) {
            i = c4016uK8.f35291A;
            c4016uK3.f35293u = c4016uK8;
            c4016uK8.f35292n = c4016uK3;
            c4016uK.f35293u = null;
        } else {
            i = 0;
        }
        C4016uK c4016uK9 = c4016uK.f35294v;
        if (c4016uK9 != null) {
            i4 = c4016uK9.f35291A;
            c4016uK3.f35294v = c4016uK9;
            c4016uK9.f35292n = c4016uK3;
            c4016uK.f35294v = null;
        }
        c4016uK3.f35291A = Math.max(i, i4) + 1;
        c(c4016uK, c4016uK3);
    }

    public final void c(C4016uK c4016uK, C4016uK c4016uK2) {
        C4016uK c4016uK3 = c4016uK.f35292n;
        c4016uK.f35292n = null;
        if (c4016uK2 != null) {
            c4016uK2.f35292n = c4016uK3;
        }
        if (c4016uK3 == null) {
            this.f35452u = c4016uK2;
        } else if (c4016uK3.f35293u == c4016uK) {
            c4016uK3.f35293u = c4016uK2;
        } else {
            c4016uK3.f35294v = c4016uK2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f35452u = null;
        this.f35453v = 0;
        this.f35454w++;
        C4016uK c4016uK = this.f35455x;
        c4016uK.f35296x = c4016uK;
        c4016uK.f35295w = c4016uK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C4016uK c4016uK = null;
        if (obj != null) {
            try {
                c4016uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c4016uK != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C4016uK c4016uK, boolean z6) {
        while (c4016uK != null) {
            C4016uK c4016uK2 = c4016uK.f35293u;
            C4016uK c4016uK3 = c4016uK.f35294v;
            boolean z9 = false;
            int i = c4016uK2 != null ? c4016uK2.f35291A : 0;
            int i4 = c4016uK3 != null ? c4016uK3.f35291A : 0;
            int i6 = i - i4;
            boolean z10 = true;
            if (i6 == -2) {
                C4016uK c4016uK4 = c4016uK3.f35293u;
                C4016uK c4016uK5 = c4016uK3.f35294v;
                int i9 = (c4016uK4 != null ? c4016uK4.f35291A : 0) - (c4016uK5 != null ? c4016uK5.f35291A : 0);
                if (i9 != -1) {
                    if (i9 != 0) {
                        z10 = z6;
                    }
                    f(c4016uK3);
                    e(c4016uK);
                    if (!z10) {
                        return;
                    }
                } else {
                    z9 = z6;
                }
                e(c4016uK);
                z10 = z9;
                if (!z10) {
                }
            } else if (i6 == 2) {
                C4016uK c4016uK6 = c4016uK2.f35293u;
                C4016uK c4016uK7 = c4016uK2.f35294v;
                int i10 = (c4016uK6 != null ? c4016uK6.f35291A : 0) - (c4016uK7 != null ? c4016uK7.f35291A : 0);
                if (i10 != 1) {
                    if (i10 != 0) {
                        z10 = z6;
                    }
                    e(c4016uK2);
                    f(c4016uK);
                    if (!z10) {
                        return;
                    }
                } else {
                    z9 = z6;
                }
                f(c4016uK);
                z10 = z9;
                if (!z10) {
                }
            } else if (i6 == 0) {
                c4016uK.f35291A = i + 1;
                if (z6) {
                    return;
                }
            } else {
                c4016uK.f35291A = Math.max(i, i4) + 1;
                if (!z6) {
                    return;
                }
            }
            c4016uK = c4016uK.f35292n;
        }
    }

    public final void e(C4016uK c4016uK) {
        C4016uK c4016uK2 = c4016uK.f35293u;
        C4016uK c4016uK3 = c4016uK.f35294v;
        C4016uK c4016uK4 = c4016uK3.f35293u;
        C4016uK c4016uK5 = c4016uK3.f35294v;
        c4016uK.f35294v = c4016uK4;
        if (c4016uK4 != null) {
            c4016uK4.f35292n = c4016uK;
        }
        c(c4016uK, c4016uK3);
        c4016uK3.f35293u = c4016uK;
        c4016uK.f35292n = c4016uK3;
        int max = Math.max(c4016uK2 != null ? c4016uK2.f35291A : 0, c4016uK4 != null ? c4016uK4.f35291A : 0) + 1;
        c4016uK.f35291A = max;
        c4016uK3.f35291A = Math.max(max, c4016uK5 != null ? c4016uK5.f35291A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3908sK c3908sK = this.f35456y;
        if (c3908sK != null) {
            return c3908sK;
        }
        C3908sK c3908sK2 = new C3908sK(this, 0);
        this.f35456y = c3908sK2;
        return c3908sK2;
    }

    public final void f(C4016uK c4016uK) {
        C4016uK c4016uK2 = c4016uK.f35293u;
        C4016uK c4016uK3 = c4016uK.f35294v;
        C4016uK c4016uK4 = c4016uK2.f35293u;
        C4016uK c4016uK5 = c4016uK2.f35294v;
        c4016uK.f35293u = c4016uK5;
        if (c4016uK5 != null) {
            c4016uK5.f35292n = c4016uK;
        }
        c(c4016uK, c4016uK2);
        c4016uK2.f35294v = c4016uK;
        c4016uK.f35292n = c4016uK2;
        int max = Math.max(c4016uK3 != null ? c4016uK3.f35291A : 0, c4016uK5 != null ? c4016uK5.f35291A : 0) + 1;
        c4016uK.f35291A = max;
        c4016uK2.f35291A = Math.max(max, c4016uK4 != null ? c4016uK4.f35291A : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        C4016uK c4016uK;
        if (obj != null) {
            try {
                c4016uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c4016uK == null) {
                return c4016uK.f35298z;
            }
            return null;
        }
        c4016uK = null;
        if (c4016uK == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3908sK c3908sK = this.f35457z;
        if (c3908sK != null) {
            return c3908sK;
        }
        C3908sK c3908sK2 = new C3908sK(this, 1);
        this.f35457z = c3908sK2;
        return c3908sK2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        C4016uK a9 = a(obj, true);
        Object obj3 = a9.f35298z;
        a9.f35298z = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        C4016uK c4016uK;
        if (obj != null) {
            try {
                c4016uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c4016uK != null) {
                b(c4016uK, true);
            }
            if (c4016uK == null) {
                return c4016uK.f35298z;
            }
            return null;
        }
        c4016uK = null;
        if (c4016uK != null) {
        }
        if (c4016uK == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35453v;
    }
}
