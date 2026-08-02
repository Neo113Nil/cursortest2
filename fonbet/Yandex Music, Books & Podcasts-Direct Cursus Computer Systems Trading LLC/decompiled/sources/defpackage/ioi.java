package defpackage;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ioi {
    public final bgv a;

    public ioi(Context context) {
        this.a = agv.a(context.getApplicationContext(), new h88(context.getApplicationContext()), new y9w(28));
    }

    public final void a(SslError sslError, SslErrorHandler sslErrorHandler, Function0 function0) {
        sslError.getClass();
        sslErrorHandler.getClass();
        if (this.a.b(sslError, new qdc(15, sslErrorHandler, function0))) {
            return;
        }
        sslError.getPrimaryError();
        sslErrorHandler.cancel();
        function0.invoke();
    }
}
