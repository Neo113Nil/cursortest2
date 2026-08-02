package ru.yandex.logistics.cargo_form.async.impl.polling;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.pu2;
import defpackage.st2;
import defpackage.tje;

/* loaded from: classes9.dex */
public final class b implements pu2 {
    public final ru.yandex.logistics.cargo_form.async.impl.storage.b a;
    public final ru.yandex.logistics.cargo_form.async.impl.interactor.b b;
    public final ike c;

    public b(ru.yandex.logistics.cargo_form.async.impl.storage.b bVar, ru.yandex.logistics.cargo_form.async.impl.interactor.b bVar2, st2 st2Var) {
        this.a = bVar;
        this.b = bVar2;
        this.c = bvf0.a(st2Var.b);
    }

    @Override // defpackage.pu2
    public final void a(boolean z) {
        if (z) {
            tje.N(this.c, null, null, new FormStatusPollingListenerImpl$onAppResumed$1(this, null), 3);
        }
    }
}
