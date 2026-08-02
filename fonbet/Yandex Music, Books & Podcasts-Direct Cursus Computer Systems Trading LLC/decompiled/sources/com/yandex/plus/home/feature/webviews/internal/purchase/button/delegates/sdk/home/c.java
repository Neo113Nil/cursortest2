package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.home.auth.f;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.h0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.j0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s0;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.pay.adapter.api.j;
import defpackage.ezc;
import defpackage.mm6;
import defpackage.x97;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class c {
    public final mm6 a;
    public final com.yandex.plus.acquisition.sdk.common.api.di.b b;
    public final m c;
    public final f d;
    public final boolean e;
    public final ezc f;
    public final Function0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(mm6 mm6Var, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, m mVar, f fVar, boolean z, Function1 function1, com.yandex.plus.home.analytics.evgen.c cVar) {
        fVar.getClass();
        this.a = mm6Var;
        this.b = bVar;
        this.c = mVar;
        this.d = fVar;
        this.e = z;
        this.f = (ezc) function1;
        this.g = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ezc, kotlin.jvm.functions.Function1] */
    public final void a(String str, a0 a0Var, j jVar) {
        str.getClass();
        ?? r0 = (ezc) this.b.g;
        j0 j0Var = k0.Companion;
        h0 h0Var = i0.Companion;
        r0.invoke(new s0(str));
        x97.y(this.a, null, null, new b(this, str, a0Var, jVar, (Continuation) null, 0), 3);
    }
}
