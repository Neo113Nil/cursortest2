package ru.CryptoPro.JCSP;

import ru.cprocsp.ACSP.tools.config.ConfigInterface;
import ru.cprocsp.ACSP.tools.integrity.IntegrityInterface;
import ru.cprocsp.ACSP.tools.license.LicenseInterface;

/* loaded from: classes4.dex */
public interface CSPProviderInterface {
    ConfigInterface getConfig();

    IntegrityInterface getIntegrity();

    LicenseInterface getLicense();
}
