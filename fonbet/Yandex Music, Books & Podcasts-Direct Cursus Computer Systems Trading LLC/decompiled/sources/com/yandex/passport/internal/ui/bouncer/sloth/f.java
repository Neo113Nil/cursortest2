package com.yandex.passport.internal.ui.bouncer.sloth;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.sloth.ui.t0;
import defpackage.orq;
import defpackage.r13;
import defpackage.wn5;

/* loaded from: classes4.dex */
public final class f extends orq implements r13 {
    public final boolean k;
    public final b l;
    public final ComposeView m;

    public f(Activity activity, boolean z, b bVar) {
        activity.getClass();
        bVar.getClass();
        this.k = z;
        this.l = bVar;
        this.m = new ComposeView(activity, null, 0, 6, null);
    }

    @Override // defpackage.r13
    public final void e(Object obj) {
        t0 t0Var = (t0) obj;
        t0Var.getClass();
        this.m.setContent(new wn5(new e(this, t0Var, 0), 85521244, true));
    }

    @Override // defpackage.orq
    public final View h() {
        return this.m;
    }
}
