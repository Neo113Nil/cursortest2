package com.yandex.passport.internal.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.m4;
import com.yandex.passport.internal.provider.InternalProvider;
import defpackage.btf;
import defpackage.dfi;
import defpackage.ern;
import defpackage.f9f;
import defpackage.lm4;
import defpackage.uah;
import defpackage.z7o;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class r0 implements com.yandex.passport.api.internal.a, a {
    public final IReporterYandex a;
    public final String b;
    public final boolean c;
    public final com.yandex.passport.internal.methods.requester.f d;
    public final g0 e;

    public r0(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        this.a = iReporterYandex;
        String string = context.getResources().getString(R.string.passport_process_name);
        string.getClass();
        this.b = string;
        this.c = StringsKt.U(string);
        com.yandex.passport.internal.autologin.ui.a aVar = new com.yandex.passport.internal.autologin.ui.a(iReporterYandex);
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Uri a = com.yandex.passport.internal.util.l.a(context.getPackageName());
        a.getClass();
        this.d = new com.yandex.passport.internal.methods.requester.f(new com.yandex.passport.common.network.n(12, contentResolver, a), aVar);
        this.e = new g0(new y(context, this));
        btf.b(new com.yandex.passport.internal.common.e(5, this));
    }

    public final com.yandex.passport.internal.entities.e a(z1 z1Var, com.yandex.passport.internal.credentials.f fVar) {
        q();
        try {
            com.yandex.passport.internal.methods.requester.f fVar2 = this.d;
            m4 m4Var = new m4(com.yandex.passport.internal.ui.a.D(z1Var), new com.yandex.passport.internal.credentials.f(fVar.a, fVar.b));
            int i = 0;
            f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.h.class), ern.a(com.yandex.passport.api.exception.c.class), ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.t.class)};
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                Looper.getMainLooper();
                Looper.myLooper();
            }
            Object A = com.yandex.passport.internal.ui.a.A(new com.yandex.passport.internal.methods.requester.b(fVar2, m4Var, null, i));
            f9f[] f9fVarArr2 = (f9f[]) Arrays.copyOf(f9fVarArr, 6);
            Throwable a = z7o.a(A);
            if (a == null) {
                if (!StringsKt.U(((com.yandex.passport.internal.entities.e) A).a)) {
                    return (com.yandex.passport.internal.entities.e) A;
                }
                b(z1Var.b, "getToken");
                throw new com.yandex.passport.api.exception.a();
            }
            int length = f9fVarArr2.length;
            while (i < length) {
                if (((lm4) f9fVarArr2[i]).i(a)) {
                    throw a;
                }
                i++;
            }
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "catch non-PassportException from provider", a);
            }
            throw new com.yandex.passport.api.exception.t(a);
        } catch (RuntimeException e) {
            r(e);
            throw e;
        }
    }

    public final void b(long j, String str) {
        HashMap r = com.appsflyer.internal.k.r("method_name", str);
        r.put("uid", String.valueOf(j));
        r.put("am_version", "7.54.1");
        this.a.reportEvent(com.yandex.passport.internal.analytics.m.i.b, r);
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void q() {
        boolean z = InternalProvider.d;
        if (!InternalProvider.d || this.c) {
            return;
        }
        this.a.reportEvent(com.yandex.passport.internal.analytics.m.p.b, uah.e(new Pair("passport_process_name", dfi.i(new StringBuilder("'"), this.b, '\'')), new Pair("am_version", "7.54.1"), new Pair("error", Log.getStackTraceString(new RuntimeException("This method must not be called from ':passport' process")))));
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void r(RuntimeException runtimeException) {
        this.a.reportError(com.yandex.passport.internal.analytics.v.a.b, runtimeException);
    }
}
