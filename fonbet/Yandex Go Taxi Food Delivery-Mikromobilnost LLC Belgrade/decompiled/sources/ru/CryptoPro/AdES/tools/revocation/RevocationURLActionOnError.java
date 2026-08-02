package ru.CryptoPro.AdES.tools.revocation;

import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLActionTemplateOnError;

/* loaded from: classes4.dex */
public class RevocationURLActionOnError implements RevocationURLActionTemplateOnError {
    public static final RevocationURLActionOnError NONE = new RevocationURLActionOnError();
    public static final RevocationURLActionOnError FAIL = new RevocationURLActionOnError();
}
