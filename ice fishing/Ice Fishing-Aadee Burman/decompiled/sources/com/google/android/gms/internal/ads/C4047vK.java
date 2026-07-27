package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4047vK extends AbstractMap implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final C3004c f34687A = new C3004c(19);

    /* renamed from: n, reason: collision with root package name */
    public final C3004c f34688n;

    /* renamed from: u, reason: collision with root package name */
    public C3993uK f34689u;

    /* renamed from: v, reason: collision with root package name */
    public int f34690v;

    /* renamed from: w, reason: collision with root package name */
    public int f34691w;

    /* renamed from: x, reason: collision with root package name */
    public final C3993uK f34692x;

    /* renamed from: y, reason: collision with root package name */
    public C3885sK f34693y;

    /* renamed from: z, reason: collision with root package name */
    public C3885sK f34694z;

    public C4047vK() {
        C3004c c3004c = f34687A;
        this.f34690v = 0;
        this.f34691w = 0;
        this.f34688n = c3004c;
        this.f34692x = new C3993uK();
    }

    public final C3993uK a(Object obj, boolean z3) {
        int i;
        C3993uK c3993uK;
        C3993uK c3993uK2 = this.f34689u;
        C3004c c3004c = f34687A;
        C3004c c3004c2 = this.f34688n;
        if (c3993uK2 != null) {
            Comparable comparable = c3004c2 == c3004c ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c3993uK2.f34523y;
                i = comparable != null ? comparable.compareTo(obj2) : c3004c2.compare(obj, obj2);
                if (i == 0) {
                    return c3993uK2;
                }
                C3993uK c3993uK3 = i < 0 ? c3993uK2.f34519u : c3993uK2.f34520v;
                if (c3993uK3 == null) {
                    break;
                }
                c3993uK2 = c3993uK3;
            }
        } else {
            i = 0;
        }
        if (!z3) {
            return null;
        }
        C3993uK c3993uK4 = this.f34692x;
        if (c3993uK2 != null) {
            C3993uK c3993uK5 = new C3993uK(c3993uK2, obj, c3993uK4, c3993uK4.f34522x);
            if (i < 0) {
                c3993uK2.f34519u = c3993uK5;
            } else {
                c3993uK2.f34520v = c3993uK5;
            }
            d(c3993uK2, true);
            c3993uK = c3993uK5;
        } else {
            if (c3004c2 == c3004c && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c3993uK = new C3993uK(null, obj, c3993uK4, c3993uK4.f34522x);
            this.f34689u = c3993uK;
        }
        this.f34690v++;
        this.f34691w++;
        return c3993uK;
    }

    public final void b(C3993uK c3993uK, boolean z3) {
        C3993uK c3993uK2;
        C3993uK c3993uK3;
        int i;
        if (z3) {
            C3993uK c3993uK4 = c3993uK.f34522x;
            c3993uK4.f34521w = c3993uK.f34521w;
            c3993uK.f34521w.f34522x = c3993uK4;
        }
        C3993uK c3993uK5 = c3993uK.f34519u;
        C3993uK c3993uK6 = c3993uK.f34520v;
        C3993uK c3993uK7 = c3993uK.f34518n;
        int i6 = 0;
        if (c3993uK5 == null || c3993uK6 == null) {
            if (c3993uK5 != null) {
                c(c3993uK, c3993uK5);
                c3993uK.f34519u = null;
            } else if (c3993uK6 != null) {
                c(c3993uK, c3993uK6);
                c3993uK.f34520v = null;
            } else {
                c(c3993uK, null);
            }
            d(c3993uK7, false);
            this.f34690v--;
            this.f34691w++;
            return;
        }
        if (c3993uK5.f34517A > c3993uK6.f34517A) {
            do {
                c3993uK3 = c3993uK5;
                c3993uK5 = c3993uK5.f34520v;
            } while (c3993uK5 != null);
        } else {
            do {
                c3993uK2 = c3993uK6;
                c3993uK6 = c3993uK6.f34519u;
            } while (c3993uK6 != null);
            c3993uK3 = c3993uK2;
        }
        b(c3993uK3, false);
        C3993uK c3993uK8 = c3993uK.f34519u;
        if (c3993uK8 != null) {
            i = c3993uK8.f34517A;
            c3993uK3.f34519u = c3993uK8;
            c3993uK8.f34518n = c3993uK3;
            c3993uK.f34519u = null;
        } else {
            i = 0;
        }
        C3993uK c3993uK9 = c3993uK.f34520v;
        if (c3993uK9 != null) {
            i6 = c3993uK9.f34517A;
            c3993uK3.f34520v = c3993uK9;
            c3993uK9.f34518n = c3993uK3;
            c3993uK.f34520v = null;
        }
        c3993uK3.f34517A = Math.max(i, i6) + 1;
        c(c3993uK, c3993uK3);
    }

    public final void c(C3993uK c3993uK, C3993uK c3993uK2) {
        C3993uK c3993uK3 = c3993uK.f34518n;
        c3993uK.f34518n = null;
        if (c3993uK2 != null) {
            c3993uK2.f34518n = c3993uK3;
        }
        if (c3993uK3 == null) {
            this.f34689u = c3993uK2;
        } else if (c3993uK3.f34519u == c3993uK) {
            c3993uK3.f34519u = c3993uK2;
        } else {
            c3993uK3.f34520v = c3993uK2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f34689u = null;
        this.f34690v = 0;
        this.f34691w++;
        C3993uK c3993uK = this.f34692x;
        c3993uK.f34522x = c3993uK;
        c3993uK.f34521w = c3993uK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C3993uK c3993uK = null;
        if (obj != null) {
            try {
                c3993uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c3993uK != null;
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
    public final void d(C3993uK c3993uK, boolean z3) {
        while (c3993uK != null) {
            C3993uK c3993uK2 = c3993uK.f34519u;
            C3993uK c3993uK3 = c3993uK.f34520v;
            boolean z6 = false;
            int i = c3993uK2 != null ? c3993uK2.f34517A : 0;
            int i6 = c3993uK3 != null ? c3993uK3.f34517A : 0;
            int i9 = i - i6;
            boolean z9 = true;
            if (i9 == -2) {
                C3993uK c3993uK4 = c3993uK3.f34519u;
                C3993uK c3993uK5 = c3993uK3.f34520v;
                int i10 = (c3993uK4 != null ? c3993uK4.f34517A : 0) - (c3993uK5 != null ? c3993uK5.f34517A : 0);
                if (i10 != -1) {
                    if (i10 != 0) {
                        z9 = z3;
                    }
                    f(c3993uK3);
                    e(c3993uK);
                    if (!z9) {
                        return;
                    }
                } else {
                    z6 = z3;
                }
                e(c3993uK);
                z9 = z6;
                if (!z9) {
                }
            } else if (i9 == 2) {
                C3993uK c3993uK6 = c3993uK2.f34519u;
                C3993uK c3993uK7 = c3993uK2.f34520v;
                int i11 = (c3993uK6 != null ? c3993uK6.f34517A : 0) - (c3993uK7 != null ? c3993uK7.f34517A : 0);
                if (i11 != 1) {
                    if (i11 != 0) {
                        z9 = z3;
                    }
                    e(c3993uK2);
                    f(c3993uK);
                    if (!z9) {
                        return;
                    }
                } else {
                    z6 = z3;
                }
                f(c3993uK);
                z9 = z6;
                if (!z9) {
                }
            } else if (i9 == 0) {
                c3993uK.f34517A = i + 1;
                if (z3) {
                    return;
                }
            } else {
                c3993uK.f34517A = Math.max(i, i6) + 1;
                if (!z3) {
                    return;
                }
            }
            c3993uK = c3993uK.f34518n;
        }
    }

    public final void e(C3993uK c3993uK) {
        C3993uK c3993uK2 = c3993uK.f34519u;
        C3993uK c3993uK3 = c3993uK.f34520v;
        C3993uK c3993uK4 = c3993uK3.f34519u;
        C3993uK c3993uK5 = c3993uK3.f34520v;
        c3993uK.f34520v = c3993uK4;
        if (c3993uK4 != null) {
            c3993uK4.f34518n = c3993uK;
        }
        c(c3993uK, c3993uK3);
        c3993uK3.f34519u = c3993uK;
        c3993uK.f34518n = c3993uK3;
        int max = Math.max(c3993uK2 != null ? c3993uK2.f34517A : 0, c3993uK4 != null ? c3993uK4.f34517A : 0) + 1;
        c3993uK.f34517A = max;
        c3993uK3.f34517A = Math.max(max, c3993uK5 != null ? c3993uK5.f34517A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3885sK c3885sK = this.f34693y;
        if (c3885sK != null) {
            return c3885sK;
        }
        C3885sK c3885sK2 = new C3885sK(this, 0);
        this.f34693y = c3885sK2;
        return c3885sK2;
    }

    public final void f(C3993uK c3993uK) {
        C3993uK c3993uK2 = c3993uK.f34519u;
        C3993uK c3993uK3 = c3993uK.f34520v;
        C3993uK c3993uK4 = c3993uK2.f34519u;
        C3993uK c3993uK5 = c3993uK2.f34520v;
        c3993uK.f34519u = c3993uK5;
        if (c3993uK5 != null) {
            c3993uK5.f34518n = c3993uK;
        }
        c(c3993uK, c3993uK2);
        c3993uK2.f34520v = c3993uK;
        c3993uK.f34518n = c3993uK2;
        int max = Math.max(c3993uK3 != null ? c3993uK3.f34517A : 0, c3993uK5 != null ? c3993uK5.f34517A : 0) + 1;
        c3993uK.f34517A = max;
        c3993uK2.f34517A = Math.max(max, c3993uK4 != null ? c3993uK4.f34517A : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        C3993uK c3993uK;
        if (obj != null) {
            try {
                c3993uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c3993uK == null) {
                return c3993uK.f34524z;
            }
            return null;
        }
        c3993uK = null;
        if (c3993uK == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3885sK c3885sK = this.f34694z;
        if (c3885sK != null) {
            return c3885sK;
        }
        C3885sK c3885sK2 = new C3885sK(this, 1);
        this.f34694z = c3885sK2;
        return c3885sK2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        C3993uK a9 = a(obj, true);
        Object obj3 = a9.f34524z;
        a9.f34524z = obj2;
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
        C3993uK c3993uK;
        if (obj != null) {
            try {
                c3993uK = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c3993uK != null) {
                b(c3993uK, true);
            }
            if (c3993uK == null) {
                return c3993uK.f34524z;
            }
            return null;
        }
        c3993uK = null;
        if (c3993uK != null) {
        }
        if (c3993uK == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34690v;
    }
}
