package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import defpackage.bvf0;
import defpackage.k5c;
import defpackage.p6s;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a {
    public final p6s a;
    public final r0 b = bvf0.c(kotlin.collections.b.f());

    public a(p6s p6sVar) {
        this.a = p6sVar;
    }

    public final void a(k5c k5cVar) {
        tje.N(k5cVar, null, null, new DebouncedUserStateUpdater$attach$1(this, null), 3);
    }
}
