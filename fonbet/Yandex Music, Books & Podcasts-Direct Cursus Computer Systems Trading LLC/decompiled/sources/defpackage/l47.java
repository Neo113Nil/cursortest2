package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll47;", "Landroidx/fragment/app/o;", "Lnbp;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class l47 extends o implements nbp {
    public boolean g;
    public sbp h;
    public final jyr i;
    public gc8 j;
    public qne k;
    public z57 l;
    public final ybf m;
    public dt8 n;
    public qc9 o;
    public bf p;
    public g0c q;
    public rn5 r;
    public final jyr s;
    public final jyr t;

    public l47() {
        super(R.layout.dk_select_fragment_layout);
        this.i = btf.b(new i47(this, 0));
        i47 i47Var = new i47(this, 4);
        arf a = btf.a(bwf.c, new rs6(13, new i47(this, 2)));
        this.m = new ybf(ern.a(Object.class), new sy6(a, 14), i47Var, new sy6(a, 15));
        this.s = btf.b(new i47(this, 1));
        this.t = btf.b(new i47(this, 3));
    }

    public final void A(boolean z, boolean z2) {
        sbp sbpVar = this.h;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        ((qds) this.t.getValue()).getClass();
        sbpVar.E(z, new uds(R.string.paymentsdk_loading_title));
        if (this.g) {
            sbp sbpVar2 = this.h;
            if (sbpVar2 == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            sbpVar2.n(false);
        }
        if (z2) {
            sbp sbpVar3 = this.h;
            if (sbpVar3 != null) {
                sbpVar3.G();
            } else {
                Intrinsics.j("callbacks");
                throw null;
            }
        }
    }

    @Override // defpackage.nbp
    public final void i(sbp sbpVar) {
        this.h = sbpVar;
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = requireArguments().getBoolean("ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED");
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
        m9e m9eVar = (m9e) sbpVar2.b(this, m9e.class);
        sbp sbpVar3 = this.h;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        ya4 ya4Var = (ya4) sbpVar3.b(this, ya4.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        sbp sbpVar4 = this.h;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        jek a = sbpVar4.c.a();
        a.getClass();
        n7b n7bVar = new n7b();
        n7bVar.a = a;
        sbp sbpVar5 = this.h;
        if (sbpVar5 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar5.b.f();
        sbp sbpVar6 = this.h;
        if (sbpVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar6.M();
        sbp sbpVar7 = this.h;
        if (sbpVar7 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        kpm kpmVar = new kpm(7, sbpVar7);
        f.getClass();
        s77 s77Var = (s77) s79Var;
        g0c g0cVar = s77Var.g;
        rn5 rn5Var = new rn5(new xiu(s77Var.e(), g0cVar), new br1(s77Var.b()), new Gson(), s77Var.f(), g0cVar);
        tc1 f2 = s77Var.f();
        qdc qdcVar = new qdc(g0cVar);
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        osh oshVar = new osh();
        oshVar.a = qdcVar;
        oshVar.b = g0cVar;
        oshVar.c = mn7Var;
        qdc qdcVar2 = new qdc(g0cVar);
        q77 q77Var = (q77) m9eVar;
        ehk ehkVar = (ehk) q77Var.a.a;
        a4g.t(ehkVar);
        o9e o9eVar = (o9e) q77Var.b.E.get();
        a4g.s(o9eVar);
        ehkVar.getClass();
        le3 le3Var = new le3();
        le3Var.a = ehkVar;
        le3Var.b = o9eVar;
        pjc pjcVar = (pjc) ((q77) ya4Var).b.F.get();
        a4g.s(pjcVar);
        int i = 0;
        int i2 = 7;
        this.l = new z57(rn5Var, g0cVar, f2, n7bVar, f, oshVar, qdcVar2, le3Var, pjcVar, z, new g8c(kpmVar), new oxa(22, kpmVar), new atn(0, f, g0cVar), new t1f(f, g0cVar), new xdh(new qdc(g0cVar), g0cVar), new ljj(g0cVar), new rjj(new cib(24, f), s77Var.f(), g0cVar), new ljj(g0cVar));
        dt8 c = s77Var.c();
        a4g.s(c);
        this.n = c;
        qc9 d = s77Var.d();
        a4g.s(d);
        this.o = d;
        bf a2 = s77Var.a();
        a4g.s(a2);
        this.p = a2;
        this.q = g0cVar;
        int i3 = 8;
        rn5 rn5Var2 = new rn5(8);
        rn5Var2.g = g0cVar;
        this.r = rn5Var2;
        f57 y = y();
        sbp sbpVar8 = this.h;
        if (sbpVar8 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        mgk mgkVar = sbpVar8.i;
        rn5 rn5Var3 = this.r;
        if (rn5Var3 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        rfk rfkVar = (rfk) requireArguments().getParcelable("ARG_PREFERRED_METHOD");
        sbp sbpVar9 = this.h;
        if (sbpVar9 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        g3j f3 = sbpVar9.f();
        sbp sbpVar10 = this.h;
        if (sbpVar10 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        String str = sbpVar10.h.d;
        kpm kpmVar2 = new kpm(i2, sbpVar10);
        if (sbpVar10 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        boolean z2 = !sbpVar10.M() && n7w.R(q6c.s);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        sbp sbpVar11 = this.h;
        if (sbpVar11 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        boolean M = sbpVar11.M();
        sbp sbpVar12 = this.h;
        if (sbpVar12 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        y.l(mgkVar, rn5Var3, rfkVar, str, f3, kpmVar2, E, z2, M, !sbpVar12.M() && n7w.R(q6c.u), requireArguments().getString("ARG_META_JSON"));
        Continuation continuation = null;
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, i), 3);
        y().w();
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 2), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 4), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 6), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, i3), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 10), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 12), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 14), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j47(this, continuation, 16), 3);
        sbp sbpVar13 = this.h;
        if (sbpVar13 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar13.H(false);
        sbp sbpVar14 = this.h;
        if (sbpVar14 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar14.j) {
            return;
        }
        Resources.Theme theme2 = requireActivity().getTheme();
        theme2.getClass();
        this.g = bfg.E(theme2, R.attr.paymentsdk_showFooterOnSelectOnly, false);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dk_select_fragment_layout, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = R.id.divContainer;
        LinearLayout linearLayout2 = (LinearLayout) dag.v(R.id.divContainer, inflate);
        if (linearLayout2 != null) {
            i = R.id.scroll_view;
            if (((FrameLayout) dag.v(R.id.scroll_view, inflate)) != null) {
                qne qneVar = new qne();
                qneVar.a = linearLayout;
                qneVar.b = linearLayout2;
                this.k = qneVar;
                linearLayout.getClass();
                return linearLayout;
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        sbp sbpVar = this.h;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (!sbpVar.j) {
            rn5 rn5Var = this.r;
            if (rn5Var == null) {
                Intrinsics.j("mediator");
                throw null;
            }
            rn5Var.f = c5b.a;
            rn5Var.b = null;
            rn5Var.c = null;
            rn5Var.d = null;
            rn5Var.e = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        sbp sbpVar = this.h;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar.H(false);
        sbp sbpVar2 = this.h;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar2.j) {
            return;
        }
        sbpVar2.n(true);
        if (this.h != null) {
            return;
        }
        Intrinsics.j("callbacks");
        throw null;
    }

    public final qne x() {
        qne qneVar = this.k;
        if (qneVar != null) {
            return qneVar;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public final f57 y() {
        return (f57) this.m.getValue();
    }

    public final void z() {
        if (this.g) {
            sbp sbpVar = this.h;
            if (sbpVar != null) {
                sbpVar.n(true);
            } else {
                Intrinsics.j("callbacks");
                throw null;
            }
        }
    }
}
