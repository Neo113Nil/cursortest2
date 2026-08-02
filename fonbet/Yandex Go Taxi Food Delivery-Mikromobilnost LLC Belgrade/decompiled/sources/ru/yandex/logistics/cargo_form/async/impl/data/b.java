package ru.yandex.logistics.cargo_form.async.impl.data;

import defpackage.h3y;
import defpackage.i3s;
import defpackage.y2s;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes9.dex */
public final class b extends c {
    public final h3y i;

    public b(h3y h3yVar, i3s i3sVar) {
        super(new y2s(0, i3sVar), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(Object obj, Continuation continuation) {
        return a(new FormAsyncStatusRequestInteractorImpl$requestStatus$2(this, obj, null), continuation);
    }
}
