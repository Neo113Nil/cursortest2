package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Tl extends AbstractC0697uj {
    public Tl(@NonNull P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        String str = h6.h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.a.c.j(str).b();
        return false;
    }
}
