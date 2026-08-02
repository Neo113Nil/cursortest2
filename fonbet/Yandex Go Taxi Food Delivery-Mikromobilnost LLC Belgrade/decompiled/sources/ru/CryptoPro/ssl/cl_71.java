package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.LicenseLoader;

/* loaded from: classes4.dex */
public class cl_71 extends LicenseLoader {
    public static final ResourceBundle b = ResourceBundle.getBundle(TLSLicensePage.BUNDLE_NAME, Locale.getDefault());

    @Override // ru.CryptoPro.JCP.tools.LicenseLoader
    public final AbstractLicense getNewLicense() {
        cl_70 cl_70Var = new cl_70();
        cl_70Var.setTitle(b.getString("LicenseExpired"));
        try {
            ServerLicense serverLicense = new ServerLicense();
            String userName = serverLicense.getUserName();
            if (userName.length() == 0) {
                userName = AbstractLicense.getDefaultUserName();
            }
            cl_70Var.setUserName(userName);
            cl_70Var.setOrgName(serverLicense.getCompanyName());
            cl_70Var.setModal(true);
            cl_70Var.pack();
            cl_70Var.setVisible(true);
            if (cl_70Var.isOk()) {
                return (ServerLicense) cl_70Var.getLicense();
            }
            throw new ConfigurationException("Cannot complete installation of the new license");
        } catch (IOException unused) {
            ny61.v("Cannot read current license");
            return null;
        }
    }
}
