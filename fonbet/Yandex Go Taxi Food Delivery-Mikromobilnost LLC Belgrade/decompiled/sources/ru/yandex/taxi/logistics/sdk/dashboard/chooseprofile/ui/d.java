package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.bc;
import defpackage.flg;
import defpackage.g2q0;
import defpackage.ha2;
import defpackage.hwy0;
import defpackage.lw;
import defpackage.qkg;
import defpackage.sls0;
import defpackage.trb;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class d {
    public final trb a;
    public final bc b;
    public final ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.a c;
    public final lw d;
    public final qkg e = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new sls0(0)), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
    public final ha2 f;

    public d(trb trbVar, hwy0 hwy0Var, flg flgVar, bc bcVar, ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a aVar, ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.a aVar2, lw lwVar) {
        this.a = trbVar;
        this.b = bcVar;
        this.c = aVar2;
        this.d = lwVar;
        this.f = kotlinx.coroutines.flow.e.m(trbVar.c, hwy0Var.b, aVar.b, flgVar.a, new ChooseProfileStateProvider$dashboardStateFlow$1(this, null));
    }
}
