package ru.CryptoPro.JCSP;

import ru.cprocsp.ACSP.tools.config.ConfigInterface;
import ru.cprocsp.ACSP.tools.integrity.IntegrityInterface;
import ru.cprocsp.ACSP.tools.license.LicenseInterface;

/* loaded from: classes4.dex */
public class CSPProviderInfo implements CSPProviderInterface {
    private final ConfigInterface config;
    private final IntegrityInterface integrity;
    private final LicenseInterface license;

    public CSPProviderInfo(LicenseInterface licenseInterface, IntegrityInterface integrityInterface, ConfigInterface configInterface) {
        this.license = licenseInterface;
        this.integrity = integrityInterface;
        this.config = configInterface;
    }

    @Override // ru.CryptoPro.JCSP.CSPProviderInterface
    public ConfigInterface getConfig() {
        return this.config;
    }

    @Override // ru.CryptoPro.JCSP.CSPProviderInterface
    public IntegrityInterface getIntegrity() {
        return this.integrity;
    }

    @Override // ru.CryptoPro.JCSP.CSPProviderInterface
    public LicenseInterface getLicense() {
        return this.license;
    }
}
