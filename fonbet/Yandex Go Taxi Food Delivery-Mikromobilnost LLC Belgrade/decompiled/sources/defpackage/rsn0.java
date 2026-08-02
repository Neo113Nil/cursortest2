package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.analytics.b;
import com.yandex.go.payments.shared.f;
import com.yandex.go.payments.shared.g;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.w;
import com.yandex.go.payments.shared.x;
import com.yandex.go.payments.shared.z;
import com.yandex.go.scooters.live.domain.c;
import com.yandex.go.suggest.impl.data.experiments.j;
import com.yandex.go.superapp.unified_polling.d;
import com.yandex.go.yb.data.i;
import com.yandex.go.yb.domain.q;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.h;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.scooters.domain.e;

/* loaded from: classes8.dex */
public final class rsn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ rsn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.c;
        switch (i) {
            case 0:
                return new qsn0((tse) xvf0Var2.get(), (b) xvf0Var6.get(), (c) xvf0Var5.get(), (e) xvf0Var.get(), (pqm0) xvf0Var4.get(), (ern0) xvf0Var3.get());
            case 1:
                return new oyn0((tse) xvf0Var2.get(), (y50) xvf0Var6.get(), (ra00) xvf0Var5.get(), (o3h) xvf0Var.get(), (hyn0) xvf0Var4.get(), (f0o0) xvf0Var3.get());
            case 2:
                return new com.yandex.go.scooters.misc.support.c((ah00) xvf0Var2.get(), (fn21) xvf0Var6.get(), (vp21) xvf0Var5.get(), (atd0) xvf0Var.get(), (a) xvf0Var4.get(), (k) xvf0Var3.get());
            case 3:
                return new w(i5m.a(xvf0Var2), i5m.a(xvf0Var6), (mhf) xvf0Var5.get(), (ru.yandex.taxi.zalogin.k) xvf0Var.get(), (tse) xvf0Var4.get(), (Lifecycle) xvf0Var3.get());
            case 4:
                return new x((on2) xvf0Var2.get(), (yqg) xvf0Var6.get(), (m6i0) xvf0Var5.get(), (cda0) xvf0Var.get(), (cog) xvf0Var4.get(), (tt2) xvf0Var3.get());
            case 5:
                return new z((v) xvf0Var2.get(), (f) xvf0Var6.get(), (uap) xvf0Var5.get(), (kap) xvf0Var.get(), (tt2) xvf0Var4.get(), (g) xvf0Var3.get());
            case 6:
                return new bpr0((tse) xvf0Var2.get(), (i6r) xvf0Var6.get(), (v) xvf0Var5.get(), (ffe) xvf0Var.get(), (ney) xvf0Var4.get(), (h) xvf0Var3.get());
            case 7:
                return new yrv0((lx4) xvf0Var2.get(), (sh41) xvf0Var6.get(), (fva0) xvf0Var5.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get(), (ru.yandex.taxi.credentials.e) xvf0Var4.get(), (v8w0) xvf0Var3.get());
            case 8:
                return new com.yandex.go.flex.main_screen.domain.g((tt2) xvf0Var2.get(), (com.yandex.div.core.expression.variables.a) xvf0Var6.get(), (y9y0) xvf0Var5.get(), (zuj0) xvf0Var.get(), (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f) xvf0Var4.get(), (com.yandex.go.flex.main_screen.domain.h) xvf0Var3.get());
            case 9:
                return new com.yandex.go.suggest.impl.router.e((u7r) xvf0Var2.get(), (fwx0) xvf0Var6.get(), (y9y0) xvf0Var5.get(), (mjv0) xvf0Var.get(), (j) xvf0Var4.get(), (i6r) xvf0Var3.get());
            case 10:
                return new d((iy11) xvf0Var2.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var5), (tse) xvf0Var.get(), (ky2) xvf0Var4.get(), (tt2) xvf0Var3.get());
            case 11:
                return new com.yandex.go.taxi.order.multi.a(this.b, (oep0) xvf0Var6.get(), (mw40) xvf0Var5.get(), (com.yandex.go.taxi.order.interactors.a) xvf0Var.get(), (clk0) xvf0Var4.get(), (j4l0) xvf0Var3.get());
            case 12:
                bsi bsiVar = (bsi) xvf0Var2.get();
                ru.yandex.taxi.logistics.deliveries.multiorder.c cVar = (ru.yandex.taxi.logistics.deliveries.multiorder.c) xvf0Var6.get();
                oep0 oep0Var = (oep0) xvf0Var5.get();
                r870 r870Var = (r870) xvf0Var4.get();
                return new j5y0(bsiVar, cVar, oep0Var, this.e, r870Var);
            case 13:
                return new ru.yandex.taxi.themes.g((Context) xvf0Var2.get(), (ru.yandex.taxi.themes.experiments.e) xvf0Var6.get(), (pay0) xvf0Var5.get(), (tt2) xvf0Var.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3));
            case 14:
                return new s111(i5m.a(xvf0Var2), (Context) xvf0Var6.get(), (ru.yandex.taxi.am.g) xvf0Var5.get(), (pw2) xvf0Var.get(), (jj3) xvf0Var4.get(), (b011) xvf0Var3.get());
            case 15:
                return new com.yandex.go.payments.cards.data.g((xf7) xvf0Var2.get(), (umx) xvf0Var6.get(), (tt2) xvf0Var5.get(), i5m.a(xvf0Var), (sx90) xvf0Var4.get(), (sx90) xvf0Var3.get());
            case 16:
                return new c921((dne0) xvf0Var2.get(), (jtq0) xvf0Var6.get(), i5m.a(xvf0Var5), i5m.a(xvf0Var), i5m.a(xvf0Var4), (rs2) xvf0Var3.get());
            case 17:
                return new qn21((m) xvf0Var2.get(), (kl) xvf0Var6.get(), (hm) xvf0Var5.get(), (f0) xvf0Var.get(), (f0) xvf0Var4.get(), (com.yandex.go.repositories.e) xvf0Var3.get());
            case 18:
                return new com.yandex.go.repositories.e((ru.yandex.taxi.startup.launch.response.e) xvf0Var2.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var6.get(), (ru.yandex.taxi.am.g) xvf0Var5.get(), (tse) xvf0Var.get(), (tt2) xvf0Var4.get(), (wq21) xvf0Var3.get());
            default:
                return new q((Context) xvf0Var2.get(), (tse) xvf0Var6.get(), (tt2) xvf0Var5.get(), (tj60) xvf0Var.get(), (py51) xvf0Var4.get(), (i) xvf0Var3.get());
        }
    }
}
