package ru.CryptoPro.JCP.pref;

import java.util.Locale;
import java.util.ResourceBundle;

/* loaded from: classes4.dex */
public class BundleChooser {
    public static final String EXRES_NAME = "ru.CryptoPro.JCP.pref.resources.exres";
    public static final String FRAMERES_NAME = "ru.CryptoPro.JCP.pref.resources.frameres";
    public static final String OIDRES_NAME = "ru.CryptoPro.JCP.pref.resources.oidres";
    public static final String PANELRES_NAME = "ru.CryptoPro.JCP.pref.resources.panelres";

    public static ResourceBundle getDefaultBundle(String str) {
        return ResourceBundle.getBundle(str, Locale.getDefault());
    }

    public static ResourceBundle getEnglishBundle(String str) {
        return ResourceBundle.getBundle(str, Locale.ENGLISH);
    }
}
