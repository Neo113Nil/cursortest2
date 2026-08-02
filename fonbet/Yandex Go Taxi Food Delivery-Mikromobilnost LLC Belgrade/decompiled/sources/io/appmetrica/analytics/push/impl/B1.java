package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.rvj0;
import defpackage.sa7;
import defpackage.t4j0;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class B1 implements D0 {
    public final OkHttpClient a;

    public B1(Context context) {
        sa7 sa7Var = new sa7(context.getCacheDir(), 10485760L);
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.l = sa7Var;
        this.a = new OkHttpClient(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // io.appmetrica.analytics.push.impl.D0
    public final byte[] a(String str) {
        kvj0 kvj0Var;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(str);
        d5j0 d5j0Var = new d5j0(t4j0Var);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r0 = this;
            }
        } catch (IOException e) {
            e = e;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            kvj0Var = ((nci0) this.a.newCall(d5j0Var)).execute();
            try {
                rvj0 rvj0Var = kvj0Var.z;
                byte[] bytes = rvj0Var != null ? rvj0Var.bytes() : null;
                H2.a(kvj0Var);
                return bytes;
            } catch (IOException e2) {
                e = e2;
                PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
                H2.a(kvj0Var);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            kvj0Var = null;
            PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
            H2.a(kvj0Var);
            return null;
        } catch (Throwable th3) {
            th = th3;
            H2.a((Closeable) r0);
            throw th;
        }
    }
}
