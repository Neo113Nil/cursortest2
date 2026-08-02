package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lrbp;", "Ledu;", "Lvhk;", "Ljcp;", "<init>", "()V", "n07", "sbp", "tom", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class rbp extends edu<vhk> implements jcp {
    public gdp h;
    public mcp i;
    public rfk k;
    public String m;
    public n07 o;
    public sbp p;
    public boolean s;
    public final ybf j = new ybf(ern.a(u8q.class), new obp(this, 4), new obp(this, 6), new obp(this, 5));
    public pmk l = new pmk(false, lmk.e);
    public boolean n = true;
    public final rn5 q = new rn5(8);
    public final jyr r = btf.b(new obp(this, 0));

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sbp sbpVar = this.p;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar.j) {
            return;
        }
        this.k = (rfk) requireArguments().getParcelable("ARG_PREFERRED_METHOD");
        pmk pmkVar = (pmk) requireArguments().getParcelable("ARG_PERSONAL_INFO_STATE");
        if (pmkVar != null) {
            this.l = pmkVar;
        }
        sbp sbpVar2 = this.p;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        jek a = sbpVar2.c.a();
        sbp sbpVar3 = this.p;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sdk f = sbpVar3.b.f();
        rfk rfkVar = this.k;
        sbp sbpVar4 = this.p;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        g3j f2 = sbpVar4.f();
        sbp sbpVar5 = this.p;
        if (sbpVar5 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        tom tomVar = new tom(a, f, rfkVar, f2, sbpVar5.h.d, sbpVar5.b.e().d(), z());
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, tomVar, defaultViewModelCreationExtras);
        lm4 a2 = ern.a(gdp.class);
        String f3 = a2.f();
        if (f3 == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.h = (gdp) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f3));
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        int B = ocg.B(R.attr.paymentsdk_paymentCellElements, theme);
        if (B >= dcp.values().length) {
            xq0.x("Wrong enum value for AdapterMode");
            return;
        }
        dcp dcpVar = dcp.values()[B];
        Resources.Theme theme2 = requireContext().getTheme();
        theme2.getClass();
        this.n = ocg.A(theme2, R.attr.paymentsdk_is_light_theme, true);
        ues uesVar = hmd.a;
        Context requireContext = requireContext();
        requireContext.getClass();
        mcp mcpVar = new mcp(this, new jsg(hmd.a(requireContext), 12), this.n, dcpVar, z());
        this.i = mcpVar;
        mcpVar.m = y();
        mcp mcpVar2 = this.i;
        if (mcpVar2 == null) {
            Intrinsics.j("adapter");
            throw null;
        }
        mcpVar2.s(true);
        Resources.Theme theme3 = requireActivity().getTheme();
        theme3.getClass();
        this.s = ocg.A(theme3, R.attr.paymentsdk_showFooterOnSelectOnly, false);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        vhk a = vhk.a(layoutInflater, viewGroup);
        this.g = a;
        LinearLayout linearLayout = a.a;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // defpackage.edu, androidx.fragment.app.o
    public final void onDestroyView() {
        sbp sbpVar = this.p;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (!sbpVar.j) {
            LinearLayout linearLayout = ((vhk) x()).a;
            n07 n07Var = this.o;
            if (n07Var == null) {
                Intrinsics.j("layoutChangeListener");
                throw null;
            }
            linearLayout.removeOnLayoutChangeListener(n07Var);
            c5b c5bVar = c5b.a;
            rn5 rn5Var = this.q;
            rn5Var.f = c5bVar;
            rn5Var.b = null;
            rn5Var.c = null;
            rn5Var.d = null;
            rn5Var.e = null;
        }
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r12v34, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        view.getClass();
        super.onViewCreated(view, bundle);
        sbp sbpVar = this.p;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (sbpVar.j) {
            return;
        }
        ProgressResultView progressResultView = ((vhk) x()).f;
        ybf ybfVar = this.j;
        int i = 0;
        progressResultView.setExitButtonCallback(new qbp(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i, 0));
        int i2 = 1;
        ((vhk) x()).b.v(new qbp(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i, 1), true);
        HeaderView.u(((vhk) x()).b);
        HeaderView headerView = ((vhk) x()).b;
        int i3 = 0;
        if (y()) {
            A = false;
        } else {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView.setBrandIconVisible(A);
        int i4 = 2;
        if (this.l.d()) {
            ((vhk) x()).b.setTitleText(null);
            ((vhk) x()).d.setVisibility(0);
            ((vhk) x()).d.setText(R.string.paymentsdk_personal_label);
            ((vhk) x()).e.setVisibility(0);
            ((vhk) x()).e.setCallback(new obp(this, i2));
            ((EmailView) ((vhk) x()).e.q.a).setOnFocusChanged(new kif(2, new pbp(this, 5)));
            PersonalInfoView personalInfoView = ((vhk) x()).e;
            sbp sbpVar2 = this.p;
            if (sbpVar2 == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            personalInfoView.setValidators(zsd.D(sbpVar2.b.a().a));
            ((vhk) x()).e.setPersonalInfoVisibility(this.l);
            PersonalInfoView personalInfoView2 = ((vhk) x()).e;
            sbp sbpVar3 = this.p;
            if (sbpVar3 == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            personalInfoView2.setPersonalInfo(sbpVar3.h);
            ((vhk) x()).c.setVisibility(0);
            ((vhk) x()).c.setText(R.string.paymentsdk_payment_method_title);
        } else {
            HeaderView headerView2 = ((vhk) x()).b;
            String string = view.getContext().getString(R.string.paymentsdk_payment_method_title);
            string.getClass();
            headerView2.setTitleTextString(string);
            ((vhk) x()).d.setVisibility(8);
            ((vhk) x()).e.setVisibility(8);
            ((vhk) x()).c.setVisibility(8);
        }
        RecyclerView recyclerView = ((vhk) x()).g;
        mcp mcpVar = this.i;
        if (mcpVar == null) {
            Intrinsics.j("adapter");
            throw null;
        }
        recyclerView.setAdapter(mcpVar);
        ((vhk) x()).g.setLayoutManager(new LinearLayoutManager(getContext()));
        ((vhk) x()).g.setHasFixedSize(true);
        LinearLayout linearLayout = ((vhk) x()).a;
        linearLayout.getClass();
        this.o = new n07(linearLayout);
        LinearLayout linearLayout2 = ((vhk) x()).a;
        n07 n07Var = this.o;
        if (n07Var == null) {
            Intrinsics.j("layoutChangeListener");
            throw null;
        }
        linearLayout2.addOnLayoutChangeListener(n07Var);
        ((vhk) x()).f.setCloseCallback(new obp(this, i4));
        ((vhk) x()).f.setBrandIconVisible(!y());
        sbp sbpVar4 = this.p;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        int i5 = 3;
        ((PaymentButtonView) sbpVar4.e.invoke()).setOnClickListener(new kom(1, new obp(this, i5)));
        sbp sbpVar5 = this.p;
        if (sbpVar5 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar5.n(true);
        sbp sbpVar6 = this.p;
        if (sbpVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        gdp gdpVar = this.h;
        if (gdpVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        if (sbpVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        mgk mgkVar = sbpVar6.i;
        rn5 rn5Var = this.q;
        rn5Var.getClass();
        rn5Var.d = new fdp(gdpVar, 0);
        rn5Var.c = new cib(29, gdpVar);
        rn5Var.b = new sml(gdpVar);
        gdpVar.y = rn5Var;
        if (mgkVar == null) {
            gdpVar.t.l(new vcp(false, false));
            gdpVar.u.l(nl3.a);
            jek jekVar = gdpVar.k;
            ((tdk) jekVar.c).g(jekVar.a, jekVar.b, new aqd(13, jekVar, new g8c(gdpVar)));
        } else {
            gdpVar.w = mgkVar;
            gdpVar.a(mgkVar);
        }
        gdp gdpVar2 = this.h;
        if (gdpVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        gdpVar2.r.f(getViewLifecycleOwner(), new uy6(10, new pbp(this, i3)));
        gdp gdpVar3 = this.h;
        if (gdpVar3 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        gdpVar3.s.f(getViewLifecycleOwner(), new uy6(10, new pbp(this, i2)));
        gdp gdpVar4 = this.h;
        if (gdpVar4 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        gdpVar4.t.f(getViewLifecycleOwner(), new uy6(10, new pbp(this, i4)));
        gdp gdpVar5 = this.h;
        if (gdpVar5 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        gdpVar5.u.f(getViewLifecycleOwner(), new uy6(10, new pbp(this, i5)));
        gdp gdpVar6 = this.h;
        if (gdpVar6 != null) {
            gdpVar6.v.f(getViewLifecycleOwner(), new uy6(10, new pbp(this, 4)));
        } else {
            Intrinsics.j("viewModel");
            throw null;
        }
    }

    @Override // defpackage.jcp
    public final void q(int i, boolean z, ly6 ly6Var) {
        ly6Var.getClass();
        this.q.q(i, z, ly6Var);
    }

    @Override // defpackage.jcp
    public final void t(int i) {
        ((vhk) x()).g.C0(i);
        this.q.t(i);
    }

    public final boolean y() {
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        return qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null);
    }

    public final g0c z() {
        return (g0c) this.r.getValue();
    }
}
