package com.gamericefishpro.space.o2;

import com.gamericefishpro.space.i2.f0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.p0;
import com.gamericefishpro.space.t0.y0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements w, Iterable, com.gamericefishpro.space.fi.a {
    public final h0 d;
    public com.gamericefishpro.space.t.t e;
    public boolean i;
    public boolean v;

    public l() {
        long[] jArr = p0.a;
        this.d = new h0();
    }

    @Override // com.gamericefishpro.space.o2.w
    public final void b(v vVar, Object obj) {
        boolean z = obj instanceof a;
        h0 h0Var = this.d;
        if (z && h0Var.c(vVar)) {
            Object objG = h0Var.g(vVar);
            Intrinsics.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.a;
            if (str == null) {
                str = aVar.a;
            }
            com.gamericefishpro.space.oh.d dVar = aVar2.b;
            if (dVar == null) {
                dVar = aVar.b;
            }
            h0Var.m(vVar, new a(str, dVar));
        } else {
            h0Var.m(vVar, obj);
        }
        vVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final l c() {
        l lVar = new l();
        lVar.i = this.i;
        lVar.v = this.v;
        h0 h0Var = lVar.d;
        h0Var.getClass();
        h0 from = this.d;
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.b;
        Object[] objArr2 = from.c;
        long[] jArr = from.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            h0Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return lVar;
    }

    public final Object d(v vVar) {
        Object objG = this.d.g(vVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.d, lVar.d) && this.i == lVar.i && this.v == lVar.v;
    }

    public final void f(l lVar) {
        h0 h0Var = lVar.d;
        Object[] objArr = h0Var.b;
        Object[] objArr2 = h0Var.c;
        long[] jArr = h0Var.a;
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
                        v vVar = (v) obj;
                        h0 h0Var2 = this.d;
                        Object objG = h0Var2.g(vVar);
                        Intrinsics.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = vVar.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            h0Var2.m(vVar, objInvoke);
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

    public final int hashCode() {
        return Boolean.hashCode(this.v) + y0.c(this.d.hashCode() * 31, 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        com.gamericefishpro.space.t.t tVar = this.e;
        if (tVar == null) {
            h0 h0Var = this.d;
            h0Var.getClass();
            com.gamericefishpro.space.t.t tVar2 = new com.gamericefishpro.space.t.t(h0Var);
            this.e = tVar2;
            tVar = tVar2;
        }
        return ((com.gamericefishpro.space.t.h) tVar.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.i) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.v) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        h0 h0Var = this.d;
        Object[] objArr = h0Var.b;
        Object[] objArr2 = h0Var.c;
        long[] jArr = h0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((v) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return f0.q(this) + "{ " + ((Object) sb) + " }";
    }
}
