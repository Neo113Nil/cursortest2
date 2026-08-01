package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentListBinding {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentListBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
    }

    public static FragmentListBinding bind(View view) {
        RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.recyclerView);
        if (recyclerView != null) {
            return new FragmentListBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recyclerView)));
    }

    public static FragmentListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_list, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
