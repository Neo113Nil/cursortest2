package com.lumenpath.harispro.hrnavigator.ui.company;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.d;
import Z0.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentCompanyBinding;
import com.lumenpath.harispro.hrnavigator.utils.WrapContentLinearLayoutManager;
import f1.C0153b;

/* loaded from: classes.dex */
public final class CompanyFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentCompanyBinding f2792W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        FragmentCompanyBinding fragmentCompanyBinding = this.f2792W;
        i.b(fragmentCompanyBinding);
        fragmentCompanyBinding.recyclerView.setAdapter(new C0153b(d.f1643a, 0));
        FragmentCompanyBinding fragmentCompanyBinding2 = this.f2792W;
        i.b(fragmentCompanyBinding2);
        RecyclerView recyclerView = fragmentCompanyBinding2.recyclerView;
        H();
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(1));
        FragmentCompanyBinding fragmentCompanyBinding3 = this.f2792W;
        i.b(fragmentCompanyBinding3);
        fragmentCompanyBinding3.faqRecycler.setAdapter(new C0153b(f.f1645a, 1));
        FragmentCompanyBinding fragmentCompanyBinding4 = this.f2792W;
        i.b(fragmentCompanyBinding4);
        RecyclerView recyclerView2 = fragmentCompanyBinding4.faqRecycler;
        H();
        recyclerView2.setLayoutManager(new WrapContentLinearLayoutManager(1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentCompanyBinding inflate = FragmentCompanyBinding.inflate(layoutInflater, viewGroup, false);
        this.f2792W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2792W = null;
    }
}
