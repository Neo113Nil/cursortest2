package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lty6;", "Landroidx/fragment/app/o;", "Lnbp;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class ty6 extends o implements nbp {
    public xdh g;
    public sbp h;
    public dt8 i;
    public final jyr j = btf.b(new py6(this, 1));
    public g0c k;
    public iz6 l;
    public qc9 m;
    public ny6 n;
    public final ybf o;
    public gc8 p;

    public ty6() {
        py6 py6Var = new py6(this, 0);
        arf a = btf.a(bwf.c, new rs6(5, new py6(this, 2)));
        this.o = new ybf(ern.a(cz6.class), new sy6(a, 0), py6Var, new sy6(a, 1));
    }

    @Override // defpackage.nbp
    public final void i(sbp sbpVar) {
        this.h = sbpVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        sbp sbpVar = this.h;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) sbpVar.b(this, s79.class);
        sbp sbpVar2 = this.h;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        jek a = sbpVar2.c.a();
        sbp sbpVar3 = this.h;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar3.b.f();
        a.getClass();
        f.getClass();
        s77 s77Var = (s77) s79Var;
        g0c g0cVar = s77Var.g;
        a4g.s(s77Var.a());
        dt8 c = s77Var.c();
        a4g.s(c);
        this.i = c;
        this.k = g0cVar;
        es6 es6Var = new es6(new xiu(s77Var.e(), g0cVar), new br1(s77Var.b()), s77Var.f());
        bf a2 = s77Var.a();
        a4g.s(a2);
        this.l = new iz6(es6Var, a, f, a2, s77Var.f());
        qc9 d = s77Var.d();
        a4g.s(d);
        this.m = d;
        ny6 ny6Var = (ny6) s77Var.u.get();
        a4g.s(ny6Var);
        this.n = ny6Var;
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_cvv_confirm_fragment_layout, viewGroup, false);
        int i = R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) dag.v(R.id.content_container, inflate);
        if (frameLayout != null) {
            i = R.id.paymentsdk_close_cvv_screen;
            FrameLayout frameLayout2 = (FrameLayout) dag.v(R.id.paymentsdk_close_cvv_screen, inflate);
            if (frameLayout2 != null) {
                i = R.id.paymentsdk_progress_bar;
                LinearLayout linearLayout = (LinearLayout) dag.v(R.id.paymentsdk_progress_bar, inflate);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.g = new xdh(constraintLayout, frameLayout, frameLayout2, linearLayout);
                    constraintLayout.getClass();
                    return constraintLayout;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        y().x = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        hz6 hz6Var = (hz6) requireArguments().getParcelable("paymentsdk_cvv_args_key");
        g0c g0cVar = this.k;
        Continuation continuation = null;
        if (g0cVar == null) {
            Intrinsics.j("eventReporter");
            throw null;
        }
        ((x60) g0cVar).a(gut.m1(d0n.CVV));
        cz6 y = y();
        if (hz6Var == null) {
            xq0.q("Required value was null.");
            return;
        }
        if (this.h == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        qds qdsVar = new qds();
        y.v = hz6Var;
        y.w = qdsVar;
        x97.y(ot0.F(y), null, null, new bv6(y, continuation, 4), 3);
        x97.y(ot0.F(y), null, null, new ja4(y, continuation, 21), 3);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        int i = 1;
        int i2 = 0;
        ((vb8) this.j.getValue()).b.h().f(new axt("isLightTheme", bfg.E(theme, R.attr.paymentsdk_is_light_theme, true)));
        sbp sbpVar = this.h;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar.H(false);
        y().s.f(getViewLifecycleOwner(), new uy6(0, new qy6(this, i2)));
        xqn xqnVar = new xqn();
        ny6 ny6Var = this.n;
        if (ny6Var == null) {
            Intrinsics.j("cvvViewReadyObservable");
            throw null;
        }
        ny6Var.a = new ry6(xqnVar, this);
        ((FrameLayout) x().c).setOnClickListener(new ol(7, this));
        y().u.f(getViewLifecycleOwner(), new uy6(0, new qy6(this, i)));
        y().r.f(getViewLifecycleOwner(), new uy6(0, new ry6(this, xqnVar)));
    }

    public final xdh x() {
        xdh xdhVar = this.g;
        if (xdhVar != null) {
            return xdhVar;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public final cz6 y() {
        return (cz6) this.o.getValue();
    }
}
