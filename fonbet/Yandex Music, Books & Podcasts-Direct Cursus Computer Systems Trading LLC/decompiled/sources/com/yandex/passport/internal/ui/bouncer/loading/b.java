package com.yandex.passport.internal.ui.bouncer.loading;

import android.widget.Button;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.s;
import defpackage.cs1;
import defpackage.ldg;
import defpackage.qs;
import defpackage.t13;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class b extends t13 {
    public final s l;
    public boolean m;

    public b(s sVar) {
        sVar.getClass();
        this.l = sVar;
    }

    @Override // defpackage.t13, defpackage.orq, defpackage.srq
    public final void d() {
        super.d();
        this.m = false;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        q1 q1Var = (q1) obj;
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, this + ".performBind(" + q1Var + ')', 8);
        }
        a q = q();
        e eVar = (e) q;
        Button button = eVar.g;
        boolean z = button.getVisibility() == 0;
        boolean z2 = q1Var.a;
        if (z != z2) {
            button.setVisibility(z2 ? 0 : 8);
            if (button.getVisibility() == 0) {
                button.setAlpha(0.0f);
                com.yandex.plus.pay.ui.core.b.i(eVar.g);
            }
        }
        ldg.B(button, new qs(this, continuation, 16));
        if (this.m) {
            return Unit.a;
        }
        com.yandex.plus.pay.ui.core.b.i(q.getProgress());
        this.m = true;
        return Unit.a;
    }

    public abstract a q();
}
