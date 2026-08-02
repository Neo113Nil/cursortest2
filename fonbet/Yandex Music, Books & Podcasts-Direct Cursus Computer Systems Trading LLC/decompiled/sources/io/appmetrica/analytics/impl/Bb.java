package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Bb extends AbstractC0594r3 {
    public Bb(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0594r3, io.appmetrica.analytics.impl.Cb
    @NonNull
    public final Rq a(String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Rq(str, new P3(i));
    }
}
