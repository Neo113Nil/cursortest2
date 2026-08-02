package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* renamed from: io.appmetrica.analytics.impl.qq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0663qq extends B3 {
    public C0663qq(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0461jr
    public final String a(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i = this.a;
            if (length <= i) {
                return str;
            }
            String str2 = new String(bytes, 0, i, "UTF-8");
            try {
                this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, str, Integer.valueOf(this.a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }

    public final int b() {
        return this.a;
    }

    public C0663qq(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final String a() {
        return this.b;
    }
}
