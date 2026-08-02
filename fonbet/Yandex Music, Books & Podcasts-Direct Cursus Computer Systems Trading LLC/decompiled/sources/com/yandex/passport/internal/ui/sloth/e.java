package com.yandex.passport.internal.ui.sloth;

import android.content.Context;
import android.net.http.SslError;
import defpackage.agv;
import defpackage.bgv;
import defpackage.h88;
import defpackage.y9w;
import defpackage.zfv;

/* loaded from: classes4.dex */
public final class e implements agv {
    public final /* synthetic */ bgv a;

    public e(Context context) {
        context.getClass();
        this.a = new bgv(context, new h88(context), new y9w(28));
    }

    @Override // defpackage.agv
    public final boolean b(SslError sslError, zfv zfvVar) {
        sslError.getClass();
        return this.a.b(sslError, zfvVar);
    }
}
