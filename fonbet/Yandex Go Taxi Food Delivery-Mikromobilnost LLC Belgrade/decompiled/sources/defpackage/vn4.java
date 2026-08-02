package defpackage;

import androidx.compose.ui.layout.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class vn4 implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public vn4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x910 x910Var = (x910) list.get(i);
            if (jl40.l(pj91.g(x910Var), "badge")) {
                o l0 = x910Var.l0(n8e.b(0, j, 0, 0, 0, 11));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    x910 x910Var2 = (x910) list.get(i2);
                    if (jl40.l(pj91.g(x910Var2), "content")) {
                        o l02 = x910Var2.l0(j);
                        int i3 = l02.a;
                        int i4 = l02.b;
                        bqu bquVar = a.a;
                        Pair pair = new Pair(bquVar, Integer.valueOf(l02.u(bquVar)));
                        bqu bquVar2 = a.b;
                        return kVar.w(i3, i4, b.i(pair, new Pair(bquVar2, Integer.valueOf(l02.u(bquVar2)))), new un4(l02, l0, this.a, this.b));
                    }
                }
                rty.b("Collection contains no element matching the predicate.");
                ny61.A();
                return null;
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return null;
    }
}
