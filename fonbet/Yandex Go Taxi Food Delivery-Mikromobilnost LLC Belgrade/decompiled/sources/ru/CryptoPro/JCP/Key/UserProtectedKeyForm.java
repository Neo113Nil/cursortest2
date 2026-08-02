package ru.CryptoPro.JCP.Key;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.ns21;
import defpackage.nzs;
import defpackage.os21;
import defpackage.puu0;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.security.AccessController;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class UserProtectedKeyForm {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final Object i;
    public static int j;
    public final JDialog a;
    public final JButton b;
    public final ns21 c;
    public final Timer d;
    public final os21 e;

    static {
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        f = defaultBundle.getString(WriteBlocks.OK);
        g = defaultBundle.getString("user.protected.key.text");
        h = defaultBundle.getString("user.protected.key.dialog.caption");
        i = new Object();
        j = 0;
        j = ((Integer) AccessController.doPrivileged(new puu0(24))).intValue();
    }

    public UserProtectedKeyForm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        MainControlPane.setStyle();
        JDialog jDialog = new JDialog();
        this.a = jDialog;
        String str = h;
        jDialog.setName(str);
        jDialog.setTitle(str);
        this.b = new JButton(f);
        this.c = new ns21();
        this.d = new Timer(1000, (ActionListener) null);
        this.e = new os21();
    }

    public static Integer getDefaultTimeout() {
        int i2;
        synchronized (i) {
            i2 = j;
        }
        return Integer.valueOf(i2);
    }

    public static boolean ifWrite() {
        return nzs.u(UserProtectedKeyForm.class);
    }

    public static void main(String[] strArr) {
        new UserProtectedKeyForm().showModal(true);
    }

    public static void setDefaultTimeout(Integer num) {
        JCPPref jCPPref = new JCPPref(UserProtectedKeyForm.class);
        synchronized (i) {
            jCPPref.putInt("userInputTimeout", num.intValue());
            j = num.intValue();
        }
    }

    public final void a() {
        JDialog jDialog = this.a;
        if (jDialog instanceof JDialog) {
            jDialog.setDefaultCloseOperation(2);
            this.a.setResizable(false);
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.setDoubleBuffered(true);
            Font font = new Font((String) null, 0, 12);
            Icon icon = UIManager.getIcon("OptionPane.informationIcon");
            JPanel jPanel2 = new JPanel();
            JLabel jLabel = new JLabel();
            jLabel.setDoubleBuffered(true);
            jPanel2.setDoubleBuffered(true);
            jLabel.setText(g);
            jLabel.setFont(font);
            jPanel2.add(jLabel);
            jLabel.setVerticalTextPosition(0);
            jLabel.setHorizontalTextPosition(4);
            jLabel.setIcon(icon);
            jPanel.add(jPanel2, "Center");
            JPanel jPanel3 = new JPanel();
            this.b.setDoubleBuffered(true);
            jPanel3.setDoubleBuffered(true);
            this.b.setEnabled(true);
            this.b.setPreferredSize(new Dimension(150, 25));
            jPanel3.add(this.b);
            jPanel.add(jPanel3, "South");
            this.a.getContentPane().add(jPanel);
            this.a.setSize(new Dimension(330, 100));
            this.a.setLocationRelativeTo((Component) null);
            getDefaultTimeout().getClass();
        }
    }

    public final void b() {
        this.b.addActionListener(this.c);
        this.d.addActionListener(this.e);
    }

    public final void c() {
        this.b.removeActionListener(this.c);
        this.d.removeActionListener(this.e);
    }

    public void showModal(boolean z) {
        if (this.a instanceof JDialog) {
            a();
            b();
            this.a.setModal(z);
            this.d.start();
            this.a.pack();
            this.a.setAlwaysOnTop(true);
            this.a.setVisible(true);
            c();
            this.a.dispose();
        }
    }
}
