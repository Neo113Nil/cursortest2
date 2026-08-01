package com.lumenpath.harispro.hrnavigator.ui.dictionary;

import D1.i;
import Y0.a;
import Z.AbstractComponentCallbacksC0070s;
import Z0.n;
import a1.r;
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
public final class DictionaryFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public FragmentListSearchBinding f2798W;

    /* renamed from: X, reason: collision with root package name */
    public List f2799X;

    /* renamed from: Y, reason: collision with root package name */
    public d f2800Y;

    public DictionaryFragment() {
        List list = n.f1653a;
        this.f2799X = n.f1653a;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        List<r> list = this.f2799X;
        ArrayList arrayList = new ArrayList(u1.i.I(list, 10));
        for (r rVar : list) {
            arrayList.add(new f("📖", rVar.f1735b, rVar.f1736c));
        }
        this.f2800Y = new d(arrayList, new a(3, this), 1);
        FragmentListSearchBinding fragmentListSearchBinding = this.f2798W;
        i.b(fragmentListSearchBinding);
        RecyclerView recyclerView = fragmentListSearchBinding.recyclerView;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        FragmentListSearchBinding fragmentListSearchBinding2 = this.f2798W;
        i.b(fragmentListSearchBinding2);
        RecyclerView recyclerView2 = fragmentListSearchBinding2.recyclerView;
        d dVar = this.f2800Y;
        if (dVar == null) {
            i.i("adapter");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
        FragmentListSearchBinding fragmentListSearchBinding3 = this.f2798W;
        i.b(fragmentListSearchBinding3);
        TextInputEditText textInputEditText = fragmentListSearchBinding3.searchEdit;
        i.d(textInputEditText, "searchEdit");
        textInputEditText.addTextChangedListener(new C0173a(0, this));
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        FragmentListSearchBinding inflate = FragmentListSearchBinding.inflate(layoutInflater, viewGroup, false);
        this.f2798W = inflate;
        i.b(inflate);
        LinearLayout root = inflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        this.f2798W = null;
    }
}
