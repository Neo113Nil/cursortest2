package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j5BPOSYv {
    public static j5BPOSYv MdtA4re8;
    public static final PorterDuff.Mode NCTxEWno = PorterDuff.Mode.SRC_IN;
    public e30 qoPGr6Ce;

    public static synchronized void MdtA4re8() {
        synchronized (j5BPOSYv.class) {
            if (MdtA4re8 == null) {
                j5BPOSYv j5bposyv = new j5BPOSYv();
                MdtA4re8 = j5bposyv;
                j5bposyv.qoPGr6Ce = e30.MdtA4re8();
                e30 e30Var = MdtA4re8.qoPGr6Ce;
                bp9dZ9BB bp9dz9bb = new bp9dZ9BB();
                synchronized (e30Var) {
                    e30Var.VgvYg0wo = bp9dz9bb;
                }
            }
        }
    }

    public static synchronized j5BPOSYv qoPGr6Ce() {
        j5BPOSYv j5bposyv;
        synchronized (j5BPOSYv.class) {
            try {
                if (MdtA4re8 == null) {
                    MdtA4re8();
                }
                j5bposyv = MdtA4re8;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j5bposyv;
    }

    public final synchronized Drawable NCTxEWno(Context context, int i) {
        return this.qoPGr6Ce.wxUZMvaN(context, i);
    }
}
