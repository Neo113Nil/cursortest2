package com.yandex.plus.core.network.okhttp.client;

import com.yandex.plus.core.network.error.j;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.core.network.retrofit.client.a b;

    public /* synthetic */ c(com.yandex.plus.core.network.retrofit.client.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                th.getClass();
                return ((com.yandex.plus.core.network.okhttp.error.a) this.b.b).a(j.a, th);
            default:
                return ((com.yandex.plus.core.network.okhttp.error.a) this.b.b).a(j.a, th);
        }
    }
}
