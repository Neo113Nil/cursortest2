package com.yandex.passport.common.coroutine;

import com.yandex.passport.data.network.token.i;
import com.yandex.passport.internal.common.l;
import com.yandex.passport.internal.provider.communication.q;
import com.yandex.passport.internal.provider.communication.u;
import com.yandex.passport.internal.sloth.performers.usermenu.h;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p;
import com.yandex.passport.internal.ui.bouncer.model.middleware.v0;
import com.yandex.passport.internal.ui.sloth.menu.j;
import com.yandex.passport.internal.util.k;
import com.yandex.passport.sloth.command.performers.h0;
import defpackage.c5b;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class d implements rzm {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new b();
            case 1:
                return new com.yandex.passport.internal.common.b();
            case 2:
                return new l();
            case 3:
                return new com.yandex.passport.internal.flags.d();
            case 4:
                return new com.yandex.passport.internal.network.mappers.b();
            case 5:
                return new com.yandex.passport.internal.provider.communication.e();
            case 6:
                q qVar = new q();
                qVar.a = c5b.a;
                return qVar;
            case 7:
                return new u();
            case 8:
                return new h();
            case 9:
                return new com.yandex.passport.internal.sloth.performers.webcard.g();
            case 10:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.g();
            case 11:
                return new p();
            case 12:
                return new v0();
            case 13:
                return new com.yandex.passport.internal.ui.sloth.g(new com.yandex.passport.internal.ui.e());
            case 14:
                return new j();
            case 15:
                return new com.yandex.passport.internal.ui.sloth.menu.host.b();
            case 16:
                return new k();
            case 17:
                return new h0();
            default:
                return new i(27);
        }
    }
}
