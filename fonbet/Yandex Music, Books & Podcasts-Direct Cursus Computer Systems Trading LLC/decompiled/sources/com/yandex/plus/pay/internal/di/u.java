package com.yandex.plus.pay.internal.di;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ie5;

/* loaded from: classes5.dex */
public final class u implements s {
    public final i a;
    public final e b;
    public final ie5 c;
    public final l d;
    public final n e;

    public u(i iVar, e eVar, ie5 ie5Var, l lVar, n nVar, com.yandex.plus.pay.internal.di.external.a aVar) {
        this.a = iVar;
        this.b = eVar;
        this.c = ie5Var;
        this.d = lVar;
        this.e = nVar;
    }

    public final com.yandex.plus.pay.internal.feature.presale.d a() {
        n nVar = this.e;
        return r1.l(((com.yandex.plus.pay.common.internal.featureflags.a) ((com.yandex.plus.pay.common.internal.featureflags.c) nVar.e.invoke())).i) ? (com.yandex.plus.pay.internal.feature.presale.c) nVar.A.getValue() : (com.yandex.plus.pay.internal.feature.presale.k) nVar.B.getValue();
    }
}
