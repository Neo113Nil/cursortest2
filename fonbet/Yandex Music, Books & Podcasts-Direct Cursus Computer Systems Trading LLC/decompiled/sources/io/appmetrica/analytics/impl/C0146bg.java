package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0146bg implements Cdo {
    public final int a;

    public C0146bg(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    public final boolean a(@NotNull String str) {
        return this.a != Process.myPid();
    }
}
