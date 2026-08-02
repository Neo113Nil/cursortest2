package ru.yandex.logistics.sdk.cargo_form.core.impl.interactor;

import defpackage.b6s;
import defpackage.i4s;
import defpackage.o5s;
import defpackage.tje;

/* loaded from: classes5.dex */
public final class b {
    public final b6s a;
    public final i4s b;
    public final o5s c;

    public b(b6s b6sVar, i4s i4sVar, o5s o5sVar) {
        this.a = b6sVar;
        this.b = i4sVar;
        this.c = o5sVar;
    }

    public final void a() {
        tje.N(this.a, null, null, new FormSetDefaultStateInteractorImpl$start$1(this, null), 3);
    }
}
