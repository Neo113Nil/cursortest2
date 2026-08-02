package com.yandex.plus.pay.internal.feature.payment.inapp;

import com.yandex.plus.pay.inapp.api.b;
import com.yandex.plus.pay.inapp.api.e;
import com.yandex.plus.pay.inapp.api.f;
import com.yandex.plus.pay.inapp.google.internal.h;
import defpackage.c5b;
import defpackage.cg6;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class a implements b {
    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object a(cg6 cg6Var) {
        return new com.yandex.plus.pay.inapp.api.a("unknown");
    }

    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object b(e eVar, cg6 cg6Var) {
        return c5b.a;
    }

    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object c(List list, e eVar, cg6 cg6Var) {
        return c5b.a;
    }

    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object d(h hVar, com.yandex.plus.pay.inapp.api.h hVar2, cg6 cg6Var) {
        throw new IllegalStateException("purchase() must not be called for stub in app facade");
    }

    @Override // com.yandex.plus.pay.inapp.api.b
    public final Object e(f fVar, cg6 cg6Var) {
        return Unit.a;
    }
}
