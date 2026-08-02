package com.yandex.passport.internal.ui.common;

import android.widget.LinearLayout;
import com.yandex.passport.R;
import defpackage.cs1;
import defpackage.fft;
import defpackage.t13;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class d extends t13 {
    public final b l;
    public com.yandex.passport.internal.interaction.c m;

    public d(b bVar) {
        bVar.getClass();
        this.l = bVar;
    }

    @Override // defpackage.orq
    public final void j() {
        LinearLayout linearLayout = (LinearLayout) this.l.e();
        this.m = new com.yandex.passport.internal.interaction.c(6, linearLayout, this);
        linearLayout.setVisibility(8);
        linearLayout.setBackgroundResource(R.color.passport_transparent);
        super.j();
    }

    @Override // defpackage.orq
    public final void k() {
        ((LinearLayout) this.l.e()).removeCallbacks(this.m);
        super.k();
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        ((LinearLayout) this.l.e()).postDelayed(this.m, 1000L);
        return Unit.a;
    }
}
