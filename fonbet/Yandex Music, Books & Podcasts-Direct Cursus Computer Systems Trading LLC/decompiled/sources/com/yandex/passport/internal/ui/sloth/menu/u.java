package com.yandex.passport.internal.ui.sloth.menu;

import android.app.Activity;
import com.yandex.passport.sloth.ui.e1;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class u implements com.yandex.passport.sloth.ui.dependencies.q {
    public final Activity a;

    public u(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(e1 e1Var) {
        int ordinal = e1Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.a.finish();
        } else {
            if (ordinal == 2) {
                return;
            }
            b6e.s();
        }
    }
}
