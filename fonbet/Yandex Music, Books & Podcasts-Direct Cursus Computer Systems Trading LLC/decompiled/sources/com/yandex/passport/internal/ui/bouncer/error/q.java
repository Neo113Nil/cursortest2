package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.ldg;
import defpackage.q96;
import defpackage.y86;

/* loaded from: classes4.dex */
public final class q extends y86 {
    public final k d;
    public final p e;
    public final LinearLayout f;
    public final ConstraintLayout g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Activity activity, k kVar, p pVar) {
        super(activity);
        activity.getClass();
        kVar.getClass();
        pVar.getClass();
        this.d = kVar;
        this.e = pVar;
        ezf.a0(this.a, 0).getClass();
        View e = pVar.e();
        j(e);
        this.f = (LinearLayout) e;
        ezf.a0(this.a, 0).getClass();
        ConstraintLayout e2 = kVar.e();
        j(e2);
        this.g = e2;
    }

    @Override // defpackage.y86
    public final void a(q96 q96Var) {
        q96Var.getClass();
        q96Var.w(this.g, new c(1, q96Var));
        q96Var.w(this.f, new com.yandex.passport.internal.ui.bouncer.o(1, q96Var, this));
    }

    @Override // defpackage.y86
    public final void d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        ldg.H(R.color.passport_error_slab_background, constraintLayout);
        int i = (int) (20 * g4i.a.density);
        constraintLayout.setPadding(i, constraintLayout.getPaddingTop(), i, constraintLayout.getPaddingBottom());
        constraintLayout.setId(R.id.passport_zero_page);
    }
}
