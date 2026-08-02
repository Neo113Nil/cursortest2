package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ld3j;", "Ledu;", "Lshk;", "La13;", "<init>", "()V", "xzi", "x2j", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class d3j extends edu<shk> implements a13 {
    public final osh h = new osh(nw3.a);
    public final jyr i = btf.b(new a3j(this, 1));
    public final ybf j = new ybf(ern.a(u8q.class), new a3j(this, 3), new a3j(this, 5), new a3j(this, 4));
    public final jyr k = btf.b(new a3j(this, 0));
    public final ybf l;
    public xzi m;

    public d3j() {
        a3j a3jVar = new a3j(this, 7);
        arf a = btf.a(bwf.c, new ypb(23, new a3j(this, 6)));
        this.l = new ybf(ern.a(f3j.class), new sy6(a, 16), a3jVar, new sy6(a, 17));
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        et3 et3Var = (et3) requireArguments().getParcelable("CAMERA_CARD_SCANNER_PROVIDER");
        if (et3Var != null) {
            et3Var.U();
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        shk a = shk.a(layoutInflater, viewGroup);
        this.g = a;
        LinearLayout linearLayout = a.a;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // defpackage.edu, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        this.h.V(null);
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        g0c y = y();
        qne e0 = gut.e0(zso.CARD_BIND);
        x60 x60Var = (x60) y;
        x60Var.getClass();
        x60Var.a(e0);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        view.getClass();
        super.onViewCreated(view, bundle);
        ((shk) x()).e.setTitleText(null);
        HeaderView headerView = ((shk) x()).e;
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        int i = 1;
        int i2 = 0;
        if (qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null)) {
            A = false;
        } else {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView.setBrandIconVisible(A);
        ((shk) x()).h.setText(R.string.paymentsdk_bind_card_title);
        int i3 = 8;
        ((shk) x()).i.setVisibility(8);
        ((shk) x()).j.setVisibility(8);
        ((shk) x()).k.setVisibility(8);
        ((shk) x()).h.setVisibility(0);
        ((shk) x()).g.setVisibility(8);
        ((shk) x()).m.setVisibility(8);
        xzi xziVar = this.m;
        if (xziVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        String string = getString(R.string.paymentsdk_bind_card_next_button);
        string.getClass();
        xziVar.h0(string, null, null);
        xzi xziVar2 = this.m;
        if (xziVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        int i4 = 2;
        a3j a3jVar = new a3j(this, i4);
        BindCardActivity bindCardActivity = (BindCardActivity) xziVar2.a;
        ((mhk) bindCardActivity.D()).a.setOnClickListener(new fq2(1, a3jVar, bindCardActivity));
        ues uesVar = hmd.a;
        Context requireContext = requireContext();
        requireContext.getClass();
        jsg jsgVar = new jsg(hmd.a(requireContext), 12);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        nw3 nw3Var = nw3.a;
        xx3 xx3Var = ((p77) ((rsd) qld.y(this)).a().b(p77.class)).a().a;
        g0c y = y();
        t l2 = l();
        ddu dduVar2 = l2 instanceof ddu ? (ddu) l2 : null;
        xw3 c = jsgVar.c(requireContext2, nw3Var, xx3Var, y, qdq.B(dduVar2 != null ? Boolean.valueOf(dduVar2.m()) : null));
        c.setPaymentApi(((p77) ((rsd) qld.y(this)).a().b(p77.class)).f());
        this.h.V(c);
        ((shk) x()).b.addView(c);
        if (bundle == null) {
            c.j();
        }
        HeaderView headerView2 = ((shk) x()).e;
        ybf ybfVar = this.j;
        int i5 = 0;
        headerView2.v(new sui(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i5, 4), true);
        ((shk) x()).l.setExitButtonCallback(new sui(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i5, 5));
        ProgressResultView progressResultView = ((shk) x()).l;
        t l3 = l();
        progressResultView.setBrandIconVisible(!qdq.B((l3 instanceof ddu ? (ddu) l3 : null) != null ? Boolean.valueOf(r9.m()) : null));
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        Object systemService = requireContext3.getSystemService("accessibility");
        systemService.getClass();
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1);
        enabledAccessibilityServiceList.getClass();
        boolean isEmpty = enabledAccessibilityServiceList.isEmpty();
        FrameLayout frameLayout = ((shk) x()).f;
        q6c q6cVar = q6c.t;
        if (n7w.R(q6cVar) && isEmpty) {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
        if (n7w.R(q6cVar) && isEmpty) {
            i6j i6jVar = new i6j();
            xzi xziVar3 = this.m;
            if (xziVar3 == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            i6jVar.i = xziVar3;
            y childFragmentManager = getChildFragmentManager();
            a l4 = su4.l(childFragmentManager, childFragmentManager);
            l4.e(((shk) x()).f.getId(), i6jVar, "nfc_fragment");
            l4.j();
        }
        ybf ybfVar2 = this.l;
        f3j f3jVar = (f3j) ybfVar2.getValue();
        (f3jVar.p ? f3jVar.m : f3jVar.l.k).f(getViewLifecycleOwner(), new uy6(4, new b3j(this, i2)));
        f3j f3jVar2 = (f3j) ybfVar2.getValue();
        (f3jVar2.p ? f3jVar2.n : f3jVar2.l.l).f(getViewLifecycleOwner(), new uy6(4, new b3j(this, i)));
        f3j f3jVar3 = (f3j) ybfVar2.getValue();
        (f3jVar3.p ? f3jVar3.o : f3jVar3.l.m).f(getViewLifecycleOwner(), new uy6(4, new b3j(this, i4)));
        getChildFragmentManager().f0("nfc_fragment_request_key", this, new uvg(16, new afg(7, c, this)));
    }

    public final g0c y() {
        return (g0c) this.k.getValue();
    }
}
