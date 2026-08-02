package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import android.text.SpannedString;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.core.accounts.r;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.plus.acquisition.sdk.pay.common.api.i;
import com.yandex.plus.acquisition.sdk.pay.common.api.j;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import defpackage.cg6;
import defpackage.gld;
import defpackage.nm6;
import defpackage.pce;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a a;
    public final n b;
    public final com.yandex.plus.core.imageloader.b c;
    public final kotlinx.coroutines.a d;

    public d(com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a aVar, n nVar, com.yandex.plus.core.imageloader.b bVar, kotlinx.coroutines.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = nVar;
        this.c = bVar;
        this.d = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|31|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r6 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r6 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, cg6 cg6Var) {
        c cVar;
        Object obj;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) dVar.c).b(str);
                    pce pceVar = (pce) b.c;
                    pceVar.w = null;
                    pceVar.v = 0;
                    cVar.l = 1;
                    obj = b.w(cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        cVar = new c(dVar, cg6Var);
        obj = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (obj instanceof t7o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(k kVar) {
        boolean z;
        com.yandex.plus.acquisition.sdk.api.offers.c cVar = kVar.k;
        j jVar = kVar.g;
        if (cVar.c != null && !cVar.d.isEmpty() && !StringsKt.U(jVar.a) && !StringsKt.U(jVar.f) && !StringsKt.U(jVar.b)) {
            i e = jVar.e();
            if (!StringsKt.U(e.a) && !StringsKt.U(e.b) && !StringsKt.U(e.c)) {
                i d = jVar.d();
                if (!StringsKt.U(d.a) && !StringsKt.U(d.b) && !StringsKt.U(d.c)) {
                    z = true;
                    if (!z) {
                        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a.a(this.a, kVar.b, kVar.c, kVar.a, jVar.a, null, null, jVar.f, jVar.b, jVar.e().a, jVar.e().b, jVar.e().c, jVar.d().a, jVar.d().b, jVar.d().c, com.yandex.plus.acquisition.sdk.api.internal.diagnostic.a.c, kVar.j.e, 48);
                    }
                    return z;
                }
            }
        }
        z = false;
        if (!z) {
        }
        return z;
    }

    public final boolean c(k kVar) {
        com.yandex.plus.acquisition.sdk.api.offers.c cVar = kVar.k;
        j jVar = kVar.g;
        boolean z = (((cVar.c == null || !cVar.d.isEmpty()) && (cVar.c != null || cVar.d.isEmpty())) || StringsKt.U(jVar.a) || StringsKt.U(jVar.d) || StringsKt.U(jVar.e) || StringsKt.U(jVar.b)) ? false : true;
        if (z) {
            return z;
        }
        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a.a(this.a, kVar.b, kVar.c, kVar.a, jVar.a, jVar.d, jVar.e, null, jVar.b, null, null, null, null, null, null, com.yandex.plus.acquisition.sdk.api.internal.diagnostic.a.a, kVar.j.e, 16192);
        return z;
    }

    public final boolean d(k kVar) {
        com.yandex.plus.acquisition.sdk.api.offers.c cVar = kVar.k;
        j jVar = kVar.g;
        boolean z = (((cVar.c == null || !cVar.d.isEmpty()) && (cVar.c != null || cVar.d.isEmpty())) || StringsKt.U(jVar.a) || StringsKt.U(jVar.d) || StringsKt.U(jVar.e) || StringsKt.U(jVar.f) || StringsKt.U(jVar.b)) ? false : true;
        if (z) {
            return z;
        }
        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a.a(this.a, kVar.b, kVar.c, kVar.a, jVar.a, jVar.d, jVar.e, jVar.f, jVar.b, null, null, null, null, null, null, com.yandex.plus.acquisition.sdk.api.internal.diagnostic.a.b, kVar.j.e, 16128);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, List list, cg6 cg6Var) {
        b bVar;
        int i;
        Continuation continuation;
        Object obj;
        Object obj2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj3 = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i == 0) {
                    if (i == 1) {
                        aVar = bVar.j;
                        qgg.h0(obj3);
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.api.d(aVar, (com.yandex.plus.acquisition.sdk.button.section.ui.api.a) obj3);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = bVar.j;
                    qgg.h0(obj3);
                    return new com.yandex.plus.acquisition.sdk.button.section.ui.api.d(aVar, (com.yandex.plus.acquisition.sdk.button.section.ui.api.a) obj3);
                }
                qgg.h0(obj3);
                List o0 = CollectionsKt.o0(list, new r(5));
                List list2 = o0;
                Iterator it = list2.iterator();
                while (true) {
                    continuation = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((k) obj).a == 0) {
                        break;
                    }
                }
                k kVar = (k) obj;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((k) obj2).a == 1) {
                        break;
                    }
                }
                k kVar2 = (k) obj2;
                if (o0.isEmpty()) {
                    str.getClass();
                    str2.getClass();
                    return new com.yandex.plus.acquisition.sdk.button.section.ui.api.b(str, str2, new NoSuchElementException("The list of smart offers is empty"));
                }
                if (kVar != null && d(kVar) && kVar2 != null && d(kVar2)) {
                    return new com.yandex.plus.acquisition.sdk.button.section.ui.api.f(aVar, f(kVar), f(kVar2));
                }
                if (kVar != null && b(kVar)) {
                    bVar.j = aVar;
                    bVar.m = 1;
                    obj3 = gld.Q(new q(this, kVar, continuation, 23), bVar);
                } else {
                    if (kVar2 == null || !b(kVar2)) {
                        if (kVar != null && c(kVar)) {
                            return new com.yandex.plus.acquisition.sdk.button.section.ui.api.e(aVar, f(kVar));
                        }
                        if (kVar2 != null && c(kVar2)) {
                            return new com.yandex.plus.acquisition.sdk.button.section.ui.api.e(aVar, f(kVar2));
                        }
                        str.getClass();
                        str2.getClass();
                        return new com.yandex.plus.acquisition.sdk.button.section.ui.api.b(str, str2, new NoSuchElementException("No suitable offers were found in the list"));
                    }
                    bVar.j = aVar;
                    bVar.m = 2;
                    obj3 = gld.Q(new q(this, kVar2, continuation, 23), bVar);
                }
                return nm6Var;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj32 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i == 0) {
        }
    }

    public final com.yandex.plus.acquisition.sdk.button.section.ui.api.a f(k kVar) {
        SpannedString A = this.b.A(kVar);
        return new com.yandex.plus.acquisition.sdk.button.section.ui.api.a(k.a(kVar, A != null && kVar.f), A, null, null);
    }
}
