package io.appmetrica.analytics.impl;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class Of {
    public static final String a(String str) {
        return str.length() == 0 ? "" : str.concat(Extension.DOT_CHAR);
    }
}
