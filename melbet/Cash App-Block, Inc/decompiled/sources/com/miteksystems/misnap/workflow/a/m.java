package com.miteksystems.misnap.workflow.a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes4.dex */
public final class m implements ViewBinding {
    public final ConstraintLayout a;
    public final MaterialTextView f;
    public final RecyclerView g;

    public m(ConstraintLayout constraintLayout, MaterialTextView materialTextView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.f = materialTextView;
        this.g = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
