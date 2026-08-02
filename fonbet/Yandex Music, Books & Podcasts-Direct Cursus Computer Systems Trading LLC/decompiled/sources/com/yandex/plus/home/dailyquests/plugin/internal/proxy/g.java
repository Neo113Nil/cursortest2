package com.yandex.plus.home.dailyquests.plugin.internal.proxy;

import android.widget.FrameLayout;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.t;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.r;
import defpackage.rjf;
import defpackage.x0q;
import defpackage.xdr;

/* loaded from: classes5.dex */
public final class g {
    public final rjf a;
    public final FrameLayout b;
    public final com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b c;
    public final t d;

    public g(r rVar, rjf rjfVar) {
        this.a = rjfVar;
        s sVar = (s) rjfVar.i;
        FrameLayout frameLayout = (FrameLayout) sVar.b;
        this.b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        this.c = new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(1, new com.yandex.passport.common.mvi.d((xdr) sVar.d, (h) rjfVar.h, 13));
        this.d = new t((x0q) rjfVar.m, 27);
    }
}
