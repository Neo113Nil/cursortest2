package defpackage;

import android.content.Context;
import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.map_interactions.long_taps.LongTapModalView;
import com.yandex.go.navigator.providers.a;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes12.dex */
public final class wnz extends e25 {
    public final unz F;
    public final znz G;
    public final w030 H;
    public final eb50 I;

    public wnz(unz unzVar, znz znzVar, w030 w030Var, eb50 eb50Var) {
        this.F = unzVar;
        this.G = znzVar;
        this.H = w030Var;
        this.I = eb50Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.a = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.I.a = Screen.LongTap;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        vnz vnzVar = new vnz(this);
        q4g q4gVar = this.G.a;
        ynz ynzVar = new ynz((Point) obj, (atd0) ((xvf0) q4gVar.b).get(), vnzVar, (ah00) ((xvf0) q4gVar.c).get(), (a) ((ge50) q4gVar.w).get(), (ipv) ((xvf0) q4gVar.x).get(), (zuj0) ((xvf0) q4gVar.y).get());
        gv1 gv1Var = this.F.a;
        return new LongTapModalView((Context) gv1Var.a.get(), ynzVar, (ru.yandex.taxi.discovery.a) gv1Var.b.get(), (ah00) gv1Var.c.get(), (wb50) gv1Var.d.get(), (ip11) gv1Var.e.get(), (o) gv1Var.f.get(), (e) gv1Var.g.get(), (ewc) gv1Var.h.get(), (com.yandex.go.navigator.analitycs.a) gv1Var.i.get());
    }
}
