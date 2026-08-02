package com.yandex.passport.internal.flags.experiments;

import androidx.core.app.n0;
import com.yandex.passport.data.network.qa;
import com.yandex.passport.data.network.z0;
import com.yandex.passport.internal.di.module.t;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n1;
import com.yandex.passport.internal.usecase.ui.z;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.url.a0;
import com.yandex.passport.sloth.url.y;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class h implements rzm {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new g((d) ((t) this.b).get());
            case 1:
                return new com.yandex.passport.internal.network.mappers.d((com.yandex.passport.data.mapper.a) ((t) this.b).get());
            case 2:
                return new com.yandex.passport.internal.sloth.g((z) ((com.yandex.passport.internal.ui.common.c) this.b).get());
            case 3:
                return new com.yandex.passport.internal.sloth.performers.l((com.yandex.passport.common.network.n) ((qa) this.b).get());
            case 4:
                return (com.yandex.passport.internal.ui.challenge.e) ((n0) this.b).a;
            case 5:
                return new com.yandex.passport.internal.ui.account_upgrade.j((com.yandex.passport.internal.upgrader.d) ((z0) this.b).get());
            case 6:
                return ((com.yandex.passport.internal.ui.bouncer.h) this.b).a;
            case 7:
                return new n1((com.yandex.passport.internal.usecase.ui.b) ((com.yandex.passport.internal.ui.bouncer.roundabout.d) this.b).get());
            case 8:
                v vVar = ((com.yandex.passport.internal.ui.challenge.logout.c) this.b).b;
                a4g.t(vVar);
                return vVar;
            case 9:
                return new com.yandex.passport.sloth.z0((com.yandex.passport.sloth.dependencies.d) ((com.yandex.passport.sloth.dependencies.c) this.b).get());
            case 10:
                return new a1((com.yandex.passport.sloth.dependencies.h) ((com.yandex.passport.sloth.dependencies.c) this.b).get());
            default:
                return new a0((com.yandex.passport.data.network.token.i) y.a.get(), (com.yandex.passport.internal.sloth.p) ((com.yandex.passport.sloth.dependencies.c) this.b).get());
        }
    }
}
