package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPRawGostElSign extends JCSPGostElSign {
    public JCSPRawGostElSign() {
        this(JCP.RAW_GOST_EL_SIGN_NAME);
    }

    public JCSPRawGostElSign(String str) {
        this(str, "RawGOST");
    }

    public JCSPRawGostElSign(String str, String str2) {
        super(str, str2);
    }
}
