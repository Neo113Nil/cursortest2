package com.yandex.passport.sloth.command.performers;

import defpackage.rzm;

/* loaded from: classes4.dex */
public final class y implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public /* synthetic */ y(rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new x((com.yandex.passport.sloth.v) this.b.get());
            case 1:
                return new c0((com.yandex.passport.sloth.v) this.b.get());
            default:
                return new g0((com.yandex.passport.sloth.v) this.b.get());
        }
    }
}
