package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.widget.ImageView;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import defpackage.cs1;
import defpackage.fft;
import defpackage.ldg;
import defpackage.qs;
import defpackage.t13;
import defpackage.wft;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class t extends t13 {
    public final x l;
    public final com.yandex.passport.internal.ui.bouncer.s m;
    public final d0 n;
    public final f0 o;
    public final f p;
    public final com.yandex.passport.internal.properties.x q;

    public t(x xVar, com.yandex.passport.internal.ui.bouncer.s sVar, d0 d0Var, f0 f0Var, f fVar, com.yandex.passport.internal.properties.x xVar2) {
        xVar.getClass();
        sVar.getClass();
        d0Var.getClass();
        f0Var.getClass();
        fVar.getClass();
        xVar2.getClass();
        this.l = xVar;
        this.m = sVar;
        this.n = d0Var;
        this.o = f0Var;
        this.p = fVar;
        this.q = xVar2;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        wft wftVar;
        com.yandex.passport.internal.properties.a aVar = ((r1) obj).a.p.m;
        com.yandex.passport.api.d dVar = aVar.b;
        if (dVar instanceof com.yandex.passport.api.b) {
            f fVar = this.p;
            fVar.e(dVar);
            wftVar = fVar;
        } else {
            wftVar = this.q.x ? this.n : this.o;
        }
        x xVar = this.l;
        xVar.f.a(wftVar);
        ImageView imageView = xVar.e;
        imageView.setVisibility(aVar.c ? 0 : 8);
        ldg.B(imageView, new qs(this, null, 18));
        return Unit.a;
    }
}
