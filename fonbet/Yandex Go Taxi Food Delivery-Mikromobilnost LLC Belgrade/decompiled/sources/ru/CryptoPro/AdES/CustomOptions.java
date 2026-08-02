package ru.CryptoPro.AdES;

/* loaded from: classes4.dex */
public class CustomOptions {
    public static Options copyWithEnabledCertificateValidation(Options options) {
        if (options == null) {
            return null;
        }
        Options copy = Options.copy(options);
        copy.enableCertificateValidation();
        return copy;
    }
}
