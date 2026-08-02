package ru.CryptoPro.JCP.ControlPane;

import ru.CryptoPro.JCP.tools.ClassConfig;

/* loaded from: classes4.dex */
public class MainControlPaneConfig extends ClassConfig {
    public static final MainControlPaneConfig d = new MainControlPaneConfig(MainControlPaneConfig.class, "MainControlPaneConfig_class_Pages", "ru.CryptoPro.JCP.ControlPane.PageLicense,ru.CryptoPro.JCP.ControlPane.PageAlg,ru.CryptoPro.JCP.ControlPane.PageHardware,ru.CryptoPro.JCP.ControlPane.PageOther,ru.CryptoPro.JCP.ControlPane.PageVerify,ru.CryptoPro.JCP.ControlPane.PageKeys", "Invalid pannel configuration");

    public static MainControlPaneConfig getConfig() {
        return d;
    }

    public static void main(String[] strArr) {
        getConfig().resetDefault();
    }

    @Override // ru.CryptoPro.JCP.tools.ClassConfig
    public boolean isValid(Class cls) {
        return PageInterface.class.isAssignableFrom(cls);
    }
}
