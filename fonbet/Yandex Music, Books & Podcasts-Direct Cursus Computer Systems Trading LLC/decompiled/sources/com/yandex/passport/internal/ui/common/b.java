package com.yandex.passport.internal.ui.common;

import android.app.Activity;
import android.view.View;
import com.yandex.passport.R;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.s2;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.ui.bouncer.o;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class b extends b6 {
    public final v d;
    public final View e;
    public final s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, v vVar, x xVar) {
        super(activity, 10);
        activity.getClass();
        xVar.getClass();
        vVar.getClass();
        this.d = vVar;
        this.e = com.yandex.passport.common.ui.e.b(this, activity, vVar, xVar.x, 1.0f, 16);
        this.f = vVar.b.v();
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(1);
        o2 o2Var = this.d.c;
        if (o2Var instanceof m2) {
            c7gVar.setBackgroundResource(((m2) o2Var).a);
        } else {
            ldg.H(R.color.passport_roundabout_background, c7gVar);
        }
        c7gVar.setGravity(17);
        c7gVar.b(this.e, new o(11, c7gVar, this));
        return c7gVar;
    }
}
