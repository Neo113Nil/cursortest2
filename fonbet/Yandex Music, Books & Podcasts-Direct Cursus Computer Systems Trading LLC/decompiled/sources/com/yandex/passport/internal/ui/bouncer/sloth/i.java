package com.yandex.passport.internal.ui.bouncer.sloth;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.challenge.delete.j1;
import com.yandex.passport.internal.ui.challenge.delete.k1;
import com.yandex.passport.internal.ui.challenge.w;
import com.yandex.passport.internal.ui.common.web.j;
import com.yandex.passport.internal.ui.domik.y;
import com.yandex.passport.internal.ui.sloth.authsdk.i0;
import com.yandex.passport.internal.ui.sloth.authsdk.j0;
import com.yandex.passport.internal.ui.sloth.e0;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.internal.ui.sloth.k0;
import com.yandex.passport.internal.ui.sloth.menu.n;
import com.yandex.passport.internal.ui.sloth.menu.u;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.b1;
import com.yandex.passport.internal.usecase.b2;
import com.yandex.passport.internal.usecase.e1;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.performers.k;
import com.yandex.passport.sloth.command.performers.m;
import com.yandex.passport.sloth.command.performers.r;
import com.yandex.passport.sloth.v;
import com.yandex.pulse.metrics.o;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class i implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public /* synthetic */ i(rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h((s) this.b.get());
            case 1:
                return new w((Activity) this.b.get());
            case 2:
                return new k1((j1) this.b.get());
            case 3:
                return new com.yandex.passport.internal.ui.common.d((com.yandex.passport.internal.ui.common.b) this.b.get());
            case 4:
                return new com.yandex.passport.internal.ui.common.web.d((com.yandex.passport.internal.ui.common.web.a) this.b.get());
            case 5:
                return new com.yandex.passport.internal.ui.common.web.f((j) this.b.get());
            case 6:
                return new com.yandex.passport.internal.ui.domik.b((com.yandex.passport.internal.ui.domik.f) this.b.get());
            case 7:
                return new y((com.yandex.passport.internal.ui.domik.f) this.b.get());
            case 8:
                return new com.yandex.passport.internal.ui.sloth.c((com.yandex.passport.sloth.dependencies.h) this.b.get());
            case 9:
                return new com.yandex.passport.internal.ui.sloth.d((com.yandex.passport.internal.util.d) this.b.get());
            case 10:
                return new com.yandex.passport.internal.ui.sloth.e((Context) this.b.get());
            case 11:
                return new com.yandex.passport.internal.ui.sloth.f((com.yandex.passport.internal.sloth.performers.h) this.b.get());
            case 12:
                return new f0((e0) this.b.get());
            case 13:
                return new k0((Activity) this.b.get());
            case 14:
                return new j0((i0) this.b.get());
            case 15:
                return new com.yandex.passport.internal.ui.sloth.menu.a((n) this.b.get());
            case 16:
                return new u((Activity) this.b.get());
            case 17:
                return new com.yandex.passport.internal.ui.sloth.webcard.b((com.yandex.passport.internal.sloth.performers.webcard.i) this.b.get());
            case 18:
                return new b1((com.yandex.passport.internal.core.accounts.s) this.b.get());
            case 19:
                return new e1((com.yandex.passport.internal.report.reporters.w) this.b.get());
            case 20:
                return new b2((a2) this.b.get());
            case 21:
                return new v((a1) this.b.get());
            case 22:
                return new com.yandex.passport.sloth.command.performers.b((v) this.b.get());
            case 23:
                return new com.yandex.passport.sloth.command.performers.d((v) this.b.get());
            case 24:
                v vVar = (v) this.b.get();
                vVar.getClass();
                l lVar = new l();
                lVar.a = vVar;
                return lVar;
            case 25:
                return new com.yandex.passport.sloth.command.performers.i((v) this.b.get());
            case 26:
                return new k((v) this.b.get());
            case 27:
                return new m((v) this.b.get());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.sloth.command.performers.o((v) this.b.get());
            default:
                return new r((Context) this.b.get());
        }
    }
}
