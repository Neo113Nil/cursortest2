package com.yandex.passport.internal.sloth;

import android.app.Activity;
import android.net.ConnectivityManager;
import com.yandex.passport.internal.report.we;
import defpackage.a4g;
import defpackage.dzf;
import defpackage.fkn;
import defpackage.gld;
import defpackage.hdr;
import defpackage.tf6;
import defpackage.wyf;
import defpackage.zsd;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n implements com.yandex.passport.sloth.ui.l {
    public final fkn a;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Activity activity, com.yandex.passport.common.coroutine.e eVar) {
        activity.getClass();
        eVar.getClass();
        Object systemService = activity.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        com.yandex.passport.common.coroutine.f fVar = (com.yandex.passport.common.coroutine.f) eVar;
        Continuation continuation = null;
        dzf dzfVar = activity instanceof dzf ? (dzf) activity : null;
        tf6 a = dzfVar != null ? com.yandex.passport.common.coroutine.c.a(wyf.F(dzfVar.getLifecycle())) : gld.e(fVar.a.a.plus(a4g.n()));
        this.a = zsd.F0(zsd.C(zsd.b0(zsd.I(new we(connectivityManager, a, continuation, 15))), -1), a, new hdr(5000L, Long.MAX_VALUE), null);
    }
}
