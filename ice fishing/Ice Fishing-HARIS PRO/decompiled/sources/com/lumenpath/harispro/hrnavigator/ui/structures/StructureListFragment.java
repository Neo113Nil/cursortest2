package com.lumenpath.harispro.hrnavigator.ui.structures;

import D1.i;
import K1.d;
import Y0.a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.l;
import a1.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentListBinding;
import e1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class StructureListFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentListBinding f2823W;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        List<m> list = l.f1651a;
        ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
        for (m mVar : list) {
            arrayList.add(new f("🏗", mVar.f1715b, d.p0(mVar.f1716c).concat("…")));
        }
        FragmentListBinding fragmentListBinding = this.f2823W;
        i.b(fragmentListBinding);
        RecyclerView recyclerView = fragmentListBinding.recyclerView;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentListBinding fragmentListBinding2 = this.f2823W;
        i.b(fragmentListBinding2);
        fragmentListBinding2.recyclerView.setAdapter(new e1.d(arrayList, new a(9, this), 1));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentListBinding inflate = FragmentListBinding.inflate(layoutInflater, viewGroup, false);
        this.f2823W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2823W = null;
    }
}
