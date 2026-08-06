package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288ao extends Rg {
    public C0288ao(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        String j2 = this.f4998a.f5348c.j();
        String str = p5.f4911h;
        this.f4998a.f5348c.j(str).b();
        if (TextUtils.equals(j2, str)) {
            return false;
        }
        this.f4998a.a(M3.o());
        return false;
    }
}
