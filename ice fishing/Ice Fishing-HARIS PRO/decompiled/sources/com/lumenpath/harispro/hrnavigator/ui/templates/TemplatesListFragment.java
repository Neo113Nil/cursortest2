package com.lumenpath.harispro.hrnavigator.ui.templates;

import D1.i;
import Y0.a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.m;
import a1.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentListBinding;
import e1.d;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class TemplatesListFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentListBinding f2825W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        List<k> list = m.f1652a;
        ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
        for (k kVar : list) {
            arrayList.add(new f("📄", kVar.f1706b, kVar.f1707c));
        }
        FragmentListBinding fragmentListBinding = this.f2825W;
        i.b(fragmentListBinding);
        RecyclerView recyclerView = fragmentListBinding.recyclerView;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentListBinding fragmentListBinding2 = this.f2825W;
        i.b(fragmentListBinding2);
        fragmentListBinding2.recyclerView.setAdapter(new d(arrayList, new a(10, this), 1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentListBinding inflate = FragmentListBinding.inflate(layoutInflater, viewGroup, false);
        this.f2825W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2825W = null;
    }
}
