package com.yandex.plus.bdui.flex.ui.scaffold;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.tro;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class a extends tro {
    public FrameLayout b;

    @Override // defpackage.p9
    public final void A(View view) {
        view.getClass();
        this.b = null;
    }

    @Override // defpackage.p9
    public final void B(Object obj) {
    }

    @Override // defpackage.tro
    public final ViewGroup G(View view) {
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            return frameLayout;
        }
        xq0.x("Failed requirement.");
        return null;
    }

    @Override // defpackage.p9
    public final View z(ViewGroup viewGroup) {
        viewGroup.getClass();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b = frameLayout;
        return frameLayout;
    }
}
