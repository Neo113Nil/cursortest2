package com.yandex.passport.internal.ui.authbytrack;

import com.yandex.passport.R;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.passport.internal.usecase.authorize.l;
import defpackage.xy0;

/* loaded from: classes4.dex */
public final class e extends h {
    public final l q;
    public final q r;
    public final d s;

    public e(l lVar) {
        lVar.getClass();
        this.q = lVar;
        this.r = new q();
        d dVar = new d();
        Integer valueOf = Integer.valueOf(R.string.passport_error_qr_unknown_error);
        xy0 xy0Var = dVar.a;
        xy0Var.put("unknown error", valueOf);
        xy0Var.put("account.invalid_type", Integer.valueOf(R.string.passport_error_qr_2fa_account));
        this.s = dVar;
    }
}
