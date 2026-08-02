package ru.CryptoPro.ssl;

import java.awt.Frame;
import ru.CryptoPro.JCP.ControlPane.InputLicense;
import ru.CryptoPro.JCP.tools.AbstractLicense;

/* loaded from: classes4.dex */
public class cl_70 extends InputLicense {
    public cl_70() {
    }

    public static void a(String[] strArr) {
        cl_70 cl_70Var = new cl_70(null);
        cl_70Var.pack();
        cl_70Var.setVisible(true);
        System.exit(0);
    }

    @Override // ru.CryptoPro.JCP.ControlPane.InputLicense
    public AbstractLicense getLicense() {
        return new ServerLicense(getUserName(), getOrgName(), getID());
    }

    @Override // ru.CryptoPro.JCP.ControlPane.InputLicense
    public final AbstractLicense newLicense(String str, String str2, String str3) {
        return new ServerLicense(str, str2, str3);
    }

    public cl_70(Frame frame) {
        super(frame);
    }
}
