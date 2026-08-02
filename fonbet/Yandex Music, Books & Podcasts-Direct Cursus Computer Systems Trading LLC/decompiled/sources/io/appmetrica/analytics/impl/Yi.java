package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes5.dex */
public final class Yi {
    public Yi(InterfaceC0142bc interfaceC0142bc) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC0142bc a(Context context, IHandlerExecutor iHandlerExecutor) {
        Li li;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                li = new Li(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return li != null ? new Xi() : li;
        }
        li = null;
        if (li != null) {
        }
    }
}
