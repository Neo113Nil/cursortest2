package ru.CryptoPro.ssl;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import defpackage.qv10;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.ControlPane.PageInterface;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.JarTools;
import ru.CryptoPro.JCP.tools.License;

/* loaded from: classes4.dex */
public class TLSLicensePage implements ActionListener, PageInterface {
    public static final String BUNDLE_NAME = "ru.CryptoPro.ssl.resources.panel";
    public static final String PANELRES_NAME = "ru.CryptoPro.JCP.pref.resources.panelres";
    public JPanel a;
    public MainControlPane b;
    public JLabel c;
    public JLabel d;
    public final ResourceBundle e;
    public JLabel f;
    public JLabel g;
    public JLabel h;
    public JLabel i;
    public JLabel j;
    public JLabel k;
    public JLabel l;
    public JButton m;
    public JLabel n;
    public ServerLicense o;
    public ServerLicense p;

    public TLSLicensePage() {
        e();
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        this.e = bundle;
        ResourceBundle bundle2 = ResourceBundle.getBundle(BUNDLE_NAME);
        this.a.setName(bundle2.getString("JTLSName"));
        this.m.addActionListener(this);
        Font font = this.c.getFont();
        boolean z = true;
        Font font2 = new Font(font.getFontName(), 1, font.getSize() + 2);
        this.c.setFont(font2);
        this.c.setText(bundle2.getString("FullJTLS1") + cl_39.getJarVersion().getProductVersion() + bundle.getString("ProductRelease") + cl_39.getJarVersion().getProductRelease());
        this.d.setFont(font2);
        this.d.setText(bundle.getString("FullJavaProvider2") + JarTools.getYear(TLSLicensePage.class) + bundle.getString("FullJavaProvider3"));
        MainControlPane.setMnemonic(bundle, "license.enter.accelerator", (AbstractButton) this.m);
        ServerLicense serverLicense = new ServerLicense(null, null, null);
        boolean isWriteAvailable = serverLicense.isWriteAvailable();
        try {
            ServerLicense serverLicense2 = new ServerLicense();
            this.p = serverLicense2;
            this.o = serverLicense2;
        } catch (IOException e) {
            JCPLogger.ignoredException(e);
            this.o = serverLicense;
            this.p = serverLicense;
        }
        try {
            License license = new License();
            JButton jButton = this.m;
            if (!isWriteAvailable || !license.isServer()) {
                z = false;
            }
            jButton.setEnabled(z);
        } catch (IOException e2) {
            JCPLogger.ignoredException(e2);
        }
        a();
    }

    public static void b(JLabel jLabel, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        char c = 0;
        int i2 = -1;
        boolean z = false;
        while (i < str.length()) {
            if (str.charAt(i) == '&') {
                i++;
                if (i == str.length()) {
                    break;
                }
                if (!z && str.charAt(i) != '&') {
                    char charAt = str.charAt(i);
                    i2 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i));
            i++;
        }
        jLabel.setText(stringBuffer.toString());
        if (z) {
            jLabel.setDisplayedMnemonic(c);
            jLabel.setDisplayedMnemonicIndex(i2);
        }
    }

    public static void c(AbstractButton abstractButton, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        char c = 0;
        int i2 = -1;
        boolean z = false;
        while (i < str.length()) {
            if (str.charAt(i) == '&') {
                i++;
                if (i == str.length()) {
                    break;
                }
                if (!z && str.charAt(i) != '&') {
                    char charAt = str.charAt(i);
                    i2 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i));
            i++;
        }
        abstractButton.setText(stringBuffer.toString());
        if (z) {
            abstractButton.setMnemonic(c);
            abstractButton.setDisplayedMnemonicIndex(i2);
        }
    }

    public static void main(String[] strArr) {
        MainControlPane mainControlPane = new MainControlPane(new JFrame());
        MainControlPane.setStyle();
        mainControlPane.start(new TLSLicensePage());
    }

