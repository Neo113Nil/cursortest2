package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0246cd implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yc apply(File file) {
        String a = AbstractC0475kc.a(file);
        long lastModified = file.lastModified();
        if (StringUtils.isNullOrEmpty(a)) {
            return null;
        }
        try {
            return new Yc(a, lastModified);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
