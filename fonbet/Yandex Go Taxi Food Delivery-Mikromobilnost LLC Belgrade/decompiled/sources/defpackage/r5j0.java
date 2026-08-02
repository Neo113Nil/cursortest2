package defpackage;

import com.yandex.messenger.websdk.api.MessengerParams;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public final class r5j0 {
    public final MessengerParams a;
    public final o6v b;
    public final drw c;

    public r5j0(qh41 qh41Var) {
        this.a = qh41Var.g;
        this.b = (o6v) qh41Var.q.getValue();
        this.c = (drw) qh41Var.p.getValue();
    }

    public final t4j0 a() {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, "AndroidMssngrWebSdk/252.0");
        t4j0Var.c.a("X-VERSION", "5");
        MessengerParams messengerParams = this.a;
        t4j0Var.c.a("X-Application-Id", messengerParams.a());
        t4j0Var.c.a("X-Session-Id", this.c.a);
        t4j0Var.c.a("X-UUID", this.b.b);
        String str = messengerParams.d;
        if (str != null) {
            t4j0Var.a("X-METRICA-UUID", str);
        }
        return t4j0Var;
    }
}
