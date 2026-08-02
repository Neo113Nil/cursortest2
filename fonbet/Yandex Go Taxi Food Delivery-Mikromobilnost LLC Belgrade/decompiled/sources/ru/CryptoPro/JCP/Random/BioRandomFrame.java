package ru.CryptoPro.JCP.Random;

import com.adjust.sdk.Constants;
import defpackage.px61;
import defpackage.w511;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ResourceBundle;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public final class BioRandomFrame extends AbstractBioRandom implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String STR_DIALOG_PROPERTY = "ru.CryptoPro.JCP.BioRandom.JDialog";
    public static final String STR_DIALOG_PROPERTY_VALUE = "true";
    public static final String STR_FRAME_NAME = "BIOFrame";
    public final Window w;
    public boolean v = false;
    public px61 x = null;
    public int y = -1;
    public final WindowListener z = new WindowAdapter() { // from class: ru.CryptoPro.JCP.Random.BioRandomFrame.1
        public void windowClosing(WindowEvent windowEvent) {
            BioRandomFrame bioRandomFrame = BioRandomFrame.this;
            bioRandomFrame.v = true;
            bioRandomFrame.i();
            super.windowClosing(windowEvent);
        }
    };

    public static class DialogThread implements Runnable {
        public final JDialog dialog;
        public boolean isRunning = true;

        public DialogThread(JDialog jDialog) {
            this.dialog = jDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.dialog.setVisible(true);
            this.isRunning = false;
        }
    }

    static {
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle(BundleChooser.EXRES_NAME);
        A = defaultBundle.getString("BioFrameTitle");
        B = defaultBundle.getString("BioFrameText");
        C = defaultBundle.getString("BioFrameTextMoveMouseLeft");
        D = defaultBundle.getString("BioFrameTextMoveMouseRight");
    }

    public BioRandomFrame() {
        this.w = null;
        MainControlPane.setStyle();
        JFrame jFrame = new JFrame(A);
        this.w = jFrame;
        jFrame.setName(STR_FRAME_NAME);
    }

    public static void main(String[] strArr) {
        AbstractBioRandom.setDefaultBioRandom(0);
    }

    public static void showDialog(JDialog jDialog) throws Exception {
        DialogThread dialogThread = new DialogThread(jDialog);
        EventQueue.invokeLater(dialogThread);
        do {
            Thread.sleep(100L);
        } while (dialogThread.isRunning);
        System.out.getClass();
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.w instanceof JDialog ? null : this.x.c)) {
            this.v = true;
            i();
        }
    }

    @Override // ru.CryptoPro.JCP.Random.AbstractBioRandom
    public synchronized RandomInterface getBioRandom(int i) {
        boolean z;
        byte[] g;
        o();
        p();
        int i2 = ((i / 44) * 93) + (i % 44 == 0 ? 0 : 93);
        c(i2);
        JProgressBar jProgressBar = null;
        if (this.w instanceof JDialog) {
            jProgressBar.setMinimum(0);
            throw null;
        }
        this.x.b.setMinimum(0);
        this.x.b.setMaximum(i2 * 2);
        this.x.b.setValue(0);
        this.x.b.setStringPainted(true);
        this.w.setVisible(true);
        do {
            synchronized (this.r) {
                z = this.n;
            }
        } while (z);
        Window window = this.w;
        if (window instanceof JDialog) {
            jProgressBar.setText("OK");
            throw null;
        }
        window.dispose();
        q();
        g = g(i);
        b();
        if (this.v || g.length != i) {
            throw new CancelException();
        }
        return new Seeder(g, 64);
    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 27) {
            this.v = true;
            i();
        } else {
            if (keyCode == this.y) {
                return;
            }
            this.y = keyCode;
            int a = a(0, 0, keyEvent.getWhen(), System.currentTimeMillis(), false);
            if (a == -1) {
                i();
            } else {
                (this.w instanceof JDialog ? null : this.x.b).setValue(a);
            }
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    public final void m(Component component) {
        component.addKeyListener(this);
        component.addMouseListener(this);
        component.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        Point locationOnScreen = mouseEvent.getLocationOnScreen();
        int a = a(locationOnScreen.x, locationOnScreen.y, mouseEvent.getWhen(), System.currentTimeMillis(), false);
        if (a == -1) {
            i();
        } else {
            (this.w instanceof JDialog ? null : this.x.b).setValue(a);
        }
    }

    public void mouseDragged(MouseEvent mouseEvent) {
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        Point locationOnScreen = mouseEvent.getLocationOnScreen();
        int a = a(locationOnScreen.x, locationOnScreen.y, mouseEvent.getWhen(), System.currentTimeMillis(), true);
        if (this.m < 3 || !this.h) {
            this.x.d.setText(B);
        } else {
            this.x.d.setText(this.f == AbstractBioRandom.cl_0.b ? C : D);
        }
        if (a == -1) {
            i();
        } else {
            (this.w instanceof JDialog ? null : this.x.b).setValue(a);
        }
    }

    public void mousePressed(MouseEvent mouseEvent) {
    }

    public void mouseReleased(MouseEvent mouseEvent) {
    }

    public final void n(Component component) {
        component.removeKeyListener(this);
        component.removeMouseListener(this);
        component.removeMouseMotionListener(this);
    }

    public final void o() {
        JFrame jFrame = this.w;
        if (jFrame instanceof JFrame) {
            JFrame jFrame2 = jFrame;
            px61 px61Var = new px61();
            this.x = px61Var;
            jFrame2.setContentPane(px61Var.a);
            jFrame2.setTitle(A);
            Rectangle maximumWindowBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
            this.l = (int) (maximumWindowBounds.width * 0.05d);
            jFrame2.setBounds(maximumWindowBounds.x, maximumWindowBounds.y, maximumWindowBounds.width, maximumWindowBounds.height);
            jFrame2.setResizable(false);
            return;
        }
        if (!(jFrame instanceof JDialog)) {
            w511.q();
            return;
        }
        JDialog jDialog = (JDialog) jFrame;
        jDialog.setTitle(A);
        jDialog.setBounds(40, 40, Constants.MINIMAL_ERROR_STATUS_CODE, 320);
        JLabel jLabel = null;
        jDialog.getContentPane().setLayout((LayoutManager) null);
        jDialog.setResizable(false);
        jLabel.setBounds(10, 10, 374, 200);
        throw null;
    }

    public final void p() {
        this.w.addWindowListener(this.z);
        m(this.w);
        if (this.w instanceof JDialog) {
            m(null);
            throw null;
        }
        m(this.x.d);
        m(this.x.b);
        m(this.x.c);
        this.x.c.addActionListener(this);
    }

    public final void q() {
        this.w.removeWindowListener(this.z);
        n(this.w);
        if (this.w instanceof JDialog) {
            n(null);
            throw null;
        }
        n(this.x.d);
        n(this.x.b);
        n(this.x.c);
        this.x.c.removeActionListener(this);
    }
}
