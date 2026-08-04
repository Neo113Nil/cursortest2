package com.gamericefishpro.space.v0;

import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.n0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final h0 a;

    public static final Object a(h0 h0Var) {
        Object objG = h0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof d0)) {
            h0Var.k(null);
            return objG;
        }
        d0 d0Var = (d0) objG;
        if (d0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = d0Var.b - 1;
        Object objF = d0Var.f(i);
        d0Var.k(i);
        Intrinsics.c(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (d0Var.h()) {
            h0Var.k(null);
        }
        if (d0Var.b == 1) {
            h0Var.m(null, d0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[LOOP:0: B:9:0x001e->B:22:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[EDGE_INSN: B:25:0x0065->B:23:0x0065 BREAK  A[LOOP:0: B:9:0x001e->B:22:0x0062], SYNTHETIC] */
    public static final d0 b(h0 h0Var) {
        if (h0Var.i()) {
            d0 d0Var = n0.b;
            Intrinsics.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return d0Var;
        }
        d0 d0Var2 = new d0();
        Object[] objArr = h0Var.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof d0) {
                                d0Var2.b((d0) obj);
                            } else {
                                Intrinsics.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                d0Var2.a(obj);
                            }
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
        return d0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.a(this.a, ((a) obj).a);
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
