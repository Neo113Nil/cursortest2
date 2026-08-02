package defpackage;

import javax.swing.JFrame;

/* loaded from: classes4.dex */
public final class tw61 implements Runnable {
    public JFrame a;

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Thread.sleep(3000L);
                this.a.setVisible(false);
                return;
            } catch (InterruptedException unused) {
            }
        }
    }
}
