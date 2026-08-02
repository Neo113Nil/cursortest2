package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;

/* loaded from: classes3.dex */
public final class dz5 extends jnb {
    public final pu0 j;
    public final osh k;
    public final String l;
    public final dud m;
    public final j0q n;
    public final jyr o;

    public dz5(pu0 pu0Var, osh oshVar, String str, dud dudVar) {
        str.getClass();
        dudVar.getClass();
        this.j = pu0Var;
        this.k = oshVar;
        this.l = str;
        this.m = dudVar;
        this.n = new j0q();
        this.o = btf.b(new r25(16, this));
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
        jfu viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        osh oshVar = this.k;
        oshVar.getClass();
        String str = this.l;
        str.getClass();
        dud dudVar = this.m;
        dudVar.getClass();
        j0q j0qVar = this.n;
        j0qVar.getClass();
        e00 e00Var = (e00) oshVar.b;
        tmb tmbVar = (tmb) ((bz5) oshVar.a).l.getValue();
        bz5 bz5Var = (bz5) e00Var.b;
        tmbVar.getClass();
        vd vdVar = new vd(14, e00Var, str, qnqVar.d);
        lm4 a = ern.a(d06.class);
        wz wzVar = new wz(20, vdVar);
        gs6 gs6Var = gs6.b;
        gs6Var.getClass();
        bjt bjtVar = new bjt(viewModelStore, wzVar, gs6Var);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        tz5 tz5Var = new tz5(qnqVar, viewModelStore, (d06) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f)), new qxp(bz5Var), dudVar, e00Var, j0qVar, tmbVar, bz5.a());
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner2.getLifecycle()));
        composeView.setContent(new wn5(new kw5(3, this, tz5Var), -1066377468, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return (cvo) this.o.getValue();
    }
}
