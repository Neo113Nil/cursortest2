package defpackage;

import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class sgi {
    public final tpi a;

    public /* synthetic */ sgi(tpi tpiVar) {
        this.a = tpiVar;
    }

    public static final void a(tpi tpiVar, Object obj, Object obj2) {
        int f = tpiVar.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : tpiVar.c[f];
        if (obj3 != null) {
            if (obj3 instanceof gpi) {
                gpi gpiVar = (gpi) obj3;
                gpiVar.a(obj2);
                obj2 = gpiVar;
            } else {
                Object[] objArr = whj.a;
                gpi gpiVar2 = new gpi(2);
                gpiVar2.a(obj3);
                gpiVar2.a(obj2);
                obj2 = gpiVar2;
            }
        }
        if (!z) {
            tpiVar.c[f] = obj2;
            return;
        }
        int i = ~f;
        tpiVar.b[i] = obj;
        tpiVar.c[i] = obj2;
    }

    public static final Object b(tpi tpiVar, jfi jfiVar) {
        Object g = tpiVar.g(jfiVar);
        if (g == null) {
            return null;
        }
        if (!(g instanceof gpi)) {
            tpiVar.k(jfiVar);
            return g;
        }
        gpi gpiVar = (gpi) g;
        if (gpiVar.g()) {
            wvs.h("List is empty.");
            return null;
        }
        int i = gpiVar.b - 1;
        Object e = gpiVar.e(i);
        gpiVar.i(i);
        e.getClass();
        if (gpiVar.g()) {
            tpiVar.k(jfiVar);
        }
        if (gpiVar.b == 1) {
            tpiVar.m(jfiVar, gpiVar.d());
        }
        return e;
    }

    public static final void c(tpi tpiVar, jfi jfiVar, ybg ybgVar) {
        Object g = tpiVar.g(jfiVar);
        if (g != null) {
            if (!(g instanceof gpi)) {
                if (((Boolean) ybgVar.invoke(g)).booleanValue()) {
                    tpiVar.k(jfiVar);
                    return;
                }
                return;
            }
            gpi gpiVar = (gpi) g;
            int i = gpiVar.b;
            Object[] objArr = gpiVar.a;
            int i2 = 0;
            IntRange m = yhn.m(0, i);
            int i3 = m.a;
            int i4 = m.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) ybgVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            uz0.l(i - i2, i, null, objArr);
            gpiVar.b -= i2;
            if (gpiVar.g()) {
                tpiVar.k(jfiVar);
            }
            if (gpiVar.b == 0) {
                tpiVar.m(jfiVar, gpiVar.d());
            }
        }
    }

    public static final gpi d(tpi tpiVar) {
        if (tpiVar.i()) {
            gpi gpiVar = whj.b;
            gpiVar.getClass();
            return gpiVar;
        }
        gpi gpiVar2 = new gpi();
        Object[] objArr = tpiVar.c;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof gpi) {
                                gpi gpiVar3 = (gpi) obj;
                                if (!gpiVar3.g()) {
                                    int i4 = gpiVar2.b + gpiVar3.b;
                                    Object[] objArr2 = gpiVar2.a;
                                    if (objArr2.length < i4) {
                                        gpiVar2.k(i4, objArr2);
                                    }
                                    uz0.f(gpiVar2.b, 0, gpiVar3.b, gpiVar3.a, gpiVar2.a);
                                    gpiVar2.b += gpiVar3.b;
                                }
                            } else {
                                obj.getClass();
                                gpiVar2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return gpiVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sgi) {
            return this.a.equals(((sgi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
