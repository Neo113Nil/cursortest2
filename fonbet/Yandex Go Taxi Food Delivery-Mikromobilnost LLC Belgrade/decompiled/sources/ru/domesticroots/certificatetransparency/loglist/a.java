package ru.domesticroots.certificatetransparency.loglist;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.o370;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class a {
    public final /* synthetic */ o370 a;
    public final /* synthetic */ OkHttpClient b;

    public a(o370 o370Var, OkHttpClient okHttpClient) {
        this.a = o370Var;
        this.b = okHttpClient;
    }

    public final byte[] a() {
        return (byte[]) tje.Y(EmptyCoroutineContext.a, new LogListDataSourceFactory$createLogListService$1$get$1("https://browser-resources.s3.yandex.net/ctlog/ctlog.json", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, this.b, null));
    }
}
