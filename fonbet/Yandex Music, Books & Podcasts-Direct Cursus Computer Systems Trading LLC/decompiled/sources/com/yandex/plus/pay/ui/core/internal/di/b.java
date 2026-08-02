package com.yandex.plus.pay.ui.core.internal.di;

import android.content.Context;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.internal.di.r;
import defpackage.btf;
import defpackage.jyr;
import defpackage.xdr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b {
    public final d a;
    public final jyr b;
    public final jyr c;

    public b(d dVar, int i) {
        switch (i) {
            case 1:
                this.a = dVar;
                final int i2 = 0;
                this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.c
                    public final /* synthetic */ b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                d dVar2 = this.b.a;
                                return new com.yandex.plus.pay.ui.core.internal.config.b(dVar2.e, dVar2.b);
                            default:
                                b bVar = this.b;
                                d dVar3 = bVar.a;
                                return new com.yandex.plus.pay.ui.core.internal.common.f(dVar3.f.n.h, (com.yandex.plus.pay.ui.core.internal.config.b) bVar.b.getValue(), dVar3.d);
                        }
                    }
                });
                final int i3 = 1;
                this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.c
                    public final /* synthetic */ b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                d dVar2 = this.b.a;
                                return new com.yandex.plus.pay.ui.core.internal.config.b(dVar2.e, dVar2.b);
                            default:
                                b bVar = this.b;
                                d dVar3 = bVar.a;
                                return new com.yandex.plus.pay.ui.core.internal.common.f(dVar3.f.n.h, (com.yandex.plus.pay.ui.core.internal.config.b) bVar.b.getValue(), dVar3.d);
                        }
                    }
                });
                break;
            default:
                this.a = dVar;
                final int i4 = 0;
                jyr b = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.a
                    public final /* synthetic */ b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                d dVar2 = this.b.a;
                                r rVar = dVar2.f;
                                String str = rVar.a;
                                com.yandex.plus.pay.common.api.model.a h = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, rVar.l);
                                r rVar2 = dVar2.f;
                                return new com.yandex.plus.pay.ui.core.internal.common.b(str, h, rVar2.i, rVar2.j, rVar2.n.h, new n(0, dVar2.d, com.yandex.plus.pay.a.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0, 25), (h) rVar2.C.get(), rVar2.m, rVar2.B, rVar2.A);
                            default:
                                d dVar3 = this.b.a;
                                Context context = dVar3.f.l;
                                com.yandex.plus.pay.common.api.model.a h2 = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, context);
                                String packageName = context.getPackageName();
                                packageName.getClass();
                                String h3 = com.yandex.plus.home.common.utils.a.h(context);
                                r rVar3 = dVar3.f;
                                xdr xdrVar = rVar3.n.h;
                                String str2 = rVar3.a;
                                n nVar = new n(0, dVar3.d, com.yandex.plus.pay.a.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0, 27);
                                h hVar = (h) rVar3.C.get();
                                return new com.yandex.plus.pay.ui.core.internal.common.d(str2, h2, rVar3.h, packageName, h3, xdrVar, nVar, hVar, rVar3.m, rVar3.o, rVar3.s, new n(0, context, com.yandex.plus.pay.common.api.utils.a.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1, 28), rVar3.B, rVar3.A);
                        }
                    }
                });
                final int i5 = 1;
                jyr b2 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.a
                    public final /* synthetic */ b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                d dVar2 = this.b.a;
                                r rVar = dVar2.f;
                                String str = rVar.a;
                                com.yandex.plus.pay.common.api.model.a h = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, rVar.l);
                                r rVar2 = dVar2.f;
                                return new com.yandex.plus.pay.ui.core.internal.common.b(str, h, rVar2.i, rVar2.j, rVar2.n.h, new n(0, dVar2.d, com.yandex.plus.pay.a.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0, 25), (h) rVar2.C.get(), rVar2.m, rVar2.B, rVar2.A);
                            default:
                                d dVar3 = this.b.a;
                                Context context = dVar3.f.l;
                                com.yandex.plus.pay.common.api.model.a h2 = com.yandex.plus.home.plaque.animator.internal.utils.a.h(com.yandex.plus.pay.common.api.model.a.b, context);
                                String packageName = context.getPackageName();
                                packageName.getClass();
                                String h3 = com.yandex.plus.home.common.utils.a.h(context);
                                r rVar3 = dVar3.f;
                                xdr xdrVar = rVar3.n.h;
                                String str2 = rVar3.a;
                                n nVar = new n(0, dVar3.d, com.yandex.plus.pay.a.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0, 27);
                                h hVar = (h) rVar3.C.get();
                                return new com.yandex.plus.pay.ui.core.internal.common.d(str2, h2, rVar3.h, packageName, h3, xdrVar, nVar, hVar, rVar3.m, rVar3.o, rVar3.s, new n(0, context, com.yandex.plus.pay.common.api.utils.a.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1, 28), rVar3.B, rVar3.A);
                        }
                    }
                });
                this.b = btf.b(new n(0, (com.yandex.plus.pay.ui.core.internal.common.b) b.getValue(), com.yandex.plus.pay.ui.core.internal.common.b.class, "create", "create()LPayUIEvgenAnalytics;", 0, 24));
                this.c = btf.b(new n(0, (com.yandex.plus.pay.ui.core.internal.common.d) b2.getValue(), com.yandex.plus.pay.ui.core.internal.common.d.class, "create", "create()LPayUIEvgenDiagnostic;", 0, 26));
                break;
        }
    }
}
