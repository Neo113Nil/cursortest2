package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;

/* loaded from: classes5.dex */
public final class bgv implements agv {
    public final Context a;
    public final h88 b;
    public final y9w c;
    public final pt0 e = new pt0(11);
    public final x2i d = osg.k0;

    public bgv(Context context, h88 h88Var, y9w y9wVar) {
        this.a = context;
        this.b = h88Var;
        this.c = y9wVar;
    }

    @Override // defpackage.agv
    public final boolean b(SslError sslError, zfv zfvVar) {
        if (sslError.getPrimaryError() != 3 || sslError.hasError(2)) {
            return false;
        }
        new naa(this.a, sslError, Uri.parse(sslError.getUrl()).buildUpon().clearQuery().path("/").toString(), this.b, this.c, this.e, zfvVar, this.d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }
}
