package ru.domesticroots.webview;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import defpackage.egz;
import defpackage.j79;
import defpackage.ql60;
import defpackage.rl60;
import defpackage.rt41;
import defpackage.st41;
import defpackage.tgz;

/* loaded from: classes4.dex */
public final class d implements st41 {
    public final Context a;
    public final rl60 b;
    public final ql60 c;
    public final j79 e = new j79();
    public final egz d = tgz.G2;

    public d(Context context, rl60 rl60Var, ql60 ql60Var) {
        this.a = context;
        this.b = rl60Var;
        this.c = ql60Var;
    }

    @Override // defpackage.st41
    public final boolean b(SslError sslError, rt41 rt41Var) {
        if (sslError.getPrimaryError() != 3 || sslError.hasError(2)) {
            return false;
        }
        new DownloadCertsAndCheckTask(this.a, sslError, Uri.parse(sslError.getUrl()).buildUpon().clearQuery().path("/").toString(), this.b, this.c, this.e, rt41Var, this.d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }
}
