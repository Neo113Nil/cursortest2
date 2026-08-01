package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentListSearchBinding {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextInputEditText searchEdit;
    public final TextInputLayout searchLayout;

    private FragmentListSearchBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.searchEdit = textInputEditText;
        this.searchLayout = textInputLayout;
    }

    public static FragmentListSearchBinding bind(View view) {
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.searchEdit;
            TextInputEditText textInputEditText = (TextInputEditText) f.k(view, R.id.searchEdit);
            if (textInputEditText != null) {
                i = R.id.searchLayout;
                TextInputLayout textInputLayout = (TextInputLayout) f.k(view, R.id.searchLayout);
                if (textInputLayout != null) {
                    return new FragmentListSearchBinding((LinearLayout) view, recyclerView, textInputEditText, textInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentListSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentListSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_list_search, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
