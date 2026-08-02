package ru.yandex.taxi.layers.presentation.mapnotification;

import android.content.Context;
import defpackage.p0u;
import defpackage.pzt0;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class d {
    public final Context a;
    public final tse b;
    public final tj60 c;
    public final c d;
    public pzt0 e;

    public d(Context context, tse tseVar, tj60 tj60Var, c cVar) {
        this.a = context;
        this.b = tseVar;
        this.c = tj60Var;
        this.d = cVar;
    }

    public final void a() {
        c cVar = this.d;
        tpr C = kotlinx.coroutines.flow.e.C(new m0(new b(cVar.c.b, cVar), kotlinx.coroutines.flow.e.r(cVar.d.a, new p0u(23)), new MapNotificationInteractor$listenMapNotificationEventsFlow$1(3, null)), new MapNotificationInteractor$listenMapNotificationEventsFlow$$inlined$flatMapMerge$1(null, cVar));
        cVar.a.getClass();
        this.e = tje.N(this.b, null, null, new MapNotificationPresenter$attach$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(C, uyj.a), null, this), 3);
    }
}
