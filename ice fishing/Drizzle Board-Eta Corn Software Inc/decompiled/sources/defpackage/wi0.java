package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wi0 {
    public static final wi0 NCTxEWno;
    public final si0 qoPGr6Ce;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            NCTxEWno = pi0.FySoLYna;
        } else if (i >= 30) {
            NCTxEWno = ni0.RXQxj5Oe;
        } else {
            NCTxEWno = si0.NCTxEWno;
        }
    }

    public wi0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.qoPGr6Ce = new ri0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.qoPGr6Ce = new pi0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.qoPGr6Ce = new oi0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.qoPGr6Ce = new ni0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.qoPGr6Ce = new mi0(this, windowInsets);
        } else if (i >= 28) {
            this.qoPGr6Ce = new li0(this, windowInsets);
        } else {
            this.qoPGr6Ce = new ki0(this, windowInsets);
        }
    }

    public static bn MdtA4re8(bn bnVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bnVar.qoPGr6Ce - i);
        int max2 = Math.max(0, bnVar.NCTxEWno - i2);
        int max3 = Math.max(0, bnVar.MdtA4re8 - i3);
        int max4 = Math.max(0, bnVar.wxUZMvaN - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bnVar : bn.qoPGr6Ce(max, max2, max3, max4);
    }

    public static wi0 VgvYg0wo(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        wi0 wi0Var = new wi0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            wi0 qoPGr6Ce = ag0.qoPGr6Ce(view);
            si0 si0Var = wi0Var.qoPGr6Ce;
            si0Var.I5GHvsYW(qoPGr6Ce);
            View rootView = view.getRootView();
            si0Var.wxUZMvaN(rootView);
            si0Var.ygLcUYwZ(rootView);
            si0Var.lDXGDhIF();
            si0Var.FySoLYna(view.getWindowSystemUiVisibility());
        }
        return wi0Var;
    }

    public final int NCTxEWno() {
        return this.qoPGr6Ce.ow5vqvCr().MdtA4re8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wi0) {
            return Objects.equals(this.qoPGr6Ce, ((wi0) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        si0 si0Var = this.qoPGr6Ce;
        if (si0Var == null) {
            return 0;
        }
        return si0Var.hashCode();
    }

    public final int qoPGr6Ce() {
        return this.qoPGr6Ce.ow5vqvCr().qoPGr6Ce;
    }

    public final WindowInsets wxUZMvaN() {
        si0 si0Var = this.qoPGr6Ce;
        if (si0Var instanceof ji0) {
            return ((ji0) si0Var).MdtA4re8;
        }
        return null;
    }

    public wi0() {
        this.qoPGr6Ce = new si0(this);
    }
}
