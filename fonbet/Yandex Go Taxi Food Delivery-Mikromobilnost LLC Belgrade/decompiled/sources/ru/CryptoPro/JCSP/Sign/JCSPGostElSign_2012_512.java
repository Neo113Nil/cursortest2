package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class JCSPGostElSign_2012_512 extends JCSPGostElSign {
    public JCSPGostElSign_2012_512() {
        this(JCP.GOST_SIGN_2012_512_NAME);
    }

    public JCSPGostElSign_2012_512(String str) {
        this(str, "GenGOST_2012_512");
    }

    public JCSPGostElSign_2012_512(String str, String str2) {
        super(str, str2);
    }
}
