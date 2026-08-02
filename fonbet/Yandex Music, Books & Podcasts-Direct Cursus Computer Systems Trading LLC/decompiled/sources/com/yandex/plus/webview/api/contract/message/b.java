package com.yandex.plus.webview.api.contract.message;

import com.yandex.plus.core.analytics.logging.e;
import defpackage.aur;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ d l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = dVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b(this.l, this.m, continuation, 0);
            default:
                return new b(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.m;
        d dVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = d.b(dVar, str, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (obj != null) {
                    Function1 function1 = (Function1) dVar.c.get(obj.getClass());
                    if (function1 != null) {
                        function1.invoke(obj);
                    } else {
                        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
                        String n = hrg.n(obj, "Message handler not found for message ");
                        jyr jyrVar = e.a;
                        e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, n, null);
                    }
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.webview.api.message.a aVar = dVar.a;
                this.k = 1;
                Object o = aVar.o(str);
                return o == nm6Var2 ? nm6Var2 : o;
        }
    }
}
