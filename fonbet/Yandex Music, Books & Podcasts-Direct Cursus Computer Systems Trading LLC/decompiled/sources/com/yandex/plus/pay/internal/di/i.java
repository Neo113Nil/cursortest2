package com.yandex.plus.pay.internal.di;

import android.content.Context;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.push.x0;
import com.yandex.passport.internal.ui.l;
import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.metrica.utils.z;
import defpackage.b6e;
import defpackage.btf;
import defpackage.f8g;
import defpackage.f8m;
import defpackage.joj;
import defpackage.jyr;
import defpackage.p7m;
import defpackage.ra6;
import defpackage.tf6;
import defpackage.x3f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class i {
    public final long A;
    public final jyr B;
    public final jyr C;
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b D;
    public final jyr E;
    public final jyr F;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final com.yandex.plus.core.strings.a h;
    public final String i;
    public final Context j;
    public final com.yandex.plus.core.config.b k;
    public final tf6 l;
    public final com.yandex.plus.core.locale.a m;
    public final com.yandex.plus.core.location.a n;
    public final joj o;
    public final Function1 p;
    public final com.yandex.plus.core.dispatcher.b q;
    public final com.yandex.plus.metrica.api.b r;
    public final com.yandex.plus.metrica.utils.i s;
    public final z t;
    public final z u;
    public final com.yandex.plus.pay.internal.common.e v;
    public final com.yandex.plus.domain.auth.impl.i w;
    public final x0 x;
    public final com.yandex.plus.metrica.utils.n y;
    public final x z;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, com.yandex.plus.core.strings.a aVar, String str8, Context context, com.yandex.plus.core.config.b bVar, tf6 tf6Var, com.yandex.plus.core.locale.a aVar2, com.yandex.plus.core.location.a aVar3, f8m f8mVar, joj jojVar, Function1 function1, com.yandex.plus.core.dispatcher.b bVar2, com.yandex.plus.metrica.api.b bVar3, com.yandex.plus.metrica.utils.i iVar, z zVar, z zVar2, com.yandex.plus.pay.internal.common.e eVar, com.yandex.plus.domain.auth.impl.i iVar2, x0 x0Var, com.yandex.plus.metrica.utils.n nVar, x xVar, long j) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        aVar.getClass();
        context.getClass();
        function1.getClass();
        bVar2.getClass();
        bVar3.getClass();
        iVar.getClass();
        zVar.getClass();
        zVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = aVar;
        this.i = str8;
        this.j = context;
        this.k = bVar;
        this.l = tf6Var;
        this.m = aVar2;
        this.n = aVar3;
        this.o = jojVar;
        this.p = function1;
        this.q = bVar2;
        this.r = bVar3;
        this.s = iVar;
        this.t = zVar;
        this.u = zVar2;
        this.v = eVar;
        this.w = iVar2;
        this.x = x0Var;
        this.y = nVar;
        this.z = xVar;
        this.A = j;
        final int i = 0;
        this.B = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.f
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i iVar3 = this.b;
                        return new com.yandex.plus.pay.internal.common.g(iVar3.h, iVar3.m);
                    default:
                        com.yandex.plus.pay.internal.common.e eVar2 = this.b.v;
                        com.yandex.plus.core.network.error.a aVar4 = new com.yandex.plus.core.network.error.a();
                        btf.b(new w(0, eVar2, com.yandex.plus.core.analytics.d.class, "getDiagnosticReporter", "getDiagnosticReporter()Lcom/yandex/plus/core/analytics/DiagnosticReporter;", 0, 21));
                        return aVar4;
                }
            }
        });
        this.C = btf.b(new g(i));
        com.yandex.plus.pay.internal.network.urls.a aVar4 = new com.yandex.plus.pay.internal.network.urls.a(f8mVar, bVar.a(), aVar);
        final com.yandex.plus.home.plaque.feature.internal.presentation.b bVar4 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
        final int i2 = 0;
        bVar4.a = btf.b(new Function0() { // from class: com.yandex.plus.core.network.urls.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.core.network.hosts.a pVar;
                ra6 ra6Var;
                com.yandex.plus.core.network.hosts.a pVar2;
                com.yandex.plus.core.network.hosts.a pVar3;
                p pVar4;
                int i3 = i2;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = bVar4;
                switch (i3) {
                    case 0:
                        com.yandex.plus.pay.internal.network.urls.a aVar5 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar6 = aVar5.b;
                        com.yandex.plus.core.strings.a aVar7 = aVar5.c;
                        aVar6.getClass();
                        aVar7.getClass();
                        int ordinal = aVar7.ordinal();
                        if (ordinal == 0) {
                            pVar = new p("api.plus.yandex.net", "api.plus.tst.yandex.net", aVar6);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar = new p("api.play.yangosaft.net", "api.plus.tst.yandex.net", aVar6);
                        }
                        if (aVar5.a != null) {
                            jyr jyrVar = p7m.e;
                            String f = f8g.E().a().f("graphql_host");
                            ra6Var = f != null ? new ra6(f, 4) : null;
                            if (ra6Var != null) {
                                pVar = new l(11, ra6Var, pVar);
                            }
                        }
                        return new b(pVar, "/graphql");
                    case 1:
                        com.yandex.plus.pay.internal.network.urls.a aVar8 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar9 = aVar8.b;
                        aVar9.getClass();
                        com.yandex.plus.core.network.hosts.a pVar5 = new p("avatars.mds.yandex.net", "avatars.mdst.yandex.net", aVar9);
                        if (aVar8.a != null) {
                            jyr jyrVar2 = p7m.e;
                            String f2 = f8g.E().a().f("avatar_host");
                            ra6Var = f2 != null ? new ra6(f2, 4) : null;
                            if (ra6Var != null) {
                                pVar5 = new l(11, ra6Var, pVar5);
                            }
                        }
                        return new b(pVar5, "/get-yapic/");
                    case 2:
                        com.yandex.plus.pay.internal.network.urls.a aVar10 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar11 = aVar10.e;
                        com.yandex.plus.core.strings.a aVar12 = aVar10.f;
                        aVar11.getClass();
                        aVar12.getClass();
                        int ordinal2 = aVar12.ordinal();
                        if (ordinal2 == 0) {
                            pVar2 = new p("external-api.mediabilling.yandex.ru", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar2 = new p("external-api.play.yangosaft.net", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        }
                        if (aVar10.d != null) {
                            jyr jyrVar3 = p7m.e;
                            String f3 = f8g.E().a().f("mediabilling_host");
                            ra6Var = f3 != null ? new ra6(f3, 4) : null;
                            if (ra6Var != null) {
                                pVar2 = new l(11, ra6Var, pVar2);
                            }
                        }
                        return new b(pVar2);
                    case 3:
                        com.yandex.plus.pay.internal.network.urls.a aVar13 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar14 = aVar13.e;
                        com.yandex.plus.core.strings.a aVar15 = aVar13.f;
                        aVar14.getClass();
                        aVar15.getClass();
                        int ordinal3 = aVar15.ordinal();
                        if (ordinal3 == 0) {
                            pVar3 = new p("api.events.plus.yandex.net", "api.events.plus.tst.yandex.net", aVar14);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar3 = new p("api.events.play.yangosaft.net", "api.events.plus.tst.yandex.net", aVar14);
                        }
                        if (aVar13.d != null) {
                            jyr jyrVar4 = p7m.e;
                            String f4 = f8g.E().a().f("dwh_events_host");
                            ra6Var = f4 != null ? new ra6(f4, 4) : null;
                            if (ra6Var != null) {
                                pVar3 = new l(11, ra6Var, pVar3);
                            }
                        }
                        return new b(pVar3);
                    default:
                        com.yandex.plus.pay.internal.network.urls.a aVar16 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar17 = aVar16.e;
                        com.yandex.plus.core.strings.a aVar18 = aVar16.f;
                        aVar17.getClass();
                        aVar18.getClass();
                        int ordinal4 = aVar18.ordinal();
                        if (ordinal4 == 0) {
                            pVar4 = new p("api.acquisition-gwe.plus.yandex.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar4 = new p("egw.acquisition.play.yangosaft.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        }
                        return new b(pVar4);
                }
            }
        });
        final int i3 = 1;
        bVar4.b = btf.b(new Function0() { // from class: com.yandex.plus.core.network.urls.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.core.network.hosts.a pVar;
                ra6 ra6Var;
                com.yandex.plus.core.network.hosts.a pVar2;
                com.yandex.plus.core.network.hosts.a pVar3;
                p pVar4;
                int i32 = i3;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = bVar4;
                switch (i32) {
                    case 0:
                        com.yandex.plus.pay.internal.network.urls.a aVar5 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar6 = aVar5.b;
                        com.yandex.plus.core.strings.a aVar7 = aVar5.c;
                        aVar6.getClass();
                        aVar7.getClass();
                        int ordinal = aVar7.ordinal();
                        if (ordinal == 0) {
                            pVar = new p("api.plus.yandex.net", "api.plus.tst.yandex.net", aVar6);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar = new p("api.play.yangosaft.net", "api.plus.tst.yandex.net", aVar6);
                        }
                        if (aVar5.a != null) {
                            jyr jyrVar = p7m.e;
                            String f = f8g.E().a().f("graphql_host");
                            ra6Var = f != null ? new ra6(f, 4) : null;
                            if (ra6Var != null) {
                                pVar = new l(11, ra6Var, pVar);
                            }
                        }
                        return new b(pVar, "/graphql");
                    case 1:
                        com.yandex.plus.pay.internal.network.urls.a aVar8 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar9 = aVar8.b;
                        aVar9.getClass();
                        com.yandex.plus.core.network.hosts.a pVar5 = new p("avatars.mds.yandex.net", "avatars.mdst.yandex.net", aVar9);
                        if (aVar8.a != null) {
                            jyr jyrVar2 = p7m.e;
                            String f2 = f8g.E().a().f("avatar_host");
                            ra6Var = f2 != null ? new ra6(f2, 4) : null;
                            if (ra6Var != null) {
                                pVar5 = new l(11, ra6Var, pVar5);
                            }
                        }
                        return new b(pVar5, "/get-yapic/");
                    case 2:
                        com.yandex.plus.pay.internal.network.urls.a aVar10 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar11 = aVar10.e;
                        com.yandex.plus.core.strings.a aVar12 = aVar10.f;
                        aVar11.getClass();
                        aVar12.getClass();
                        int ordinal2 = aVar12.ordinal();
                        if (ordinal2 == 0) {
                            pVar2 = new p("external-api.mediabilling.yandex.ru", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar2 = new p("external-api.play.yangosaft.net", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        }
                        if (aVar10.d != null) {
                            jyr jyrVar3 = p7m.e;
                            String f3 = f8g.E().a().f("mediabilling_host");
                            ra6Var = f3 != null ? new ra6(f3, 4) : null;
                            if (ra6Var != null) {
                                pVar2 = new l(11, ra6Var, pVar2);
                            }
                        }
                        return new b(pVar2);
                    case 3:
                        com.yandex.plus.pay.internal.network.urls.a aVar13 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar14 = aVar13.e;
                        com.yandex.plus.core.strings.a aVar15 = aVar13.f;
                        aVar14.getClass();
                        aVar15.getClass();
                        int ordinal3 = aVar15.ordinal();
                        if (ordinal3 == 0) {
                            pVar3 = new p("api.events.plus.yandex.net", "api.events.plus.tst.yandex.net", aVar14);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar3 = new p("api.events.play.yangosaft.net", "api.events.plus.tst.yandex.net", aVar14);
                        }
                        if (aVar13.d != null) {
                            jyr jyrVar4 = p7m.e;
                            String f4 = f8g.E().a().f("dwh_events_host");
                            ra6Var = f4 != null ? new ra6(f4, 4) : null;
                            if (ra6Var != null) {
                                pVar3 = new l(11, ra6Var, pVar3);
                            }
                        }
                        return new b(pVar3);
                    default:
                        com.yandex.plus.pay.internal.network.urls.a aVar16 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar17 = aVar16.e;
                        com.yandex.plus.core.strings.a aVar18 = aVar16.f;
                        aVar17.getClass();
                        aVar18.getClass();
                        int ordinal4 = aVar18.ordinal();
                        if (ordinal4 == 0) {
                            pVar4 = new p("api.acquisition-gwe.plus.yandex.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar4 = new p("egw.acquisition.play.yangosaft.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        }
                        return new b(pVar4);
                }
            }
        });
        bVar4.c = aVar4;
        final int i4 = 2;
        bVar4.d = btf.b(new Function0() { // from class: com.yandex.plus.core.network.urls.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.core.network.hosts.a pVar;
                ra6 ra6Var;
                com.yandex.plus.core.network.hosts.a pVar2;
                com.yandex.plus.core.network.hosts.a pVar3;
                p pVar4;
                int i32 = i4;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = bVar4;
                switch (i32) {
                    case 0:
                        com.yandex.plus.pay.internal.network.urls.a aVar5 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar6 = aVar5.b;
                        com.yandex.plus.core.strings.a aVar7 = aVar5.c;
                        aVar6.getClass();
                        aVar7.getClass();
                        int ordinal = aVar7.ordinal();
                        if (ordinal == 0) {
                            pVar = new p("api.plus.yandex.net", "api.plus.tst.yandex.net", aVar6);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar = new p("api.play.yangosaft.net", "api.plus.tst.yandex.net", aVar6);
                        }
                        if (aVar5.a != null) {
                            jyr jyrVar = p7m.e;
                            String f = f8g.E().a().f("graphql_host");
                            ra6Var = f != null ? new ra6(f, 4) : null;
                            if (ra6Var != null) {
                                pVar = new l(11, ra6Var, pVar);
                            }
                        }
                        return new b(pVar, "/graphql");
                    case 1:
                        com.yandex.plus.pay.internal.network.urls.a aVar8 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar9 = aVar8.b;
                        aVar9.getClass();
                        com.yandex.plus.core.network.hosts.a pVar5 = new p("avatars.mds.yandex.net", "avatars.mdst.yandex.net", aVar9);
                        if (aVar8.a != null) {
                            jyr jyrVar2 = p7m.e;
                            String f2 = f8g.E().a().f("avatar_host");
                            ra6Var = f2 != null ? new ra6(f2, 4) : null;
                            if (ra6Var != null) {
                                pVar5 = new l(11, ra6Var, pVar5);
                            }
                        }
                        return new b(pVar5, "/get-yapic/");
                    case 2:
                        com.yandex.plus.pay.internal.network.urls.a aVar10 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar11 = aVar10.e;
                        com.yandex.plus.core.strings.a aVar12 = aVar10.f;
                        aVar11.getClass();
                        aVar12.getClass();
                        int ordinal2 = aVar12.ordinal();
                        if (ordinal2 == 0) {
                            pVar2 = new p("external-api.mediabilling.yandex.ru", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar2 = new p("external-api.play.yangosaft.net", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        }
                        if (aVar10.d != null) {
                            jyr jyrVar3 = p7m.e;
                            String f3 = f8g.E().a().f("mediabilling_host");
                            ra6Var = f3 != null ? new ra6(f3, 4) : null;
                            if (ra6Var != null) {
                                pVar2 = new l(11, ra6Var, pVar2);
                            }
                        }
                        return new b(pVar2);
                    case 3:
                        com.yandex.plus.pay.internal.network.urls.a aVar13 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar14 = aVar13.e;
                        com.yandex.plus.core.strings.a aVar15 = aVar13.f;
                        aVar14.getClass();
                        aVar15.getClass();
                        int ordinal3 = aVar15.ordinal();
                        if (ordinal3 == 0) {
                            pVar3 = new p("api.events.plus.yandex.net", "api.events.plus.tst.yandex.net", aVar14);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar3 = new p("api.events.play.yangosaft.net", "api.events.plus.tst.yandex.net", aVar14);
                        }
                        if (aVar13.d != null) {
                            jyr jyrVar4 = p7m.e;
                            String f4 = f8g.E().a().f("dwh_events_host");
                            ra6Var = f4 != null ? new ra6(f4, 4) : null;
                            if (ra6Var != null) {
                                pVar3 = new l(11, ra6Var, pVar3);
                            }
                        }
                        return new b(pVar3);
                    default:
                        com.yandex.plus.pay.internal.network.urls.a aVar16 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar17 = aVar16.e;
                        com.yandex.plus.core.strings.a aVar18 = aVar16.f;
                        aVar17.getClass();
                        aVar18.getClass();
                        int ordinal4 = aVar18.ordinal();
                        if (ordinal4 == 0) {
                            pVar4 = new p("api.acquisition-gwe.plus.yandex.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar4 = new p("egw.acquisition.play.yangosaft.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        }
                        return new b(pVar4);
                }
            }
        });
        final int i5 = 3;
        bVar4.e = btf.b(new Function0() { // from class: com.yandex.plus.core.network.urls.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.core.network.hosts.a pVar;
                ra6 ra6Var;
                com.yandex.plus.core.network.hosts.a pVar2;
                com.yandex.plus.core.network.hosts.a pVar3;
                p pVar4;
                int i32 = i5;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = bVar4;
                switch (i32) {
                    case 0:
                        com.yandex.plus.pay.internal.network.urls.a aVar5 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar6 = aVar5.b;
                        com.yandex.plus.core.strings.a aVar7 = aVar5.c;
                        aVar6.getClass();
                        aVar7.getClass();
                        int ordinal = aVar7.ordinal();
                        if (ordinal == 0) {
                            pVar = new p("api.plus.yandex.net", "api.plus.tst.yandex.net", aVar6);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar = new p("api.play.yangosaft.net", "api.plus.tst.yandex.net", aVar6);
                        }
                        if (aVar5.a != null) {
                            jyr jyrVar = p7m.e;
                            String f = f8g.E().a().f("graphql_host");
                            ra6Var = f != null ? new ra6(f, 4) : null;
                            if (ra6Var != null) {
                                pVar = new l(11, ra6Var, pVar);
                            }
                        }
                        return new b(pVar, "/graphql");
                    case 1:
                        com.yandex.plus.pay.internal.network.urls.a aVar8 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar9 = aVar8.b;
                        aVar9.getClass();
                        com.yandex.plus.core.network.hosts.a pVar5 = new p("avatars.mds.yandex.net", "avatars.mdst.yandex.net", aVar9);
                        if (aVar8.a != null) {
                            jyr jyrVar2 = p7m.e;
                            String f2 = f8g.E().a().f("avatar_host");
                            ra6Var = f2 != null ? new ra6(f2, 4) : null;
                            if (ra6Var != null) {
                                pVar5 = new l(11, ra6Var, pVar5);
                            }
                        }
                        return new b(pVar5, "/get-yapic/");
                    case 2:
                        com.yandex.plus.pay.internal.network.urls.a aVar10 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar11 = aVar10.e;
                        com.yandex.plus.core.strings.a aVar12 = aVar10.f;
                        aVar11.getClass();
                        aVar12.getClass();
                        int ordinal2 = aVar12.ordinal();
                        if (ordinal2 == 0) {
                            pVar2 = new p("external-api.mediabilling.yandex.ru", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar2 = new p("external-api.play.yangosaft.net", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        }
                        if (aVar10.d != null) {
                            jyr jyrVar3 = p7m.e;
                            String f3 = f8g.E().a().f("mediabilling_host");
                            ra6Var = f3 != null ? new ra6(f3, 4) : null;
                            if (ra6Var != null) {
                                pVar2 = new l(11, ra6Var, pVar2);
                            }
                        }
                        return new b(pVar2);
                    case 3:
                        com.yandex.plus.pay.internal.network.urls.a aVar13 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar14 = aVar13.e;
                        com.yandex.plus.core.strings.a aVar15 = aVar13.f;
                        aVar14.getClass();
                        aVar15.getClass();
                        int ordinal3 = aVar15.ordinal();
                        if (ordinal3 == 0) {
                            pVar3 = new p("api.events.plus.yandex.net", "api.events.plus.tst.yandex.net", aVar14);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar3 = new p("api.events.play.yangosaft.net", "api.events.plus.tst.yandex.net", aVar14);
                        }
                        if (aVar13.d != null) {
                            jyr jyrVar4 = p7m.e;
                            String f4 = f8g.E().a().f("dwh_events_host");
                            ra6Var = f4 != null ? new ra6(f4, 4) : null;
                            if (ra6Var != null) {
                                pVar3 = new l(11, ra6Var, pVar3);
                            }
                        }
                        return new b(pVar3);
                    default:
                        com.yandex.plus.pay.internal.network.urls.a aVar16 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar17 = aVar16.e;
                        com.yandex.plus.core.strings.a aVar18 = aVar16.f;
                        aVar17.getClass();
                        aVar18.getClass();
                        int ordinal4 = aVar18.ordinal();
                        if (ordinal4 == 0) {
                            pVar4 = new p("api.acquisition-gwe.plus.yandex.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar4 = new p("egw.acquisition.play.yangosaft.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        }
                        return new b(pVar4);
                }
            }
        });
        final int i6 = 4;
        bVar4.f = btf.b(new Function0() { // from class: com.yandex.plus.core.network.urls.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.core.network.hosts.a pVar;
                ra6 ra6Var;
                com.yandex.plus.core.network.hosts.a pVar2;
                com.yandex.plus.core.network.hosts.a pVar3;
                p pVar4;
                int i32 = i6;
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar5 = bVar4;
                switch (i32) {
                    case 0:
                        com.yandex.plus.pay.internal.network.urls.a aVar5 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar6 = aVar5.b;
                        com.yandex.plus.core.strings.a aVar7 = aVar5.c;
                        aVar6.getClass();
                        aVar7.getClass();
                        int ordinal = aVar7.ordinal();
                        if (ordinal == 0) {
                            pVar = new p("api.plus.yandex.net", "api.plus.tst.yandex.net", aVar6);
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar = new p("api.play.yangosaft.net", "api.plus.tst.yandex.net", aVar6);
                        }
                        if (aVar5.a != null) {
                            jyr jyrVar = p7m.e;
                            String f = f8g.E().a().f("graphql_host");
                            ra6Var = f != null ? new ra6(f, 4) : null;
                            if (ra6Var != null) {
                                pVar = new l(11, ra6Var, pVar);
                            }
                        }
                        return new b(pVar, "/graphql");
                    case 1:
                        com.yandex.plus.pay.internal.network.urls.a aVar8 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar9 = aVar8.b;
                        aVar9.getClass();
                        com.yandex.plus.core.network.hosts.a pVar5 = new p("avatars.mds.yandex.net", "avatars.mdst.yandex.net", aVar9);
                        if (aVar8.a != null) {
                            jyr jyrVar2 = p7m.e;
                            String f2 = f8g.E().a().f("avatar_host");
                            ra6Var = f2 != null ? new ra6(f2, 4) : null;
                            if (ra6Var != null) {
                                pVar5 = new l(11, ra6Var, pVar5);
                            }
                        }
                        return new b(pVar5, "/get-yapic/");
                    case 2:
                        com.yandex.plus.pay.internal.network.urls.a aVar10 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar11 = aVar10.e;
                        com.yandex.plus.core.strings.a aVar12 = aVar10.f;
                        aVar11.getClass();
                        aVar12.getClass();
                        int ordinal2 = aVar12.ordinal();
                        if (ordinal2 == 0) {
                            pVar2 = new p("external-api.mediabilling.yandex.ru", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar2 = new p("external-api.play.yangosaft.net", "external-api.mt.mediabilling.yandex.ru", aVar11);
                        }
                        if (aVar10.d != null) {
                            jyr jyrVar3 = p7m.e;
                            String f3 = f8g.E().a().f("mediabilling_host");
                            ra6Var = f3 != null ? new ra6(f3, 4) : null;
                            if (ra6Var != null) {
                                pVar2 = new l(11, ra6Var, pVar2);
                            }
                        }
                        return new b(pVar2);
                    case 3:
                        com.yandex.plus.pay.internal.network.urls.a aVar13 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar14 = aVar13.e;
                        com.yandex.plus.core.strings.a aVar15 = aVar13.f;
                        aVar14.getClass();
                        aVar15.getClass();
                        int ordinal3 = aVar15.ordinal();
                        if (ordinal3 == 0) {
                            pVar3 = new p("api.events.plus.yandex.net", "api.events.plus.tst.yandex.net", aVar14);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar3 = new p("api.events.play.yangosaft.net", "api.events.plus.tst.yandex.net", aVar14);
                        }
                        if (aVar13.d != null) {
                            jyr jyrVar4 = p7m.e;
                            String f4 = f8g.E().a().f("dwh_events_host");
                            ra6Var = f4 != null ? new ra6(f4, 4) : null;
                            if (ra6Var != null) {
                                pVar3 = new l(11, ra6Var, pVar3);
                            }
                        }
                        return new b(pVar3);
                    default:
                        com.yandex.plus.pay.internal.network.urls.a aVar16 = (com.yandex.plus.pay.internal.network.urls.a) bVar5.c;
                        com.yandex.plus.core.config.a aVar17 = aVar16.e;
                        com.yandex.plus.core.strings.a aVar18 = aVar16.f;
                        aVar17.getClass();
                        aVar18.getClass();
                        int ordinal4 = aVar18.ordinal();
                        if (ordinal4 == 0) {
                            pVar4 = new p("api.acquisition-gwe.plus.yandex.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            pVar4 = new p("egw.acquisition.play.yangosaft.net", "api.acquisition-gwe.plus.tst.yandex.net", aVar17);
                        }
                        return new b(pVar4);
                }
            }
        });
        this.D = bVar4;
        this.E = btf.b(h.a);
        final int i7 = 1;
        this.F = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.f
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        i iVar3 = this.b;
                        return new com.yandex.plus.pay.internal.common.g(iVar3.h, iVar3.m);
                    default:
                        com.yandex.plus.pay.internal.common.e eVar2 = this.b.v;
                        com.yandex.plus.core.network.error.a aVar42 = new com.yandex.plus.core.network.error.a();
                        btf.b(new w(0, eVar2, com.yandex.plus.core.analytics.d.class, "getDiagnosticReporter", "getDiagnosticReporter()Lcom/yandex/plus/core/analytics/DiagnosticReporter;", 0, 21));
                        return aVar42;
                }
            }
        });
    }

    public final x3f a() {
        return (x3f) this.C.getValue();
    }

    public final com.yandex.plus.core.locale.a b() {
        return (com.yandex.plus.core.locale.a) this.B.getValue();
    }

    public final String c() {
        Context context = this.j;
        context.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        return packageName;
    }
}
