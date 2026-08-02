package ru.CryptoPro.JCP.Util;

import java.util.prefs.Preferences;

/* loaded from: classes4.dex */
public class ClearCryptoProPrefs {
    public static final String COMPANY = "CryptoPro";
    public static final String COUNTRY = "ru";

    private ClearCryptoProPrefs() {
    }

    public static void main(String[] strArr) throws Exception {
        Preferences systemRoot = Preferences.systemRoot();
        if (systemRoot.nodeExists(COUNTRY)) {
            Preferences node = systemRoot.node(COUNTRY);
            if (node.nodeExists(COMPANY)) {
                Preferences node2 = node.node(COMPANY);
                node2.removeNode();
                node2.flush();
            }
        }
    }
}
