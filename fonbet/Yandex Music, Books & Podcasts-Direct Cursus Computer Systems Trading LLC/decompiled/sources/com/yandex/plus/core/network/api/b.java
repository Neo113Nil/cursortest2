package com.yandex.plus.core.network.api;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import com.yandex.plus.home.common.network.e;
import com.yandex.plus.home.common.network.f;
import com.yandex.plus.home.common.network.g;
import com.yandex.plus.home.common.network.h;
import defpackage.l3o;
import defpackage.os3;
import defpackage.zhp;
import java.io.IOException;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import retrofit2.Call;
import retrofit2.Response;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class b implements os3 {
    public final /* synthetic */ os3 a;
    public final /* synthetic */ c b;

    public b(os3 os3Var, c cVar) {
        this.a = os3Var;
        this.b = cVar;
    }

    @Override // defpackage.os3
    public final void A(Call call, Throwable th) {
        call.getClass();
        String a = call.a().c.a("X-Request-Id");
        Timber.INSTANCE.tag("NetworkResultCall").e(th, "onFailure", new Object[0]);
        this.a.D(this.b, Response.b(th instanceof SSLException ? new com.yandex.plus.home.common.network.a(new f(th), a) : ((th instanceof JSONException) || (th instanceof MalformedJsonException) || (th instanceof JsonParseException) || (th instanceof zhp)) ? new com.yandex.plus.home.common.network.a(new e(th), a) : th instanceof IOException ? new com.yandex.plus.home.common.network.a(new com.yandex.plus.home.common.network.d(th), a) : new com.yandex.plus.home.common.network.a(new h(th), a)));
        call.cancel();
    }

    @Override // defpackage.os3
    public final void D(Call call, Response response) {
        Object aVar;
        call.getClass();
        l3o l3oVar = response.a;
        String a = l3oVar.f.a("X-Request-Id");
        String str = l3oVar.c;
        int i = l3oVar.d;
        if (200 <= i && i < 300) {
            Object obj = response.b;
            aVar = obj != null ? new com.yandex.plus.home.common.network.b(obj, a) : new com.yandex.plus.home.common.network.a(new h(new IllegalStateException("Response body is null")), a);
        } else if (i == 401 || i == 403) {
            str.getClass();
            aVar = new com.yandex.plus.home.common.network.a(new g(i, str), a);
        } else {
            str.getClass();
            aVar = new com.yandex.plus.home.common.network.a(new com.yandex.plus.home.common.network.c(i, str), a);
        }
        Timber.INSTANCE.tag("NetworkResultCall").d("onResponse. result = " + aVar, new Object[0]);
        this.a.D(this.b, Response.b(aVar));
    }
}
