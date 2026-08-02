package defpackage;

import com.yandex.go.places.impl.domain.interactors.my.places.a;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class y050 extends ad5 {
    public final go80 A;
    public final u050 B;
    public final rac0 C;
    public final pwy0 D;
    public final b E;
    public pzt0 F;
    public pzt0 G;
    public mo21 H;
    public List I;
    public final Integer x;
    public final a y;
    public final po21 z;

    public y050(Integer num, a aVar, po21 po21Var, go80 go80Var, u050 u050Var, rac0 rac0Var, pwy0 pwy0Var, b bVar) {
        super(s050.class);
        this.x = num;
        this.y = aVar;
        this.z = po21Var;
        this.A = go80Var;
        this.B = u050Var;
        this.C = rac0Var;
        this.D = pwy0Var;
        this.E = bVar;
        this.I = EmptyList.a;
    }

    public static final void Kg(y050 y050Var) {
        mo21 mo21Var = y050Var.H;
        if (mo21Var == null) {
            ((s050) y050Var.Dg()).E6(EmptyList.a);
            return;
        }
        zzs a = mo21Var.a();
        List<z050> list = y050Var.I;
        ArrayList arrayList = new ArrayList();
        for (z050 z050Var : list) {
            float j = ru.yandex.taxi.map.utils.a.j(a, z050Var.c);
            Integer num = y050Var.x;
            String str = j <= ((float) (num != null ? num.intValue() : Integer.MAX_VALUE)) ? z050Var.a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        ((s050) y050Var.Dg()).E6(arrayList);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        this.H = null;
        pzt0 pzt0Var2 = this.F;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.F = null;
    }
}
