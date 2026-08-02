package ru.cprocsp.ACSP.tools.license;

import android.content.Context;
import android.util.Log;
import defpackage.nnm;
import defpackage.w511;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import ru.CryptoPro.JCSP.MSCAPI.CAPISupport;
import ru.CryptoPro.JCSP.support.License;
import ru.cprocsp.ACSP.tools.config.IniFile;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public final class ACSPLicense extends IniFile implements LicenseInterface {
    private int expiredThroughDays;
    private Date licenseInstallDate;
    private String licenseInstallDateAsString;
    private int licenseStatus;
    private int licenseType;

    public ACSPLicense(String str) throws Exception {
        super(str);
        this.licenseStatus = -1;
        this.licenseInstallDateAsString = null;
        this.licenseInstallDate = null;
        this.expiredThroughDays = -1;
        this.licenseType = -100;
    }

    private int checkAndSaveInternal(String str, boolean z) {
        int i;
        long[] jArr = new long[1];
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int check = CSPLicense.check(true, str, jArr, iArr, iArr2);
        this.licenseType = iArr2[0];
        if (check == 0) {
            i = 0;
        } else {
            nnm.q(check, "License check error: ", LogConstants.APP_LOGGER_TAG);
            i = (this.licenseType != -1 || z) ? 1 : 2;
        }
        if (i == 1) {
            this.expiredThroughDays = -1;
            this.licenseInstallDate = null;
            this.licenseInstallDateAsString = "";
            return i;
        }
        if (this.licenseType != 2) {
            this.expiredThroughDays = iArr[0];
        } else {
            this.expiredThroughDays = -1;
        }
        long j = jArr[0];
        if (j <= 0) {
            this.licenseInstallDate = null;
            this.licenseInstallDateAsString = "";
            return i;
        }
        try {
            this.licenseInstallDate = new Date(j * 1000);
            this.licenseInstallDateAsString = DateFormat.getDateInstance(3).format(this.licenseInstallDate);
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
        }
        return i;
    }

    private SerialNumberStatusHolder processSerialNumber(String str) {
        int i = 0;
        if (str == null) {
            return new SerialNumberStatusHolder(null, SerialNumberStatusHolder.Status.Invalid, i);
        }
        String upperCase = str.replaceAll("[\"\\s]+", "").toUpperCase();
        return !Pattern.compile("[a-zA-Z0-9]{5}-*[a-zA-Z0-9]{5}-*[a-zA-Z0-9]{5}-*[a-zA-Z0-9]{5}-*[a-zA-Z0-9]{5}").matcher(upperCase).matches() ? new SerialNumberStatusHolder(upperCase, SerialNumberStatusHolder.Status.Invalid, i) : new SerialNumberStatusHolder(upperCase, SerialNumberStatusHolder.Status.Valid, i);
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public int checkAndSave(String str, boolean z) {
        SerialNumberStatusHolder processSerialNumber = processSerialNumber(str);
        if (processSerialNumber.state != SerialNumberStatusHolder.Status.Valid) {
            return 1;
        }
        int checkAndSaveInternal = checkAndSaveInternal(processSerialNumber.serialNumber, z);
        this.licenseStatus = checkAndSaveInternal;
        return checkAndSaveInternal;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public int getExistingLicenseStatus() {
        return this.licenseStatus;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public int getExpiredThroughDays() {
        return this.expiredThroughDays;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public Date getLicenseInstallDate() {
        return this.licenseInstallDate;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public String getLicenseInstallDateAsString() {
        return this.licenseInstallDateAsString;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public int getLicenseType() {
        return this.licenseType;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public String getMaskedSerialNumber() {
        String serialNumber = getSerialNumber();
        if (serialNumber == null) {
            return "";
        }
        int length = serialNumber.length();
        return length + (-6) > -1 ? serialNumber.substring(0, length - 5).concat("*****") : serialNumber;
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public String getSerialNumber() {
        String[] strArr = new String[1];
        return CAPISupport.supportRegistryGetString(CSPLicenseConstants.LICENSE_CSP_ProductID, strArr) != 0 ? "" : License.processSerialNumber(strArr[0]);
    }

    @Override // ru.cprocsp.ACSP.tools.config.AbstractFile
    public void save() throws Exception {
        Log.e(LogConstants.APP_LOGGER_TAG, "Unimplemented method.");
    }

    public void saveDefaultLicense(Context context) throws Exception {
        int identifier = context.getResources().getIdentifier("raw/license", null, context.getPackageName());
        if (identifier == 0) {
            w511.s("Couldn't resolve resource raw/license");
            return;
        }
        InputStream openRawResource = context.getResources().openRawResource(identifier);
        try {
            String extract = License.extract(openRawResource);
            if (extract == null) {
                throw new Exception("Default license number not found.");
            }
            checkAndSave(License.processSerialNumber(extract), true);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static class SerialNumberStatusHolder {
        String serialNumber;
        Status state;

        public enum Status {
            Unknown,
            Valid,
            Invalid
        }

        private SerialNumberStatusHolder(String str, Status status) {
            this.serialNumber = str;
            this.state = status;
        }

        public /* synthetic */ SerialNumberStatusHolder(String str, Status status, int i) {
            this(str, status);
        }
    }

    @Override // ru.cprocsp.ACSP.tools.license.LicenseInterface
    public int checkAndSave() {
        return checkAndSave(getSerialNumber(), false);
    }
}
