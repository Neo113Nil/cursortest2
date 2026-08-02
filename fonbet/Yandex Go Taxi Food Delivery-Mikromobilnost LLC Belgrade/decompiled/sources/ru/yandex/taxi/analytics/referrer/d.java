package ru.yandex.taxi.analytics.referrer;

import defpackage.exc0;
import defpackage.mdh;
import defpackage.noi0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vw60;
import defpackage.y2w;

/* loaded from: classes9.dex */
public final class d implements vw60 {
    public final noi0 a;
    public final exc0 b;
    public final y2w c;
    public final tse d;
    public final tt2 e;

    public d(noi0 noi0Var, exc0 exc0Var, y2w y2wVar, tse tseVar, tt2 tt2Var) {
        this.a = noi0Var;
        this.b = exc0Var;
        this.c = y2wVar;
        this.d = tseVar;
        this.e = tt2Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(this.d, mdh.b, null, new InstallReferrerOnActivityCreateListener$onActivityCreate$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "InstallReferrerOnActivityCreateListener";
    }
}
