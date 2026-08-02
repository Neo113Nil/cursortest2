package ru.yandex.taxi.logistics.sdk;

import androidx.lifecycle.Lifecycle;
import defpackage.bvf0;
import defpackage.gkz;
import defpackage.jy60;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class l implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final gkz c;
    public final tj60 d;

    public l(tse tseVar, Lifecycle lifecycle, gkz gkzVar, tj60 tj60Var) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = gkzVar;
        this.d = tj60Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LogisticsNotificationManagerDelegate";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1(bvf0.m(), this, null), 3);
    }
}
