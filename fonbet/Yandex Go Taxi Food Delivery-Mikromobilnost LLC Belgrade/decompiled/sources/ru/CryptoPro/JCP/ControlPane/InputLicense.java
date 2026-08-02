package ru.CryptoPro.JCP.ControlPane;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.eu61;
import defpackage.vs61;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ResourceBundle;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.Document;
import javax.swing.text.MaskFormatter;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.License;

/* loaded from: classes4.dex */
public abstract class InputLicense extends JCPDialog implements ActionListener, DocumentListener {
    static final ResourceBundle a = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    private static final String h = "*****-*****-*****-*****-*****";
    private static final String i = "_____-_____-_____-_____-_____";
    private static final String j = "0123456789ABCDEFGHKLMNPQRTUVWXYZ0123456789abcdefghklmnpqrtuvwxyz_";
    private static final char k = '_';
    private static final char l = '\n';
    private JPanel b;
    private JButton c;
    private JButton d;
    private JTextField e;
    private JTextField f;
    private JFormattedTextField g;
    private boolean m;
    private JLabel n;
    private JLabel o;
    private JLabel p;

    public InputLicense(Frame frame) {
        super("InputLicense", frame, "", true);
        MaskFormatter maskFormatter;
        ParseException e;
        this.m = false;
        i();
        setContentPane(this.b);
        ResourceBundle resourceBundle = a;
        setTitle(resourceBundle.getString("EnterLicenseLabel"));
        this.n.setLabelFor(this.g);
        this.p.setLabelFor(this.e);
        this.o.setLabelFor(this.f);
        MainControlPane.setMnemonic(resourceBundle, "panel.licenseInput.NewSerialLabel.accelerator", this.n);
        MainControlPane.setMnemonic(resourceBundle, "panel.licenseInput.YourNameLabel.accelerator", this.p);
        MainControlPane.setMnemonic(resourceBundle, "panel.licenseInput.YourOrganizLabel.accelerator", this.o);
        String property = System.getProperty("user.name");
        if (property != null) {
            this.e.setText(property);
        }
        this.g.setValue(i);
        try {
            maskFormatter = new MaskFormatter(h);
            try {
                maskFormatter.setPlaceholderCharacter(k);
                maskFormatter.setValidCharacters(j);
                maskFormatter.setOverwriteMode(true);
            } catch (ParseException e2) {
                e = e2;
                JCPLogger.warning("Internal error", (Throwable) e);
                this.g.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
                this.g.getDocument().addDocumentListener(this);
                this.g.setFocusLostBehavior(3);
                this.f.getDocument().addDocumentListener(this);
                this.c.setEnabled(true);
                getRootPane().setDefaultButton(this.c);
                this.c.addActionListener(this);
                this.d.addActionListener(this);
                setDefaultCloseOperation(0);
                addWindowListener(new vs61(this));
                this.b.registerKeyboardAction(new eu61(this), KeyStroke.getKeyStroke(27, 0), 1);
            }
        } catch (ParseException e3) {
            maskFormatter = null;
            e = e3;
        }
        this.g.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
        this.g.getDocument().addDocumentListener(this);
        this.g.setFocusLostBehavior(3);
        this.f.getDocument().addDocumentListener(this);
        this.c.setEnabled(true);
        getRootPane().setDefaultButton(this.c);
        this.c.addActionListener(this);
        this.d.addActionListener(this);
        setDefaultCloseOperation(0);
        addWindowListener(new vs61(this));
        this.b.registerKeyboardAction(new eu61(this), KeyStroke.getKeyStroke(27, 0), 1);
    }

    public static String d(JTextField jTextField) {
        Document document = jTextField.getDocument();
        return document.getText(0, document.getLength());
    }

