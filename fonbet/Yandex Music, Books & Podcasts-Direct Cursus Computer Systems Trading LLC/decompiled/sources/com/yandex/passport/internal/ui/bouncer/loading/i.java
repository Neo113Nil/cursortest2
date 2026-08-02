package com.yandex.passport.internal.ui.bouncer.loading;

import android.view.View;
import android.widget.TextView;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.sloth.n;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.s;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.gld;
import defpackage.t13;
import defpackage.x97;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i extends t13 {
    public final l l;
    public final s m;
    public final n n;

    public i(l lVar, s sVar, n nVar) {
        lVar.getClass();
        sVar.getClass();
        nVar.getClass();
        this.l = lVar;
        this.m = sVar;
        this.n = nVar;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        t1 t1Var = (t1) obj;
        l lVar = this.l;
        View view = lVar.e;
        if (view.getVisibility() == 0) {
            view.setAlpha(0.0f);
            com.yandex.plus.pay.ui.core.b.i(view);
        }
        TextView textView = lVar.g;
        if (textView.getVisibility() == 0) {
            textView.setAlpha(0.0f);
            textView.setPadding(0, (int) (17 * g4i.a.density), 0, 0);
            com.yandex.plus.pay.ui.core.b.i(textView);
        }
        Continuation continuation = null;
        x97.y(gld.e(cs1Var.getContext()), null, null, new we(zsd.b0(t1Var.b.a), continuation, this, t1Var, 5), 3);
        x97.y(gld.e(cs1Var.getContext()), null, null, new com.yandex.passport.internal.provider.communication.c(this.n.a, continuation, this, 14), 3);
        return Unit.a;
    }
}