    public JComponent $$$getRootComponent$$$() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ResourceBundle resourceBundle;
        String str;
        ResourceBundle resourceBundle2;
        String str2;
        String string;
        int length;
        String string2;
        long allowedAmount;
        long endDate = this.o.getEndDate();
        String productID = this.o.getProductID();
        this.g.setText(productID.length() > 0 ? productID.substring(0, 20) : this.e.getString("panel.licensePage.SerialUndef"));
        String userName = this.o.getUserName();
        int length2 = userName.length();
        JLabel jLabel = this.h;
        if (length2 <= 0) {
            userName = this.e.getString("panel.licensePage.UserUndefined");
        }
        jLabel.setText(userName);
        String companyName = this.o.getCompanyName();
        int length3 = companyName.length();
        JLabel jLabel2 = this.i;
        if (length3 <= 0) {
            companyName = this.e.getString("panel.licensePage.OrganizationUndef");
        }
        jLabel2.setText(companyName);
        boolean equals = "".equals(this.o.getProductID());
        JLabel jLabel3 = this.j;
        if (equals) {
            resourceBundle = this.e;
            str = "panel.licensePage.ClientLic";
        } else {
            resourceBundle = this.e;
            str = "panel.licensePage.ServerLic";
        }
        jLabel3.setText(resourceBundle.getString(str));
        boolean isValidVersion = this.o.isValidVersion();
        JLabel jLabel4 = this.l;
        if (isValidVersion) {
            jLabel4.setForeground(Color.BLACK);
            if (endDate == -2) {
                string = this.e.getString("LicenseUndef");
            } else if (endDate == 0) {
                resourceBundle2 = this.e;
                str2 = "LicensePerm";
            } else {
                string = new MessageFormat(this.e.getString("LicenseTillN")).format(new Object[]{new Date(endDate)});
            }
            this.l.setText(string);
            length = this.o.getVersion().length();
            JLabel jLabel5 = this.f;
            if (length <= 0) {
                string2 = "" + cl_39.getJarVersion().getProductVersion();
            } else {
                string2 = this.e.getString("panel.licensePage.VersionUndef");
            }
            jLabel5.setText(string2);
            allowedAmount = this.o.getAllowedAmount();
            if (allowedAmount != -1) {
                this.k.setText(this.e.getString("LicenseUndef"));
            } else {
                this.k.setText(allowedAmount == 0 ? this.e.getString("NoBoundedCPU") : qv10.j(allowedAmount, ""));
            }
            this.n.setText(String.valueOf(DateFormat.getDateInstance().format(new Date(this.o.getFirstInstDat()))));
        }
        jLabel4.setForeground(Color.RED);
        resourceBundle2 = this.e;
        str2 = "LicenseVersionIncorrect";
        string = resourceBundle2.getString(str2);
        this.l.setText(string);
        length = this.o.getVersion().length();
        JLabel jLabel52 = this.f;
        if (length <= 0) {
        }
        jLabel52.setText(string2);
        allowedAmount = this.o.getAllowedAmount();
        if (allowedAmount != -1) {
        }
        this.n.setText(String.valueOf(DateFormat.getDateInstance().format(new Date(this.o.getFirstInstDat()))));
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals(this.m.getActionCommand())) {
            d();
        }
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean apply() {
        if (this.o.equals(this.p)) {
            return true;
        }
        try {
            this.o.store();
            this.p = this.o;
        } catch (ConfigurationException e) {
            JCPLogger.warning("Configuration error", (Throwable) e);
        }
        return this.p == this.o;
    }

    public final void d() {
        cl_70 cl_70Var = new cl_70(MainControlPane.getFrame());
        String userName = this.p.getUserName();
        if (userName.length() == 0) {
            userName = AbstractLicense.getDefaultUserName();
        }
        cl_70Var.setUserName(userName);
        cl_70Var.setOrgName(this.p.getCompanyName());
        cl_70Var.setModal(true);
        cl_70Var.pack();
        cl_70Var.setVisible(true);
        if (cl_70Var.isOk()) {
            this.o = (ServerLicense) cl_70Var.getLicense();
            a();
            this.b.setModification();
        }
    }

    public final void e() {
        JPanel jPanel = new JPanel();
        this.a = jPanel;
        jPanel.setLayout(new GridLayoutManager(5, 1, new Insets(9, 9, 9, 9), -1, -1));
        JLabel jLabel = new JLabel();
        this.c = jLabel;
        b(jLabel, ResourceBundle.getBundle("ru/CryptoPro/ssl/resources/panel").getString("FullJTLS1"));
        this.a.add(this.c, new GridConstraints(0, 0, 1, 1, 0, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.d = jLabel2;
        b(jLabel2, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("FullJavaProvider2"));
        this.a.add(this.d, new GridConstraints(1, 0, 1, 1, 0, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayoutManager(2, 2, new Insets(6, 6, 6, 6), -1, -1));
        jPanel2.setToolTipText("");
        this.a.add(jPanel2, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel2.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("LicenseGroup")));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel3, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel3 = new JLabel();
        b(jLabel3, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("VersionLabel"));
        jPanel3.add(jLabel3, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel4 = new JLabel();
        b(jLabel4, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("SerialLabel"));
        jPanel3.add(jLabel4, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel5 = new JLabel();
        b(jLabel5, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("OwnerLabel"));
        jPanel3.add(jLabel5, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel6 = new JLabel();
        b(jLabel6, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("OrganLabel"));
        jPanel3.add(jLabel6, new GridConstraints(3, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel7 = new JLabel();
        b(jLabel7, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("PeriodLabel"));
        jPanel3.add(jLabel7, new GridConstraints(6, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel8 = new JLabel();
        b(jLabel8, ResourceBundle.getBundle("ru/CryptoPro/ssl/resources/panel").getString("SessionAmount"));
        jPanel3.add(jLabel8, new GridConstraints(5, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel9 = new JLabel();
        b(jLabel9, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("TypeLabel"));
        jPanel3.add(jLabel9, new GridConstraints(4, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel10 = new JLabel();
        b(jLabel10, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("FirstInstLabel"));
        jPanel3.add(jLabel10, new GridConstraints(7, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel4, new GridConstraints(0, 1, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel11 = new JLabel();
        this.f = jLabel11;
        jLabel11.setText("Label");
        jPanel4.add(this.f, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel12 = new JLabel();
        this.g = jLabel12;
        jLabel12.setText("Label");
        jPanel4.add(this.g, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel13 = new JLabel();
        this.h = jLabel13;
        jLabel13.setText("Label");
        jPanel4.add(this.h, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel14 = new JLabel();
        this.i = jLabel14;
        jLabel14.setText("Label");
        jPanel4.add(this.i, new GridConstraints(3, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel15 = new JLabel();
        this.l = jLabel15;
        jLabel15.setText("Label");
        jPanel4.add(this.l, new GridConstraints(6, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel16 = new JLabel();
        this.k = jLabel16;
        jLabel16.setText("Label");
        jPanel4.add(this.k, new GridConstraints(5, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel17 = new JLabel();
        this.j = jLabel17;
        jLabel17.setText("Label");
        jPanel4.add(this.j, new GridConstraints(4, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel18 = new JLabel();
        this.n = jLabel18;
        jLabel18.setText("Label");
        jPanel4.add(this.n, new GridConstraints(7, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel2.add(new Spacer(), new GridConstraints(1, 0, 1, 1, 0, 1, 1, 1, (Dimension) null, new Dimension(250, -1), (Dimension) null, 0, false));
        jPanel2.add(new Spacer(), new GridConstraints(1, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.a.add(jPanel5, new GridConstraints(3, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton = new JButton();
        this.m = jButton;
        jButton.setActionCommand("EnterLicenseLabel");
        this.m.setEnabled(false);
        c(this.m, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("EnterLicenseLabel"));
        jPanel5.add(this.m, new GridConstraints(0, 1, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel5.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.a.add(new Spacer(), new GridConstraints(4, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public JPanel getPage() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean isModified() {
        return !this.o.equals(this.p);
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public void setMaster(MainControlPane mainControlPane) {
        this.b = mainControlPane;
    }

    public String toString() {
        ServerLicense serverLicense = this.o;
        return serverLicense != null ? serverLicense.toString() : "";
    }
}
