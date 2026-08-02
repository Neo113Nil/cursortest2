package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.bvf0;
import defpackage.csb;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.lw;
import defpackage.tje;
import defpackage.yr31;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class e extends yr31 {
    public final csb b;
    public final lw c;
    public final ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.b w;
    public final d x;
    public final r0 y;
    public final gci0 z;

    public e(csb csbVar, lw lwVar, ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.b bVar, d dVar) {
        this.b = csbVar;
        this.c = lwVar;
        this.w = bVar;
        this.x = dVar;
        r0 c = bvf0.c(dVar.e);
        this.y = c;
        this.z = kotlinx.coroutines.flow.e.d(c);
        bVar.b();
        lwVar.start();
        tje.N(ds31.a(this), null, null, new ChooseProfileViewModel$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        bvf0.j(this.w.f, null);
        this.c.stop();
    }
}
