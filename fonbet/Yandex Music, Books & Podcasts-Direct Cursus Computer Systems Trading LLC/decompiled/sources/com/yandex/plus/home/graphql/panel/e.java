package com.yandex.plus.home.graphql.panel;

import com.yandex.passport.sloth.ui.p;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.i;
import defpackage.b6e;
import defpackage.bqi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.tf6;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xqn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class e implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ g c;
    public final /* synthetic */ xqn d;
    public final /* synthetic */ String e;

    public e(rjc rjcVar, xqn xqnVar, g gVar, xqn xqnVar2, String str) {
        this.a = rjcVar;
        this.b = xqnVar;
        this.c = gVar;
        this.d = xqnVar2;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        d dVar;
        int i;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    Object obj3 = (com.yandex.plus.home.repository.api.model.f) obj;
                    xqn xqnVar = this.d;
                    xqn xqnVar2 = this.b;
                    g gVar = this.c;
                    if (obj3 == null) {
                        xdr xdrVar = (xdr) ((bqi) xqnVar2.a);
                        xdrVar.getClass();
                        obj3 = com.yandex.plus.home.repository.api.model.c.a;
                        xdrVar.m(null, obj3);
                        tf6 tf6Var = gVar.g;
                        ((com.yandex.plus.core.dispatcher.a) gVar.f).getClass();
                        x97.y(tf6Var, com.yandex.plus.core.dispatcher.a.e.plus((CoroutineContext) xqnVar.a), null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(xqnVar2, gVar, this.e, (Continuation) null), 2);
                    } else if (!(obj3 instanceof com.yandex.plus.home.repository.api.model.c)) {
                        if (obj3 instanceof com.yandex.plus.home.repository.api.model.e) {
                            List list = ((i) ((com.yandex.plus.home.repository.api.model.e) obj3).a).c;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : list) {
                                if (((b0) obj4).d) {
                                    arrayList.add(obj4);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((b0) it.next()).a);
                            }
                            if (!arrayList2.isEmpty()) {
                                tf6 tf6Var2 = gVar.g;
                                ((com.yandex.plus.core.dispatcher.a) gVar.f).getClass();
                                x97.y(tf6Var2, com.yandex.plus.core.dispatcher.a.e.plus((CoroutineContext) xqnVar.a), null, new p(xqnVar2, this.c, this.e, obj3, arrayList2, (Continuation) null, 5), 2);
                            }
                        } else if (!(obj3 instanceof com.yandex.plus.home.repository.api.model.b)) {
                            b6e.s();
                            return null;
                        }
                    }
                    dVar.k = 1;
                    if (this.a.emit(obj3, dVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        dVar = new d(this, continuation);
        Object obj22 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }
}
