package com.yandex.plus.acquisition.adapter.internal.processor;

import com.yandex.plus.acquisition.sdk.button.section.ui.api.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d;
import com.yandex.plus.acquisition.sdk.pay.impl.providers.f;
import defpackage.bca;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uop;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.acquisition.sdk.pay.impl.b a;
    public final d b;
    public final com.yandex.plus.acquisition.adapter.internal.analytics.a c;
    public final xdr d;
    public final bca e;

    public b(com.yandex.plus.acquisition.sdk.pay.impl.b bVar, d dVar, com.yandex.plus.acquisition.adapter.internal.analytics.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = dVar;
        this.c = aVar;
        xdr a = ydr.a(null);
        this.d = a;
        this.e = new bca(a, 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r0 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Map map, String str3, boolean z, com.yandex.plus.acquisition.adapter.api.d dVar, Continuation continuation) {
        a aVar;
        int i;
        com.yandex.plus.acquisition.sdk.pay.common.api.a a;
        String str4;
        String str5;
        boolean z2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.q = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.o;
                nm6 nm6Var = nm6.a;
                i = aVar2.q;
                xdr xdrVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    c cVar = new c(str, str2);
                    xdrVar.getClass();
                    xdrVar.m(null, cVar);
                    this.c.getClass();
                    a = com.yandex.plus.acquisition.adapter.internal.analytics.a.a(dVar);
                    f fVar = (f) this.a.f.getValue();
                    Set b = uop.b(str2);
                    aVar2.j = str;
                    aVar2.k = str2;
                    aVar2.l = a;
                    aVar2.n = z;
                    aVar2.q = 1;
                    obj = fVar.a(str, b, map, str3, z, a, aVar2);
                    if (obj != nm6Var) {
                        str4 = str2;
                        str5 = str;
                        z2 = z;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = aVar2.m;
                    qgg.h0(obj);
                    xdrVar.l(obj);
                    return Unit.a;
                }
                z2 = aVar2.n;
                com.yandex.plus.acquisition.sdk.pay.common.api.a aVar3 = aVar2.l;
                str4 = aVar2.k;
                String str6 = aVar2.j;
                qgg.h0(obj);
                a = aVar3;
                str5 = str6;
                aVar2.j = null;
                aVar2.k = null;
                aVar2.l = null;
                aVar2.m = xdrVar;
                aVar2.n = z2;
                aVar2.q = 2;
                obj = this.b.e(str5, str4, a, (List) obj, aVar2);
            }
        }
        aVar = new a(this, continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.o;
        nm6 nm6Var2 = nm6.a;
        i = aVar22.q;
        xdr xdrVar2 = this.d;
        if (i != 0) {
        }
        aVar22.j = null;
        aVar22.k = null;
        aVar22.l = null;
        aVar22.m = xdrVar2;
        aVar22.n = z2;
        aVar22.q = 2;
        obj2 = this.b.e(str5, str4, a, (List) obj2, aVar22);
    }
}
