package ru.yandex.taxi.scooters.presentation.notification;

import defpackage.iin0;
import defpackage.mu5;
import defpackage.okv;
import defpackage.pkv;
import defpackage.qkv;
import defpackage.tje;
import defpackage.wfd;
import defpackage.zuj0;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class a extends qkv {
    public final okv F;
    public final zuj0 G;
    public final mu5 H;

    public a(okv okvVar, zuj0 zuj0Var) {
        super(0);
        this.F = okvVar;
        this.G = zuj0Var;
        this.H = new mu5(new iin0(27, this));
    }

    @Override // defpackage.qkv, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        tje.N(o(), null, null, new ScootersRouteChangedNotificationRouter$onAttach$1(this, null), 3);
    }

    @Override // defpackage.qkv
    public final wfd P() {
        return this.H;
    }

    @Override // defpackage.qkv
    public final okv Q() {
        return this.F;
    }

    @Override // defpackage.qkv
    public final pkv R(Object obj) {
        return new pkv("scooters_route_changed_notification", false, 14);
    }
}
