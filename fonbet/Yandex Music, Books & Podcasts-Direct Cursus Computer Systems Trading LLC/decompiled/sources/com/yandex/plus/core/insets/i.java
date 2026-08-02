package com.yandex.plus.core.insets;

import android.view.View;
import android.view.ViewGroup;
import defpackage.jj4;
import defpackage.zne;

/* loaded from: classes4.dex */
public final class i implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zne c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public i(View view, int i, zne zneVar, int i2, int i3, int i4) {
        this.a = view;
        this.b = i;
        this.c = zneVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        zne zneVar = this.c;
        marginLayoutParams.setMargins(this.b + zneVar.a, this.d + zneVar.b, this.e + zneVar.c, this.f + zneVar.d);
        view2.setLayoutParams(marginLayoutParams);
    }
}
