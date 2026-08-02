package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.widget.ImageView;
import defpackage.cs1;
import defpackage.fft;
import defpackage.t13;
import defpackage.vrq;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class f extends t13 {
    public final vrq l;

    public f(Activity activity) {
        activity.getClass();
        this.l = new vrq(activity, 2);
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        ((ImageView) this.l.e()).setImageDrawable(com.yandex.passport.common.resources.c.a(com.yandex.plus.pay.ui.core.b.u(), ((com.yandex.passport.api.b) obj).a));
        return Unit.a;
    }
}
