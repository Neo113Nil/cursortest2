package ru.yandex.taxi.notifications;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.mdh;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements vpr, jms {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrder taxiOrder = (TaxiOrder) obj;
        b bVar = this.a;
        pzt0 pzt0Var = bVar.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!bVar.m(taxiOrder)) {
            tse tseVar = bVar.a;
            bVar.b.getClass();
            sjh sjhVar = uyj.a;
            bVar.h = tje.N(tseVar, mdh.b, null, new ExtendedNotificationImageRefreshInteractor$onNotificationShown$1(bVar, taxiOrder, null), 2);
        }
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, b.class, "onNotificationShown", "onNotificationShown(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
