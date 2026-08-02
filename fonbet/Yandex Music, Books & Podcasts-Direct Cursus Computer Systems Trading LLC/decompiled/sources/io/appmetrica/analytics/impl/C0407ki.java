package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0407ki implements Dr {
    @Override // io.appmetrica.analytics.impl.Dr
    public final byte[] a(V9 v9, Nj nj) {
        if (!TextUtils.isEmpty(v9.b)) {
            try {
                byte[] decode = Base64.decode(v9.b, 0);
                Qi qi = AbstractC0734vr.a(decode) ? null : new Qi(decode);
                C0811yi c0811yi = new C0811yi();
                String str = qi.a;
                c0811yi.a = str == null ? new byte[0] : str.getBytes();
                c0811yi.c = qi.b;
                c0811yi.b = qi.c;
                int ordinal = qi.d.ordinal();
                int i = 1;
                if (ordinal != 1) {
                    i = 2;
                    if (ordinal != 2) {
                        i = 0;
                    }
                }
                c0811yi.d = i;
                return MessageNano.toByteArray(c0811yi);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
