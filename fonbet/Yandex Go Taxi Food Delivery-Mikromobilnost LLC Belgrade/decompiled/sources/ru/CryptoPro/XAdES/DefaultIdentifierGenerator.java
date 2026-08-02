package ru.CryptoPro.XAdES;

import java.util.UUID;

/* loaded from: classes4.dex */
public class DefaultIdentifierGenerator implements IdentifierGenerator {
    @Override // ru.CryptoPro.XAdES.IdentifierGenerator
    public String generate() {
        return "P_" + UUID.randomUUID().toString();
    }
}
