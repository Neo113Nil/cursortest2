package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.sloth.ui.e1;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class k implements com.yandex.passport.sloth.ui.dependencies.q {
    public final Activity a;

    public k(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(e1 e1Var) {
        int ordinal = e1Var.ordinal();
        Activity activity = this.a;
        if (ordinal == 0 || ordinal == 1) {
            activity.finish();
        } else if (ordinal != 2) {
            b6e.s();
        } else {
            activity.setResult(17121);
            activity.finish();
        }
    }
}
