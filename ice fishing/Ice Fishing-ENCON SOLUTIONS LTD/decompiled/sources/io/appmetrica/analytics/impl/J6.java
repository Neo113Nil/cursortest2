package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

@DoNotInline
/* loaded from: classes.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    private final Jg f4578a;

    public J6(Jg jg) {
        this.f4578a = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.f4578a.a(str));
    }
}
