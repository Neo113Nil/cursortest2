package com.yandex.plus.plaquesdk.plaque.adapter;

import android.view.View;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.qb;
import defpackage.vb;

/* loaded from: classes5.dex */
public final class i extends androidx.core.view.a {
    public final /* synthetic */ x d;
    public final /* synthetic */ j e;

    public i(x xVar, j jVar) {
        this.d = xVar;
        this.e = jVar;
    }

    @Override // androidx.core.view.a
    public final void d(View view, vb vbVar) {
        view.getClass();
        this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
        x xVar = this.d;
        if (xVar.q() == null) {
            vbVar.n(this.e.d().getAccessibilityClassName());
        } else {
            vbVar.n(c.class.getName());
            vbVar.b(new qb(16, xVar.getContentDescription().c));
        }
    }
}
