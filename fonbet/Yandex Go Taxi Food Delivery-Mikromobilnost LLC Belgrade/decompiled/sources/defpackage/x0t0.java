package defpackage;

import androidx.compose.ui.layout.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class x0t0 implements z910 {
    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Object obj;
        Object obj2;
        int f0;
        int max;
        int i;
        int u;
        List list2 = list;
        long j2 = j;
        int min = Math.min(n8e.i(j2), kVar.f0(600.0f));
        List list3 = list2;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
            if (jl40.l(pj91.g((x910) obj), "action")) {
                break;
            }
            i2++;
        }
        x910 x910Var = (x910) obj;
        final o l0 = x910Var != null ? x910Var.l0(j2) : null;
        int size2 = list3.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i3);
            if (jl40.l(pj91.g((x910) obj2), "dismissAction")) {
                break;
            }
            i3++;
        }
        x910 x910Var2 = (x910) obj2;
        o l02 = x910Var2 != null ? x910Var2.l0(j2) : null;
        int i4 = l0 != null ? l0.a : 0;
        int i5 = l0 != null ? l0.b : 0;
        int i6 = l02 != null ? l02.a : 0;
        int i7 = l02 != null ? l02.b : 0;
        int f02 = ((min - i4) - i6) - (i6 == 0 ? kVar.f0(8.0f) : 0);
        int k = n8e.k(j2);
        if (f02 < k) {
            f02 = k;
        }
        int size3 = list3.size();
        int i8 = 0;
        while (i8 < size3) {
            x910 x910Var3 = (x910) list2.get(i8);
            if (jl40.l(pj91.g(x910Var3), "text")) {
                final o l03 = x910Var3.l0(n8e.b(0, j2, f02, 0, 0, 9));
                bqu bquVar = a.a;
                int u2 = l03.u(bquVar);
                int u3 = l03.u(a.b);
                boolean z = true;
                boolean z2 = (u2 == Integer.MIN_VALUE || u3 == Integer.MIN_VALUE) ? false : true;
                if (u2 != u3 && z2) {
                    z = false;
                }
                final int i9 = min - i6;
                final int i10 = i9 - i4;
                if (z) {
                    max = Math.max(kVar.f0(f1t0.i), Math.max(i5, i7));
                    f0 = (max - l03.b) / 2;
                    if (l0 != null && (u = l0.u(bquVar)) != Integer.MIN_VALUE) {
                        i = (u2 + f0) - u;
                    }
                    i = 0;
                } else {
                    f0 = kVar.f0(30.0f) - u2;
                    max = Math.max(kVar.f0(f1t0.j), l03.b + f0);
                    if (l0 != null) {
                        i = (max - l0.b) / 2;
                    }
                    i = 0;
                }
                final int i11 = i;
                final int i12 = f0;
                final int i13 = l02 != null ? (max - l02.b) / 2 : 0;
                final o oVar = l02;
                return kVar.w(min, max, b.f(), new tls() { // from class: w0t0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        o.a aVar = (o.a) obj3;
                        o.a.o(aVar, o.this, 0, i12);
                        o oVar2 = l0;
                        if (oVar2 != null) {
                            o.a.o(aVar, oVar2, i10, i11);
                        }
                        o oVar3 = oVar;
                        if (oVar3 != null) {
                            o.a.o(aVar, oVar3, i9, i13);
                        }
                        return zy11.a;
                    }
                });
            }
            i8++;
            j2 = j;
            size3 = size3;
            list2 = list;
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return null;
    }
}
