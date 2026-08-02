package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import defpackage.aur;
import defpackage.gdk;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.y2x;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public int j;
    public final /* synthetic */ c k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.k = cVar;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            if (y2x.o(10000L, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        c cVar = this.k;
        com.yandex.plus.pay.log.impl.b.f(cVar.d, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "3ds.Error.TimeOut: timeOutTimeMs=10000", null, 12);
        com.yandex.plus.pay.ui.core.mobile.domain.a aVar = cVar.c;
        aVar.getClass();
        String str = this.l;
        str.getClass();
        gdk gdkVar = aVar.a;
        gdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", "3ds");
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("timeOutMillis", String.valueOf(10000L));
        linkedHashMap.put("_meta", gdk.c(new HashMap()));
        gdkVar.d("Error.WebView.Loading.Timeout", linkedHashMap);
        return Unit.a;
    }
}
