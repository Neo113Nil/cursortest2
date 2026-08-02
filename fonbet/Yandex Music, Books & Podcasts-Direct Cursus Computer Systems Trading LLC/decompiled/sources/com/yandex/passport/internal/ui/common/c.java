package com.yandex.passport.internal.ui.common;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.data.network.g2;
import com.yandex.passport.data.network.m1;
import com.yandex.passport.internal.config.g;
import com.yandex.passport.internal.config.l;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.reporters.s;
import com.yandex.passport.internal.report.reporters.w;
import com.yandex.passport.internal.ui.common.web.j;
import com.yandex.passport.internal.ui.sloth.e0;
import com.yandex.passport.internal.ui.sloth.h;
import com.yandex.passport.internal.ui.sloth.k0;
import com.yandex.passport.internal.ui.sloth.menu.i;
import com.yandex.passport.internal.ui.sloth.menu.m;
import com.yandex.passport.internal.ui.sloth.menu.u;
import com.yandex.passport.internal.usecase.e1;
import com.yandex.passport.internal.usecase.g1;
import com.yandex.passport.internal.usecase.k;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.usecase.n;
import com.yandex.passport.internal.usecase.q2;
import com.yandex.passport.internal.usecase.r;
import com.yandex.passport.internal.usecase.ui.b0;
import com.yandex.passport.internal.usecase.ui.i1;
import com.yandex.passport.internal.usecase.ui.z;
import com.yandex.passport.internal.usecase.w0;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.p;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d2;
import com.yandex.passport.sloth.ui.dependencies.o;
import com.yandex.passport.sloth.ui.n0;
import com.yandex.passport.sloth.ui.s0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class c implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;
    public final rzm d;

    public /* synthetic */ c(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new b((Activity) this.b.get(), (v) this.d.get(), (x) this.c.get());
            case 1:
                return new j((Activity) this.c.get(), (v) this.d.get(), (x) this.b.get());
            case 2:
                return new e0((h) this.b.get(), (k0) this.c.get(), (o) this.d.get());
            case 3:
                return new i((com.yandex.passport.internal.ui.sloth.menu.o) this.b.get(), (Activity) this.c.get(), (com.yandex.passport.sloth.ui.string.b) this.d.get());
            case 4:
                return new com.yandex.passport.internal.ui.sloth.menu.o((m) this.b.get(), (com.yandex.passport.internal.ui.bouncer.sloth.a) this.c.get(), (u) this.d.get());
            case 5:
                return new com.yandex.passport.internal.usecase.b((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.u) this.c.get(), (com.yandex.passport.internal.core.accounts.f) this.d.get());
            case 6:
                return new k((com.yandex.passport.common.coroutine.a) this.b.get(), (l) this.c.get(), (g) this.d.get());
            case 7:
                e1 e1Var = (e1) this.b.get();
                return new com.yandex.passport.internal.usecase.m((com.yandex.passport.internal.flags.i) this.d.get(), (w) this.c.get(), e1Var);
            case 8:
                return new n((com.yandex.passport.internal.flags.i) this.c.get(), (w) this.d.get(), (e1) this.b.get());
            case 9:
                return new r((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.usecase.u) this.c.get(), (com.yandex.passport.internal.core.accounts.f) this.d.get());
            case 10:
                return new g1((Context) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get(), (s) this.d.get());
            case 11:
                return new q2((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.credentials.g) this.c.get(), (com.yandex.passport.internal.core.accounts.k) this.d.get());
            case 12:
                return new com.yandex.passport.internal.usecase.ui.r((com.yandex.passport.common.coroutine.a) this.b.get(), (m1) this.c.get(), (com.yandex.passport.internal.network.mappers.b) this.d.get());
            case 13:
                return new com.yandex.passport.internal.usecase.ui.w((com.yandex.passport.common.coroutine.a) this.b.get(), (g2) this.c.get(), (com.yandex.passport.internal.network.mappers.b) this.d.get());
            case 14:
                return new z((com.yandex.passport.common.coroutine.a) this.b.get(), (w0) this.c.get(), (o1) this.d.get());
            case 15:
                return new b0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.s) this.c.get(), (com.yandex.passport.internal.core.accounts.e) this.d.get());
            case 16:
                return new com.yandex.passport.internal.usecase.ui.w0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.common.ui.lang.b) this.c.get(), (com.yandex.passport.internal.network.d) this.d.get());
            case 17:
                return new i1((com.yandex.passport.internal.account.d) this.b.get(), new com.yandex.passport.internal.ui.e(), (l2) this.c.get(), (com.yandex.passport.common.coroutine.a) this.d.get());
            case 18:
                return new com.yandex.passport.internal.usecase.vpn.k((com.yandex.passport.internal.usecase.vpn.e) this.b.get(), (com.yandex.passport.internal.common.k) this.c.get(), (com.yandex.passport.internal.flags.i) this.d.get());
            case 19:
                return new com.yandex.passport.sloth.l((a1) this.b.get(), (com.yandex.passport.sloth.v) this.c.get(), (com.yandex.passport.sloth.i) this.d.get());
            case 20:
                return new com.yandex.passport.sloth.command.g((com.yandex.passport.sloth.command.k) this.b.get(), (p) this.c.get(), (a1) this.d.get());
            case 21:
                return new s0((n0) this.b.get(), (com.yandex.passport.sloth.ui.string.b) this.c.get(), (b1) this.d.get());
            default:
                return new com.yandex.passport.internal.flags.experiments.p((s0) this.b.get(), (d2) this.c.get(), (b1) this.d.get());
        }
    }
}
