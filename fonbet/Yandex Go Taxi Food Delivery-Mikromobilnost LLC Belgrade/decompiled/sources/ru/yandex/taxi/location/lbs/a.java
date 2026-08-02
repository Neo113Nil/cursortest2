package ru.yandex.taxi.location.lbs;

import androidx.lifecycle.Lifecycle;
import defpackage.a2f0;
import defpackage.h3y;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class a implements a2f0 {
    public final h3y a;
    public final tse b;
    public final Lifecycle c;

    public a(h3y h3yVar, tse tseVar, Lifecycle lifecycle) {
        this.a = h3yVar;
        this.b = tseVar;
        this.c = lifecycle;
    }

    @Override // defpackage.a2f0
    public final void c() {
        tje.N(this.b, null, null, new LbsActivityPollingStarter$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LbsPollingStarter";
    }
}
