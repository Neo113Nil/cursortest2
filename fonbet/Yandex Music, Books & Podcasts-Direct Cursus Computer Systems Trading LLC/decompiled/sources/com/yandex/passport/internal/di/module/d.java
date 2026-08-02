package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.push.d0;
import com.yandex.passport.internal.push.i0;
import com.yandex.passport.internal.report.diary.n0;
import com.yandex.passport.internal.report.reporters.b0;
import com.yandex.passport.internal.report.reporters.c0;
import com.yandex.passport.internal.report.reporters.d1;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.report.reporters.l0;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.reporters.z;
import com.yandex.passport.internal.report.reporters.z0;
import defpackage.ac7;
import defpackage.rzm;
import defpackage.vw1;
import defpackage.xyn;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes4.dex */
public final class d implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public /* synthetic */ d(rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.storage.datastore.e eVar = (com.yandex.passport.internal.storage.datastore.e) this.b.get();
                eVar.getClass();
                return eVar;
            case 1:
                Context context = (Context) this.b.get();
                context.getClass();
                return ac7.b(com.yandex.passport.internal.config.template.h.a, new xyn(new com.yandex.passport.common.network.r(12)), new vw1(context, 29), 12);
            case 2:
                return new com.yandex.passport.internal.features.a((com.yandex.passport.internal.flags.i) this.b.get());
            case 3:
                return new com.yandex.passport.internal.flags.experiments.k((Context) this.b.get());
            case 4:
                c0 c0Var = (c0) this.b.get();
                c0Var.getClass();
                com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l();
                lVar.a = c0Var;
                return lVar;
            case 5:
                return new com.yandex.passport.internal.methods.performer.o((com.yandex.passport.internal.usecase.vpn.e) this.b.get());
            case 6:
                return new com.yandex.passport.internal.network.b((com.yandex.passport.internal.report.reporters.j) this.b.get());
            case 7:
                return new com.yandex.passport.internal.network.mappers.a((com.yandex.passport.data.mapper.a) this.b.get());
            case 8:
                return new y((x) this.b.get());
            case 9:
                return new com.yandex.passport.internal.provider.communication.f((com.yandex.passport.internal.provider.communication.e) this.b.get());
            case 10:
                return new com.yandex.passport.internal.provider.communication.j((com.yandex.passport.internal.provider.communication.e) this.b.get());
            case 11:
                return new d0((Context) this.b.get());
            case 12:
                return new i0((w0) this.b.get());
            case 13:
                return new com.yandex.passport.internal.report.e((IReporterYandex) this.b.get());
            case 14:
                com.yandex.passport.internal.report.g gVar = (com.yandex.passport.internal.report.g) this.b.get();
                gVar.getClass();
                return new n0(gVar);
            case 15:
                com.yandex.passport.internal.report.g gVar2 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar2.getClass();
                return new com.yandex.passport.internal.report.reporters.a(gVar2);
            case 16:
                com.yandex.passport.internal.report.g gVar3 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar3.getClass();
                return new com.yandex.passport.internal.report.reporters.b(gVar3);
            case 17:
                com.yandex.passport.internal.report.g gVar4 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar4.getClass();
                return new com.yandex.passport.internal.report.reporters.c(gVar4);
            case 18:
                com.yandex.passport.internal.report.g gVar5 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar5.getClass();
                return new com.yandex.passport.internal.report.reporters.k(gVar5);
            case 19:
                com.yandex.passport.internal.report.g gVar6 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar6.getClass();
                return new com.yandex.passport.internal.report.reporters.o(gVar6);
            case 20:
                com.yandex.passport.internal.report.g gVar7 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar7.getClass();
                return new com.yandex.passport.internal.report.reporters.p(gVar7);
            case 21:
                com.yandex.passport.internal.report.g gVar8 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar8.getClass();
                return new com.yandex.passport.internal.report.reporters.q(gVar8);
            case 22:
                com.yandex.passport.internal.report.g gVar9 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar9.getClass();
                return new com.yandex.passport.internal.report.reporters.v(gVar9);
            case 23:
                com.yandex.passport.internal.report.g gVar10 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar10.getClass();
                return new z(gVar10);
            case 24:
                return new b0((com.yandex.passport.internal.report.e) this.b.get());
            case 25:
                return new g0((com.yandex.passport.internal.report.g) this.b.get());
            case 26:
                com.yandex.passport.internal.report.g gVar11 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar11.getClass();
                return new l0(gVar11);
            case 27:
                com.yandex.passport.internal.report.g gVar12 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar12.getClass();
                return new z0(gVar12);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.passport.internal.report.g gVar13 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar13.getClass();
                return new d1(gVar13);
            default:
                com.yandex.passport.internal.report.g gVar14 = (com.yandex.passport.internal.report.g) this.b.get();
                gVar14.getClass();
                return new i1(gVar14);
        }
    }
}
