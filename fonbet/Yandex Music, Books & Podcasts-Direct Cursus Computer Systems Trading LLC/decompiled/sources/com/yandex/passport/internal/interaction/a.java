package com.yandex.passport.internal.interaction;

import com.yandex.passport.data.network.cb;
import com.yandex.passport.internal.helper.g;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import defpackage.ezc;
import defpackage.syc;
import defpackage.w4i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class a extends b {
    public final com.yandex.passport.internal.ui.e d;
    public final Object e;
    public final Object f;
    public final syc g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.yandex.passport.internal.network.mappers.b bVar, cb cbVar, com.yandex.passport.internal.ui.e eVar, Function1 function1) {
        bVar.getClass();
        cbVar.getClass();
        eVar.getClass();
        this.e = bVar;
        this.f = cbVar;
        this.d = eVar;
        this.g = (ezc) function1;
    }

    public a(g gVar, com.yandex.passport.internal.ui.e eVar, w4i w4iVar, k kVar) {
        gVar.getClass();
        eVar.getClass();
        this.e = gVar;
        this.d = eVar;
        this.f = w4iVar;
        this.g = kVar;
    }
}
