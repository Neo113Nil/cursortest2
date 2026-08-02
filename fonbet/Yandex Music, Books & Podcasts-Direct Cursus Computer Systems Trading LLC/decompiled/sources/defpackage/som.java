package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.HeaderView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lsom;", "Ledu;", "Lvhk;", "Ljcp;", "<init>", "()V", "lom", "pom", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class som extends edu<vhk> implements jcp {
    public eqm i;
    public mcp j;
    public boolean k;
    public String l;
    public lom n;
    public final ybf h = new ybf(ern.a(u8q.class), new qom(this, 5), new qom(this, 7), new qom(this, 6));
    public final jyr m = btf.b(new qom(this, 0));

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = requireArguments().getBoolean("START_PAYMENT_AFTER_SELECT");
        this.l = requireArguments().getString("DEFAULT_PAYMENT_METHOD_ID");
        Application application = requireActivity().getApplication();
        application.getClass();
        sdk f = ((p77) ((rsd) qld.y(this)).a().b(p77.class)).f();
        Handler handler = new Handler(Looper.getMainLooper());
        String str = this.l;
        lom lomVar = this.n;
        if (lomVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        PreselectActivity preselectActivity = lomVar.a;
        ik0 ik0Var = preselectActivity.w ? preselectActivity.v : null;
        jyr jyrVar = this.m;
        pom pomVar = new pom(application, f, handler, str, ik0Var, (g0c) jyrVar.getValue());
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, pomVar, defaultViewModelCreationExtras);
        lm4 a = ern.a(eqm.class);
        String f2 = a.f();
        if (f2 == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.i = (eqm) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2));
        Resources.Theme theme = requireContext().getTheme();
        theme.getClass();
        int B = ocg.B(R.attr.paymentsdk_paymentCellElements, theme);
        if (B >= dcp.values().length) {
            xq0.x("Wrong enum value for AdapterMode");
            return;
        }
        dcp dcpVar = dcp.values()[B];
        ues uesVar = hmd.a;
        Context requireContext = requireContext();
        requireContext.getClass();
        jsg jsgVar = new jsg(hmd.a(requireContext), 12);
        Resources.Theme theme2 = requireContext().getTheme();
        theme2.getClass();
        mcp mcpVar = new mcp(this, jsgVar, ocg.A(theme2, R.attr.paymentsdk_is_light_theme, true), dcpVar, (g0c) jyrVar.getValue());
        this.j = mcpVar;
        mcpVar.m = y();
        mcp mcpVar2 = this.j;
        if (mcpVar2 != null) {
            mcpVar2.s(true);
        } else {
            Intrinsics.j("adapter");
            throw null;
        }
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

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        String string;
        view.getClass();
        super.onViewCreated(view, bundle);
        HeaderView.u(((vhk) x()).b);
        HeaderView headerView = ((vhk) x()).b;
        ybf ybfVar = this.h;
        int i = 1;
        headerView.v(new ebm(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", 0, 15), true);
        ((vhk) x()).f.setExitButtonCallback(new ebm(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", 0, 16));
        ((vhk) x()).f.setBrandIconVisible(!y());
        ((vhk) x()).b.setTitleText(Integer.valueOf(R.string.paymentsdk_payment_method_title));
        ((vhk) x()).b.t(Integer.valueOf(R.string.paymentsdk_unbind_edit_button), new qom(this, i));
        HeaderView headerView2 = ((vhk) x()).b;
        int i2 = 0;
        if (y()) {
            A = false;
        } else {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView2.setBrandIconVisible(A);
        ((vhk) x()).d.setVisibility(8);
        ((vhk) x()).e.setVisibility(8);
        ((vhk) x()).c.setVisibility(8);
        RecyclerView recyclerView = ((vhk) x()).g;
        mcp mcpVar = this.j;
        if (mcpVar == null) {
            Intrinsics.j("adapter");
            throw null;
        }
        recyclerView.setAdapter(mcpVar);
        ((vhk) x()).g.setLayoutManager(new LinearLayoutManager(getContext()));
        ((vhk) x()).g.setHasFixedSize(true);
        if (!cfk.e.a.e()) {
            lom lomVar = this.n;
            if (lomVar == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            if (this.k) {
                string = getString(R.string.paymentsdk_pay_title);
                string.getClass();
            } else {
                string = getString(R.string.paymentsdk_select_method_button);
                string.getClass();
            }
            lomVar.i(string, null, null);
            lom lomVar2 = this.n;
            if (lomVar2 == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            lomVar2.h(new dek());
        }
        eqm eqmVar = this.i;
        if (eqmVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        lom lomVar3 = this.n;
        if (lomVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        List list = lomVar3.a.r;
        ik0 ik0Var = eqmVar.n;
        eqmVar.s = new ArrayList();
        if (list == null) {
            voi voiVar = eqmVar.q;
            if (ik0Var != null) {
                voiVar.l(new ypm());
                ybg ybgVar = new ybg(17, eqmVar);
                cfk.c.a(Unit.a);
                ik0Var.a.add(ybgVar);
            } else {
                voiVar.l(new ypm());
                eqmVar.r.submit(new dyg(22, eqmVar));
            }
        } else {
            ArrayList y0 = CollectionsKt.y0(list);
            eqmVar.s = y0;
            if (y0.size() == 1) {
                eqmVar.J((rfk) CollectionsKt.Q(eqmVar.s), false);
            } else {
                eqmVar.H();
            }
        }
        eqm eqmVar2 = this.i;
        if (eqmVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        eqmVar2.p.f(getViewLifecycleOwner(), new uy6(5, new rom(this, i2)));
        eqm eqmVar3 = this.i;
        if (eqmVar3 != null) {
            eqmVar3.q.f(getViewLifecycleOwner(), new uy6(5, new rom(this, i)));
        } else {
            Intrinsics.j("viewModel");
            throw null;
        }
    }

    @Override // defpackage.jcp
    public final void q(int i, boolean z, ly6 ly6Var) {
        ly6Var.getClass();
    }

    @Override // defpackage.jcp
    public final void t(int i) {
        lhb lhbVar = lhb.y0;
        ((vhk) x()).g.z0(i);
        eqm eqmVar = this.i;
        if (eqmVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        voi voiVar = eqmVar.q;
        if (!(voiVar.d() instanceof cqm)) {
            eqmVar.J((rfk) eqmVar.s.get(i), true);
            return;
        }
        sdk sdkVar = eqmVar.k;
        Object d = voiVar.d();
        cqm cqmVar = d instanceof cqm ? (cqm) d : null;
        if (cqmVar == null) {
            wvs.p("Trying to unbind in invalid state");
            return;
        }
        voiVar.l(new ypm());
        rfk y = dag.y((kcp) cqmVar.a.get(i));
        iwe iweVar = new iwe(17, eqmVar, y);
        if (!(y instanceof ffk)) {
            if (!(y instanceof mfk)) {
                wvs.p("Trying to unbind non-card method");
                return;
            }
            w03 w03Var = ((tdk) sdkVar).h;
            String str = ((mfk) y).a;
            w03Var.getClass();
            str.getClass();
            t23 t23Var = w03Var.b;
            j13 j13Var = new j13(str, 3);
            g0c g0cVar = t23Var.k;
            String concat = "Отвязать СБП токен ".concat(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put("sbp_token_id", new jkr(str));
            linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
            vtm vtmVar = new vtm((Map) linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = up6.z(1) + ci0Var.a;
            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(vtmVar, "event_name", "unbind_sbp_token", "unbind_sbp_token", vtmVar);
            yop C = t23Var.f.a.C(j13Var, k9i.s, p1j.a);
            ((x60) g0cVar).b(j, C);
            mif.b(mif.b(C, new u03(iweVar, 0), null, 5), lhbVar, new u03(iweVar, 1), 1);
            return;
        }
        w03 w03Var2 = ((tdk) sdkVar).h;
        hw3 hw3Var = ((ffk) y).a;
        w03Var2.getClass();
        hw3Var.getClass();
        n23 n23Var = w03Var2.a;
        String str2 = hw3Var.a;
        str2.getClass();
        t23 t23Var2 = n23Var.a;
        bit bitVar = new bit(t23Var2.a.a, str2);
        g0c g0cVar2 = t23Var2.k;
        String concat2 = "Удалить привязанную карту ".concat(str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        r1f r1fVar2 = r1f.a;
        linkedHashMap2.put("card_id", new jkr(str2));
        linkedHashMap2.put(DeviceService.KEY_DESC, new jkr(concat2));
        vtm vtmVar2 = new vtm((Map) linkedHashMap2);
        ci0 ci0Var2 = qjb.a;
        ci0Var2.a = up6.z(1) + ci0Var2.a;
        vtmVar2.u(qee.n() + ci0Var2.a, "eventus_id");
        qne j2 = su4.j(vtmVar2, "event_name", "unbind_card", "unbind_card", vtmVar2);
        t28 t28Var = t23Var2.g;
        yop b = mif.b(yd5.I("unbind_card", t28Var.b, new qs6(20, t28Var, bitVar)), rq1.X, null, 5);
        ((x60) g0cVar2).b(j2, b);
        mif.b(mif.b(b, new u03(iweVar, 2), null, 5), lhbVar, new u03(iweVar, 3), 1);
    }

    public final boolean y() {
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        return qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null);
    }

    public final void z() {
        ((vhk) x()).f.setVisibility(0);
        ((vhk) x()).f.setState(new dvm(true));
        ((vhk) x()).b.setVisibility(8);
        ((vhk) x()).h.setVisibility(8);
        lom lomVar = this.n;
        if (lomVar != null) {
            lomVar.H(false);
        } else {
            Intrinsics.j("callbacks");
            throw null;
        }
    }
}
