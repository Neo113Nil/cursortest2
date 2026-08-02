package ru.yandex.video.m3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ny61;
import defpackage.zo31;
import ru.yandex.video.m3.R;

/* loaded from: classes7.dex */
public final class GraphViewBinding implements zo31 {
    private final FrameLayout rootView;

    private GraphViewBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static GraphViewBinding bind(View view) {
        if (view != null) {
            return new GraphViewBinding((FrameLayout) view);
        }
        ny61.t("rootView");
        return null;
    }

    public static GraphViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.graph_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.zo31
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GraphViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
