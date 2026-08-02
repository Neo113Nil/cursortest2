package com.yandex.passport.internal.helper;

import com.yandex.passport.internal.properties.x;
import com.yandex.passport.sloth.command.performers.j0;
import com.yandex.passport.sloth.data.m;
import defpackage.rzm;
import defpackage.toe;

/* loaded from: classes4.dex */
public final class i implements rzm {
    public final /* synthetic */ int a;
    public final toe b;

    public /* synthetic */ i(toe toeVar, int i) {
        this.a = i;
        this.b = toeVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h((x) this.b.a);
            case 1:
                return new j0((m) this.b.a);
            default:
                return new com.yandex.passport.sloth.url.a((m) this.b.a);
        }
    }
}
