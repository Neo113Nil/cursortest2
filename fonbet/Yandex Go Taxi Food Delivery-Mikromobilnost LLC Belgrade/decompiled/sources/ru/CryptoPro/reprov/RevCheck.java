package ru.CryptoPro.reprov;

import defpackage.br61;
import java.security.AccessController;
import java.security.Provider;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class RevCheck extends Provider {
    public static final String CP_REV_CHECK_ALG = "CPPKIX";
    public static final String PROVIDER_INFO = "CryptoPro Java Revocation Checker.";
    public static final String PROVIDER_NAME = "RevCheck";
    public static final String PROVIDER_PATH = "ru.CryptoPro.reprov.";

    public RevCheck() {
        super(PROVIDER_NAME, JCP.getJarVersion().getProductVersion().doubleValue(), PROVIDER_INFO);
        AccessController.doPrivileged(new br61(3, this));
    }
}
