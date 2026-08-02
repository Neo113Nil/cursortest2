package ru.yandex.taxi.superapp;

import defpackage.bj20;
import defpackage.gcn;
import defpackage.h1p;
import defpackage.hgn;
import defpackage.jc00;
import defpackage.lvt;
import defpackage.s2p;
import defpackage.tje;
import defpackage.tse;
import defpackage.v6j0;
import defpackage.v8w0;
import defpackage.y5w0;
import defpackage.yrv0;
import defpackage.z6j0;
import defpackage.zut;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class j {
    public final tse a;
    public final h1p b;
    public final hgn c;
    public final yrv0 d;
    public final bj20 e;
    public final ru.yandex.taxi.superapp.payment.a f;
    public final com.yandex.go.order.external.tracking.h g;
    public final jc00 h;
    public final y5w0 i;
    public final s2p j;
    public final s2p k;
    public final s2p l;

    public j(tse tseVar, h1p h1pVar, hgn hgnVar, yrv0 yrv0Var, bj20 bj20Var, ru.yandex.taxi.superapp.payment.a aVar, com.yandex.go.order.external.tracking.h hVar, jc00 jc00Var, y5w0 y5w0Var, s2p s2pVar, s2p s2pVar2, s2p s2pVar3) {
        this.a = tseVar;
        this.b = h1pVar;
        this.c = hgnVar;
        this.d = yrv0Var;
        this.e = bj20Var;
        this.f = aVar;
        this.g = hVar;
        this.h = jc00Var;
        this.i = y5w0Var;
        this.j = s2pVar;
        this.k = s2pVar2;
        this.l = s2pVar3;
    }

    public final void a(z6j0 z6j0Var, gcn gcnVar) {
        tje.N(this.a, null, null, new SuperAppOrderFlowCheckoutDelegate$hasBoundCardsInGooglePay$1(gcnVar, this, z6j0Var, null), 3);
    }

    public final void b(gcn gcnVar) {
        tje.N(this.a, null, null, new SuperAppOrderFlowCheckoutDelegate$isGooglePaySupported$1(gcnVar, this, null), 3);
    }

    public final void c(v6j0 v6j0Var, gcn gcnVar) {
        zut zutVar;
        lvt lvtVar;
        String str = null;
        if (v6j0Var == null) {
            zutVar = new zut(r0, str, 6);
            lvtVar = lvt.f;
        } else {
            Integer num = v6j0Var.a;
            zut zutVar2 = new zut(num != null ? num.intValue() : 225, v6j0Var.d, 4);
            String str2 = v6j0Var.b;
            String str3 = v6j0Var.e;
            String str4 = v6j0Var.f;
            List list = v6j0Var.h;
            if (list == null) {
                list = EmptyList.a;
            }
            lvt lvtVar2 = new lvt(str2, null, str3, str4, list);
            zutVar = zutVar2;
            lvtVar = lvtVar2;
        }
        yrv0 yrv0Var = this.d;
        v8w0 v8w0Var = yrv0Var.f;
        String value = this.b.getValue();
        String b = yrv0Var.b();
        v8w0Var.getClass();
        HashMap hashMap = new HashMap();
        if (b != null) {
            hashMap.put("originScreen", b);
        }
        hashMap.put(Constants.KEY_SERVICE, value);
        hashMap.put("region_id", Integer.valueOf(zutVar.a));
        String str5 = zutVar.b;
        if (str5 != null) {
            hashMap.put("service_token", str5);
        }
        v8w0Var.a.a("Superapp.Checkout.GooglePayTokenRequested", hashMap, 1, kotlin.collections.b.f());
        tje.N(this.a, null, null, new SuperAppOrderFlowCheckoutDelegate$requestGooglePayToken$1(gcnVar, this, zutVar, lvtVar, null), 3);
    }
}
