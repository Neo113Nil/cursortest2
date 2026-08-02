package ru.yandex.taxi.communications.stepsinstructions.presenter;

import android.net.Uri;
import defpackage.abu0;
import defpackage.ad5;
import defpackage.bbu0;
import defpackage.jbu0;
import defpackage.jl40;
import defpackage.kbu0;
import defpackage.l7s0;
import defpackage.rau0;
import defpackage.sau0;
import defpackage.scs0;
import defpackage.sob1;
import defpackage.tau0;
import defpackage.tje;
import defpackage.uau0;
import defpackage.w511;
import defpackage.wsc;
import defpackage.x8t0;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.communications.stepsinstructions.interactor.c;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final c A;
    public final wsc B;
    public final b C;
    public final jbu0 x;
    public final sob1 y;
    public final l7s0 z;

    public a(jbu0 jbu0Var, sob1 sob1Var, l7s0 l7s0Var, c cVar, wsc wscVar, b bVar) {
        super(kbu0.class);
        this.x = jbu0Var;
        this.y = sob1Var;
        this.z = l7s0Var;
        this.A = cVar;
        this.B = wscVar;
        this.C = bVar;
    }

    public final void Kg(bbu0 bbu0Var) {
        Bg(bbu0Var);
        this.B.c(this.y);
        tje.N(Jg(), null, null, new StepsInstructionModalPresenter$attachView$1(this, bbu0Var, null), 3);
        tje.N(Jg(), null, null, new StepsInstructionModalPresenter$attachView$2(this, bbu0Var, null), 3);
    }

    public final void Lg(uau0 uau0Var) {
        sob1 sob1Var = this.y;
        wsc wscVar = this.B;
        if (uau0Var != null) {
            wscVar.a(sob1Var, uau0Var.a());
        }
        wscVar.b(sob1Var, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
        boolean z = uau0Var instanceof rau0;
        l7s0 l7s0Var = this.z;
        if (z) {
            String str = ((rau0) uau0Var).a;
            l7s0Var.getClass();
            Uri parse = Uri.parse(str);
            abu0 abu0Var = (abu0) l7s0Var.a;
            abu0Var.r(new scs0(16, abu0Var, parse));
            return;
        }
        if (jl40.l(uau0Var, sau0.a)) {
            ((abu0) l7s0Var.a).r(new x8t0(10));
        } else if (jl40.l(uau0Var, tau0.a)) {
            ((abu0) l7s0Var.a).r(new x8t0(11));
        } else {
            if (uau0Var == null) {
                return;
            }
            w511.b();
        }
    }
}
