package com.yandex.plus.home.feature.panel.internal;

import android.content.Context;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.graphql.panel.g;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.r;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.bsd;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class f {
    public final fkn a;
    public final g b;
    public final com.yandex.plus.home.graphql.user.e c;
    public final com.yandex.plus.home.graphql.plusstate.f d;
    public final String e;
    public final j f;
    public final com.yandex.plus.core.dispatcher.b g;
    public final com.yandex.plus.core.analytics.logging.d h;
    public final com.yandex.plus.home.api.panel.g i;
    public final xdr j;
    public final DecimalFormat k;
    public tf6 l;

    public f(Context context, com.yandex.plus.core.imageloader.b bVar, fkn fknVar, com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar2, com.yandex.plus.core.theme.e eVar, y yVar, com.yandex.plus.core.strings.a aVar, g gVar, com.yandex.plus.home.graphql.user.e eVar2, com.yandex.plus.home.graphql.plusstate.f fVar, String str, j jVar, com.yandex.plus.home.analytics.c cVar, boolean z, com.yandex.plus.core.dispatcher.b bVar3, com.yandex.plus.core.analytics.logging.d dVar) {
        bVar2.getClass();
        eVar.getClass();
        aVar.getClass();
        gVar.getClass();
        eVar2.getClass();
        fVar.getClass();
        cVar.getClass();
        bVar3.getClass();
        this.a = fknVar;
        this.b = gVar;
        this.c = eVar2;
        this.d = fVar;
        this.e = str;
        this.f = jVar;
        this.g = bVar3;
        this.h = dVar;
        bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
        int i = 0;
        com.yandex.plus.home.api.panel.g gVar2 = new com.yandex.plus.home.api.panel.g(context, fknVar, eVar, yVar, bVar, new s(bsdVar, dVar), aVar, bVar2, z, bsdVar, com.yandex.plus.core.dispatcher.a.e, dVar, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, f.class, "onShortcutClick", "onShortcutClick(Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)V", i, 10), new q(2, this, f.class, "onFamilyShortcutClick", "onFamilyShortcutClick(Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Z)V", i, 23), new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, cVar, com.yandex.plus.home.analytics.c.class, "reportShortcutEvent", "reportShortcutEvent(Lcom/yandex/plus/home/feature/panel/internalapi/analytics/PlusShortcutEvent;)V", 0, 11));
        this.i = gVar2;
        this.j = ydr.a(com.yandex.plus.home.api.panel.b.a);
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        this.k = decimalFormat;
        gVar2.addOnAttachStateChangeListener(new r(3, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|(5:15|16|(3:18|(1:20)|21)|22|23)(2:25|26))(2:27|28))(4:29|30|31|32))(3:44|45|(2:47|35)(1:48))|33))|53|6|7|(0)(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r10 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0033, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0030, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, d0 d0Var, cg6 cg6Var) {
        b bVar;
        int i;
        t7o t7oVar;
        Object obj;
        Throwable a;
        int i2;
        Object b;
        f fVar2;
        int i3;
        fVar.getClass();
        try {
            if (cg6Var instanceof b) {
                bVar = (b) cg6Var;
                int i4 = bVar.p;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.p = i4 - Integer.MIN_VALUE;
                    Object obj2 = bVar.n;
                    nm6 nm6Var = nm6.a;
                    i = bVar.p;
                    if (i != 0) {
                        qgg.h0(obj2);
                        r7o r7oVar = z7o.b;
                        com.yandex.plus.home.graphql.user.e eVar = fVar.c;
                        bVar.j = d0Var;
                        bVar.k = fVar;
                        i2 = 0;
                        bVar.l = 0;
                        bVar.m = 0;
                        bVar.p = 1;
                        b = eVar.b(bVar);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        fVar2 = fVar;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d0Var = bVar.j;
                            qgg.h0(obj2);
                            if (!((Boolean) obj2).booleanValue()) {
                                throw new IllegalStateException("Check failed.");
                            }
                            obj = Unit.a;
                            r7o r7oVar2 = z7o.b;
                            a = z7o.a(obj);
                            if (a != null) {
                                com.yandex.plus.core.analytics.logging.d dVar = fVar.h;
                                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                                if (dVar.b(aVar)) {
                                    dVar.a(aVar, "PlusPanelViewManagerImpl", "Failed receiving family invitation", a);
                                }
                                fVar.b(d0Var);
                            }
                            return Unit.a;
                        }
                        int i5 = bVar.m;
                        int i6 = bVar.l;
                        f fVar3 = bVar.k;
                        d0 d0Var2 = bVar.j;
                        try {
                            qgg.h0(obj2);
                            b = ((z7o) obj2).a;
                            i2 = i5;
                            d0Var = d0Var2;
                            fVar2 = fVar3;
                            i3 = i6;
                        } catch (wis e) {
                            e = e;
                            d0Var = d0Var2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            d0Var = d0Var2;
                            r7o r7oVar4 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    }
                    qgg.h0(b);
                    j jVar = fVar2.f;
                    bVar.j = d0Var;
                    bVar.k = null;
                    bVar.l = i3;
                    bVar.m = i2;
                    bVar.p = 2;
                    obj2 = jVar.M((com.yandex.plus.home.repository.api.model.user.a) b, bVar);
                }
            }
            if (i != 0) {
            }
            qgg.h0(b);
            j jVar2 = fVar2.f;
            bVar.j = d0Var;
            bVar.k = null;
            bVar.l = i3;
            bVar.m = i2;
            bVar.p = 2;
            obj2 = jVar2.M((com.yandex.plus.home.repository.api.model.user.a) b, bVar);
        } catch (CancellationException e2) {
            throw e2;
        }
        bVar = new b(fVar, cg6Var);
        Object obj22 = bVar.n;
        nm6 nm6Var2 = nm6.a;
        i = bVar.p;
    }

    public final void b(d0 d0Var) {
        Continuation continuation = null;
        if (d0Var != null) {
            tf6 tf6Var = this.l;
            if (tf6Var != null) {
                x97.y(tf6Var, null, null, new c(this, d0Var, continuation, 1), 3);
                return;
            }
            return;
        }
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.core.analytics.logging.d dVar = this.h;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "PlusPanelViewManagerImpl", "onShortcutClick() action is null", null);
        }
    }
}
