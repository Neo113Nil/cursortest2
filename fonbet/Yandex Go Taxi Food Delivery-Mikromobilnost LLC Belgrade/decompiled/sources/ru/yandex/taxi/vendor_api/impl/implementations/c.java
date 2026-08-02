package ru.yandex.taxi.vendor_api.impl.implementations;

import android.content.Context;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ww60;

/* loaded from: classes10.dex */
public final class c implements ww60 {
    public final Context a;
    public final tse b;
    public final tt2 c;

    public c(Context context, tse tseVar, tt2 tt2Var) {
        this.a = context;
        this.b = tseVar;
        this.c = tt2Var;
    }

    @Override // defpackage.ww60
    public final void f() {
        this.c.getClass();
        com.yandex.go.coroutines.b.g(this.b, uyj.a, null, new VendorApiGlobalInitializerImpl$onAppConfiguration$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "VendorApiGlobalInitializerImpl";
    }
}
