package ru.yandex.logistics.cargo_form.async.impl.data;

import defpackage.h3y;
import defpackage.xci;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes9.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar) {
        super(new xci(1), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(String str, Object obj, Object obj2, Continuation continuation) {
        return a(new FormAsyncRequestInteractorImpl$startAsync$2(this, UUID.randomUUID().toString(), str, obj, obj2, null), continuation);
    }
}
