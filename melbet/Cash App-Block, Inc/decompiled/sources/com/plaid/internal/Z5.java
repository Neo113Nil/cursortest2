package com.plaid.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: classes5.dex */
public final class Z5 implements ViewBinding {
    public final FrameLayout a;
    public final FrameLayout b;

    public Z5(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
