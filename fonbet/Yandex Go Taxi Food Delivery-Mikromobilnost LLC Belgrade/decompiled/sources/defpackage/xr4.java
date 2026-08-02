package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b;

/* loaded from: classes5.dex */
public final class xr4 implements wni {
    public final nr4 A;
    public final yfa B;
    public final oh4 C;
    public final Context a;
    public final b b;
    public final hwy0 c;
    public final h0w w;
    public final dci x;
    public final b y;
    public final or4 z;

    public xr4(Context context, b bVar, hwy0 hwy0Var, h0w h0wVar, dci dciVar, b bVar2, or4 or4Var, nr4 nr4Var, yfa yfaVar, oh4 oh4Var) {
        this.a = context;
        this.b = bVar;
        this.c = hwy0Var;
        this.w = h0wVar;
        this.x = dciVar;
        this.y = bVar2;
        this.z = or4Var;
        this.A = nr4Var;
        this.B = yfaVar;
        this.C = oh4Var;
    }

    public final void a(rr4 rr4Var, fid fidVar, int i) {
        int i2;
        xr4 xr4Var;
        rr4 rr4Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1561820147);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rr4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar.e(this) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new LinkedHashSet();
                btsVar.o0(Q);
            }
            Set set = (Set) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new LinkedHashSet();
                btsVar.o0(Q2);
            }
            xr4Var = this;
            rr4Var2 = rr4Var;
            sb2.c(new vvf0[]{nnm.f(this.c, btsVar, qti.e), ua3.a.a(this.x)}, wwg.S(1504939827, true, new rb0(xr4Var, rr4Var2, set, (Set) Q2, 7), btsVar), btsVar, 56);
        } else {
            xr4Var = this;
            rr4Var2 = rr4Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(xr4Var, rr4Var2, i, 27);
        }
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(1153054513, new tn1(20, this), true));
        return composeView;
    }
}
