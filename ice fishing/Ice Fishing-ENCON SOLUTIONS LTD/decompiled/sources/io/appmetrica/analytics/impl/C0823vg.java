package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823vg {
    public C0823vg(Oa oa) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Oa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C0486ig c0486ig;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0486ig = new C0486ig(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c0486ig != null ? new C0797ug() : c0486ig;
        }
        c0486ig = null;
        if (c0486ig != null) {
        }
    }
}
