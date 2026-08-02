package ru.yandex.taxi.masstransit.router;

import defpackage.b2w;
import defpackage.fp30;
import defpackage.h140;
import defpackage.j140;
import defpackage.sy60;

/* loaded from: classes6.dex */
public final class g implements sy60 {
    public final /* synthetic */ fp30 a;
    public final /* synthetic */ j140 b;

    public g(fp30 fp30Var, j140 j140Var) {
        this.a = fp30Var;
        this.b = j140Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.P(this.b.a);
    }

    public final void n1() {
        b2w b2wVar = this.a.G;
        if (b2wVar != null) {
            b2wVar.a.l(new h140(this.b, new MtModeRouter$launchStopRouteModal$1$openErrorModal$1(0, this, g.class, "onExitCalledInside", "onExitCalledInside()V", 0)));
        }
    }
}
