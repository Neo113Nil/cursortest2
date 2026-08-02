package ru.CryptoPro.JCP.ControlPane;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Point;
import javax.swing.JDialog;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class JCPDialog extends JDialog {
    private static final String e = "JCPDialog_parametres_";
    private String a;
    private String b;
    private int c;
    private int d;

    public JCPDialog(String str, Dialog dialog, String str2, boolean z, GraphicsConfiguration graphicsConfiguration) {
        super(dialog, str2, z, graphicsConfiguration);
        this.c = 10;
        this.d = 10;
        a(str);
    }

    public final void a(String str) {
        StringBuffer stringBuffer = new StringBuffer(e);
        stringBuffer.append(str);
        stringBuffer.append("_posX");
        this.a = stringBuffer.toString();
        StringBuffer stringBuffer2 = new StringBuffer(e);
        stringBuffer2.append(str);
        stringBuffer2.append("_posY");
        this.b = stringBuffer2.toString();
        b();
    }

    public final void b() {
        JCPPref user = JCPPref.getUser(JCPDialog.class);
        this.c = user.getInt(this.a, 10);
        int i = user.getInt(this.b, 10);
        this.d = i;
        setLocation(this.c, i);
    }

    public final void c() {
        Point location = getLocation();
        this.c = location.x;
        this.d = location.y;
    }

    public void dispose() {
        c();
        JCPPref user = JCPPref.getUser(JCPDialog.class);
        user.putInt(this.a, this.c);
        user.putInt(this.b, this.d);
        super.dispose();
    }

    public void finalize() throws Throwable {
        c();
        JCPPref user = JCPPref.getUser(JCPDialog.class);
        user.putInt(this.a, this.c);
        user.putInt(this.b, this.d);
        super/*java.lang.Object*/.finalize();
    }

    public JCPDialog(String str, Dialog dialog) {
        this(str, dialog, false);
    }

    public JCPDialog(String str, Dialog dialog, String str2) {
        this(str, dialog, str2, false);
    }

    public JCPDialog(String str, Dialog dialog, String str2, boolean z) {
        this(str, dialog, str2, z, (GraphicsConfiguration) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JCPDialog(String str) throws HeadlessException {
        this(str, (Dialog) null);
    }

    public JCPDialog(String str, Dialog dialog, boolean z) {
        this(str, dialog, (String) null, z);
    }

    public JCPDialog(String str, Frame frame) {
        this(str, frame, false);
    }

    public JCPDialog(String str, Frame frame, String str2) {
        this(str, frame, str2, false);
    }

    public JCPDialog(String str, Frame frame, String str2, boolean z) {
        this(str, frame, str2, z, (GraphicsConfiguration) null);
    }

    public JCPDialog(String str, Frame frame, String str2, boolean z, GraphicsConfiguration graphicsConfiguration) {
        super(frame, str2, z, graphicsConfiguration);
        this.c = 10;
        this.d = 10;
        a(str);
    }

    public JCPDialog(String str, Frame frame, boolean z) {
        this(str, frame, (String) null, z);
    }
}
