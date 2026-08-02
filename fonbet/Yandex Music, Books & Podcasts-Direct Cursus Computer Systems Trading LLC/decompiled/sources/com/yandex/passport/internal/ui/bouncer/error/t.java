package com.yandex.passport.internal.ui.bouncer.error;

import android.widget.Button;
import com.yandex.passport.R;
import defpackage.cs1;
import defpackage.fft;
import defpackage.ldg;
import defpackage.qs;
import defpackage.t13;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class t extends t13 {
    public final q l;
    public final com.yandex.passport.internal.ui.bouncer.s m;

    public t(q qVar, com.yandex.passport.internal.ui.bouncer.s sVar) {
        qVar.getClass();
        sVar.getClass();
        this.l = qVar;
        this.m = sVar;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        q qVar = this.l;
        ldg.L(qVar.e.f, R.string.passport_error_login_not_available);
        Button button = qVar.e.g;
        ldg.L(button, R.string.passport_am_choose_another_account);
        ldg.B(button, new qs(this, null, 15));
        return Unit.a;
    }
}
