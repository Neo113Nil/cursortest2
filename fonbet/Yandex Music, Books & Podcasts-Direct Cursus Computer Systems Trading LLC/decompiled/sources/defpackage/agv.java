package defpackage;

import android.content.Context;
import android.net.http.SslError;

/* loaded from: classes5.dex */
public interface agv {
    static bgv a(Context context, h88 h88Var, y9w y9wVar) {
        return new bgv(context.getApplicationContext(), h88Var, y9wVar);
    }

    boolean b(SslError sslError, zfv zfvVar);
}
