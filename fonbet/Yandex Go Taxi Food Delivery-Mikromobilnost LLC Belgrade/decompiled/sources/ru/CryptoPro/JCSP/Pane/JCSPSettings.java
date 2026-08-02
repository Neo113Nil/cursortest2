package ru.CryptoPro.JCSP.Pane;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
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
import ru.CryptoPro.JCP.ControlPane.HiddenPage;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.ControlPane.PageInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public class JCSPSettings extends HiddenPage implements ActionListener, PageInterface {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Pane.resources.panel";
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private MainControlPane F;
    private JPanel a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JPanel h;
    private JRadioButton i;
    private JRadioButton j;
    private JRadioButton k;
    private JRadioButton l;
    private JComboBox m;
    private JLabel n;
    private JCheckBox o;
    private JLabel p;
    private JComboBox q;
    private JLabel r;
    private JComboBox s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private int z;

    public JCSPSettings() {
        super(JCSPSettings.class);
        a();
        this.a.setName(ResourceBundle.getBundle("ru.CryptoPro.JCSP.Pane.resources.panel").getString("JCSPSettings"));
        try {
            if (isHidden()) {
                this.h.setVisible(false);
            } else {
                Iterator it = KeyStoreConfigBase.getProviders(75).iterator();
                while (it.hasNext()) {
                    this.b.addItem((String) it.next());
                }
                Iterator it2 = KeyStoreConfigBase.getProviders(80).iterator();
                while (it2.hasNext()) {
                    this.c.addItem((String) it2.next());
                }
                Iterator it3 = KeyStoreConfigBase.getProviders(81).iterator();
                while (it3.hasNext()) {
                    this.d.addItem((String) it3.next());
                }
                String defaultProviderName_2001 = DefaultCSPProvider.getDefaultProviderName_2001();
                this.t = defaultProviderName_2001;
                this.b.setSelectedItem(defaultProviderName_2001);
                this.b.addActionListener(this);
                String defaultProviderName_2012_256 = DefaultCSPProvider.getDefaultProviderName_2012_256();
                this.u = defaultProviderName_2012_256;
                this.c.setSelectedItem(defaultProviderName_2012_256);
                this.c.addActionListener(this);
                String defaultProviderName_2012_512 = DefaultCSPProvider.getDefaultProviderName_2012_512();
                this.v = defaultProviderName_2012_512;
                this.d.setSelectedItem(defaultProviderName_2012_512);
                this.d.addActionListener(this);
                this.B = 24;
                Iterator it4 = KeyStoreConfigBase.getProviders(24).iterator();
                while (it4.hasNext()) {
                    this.m.addItem((String) it4.next());
                }
                String defaultProviderNameRSA = DefaultCSPProvider.getDefaultProviderNameRSA();
                this.w = defaultProviderNameRSA;
                this.m.setSelectedItem(defaultProviderNameRSA);
                this.m.addActionListener(this);
                this.C = 16;
                Iterator it5 = KeyStoreConfigBase.getProviders(16).iterator();
                while (it5.hasNext()) {
                    this.q.addItem((String) it5.next());
                }
                String defaultProviderNameECDSA = DefaultCSPProvider.getDefaultProviderNameECDSA();
                this.x = defaultProviderNameECDSA;
                this.q.setSelectedItem(defaultProviderNameECDSA);
                this.q.addActionListener(this);
                this.D = 32;
                Iterator it6 = KeyStoreConfigBase.getProviders(32).iterator();
                while (it6.hasNext()) {
                    this.s.addItem((String) it6.next());
                }
                String defaultProviderNameEDDSA = DefaultCSPProvider.getDefaultProviderNameEDDSA();
                this.y = defaultProviderNameEDDSA;
                this.s.setSelectedItem(defaultProviderNameEDDSA);
                this.s.addActionListener(this);
                if (!DefaultCSPProvider.ifWrite() || isInactive()) {
                    this.b.setEnabled(false);
                    this.c.setEnabled(false);
                    this.d.setEnabled(false);
                    this.m.setEnabled(false);
                    this.q.setEnabled(false);
                    this.s.setEnabled(false);
                }
            }
            int keySetType = DefaultCSPProvider.getKeySetType();
            this.z = keySetType;
            (keySetType == 0 ? this.i : this.j).setSelected(true);
            this.i.addActionListener(this);
            this.j.addActionListener(this);
            if (!DefaultCSPProvider.ifWrite()) {
                this.i.setEnabled(false);
                this.j.setEnabled(false);
            }
            int nameType = DefaultCSPProvider.getNameType();
            this.A = nameType;
            (nameType == 0 ? this.k : this.l).setSelected(true);
            this.k.addActionListener(this);
            this.l.addActionListener(this);
            if (!DefaultCSPProvider.ifWrite()) {
                this.k.setEnabled(false);
                this.l.setEnabled(false);
            }
            boolean isAddProviderName = DefaultCSPProvider.isAddProviderName();
            this.E = isAddProviderName;
            if (isAddProviderName) {
                this.o.setSelected(true);
            }
            this.o.addActionListener(this);
            if (DefaultCSPProvider.ifWrite()) {
                return;
            }
            this.o.setEnabled(false);
        } catch (Error | Exception e) {
            JCSPLogger.warning(e);
        }
    }

    private void a() {
        JPanel jPanel = new JPanel();
        this.a = jPanel;
        jPanel.setLayout(new GridLayoutManager(5, 2, new Insets(6, 6, 6, 6), -1, -1));
        this.a.setName("");
        JPanel jPanel2 = new JPanel();
        this.h = jPanel2;
        jPanel2.setLayout(new GridLayoutManager(12, 1, new Insets(0, 3, 0, 3), -1, -1));
        this.a.add(this.h, new GridConstraints(0, 0, 1, 2, 1, 1, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.h.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.title")));
        JLabel jLabel = new JLabel();
        this.e = jLabel;
        a(jLabel, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_2001"));
        this.h.add(this.e, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox = new JComboBox();
        this.b = jComboBox;
        this.h.add(jComboBox, new GridConstraints(1, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.f = jLabel2;
        a(jLabel2, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_2012_256"));
        this.h.add(this.f, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox2 = new JComboBox();
        this.c = jComboBox2;
        this.h.add(jComboBox2, new GridConstraints(3, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel3 = new JLabel();
        this.g = jLabel3;
        a(jLabel3, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_2012_512"));
        this.h.add(this.g, new GridConstraints(4, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox3 = new JComboBox();
        this.d = jComboBox3;
        this.h.add(jComboBox3, new GridConstraints(5, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel4 = new JLabel();
        this.n = jLabel4;
        a(jLabel4, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_RSA"));
        this.h.add(this.n, new GridConstraints(6, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox4 = new JComboBox();
        this.m = jComboBox4;
        this.h.add(jComboBox4, new GridConstraints(7, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel5 = new JLabel();
        this.p = jLabel5;
        a(jLabel5, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_ECDSA"));
        this.h.add(this.p, new GridConstraints(8, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox5 = new JComboBox();
        this.q = jComboBox5;
        this.h.add(jComboBox5, new GridConstraints(9, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel6 = new JLabel();
        this.r = jLabel6;
        a(jLabel6, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.provider_EDDSA"));
        this.h.add(this.r, new GridConstraints(10, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        JComboBox jComboBox6 = new JComboBox();
        this.s = jComboBox6;
        this.h.add(jComboBox6, new GridConstraints(11, 0, 1, 1, 8, 1, 2, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.a.add(jPanel3, new GridConstraints(1, 0, 1, 2, 1, 1, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel3.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.keyset.title")));
        JRadioButton jRadioButton = new JRadioButton();
        this.i = jRadioButton;
        a((AbstractButton) jRadioButton, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.keyset.user"));
        jPanel3.add(this.i, new GridConstraints(0, 0, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel3.add(new Spacer(), new GridConstraints(0, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JRadioButton jRadioButton2 = new JRadioButton();
        this.j = jRadioButton2;
        a((AbstractButton) jRadioButton2, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.keyset.machine"));
        jPanel3.add(this.j, new GridConstraints(1, 0, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.a.add(jPanel4, new GridConstraints(2, 0, 1, 2, 1, 1, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel4.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.name.title")));
        JRadioButton jRadioButton3 = new JRadioButton();
        this.k = jRadioButton3;
        a((AbstractButton) jRadioButton3, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.name.fqcn"));
        jPanel4.add(this.k, new GridConstraints(0, 0, 1, 1, 4, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel4.add(new Spacer(), new GridConstraints(0, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JRadioButton jRadioButton4 = new JRadioButton();
        this.l = jRadioButton4;
        a((AbstractButton) jRadioButton4, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.name.unique"));
        jPanel4.add(this.l, new GridConstraints(1, 0, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JCheckBox jCheckBox = new JCheckBox();
        this.o = jCheckBox;
        a((AbstractButton) jCheckBox, ResourceBundle.getBundle("ru/CryptoPro/JCSP/Pane/resources/panel").getString("settings.panel.add.provider.name"));
        this.a.add(this.o, new GridConstraints(3, 0, 1, 1, 9, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.a.add(new Spacer(), new GridConstraints(4, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.i);
        buttonGroup.add(this.i);
        buttonGroup.add(this.j);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(this.k);
        buttonGroup2.add(this.k);
        buttonGroup2.add(this.l);
    }

    public static void main(String[] strArr) {
        MainControlPane mainControlPane = new MainControlPane(new JFrame());
        MainControlPane.setStyle();
        mainControlPane.start(new JCSPSettings());
    }

    public JComponent $$$getRootComponent$$$() {
        return this.a;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.F.setModification();
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean apply() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.b.getItemCount() > 0 && (str6 = (String) this.b.getSelectedItem()) != null && !str6.equals(this.t)) {
            DefaultCSPProvider.setDefaultProvider_2001(str6);
            if (!DefaultCSPProvider.getDefaultProviderName_2001().equals(str6)) {
                String defaultProviderName_2001 = DefaultCSPProvider.getDefaultProviderName_2001();
                this.t = defaultProviderName_2001;
                this.b.setSelectedItem(defaultProviderName_2001);
                return false;
            }
            this.t = str6;
        }
        if (this.c.getItemCount() > 0 && (str5 = (String) this.c.getSelectedItem()) != null && !str5.equals(this.u)) {
            DefaultCSPProvider.setDefaultProvider_2012_256(str5);
            if (!DefaultCSPProvider.getDefaultProviderName_2012_256().equals(str5)) {
                String defaultProviderName_2012_256 = DefaultCSPProvider.getDefaultProviderName_2012_256();
                this.u = defaultProviderName_2012_256;
                this.c.setSelectedItem(defaultProviderName_2012_256);
                return false;
            }
            this.u = str5;
        }
        if (this.d.getItemCount() > 0 && (str4 = (String) this.d.getSelectedItem()) != null && !str4.equals(this.v)) {
            DefaultCSPProvider.setDefaultProvider_2012_512(str4);
            if (!DefaultCSPProvider.getDefaultProviderName_2012_512().equals(str4)) {
                String defaultProviderName_2012_512 = DefaultCSPProvider.getDefaultProviderName_2012_512();
                this.v = defaultProviderName_2012_512;
                this.d.setSelectedItem(defaultProviderName_2012_512);
                return false;
            }
            this.v = str4;
        }
        if (this.m.getItemCount() > 0 && (str3 = (String) this.m.getSelectedItem()) != null && !str3.equals(this.w)) {
            DefaultCSPProvider.setDefaultProviderRSA(str3);
            if (!DefaultCSPProvider.getDefaultProviderNameRSA().equals(str3)) {
                String defaultProviderNameRSA = DefaultCSPProvider.getDefaultProviderNameRSA();
                this.w = defaultProviderNameRSA;
                this.m.setSelectedItem(defaultProviderNameRSA);
                return false;
            }
            this.w = str3;
        }
        if (this.q.getItemCount() > 0 && (str2 = (String) this.q.getSelectedItem()) != null && !str2.equals(this.x)) {
            DefaultCSPProvider.setDefaultProviderECDSA(str2);
            if (!DefaultCSPProvider.getDefaultProviderNameECDSA().equals(str2)) {
                String defaultProviderNameECDSA = DefaultCSPProvider.getDefaultProviderNameECDSA();
                this.x = defaultProviderNameECDSA;
                this.q.setSelectedItem(defaultProviderNameECDSA);
                return false;
            }
            this.x = str2;
        }
        if (this.s.getItemCount() > 0 && (str = (String) this.s.getSelectedItem()) != null && !str.equals(this.y)) {
            DefaultCSPProvider.setDefaultProviderEDDSA(str);
            if (!DefaultCSPProvider.getDefaultProviderNameEDDSA().equals(str)) {
                String defaultProviderNameEDDSA = DefaultCSPProvider.getDefaultProviderNameEDDSA();
                this.y = defaultProviderNameEDDSA;
                this.s.setSelectedItem(defaultProviderNameEDDSA);
                return false;
            }
            this.y = str;
        }
        if (this.i.isSelected() && this.z != 0) {
            DefaultCSPProvider.setKeySetType(0);
            if (DefaultCSPProvider.getKeySetType() != 0) {
                this.z = DefaultCSPProvider.getKeySetType();
                this.i.setSelected(true);
                return false;
            }
            this.z = 0;
        }
        if (this.j.isSelected() && this.z != 1) {
            DefaultCSPProvider.setKeySetType(1);
            if (DefaultCSPProvider.getKeySetType() != 1) {
                this.z = DefaultCSPProvider.getKeySetType();
                this.j.setSelected(true);
                return false;
            }
            this.z = 1;
        }
        if (this.k.isSelected() && this.A != 0) {
            DefaultCSPProvider.setNameType(0);
            if (DefaultCSPProvider.getNameType() != 0) {
                this.A = DefaultCSPProvider.getNameType();
                this.k.setSelected(true);
                return false;
            }
            this.A = 0;
        }
        if (this.l.isSelected() && this.A != 1) {
            DefaultCSPProvider.setNameType(1);
            if (DefaultCSPProvider.getNameType() != 1) {
                this.A = DefaultCSPProvider.getNameType();
                this.l.setSelected(true);
                return false;
            }
            this.A = 1;
        }
        boolean isSelected = this.o.isSelected();
        if (isSelected != this.E) {
            DefaultCSPProvider.setAddProviderName(isSelected);
            if (isSelected != DefaultCSPProvider.isAddProviderName()) {
                this.E = DefaultCSPProvider.isAddProviderName();
                this.o.setSelected(true);
                return false;
            }
            this.E = isSelected;
        }
        return true;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public JPanel getPage() {
        return this.a;
    }

    public String getParameterName() {
        return "JavaCSPParametersPanelState";
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean isModified() {
        boolean z = this.b.getItemCount() > 0 ? !this.b.getSelectedItem().equals(this.t) : false;
        if (this.c.getItemCount() > 0) {
            z = z || !this.c.getSelectedItem().equals(this.u);
        }
        if (this.d.getItemCount() > 0) {
            z = z || !this.d.getSelectedItem().equals(this.v);
        }
        if (this.m.getItemCount() > 0) {
            z = z || !this.m.getSelectedItem().equals(this.w);
        }
        if (this.q.getItemCount() > 0) {
            z = z || !this.q.getSelectedItem().equals(this.x);
        }
        if (this.s.getItemCount() > 0) {
            z = z || !this.s.getSelectedItem().equals(this.y);
        }
        return z || (this.i.isSelected() && this.z != 0) || ((this.j.isSelected() && this.z != 1) || ((this.k.isSelected() && this.A != 0) || ((this.l.isSelected() && this.A != 1) || this.E != this.o.isSelected())));
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public void setMaster(MainControlPane mainControlPane) {
        this.F = mainControlPane;
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
