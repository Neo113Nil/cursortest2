package e2;

import java.util.Iterator;
import s.g0;
import s.o0;
import y1.e0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements Iterable, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final g0 f1985g;

    /* renamed from: h, reason: collision with root package name */
    public s.r f1986h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1987i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1988j;

    public j() {
        long[] jArr = o0.f6312a;
        this.f1985g = new g0();
    }

    public final j a() {
        j jVar = new j();
        jVar.f1987i = this.f1987i;
        jVar.f1988j = this.f1988j;
        g0 g0Var = jVar.f1985g;
        g0Var.getClass();
        g0 g0Var2 = this.f1985g;
        pc.j.e(g0Var2, "from");
        Object[] objArr = g0Var2.f6267b;
        Object[] objArr2 = g0Var2.f6268c;
        long[] jArr = g0Var2.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i10 << 3) + i12;
                            g0Var.m(objArr[i13], objArr2[i13]);
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
        return jVar;
    }

    public final Object b(v vVar) {
        Object g8 = this.f1985g.g(vVar);
        if (g8 != null) {
            return g8;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final void c(j jVar) {
        g0 g0Var = jVar.f1985g;
        Object[] objArr = g0Var.f6267b;
        Object[] objArr2 = g0Var.f6268c;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j3) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        v vVar = (v) obj;
                        g0 g0Var2 = this.f1985g;
                        Object g8 = g0Var2.g(vVar);
                        pc.j.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = vVar.f2055b.invoke(g8, obj2);
                        if (invoke != null) {
                            g0Var2.m(vVar, invoke);
                        }
                    }
                    j3 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void d(v vVar, Object obj) {
        boolean z10 = obj instanceof a;
        g0 g0Var = this.f1985g;
        if (z10 && g0Var.c(vVar)) {
            Object g8 = g0Var.g(vVar);
            pc.j.c(g8, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) g8;
            a aVar2 = (a) obj;
            String str = aVar2.f1944a;
            if (str == null) {
                str = aVar.f1944a;
            }
            ac.c cVar = aVar2.f1945b;
            if (cVar == null) {
                cVar = aVar.f1945b;
            }
            g0Var.m(vVar, new a(str, cVar));
        } else {
            g0Var.m(vVar, obj);
        }
        vVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return pc.j.a(this.f1985g, jVar.f1985g) && this.f1987i == jVar.f1987i && this.f1988j == jVar.f1988j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1988j) + a4.d.d(this.f1985g.hashCode() * 31, 31, this.f1987i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s.r rVar = this.f1986h;
        if (rVar == null) {
            g0 g0Var = this.f1985g;
            g0Var.getClass();
            s.r rVar2 = new s.r(g0Var);
            this.f1986h = rVar2;
            rVar = rVar2;
        }
        return ((s.h) rVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f1987i) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f1988j) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        g0 g0Var = this.f1985g;
        Object[] objArr = g0Var.f6267b;
        Object[] objArr2 = g0Var.f6268c;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb.append(str);
                            sb.append(((v) obj).f2054a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return e0.w(this) + "{ " + ((Object) sb) + " }";
    }
}
