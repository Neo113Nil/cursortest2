package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import defpackage.nm6;
import defpackage.qxe;
import defpackage.zt3;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.a7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0968a7 {
    public static final Object a(NsdManager nsdManager, NsdServiceInfo nsdServiceInfo, W6 w6) {
        zt3 zt3Var = new zt3(1, qxe.b(w6));
        zt3Var.s();
        nsdManager.resolveService(nsdServiceInfo, new Z6(zt3Var));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }
}
