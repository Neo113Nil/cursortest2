package com.yandex.plus.core.network;

import defpackage.b0o;
import defpackage.d0o;
import defpackage.ds3;
import defpackage.es3;
import defpackage.mkn;
import defpackage.s7e;
import defpackage.u7e;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class b implements ds3 {
    public final OkHttpClient a;
    public final com.yandex.passport.sloth.ui.c b;

    public b(OkHttpClient okHttpClient, com.yandex.passport.sloth.ui.c cVar) {
        this.a = okHttpClient;
        this.b = cVar;
    }

    @Override // defpackage.ds3
    public final es3 b(d0o d0oVar) {
        d0oVar.getClass();
        String e = this.b.e();
        u7e u7eVar = d0oVar.a;
        if (!Intrinsics.d(u7eVar.d, e)) {
            s7e f = u7eVar.f();
            f.g(e);
            u7e e2 = f.e();
            b0o b = d0oVar.b();
            b.a = e2;
            d0oVar = b.b();
        }
        return new mkn(this.a, d0oVar, false);
    }
}
