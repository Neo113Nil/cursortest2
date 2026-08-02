package ru.CryptoPro.ssl;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.ControlPane.PageInterface;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public class ServerSettings implements ActionListener, ChangeListener, DocumentListener, PageInterface {
    public static final ResourceBundle r;
    public static final String[] s;
    public static Method t;
    public JPanel a;
    public JComboBox b;
    public JLabel c;
    public JSpinner d;
    public JLabel e;
    public JSpinner f;
    public JLabel g;
    public JCheckBox h;
    public JRadioButton i;
    public JRadioButton j;
    public JRadioButton k;
    public MainControlPane l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle(TLSLicensePage.BUNDLE_NAME, Locale.getDefault());
        r = bundle;
        s = new String[]{bundle.getString("AUTH_NONE"), bundle.getString("AUTH_REQUESTED"), bundle.getString("AUTH_REQUIRED")};
        t = null;
    }

    public ServerSettings() {
        String[] strArr;
        JComboBox jComboBox;
        JRadioButton jRadioButton;
        this.p = false;
        this.q = 1;
        e();
        this.a.setName(r.getString("ServSet"));
        if (!TLSSettings.ifWrite()) {
            this.b.setEnabled(false);
        }
        this.c.setLabelFor(this.b);
        this.e.setLabelFor(this.d);
        this.g.setLabelFor(this.f);
        this.m = TLSSettings.getDefaultAuth();
        this.o = TLSSettings.getDefaultTime();
        this.n = TLSSettings.getDefaultSize();
        int i = 0;
        while (true) {
            strArr = s;
            int length = strArr.length;
            jComboBox = this.b;
            if (i >= length) {
                break;
            }
            jComboBox.addItem(strArr[i]);
            i++;
        }
        jComboBox.setSelectedItem(strArr[this.m]);
        this.b.addActionListener(this);
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(this.n, 0, 100, 1);
        if (!TLSSettings.ifWrite()) {
            this.d.setEnabled(false);
        }
        this.d.setModel(spinnerNumberModel);
        this.d.addChangeListener(this);
        SpinnerNumberModel spinnerNumberModel2 = new SpinnerNumberModel(this.o, 0, 48, 1);
        if (!TLSSettings.ifWrite()) {
            this.f.setEnabled(false);
        }
        this.f.setModel(spinnerNumberModel2);
        this.f.addChangeListener(this);
        this.p = TLSSettings.getDefaultEnableRevocation();
        if (!TLSSettings.ifWrite()) {
            this.h.setEnabled(false);
        }
        this.h.setSelected(this.p);
        this.h.addActionListener(this);
        if (!TLSSettings.ifWrite()) {
            this.k.setEnabled(false);
            this.i.setEnabled(false);
            this.j.setEnabled(false);
        }
        this.k.addActionListener(this);
        this.i.addActionListener(this);
        this.j.addActionListener(this);
        int defaultRiSupportRequired = TLSSettings.getDefaultRiSupportRequired();
        this.q = defaultRiSupportRequired;
        if (defaultRiSupportRequired == 0) {
            jRadioButton = this.k;
        } else if (defaultRiSupportRequired == 1) {
            jRadioButton = this.i;
        } else if (defaultRiSupportRequired != 2) {
            return;
        } else {
            jRadioButton = this.j;
        }
        jRadioButton.setSelected(true);
    }

    public static void c(JLabel jLabel, String str) {
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

    public static void d(AbstractButton abstractButton, String str) {
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
        mainControlPane.start(new ServerSettings());
    }

    public JComponent $$$getRootComponent$$$() {
        return this.a;
    }

    public final boolean a() {
        JRadioButton jRadioButton;
        int i = this.q;
        if (i == 0) {
            jRadioButton = this.k;
        } else if (i == 1) {
            jRadioButton = this.i;
        } else {
            if (i != 2) {
                return true;
            }
            jRadioButton = this.j;
        }
        return jRadioButton.isSelected();
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.l.setModification();
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean apply() {
        String str = (String) this.b.getSelectedItem();
        if (!s[this.m].equals(str)) {
            int i = 0;
            while (true) {
                String[] strArr = s;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(str)) {
                    this.m = i;
                    break;
                }
                i++;
            }
            TLSSettings.setDefaultAuth(this.m);
        }
        int intValue = ((Number) this.f.getModel().getValue()).intValue();
        if (this.o != intValue) {
            this.o = intValue;
            TLSSettings.setDefaultTime(intValue);
        }
        int intValue2 = ((Number) this.d.getModel().getValue()).intValue();
        if (this.n != intValue2) {
            this.n = intValue2;
            TLSSettings.setDefaultSize(intValue2);
        }
        boolean isSelected = this.h.isSelected();
        if (isSelected != this.p) {
            this.p = isSelected;
            TLSSettings.setDefaultEnableRevocation(isSelected);
        }
        int i2 = this.k.isSelected() ? 0 : this.i.isSelected() ? 1 : 2;
        if (i2 != this.q) {
            this.q = i2;
            TLSSettings.setDefaultRiSupportRequired(i2);
        }
        return true;
    }

    public final String b(String str) {
        ResourceBundle bundle;
        try {
            Class<?> cls = getClass();
            if (t == null) {
                t = cls.getClassLoader().loadClass("com.intellij.DynamicBundle").getMethod("getBundle", String.class, Class.class);
            }
            bundle = (ResourceBundle) t.invoke(null, "ru/CryptoPro/ssl/resources/panel", cls);
        } catch (Exception unused) {
            bundle = ResourceBundle.getBundle("ru/CryptoPro/ssl/resources/panel");
        }
        return bundle.getString(str);
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        this.l.setModification();
    }

    public final void e() {
        JPanel jPanel = new JPanel();
        this.a = jPanel;
        jPanel.setLayout(new GridLayoutManager(2, 1, new Insets(9, 9, 9, 9), -1, -1));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayoutManager(3, 2, new Insets(6, 6, 6, 6), -1, -1));
        this.a.add(jPanel2, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel3, new GridConstraints(0, 1, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JComboBox jComboBox = new JComboBox();
        this.b = jComboBox;
        jPanel3.add(jComboBox, new GridConstraints(0, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JSpinner jSpinner = new JSpinner();
        this.d = jSpinner;
        jPanel3.add(jSpinner, new GridConstraints(1, 0, 1, 1, 8, 1, 4, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JSpinner jSpinner2 = new JSpinner();
        this.f = jSpinner2;
        jPanel3.add(jSpinner2, new GridConstraints(2, 0, 1, 1, 8, 1, 4, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel4, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.c = jLabel;
        c(jLabel, b("ClnAuth"));
        jPanel4.add(this.c, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.e = jLabel2;
        c(jLabel2, b("SessionCacheSize"));
        jPanel4.add(this.e, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel3 = new JLabel();
        this.g = jLabel3;
        c(jLabel3, b("SessionTime"));
        jPanel4.add(this.g, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel5, new GridConstraints(1, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JCheckBox jCheckBox = new JCheckBox();
        this.h = jCheckBox;
        d(jCheckBox, b("ValidateChain"));
        jPanel5.add(this.h, new GridConstraints(0, 0, 1, 1, 8, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel5.add(new Spacer(), new GridConstraints(0, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel6 = new JPanel();
        jPanel6.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        jPanel2.add(jPanel6, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel6.setBorder(BorderFactory.createTitledBorder((Border) null, b("RenegotiationIndication"), 0, 0, (Font) null, (Color) null));
        JRadioButton jRadioButton = new JRadioButton();
        this.i = jRadioButton;
        d(jRadioButton, b("EnableRI"));
        jPanel6.add(this.i, new GridConstraints(1, 0, 1, 2, 8, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel6.add(new Spacer(), new GridConstraints(1, 2, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JRadioButton jRadioButton2 = new JRadioButton();
        this.j = jRadioButton2;
        d(jRadioButton2, b("RequireRI"));
        jPanel6.add(this.j, new GridConstraints(2, 0, 1, 2, 8, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JRadioButton jRadioButton3 = new JRadioButton();
        this.k = jRadioButton3;
        d(jRadioButton3, b("DisableRI"));
        jPanel6.add(this.k, new GridConstraints(0, 0, 1, 2, 8, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.a.add(new Spacer(), new GridConstraints(1, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.i);
        buttonGroup.add(this.j);
        buttonGroup.add(this.k);
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public JPanel getPage() {
        return this.a;
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        this.l.setModification();
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean isModified() {
        return (s[this.m].equals(this.b.getSelectedItem()) && new Integer(this.o).compareTo((Integer) this.f.getModel().getValue()) == 0 && new Integer(this.n).compareTo((Integer) this.d.getModel().getValue()) == 0 && this.p == this.h.isSelected() && a()) ? false : true;
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        this.l.setModification();
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public void setMaster(MainControlPane mainControlPane) {
        this.l = mainControlPane;
    }

    public void stateChanged(ChangeEvent changeEvent) {
        this.l.setModification();
    }

    public String toString() {
        return this.b.getSelectedItem().toString();
    }
}
