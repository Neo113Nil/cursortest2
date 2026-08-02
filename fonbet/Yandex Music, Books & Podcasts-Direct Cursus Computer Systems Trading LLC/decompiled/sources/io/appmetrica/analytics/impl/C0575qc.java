package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmCrashWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmCrashWrapper;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0575qc implements InterfaceC0589qq {

    @NotNull
    public static final C0575qc a = new C0575qc();

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Qb a(@NotNull Context context, @NotNull InterfaceC0286gc interfaceC0286gc) {
        IRtmCrashWrapper rtmCrashWrapper;
        Ml ml = new Ml(new C0632sc());
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmCrashWrapper = new RtmCrashWrapper(new Ll(ml), context);
            } catch (Throwable unused) {
            }
            if (rtmCrashWrapper == null) {
                rtmCrashWrapper = new C0225e9();
            }
            return new C0842zl(rtmCrashWrapper);
        }
        rtmCrashWrapper = null;
        if (rtmCrashWrapper == null) {
        }
        return new C0842zl(rtmCrashWrapper);
    }
}
