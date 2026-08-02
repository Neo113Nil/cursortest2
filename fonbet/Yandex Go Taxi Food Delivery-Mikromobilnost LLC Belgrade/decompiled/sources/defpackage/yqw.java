package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.delivery.utils.auth.impl.user.StartupApi;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.logistics.sdk.network.a;

/* loaded from: classes5.dex */
public final class yqw {
    public static StartupApi a(Moshi moshi, String str) {
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.c.add(new uc());
        OkHttpClient okHttpClient = new OkHttpClient(aVar);
        s0k0 s0k0Var = new s0k0();
        s0k0Var.a = okHttpClient;
        s0k0Var.b(str);
        s0k0Var.a(r830.d(moshi));
        s0k0Var.d.add(new a(0));
        return (StartupApi) s0k0Var.c().b(StartupApi.class);
    }
}
