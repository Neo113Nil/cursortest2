package ru.yandex.logistics.cargo_form.async.impl.polling;

import defpackage.rol0;
import defpackage.st2;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes9.dex */
public final class a {
    public final st2 a;
    public final ru.yandex.logistics.cargo_form.async.impl.data.b b;

    public a(st2 st2Var, ru.yandex.logistics.cargo_form.async.impl.data.b bVar) {
        this.a = st2Var;
        this.b = bVar;
    }

    public final tpr a(Object obj) {
        return e.F(new rol0(new FormStatusPollingInteractor$statusFlow$1(this, obj, null)), this.a.b);
    }
}
