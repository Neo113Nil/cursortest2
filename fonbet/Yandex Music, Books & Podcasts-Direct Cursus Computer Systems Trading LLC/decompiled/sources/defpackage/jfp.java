package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jfp implements Iterable, j9f {
    public final tpi a;
    public Map b;
    public boolean c;
    public boolean d;

    public jfp() {
        long[] jArr = vso.a;
        this.a = new tpi();
    }

    public final jfp a() {
        jfp jfpVar = new jfp();
        jfpVar.c = this.c;
        jfpVar.d = this.d;
        tpi tpiVar = jfpVar.a;
        tpiVar.getClass();
        tpi tpiVar2 = this.a;
        tpiVar2.getClass();
        Object[] objArr = tpiVar2.b;
        Object[] objArr2 = tpiVar2.c;
        long[] jArr = tpiVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            tpiVar.m(objArr[i4], objArr2[i4]);
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
        return jfpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfp)) {
            return false;
        }
        jfp jfpVar = (jfp) obj;
        return Intrinsics.d(this.a, jfpVar.a) && this.c == jfpVar.c && this.d == jfpVar.d;
    }

    public final Object g(xfp xfpVar) {
        Object g = this.a.g(xfpVar);
        if (g != null) {
            return g;
        }
        rj7.n(xfpVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.b;
        if (map == null) {
            tpi tpiVar = this.a;
            jah jahVar = tpiVar.f;
            if (jahVar == null) {
                jahVar = new jah(tpiVar);
                tpiVar.f = jahVar;
            }
            map = jahVar;
            this.b = map;
        }
        return map.entrySet().iterator();
    }

    public final void m(jfp jfpVar) {
        tpi tpiVar = jfpVar.a;
        Object[] objArr = tpiVar.b;
        Object[] objArr2 = tpiVar.c;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        xfp xfpVar = (xfp) obj;
                        tpi tpiVar2 = this.a;
                        Object g = tpiVar2.g(xfpVar);
                        xfpVar.getClass();
                        Object invoke = xfpVar.b.invoke(g, obj2);
                        if (invoke != null) {
                            tpiVar2.m(xfpVar, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void o(xfp xfpVar, Object obj) {
        boolean z = obj instanceof sa;
        tpi tpiVar = this.a;
        if (!z || !tpiVar.c(xfpVar)) {
            tpiVar.m(xfpVar, obj);
            return;
        }
        Object g = tpiVar.g(xfpVar);
        g.getClass();
        sa saVar = (sa) g;
        sa saVar2 = (sa) obj;
        String str = saVar2.a;
        if (str == null) {
            str = saVar.a;
        }
        syc sycVar = saVar2.b;
        if (sycVar == null) {
            sycVar = saVar.b;
        }
        tpiVar.m(xfpVar, new sa(str, sycVar));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        tpi tpiVar = this.a;
        Object[] objArr = tpiVar.b;
        Object[] objArr2 = tpiVar.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((xfp) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return vut.R(this) + "{ " + ((Object) sb) + " }";
    }
}
