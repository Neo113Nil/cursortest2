package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0279dh implements G7 {
    public final File a;
    public final InterfaceC0713sj b;

    public C0279dh(File file, InterfaceC0713sj interfaceC0713sj) {
        this.a = file;
        this.b = interfaceC0713sj;
    }

    @Override // io.appmetrica.analytics.impl.G7
    public final File a(Context context, String str) {
        return new File(this.a, this.b.a(str));
    }
}
