package ru.yandex.logistics.sdk.cargo_form.core.impl.interactor;

import defpackage.b6s;
import defpackage.j6s;
import defpackage.r6s;
import defpackage.tje;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes5.dex */
public final class c {
    public final e a;
    public final r6s b;
    public final f c;
    public final b6s d;

    public c(e eVar, r6s r6sVar, f fVar, b6s b6sVar) {
        this.a = eVar;
        this.b = r6sVar;
        this.c = fVar;
        this.d = b6sVar;
    }

    public final void a(j6s j6sVar, String str) {
        tje.N(this.d, null, null, new FormStateDataStoreInteractor$saveStateToDataStore$1(this, str, j6sVar, null), 3);
    }
}
