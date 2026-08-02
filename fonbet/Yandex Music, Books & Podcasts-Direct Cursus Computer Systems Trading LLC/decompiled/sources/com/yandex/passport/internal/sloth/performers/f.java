package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import android.content.IntentFilter;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.sloth.command.t;
import defpackage.btf;
import defpackage.gm5;
import defpackage.hav;
import defpackage.itv;
import defpackage.jyr;
import defpackage.l83;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.phg;
import defpackage.r2f;

/* loaded from: classes4.dex */
public final class f implements t {
    public final Context a;
    public final com.yandex.passport.internal.smsretriever.b b;
    public final n0 c;
    public final com.yandex.passport.common.coroutine.e d;
    public final jyr e;

    public f(Context context, com.yandex.passport.internal.smsretriever.b bVar, n0 n0Var, com.yandex.passport.common.coroutine.e eVar) {
        context.getClass();
        bVar.getClass();
        n0Var.getClass();
        eVar.getClass();
        this.a = context;
        this.b = bVar;
        this.c = n0Var;
        this.d = eVar;
        this.e = btf.b(new com.yandex.passport.internal.common.e(8, this));
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        gm5 gm5Var = new gm5((r2f) fVar.getContext().get(o6c.l));
        l83 l83Var = new l83(new hav(24, this, gm5Var));
        ((phg) this.e.getValue()).b(l83Var, new IntentFilter("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
        this.b.b();
        gm5Var.R(new itv(26, this, l83Var));
        Object s = gm5Var.s(fVar);
        nm6 nm6Var = nm6.a;
        return s;
    }
}
