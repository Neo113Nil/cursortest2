package defpackage;

import android.content.Context;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.PushToken;
import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class v4n {
    public final vae a;
    public final qdc b;
    public final tot c;
    public final l0o d;
    public final String e;
    public PushToken f;
    public final OkHttpClient g;
    public mkn h;

    public v4n(vbv vbvVar) {
        Context context = vbvVar.a;
        MessengerParams messengerParams = vbvVar.g;
        this.a = (vae) vbvVar.q.getValue();
        this.b = vbvVar.r;
        this.c = vbvVar.l;
        this.d = (l0o) vbvVar.D.getValue();
        this.e = context.getPackageName();
        this.g = (OkHttpClient) vbvVar.j.getValue();
        b0o b0oVar = new b0o();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        b0oVar.a("X-Request-Id", uuid);
        b0oVar.a("X-Application-Id", messengerParams.a());
        b0oVar.g("https://api.messenger.yandex.net/logout_client/");
    }
}
