package com.lumenpath.harispro.hrnavigator.ui.knowledge;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z0.a;
import a1.C0083a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentListSearchBinding;
import e1.d;
import e1.f;
import h1.C0173a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class KnowledgeFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentListSearchBinding f2805W;

    /* renamed from: X, reason: collision with root package name */
    public List f2806X;

    /* renamed from: Y, reason: collision with root package name */
    public d f2807Y;

    public KnowledgeFragment() {
        List list = a.f1640a;
        this.f2806X = a.f1640a;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        List<C0083a> list = this.f2806X;
        ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
        for (C0083a c0083a : list) {
            arrayList.add(new f(c0083a.f1669b, c0083a.f1670c, c0083a.f1671d));
        }
        this.f2807Y = new d(arrayList, new Y0.a(4, this), 1);
        FragmentListSearchBinding fragmentListSearchBinding = this.f2805W;
        i.b(fragmentListSearchBinding);
        RecyclerView recyclerView = fragmentListSearchBinding.recyclerView;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentListSearchBinding fragmentListSearchBinding2 = this.f2805W;
        i.b(fragmentListSearchBinding2);
        RecyclerView recyclerView2 = fragmentListSearchBinding2.recyclerView;
        d dVar = this.f2807Y;
        if (dVar == null) {
            i.i("adapter");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
        FragmentListSearchBinding fragmentListSearchBinding3 = this.f2805W;
        i.b(fragmentListSearchBinding3);
        TextInputEditText textInputEditText = fragmentListSearchBinding3.searchEdit;
        i.d(textInputEditText, "searchEdit");
        textInputEditText.addTextChangedListener(new C0173a(1, this));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentListSearchBinding inflate = FragmentListSearchBinding.inflate(layoutInflater, viewGroup, false);
        this.f2805W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2805W = null;
    }
}
