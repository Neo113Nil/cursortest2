package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0223bj {
    public final SafePackageManager a;

    public /* synthetic */ C0223bj() {
        this(new SafePackageManager());
    }

    public final Oa a(Context context) {
        InterfaceC0194aj qg;
        Jb jb = Jb.I;
        IHandlerExecutor h = jb.d.h();
        Zr zr = jb.D().c;
        String installerPackageName = this.a.getInstallerPackageName(context, context.getPackageName());
        if (installerPackageName != null) {
            int hashCode = installerPackageName.hashCode();
            if (hashCode != -1637701853) {
                if (hashCode != -1046965711) {
                    if (hashCode == -356280397 && installerPackageName.equals("ru.vk.store")) {
                        qg = new Yl(context);
                    }
                } else if (installerPackageName.equals("com.android.vending")) {
                    qg = new Mb(context, h);
                }
            } else if (installerPackageName.equals("com.huawei.appmarket")) {
                qg = new Yb(context);
            }
            return new Oa(new C0312em(new Z3(qg, new fs(zr))), h);
        }
        qg = new Qg(installerPackageName);
        return new Oa(new C0312em(new Z3(qg, new fs(zr))), h);
    }

    public C0223bj(SafePackageManager safePackageManager) {
        this.a = safePackageManager;
    }
}
