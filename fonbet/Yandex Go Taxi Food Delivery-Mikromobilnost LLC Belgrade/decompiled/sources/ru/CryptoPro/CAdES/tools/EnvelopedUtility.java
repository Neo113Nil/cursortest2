package ru.CryptoPro.CAdES.tools;

import defpackage.puu0;
import java.security.AccessController;
import ru.CryptoPro.JCP.Util.GetProperty;

/* loaded from: classes4.dex */
public class EnvelopedUtility {
    public static final String KEY_AGREEMENT_VALIDATION = "ru.CryptoPro.key_agreement_validation";
    public static final boolean a;

    static {
        if (!GetProperty.getBooleanProperty(KEY_AGREEMENT_VALIDATION, true)) {
            a = false;
        } else {
            try {
                a = ((Boolean) AccessController.doPrivileged(new puu0(4))).booleanValue();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isKeyAgreementValidationEnabled() {
        return a;
    }
}
