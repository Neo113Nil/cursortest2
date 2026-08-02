package com.yandex.passport.common.mvi;

import com.yandex.passport.internal.filter.r;
import com.yandex.passport.internal.s;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.g1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.j1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.y;
import com.yandex.passport.internal.ui.bouncer.model.x0;
import defpackage.bca;
import defpackage.eno;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class d implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(pjc pjcVar, Object obj, int i) {
        this.a = i;
        this.b = pjcVar;
        this.c = obj;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new c(0, rjcVar, (x0) this.c), continuation);
                return collect == nm6.a ? collect : Unit.a;
            case 1:
                Object collect2 = this.b.collect(new c(3, rjcVar, (r) this.c), continuation);
                return collect2 == nm6.a ? collect2 : Unit.a;
            case 2:
                Object collect3 = ((t) this.b).collect(new s(rjcVar, (com.yandex.passport.internal.ui.bouncer.model.middleware.g) this.c, 3), continuation);
                return collect3 == nm6.a ? collect3 : Unit.a;
            case 3:
                Object collect4 = ((t) this.b).collect(new c(5, rjcVar, (l) this.c), continuation);
                return collect4 == nm6.a ? collect4 : Unit.a;
            case 4:
                Object collect5 = ((t) this.b).collect(new s(rjcVar, (p) this.c, 6), continuation);
                return collect5 == nm6.a ? collect5 : Unit.a;
            case 5:
                Object collect6 = ((t) this.b).collect(new c(6, rjcVar, (y) this.c), continuation);
                return collect6 == nm6.a ? collect6 : Unit.a;
            case 6:
                Object collect7 = ((t) this.b).collect(new c(7, rjcVar, (l0) this.c), continuation);
                return collect7 == nm6.a ? collect7 : Unit.a;
            case 7:
                Object collect8 = ((t) this.b).collect(new c(8, rjcVar, (r0) this.c), continuation);
                return collect8 == nm6.a ? collect8 : Unit.a;
            case 8:
                Object collect9 = ((t) this.b).collect(new c(9, rjcVar, (c1) this.c), continuation);
                return collect9 == nm6.a ? collect9 : Unit.a;
            case 9:
                Object collect10 = ((t) this.b).collect(new c(10, rjcVar, (g1) this.c), continuation);
                return collect10 == nm6.a ? collect10 : Unit.a;
            case 10:
                Object collect11 = ((t) this.b).collect(new c(11, rjcVar, (j1) this.c), continuation);
                return collect11 == nm6.a ? collect11 : Unit.a;
            case 11:
                Object collect12 = ((t) this.b).collect(new c(12, rjcVar, (n1) this.c), continuation);
                return collect12 == nm6.a ? collect12 : Unit.a;
            case 12:
                Object collect13 = ((t) this.b).collect(new c(13, rjcVar, (t1) this.c), continuation);
                return collect13 == nm6.a ? collect13 : Unit.a;
            case 13:
                Object collect14 = this.b.collect(new com.yandex.plus.core.debug.panel.internal.presentation.view.l(rjcVar, (com.yandex.passport.internal.core.accounts.h) this.c, 4), continuation);
                return collect14 == nm6.a ? collect14 : Unit.a;
            case 14:
                Object collect15 = ((bca) this.b).collect(new c(21, rjcVar, (Function1) this.c), continuation);
                return collect15 == nm6.a ? collect15 : Unit.a;
            case 15:
                Object collect16 = this.b.collect(new c(22, rjcVar, (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.c), continuation);
                return collect16 == nm6.a ? collect16 : Unit.a;
            case 16:
                Object collect17 = ((t) this.b).collect(new c(23, rjcVar, (com.yandex.plus.home.feature.webviews.internal.treasury.e) this.c), continuation);
                return collect17 == nm6.a ? collect17 : Unit.a;
            case 17:
                Object collect18 = this.b.collect(new c(24, rjcVar, (com.yandex.plus.home.graphql.plusstate.f) this.c), continuation);
                return collect18 == nm6.a ? collect18 : Unit.a;
            case 18:
                Object collect19 = this.b.collect(new c(25, rjcVar, (com.yandex.plus.home.graphql.user.e) this.c), continuation);
                return collect19 == nm6.a ? collect19 : Unit.a;
            case 19:
                Object collect20 = ((eno) this.b).collect(new com.yandex.plus.core.debug.panel.internal.presentation.view.l(rjcVar, (com.yandex.plus.home.plaque.feature.internal.presentation.h) this.c, 17), continuation);
                return collect20 == nm6.a ? collect20 : Unit.a;
            default:
                ((xdr) this.b).collect(new c(26, rjcVar, (com.yandex.plus.pay.ui.core.debug.internal.ui.log.k) this.c), continuation);
                return nm6.a;
        }
    }
}
