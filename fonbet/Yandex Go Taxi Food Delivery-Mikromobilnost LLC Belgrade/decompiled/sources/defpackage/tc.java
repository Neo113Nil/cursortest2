package defpackage;

import android.app.Activity;
import android.content.Context;
import ru.yandex.taxi.maas.impl.account.a;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.sdc.router.b;

/* loaded from: classes10.dex */
public final class tc implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final n3w g;

    public tc(eqh eqhVar, xvf0 xvf0Var, s730 s730Var, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var2) {
        this.a = 4;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = s730Var;
        this.e = n3wVar;
        this.g = n3wVar2;
        this.f = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        n3w n3wVar = this.g;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new b((w030) xvf0Var5.get(), (b850) xvf0Var4.get(), (gf41) xvf0Var3.get(), (lc) n3wVar.a, (bk1) xvf0Var2.get(), (Activity) xvf0Var.get());
            case 1:
                return m51.a((y9y0) xvf0Var5.get(), (sid) xvf0Var4.get(), (w030) xvf0Var3.get(), (c) xvf0Var2.get(), (c8v0) xvf0Var.get(), (u91) n3wVar.a);
            case 2:
                return new a((d200) xvf0Var5.get(), (rs2) xvf0Var4.get(), (w030) xvf0Var3.get(), (jj3) xvf0Var2.get(), (a200) xvf0Var.get(), (m7w0) n3wVar.a);
            case 3:
                return new ru.yandex.taxi.maas.impl.ride.metropick.b((w030) xvf0Var5.get(), (m100) xvf0Var4.get(), (po21) xvf0Var3.get(), (y9y0) xvf0Var2.get(), (xi00) xvf0Var.get(), (u100) n3wVar.a);
            case 4:
                return new j4a((w030) xvf0Var5.get(), (y50) xvf0Var4.get(), i5m.a(xvf0Var3), (xf30) xvf0Var2.get(), (mg30) n3wVar.a, this.f);
            case 5:
                return new hda0((i6r) xvf0Var5.get(), (ycq0) xvf0Var4.get(), (cda0) xvf0Var3.get(), (ryz) xvf0Var2.get(), this.f, (aca0) n3wVar.a);
            default:
                return new t841((Context) xvf0Var5.get(), (psn) xvf0Var4.get(), (com.yandex.go.wallet.flex.a) xvf0Var3.get(), (w841) n3wVar.a, (c941) xvf0Var2.get(), (wgr) xvf0Var.get());
        }
    }

    public /* synthetic */ tc(xvf0 xvf0Var, v7p v7pVar, eqh eqhVar, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = eqhVar;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = n3wVar;
    }

    public /* synthetic */ tc(int i, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = n3wVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }
}
