package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentServicesBinding {
    public final RecyclerView recyclerView;
    private final ScrollView rootView;

    private FragmentServicesBinding(ScrollView scrollView, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.recyclerView = recyclerView;
    }

    public static FragmentServicesBinding bind(View view) {
        RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.recyclerView);
        if (recyclerView != null) {
            return new FragmentServicesBinding((ScrollView) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recyclerView)));
    }

    public static FragmentServicesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_services, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
