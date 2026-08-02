package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0586o7 {
    public static InterfaceC0626pi a() {
        return AndroidUtils.isApiAchieved(28) ? new C0683ri() : new C0655qi();
    }
}
