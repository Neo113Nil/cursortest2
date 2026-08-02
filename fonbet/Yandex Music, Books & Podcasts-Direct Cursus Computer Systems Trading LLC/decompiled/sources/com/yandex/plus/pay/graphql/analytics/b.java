package com.yandex.plus.pay.graphql.analytics;

import android.os.SystemClock;
import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.exception.e;
import defpackage.ack;
import defpackage.alc;
import defpackage.b6e;
import defpackage.bck;
import defpackage.bse;
import defpackage.c11;
import defpackage.clc;
import defpackage.d0o;
import defpackage.gp0;
import defpackage.h0o;
import defpackage.kkp;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.ow1;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.ub7;
import defpackage.ukn;
import defpackage.v42;
import defpackage.z7o;
import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class b implements gp0, bse {
    public final com.yandex.plus.pay.diagnostic.impl.c a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final URI c;
    public final ConcurrentHashMap d;

    public b(com.yandex.plus.pay.diagnostic.impl.c cVar, com.yandex.plus.pay.log.impl.b bVar, URI uri) {
        cVar.getClass();
        bVar.getClass();
        this.a = cVar;
        this.b = bVar;
        this.c = uri;
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.gp0
    public final pjc a(kkp kkpVar, c11 c11Var) {
        return new clc(new alc(new ub7(12, c11Var.c(kkpVar), new com.yandex.plus.experiments.impl.cache.b(this, kkpVar, null, 11)), new ow1(this, (Continuation) null, 15)), new v42(this, kkpVar, (Continuation) null, 27));
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        Object t7oVar;
        d0o d0oVar = (d0o) uknVar.i;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = uknVar.f(d0oVar);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (!(t7oVar instanceof t7o)) {
            c(d0oVar, (l3o) t7oVar);
        }
        if (z7o.a(t7oVar) != null) {
            c(d0oVar, null);
        }
        qgg.h0(t7oVar);
        return (l3o) t7oVar;
    }

    public final void c(d0o d0oVar, l3o l3oVar) {
        String a = d0oVar.c.a("X-Request-Id");
        if (a == null || StringsKt.U(a)) {
            return;
        }
        h0o h0oVar = d0oVar.d;
        o3o o3oVar = l3oVar != null ? l3oVar.g : null;
        if (h0oVar == null && o3oVar == null) {
            return;
        }
        this.d.put(a, new a(h0oVar, o3oVar, SystemClock.elapsedRealtime()));
    }

    public final void d(String str, String str2, a aVar, Throwable th, com.yandex.plus.core.graphql.exception.a aVar2) {
        String message;
        ack ackVar;
        o3o o3oVar;
        h0o h0oVar;
        String H = (aVar == null || (h0oVar = aVar.a) == null) ? null : com.yandex.plus.bdui.flex.ui.a.H(h0oVar);
        if (aVar == null || (o3oVar = aVar.b) == null || (message = com.yandex.plus.bdui.flex.ui.a.I(o3oVar)) == null) {
            Throwable th2 = th == null ? aVar2 : th;
            message = th2 != null ? th2.getMessage() : null;
        }
        com.yandex.plus.pay.diagnostic.impl.c cVar = this.a;
        cVar.getClass();
        str2.getClass();
        if (aVar2 != null) {
            boolean z = aVar2 instanceof com.yandex.plus.core.graphql.exception.b;
            if (z) {
                ackVar = ack.Http;
            } else if (aVar2 instanceof com.yandex.plus.core.graphql.exception.c) {
                ackVar = ack.Network;
            } else if (aVar2 instanceof d) {
                ackVar = ack.Parse;
            } else {
                if (!(aVar2 instanceof e)) {
                    b6e.s();
                    return;
                }
                ackVar = ack.Unknown;
            }
            ack ackVar2 = ackVar;
            bck bckVar = cVar.a;
            String host = this.c.getHost();
            String str3 = host == null ? "no_value" : host;
            String str4 = str == null ? "no_value" : str;
            com.yandex.plus.core.graphql.exception.b bVar = z ? (com.yandex.plus.core.graphql.exception.b) aVar2 : null;
            Integer valueOf = bVar != null ? Integer.valueOf(bVar.a) : null;
            String num = valueOf != null ? valueOf.toString() : null;
            bckVar.a(str3, str2, str4, ackVar2, num == null ? "no_value" : num, message == null ? "no_value" : message, H == null ? "no_value" : H);
        }
    }
}
