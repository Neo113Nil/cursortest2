package com.yandex.passport.internal.network.requester;

import android.graphics.Bitmap;
import com.connectsdk.etc.helper.HttpMessage;
import defpackage.b0o;
import defpackage.d0o;
import defpackage.mkn;
import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(e eVar, String str, int i) {
        this.a = i;
        this.b = eVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b.b.get(this.c);
            default:
                b0o b0oVar = new b0o();
                b0oVar.g(this.c);
                b0oVar.a(HttpMessage.USER_AGENT, com.yandex.passport.common.web.b.a);
                d0o b = b0oVar.b();
                OkHttpClient okHttpClient = this.b.a;
                okHttpClient.getClass();
                return new mkn(okHttpClient, b, false).execute().g.a();
        }
    }
}
