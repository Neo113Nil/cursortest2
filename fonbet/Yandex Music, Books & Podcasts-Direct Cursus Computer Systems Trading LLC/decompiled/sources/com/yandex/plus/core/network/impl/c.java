package com.yandex.plus.core.network.impl;

import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.pay.internal.di.d;
import defpackage.btf;
import defpackage.d0o;
import defpackage.ds3;
import defpackage.es3;
import defpackage.jyr;
import defpackage.mkn;
import defpackage.w77;
import defpackage.x97;
import java.util.Deque;
import java.util.LinkedList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class c implements ds3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public c(com.yandex.plus.core.network.okhttp.client.b bVar, com.yandex.plus.core.network.okhttp.client.b bVar2) {
        int i = d.a;
        this.b = new ThreadLocal();
        this.c = btf.b(new p(this, bVar, bVar2));
    }

    public Deque a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new LinkedList();
            threadLocal.set(obj);
        }
        return (Deque) obj;
    }

    @Override // defpackage.ds3
    public final es3 b(d0o d0oVar) {
        int i = this.a;
        d0oVar.getClass();
        switch (i) {
            case 0:
                OkHttpClient okHttpClient = (OkHttpClient) ((jyr) this.c).getValue();
                okHttpClient.getClass();
                return new b(new mkn(okHttpClient, d0oVar, false));
            default:
                return ((c) this.b).b(d0oVar);
        }
    }

    public final Object c(Object obj, Function2 function2) {
        switch (this.a) {
            case 0:
                obj.getClass();
                a().push(obj);
                try {
                    return x97.D(g.a, new w77(function2, obj, (Continuation) null));
                } finally {
                    a().pop();
                }
            default:
                ((com.yandex.plus.core.network.context.a) obj).getClass();
                return ((c) this.b).c((com.yandex.plus.core.network.okhttp.call.a) this.c, new w77(function2, (Continuation) null, 8));
        }
    }

    public c(c cVar, com.yandex.plus.core.network.okhttp.call.a aVar) {
        cVar.getClass();
        this.b = cVar;
        this.c = aVar;
    }
}
