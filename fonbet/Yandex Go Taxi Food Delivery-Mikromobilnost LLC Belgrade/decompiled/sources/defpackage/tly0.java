package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class tly0 {
    public final kk2 a;
    public final ety0 b;
    public final boolean e;
    public final fwi g;
    public final dyr h;
    public xv10 j;
    public LayoutDirection k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = EmptyList.a;

    public tly0(kk2 kk2Var, ety0 ety0Var, boolean z, fwi fwiVar, dyr dyrVar, int i) {
        this.a = kk2Var;
        this.b = ety0Var;
        this.e = z;
        this.g = fwiVar;
        this.h = dyrVar;
    }

    public final void a(LayoutDirection layoutDirection) {
        xv10 xv10Var = this.j;
        if (xv10Var == null || layoutDirection != this.k || xv10Var.a()) {
            this.k = layoutDirection;
            xv10Var = new xv10(this.a, bb1.I(this.b, layoutDirection), this.i, this.g, this.h);
        }
        this.j = xv10Var;
    }
}
