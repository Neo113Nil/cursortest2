package com.yandex.passport.internal.push;

import android.content.Context;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class g0 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;
    public final rzm e;

    public /* synthetic */ g0(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, int i) {
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
                return new f0((Context) this.b.get(), (com.yandex.passport.common.common.a) this.c.get(), (com.yandex.passport.common.analytics.f) this.d.get(), (com.yandex.passport.internal.flags.i) this.e.get());
            default:
                return new d1((Context) this.b.get(), (com.yandex.passport.common.coroutine.e) this.c.get(), (com.yandex.passport.common.coroutine.a) this.d.get(), (z) this.e.get());
        }
    }
}
