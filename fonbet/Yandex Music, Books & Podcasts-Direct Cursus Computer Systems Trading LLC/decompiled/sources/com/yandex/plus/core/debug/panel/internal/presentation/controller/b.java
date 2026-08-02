package com.yandex.plus.core.debug.panel.internal.presentation.controller;

import android.content.Context;
import android.view.View;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.social.i;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.core.debug.panel.internal.presentation.view.d;
import defpackage.a4g;
import defpackage.gld;
import defpackage.tf6;
import defpackage.x97;
import defpackage.zne;

/* loaded from: classes4.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final s a;
    public final d b;
    public final tf6 c;

    public b(Context context, s sVar, zne zneVar, kotlinx.coroutines.a aVar, h hVar) {
        zneVar.getClass();
        aVar.getClass();
        this.a = sVar;
        int i = 0;
        a aVar2 = new a(1, this, b.class, "onAdditionalDataClicked", "onAdditionalDataClicked(Ljava/lang/String;)V", i, 0);
        w wVar = new w(0, this, b.class, "onCloseButonClicked", "onCloseButonClicked()V", i, 18);
        a aVar3 = new a(1, this, b.class, "onBackButtonClicked", "onBackButtonClicked(Z)V", i, 1);
        int i2 = 0;
        d dVar = new d(context, zneVar, hVar, aVar2, new w(i2, this, b.class, "onLogsClicked", "onLogsClicked()V", i, 19), new w(i2, this, b.class, "onClearLogsClicked", "onClearLogsClicked()V", i, 20), wVar, aVar3);
        this.b = dVar;
        this.c = gld.e(aVar.plus(a4g.n()));
        dVar.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        x97.y(this.c, null, null, new i(this, null, 8), 3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        com.yandex.plus.bdui.plus.analytics.b.d(this.c);
    }
}
