package com.yandex.plus.home.plaque.feature.internal;

import com.yandex.plus.home.plaque.feature.internal.presentation.h;
import defpackage.ce5;
import defpackage.jyr;
import defpackage.v3w;

/* loaded from: classes5.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ ce5 a;

    public /* synthetic */ b(ce5 ce5Var) {
        this.a = ce5Var;
    }

    public final void a(boolean z) {
        h hVar = (h) ((jyr) this.a.a).getValue();
        com.yandex.plus.log.api.b bVar = hVar.g;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlaqueViewModel", "onAttachStateChanged(" + z + ')');
        }
        v3w.n(z, hVar.m, null);
    }
}
