package com.yandex.passport.internal.ui.bouncer.error;

import android.widget.TextView;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import defpackage.cs1;
import defpackage.fft;
import defpackage.ldg;
import defpackage.t13;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b extends t13 {
    public final q l;
    public final com.yandex.passport.internal.ui.bouncer.s m;
    public final com.yandex.passport.common.common.a n;
    public final com.yandex.passport.common.analytics.f o;
    public final com.yandex.passport.internal.clipboard.a p;
    public final x q;

    public b(q qVar, com.yandex.passport.internal.ui.bouncer.s sVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.clipboard.a aVar2, x xVar) {
        qVar.getClass();
        sVar.getClass();
        aVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        xVar.getClass();
        this.l = qVar;
        this.m = sVar;
        this.n = aVar;
        this.o = fVar;
        this.p = aVar2;
        this.q = xVar;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        o1 o1Var = (o1) obj;
        q qVar = this.l;
        ldg.B(qVar.e.g, new a(this, null, 0));
        k kVar = qVar.d;
        kVar.g.setText(!this.q.x ? ((com.yandex.passport.internal.common.d) this.n).a() : "");
        TextView textView = kVar.i;
        String str = this.o.b().a;
        textView.setText(str != null ? str : "");
        kVar.h.setText("Error(" + o1Var.a + ", " + o1Var.b + ')');
        kVar.f.setText(new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString());
        ldg.B(qVar.g, new a(this, null, 1));
        return Unit.a;
    }
}
