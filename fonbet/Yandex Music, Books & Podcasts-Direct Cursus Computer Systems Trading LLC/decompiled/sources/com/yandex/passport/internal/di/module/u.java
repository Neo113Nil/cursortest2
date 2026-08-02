package com.yandex.passport.internal.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.internal.report.reporters.b0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class u implements rzm {
    public final /* synthetic */ int a;
    public final p b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;
    public final rzm h;

    public /* synthetic */ u(p pVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, int i) {
        this.a = i;
        this.b = pVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c.get();
                com.yandex.passport.common.analytics.k kVar = (com.yandex.passport.common.analytics.k) this.d.get();
                com.yandex.passport.internal.core.accounts.k kVar2 = (com.yandex.passport.internal.core.accounts.k) this.e.get();
                com.yandex.passport.internal.core.accounts.e eVar = (com.yandex.passport.internal.core.accounts.e) this.f.get();
                com.yandex.passport.internal.flags.experiments.i iVar = (com.yandex.passport.internal.flags.experiments.i) this.g.get();
                com.yandex.passport.internal.network.mappers.d dVar = (com.yandex.passport.internal.network.mappers.d) this.h.get();
                this.b.getClass();
                context.getClass();
                kVar.getClass();
                kVar2.getClass();
                eVar.getClass();
                iVar.getClass();
                dVar.getClass();
                return new com.yandex.passport.internal.util.d(context.getPackageName(), context.getPackageManager(), kVar, kVar2, eVar, iVar, dVar);
            default:
                Context context2 = (Context) this.c.get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) this.d.get();
                com.yandex.passport.internal.flags.experiments.g gVar = (com.yandex.passport.internal.flags.experiments.g) this.e.get();
                b0 b0Var = (b0) this.f.get();
                com.yandex.passport.internal.report.d dVar2 = (com.yandex.passport.internal.report.d) this.g.get();
                com.yandex.passport.internal.flags.experiments.b bVar = (com.yandex.passport.internal.flags.experiments.b) this.h.get();
                this.b.getClass();
                context2.getClass();
                aVar.getClass();
                gVar.getClass();
                b0Var.getClass();
                dVar2.getClass();
                bVar.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("experiments", 0);
                sharedPreferences.getClass();
                return new com.yandex.passport.internal.flags.experiments.i(aVar, sharedPreferences, gVar, b0Var, dVar2, bVar);
        }
    }
}
