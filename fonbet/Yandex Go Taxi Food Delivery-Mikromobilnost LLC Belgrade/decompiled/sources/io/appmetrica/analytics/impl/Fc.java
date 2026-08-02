package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmCrashWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmCrashWrapper;

/* loaded from: classes9.dex */
public final class Fc implements Hq {
    public static final Fc a = new Fc();

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0331fc a(Context context, InterfaceC0677rc interfaceC0677rc) {
        IRtmCrashWrapper rtmCrashWrapper;
        Xl xl = new Xl(new Ic());
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmCrashWrapper = new RtmCrashWrapper(new Wl(xl), context);
            } catch (Throwable unused) {
            }
            if (rtmCrashWrapper == null) {
                rtmCrashWrapper = new C0472k9();
            }
            return new Kl(rtmCrashWrapper);
        }
        rtmCrashWrapper = null;
        if (rtmCrashWrapper == null) {
        }
        return new Kl(rtmCrashWrapper);
    }
}
