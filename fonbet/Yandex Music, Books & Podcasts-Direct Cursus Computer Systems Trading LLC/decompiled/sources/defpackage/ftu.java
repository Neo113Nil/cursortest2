package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.player.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lftu;", "Ljnb;", "<init>", "()V", "wave-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ftu extends jnb {
    public final ybf A;
    public final jyr B;
    public final jyr C;
    public final jyr D;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final gfo m;
    public final d1v n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final zh t;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final ybf x;
    public boolean y;
    public final ybf z;

    public ftu() {
        bdt I = hag.I(j1v.class);
        l18 l18Var = l18.b;
        this.j = l18Var.b(I, true);
        this.k = l18Var.b(hag.I(akf.class), true);
        this.l = l18Var.b(hag.I(y8m.class), true);
        this.m = gfo.Tab;
        this.n = B().a();
        this.o = btf.b(new btu(this, 0));
        this.p = btf.b(new btu(this, 6));
        this.q = l18Var.b(hag.I(ro2.class), true);
        this.r = btf.b(new btu(this, 7));
        this.s = btf.b(new btu(this, 8));
        zh registerForActivityResult = registerForActivityResult(new vh(4), new d2e(1));
        registerForActivityResult.getClass();
        this.t = registerForActivityResult;
        this.u = l18Var.b(hag.I(mvv.class), true);
        this.v = l18Var.b(hag.I(kuv.class), true);
        this.w = btf.b(new btu(this, 9));
        this.x = new ybf(ern.a(dvv.class), new etu(this, 0), new xpp(24, new btu(this, 10)));
        this.z = new ybf(ern.a(g9m.class), new etu(this, 1), new xpp(25, new btu(this, 11)));
        this.A = new ybf(ern.a(d4v.class), new etu(this, 2), new xpp(26, new btu(this, 1)));
        this.B = btf.b(new btu(this, 2));
        this.C = btf.b(new btu(this, 4));
        this.D = btf.b(new btu(this, 5));
    }

    public final c0v A() {
        return (c0v) this.o.getValue();
    }

    public final j1v B() {
        return (j1v) this.j.getValue();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new ctu(this, 0), -2049919369, true));
        return composeView;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        ((l0v) this.B.getValue()).a();
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStart() {
        ybf ybfVar = this.x;
        jyr jyrVar = this.s;
        super.onStart();
        c0v A = A();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        A.getClass();
        a aVar = requireActivity instanceof a ? (a) requireActivity : null;
        if (aVar != null) {
            v3w.n(true, aVar.K, null);
            ual ualVar = aVar.A;
            if (ualVar != null) {
                ualVar.f = true;
                ualVar.a(0);
            }
            np2 np2Var = (np2) vq2.R(aVar);
            if (np2Var != null) {
                np2Var.l().u(true);
            }
        }
        c0v A2 = A();
        t requireActivity2 = requireActivity();
        requireActivity2.getClass();
        A2.getClass();
        c0v.b(true, requireActivity2);
        y18 y18Var = ((akf) this.k.getValue()).b;
        b9s[] b9sVarArr = d9s.a;
        if (d9s.a(b9s.b)) {
            i1v i1vVar = (i1v) jyrVar.getValue();
            if (((Boolean) i1vVar.b.a(i1vVar.a.c()).f(vye.e)).booleanValue()) {
                return;
            }
            pst pstVar = (pst) ((i1v) jyrVar.getValue()).c.getValue();
            pstVar.getClass();
            if (pstVar.a.getBoolean("wave_screen_wizard_skipped", false) || this.y) {
                return;
            }
            this.y = true;
            pcg.M(this, (muv) this.w.getValue(), (dvv) ybfVar.getValue(), ((dvv) ybfVar.getValue()).G(), new btu(this, 3));
        }
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        if (requireActivity().isChangingConfigurations()) {
            return;
        }
        c0v A = A();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        A.getClass();
        a aVar = requireActivity instanceof a ? (a) requireActivity : null;
        if (aVar != null) {
            v3w.n(false, aVar.K, null);
            ual ualVar = aVar.A;
            if (ualVar != null) {
                ualVar.f = false;
                ualVar.a(((Number) ualVar.i.getValue()).intValue());
            }
            np2 np2Var = (np2) vq2.R(aVar);
            if (np2Var != null) {
                np2Var.l().u(false);
            }
        }
        c0v A2 = A();
        t requireActivity2 = requireActivity();
        requireActivity2.getClass();
        A2.getClass();
        c0v.b(false, requireActivity2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        snf snfVar;
        boolean z;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i = 1;
        Continuation continuation = null;
        if (arguments != null && arguments.containsKey("wave.landing.queue.type")) {
            Object obj = arguments.get("wave.landing.queue.type");
            arguments.remove("wave.landing.queue.type");
            if (obj instanceof snf) {
                snfVar = (snf) obj;
                z = snfVar instanceof rnf;
                jyr jyrVar = this.C;
                if (!z) {
                    rnf rnfVar = (rnf) snfVar;
                    List list = rnfVar.a;
                    boolean z2 = rnfVar.b;
                    String t = weo.t();
                    A().a(list, z2, null, t);
                    ((ekf) jyrVar.getValue()).b(t, list);
                    return;
                }
                if (!(snfVar instanceof onf)) {
                    if (Intrinsics.d(snfVar, qnf.a)) {
                        rdk rdkVar = A().f;
                        x97.y((mm6) rdkVar.b, null, null, new rmf(rdkVar, continuation, i), 3);
                        return;
                    } else {
                        if (snfVar == null) {
                            return;
                        }
                        b6e.s();
                        return;
                    }
                }
                onf onfVar = (onf) snfVar;
                String str = onfVar.a;
                Bundle bundle2 = onfVar.b;
                boolean z3 = onfVar.c;
                String t2 = weo.t();
                StationId stationId = StationId.a;
                List c = t75.c(str);
                c0v A = A();
                c.getClass();
                A.a(c, z3, bundle2, t2);
                ((ekf) jyrVar.getValue()).b(t2, c);
                return;
            }
        }
        snfVar = null;
        z = snfVar instanceof rnf;
        jyr jyrVar2 = this.C;
        if (!z) {
        }
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getO() {
        return this.m;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) ((ltu) this.D.getValue()).u.getValue();
    }
}
