package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lt37;", "Landroidx/fragment/app/o;", "Llqo;", "<init>", "()V", "p37", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class t37 extends o implements lqo {
    public sbp g;
    public qdc h;
    public final jyr i = btf.b(new q37(this, 0));
    public final jyr j = btf.b(new q37(this, 1));
    public gc8 k;
    public vb8 l;
    public p37 m;
    public qc9 n;
    public g0c o;
    public bf p;
    public final ybf q;
    public rdk r;
    public ahu s;

    public t37() {
        q37 q37Var = new q37(this, 4);
        arf a = btf.a(bwf.c, new rs6(11, new q37(this, 3)));
        this.q = new ybf(ern.a(g47.class), new sy6(a, 12), q37Var, new sy6(a, 13));
    }

    @Override // defpackage.lqo
    public final void k(sbp sbpVar) {
        this.g = sbpVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        String string = requireArguments().getString("ARG_EMAIL");
        Parcelable parcelable = requireArguments().getParcelable("ARG_BIND_SBP_TOKEN");
        if (parcelable == null) {
            xq0.q("Required value was null.");
            return null;
        }
        aro aroVar = (aro) parcelable;
        String string2 = requireArguments().getString("ARG_SELECTED_BANK_SCHEME");
        sbp sbpVar = this.g;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) sbpVar.b(this, s79.class);
        sbp sbpVar2 = this.g;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        jek a = sbpVar2.c.a();
        sbp sbpVar3 = this.g;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar3.b.f();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        if (this.g == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        k1o k1oVar = new k1o();
        a.getClass();
        f.getClass();
        kwl kwlVar = new kwl();
        rzm b = t8a.b(hyf.u(new os2(20, kwlVar)));
        rzm b2 = t8a.b(hyf.u(new os2(19, kwlVar)));
        rzm b3 = t8a.b(hyf.u(new ps2(kwlVar, b2, 11)));
        rzm b4 = t8a.b(hyf.u(new ps2(kwlVar, b2, 12)));
        rzm b5 = t8a.b(hyf.u(new os2(21, kwlVar)));
        rzm b6 = t8a.b(hyf.u(new ps2(kwlVar, b5, 14)));
        rzm b7 = t8a.b(hyf.u(new ps2(kwlVar, b5, 13)));
        s77 s77Var = (s77) s79Var;
        SharedPreferences C = v5g.C(s77Var.b());
        C.getClass();
        hpo hpoVar = (hpo) b.get();
        hpoVar.getClass();
        x3n x3nVar = new x3n(a, f, C, hpoVar);
        g0c g0cVar = s77Var.g;
        vx6 vx6Var = new vx6(20, new br1(s77Var.b()), s77Var.f(), new sfg(new xiu(s77Var.e(), g0cVar), g0cVar));
        SharedPreferences C2 = v5g.C(s77Var.b());
        C2.getClass();
        hpo hpoVar2 = (hpo) b.get();
        hpoVar2.getClass();
        this.m = new p37(vx6Var, g0cVar, x3nVar, k1oVar, hpoVar2, aroVar, C2, string, string2);
        qc9 d = s77Var.d();
        a4g.s(d);
        this.n = d;
        this.o = g0cVar;
        this.p = (bf) b3.get();
        Context b8 = s77Var.b();
        bf bfVar = (bf) b4.get();
        ahu ahuVar = (ahu) b6.get();
        bfVar.getClass();
        ahuVar.getClass();
        this.r = new rdk(b8, requireActivity, bfVar, ahuVar);
        this.s = (ahu) b7.get();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_divkit_fragment_sbp, viewGroup, false);
        int i = R.id.divContainer;
        LinearLayout linearLayout = (LinearLayout) dag.v(R.id.divContainer, inflate);
        if (linearLayout != null) {
            i = R.id.fullscreenView;
            if (((LinearLayout) dag.v(R.id.fullscreenView, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.h = new qdc(21, constraintLayout, linearLayout);
                constraintLayout.getClass();
                return constraintLayout;
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r1 != false) goto L35;
     */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        view.getClass();
        super.onViewCreated(view, bundle);
        sbp sbpVar = this.g;
        Continuation continuation = null;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar.j) {
            return;
        }
        g47 x = x();
        sbp sbpVar2 = this.g;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        qds qdsVar = new qds();
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        dxl dxlVar = new dxl();
        qc9 qc9Var = this.n;
        if (qc9Var == null) {
            Intrinsics.j("parsingEnvironment");
            throw null;
        }
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar2.b.f();
        sbp sbpVar3 = this.g;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        boolean M = sbpVar3.M();
        x.A = qdsVar;
        x.C = dxlVar;
        x.B = qc9Var;
        if (!M) {
            aro aroVar = x.n;
            z = true;
            if ((aroVar instanceof xqo) || (aroVar instanceof yqo)) {
                z2 = true;
            } else {
                tdk tdkVar = f instanceof tdk ? (tdk) f : null;
                z2 = qdq.B(tdkVar != null ? Boolean.valueOf(tdkVar.c()) : null);
            }
        }
        z = false;
        x.E = z;
        x.K(a47.a);
        x97.y(ot0.F(x), null, null, new ja4(x, continuation, 22), 3);
        hpo hpoVar = x.s;
        rs6 rs6Var = new rs6(12, x);
        hpoVar.getClass();
        hpoVar.b = rs6Var;
        sbp sbpVar4 = this.g;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar4.H(false);
        x().t.f(getViewLifecycleOwner(), new di6(new r37(this, 0), 3));
        ahu ahuVar = this.s;
        if (ahuVar == null) {
            Intrinsics.j("viewReadyObservable");
            throw null;
        }
        ahuVar.a = new r37(this, 2);
        x97.y(wyf.F(getLifecycle()), null, null, new s37(this, continuation, 1), 3);
    }

    public final g47 x() {
        return (g47) this.q.getValue();
    }
}
