package defpackage;

import android.window.BackEvent;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l1 {
    public final float MdtA4re8;
    public final float NCTxEWno;
    public final float qoPGr6Ce;
    public final int wxUZMvaN;

    public l1(BackEvent backEvent) {
        F0zKqyuc f0zKqyuc = F0zKqyuc.qoPGr6Ce;
        float wxUZMvaN = f0zKqyuc.wxUZMvaN(backEvent);
        float VgvYg0wo = f0zKqyuc.VgvYg0wo(backEvent);
        float NCTxEWno = f0zKqyuc.NCTxEWno(backEvent);
        int MdtA4re8 = f0zKqyuc.MdtA4re8(backEvent);
        this.qoPGr6Ce = wxUZMvaN;
        this.NCTxEWno = VgvYg0wo;
        this.MdtA4re8 = NCTxEWno;
        this.wxUZMvaN = MdtA4re8;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.qoPGr6Ce + ", touchY=" + this.NCTxEWno + ", progress=" + this.MdtA4re8 + ", swipeEdge=" + this.wxUZMvaN + '}';
    }
}
