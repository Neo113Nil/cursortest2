package com.lumenpath.harispro.hrnavigator.ui.metrics;

import D1.i;
import Y0.a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.g;
import a1.j;
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
public final class MetricsListFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentListBinding f2809W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        List<j> list = g.f1646a;
        ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
        for (j jVar : list) {
            arrayList.add(new f("📉", jVar.f1701b, jVar.f1702c));
        }
        FragmentListBinding fragmentListBinding = this.f2809W;
        i.b(fragmentListBinding);
        RecyclerView recyclerView = fragmentListBinding.recyclerView;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentListBinding fragmentListBinding2 = this.f2809W;
        i.b(fragmentListBinding2);
        fragmentListBinding2.recyclerView.setAdapter(new d(arrayList, new a(5, this), 1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentListBinding inflate = FragmentListBinding.inflate(layoutInflater, viewGroup, false);
        this.f2809W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2809W = null;
    }
}
