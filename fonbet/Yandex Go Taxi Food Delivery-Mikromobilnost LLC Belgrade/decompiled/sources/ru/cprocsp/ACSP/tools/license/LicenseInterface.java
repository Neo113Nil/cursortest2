package ru.cprocsp.ACSP.tools.license;

import java.util.Date;
import ru.cprocsp.ACSP.tools.common.Constants;

/* loaded from: classes4.dex */
public interface LicenseInterface extends Constants {
    int checkAndSave();

    int checkAndSave(String str, boolean z);

    int getExistingLicenseStatus();

    int getExpiredThroughDays();

    Date getLicenseInstallDate();

    String getLicenseInstallDateAsString();

    int getLicenseType();

    String getMaskedSerialNumber();

    String getSerialNumber();
}
