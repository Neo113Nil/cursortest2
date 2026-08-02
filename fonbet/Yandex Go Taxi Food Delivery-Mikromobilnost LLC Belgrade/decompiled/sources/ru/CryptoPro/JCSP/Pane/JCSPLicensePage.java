package ru.CryptoPro.JCSP.Pane;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.ControlPane.PageInterface;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.JarTools;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JCSPLicense;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class JCSPLicensePage implements ActionListener, PageInterface {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Pane.resources.panel";
    public static final String PANELRES_NAME = "ru.CryptoPro.JCP.pref.resources.panelres";
    private static final String s = "Configuration error";
    private static final String t = "2012";
    private static Method u;
    private MainControlPane a;
    private JPanel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JButton l;
    private JLabel m;
    private JLabel n;
    private final ResourceBundle o;
    private final ResourceBundle p;
    private JCSPLicense q;
    private JCSPLicense r;

    public JCSPLicensePage() {
        c();
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Pane.resources.panel");
        this.p = bundle;
        ResourceBundle bundle2 = ResourceBundle.getBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        this.o = bundle2;
        this.b.setName(bundle.getString("JCSPName"));
        this.l.addActionListener(this);
        Font font = this.c.getFont();
        Font font2 = new Font(font.getFontName(), 1, font.getSize() + 2);
        this.c.setFont(font2);
        this.c.setText(bundle.getString("FullJCSP1") + JCSP.getJarVersion().getProductVersion() + bundle2.getString("ProductRelease") + JCSP.getJarVersion().getProductRelease());
        this.d.setFont(font2);
        this.d.setText(bundle.getString("FullJCSP2") + JarTools.getYear(JCSPLicensePage.class) + bundle2.getString("FullJavaProvider3"));
        MainControlPane.setMnemonic(bundle2, "license.enter.accelerator", (AbstractButton) this.l);
        JCSPLicense jCSPLicense = new JCSPLicense(null, null, null);
        this.l.setEnabled(jCSPLicense.isWriteAvailable());
        try {
            JCSPLicense jCSPLicense2 = new JCSPLicense();
            this.r = jCSPLicense2;
            this.q = jCSPLicense2;
        } catch (IOException e) {
            JCSPLogger.ignoredException(e);
            this.q = jCSPLicense;
            this.r = jCSPLicense;
        }
        a();
    }

    private void a() {
        Properties info = this.q.info();
        this.e.setText(info.getProperty(this.o.getString("VersionLabel")));
        this.f.setText(info.getProperty(this.o.getString("SerialLabel")));
        this.g.setText(info.getProperty(this.o.getString("OwnerLabel")));
        this.h.setText(info.getProperty(this.o.getString("OrganLabel")));
        this.j.setText(info.getProperty(this.o.getString("TypeLabel")));
        this.i.setForeground(!this.q.isValidVersion() ? Color.RED : Color.BLACK);
        this.i.setText(info.getProperty(this.o.getString("PeriodLabel")));
        this.m.setText(info.getProperty(this.o.getString("ProcLabel")));
        this.k.setText(info.getProperty(this.o.getString("FirstInstLabel")));
        this.n.setText(info.getProperty(this.o.getString("LicJCSP")));
    }

    private void b() {
        InputJCSPLicense inputJCSPLicense = new InputJCSPLicense(MainControlPane.getFrame());
        String userName = this.r.getUserName();
        if (userName.length() == 0) {
            userName = AbstractLicense.getDefaultUserName();
        }
        inputJCSPLicense.setUserName(userName);
        inputJCSPLicense.setOrgName(this.r.getCompanyName());
        inputJCSPLicense.setModal(true);
        inputJCSPLicense.pack();
        inputJCSPLicense.setVisible(true);
        if (inputJCSPLicense.isOk()) {
            this.q = (JCSPLicense) inputJCSPLicense.getLicense();
            a();
            this.a.setModification();
        }
    }

    private void c() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        JPanel jPanel2 = new JPanel();
        this.b = jPanel2;
        jPanel2.setLayout(new GridLayoutManager(5, 1, new Insets(9, 9, 9, 9), -1, -1));
        jPanel.add(this.b, new GridConstraints(0, 0, 1, 1, 0, 0, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.c = jLabel;
        a(jLabel, a("ru/CryptoPro/JCSP/Pane/resources/panel", "FullJCSP1"));
        this.b.add(this.c, new GridConstraints(0, 0, 1, 1, 0, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.d = jLabel2;
        a(jLabel2, a("ru/CryptoPro/JCSP/Pane/resources/panel", "FullJCSP2"));
        this.b.add(this.d, new GridConstraints(1, 0, 1, 1, 0, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(2, 2, new Insets(6, 6, 6, 6), -1, -1));
        jPanel3.setToolTipText("");
        this.b.add(jPanel3, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel3.setBorder(BorderFactory.createTitledBorder((Border) null, a("ru/CryptoPro/JCP/pref/resources/panelres", "LicenseGroup"), 0, 0, (Font) null, (Color) null));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel4, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel3 = new JLabel();
        a(jLabel3, a("ru/CryptoPro/JCP/pref/resources/panelres", "VersionLabel"));
        jPanel4.add(jLabel3, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel4 = new JLabel();
        a(jLabel4, a("ru/CryptoPro/JCP/pref/resources/panelres", "SerialLabel"));
        jPanel4.add(jLabel4, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel5 = new JLabel();
        a(jLabel5, a("ru/CryptoPro/JCP/pref/resources/panelres", "OwnerLabel"));
        jPanel4.add(jLabel5, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel6 = new JLabel();
        a(jLabel6, a("ru/CryptoPro/JCP/pref/resources/panelres", "OrganLabel"));
        jPanel4.add(jLabel6, new GridConstraints(3, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel7 = new JLabel();
        a(jLabel7, a("ru/CryptoPro/JCP/pref/resources/panelres", "PeriodLabel"));
        jPanel4.add(jLabel7, new GridConstraints(6, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel8 = new JLabel();
        a(jLabel8, a("ru/CryptoPro/JCP/pref/resources/panelres", "ProcLabel"));
        jPanel4.add(jLabel8, new GridConstraints(5, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel9 = new JLabel();
        a(jLabel9, a("ru/CryptoPro/JCP/pref/resources/panelres", "TypeLabel"));
        jPanel4.add(jLabel9, new GridConstraints(4, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel10 = new JLabel();
        a(jLabel10, a("ru/CryptoPro/JCP/pref/resources/panelres", "FirstInstLabel"));
        jPanel4.add(jLabel10, new GridConstraints(7, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel11 = new JLabel();
        a(jLabel11, a("ru/CryptoPro/JCP/pref/resources/panelres", "panel.licensePage.lic.info"));
        jPanel4.add(jLabel11, new GridConstraints(8, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel5, new GridConstraints(0, 1, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel12 = new JLabel();
        this.e = jLabel12;
        jLabel12.setText("Label");
        jPanel5.add(this.e, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel13 = new JLabel();
        this.f = jLabel13;
        jLabel13.setText("Label");
        jPanel5.add(this.f, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel14 = new JLabel();
        this.g = jLabel14;
        jLabel14.setText("Label");
        jPanel5.add(this.g, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel15 = new JLabel();
        this.h = jLabel15;
        jLabel15.setText("Label");
        jPanel5.add(this.h, new GridConstraints(3, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel16 = new JLabel();
        this.i = jLabel16;
        jLabel16.setText("Label");
        jPanel5.add(this.i, new GridConstraints(6, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel17 = new JLabel();
        this.m = jLabel17;
        jLabel17.setText("Label");
        jPanel5.add(this.m, new GridConstraints(5, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel18 = new JLabel();
        this.j = jLabel18;
        jLabel18.setText("Label");
        jPanel5.add(this.j, new GridConstraints(4, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel19 = new JLabel();
        this.k = jLabel19;
        jLabel19.setText("Label");
        jPanel5.add(this.k, new GridConstraints(7, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel20 = new JLabel();
        this.n = jLabel20;
        jLabel20.setText("Label");
        jPanel5.add(this.n, new GridConstraints(8, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel3.add(new Spacer(), new GridConstraints(1, 0, 1, 1, 0, 1, 1, 1, (Dimension) null, new Dimension(250, -1), (Dimension) null, 0, false));
        jPanel3.add(new Spacer(), new GridConstraints(1, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel6 = new JPanel();
        jPanel6.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.b.add(jPanel6, new GridConstraints(3, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton = new JButton();
        this.l = jButton;
        jButton.setActionCommand("EnterLicenseLabel");
        this.l.setEnabled(false);
        a((AbstractButton) this.l, a("ru/CryptoPro/JCP/pref/resources/panelres", "EnterLicenseLabel"));
        jPanel6.add(this.l, new GridConstraints(0, 1, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel6.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.b.add(new Spacer(), new GridConstraints(4, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }

    public static void main(String[] strArr) {
        MainControlPane mainControlPane = new MainControlPane(new JFrame());
        MainControlPane.setStyle();
        mainControlPane.start(new JCSPLicensePage());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals(this.l.getActionCommand())) {
            b();
        }
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean apply() {
        if (!isModified()) {
            return true;
        }
        try {
            this.q.store();
            this.r = this.q;
        } catch (ConfigurationException e) {
            JCSPLogger.warning(s, (Throwable) e);
        }
        return this.r == this.q;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public JPanel getPage() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean isModified() {
        return !this.q.equals(this.r);
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public void setMaster(MainControlPane mainControlPane) {
        this.a = mainControlPane;
    }

    public String toString() {
        JCSPLicense jCSPLicense = this.q;
        return jCSPLicense != null ? jCSPLicense.toString() : "";
    }

    private String a(String str, String str2) {
        ResourceBundle bundle;
        try {
            Class<?> cls = getClass();
            if (u == null) {
                u = cls.getClassLoader().loadClass("com.intellij.DynamicBundle").getMethod("getBundle", String.class, Class.class);
            }
            bundle = (ResourceBundle) u.invoke(null, str, cls);
        } catch (Exception unused) {
            bundle = ResourceBundle.getBundle(str);
        }
        return bundle.getString(str2);
    }

    private void a(AbstractButton abstractButton, String str) {
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

    private void a(JLabel jLabel, String str) {
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
}
