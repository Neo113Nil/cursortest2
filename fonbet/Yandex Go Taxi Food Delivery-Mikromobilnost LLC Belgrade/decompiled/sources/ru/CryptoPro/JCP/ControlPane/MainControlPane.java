package ru.CryptoPro.JCP.ControlPane;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.cw61;
import defpackage.puu0;
import defpackage.tu61;
import defpackage.tw61;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.PhysicalRnd;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class MainControlPane implements ActionListener, PageInterface {
    public static Frame i;
    public static Method j;
    public JTabbedPane a;
    public JButton b;
    public JButton c;
    public JButton d;
    public JPanel e;
    public JLabel f;
    public JLabel g;
    public final AbstractCollection h;

    public MainControlPane(Frame frame, AbstractCollection abstractCollection) {
        b();
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        MessageFormat messageFormat = new MessageFormat(defaultBundle.getString("panel.java.home"));
        MessageFormat messageFormat2 = new MessageFormat(defaultBundle.getString("panel.user.name"));
        String property = System.getProperty("java.home");
        String property2 = System.getProperty("user.name");
        this.f.setText(messageFormat.format(new String[]{property}));
        this.g.setText(messageFormat2.format(new String[]{property2}));
        int defaultProviderIndexCached = PaneDefaultProvider.getDefaultProviderIndexCached(null);
        i = frame;
        this.h = abstractCollection;
        Iterator it = abstractCollection.iterator();
        int i2 = -1;
        int i3 = 0;
        while (it.hasNext()) {
            PageInterface pageInterface = (PageInterface) it.next();
            pageInterface.setMaster(this);
            this.a.add(pageInterface.getPage());
            if (defaultProviderIndexCached == 1 && pageInterface.getClass().getName().equals("ru.CryptoPro.JCSP.Pane.JCSPLicensePage")) {
                i2 = i3;
            }
            i3++;
        }
        if (defaultProviderIndexCached == 1 && i2 != -1) {
            this.a.setSelectedIndex(i2);
        }
        this.e.registerKeyboardAction(this, this.d.getActionCommand(), KeyStroke.getKeyStroke(27, 0), 1);
        ResourceBundle defaultBundle2 = BundleChooser.getDefaultBundle(BundleChooser.FRAMERES_NAME);
        setMnemonic(defaultBundle2, "CANCELKey.accelerator", (AbstractButton) this.d);
        setMnemonic(defaultBundle2, "OKKey.accelerator", (AbstractButton) this.b);
        setMnemonic(defaultBundle2, "APPLYKey.accelerator", (AbstractButton) this.c);
        this.d.addActionListener(this);
        this.b.addActionListener(this);
        this.c.addActionListener(this);
        i.addWindowListener(new tu61());
        setModification();
    }

    public static void c(AbstractButton abstractButton, String str) {
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

    public static Frame getFrame() {
        return i;
    }

    public static void main(String[] strArr) throws ConfigurationException {
        StringBuffer stringBuffer;
        Platform.setEncoding();
        MainControlPane mainControlPane = new MainControlPane(new JFrame());
        if (strArr.length > 0) {
            stringBuffer = new StringBuffer(strArr[0]);
            for (int i2 = 1; i2 < strArr.length; i2++) {
                stringBuffer.append(",");
                stringBuffer.append(strArr[i2]);
            }
        } else {
            stringBuffer = new StringBuffer((String) AccessController.doPrivileged(new puu0(21)));
        }
        setStyle();
        mainControlPane.start(MainControlPaneConfig.getConfig().convert(stringBuffer.toString()), false);
    }

    public static void setMnemonic(ResourceBundle resourceBundle, String str, AbstractButton abstractButton) {
        String string = resourceBundle.getString(str);
        abstractButton.setMnemonic(string.charAt(0));
        if (string.length() > 1) {
            abstractButton.setDisplayedMnemonicIndex(abstractButton.getText().indexOf(string.charAt(1)));
        }
    }

    public static void setStyle() {
        try {
            String property = Platform.getProperty("ru.CryptoPro.JCP.ControlPane.useLookAndFeel");
            if (property != null) {
                if ("false".equals(property)) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("FileChooser.cancelButtonText", defaultBundle.getString("cancel"));
            UIManager.put("FileChooser.cancelButtonToolTipText", defaultBundle.getString("cancel"));
            UIManager.put("FileChooser.saveButtonText", defaultBundle.getString("save"));
            UIManager.put("FileChooser.saveButtonToolTipText", defaultBundle.getString("save"));
            UIManager.put("FileChooser.openButtonText", defaultBundle.getString(OpenList.STR_OPEN));
            UIManager.put("FileChooser.openButtonToolTipText", defaultBundle.getString("file.open.tt"));
            UIManager.put("FileChooser.fileNameLabelText", defaultBundle.getString("file.name"));
            UIManager.put("FileChooser.filesOfTypeLabelText", defaultBundle.getString("file.types"));
            UIManager.put("FileChooser.acceptAllFileFilterText", defaultBundle.getString("file.filter.all"));
            UIManager.put("OptionPane.okButtonText", defaultBundle.getString(WriteBlocks.OK));
            UIManager.put("OptionPane.okButtonToolTipText", defaultBundle.getString(WriteBlocks.OK));
            UIManager.put("OptionPane.cancelButtonText", defaultBundle.getString("cancel"));
            UIManager.put("OptionPane.cancelButtonToolTipText", defaultBundle.getString("cancel"));
            UIManager.put("OptionPane.yesButtonText", defaultBundle.getString("yes"));
            UIManager.put("OptionPane.yesButtonToolTipText", defaultBundle.getString("yes"));
            UIManager.put("OptionPane.noButtonText", defaultBundle.getString("no"));
            UIManager.put("OptionPane.noButtonToolTipText", defaultBundle.getString("no"));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JCPLogger.ignoredException(e);
        }
    }

    public JComponent $$$getRootComponent$$$() {
        return this.e;
    }

    public final String a(String str) {
        ResourceBundle bundle;
        try {
            Class<?> cls = getClass();
            if (j == null) {
                j = cls.getClassLoader().loadClass("com.intellij.DynamicBundle").getMethod("getBundle", String.class, Class.class);
            }
            bundle = (ResourceBundle) j.invoke(null, "ru/CryptoPro/JCP/pref/resources/frameres", cls);
        } catch (Exception unused) {
            bundle = ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/frameres");
        }
        return bundle.getString(str);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        boolean z;
        String actionCommand = this.b.getActionCommand();
        String actionCommand2 = this.d.getActionCommand();
        String actionCommand3 = this.c.getActionCommand();
        String actionCommand4 = actionEvent.getActionCommand();
        if (!actionCommand4.equals(actionCommand)) {
            z = false;
        } else if (isModified()) {
            z = apply();
            setModification();
        } else {
            z = true;
        }
        boolean z2 = actionCommand4.equals(actionCommand2) ? true : z;
        if (actionCommand4.equals(actionCommand3)) {
            apply();
            setModification();
        }
        if (z2) {
            i.dispose();
            System.exit(0);
        }
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean apply() {
        Iterator it = this.h.iterator();
        boolean z = true;
        while (it.hasNext() && z) {
            if (!((PageInterface) it.next()).apply()) {
                z = false;
            }
        }
        return z;
    }

    public final void b() {
        JPanel jPanel = new JPanel();
        this.e = jPanel;
        jPanel.setLayout(new GridLayoutManager(4, 1, new Insets(5, 5, 5, 5), -1, -1));
        JTabbedPane jTabbedPane = new JTabbedPane();
        this.a = jTabbedPane;
        this.e.add(jTabbedPane, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, new Dimension(-1, 550), (Dimension) null, 0, false));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        this.e.add(jPanel2, new GridConstraints(3, 0, 1, 1, 0, 3, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton = new JButton();
        this.d = jButton;
        jButton.setActionCommand("Cancel");
        c(this.d, a("CANCELKey"));
        jPanel2.add(this.d, new GridConstraints(0, 2, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel2.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton2 = new JButton();
        this.c = jButton2;
        jButton2.setActionCommand("Apply");
        c(this.c, a("APPLYKey"));
        jPanel2.add(this.c, new GridConstraints(0, 3, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton3 = new JButton();
        this.b = jButton3;
        jButton3.setEnabled(true);
        c(this.b, a("OKKey"));
        jPanel2.add(this.b, new GridConstraints(0, 1, 1, 1, 0, 1, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.e.add(jPanel3, new GridConstraints(1, 0, 1, 1, 0, 3, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.f = jLabel;
        jLabel.setText("JavaHome");
        jPanel3.add(this.f, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        jPanel3.add(new Spacer(), new GridConstraints(0, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        this.e.add(jPanel4, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel2 = new JLabel();
        this.g = jLabel2;
        jLabel2.setText("User");
        jPanel4.add(this.g, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        jPanel4.add(new Spacer(), new GridConstraints(0, 1, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public JPanel getPage() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public boolean isModified() {
        Iterator it = this.h.iterator();
        boolean z = false;
        while (it.hasNext() && !z) {
            if (((PageInterface) it.next()).isModified()) {
                z = true;
            }
        }
        return z;
    }

    @Override // ru.CryptoPro.JCP.ControlPane.PageInterface
    public void setMaster(MainControlPane mainControlPane) {
    }

    public void setModification() {
        this.c.setEnabled(isModified());
    }

    public void start(AbstractCollection abstractCollection, boolean z) {
        if (PaneDefaultProvider.getDefaultProviderIndexCached(null) == 0) {
            PhysicalRnd.init();
        }
        JFrame jFrame = new JFrame((String) JCPRes.getObject("Titleres", 2));
        jFrame.setContentPane(new MainControlPane(jFrame, abstractCollection).e);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(2);
        jFrame.getSize();
        jFrame.addComponentListener(new cw61());
        jFrame.setVisible(true);
        if (z) {
            try {
                tw61 tw61Var = new tw61();
                tw61Var.a = jFrame;
                Thread thread = new Thread(tw61Var, "test");
                thread.start();
                thread.join();
                throw new Error(WriteBlocks.OK);
            } catch (InterruptedException | NoSuchAlgorithmException unused) {
            }
        }
    }

    public static void setMnemonic(ResourceBundle resourceBundle, String str, JLabel jLabel) {
        String string = resourceBundle.getString(str);
        jLabel.setDisplayedMnemonic(string.charAt(0));
        if (string.length() > 1) {
            jLabel.setDisplayedMnemonicIndex(jLabel.getText().indexOf(string.charAt(1)));
        }
    }

    public void start(PageInterface pageInterface) {
        Vector vector = new Vector(1);
        vector.add(pageInterface);
        start(vector, false);
    }

    public MainControlPane(Frame frame) {
        this(frame, new Vector(0));
    }
}
