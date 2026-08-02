package com.yandex.plus.pay.internal.di;

import com.yandex.plus.pay.data.mb.dto.c1;
import defpackage.btf;
import defpackage.g8m;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.u75;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e {
    public final i a;
    public final com.yandex.plus.metrica.utils.n b;
    public final jyr c;
    public final jyr d;
    public final com.yandex.plus.pay.log.impl.b e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;

    public e(i iVar, String str, String str2, final com.yandex.plus.metrica.utils.n nVar, final jk6 jk6Var, g8m g8mVar, com.yandex.plus.metrica.utils.n nVar2) {
        str.getClass();
        str2.getClass();
        this.a = iVar;
        this.b = nVar2;
        final int i = 0;
        this.c = btf.b(new a(this, i));
        jyr b = btf.b(new a(this, 8));
        this.d = b;
        com.yandex.plus.pay.reporter.api.f fVar = (com.yandex.plus.pay.reporter.api.f) b.getValue();
        List i2 = u75.i(g8mVar != null ? new com.yandex.plus.pay.internal.common.f(g8mVar) : null);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        this.e = new com.yandex.plus.pay.log.impl.b(fVar, i2, com.yandex.plus.core.analytics.logging.e.c());
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        e eVar = this.b;
                        i iVar2 = eVar.a;
                        return new com.yandex.plus.pay.internal.analytics.evgen.d(iVar2.c(), iVar2.i, iVar2.a, new a(eVar, 2), new b(jk6Var, 0), iVar2.w.h, nVar, iVar2.s, iVar2.h, new c1(29, eVar), new a(eVar, 3), new a(eVar, 4), new com.yandex.plus.metrica.utils.n(0, iVar2.j, com.yandex.plus.pay.common.api.utils.a.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1, 19));
                    default:
                        e eVar2 = this.b;
                        i iVar3 = eVar2.a;
                        return new com.yandex.plus.pay.internal.analytics.evgen.c(iVar3.c(), iVar3.i, iVar3.a, new a(eVar2, 5), new b(jk6Var, 1), iVar3.w.h, nVar, new a(eVar2, 6));
                }
            }
        });
        final int i3 = 1;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.di.c
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        e eVar = this.b;
                        i iVar2 = eVar.a;
                        return new com.yandex.plus.pay.internal.analytics.evgen.d(iVar2.c(), iVar2.i, iVar2.a, new a(eVar, 2), new b(jk6Var, 0), iVar2.w.h, nVar, iVar2.s, iVar2.h, new c1(29, eVar), new a(eVar, 3), new a(eVar, 4), new com.yandex.plus.metrica.utils.n(0, iVar2.j, com.yandex.plus.pay.common.api.utils.a.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1, 19));
                    default:
                        e eVar2 = this.b;
                        i iVar3 = eVar2.a;
                        return new com.yandex.plus.pay.internal.analytics.evgen.c(iVar3.c(), iVar3.i, iVar3.a, new a(eVar2, 5), new b(jk6Var, 1), iVar3.w.h, nVar, new a(eVar2, 6));
                }
            }
        });
        this.h = btf.b(new a(this, 9));
        this.i = btf.b(new a(this, 10));
        this.j = btf.b(new a(this, 11));
        this.k = btf.b(new a(this, 12));
        this.l = btf.b(new a(this, 13));
        this.m = btf.b(new a(this, i3));
        this.n = btf.b(new com.yandex.plus.bdui.flex.factory.p(17, str, str2, this));
    }
}
