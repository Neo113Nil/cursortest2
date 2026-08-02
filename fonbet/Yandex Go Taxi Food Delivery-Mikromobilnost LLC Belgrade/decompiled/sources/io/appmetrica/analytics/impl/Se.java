package io.appmetrica.analytics.impl;

import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes9.dex */
public final class Se extends AbstractC0697s3 {
    public final String b;

    public Se(String str, So so) {
        super(so);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697s3
    public final String a(String str) {
        return str + LicenseUtility.SEPARATOR + this.b;
    }
}
