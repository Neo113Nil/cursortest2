package defpackage;

import android.content.Context;
import com.yandex.go.permission.location_with_agreement.ui.a;
import com.yandex.go.permission.location_with_agreement.ui.b;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class waz extends pgd {
    public final Context F;
    public final w030 G;
    public final b H;
    public final a I;
    public final pj J;
    public final lbz K;
    public final i3y L;
    public final mu5 M;

    public waz(Context context, w030 w030Var, b bVar, a aVar, pj pjVar, lbz lbzVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = bVar;
        this.I = aVar;
        this.J = pjVar;
        this.K = lbzVar;
        this.L = kotlin.a.a(new yow(21, this));
        this.M = new mu5(new ptw(22, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((baz) obj);
        r0 r0Var = this.K.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        pj pjVar = this.J;
        pjVar.getClass();
        pjVar.a.a("LocationPermissionPriming.Screen.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
