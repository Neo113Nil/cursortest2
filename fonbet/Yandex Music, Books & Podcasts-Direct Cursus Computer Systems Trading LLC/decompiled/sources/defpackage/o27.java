package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.divkit.api.DivKitApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo27;", "Landroidx/fragment/app/o;", "Lyxf;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class o27 extends o implements yxf {
    public gc8 g;
    public qec i;
    public xxf j;
    public bf l;
    public j27 m;
    public final ybf n;
    public dt8 o;
    public final jyr p;
    public boolean h = true;
    public final jyr k = btf.b(new l27(this, 0));

    public o27() {
        l27 l27Var = new l27(this, 3);
        arf a = btf.a(bwf.c, new rs6(9, new l27(this, 2)));
        this.n = new ybf(ern.a(fyf.class), new sy6(a, 8), l27Var, new sy6(a, 9));
        this.p = btf.b(new l27(this, 1));
    }

    @Override // defpackage.yxf
    public final void n(xxf xxfVar) {
        xxfVar.getClass();
        this.j = xxfVar;
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        this.h = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        xxf xxfVar = this.j;
        if (xxfVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) xxfVar.b(this, s79.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        xxf xxfVar2 = this.j;
        if (xxfVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        fs7 y = xxfVar2.y();
        s77 s77Var = (s77) s79Var;
        bf a = s77Var.a();
        a4g.s(a);
        this.l = a;
        br1 br1Var = new br1(s77Var.b());
        tc1 f = s77Var.f();
        DivKitApi e = s77Var.e();
        g0c g0cVar = s77Var.g;
        this.m = new j27(new dn9(br1Var, f, new sfg(new xiu(e, g0cVar), g0cVar), y), g0cVar, 1);
        dt8 c = s77Var.c();
        a4g.s(c);
        this.o = c;
        a4g.s(s77Var.d());
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_license_fragment, viewGroup, false);
        if (inflate == null) {
            jj4.j("rootView");
            return null;
        }
        ScrollView scrollView = (ScrollView) inflate;
        this.i = new qec(scrollView, scrollView);
        return scrollView;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        fyf fyfVar = (fyf) this.n.getValue();
        boolean z = this.h;
        Continuation continuation = null;
        x97.y(ot0.F(fyfVar), null, null, new jmd(fyfVar, continuation, 14), 3);
        fyfVar.n = z;
        xxf xxfVar = this.j;
        if (xxfVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        xxfVar.n(false);
        xxf xxfVar2 = this.j;
        if (xxfVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        xxfVar2.d();
        x97.y(wyf.F(getLifecycle()), null, null, new n27(this, continuation, 0), 3);
        ((tu2) this.k.getValue()).l.f(getViewLifecycleOwner(), new di6(new az6(3, this), 2));
    }
}
