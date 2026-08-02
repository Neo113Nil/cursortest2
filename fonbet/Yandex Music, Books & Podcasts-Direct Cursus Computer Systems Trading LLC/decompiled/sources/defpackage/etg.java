package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.internal.impl.q0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Letg;", "Ljnb;", "<init>", "()V", "auth"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class etg extends jnb {
    public hgp j;
    public boolean k;
    public final jyr l = l18.b.b(hag.I(irt.class), true);
    public final jyr m;
    public final jyr n;
    public final jyr o;

    public etg() {
        final int i = 0;
        this.m = btf.b(new Function0(this) { // from class: dtg
            public final /* synthetic */ etg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        etg etgVar = this.b;
                        mcb mcbVar = (mcb) ((irt) etgVar.l.getValue()).a.getValue();
                        mcbVar.getClass();
                        mcbVar.a.getClass();
                        t requireActivity = etgVar.requireActivity();
                        requireActivity.getClass();
                        return new ysg(requireActivity, new kme(new vni(etgVar)));
                    case 1:
                        return new zsg(this.b.g.m());
                    default:
                        return new cvo(((zsg) this.b.n.getValue()).c, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                }
            }
        });
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: dtg
            public final /* synthetic */ etg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        etg etgVar = this.b;
                        mcb mcbVar = (mcb) ((irt) etgVar.l.getValue()).a.getValue();
                        mcbVar.getClass();
                        mcbVar.a.getClass();
                        t requireActivity = etgVar.requireActivity();
                        requireActivity.getClass();
                        return new ysg(requireActivity, new kme(new vni(etgVar)));
                    case 1:
                        return new zsg(this.b.g.m());
                    default:
                        return new cvo(((zsg) this.b.n.getValue()).c, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                }
            }
        });
        final int i3 = 2;
        this.o = btf.b(new Function0(this) { // from class: dtg
            public final /* synthetic */ etg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        etg etgVar = this.b;
                        mcb mcbVar = (mcb) ((irt) etgVar.l.getValue()).a.getValue();
                        mcbVar.getClass();
                        mcbVar.a.getClass();
                        t requireActivity = etgVar.requireActivity();
                        requireActivity.getClass();
                        return new ysg(requireActivity, new kme(new vni(etgVar)));
                    case 1:
                        return new zsg(this.b.g.m());
                    default:
                        return new cvo(((zsg) this.b.n.getValue()).c, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        t requireActivity = requireActivity();
        requireActivity.getClass();
        irt irtVar = (irt) this.l.getValue();
        l18 l18Var = l18.b;
        bdt I = hag.I(iv0.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        iv0 iv0Var = (iv0) qdcVar.C(I);
        bdt I2 = hag.I(c9k.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        c9k c9kVar = (c9k) qdcVar2.C(I2);
        qyf F = wyf.F(getLifecycle());
        requireActivity.getClass();
        irtVar.getClass();
        hgp hgpVar = new hgp();
        hgpVar.b = requireActivity;
        hgpVar.c = this;
        hgpVar.d = irtVar;
        hgpVar.e = iv0Var;
        hgpVar.f = c9kVar;
        hgpVar.g = F;
        jyr b = btf.b(new dmg(3, hgpVar));
        hgpVar.a = b;
        bca bcaVar = new bca(new vtg(((q0) b.getValue()).c, hgpVar, 0), 18);
        x0q b2 = y0q.b(0, 0, null, 7);
        hgpVar.h = b2;
        hgpVar.i = zsd.u0(b2, new bca(new vtg(((q0) b.getValue()).e, hgpVar, 1), 18), bcaVar);
        this.j = hgpVar;
        tc4 tc4Var = (tc4) hgpVar.i;
        qyf F2 = wyf.F(getLifecycle());
        tc4Var.getClass();
        j0q j0qVar = new j0q();
        x97.y(F2, null, null, new f98(tc4Var, j0qVar, (Continuation) null, 24), 3);
        nyf lifecycle = getLifecycle();
        lifecycle.getClass();
        ox6.B(kg5.t(j0qVar, lifecycle, lyf.d), wyf.F(getLifecycle()), new lrf(3, this, context));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(requireContext());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new m2g(2, composeView, this), 62224224, true));
        coordinatorLayout.addView(composeView, new xk6(-1, -1));
        return coordinatorLayout;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("login_started", this.k);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle == null || !bundle.getBoolean("login_started", false)) {
            x97.y(wyf.F(getLifecycle()), null, null, new jmd(this, null, 20), 3);
        }
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.o.getValue();
    }
}
