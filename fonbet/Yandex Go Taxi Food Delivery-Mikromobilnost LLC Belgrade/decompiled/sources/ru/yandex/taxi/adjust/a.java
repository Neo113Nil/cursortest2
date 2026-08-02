package ru.yandex.taxi.adjust;

import androidx.lifecycle.Lifecycle;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;
import ru.yandex.taxi.credentials.e;

/* loaded from: classes9.dex */
public final class a implements vw60 {
    public final e a;
    public final tse b;
    public final Lifecycle c;

    public a(e eVar, tse tseVar, Lifecycle lifecycle) {
        this.a = eVar;
        this.b = tseVar;
        this.c = lifecycle;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.b, null, null, new ExternalServiceAdjustLifecycleInteractor$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ExternalServiceAdjustLifecycleInteractor";
    }
}
