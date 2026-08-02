package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.divkit.api.DivKitApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Li27;", "Landroidx/fragment/app/o;", "Lqpb;", "<init>", "()V", "f27", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class i27 extends o implements qpb {
    public boolean h;
    public ppb i;
    public gc8 k;
    public f27 l;
    public nnd m;
    public bf n;
    public j27 o;
    public final ybf p;
    public dt8 q;
    public final jyr r;
    public boolean g = true;
    public final jyr j = btf.b(new g27(this, 0));

    public i27() {
        g27 g27Var = new g27(this, 3);
        arf a = btf.a(bwf.c, new rs6(8, new g27(this, 2)));
        this.p = new ybf(ern.a(upb.class), new sy6(a, 6), g27Var, new sy6(a, 7));
        this.r = btf.b(new g27(this, 1));
    }

    @Override // defpackage.qpb
    public final void m(ppb ppbVar) {
        ppbVar.getClass();
        this.i = ppbVar;
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        this.g = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        this.h = requireArguments().getBoolean("isPaymentContext", false);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ppb ppbVar = this.i;
        if (ppbVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) ppbVar.b(this, s79.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        ppb ppbVar2 = this.i;
        if (ppbVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        d51 i = ppbVar2.i();
        s77 s77Var = (s77) s79Var;
        bf a = s77Var.a();
        a4g.s(a);
        this.n = a;
        br1 br1Var = new br1(s77Var.b());
        tc1 f = s77Var.f();
        DivKitApi e = s77Var.e();
        g0c g0cVar = s77Var.g;
        sfg sfgVar = new sfg(new xiu(e, g0cVar), g0cVar);
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        gs4 gs4Var = new gs4();
        gs4Var.a = br1Var;
        gs4Var.b = f;
        gs4Var.c = i;
        gs4Var.d = sfgVar;
        gs4Var.e = mn7Var;
        this.o = new j27(gs4Var, g0cVar, 0);
        dt8 c = s77Var.c();
        a4g.s(c);
        this.q = c;
        a4g.s(s77Var.d());
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_exit_fragment, viewGroup, false);
        if (inflate == null) {
            jj4.j("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.m = new nnd(16, linearLayout, linearLayout);
        return linearLayout;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = 1;
        ((vb8) this.r.getValue()).b.h().f(new axt("isLightTheme", this.g));
        upb upbVar = (upb) this.p.getValue();
        upbVar.n = this.h;
        Continuation continuation = null;
        x97.y(ot0.F(upbVar), null, null, new g68(upbVar, continuation, 12), 3);
        this.l = new f27(0, (LinearLayout) x().b);
        LinearLayout linearLayout = (LinearLayout) x().b;
        f27 f27Var = this.l;
        if (f27Var == null) {
            Intrinsics.j("layoutChangeListener");
            throw null;
        }
        linearLayout.addOnLayoutChangeListener(f27Var);
        x97.y(wyf.F(getLifecycle()), null, null, new bv6(this, continuation, 6), 3);
        ((tu2) this.j.getValue()).l.f(getViewLifecycleOwner(), new di6(new az6(2, this), i));
    }

    public final nnd x() {
        nnd nndVar = this.m;
        if (nndVar != null) {
            return nndVar;
        }
        xq0.q("Required value was null.");
        return null;
    }
}
