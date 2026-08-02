package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.yandex.messenger.websdk.api.MessengerParams;

/* loaded from: classes3.dex */
public final class l0o {
    public final MessengerParams a;
    public final vae b;
    public final ote c;

    public l0o(vbv vbvVar) {
        this.a = vbvVar.g;
        this.b = (vae) vbvVar.q.getValue();
        this.c = (ote) vbvVar.p.getValue();
    }

    public final b0o a() {
        b0o b0oVar = new b0o();
        b0oVar.a(HttpMessage.USER_AGENT, "AndroidMssngrWebSdk/255.0");
        b0oVar.a("X-VERSION", "5");
        MessengerParams messengerParams = this.a;
        b0oVar.a("X-Application-Id", messengerParams.a());
        b0oVar.a("X-Session-Id", this.c.a);
        b0oVar.a("X-UUID", this.b.b);
        String str = messengerParams.a;
        if (str != null) {
            b0oVar.a("X-METRICA-UUID", str);
        }
        return b0oVar;
    }
}
