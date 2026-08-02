package com.yandex.plus.acquisition.sdk.common.impl.di;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.passport.internal.push.x0;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.adapter.auth.api.c;
import com.yandex.plus.core.analytics.h;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.benchmark.b0;
import com.yandex.plus.core.benchmark.d0;
import com.yandex.plus.core.benchmark.e0;
import com.yandex.plus.core.benchmark.y;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.metrica.utils.z;
import defpackage.a4g;
import defpackage.b6e;
import defpackage.bsd;
import defpackage.btf;
import defpackage.dq7;
import defpackage.evw;
import defpackage.gld;
import defpackage.jyr;
import defpackage.t75;
import defpackage.tf6;
import defpackage.wqr;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.acquisition.sdk.common.api.di.b a;
    public final jyr b = btf.b(new k0(5));
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public b(com.yandex.plus.acquisition.sdk.common.api.di.b bVar) {
        this.a = bVar;
        final int i = 1;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i2 = i;
                int i3 = 1;
                b bVar2 = this.b;
                switch (i2) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i3), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
        final int i2 = 2;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i2;
                int i3 = 1;
                b bVar2 = this.b;
                switch (i22) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i3), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
        btf.b(new k0(6));
        this.c = btf.b(new k0(7));
        final int i3 = 3;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i3;
                int i32 = 1;
                b bVar2 = this.b;
                switch (i22) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i32), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
        final int i4 = 4;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i4;
                int i32 = 1;
                b bVar2 = this.b;
                switch (i22) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i32), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
        final int i5 = 5;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i5;
                int i32 = 1;
                b bVar2 = this.b;
                switch (i22) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i32), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
        final int i6 = 0;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.common.impl.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i6;
                int i32 = 1;
                b bVar2 = this.b;
                switch (i22) {
                    case 0:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = bVar2.a;
                        Context context = (Context) bVar3.i;
                        com.yandex.plus.core.config.a aVar = (com.yandex.plus.core.config.a) bVar3.f;
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                        }
                        String str4 = str;
                        return ((com.yandex.plus.metrica.api.b) bVar3.e).a(context, str4, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", aVar, new x0(context, i32), new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 28));
                    case 1:
                        ((com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a) bVar2.b.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 2:
                        ((i) bVar2.d.getValue()).getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        jyr jyrVar = bVar2.c;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar4 = bVar2.a;
                        int ordinal2 = ((com.yandex.plus.core.config.a) bVar4.f).ordinal();
                        if (ordinal2 == 0) {
                            str2 = "3k20G4eV5cmBDMWxhyvXqf651stJFfVpeId8dV+kXA1q5dJSjFb2pWgfEheYTUxS";
                            str3 = "2x20HNWT5ZSEWcWxhy7X/xyoA7ggb85RVHMIux1XXPt+Ym/sp+1ZVPXv+RwNO2ci";
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            str2 = "20/lGNbEvpjWDMK+hy7Yrut12HQLzNXBa7frlDvQnOS4mKGmYxDJbD9ycJFBAivB";
                            str3 = "jBCxHNGSsciDDcCwhyre+1hiqknkcyuMrI7IOY6HkgzcDwTZSVa362DWBL9xyq1M";
                        }
                        String str5 = str2;
                        String str6 = str3;
                        com.yandex.plus.adapter.auth.passport750.i iVar = (com.yandex.plus.adapter.auth.passport750.i) bVar4.d;
                        c b = com.yandex.plus.bdui.flex.ui.a.b((com.yandex.plus.core.config.a) bVar4.f);
                        jyr jyrVar2 = e.a;
                        d a = e.a(com.yandex.plus.core.analytics.logging.b.a);
                        wqr n = a4g.n();
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        tf6 e = gld.e(kotlin.coroutines.e.c(n, com.yandex.plus.core.dispatcher.a.e));
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jyrVar.getValue())).getClass();
                        dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                        iVar.getClass();
                        bsdVar.getClass();
                        dq7Var.getClass();
                        return new i(iVar, b, str5, str6, a, e, bsdVar, dq7Var, "acquisition_sdk");
                    case 4:
                        return (com.yandex.plus.metrica.utils.i) ((com.yandex.plus.metrica.a) bVar2.f.getValue()).b.getValue();
                    default:
                        z a2 = ((com.yandex.plus.metrica.a) bVar2.f.getValue()).a();
                        b0 b0Var = new b0("PaySDK");
                        d0 d0Var = new d0(new evw(0, a2, h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 27));
                        return new e0(new evw(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 26), t75.c(new Pair(b0Var, d0Var)), new q(24), com.yandex.plus.core.dispatcher.b.a);
                }
            }
        });
    }
}
