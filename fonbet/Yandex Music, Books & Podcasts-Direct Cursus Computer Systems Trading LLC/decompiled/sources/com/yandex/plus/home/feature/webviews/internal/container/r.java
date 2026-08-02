package com.yandex.plus.home.feature.webviews.internal.container;

import android.view.View;
import android.view.ViewGroup;
import defpackage.jj4;
import defpackage.xdr;
import defpackage.zne;

/* loaded from: classes5.dex */
public final class r implements com.yandex.plus.core.insets.g {
    public final /* synthetic */ t a;

    public r(t tVar) {
        this.a = tVar;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        zneVar.getClass();
        t tVar = this.a;
        xdr xdrVar = tVar.J;
        xdrVar.getClass();
        xdrVar.m(null, zneVar);
        View view = tVar.L;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = zneVar.d;
        view.setLayoutParams(marginLayoutParams);
    }
}
