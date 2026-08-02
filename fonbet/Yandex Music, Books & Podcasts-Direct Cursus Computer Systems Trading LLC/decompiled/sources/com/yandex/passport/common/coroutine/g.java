package com.yandex.passport.common.coroutine;

import android.content.ClipboardManager;
import android.content.Context;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.network.core.p;
import com.yandex.passport.data.network.core.t;
import com.yandex.passport.data.network.d9;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.q0;
import com.yandex.passport.internal.analytics.r0;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.analytics.y;
import com.yandex.passport.internal.common.k;
import com.yandex.passport.internal.config.o;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.core.accounts.s;
import com.yandex.passport.internal.report.reporters.h;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.storage.q;
import defpackage.ac7;
import defpackage.rzm;
import defpackage.vw1;
import defpackage.wb7;
import defpackage.xyn;

/* loaded from: classes4.dex */
public final class g implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public /* synthetic */ g(rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new f((b) this.b.get());
            case 1:
                h hVar = (h) this.b.get();
                hVar.getClass();
                l lVar = new l();
                lVar.a = hVar;
                return lVar;
            case 2:
                return new d9((com.yandex.passport.common.a) this.b.get());
            case 3:
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) this.b.get();
                aVar.getClass();
                l lVar2 = new l();
                lVar2.a = aVar;
                return lVar2;
            case 4:
                return new p((com.yandex.passport.internal.network.c) this.b.get());
            case 5:
                return new t((com.yandex.passport.internal.network.c) this.b.get());
            case 6:
                return new com.yandex.passport.internal.account.b((m) this.b.get());
            case 7:
                return new x((w) this.b.get());
            case 8:
                return new y((w) this.b.get());
            case 9:
                return new n0((w) this.b.get());
            case 10:
                return new q0((w) this.b.get());
            case 11:
                return new r0((w) this.b.get());
            case 12:
                a aVar2 = (a) this.b.get();
                aVar2.getClass();
                return new com.yandex.passport.internal.badges.h(((b) aVar2).c);
            case 13:
                return new com.yandex.passport.internal.clipboard.a((ClipboardManager) this.b.get());
            case 14:
                return new com.yandex.passport.internal.common.f((Context) this.b.get());
            case 15:
                return new k((Context) this.b.get());
            case 16:
                return new com.yandex.passport.internal.config.a((Context) this.b.get());
            case 17:
                return new com.yandex.passport.internal.config.b((com.yandex.passport.internal.config.d) this.b.get());
            case 18:
                return new com.yandex.passport.internal.config.d((Context) this.b.get());
            case 19:
                return new com.yandex.passport.internal.config.h((Context) this.b.get());
            case 20:
                return new o((com.yandex.passport.internal.config.d) this.b.get());
            case 21:
                return new com.yandex.passport.internal.config.p((Context) this.b.get());
            case 22:
                return new com.yandex.passport.internal.config.template.g((wb7) this.b.get());
            case 23:
                return new s((com.yandex.passport.internal.report.reporters.a) this.b.get());
            case 24:
                return new com.yandex.passport.internal.core.announcing.c((Context) this.b.get());
            case 25:
                return new com.yandex.passport.internal.core.linkage.d((i) this.b.get());
            case 26:
                return new com.yandex.passport.internal.credentials.g((com.yandex.passport.internal.properties.x) this.b.get());
            case 27:
                b bVar = (b) this.b.get();
                bVar.getClass();
                return bVar;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                f fVar = (f) this.b.get();
                fVar.getClass();
                return fVar;
            default:
                Context context = (Context) this.b.get();
                context.getClass();
                return ac7.b(q.a, new xyn(new r(11)), new vw1(context, 27), 12);
        }
    }
}
