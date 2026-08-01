package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentCompanyBinding {
    public final RecyclerView faqRecycler;
    public final RecyclerView recyclerView;
    private final ScrollView rootView;

    private FragmentCompanyBinding(ScrollView scrollView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = scrollView;
        this.faqRecycler = recyclerView;
        this.recyclerView = recyclerView2;
    }

    public static FragmentCompanyBinding bind(View view) {
        int i = R.id.faqRecycler;
        RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.faqRecycler);
        if (recyclerView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView2 = (RecyclerView) f.k(view, R.id.recyclerView);
            if (recyclerView2 != null) {
                return new FragmentCompanyBinding((ScrollView) view, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_company, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
