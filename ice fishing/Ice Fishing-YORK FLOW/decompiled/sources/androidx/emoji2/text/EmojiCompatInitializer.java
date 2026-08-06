package androidx.emoji2.text;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements defpackage.w70 {
    @Override // defpackage.w70
    public final java.util.List ZpBGe2uQfcn8() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.w70
    public final java.lang.Object giKS3J6vZuNy(android.content.Context context) {
        java.lang.Object obj;
        defpackage.g00 g00Var = new defpackage.g00(new defpackage.r1(context, 1));
        g00Var.ZpBGe2uQfcn8 = 1;
        if (defpackage.ju.Ns0WNyEWdPsk == null) {
            synchronized (defpackage.ju.GE9mJIPrb8gP) {
                try {
                    if (defpackage.ju.Ns0WNyEWdPsk == null) {
                        defpackage.ju.Ns0WNyEWdPsk = new defpackage.ju(g00Var);
                    }
                } finally {
                }
            }
        }
        defpackage.a7 P05cfTpS5W5L = defpackage.a7.P05cfTpS5W5L(context);
        P05cfTpS5W5L.getClass();
        synchronized (defpackage.a7.oh71FJcDz6S2) {
            try {
                obj = ((java.util.HashMap) P05cfTpS5W5L.giKS3J6vZuNy).get(androidx.lifecycle.ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = P05cfTpS5W5L.JhCgjQRTAOCT(androidx.lifecycle.ProcessLifecycleInitializer.class, new java.util.HashSet());
                }
            } finally {
            }
        }
        defpackage.zg0 QiMR8OkAhezm = ((defpackage.wg0) obj).QiMR8OkAhezm();
        QiMR8OkAhezm.ZpBGe2uQfcn8(new defpackage.ku(this, QiMR8OkAhezm));
        return java.lang.Boolean.TRUE;
    }
}
