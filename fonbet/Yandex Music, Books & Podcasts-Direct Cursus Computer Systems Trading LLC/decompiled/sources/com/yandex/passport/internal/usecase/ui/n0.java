package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.network.ea;
import com.yandex.passport.data.network.wa;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class n0 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;

    public /* synthetic */ n0(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new m0((com.yandex.passport.common.coroutine.a) this.b.get(), (ea) this.c.get(), (com.yandex.passport.internal.network.mappers.b) this.d.get(), (com.yandex.passport.data.mapper.a) this.e.get());
            case 1:
                return new a1((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.network.r) this.c.get(), (com.yandex.passport.internal.usecase.e0) this.d.get(), (com.yandex.passport.common.ui.lang.b) this.e.get());
            default:
                return new d1((com.yandex.passport.common.coroutine.a) this.b.get(), (wa) this.c.get(), (com.yandex.passport.common.common.a) this.d.get(), (com.yandex.passport.internal.network.mappers.b) this.e.get());
        }
    }
}
