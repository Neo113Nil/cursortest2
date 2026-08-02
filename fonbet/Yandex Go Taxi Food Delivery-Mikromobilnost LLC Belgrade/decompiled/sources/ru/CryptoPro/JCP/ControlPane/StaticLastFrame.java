package ru.CryptoPro.JCP.ControlPane;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* loaded from: classes4.dex */
public class StaticLastFrame {
    public static Object a;
    public static final Object b = new Object();
    public static final StaticLastFrame SYNCHR_OBJECT = new StaticLastFrame();

    public static void addComponent(JDialog jDialog) {
        synchronized (b) {
            a = jDialog;
        }
    }

    public static Object getComponent() {
        Object obj;
        synchronized (b) {
            obj = a;
        }
        return obj;
    }

    public static void removeComponent() {
        synchronized (b) {
            a = null;
        }
    }

    public static void addComponent(JFrame jFrame) {
        synchronized (b) {
            a = jFrame;
        }
    }

    public static void addComponent(JPanel jPanel) {
        synchronized (b) {
            a = jPanel;
        }
    }
}
