package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.fr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0272fr extends AbstractC0697uj {
    public C0272fr(P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        String j = this.a.c.j();
        String str = h6.h;
        this.a.c.j(str).b();
        if (TextUtils.equals(j, str)) {
            return false;
        }
        this.a.a(C4.o());
        return false;
    }
}
