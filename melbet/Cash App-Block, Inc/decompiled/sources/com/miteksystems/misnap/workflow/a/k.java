package com.miteksystems.misnap.workflow.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes4.dex */
public final class k implements ViewBinding {
    public final LinearLayout a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final MaterialButton e;

    public k(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4) {
        this.a = linearLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = materialButton4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
