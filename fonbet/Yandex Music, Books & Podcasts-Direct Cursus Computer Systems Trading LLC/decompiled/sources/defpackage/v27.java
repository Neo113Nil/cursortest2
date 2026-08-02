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
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv27;", "Landroidx/fragment/app/o;", "<init>", "()V", "divkit_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class v27 extends o {
    public lom g;
    public aqd h;
    public boolean i;
    public gc8 j;
    public final jyr k = btf.b(new s27(this, 2));
    public d27 l;
    public final ybf m;
    public dt8 n;
    public qc9 o;
    public bf p;
    public g0c q;
    public rn5 r;
    public final jyr s;

    public v27() {
        s27 s27Var = new s27(this, 3);
        arf a = btf.a(bwf.c, new rs6(10, new s27(this, 1)));
        this.m = new ybf(ern.a(h37.class), new sy6(a, 10), s27Var, new sy6(a, 11));
        this.s = btf.b(new s27(this, 0));
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lom lomVar = this.g;
        Continuation continuation = null;
        if (lomVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        s79 s79Var = (s79) lomVar.b(this, s79.class);
        requireActivity().getClass();
        requireActivity().getApplicationContext().getClass();
        requireActivity().getApplication().getClass();
        lom lomVar2 = this.g;
        if (lomVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk C = lomVar2.C();
        lom lomVar3 = this.g;
        if (lomVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        lomVar3.a.m();
        C.getClass();
        s77 s77Var = (s77) s79Var;
        g0c g0cVar = s77Var.g;
        this.l = new d27(new rn5(new xiu(s77Var.e(), g0cVar), new br1(s77Var.b()), new Gson(), s77Var.f(), g0cVar), g0cVar, s77Var.f(), C, 1);
        dt8 c = s77Var.c();
        a4g.s(c);
        this.n = c;
        qc9 d = s77Var.d();
        a4g.s(d);
        this.o = d;
        bf a = s77Var.a();
        a4g.s(a);
        this.p = a;
        this.q = g0cVar;
        rn5 rn5Var = new rn5(8);
        rn5Var.g = g0cVar;
        this.r = rn5Var;
        this.i = requireArguments().getBoolean("START_PAYMENT_AFTER_SELECT");
        int i = 3;
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, 10), 3);
        h37 y = y();
        rn5 rn5Var2 = this.r;
        if (rn5Var2 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        lom lomVar4 = this.g;
        if (lomVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        int i2 = 0;
        int i3 = 1;
        boolean z = !lomVar4.a.m() && n7w.R(q6c.s);
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
        lom lomVar5 = this.g;
        if (lomVar5 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        boolean m = lomVar5.a.m();
        lom lomVar6 = this.g;
        if (lomVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        PreselectActivity preselectActivity = lomVar6.a;
        ik0 ik0Var = preselectActivity.w ? preselectActivity.v : null;
        if (lomVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        List list = preselectActivity.r;
        String string = requireArguments().getString("DEFAULT_PAYMENT_METHOD_ID");
        String string2 = requireArguments().getString("ORDER_AMOUNT");
        lom lomVar7 = this.g;
        if (lomVar7 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        Map map = lomVar7.a.l().a().z;
        rn5Var2.d = new w27(y, i2);
        y.r = m;
        y.s = string;
        y.q = rn5Var2;
        y.p = E;
        y.o = z;
        y.C = string2;
        y.D = map;
        int i4 = 7;
        if (list == null) {
            xdr xdrVar = y.t;
            spm spmVar = spm.a;
            if (ik0Var != null) {
                xdrVar.getClass();
                xdrVar.m(null, spmVar);
                w27 w27Var = new w27(y, i3);
                cfk.c.a(Unit.a);
                ik0Var.a.add(w27Var);
            } else {
                xdrVar.getClass();
                xdrVar.m(null, spmVar);
                cq4 F = ot0.F(y);
                dq7 dq7Var = ca8.a;
                x97.y(F, mn7.d, null, new x27(y, continuation, i2), 2);
            }
        } else {
            x97.y(ot0.F(y), null, null, new bv6(y, list, continuation, i4), 3);
        }
        h37 y2 = y();
        x97.y(ot0.F(y2), ca8.a, null, new x27(y2, continuation, i3), 2);
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, i3), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, i), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, 5), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, i4), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new u27(this, continuation, 9), 3);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_dk_preselect_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = R.id.divContainer;
        LinearLayout linearLayout2 = (LinearLayout) dag.v(R.id.divContainer, inflate);
        if (linearLayout2 != null) {
            i = R.id.scroll_view;
            if (((FrameLayout) dag.v(R.id.scroll_view, inflate)) != null) {
                this.h = new aqd(linearLayout, linearLayout, linearLayout2, 15);
                return linearLayout;
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        lom lomVar = this.g;
        if (lomVar != null) {
            lomVar.H(false);
        } else {
            Intrinsics.j("callbacks");
            throw null;
        }
    }

    public final aqd x() {
        aqd aqdVar = this.h;
        if (aqdVar != null) {
            return aqdVar;
        }
        xq0.q("Required value was null.");
        return null;
    }

    public final h37 y() {
        return (h37) this.m.getValue();
    }
}
