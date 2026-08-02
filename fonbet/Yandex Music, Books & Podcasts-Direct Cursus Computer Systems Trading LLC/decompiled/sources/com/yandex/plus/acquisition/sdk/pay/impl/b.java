package com.yandex.plus.acquisition.sdk.pay.impl;

import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.acquisition.sdk.pay.impl.analytics.e;
import com.yandex.plus.acquisition.sdk.pay.impl.providers.d;
import com.yandex.plus.acquisition.sdk.pay.impl.providers.f;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.pay.internal.di.r;
import com.yandex.plus.pay.internal.g;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.pay.a a;
    public final com.yandex.plus.pay.ui.core.a b;
    public final kotlinx.coroutines.a c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;

    public b(com.yandex.plus.pay.a aVar, com.yandex.plus.pay.ui.core.a aVar2, kotlinx.coroutines.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i3 = 2;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i4 = 3;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i5 = 4;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i6 = 5;
        this.h = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i7 = 6;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        final int i8 = 7;
        this.i = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.pay.impl.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        com.yandex.plus.pay.a aVar4 = this.b.a;
                        aVar4.getClass();
                        r c = ((g) aVar4).c();
                        return new com.yandex.plus.acquisition.sdk.pay.impl.internal.b(c.A, c.B);
                    case 1:
                        com.yandex.plus.pay.a aVar5 = this.b.a;
                        aVar5.getClass();
                        return (h) ((g) aVar5).c().C.invoke();
                    case 2:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    case 3:
                        b bVar = this.b;
                        com.yandex.plus.pay.a aVar6 = bVar.a;
                        jyr jyrVar = bVar.j;
                        return new f(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), new d(aVar6, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) jyrVar.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar.l.getValue()));
                    case 4:
                        b bVar2 = this.b;
                        return new com.yandex.plus.acquisition.sdk.pay.impl.purchase.b(bVar2.b, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar2.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar2.l.getValue());
                    case 5:
                        b bVar3 = this.b;
                        return new e(bVar3.c, bVar3.a, (com.yandex.plus.acquisition.sdk.pay.impl.analytics.a) bVar3.j.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.analytics.b) bVar3.k.getValue(), (com.yandex.plus.acquisition.sdk.pay.impl.providers.a) bVar3.l.getValue());
                    case 6:
                        this.b.a.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
                    default:
                        return new com.yandex.plus.acquisition.sdk.pay.impl.subscription.a(this.b.a);
                }
            }
        });
        this.j = btf.b(new k0(10));
        this.k = btf.b(new k0(8));
        this.l = btf.b(new k0(9));
    }
}
