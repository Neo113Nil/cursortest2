package ru.CryptoPro.JCP.Util;

import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Install.JCPInstaller;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class SetDefaultLic {
    public static final byte[] DEFAULT_LIC_2_0;
    private static final byte[] licenseStub;

    static {
        byte[] bArr = {0, 0, 0, 0, 0, 29};
        licenseStub = bArr;
        DEFAULT_LIC_2_0 = Array.merge(bArr, JCPInstaller.TEMP_PRODUCT_ID.getBytes());
    }

    private SetDefaultLic() {
    }

    public static void main(String[] strArr) {
        try {
            setPrefLic();
        } catch (Exception unused) {
            System.out.getClass();
        }
    }

    public static void setPrefLic() throws Exception {
        Preferences node = Preferences.systemRoot().node(AbstractLicense.STR_PREFERENCE_LICENSE_NODE);
        node.putByteArray(AbstractLicense.STR_PREFERENCE_LICENSE_KEY, DEFAULT_LIC_2_0);
        node.flush();
    }
}
