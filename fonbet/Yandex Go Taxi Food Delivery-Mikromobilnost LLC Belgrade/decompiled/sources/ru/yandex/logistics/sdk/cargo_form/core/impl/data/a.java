package ru.yandex.logistics.sdk.cargo_form.core.impl.data;

import defpackage.d5s;
import defpackage.gym;
import defpackage.j6s;
import defpackage.v5s;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a {
    public final v5s a;
    public final gym b;

    public a(v5s v5sVar, gym gymVar) {
        this.a = v5sVar;
        this.b = gymVar;
    }

    public final Object a(j6s j6sVar, Continuation continuation) {
        ((d5s) this.b.a).getClass();
        v5s v5sVar = this.a;
        v5sVar.getClass();
        return v5sVar.a(new FormRemoteRequestInteractor$fetchForm$2(v5sVar, j6sVar, null), continuation);
    }
}
