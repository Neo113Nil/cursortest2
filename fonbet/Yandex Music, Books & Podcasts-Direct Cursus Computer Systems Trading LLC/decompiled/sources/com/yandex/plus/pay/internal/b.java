package com.yandex.plus.pay.internal;

import com.yandex.plus.pay.internal.analytics.tarifficator.o;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.feature.payment.i;
import com.yandex.plus.pay.internal.feature.user.h;
import com.yandex.plus.pay.internal.feature.user.j;
import defpackage.ie5;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ b(String str, g gVar) {
        this.a = 11;
        this.b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b.d.b();
            case 1:
                g gVar = this.b;
                return new com.yandex.plus.pay.internal.feature.upsale.f((com.yandex.plus.pay.internal.feature.upsale.a) gVar.b.e.m.getValue(), gVar.d());
            case 2:
                g gVar2 = this.b;
                u uVar = gVar2.b;
                return new com.yandex.plus.pay.internal.feature.user.b((h) uVar.d.n.getValue(), (com.yandex.plus.pay.internal.feature.user.f) uVar.d.o.getValue(), gVar2.d());
            case 3:
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.e((com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b) this.b.b.e.j.getValue());
            case 4:
                g gVar3 = this.b;
                return new com.yandex.plus.pay.internal.feature.payment.a(gVar3.b, gVar3.d());
            case 5:
                g gVar4 = this.b;
                return new i(gVar4.b, gVar4.d());
            case 6:
                g gVar5 = this.b;
                return new com.yandex.plus.pay.internal.feature.user.d((j) gVar5.b.e.n.getValue(), gVar5.d());
            case 7:
                g gVar6 = this.b;
                return new com.yandex.plus.pay.internal.feature.family.d((com.yandex.plus.pay.internal.feature.family.b) gVar6.b.e.v.getValue(), gVar6.d());
            case 8:
                g gVar7 = this.b;
                return new com.yandex.plus.pay.internal.feature.contacts.d((com.yandex.plus.pay.internal.feature.contacts.b) gVar7.b.e.x.getValue(), gVar7.d());
            case 9:
                this.b.b.getClass();
                return null;
            case 10:
                this.b.b.getClass();
                return null;
            case 11:
                u uVar2 = this.b.b;
                com.yandex.plus.pay.api.analytics.tarifficator.e eVar = (com.yandex.plus.pay.api.analytics.tarifficator.e) ((jyr) uVar2.c.i).getValue();
                com.yandex.plus.pay.api.analytics.tarifficator.c cVar = (com.yandex.plus.pay.api.analytics.tarifficator.c) ((jyr) uVar2.c.j).getValue();
                ie5 ie5Var = uVar2.c;
                return new o(eVar, cVar, (com.yandex.plus.pay.api.analytics.tarifficator.b) ((jyr) ie5Var.k).getValue(), (com.yandex.plus.pay.api.analytics.tarifficator.a) ((jyr) ie5Var.l).getValue(), (com.yandex.plus.pay.api.analytics.tarifficator.g) ((jyr) ie5Var.n).getValue(), (com.yandex.plus.pay.api.analytics.tarifficator.f) ((jyr) ie5Var.o).getValue(), (com.yandex.plus.pay.api.analytics.tarifficator.d) ((jyr) ie5Var.p).getValue());
            default:
                g gVar8 = this.b;
                return new com.yandex.plus.pay.internal.feature.mailing.f((com.yandex.plus.pay.internal.feature.mailing.a) gVar8.b.e.w.getValue(), gVar8.d());
        }
    }

    public /* synthetic */ b(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }
}
