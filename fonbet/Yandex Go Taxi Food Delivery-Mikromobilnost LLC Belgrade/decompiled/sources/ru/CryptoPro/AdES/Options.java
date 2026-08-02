package ru.CryptoPro.AdES;

import ru.CryptoPro.AdES.tools.revocation.permission.RevocationPermission;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy;

/* loaded from: classes4.dex */
public class Options implements AdESOptions {
    private boolean enableCertificateValidation = true;
    private boolean enableRevocationReferenceSearchByRevocationValue = false;
    private RevocationURLStrategy<?> revocationURLStrategy = null;
    private RevocationPermission revocationPermission = null;
    private final CSPSigningOptions<Options> csp = new CSPSigningOptions<>(this);

    public static Options copy(Options options) {
        Options options2 = new Options();
        if (options.isEnableCertificateValidation()) {
            options2.enableCertificateValidation();
        }
        options2.setRevocationURLStrategy(options.getRevocationURLStrategy());
        options2.setRevocationPermissions(options.getRevocationPermission());
        if (options.isEnableRevocationReferenceSearchByRevocationValue()) {
            options2.enableRevocationReferenceSearchByRevocationValue();
        }
        return options2;
    }

    public CSPSigningOptions<Options> csp() {
        return this.csp;
    }

    public Options disableCertificateValidation() {
        this.enableCertificateValidation = false;
        return this;
    }

    public Options disableRevocationReferenceSearchByRevocationValue() {
        this.enableRevocationReferenceSearchByRevocationValue = false;
        return this;
    }

    public Options enableCertificateValidation() {
        this.enableCertificateValidation = true;
        return this;
    }

    public Options enableRevocationReferenceSearchByRevocationValue() {
        this.enableRevocationReferenceSearchByRevocationValue = true;
        return this;
    }

    public RevocationPermission getRevocationPermission() {
        return this.revocationPermission;
    }

    public RevocationURLStrategy<?> getRevocationURLStrategy() {
        return this.revocationURLStrategy;
    }

    public boolean isEnableCertificateValidation() {
        return this.enableCertificateValidation;
    }

    public boolean isEnableRevocationReferenceSearchByRevocationValue() {
        return this.enableRevocationReferenceSearchByRevocationValue;
    }

    public Options setRevocationPermissions(RevocationPermission revocationPermission) {
        this.revocationPermission = revocationPermission;
        return this;
    }

    public Options setRevocationURLStrategy(RevocationURLStrategy<?> revocationURLStrategy) {
        this.revocationURLStrategy = revocationURLStrategy;
        return this;
    }
}
