package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import ru.kinopoisk.sdk.easylogin.internal.R6;

/* loaded from: classes5.dex */
public final class Z6 implements NsdManager.ResolveListener {
    public final /* synthetic */ zt3 a;

    public Z6(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        if (this.a.w()) {
            if (i == 3) {
                zt3 zt3Var = this.a;
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(new t7o(new R6.b(nsdServiceInfo)));
                return;
            }
            zt3 zt3Var2 = this.a;
            if (i != 4) {
                r7o r7oVar2 = z7o.b;
                zt3Var2.resumeWith(new t7o(new R6.c(nsdServiceInfo, i)));
            } else {
                r7o r7oVar3 = z7o.b;
                zt3Var2.resumeWith(new t7o(new R6.a(nsdServiceInfo)));
            }
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        if (this.a.w()) {
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(nsdServiceInfo);
        }
    }
}
