package ru.CryptoPro.JCP.VMInspector;

import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.License;

/* loaded from: classes4.dex */
public class CorruptLic {
    private static final String PREF_NAME = "License_class_license_2_0";

    private CorruptLic() {
    }

    public static void main(String[] strArr) throws Exception {
        try {
            Inspector.print("Licence reading.");
            Preferences systemNodeForPackage = Preferences.systemNodeForPackage(License.class);
            byte[] decodeBuffer = new Decoder().decodeBuffer(systemNodeForPackage.get("License_class_license_2_0", null));
            Inspector.print("Licence garble.");
            int length = decodeBuffer.length - 1;
            decodeBuffer[length] = (byte) (decodeBuffer[length] + 1);
            Inspector.print("Save garble licence.");
            systemNodeForPackage.put("License_class_license_2_0", new Encoder().encode(decodeBuffer));
        } catch (Exception e) {
            Inspector.print(e);
        }
    }
}
