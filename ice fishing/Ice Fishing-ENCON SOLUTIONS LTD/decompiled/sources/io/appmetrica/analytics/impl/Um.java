package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class Um extends M2 {
    public Um(int i2, String str) {
        this(i2, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f4726a;
    }

    public Um(int i2, String str, PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    public final String a() {
        return this.f4727b;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i2 = this.f4726a;
            if (length <= i2) {
                return str;
            }
            String str2 = new String(bytes, 0, i2, "UTF-8");
            try {
                this.f4728c.warning("\"%s\" %s exceeded limit of %d bytes", this.f4727b, str, Integer.valueOf(this.f4726a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
