package ru.CryptoPro.JCSP.MSCAPI;

import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ru.CryptoPro.JCSP.CSPVersionUtility;

/* loaded from: classes4.dex */
public class CSPProviderInfo {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private final boolean f;
    private final Date g;

    public CSPProviderInfo(int i, int i2, long j, boolean z, Date date) {
        this.a = i;
        this.b = ((65535 & i) >> 8) & 255;
        this.c = i & 255;
        this.d = i2;
        this.e = j;
        this.f = z;
        this.g = date;
    }

    public int getCSPBuild() {
        return this.d;
    }

    public int getCSPMajorVersion() {
        return this.b;
    }

    public int getCSPMinorVersion() {
        return this.c;
    }

    public String getFormattedVersion() {
        if (this.g == null) {
            return String.format("%d.%d.%04d", Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
        }
        return String.format("%d.%d.%04d (%s)", Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH).format(this.g));
    }

    public void setProperties(Provider provider) {
        provider.put("CSP.VERSION", Integer.valueOf(this.b));
        provider.put("CSP.MAJOR_VERSION", Integer.valueOf(this.b));
        provider.put("CSP.MINOR_VERSION", Integer.valueOf(this.c));
        provider.put("CSP.BUILD", Integer.valueOf(this.d));
        provider.put("CSP.StrengthenedKeyUsageControl", Long.valueOf(this.e));
        provider.put("CSP.IsExportLicense", Boolean.valueOf(this.f));
        Object obj = this.g;
        if (obj == null) {
            obj = "";
        }
        provider.put("CSP.BUILD_TIMESTAMP", obj);
    }

    public String toString() {
        String str = "Crypto-Pro CSP " + getFormattedVersion();
        return !CSPVersionUtility.isCSPBuildEqual12000OrHigher() ? str.concat("\nWARNING! This version of Java CSP has poor interoperability with Crypto-Pro CSP version lower than 5.0.12000!") : str;
    }

    public CSPProviderInfo(int i, int i2) {
        this(i, i2, 0L, false, null);
    }
}
