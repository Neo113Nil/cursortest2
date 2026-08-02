package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class Bi implements Wr {
    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        if (!StringUtils.isNullOrEmpty(c0243ca.b)) {
            try {
                byte[] decode = Base64.decode(c0243ca.b, 0);
                Ui ui = Or.a(decode) ? null : new Ui(decode);
                Pi pi = new Pi();
                String str = ui.a;
                pi.a = str == null ? new byte[0] : str.getBytes();
                pi.c = ui.b;
                pi.b = ui.c;
                int a = I8.a(ui.d);
                int i = 1;
                if (a != 1) {
                    i = 2;
                    if (a != 2) {
                        i = 3;
                        if (a != 3) {
                            i = 0;
                        }
                    }
                }
                pi.d = i;
                return MessageNano.toByteArray(pi);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
