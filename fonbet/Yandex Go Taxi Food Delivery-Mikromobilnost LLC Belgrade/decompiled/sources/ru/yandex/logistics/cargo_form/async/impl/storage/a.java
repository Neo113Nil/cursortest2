package ru.yandex.logistics.cargo_form.async.impl.storage;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.st2;
import defpackage.tje;
import defpackage.wi3;

/* loaded from: classes9.dex */
public final class a implements wi3 {
    public final b a;
    public final ike b;

    public a(b bVar, st2 st2Var) {
        this.a = bVar;
        this.b = bvf0.a(st2Var.b);
    }

    @Override // defpackage.wi3
    public final void a() {
        tje.N(this.b, null, null, new FormActiveTasksClearListener$onUnauthorized$1(this, null), 3);
    }
}
