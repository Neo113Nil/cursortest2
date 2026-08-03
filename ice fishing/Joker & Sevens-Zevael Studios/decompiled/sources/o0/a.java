package o0;

import bc.l;
import java.util.NoSuchElementException;
import pc.j;
import s.a0;
import s.g0;
import s.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f5127a;

    public static final Object a(g0 g0Var) {
        Object g8 = g0Var.g(null);
        if (g8 == null) {
            return null;
        }
        if (!(g8 instanceof a0)) {
            g0Var.k(null);
            return g8;
        }
        a0 a0Var = (a0) g8;
        if (a0Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = a0Var.f6220b - 1;
        Object e10 = a0Var.e(i10);
        a0Var.j(i10);
        j.c(e10, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (a0Var.g()) {
            g0Var.k(null);
        }
        if (a0Var.f6220b == 1) {
            g0Var.m(null, a0Var.d());
        }
        return e10;
    }

    public static final a0 b(g0 g0Var) {
        if (g0Var.i()) {
            a0 a0Var = l0.f6303b;
            j.c(a0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return a0Var;
        }
        a0 a0Var2 = new a0();
        Object[] objArr = g0Var.f6268c;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof a0) {
                                a0 a0Var3 = (a0) obj;
                                if (!a0Var3.g()) {
                                    int i13 = a0Var2.f6220b + a0Var3.f6220b;
                                    Object[] objArr2 = a0Var2.f6219a;
                                    if (objArr2.length < i13) {
                                        a0Var2.l(i13, objArr2);
                                    }
                                    l.R(a0Var3.f6219a, a0Var2.f6219a, a0Var2.f6220b, 0, a0Var3.f6220b);
                                    a0Var2.f6220b += a0Var3.f6220b;
                                }
                            } else {
                                j.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                a0Var2.a(obj);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return a0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return j.a(this.f5127a, ((a) obj).f5127a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5127a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f5127a + ')';
    }
}
