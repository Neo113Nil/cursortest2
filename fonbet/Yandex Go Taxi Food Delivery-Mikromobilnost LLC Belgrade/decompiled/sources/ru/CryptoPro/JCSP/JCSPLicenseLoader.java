package ru.CryptoPro.JCSP;

import defpackage.ny61;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ControlPane.InputLicense;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.LicenseLoader;

/* loaded from: classes4.dex */
public final class JCSPLicenseLoader extends LicenseLoader {
    private static final ResourceBundle a = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Pane.resources.panel");

    @Override // ru.CryptoPro.JCP.tools.LicenseLoader
    public AbstractLicense getNewLicense() throws Exception {
        Constructor<?> constructor = Class.forName("ru.CryptoPro.JCSP.Pane.InputJCSPLicense").getConstructor(null);
        constructor.setAccessible(true);
        InputLicense inputLicense = (InputLicense) constructor.newInstance(null);
        inputLicense.setTitle(a.getString("license.loader.expired"));
        try {
            JCSPLicense jCSPLicense = new JCSPLicense();
            String userName = jCSPLicense.getUserName();
            if (userName.length() == 0) {
                userName = AbstractLicense.getDefaultUserName();
            }
            inputLicense.setUserName(userName);
            inputLicense.setOrgName(jCSPLicense.getCompanyName());
            inputLicense.setModal(true);
            inputLicense.pack();
            inputLicense.setVisible(true);
            if (inputLicense.isOk()) {
                return (JCSPLicense) inputLicense.getLicense();
            }
            throw new ConfigurationException("Cannot complete installation of the new license");
        } catch (IOException unused) {
            ny61.v("Cannot read current license");
            return null;
        }
    }
}
