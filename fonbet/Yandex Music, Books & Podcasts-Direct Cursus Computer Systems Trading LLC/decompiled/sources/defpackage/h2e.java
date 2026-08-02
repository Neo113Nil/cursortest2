package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh2e;", "Ljnb;", "Lq1s;", "<init>", "()V", "landing-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class h2e extends jnb implements q1s {
    public final jyr j;
    public final zh k;
    public final jyr l;
    public final ybf m;
    public final jyr n;
    public final jyr o;
    public j2e p;
    public boolean q;
    public boolean r;
    public final suc s;
    public final gfo t;
    public final jyr u;

    public h2e() {
        bdt I = hag.I(skr.class);
        l18 l18Var = l18.b;
        this.j = l18Var.b(I, true);
        zh registerForActivityResult = registerForActivityResult(new vh(4), new d2e(0));
        registerForActivityResult.getClass();
        this.k = registerForActivityResult;
        this.l = btf.b(new e2e(this, 0));
        this.m = new ybf(ern.a(xqq.class), new pva(10, this), new pva(11, new e2e(this, 1)));
        this.n = l18Var.b(hag.I(b2e.class), true);
        this.o = btf.b(new e2e(this, 2));
        this.s = new suc(this, new ruc("HomeLandingSkeletonFragment", true));
        this.t = gfo.Tab;
        this.u = btf.b(new sxd(4, this));
    }

    @Override // defpackage.q1s
    public final void j() {
        ((xqq) this.m.getValue()).U(0);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bzf.v(this);
        this.q = bundle != null ? bundle.getBoolean("skeleton.loaded.reported") : false;
        this.r = bundle != null ? bundle.getBoolean("skeleton.shown.reported") : false;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("landing.skeleton.focus.on.tab.id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("landing.skeleton.focus.on.block.id") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putString("landing.skeleton.focus.on.tab.id", null);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.putString("landing.skeleton.focus.on.block.id", null);
        }
        ybf ybfVar = this.m;
        if (string != null) {
            ((xqq) ybfVar.getValue()).T(string, string2);
        }
        this.p = new j2e(wyf.F(getLifecycle()), (xqq) ybfVar.getValue(), new e2e(this, 3), new nha(18, this), new qec(4, this));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qnq qnqVar = new qnq(childFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 48);
        j2e j2eVar = this.p;
        if (j2eVar == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        ub7 ub7Var = new ub7(25, j2eVar.j, this);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new f2e(this, qnqVar, ub7Var, 0), 660191711, true));
        return composeView;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("skeleton.loaded.reported", this.q);
        bundle.putBoolean("skeleton.shown.reported", this.r);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        ii7 ii7Var;
        boolean z;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Continuation continuation = null;
        if (arguments != null && arguments.containsKey("landing.type.queue")) {
            Object obj = arguments.get("landing.type.queue");
            arguments.remove("landing.type.queue");
            ii7Var = obj instanceof ii7 ? (ii7) obj : null;
            if (ii7Var == null) {
                ssg.a(5, null, "HomeLandingSkeletonFragment: unsupported queue type " + obj, null);
            }
            z = ii7Var instanceof hi7;
            jyr jyrVar = this.o;
            if (z) {
                int i = 1;
                if (ii7Var instanceof fi7) {
                    a2e a2eVar = (a2e) jyrVar.getValue();
                    fi7 fi7Var = (fi7) ii7Var;
                    String str = fi7Var.a;
                    Bundle bundle2 = fi7Var.b;
                    boolean z2 = fi7Var.c;
                    a2eVar.getClass();
                    str.getClass();
                    bundle2.getClass();
                    String t = weo.t();
                    StationId stationId = StationId.a;
                    List c = t75.c(str);
                    ekf ekfVar = a2eVar.f;
                    c.getClass();
                    ekfVar.b(t, c);
                    dyd a = dyd.a(bundle2);
                    if (a != null && !a.c) {
                        a2eVar.a(c, z2, (xpt) a.b, t);
                        a.c = true;
                    }
                } else if (Intrinsics.d(ii7Var, gi7.a)) {
                    rdk rdkVar = ((a2e) jyrVar.getValue()).g;
                    x97.y((mm6) rdkVar.b, null, null, new rmf(rdkVar, continuation, i), 3);
                } else if (ii7Var != null) {
                    b6e.s();
                    return;
                }
            } else {
                a2e a2eVar2 = (a2e) jyrVar.getValue();
                hi7 hi7Var = (hi7) ii7Var;
                List list = hi7Var.a;
                boolean z3 = hi7Var.b;
                a2eVar2.getClass();
                list.getClass();
                String t2 = weo.t();
                a2eVar2.f.b(t2, list);
                a2eVar2.a(list, z3, null, t2);
            }
            this.s.b();
        }
        ii7Var = null;
        z = ii7Var instanceof hi7;
        jyr jyrVar2 = this.o;
        if (z) {
        }
        this.s.b();
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getO() {
        return this.t;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.u.getValue();
    }
}
