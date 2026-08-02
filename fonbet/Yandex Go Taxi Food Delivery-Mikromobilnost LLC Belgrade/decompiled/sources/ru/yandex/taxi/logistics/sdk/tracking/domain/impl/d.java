package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.di9;
import defpackage.fse;
import defpackage.mr;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tse;
import defpackage.x201;
import defpackage.zko;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class d implements x201, tse {
    public final zko a = new zko(Executors.newSingleThreadExecutor());
    public final kotlinx.coroutines.channels.a b;
    public final di9 c;

    public d() {
        kotlinx.coroutines.channels.a a = sb2.a(0, null, null, 7);
        this.b = a;
        this.c = new di9(a);
    }

    @Override // defpackage.x201
    public final void a(mr mrVar) {
        tje.N(this, null, null, new TrackingActionBusImpl$emit$1(this, mrVar, null), 3);
    }

    @Override // defpackage.x201
    public final di9 getActions() {
        return this.c;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a;
    }
}
