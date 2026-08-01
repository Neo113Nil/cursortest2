package com.lumenpath.harispro.hrnavigator.ui.services;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentServicesBinding;
import com.lumenpath.harispro.hrnavigator.utils.WrapContentLinearLayoutManager;
import f1.C0153b;

/* loaded from: classes.dex */
public final class ServicesFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentServicesBinding f2821W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        FragmentServicesBinding fragmentServicesBinding = this.f2821W;
        i.b(fragmentServicesBinding);
        fragmentServicesBinding.recyclerView.setAdapter(new C0153b(k.f1650a, 2));
        FragmentServicesBinding fragmentServicesBinding2 = this.f2821W;
        i.b(fragmentServicesBinding2);
        RecyclerView recyclerView = fragmentServicesBinding2.recyclerView;
        H();
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentServicesBinding inflate = FragmentServicesBinding.inflate(layoutInflater, viewGroup, false);
        this.f2821W = inflate;
        i.b(inflate);
        ScrollView root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2821W = null;
    }
}
