package com.yandex.plus.pay.ui.common.api.log;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.yandex.passport.internal.entities.j;
import defpackage.dzf;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.yn7;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class g implements yn7 {
    public final /* synthetic */ j a;

    public g(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        Object t7oVar;
        dzfVar.getClass();
        j jVar = this.a;
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        try {
            r7o r7oVar = z7o.b;
            ((ConnectivityManager) ((jyr) jVar.d).getValue()).registerNetworkCallback(build, (f) ((jyr) jVar.e).getValue());
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.pay.log.impl.b bVar = (com.yandex.plus.pay.log.impl.b) jVar.b;
            String str = (String) jVar.a;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
            bVar.getClass();
            bVar.a(aVar, str, "Failed to register network callback", a);
        }
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        Object t7oVar;
        j jVar = this.a;
        try {
            r7o r7oVar = z7o.b;
            ((ConnectivityManager) ((jyr) jVar.d).getValue()).unregisterNetworkCallback((f) ((jyr) jVar.e).getValue());
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.pay.log.impl.b bVar = (com.yandex.plus.pay.log.impl.b) jVar.b;
            String str = (String) jVar.a;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
            bVar.getClass();
            bVar.a(aVar, str, "Failed to unregister network callback", a);
        }
    }
}
