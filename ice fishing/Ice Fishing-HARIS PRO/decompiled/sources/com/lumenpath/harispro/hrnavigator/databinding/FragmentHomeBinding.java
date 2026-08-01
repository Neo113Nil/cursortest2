package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class FragmentHomeBinding {
    public final ViewSectionHeaderBinding actionsHeader;
    public final RecyclerView actionsRecycler;
    public final ViewSectionHeaderBinding benchmarksHeader;
    public final RecyclerView benchmarksRecycler;
    public final ViewSectionHeaderBinding directionsHeader;
    public final RecyclerView directionsRecycler;
    public final MaterialButton nextTipButton;
    private final ScrollView rootView;
    public final ViewSectionHeaderBinding tipHeader;
    public final TextView tipText;

    private FragmentHomeBinding(ScrollView scrollView, ViewSectionHeaderBinding viewSectionHeaderBinding, RecyclerView recyclerView, ViewSectionHeaderBinding viewSectionHeaderBinding2, RecyclerView recyclerView2, ViewSectionHeaderBinding viewSectionHeaderBinding3, RecyclerView recyclerView3, MaterialButton materialButton, ViewSectionHeaderBinding viewSectionHeaderBinding4, TextView textView) {
        this.rootView = scrollView;
        this.actionsHeader = viewSectionHeaderBinding;
        this.actionsRecycler = recyclerView;
        this.benchmarksHeader = viewSectionHeaderBinding2;
        this.benchmarksRecycler = recyclerView2;
        this.directionsHeader = viewSectionHeaderBinding3;
        this.directionsRecycler = recyclerView3;
        this.nextTipButton = materialButton;
        this.tipHeader = viewSectionHeaderBinding4;
        this.tipText = textView;
    }

    public static FragmentHomeBinding bind(View view) {
        int i = R.id.actionsHeader;
        View k2 = f.k(view, R.id.actionsHeader);
        if (k2 != null) {
            ViewSectionHeaderBinding bind = ViewSectionHeaderBinding.bind(k2);
            i = R.id.actionsRecycler;
            RecyclerView recyclerView = (RecyclerView) f.k(view, R.id.actionsRecycler);
            if (recyclerView != null) {
                i = R.id.benchmarksHeader;
                View k3 = f.k(view, R.id.benchmarksHeader);
                if (k3 != null) {
                    ViewSectionHeaderBinding bind2 = ViewSectionHeaderBinding.bind(k3);
                    i = R.id.benchmarksRecycler;
                    RecyclerView recyclerView2 = (RecyclerView) f.k(view, R.id.benchmarksRecycler);
                    if (recyclerView2 != null) {
                        i = R.id.directionsHeader;
                        View k4 = f.k(view, R.id.directionsHeader);
                        if (k4 != null) {
                            ViewSectionHeaderBinding bind3 = ViewSectionHeaderBinding.bind(k4);
                            i = R.id.directionsRecycler;
                            RecyclerView recyclerView3 = (RecyclerView) f.k(view, R.id.directionsRecycler);
                            if (recyclerView3 != null) {
                                i = R.id.nextTipButton;
                                MaterialButton materialButton = (MaterialButton) f.k(view, R.id.nextTipButton);
                                if (materialButton != null) {
                                    i = R.id.tipHeader;
                                    View k5 = f.k(view, R.id.tipHeader);
                                    if (k5 != null) {
                                        ViewSectionHeaderBinding bind4 = ViewSectionHeaderBinding.bind(k5);
                                        i = R.id.tipText;
                                        TextView textView = (TextView) f.k(view, R.id.tipText);
                                        if (textView != null) {
                                            return new FragmentHomeBinding((ScrollView) view, bind, recyclerView, bind2, recyclerView2, bind3, recyclerView3, materialButton, bind4, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