    public static void e(AbstractButton abstractButton, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        boolean z = false;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '&') {
                i2++;
                if (i2 == str.length()) {
                    break;
                }
                if (!z && str.charAt(i2) != '&') {
                    char charAt = str.charAt(i2);
                    i3 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i2));
            i2++;
        }
        abstractButton.setText(stringBuffer.toString());
        if (z) {
            abstractButton.setMnemonic(c);
            abstractButton.setDisplayedMnemonicIndex(i3);
        }
    }

    public static void f(JLabel jLabel, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        boolean z = false;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '&') {
                i2++;
                if (i2 == str.length()) {
                    break;
                }
                if (!z && str.charAt(i2) != '&') {
                    char charAt = str.charAt(i2);
                    i3 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i2));
            i2++;
        }
        jLabel.setText(stringBuffer.toString());
        if (z) {
            jLabel.setDisplayedMnemonic(c);
            jLabel.setDisplayedMnemonicIndex(i3);
        }
    }

    public static void g(JTextField jTextField, int i2) {
        Document document = jTextField.getDocument();
        int length = document.getLength();
        if (length > i2) {
            document.remove(i2, length - i2);
        }
    }

    public JComponent $$$getRootComponent$$$() {
        return this.b;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.c) && h()) {
            this.m = true;
            dispose();
        }
        if (actionEvent.getSource().equals(this.d)) {
            dispose();
        }
    }

    public void changedUpdate(DocumentEvent documentEvent) {
    }

    public String getID() {
        return this.g.getText();
    }

    public abstract AbstractLicense getLicense();

    public String getOrgName() {
        return this.f.getText();
    }

    public String getUserName() {
        return this.e.getText();
    }

    public final boolean h() {
        String str;
        String str2;
        try {
            g(this.e, AbstractLicense.LICENSE_FIELD_LENGTH);
            g(this.f, AbstractLicense.LICENSE_FIELD_LENGTH);
            str = d(this.g);
            str2 = d(this.f);
        } catch (BadLocationException e) {
            JCPLogger.warning("Internal error", (Throwable) e);
            str = null;
            str2 = null;
        }
        if (str != null && 29 == str.length()) {
            try {
                int verifyLicense = newLicense(null, str2, str).verifyLicense("Crypto", true);
                if (verifyLicense != 0 && verifyLicense != 1) {
                    JOptionPane.showMessageDialog(this, License.getLicenseMessage(verifyLicense), a.getString("license.check.failed"), 0);
                }
                return true;
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(this, e2.getMessage(), a.getString("license.check.failed"), 0);
            }
        }
        return false;
    }

    public final void i() {
        JPanel jPanel = new JPanel();
        this.b = jPanel;
        jPanel.setLayout(new GridLayoutManager(3, 1, new Insets(9, 9, 9, 9), -1, -1));
        this.b.setName(ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("TypeLabel"));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.b.add(jPanel2, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton = new JButton();
        this.c = jButton;
        e(jButton, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString(WriteBlocks.OK));
        jPanel2.add(this.c, new GridConstraints(0, 1, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton2 = new JButton();
        this.d = jButton2;
        e(jButton2, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("cancel"));
        jPanel2.add(this.d, new GridConstraints(0, 2, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel2.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.b.add(jPanel3, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel4, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.p = jLabel;
        f(jLabel, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("YourNameLabel"));
        jPanel4.add(this.p, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.o = jLabel2;
        f(jLabel2, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("OrganLabel"));
        jPanel4.add(this.o, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel3 = new JLabel();
        this.n = jLabel3;
        f(jLabel3, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/panelres").getString("SerialLabel"));
        jPanel4.add(this.n, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel5, new GridConstraints(0, 1, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JTextField jTextField = new JTextField();
        this.e = jTextField;
        jPanel5.add(jTextField, new GridConstraints(0, 0, 1, 1, 8, 1, 4, 0, (Dimension) null, new Dimension(220, -1), (Dimension) null, 0, false));
        JTextField jTextField2 = new JTextField();
        this.f = jTextField2;
        jPanel5.add(jTextField2, new GridConstraints(1, 0, 1, 1, 8, 1, 4, 0, (Dimension) null, new Dimension(220, -1), (Dimension) null, 0, false));
        JFormattedTextField jFormattedTextField = new JFormattedTextField();
        this.g = jFormattedTextField;
        jPanel5.add(jFormattedTextField, new GridConstraints(2, 0, 1, 1, 8, 1, 4, 0, (Dimension) null, new Dimension(220, -1), (Dimension) null, 0, false));
        this.b.add(new Spacer(), new GridConstraints(1, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }

    public void insertUpdate(DocumentEvent documentEvent) {
    }

    public boolean isOk() {
        return this.m;
    }

    public abstract AbstractLicense newLicense(String str, String str2, String str3);

    public void removeUpdate(DocumentEvent documentEvent) {
    }

    public void setOrgName(String str) {
        this.f.setText(str);
    }

    public void setUserName(String str) {
        this.e.setText(str);
    }

    public String toString() {
        try {
            return d(this.e) + '\n' + d(this.f) + '\n' + d(this.g) + '\n';
        } catch (BadLocationException e) {
            return e.toString();
        }
    }

    public InputLicense() {
        this(null);
    }
}
