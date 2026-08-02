package ru.CryptoPro.JCSP.Pane;

import java.awt.Frame;
import ru.CryptoPro.JCP.ControlPane.InputLicense;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCSP.JCSPLicense;

/* loaded from: classes4.dex */
public class InputJCSPLicense extends InputLicense {
    public InputJCSPLicense() {
    }

    public static void main(String[] strArr) {
        InputJCSPLicense inputJCSPLicense = new InputJCSPLicense(null);
        inputJCSPLicense.pack();
        inputJCSPLicense.setVisible(true);
        System.exit(0);
    }

    @Override // ru.CryptoPro.JCP.ControlPane.InputLicense
    public AbstractLicense getLicense() {
        return new JCSPLicense(getUserName(), getOrgName(), getID());
    }

    @Override // ru.CryptoPro.JCP.ControlPane.InputLicense
    public AbstractLicense newLicense(String str, String str2, String str3) {
        return new JCSPLicense(str, str2, str3);
    }

    public InputJCSPLicense(Frame frame) {
        super(frame);
    }
}
