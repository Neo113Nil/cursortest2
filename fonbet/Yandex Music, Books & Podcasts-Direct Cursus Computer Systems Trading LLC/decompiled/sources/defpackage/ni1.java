package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.plus.plaquesdk.plaque.b;

/* loaded from: classes3.dex */
public final class ni1 extends jnb {
    public final pu0 j;
    public final le3 k;
    public final u51 l;
    public final qi1 m;
    public final dud n;
    public final String o;
    public final jyr p;

    public ni1(pu0 pu0Var, le3 le3Var, u51 u51Var, qi1 qi1Var, dud dudVar, String str) {
        u51Var.getClass();
        qi1Var.getClass();
        dudVar.getClass();
        this.j = pu0Var;
        this.k = le3Var;
        this.l = u51Var;
        this.m = qi1Var;
        this.n = dudVar;
        this.o = str;
        this.p = btf.b(new b(1, this));
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
        qnq qnqVar = new qnq(childFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d(), 16);
        le3 le3Var = this.k;
        jfu viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        u51 u51Var = this.l;
        qi1 qi1Var = this.m;
        dud dudVar = this.n;
        String str = this.o;
        le3Var.getClass();
        u51Var.getClass();
        qi1Var.getClass();
        dudVar.getClass();
        e00 e00Var = (e00) le3Var.a;
        e00Var.getClass();
        bdt I = hag.I(tmb.class);
        qdc qdcVar = e00Var.a;
        qdcVar.getClass();
        tmb tmbVar = (tmb) qdcVar.C(I);
        rh1 rh1Var = new rh1(u51Var, qi1Var, qnqVar, str, e00Var);
        lm4 a = ern.a(mj1.class);
        wz wzVar = new wz(5, rh1Var);
        gs6 gs6Var = gs6.b;
        gs6Var.getClass();
        bjt bjtVar = new bjt(viewModelStore, wzVar, gs6Var);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        yi1 yi1Var = new yi1(qnqVar, viewModelStore, (mj1) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f)), tmbVar, new zh1((bi1) e00Var.b), dudVar, e00Var);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new a3(21, this, yi1Var), 786916343, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.p.getValue();
    }
}
