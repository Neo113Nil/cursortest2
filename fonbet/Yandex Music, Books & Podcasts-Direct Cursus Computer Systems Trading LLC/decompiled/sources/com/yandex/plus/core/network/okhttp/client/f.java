package com.yandex.plus.core.network.okhttp.client;

import defpackage.cg6;
import defpackage.ea0;
import defpackage.j0v;
import defpackage.ukn;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f implements com.yandex.plus.core.network.interceptor.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.core.network.retrofit.client.a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(com.yandex.plus.core.network.retrofit.client.a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    @Override // com.yandex.plus.core.network.interceptor.a
    public final Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        switch (this.a) {
            case 0:
                return com.yandex.plus.core.network.retrofit.client.a.a(this.b, eVar.a, (com.yandex.plus.core.network.request.b) eVar.b, new ea0((com.yandex.plus.core.network.interceptor.a) this.c, eVar, (Continuation) null), cg6Var);
            default:
                com.yandex.plus.core.network.context.a aVar = eVar.a;
                com.yandex.plus.core.network.request.b bVar = (com.yandex.plus.core.network.request.b) eVar.b;
                com.yandex.plus.core.network.retrofit.client.a aVar2 = this.b;
                return com.yandex.plus.core.network.retrofit.client.a.a(aVar2, aVar, bVar, new j0v(aVar2, (ukn) this.c, null, 19), cg6Var);
        }
    }
}
