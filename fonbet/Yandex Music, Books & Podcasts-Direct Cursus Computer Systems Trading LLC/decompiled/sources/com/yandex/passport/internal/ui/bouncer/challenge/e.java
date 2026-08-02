package com.yandex.passport.internal.ui.bouncer.challenge;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.ui.challenge.c0;
import defpackage.orq;
import defpackage.r13;
import defpackage.wn5;

/* loaded from: classes4.dex */
public final class e extends orq implements r13 {
    public final v k;
    public final ComposeView l;

    public e(Activity activity, v vVar) {
        activity.getClass();
        vVar.getClass();
        this.k = vVar;
        this.l = new ComposeView(activity, null, 0, 6, null);
    }

    @Override // defpackage.r13
    public final void e(Object obj) {
        c0 c0Var = (c0) obj;
        c0Var.getClass();
        this.l.setContent(new wn5(new d(c0Var, this, 0), -1168384356, true));
    }

    @Override // defpackage.orq
    public final View h() {
        return this.l;
    }
}
