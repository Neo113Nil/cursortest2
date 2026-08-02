package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes4.dex */
public final class g implements ViewBinding {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final MaterialButton i;
    public final MaterialButton j;
    public final MaterialCheckBox k;

    public g(ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialCheckBox materialCheckBox) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.i = materialButton;
        this.j = materialButton2;
        this.k = materialCheckBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
